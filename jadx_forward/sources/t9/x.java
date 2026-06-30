package t9;

/* loaded from: classes15.dex */
public class x {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Comparator f498084h = new t9.u();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Comparator f498085i = new t9.v();

    /* renamed from: a, reason: collision with root package name */
    public final int f498086a;

    /* renamed from: e, reason: collision with root package name */
    public int f498090e;

    /* renamed from: f, reason: collision with root package name */
    public int f498091f;

    /* renamed from: g, reason: collision with root package name */
    public int f498092g;

    /* renamed from: c, reason: collision with root package name */
    public final t9.w[] f498088c = new t9.w[5];

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f498087b = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public int f498089d = -1;

    public x(int i17) {
        this.f498086a = i17;
    }

    public void a(int i17, float f17) {
        t9.w wVar;
        int i18 = this.f498089d;
        java.util.ArrayList arrayList = this.f498087b;
        if (i18 != 1) {
            java.util.Collections.sort(arrayList, f498084h);
            this.f498089d = 1;
        }
        int i19 = this.f498092g;
        t9.w[] wVarArr = this.f498088c;
        if (i19 > 0) {
            int i27 = i19 - 1;
            this.f498092g = i27;
            wVar = wVarArr[i27];
        } else {
            wVar = new t9.w(null);
        }
        int i28 = this.f498090e;
        this.f498090e = i28 + 1;
        wVar.f498081a = i28;
        wVar.f498082b = i17;
        wVar.f498083c = f17;
        arrayList.add(wVar);
        this.f498091f += i17;
        while (true) {
            int i29 = this.f498091f;
            int i37 = this.f498086a;
            if (i29 <= i37) {
                return;
            }
            int i38 = i29 - i37;
            t9.w wVar2 = (t9.w) arrayList.get(0);
            int i39 = wVar2.f498082b;
            if (i39 <= i38) {
                this.f498091f -= i39;
                arrayList.remove(0);
                int i47 = this.f498092g;
                if (i47 < 5) {
                    this.f498092g = i47 + 1;
                    wVarArr[i47] = wVar2;
                }
            } else {
                wVar2.f498082b = i39 - i38;
                this.f498091f -= i38;
            }
        }
    }

    public float b(float f17) {
        int i17 = this.f498089d;
        java.util.ArrayList arrayList = this.f498087b;
        if (i17 != 0) {
            java.util.Collections.sort(arrayList, f498085i);
            this.f498089d = 0;
        }
        float f18 = f17 * this.f498091f;
        int i18 = 0;
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            t9.w wVar = (t9.w) arrayList.get(i19);
            i18 += wVar.f498082b;
            if (i18 >= f18) {
                return wVar.f498083c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((t9.w) arrayList.get(arrayList.size() - 1)).f498083c;
    }
}
