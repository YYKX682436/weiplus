package el3;

/* loaded from: classes13.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f335510e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f335511f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f335512g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ el3.h f335513h;

    public e(el3.h hVar, java.lang.String str, long j17, long j18, long j19) {
        this.f335513h = hVar;
        this.f335509d = str;
        this.f335510e = j17;
        this.f335511f = j18;
        this.f335512g = j19;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (el3.h.f335529i) {
            java.lang.String str = "";
            int i17 = 0;
            int i18 = 0;
            for (java.util.Map.Entry entry : el3.h.f335528h.entrySet()) {
                java.lang.String str2 = (java.lang.String) entry.getKey();
                i18 += ((java.lang.Integer) entry.getValue()).intValue();
                if (((java.lang.Integer) entry.getValue()).intValue() > i17) {
                    i17 = ((java.lang.Integer) entry.getValue()).intValue();
                    str = str2;
                }
                entry.getValue();
            }
            el3.h.f335528h.clear();
            java.lang.String str3 = "";
            int i19 = 0;
            int i27 = 0;
            for (java.util.Map.Entry entry2 : el3.h.f335529i.entrySet()) {
                java.lang.String str4 = (java.lang.String) entry2.getKey();
                i19 += ((java.lang.Integer) entry2.getValue()).intValue();
                if (((java.lang.Integer) entry2.getValue()).intValue() > i27) {
                    i27 = ((java.lang.Integer) entry2.getValue()).intValue();
                    str3 = str4;
                }
                entry2.getValue();
            }
            el3.h.f335529i.clear();
            el3.h hVar = this.f335513h;
            el3.g gVar = new el3.g(hVar);
            el3.g gVar2 = new el3.g(hVar);
            el3.g gVar3 = new el3.g(hVar);
            el3.h.y(hVar, gVar, el3.h.f335531k);
            el3.h.y(this.f335513h, gVar2, el3.h.f335532l);
            el3.h.y(this.f335513h, gVar3, el3.h.f335533m);
            el3.h.f335531k.clear();
            el3.h.f335532l.clear();
            el3.h.f335533m.clear();
            int i28 = el3.h.f335521a;
            int i29 = el3.h.f335521a;
            int i37 = el3.h.f335521a;
            int i38 = el3.h.f335521a;
            int i39 = el3.h.f335521a;
            int i47 = el3.h.f335521a;
            int i48 = el3.h.f335521a;
            int i49 = el3.h.f335521a;
            int i57 = el3.h.f335521a;
            int i58 = el3.h.f335521a;
            int i59 = el3.h.f335521a;
            int i66 = el3.h.f335521a;
            if (gVar.f335518a > 0 && gVar2.f335518a > 0 && gVar3.f335518a > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15686, this.f335509d, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), str, java.lang.Integer.valueOf(gVar.f335518a), java.lang.Long.valueOf(gVar.f335519b), java.lang.Long.valueOf(gVar.f335520c), java.lang.Integer.valueOf(gVar2.f335518a), java.lang.Long.valueOf(gVar2.f335519b), java.lang.Long.valueOf(gVar2.f335520c), java.lang.Integer.valueOf(gVar3.f335518a), java.lang.Long.valueOf(gVar3.f335519b), java.lang.Long.valueOf(gVar3.f335520c), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), str3, java.lang.Integer.valueOf(el3.h.f335522b), java.lang.Integer.valueOf(el3.h.f335523c), java.lang.Integer.valueOf(el3.h.f335521a), java.lang.Integer.valueOf(el3.h.f335526f), java.lang.Integer.valueOf(el3.h.f335527g), java.lang.Long.valueOf(this.f335510e), java.lang.Long.valueOf(this.f335511f), java.lang.Long.valueOf(this.f335512g), java.lang.Integer.valueOf((el3.h.f335524d - el3.h.f335526f) + el3.h.f335523c), java.lang.Integer.valueOf(el3.h.f335525e - el3.h.f335527g));
                this.f335513h.B(el3.h.f335521a, gVar2.f335520c, gVar3.f335520c, gVar.f335520c, el3.h.f335523c + i19, i18, this.f335511f, this.f335512g, (el3.h.f335524d - el3.h.f335526f) + el3.h.f335523c, el3.h.f335525e - el3.h.f335527g);
            }
            el3.h.f335522b = 0;
            el3.h.f335523c = 0;
            el3.h.f335521a = 0;
            el3.h.f335524d = 0;
            el3.h.f335525e = 0;
            el3.h.f335526f = 0;
            el3.h.f335527g = 0;
            el3.h.z(this.f335513h, this.f335509d);
            el3.h.f335530j.clear();
        }
    }
}
