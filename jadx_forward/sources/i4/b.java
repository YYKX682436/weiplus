package i4;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f369855a;

    /* renamed from: b, reason: collision with root package name */
    public int f369856b;

    /* renamed from: c, reason: collision with root package name */
    public int f369857c;

    /* renamed from: d, reason: collision with root package name */
    public int f369858d;

    /* renamed from: e, reason: collision with root package name */
    public int f369859e;

    /* renamed from: f, reason: collision with root package name */
    public int f369860f;

    /* renamed from: g, reason: collision with root package name */
    public int f369861g;

    /* renamed from: h, reason: collision with root package name */
    public int f369862h;

    /* renamed from: i, reason: collision with root package name */
    public int f369863i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i4.c f369864j;

    public b(i4.c cVar, int i17, int i18) {
        this.f369864j = cVar;
        this.f369855a = i17;
        this.f369856b = i18;
        a();
    }

    public final void a() {
        i4.c cVar = this.f369864j;
        int[] iArr = cVar.f369866a;
        int[] iArr2 = cVar.f369867b;
        int i17 = Integer.MAX_VALUE;
        int i18 = Integer.MIN_VALUE;
        int i19 = Integer.MIN_VALUE;
        int i27 = 0;
        int i28 = Integer.MAX_VALUE;
        int i29 = Integer.MAX_VALUE;
        int i37 = Integer.MIN_VALUE;
        for (int i38 = this.f369855a; i38 <= this.f369856b; i38++) {
            int i39 = iArr[i38];
            i27 += iArr2[i39];
            int i47 = (i39 >> 10) & 31;
            int i48 = (i39 >> 5) & 31;
            int i49 = i39 & 31;
            if (i47 > i37) {
                i37 = i47;
            }
            if (i47 < i17) {
                i17 = i47;
            }
            if (i48 > i18) {
                i18 = i48;
            }
            if (i48 < i28) {
                i28 = i48;
            }
            if (i49 > i19) {
                i19 = i49;
            }
            if (i49 < i29) {
                i29 = i49;
            }
        }
        this.f369858d = i17;
        this.f369859e = i37;
        this.f369860f = i28;
        this.f369861g = i18;
        this.f369862h = i29;
        this.f369863i = i19;
        this.f369857c = i27;
    }
}
