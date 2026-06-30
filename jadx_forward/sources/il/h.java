package il;

/* loaded from: classes13.dex */
public class h {

    /* renamed from: g, reason: collision with root package name */
    public static il.h f373525g;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f373526a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f373527b = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public final long f373528c = 10000000;

    /* renamed from: d, reason: collision with root package name */
    public int f373529d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f373530e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f373531f = 0;

    public static il.h a() {
        if (f373525g == null) {
            synchronized (il.i.class) {
                if (f373525g == null) {
                    f373525g = new il.h();
                }
            }
        }
        return f373525g;
    }

    public hl.e b() {
        synchronized (this.f373527b) {
            if (this.f373526a.size() > 0) {
                java.util.ArrayList arrayList = this.f373526a;
                return (hl.e) arrayList.remove(arrayList.size() - 1);
            }
            int i17 = this.f373529d;
            if (i17 >= this.f373528c) {
                int i18 = this.f373531f + 1;
                this.f373531f = i18;
                if (i18 % 100 == 0) {
                    java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17)};
                    int i19 = rl.b.f478676a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioPcmDataTrackFixedSizePool", "size >= FIX_SIZE, size:%d", objArr);
                }
                return null;
            }
            int i27 = this.f373530e + 1;
            this.f373530e = i27;
            this.f373529d = i27 * 3536;
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i27)};
            int i28 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioPcmDataTrackFixedSizePool", "pool tract count:%d", objArr2);
            if (this.f373531f > 0) {
                this.f373531f = 0;
            }
            hl.e eVar = new hl.e();
            eVar.f363572g = true;
            return eVar;
        }
    }

    public void c(hl.e eVar) {
        if (eVar == null || eVar.f363571f == null || !eVar.f363572g) {
            return;
        }
        eVar.a();
        synchronized (this.f373527b) {
            this.f373526a.add(0, eVar);
        }
    }
}
