package bn1;

/* loaded from: classes14.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn1.w f22783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bn1.c0 f22784e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(bn1.w wVar, bn1.c0 c0Var) {
        super(0);
        this.f22783d = wVar;
        this.f22784e = c0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        bn1.w wVar = bn1.w.f22834d;
        bn1.w wVar2 = this.f22783d;
        bn1.c0 c0Var = this.f22784e;
        if (wVar2 == wVar) {
            com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = c0Var.f22789d;
            java.lang.Object obj = vASCommonFragment != null ? vASCommonFragment.f211121p : null;
            m40.p0 p0Var = obj instanceof m40.p0 ? (m40.p0) obj : null;
            if (p0Var != null) {
                z17 = ((com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI) p0Var).d7();
            }
            z17 = true;
        } else {
            if (c0Var.f22795m != 0) {
                z17 = false;
            }
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
