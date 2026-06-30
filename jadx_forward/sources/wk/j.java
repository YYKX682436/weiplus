package wk;

/* loaded from: classes12.dex */
public class j extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public tl.p0 f528412d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f528413e;

    public j() {
        super(0);
        this.f528413e = "";
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        tl.p0 p0Var;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5397xdb341c08 c5397xdb341c08 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5397xdb341c08) abstractC20979x809547d1;
        am.o8 o8Var = c5397xdb341c08.f135739g;
        int i17 = o8Var.f89049a;
        am.p8 p8Var = c5397xdb341c08.f135740h;
        if (i17 == 1) {
            if (this.f528412d == null) {
                this.f528412d = new tl.p0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, false);
            }
            p8Var.f89141a = this.f528412d.g(o8Var.f89050b, null);
            this.f528413e = this.f528412d.a();
        } else if (i17 == 2 && (p0Var = this.f528412d) != null) {
            p8Var.f89142b = this.f528413e;
            p8Var.f89141a = p0Var.mo47960x360802();
            int i18 = o8Var.f89049a;
            this.f528413e = "";
        }
        return true;
    }
}
