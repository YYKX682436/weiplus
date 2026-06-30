package c43;

/* loaded from: classes15.dex */
public final class c1 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f119938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f119939e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f119940f;

    public c1(java.lang.String str, java.lang.String str2, long j17) {
        this.f119938d = str;
        this.f119939e = str2;
        this.f119940f = j17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            db5.t7.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str);
            return 0;
        }
        c43.e1.f119954b.remove(new jz5.l(this.f119938d, this.f119939e));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5228x861e4ec9 c5228x861e4ec9 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5228x861e4ec9();
        c5228x861e4ec9.f135561g.f89393a = this.f119940f;
        c5228x861e4ec9.e();
        return 0;
    }
}
