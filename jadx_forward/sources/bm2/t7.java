package bm2;

/* loaded from: classes3.dex */
public final class t7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.w7 f103866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.u7 f103867e;

    public t7(bm2.w7 w7Var, bm2.u7 u7Var) {
        this.f103866d = w7Var;
        this.f103867e = u7Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        yz5.l lVar;
        if (i17 != 0 || (lVar = this.f103866d.f103952g) == null) {
            return;
        }
        lVar.mo146xb9724478(this.f103867e.f103888f);
    }
}
