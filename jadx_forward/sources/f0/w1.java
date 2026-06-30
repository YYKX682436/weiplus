package f0;

/* loaded from: classes14.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f339791a;

    /* renamed from: b, reason: collision with root package name */
    public final f0.u1[] f339792b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f339793c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f339794d;

    /* renamed from: e, reason: collision with root package name */
    public final int f339795e;

    /* renamed from: f, reason: collision with root package name */
    public final p2.s f339796f;

    /* renamed from: g, reason: collision with root package name */
    public final int f339797g;

    /* renamed from: h, reason: collision with root package name */
    public final int f339798h;

    /* renamed from: i, reason: collision with root package name */
    public final int f339799i;

    /* renamed from: j, reason: collision with root package name */
    public final int f339800j;

    public w1(int i17, f0.u1[] u1VarArr, java.util.List list, boolean z17, int i18, p2.s sVar, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f339791a = i17;
        this.f339792b = u1VarArr;
        this.f339793c = list;
        this.f339794d = z17;
        this.f339795e = i18;
        this.f339796f = sVar;
        this.f339797g = i19;
        this.f339798h = i27;
        int i28 = 0;
        for (f0.u1 u1Var : u1VarArr) {
            i28 = java.lang.Math.max(i28, u1Var.f339778m);
        }
        this.f339799i = i28;
        this.f339800j = i28 + this.f339797g;
    }

    public final java.util.List a(int i17, int i18, int i19) {
        f0.u1[] u1VarArr = this.f339792b;
        java.util.ArrayList arrayList = new java.util.ArrayList(u1VarArr.length);
        int length = u1VarArr.length;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i37 = 0;
        while (i27 < length) {
            f0.u1 u1Var = u1VarArr[i27];
            int i38 = i28 + 1;
            int i39 = (int) ((f0.d) this.f339793c.get(i28)).f339573a;
            int i47 = this.f339796f == p2.s.Rtl ? (this.f339795e - i29) - i39 : i29;
            int i48 = this.f339791a;
            boolean z17 = this.f339794d;
            f0.q0 a17 = u1Var.a(i17, i37, i18, i19, z17 ? i48 : i47, z17 ? i47 : i48, this.f339799i);
            i37 += u1Var.f339769d + this.f339798h;
            i29 += i39;
            arrayList.add(a17);
            i27++;
            i28 = i38;
            u1VarArr = u1VarArr;
        }
        return arrayList;
    }
}
