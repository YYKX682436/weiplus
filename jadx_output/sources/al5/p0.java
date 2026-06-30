package al5;

/* loaded from: classes14.dex */
public class p0 extends androidx.appcompat.app.b {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.app.b f5980a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f5981b;

    public p0(androidx.appcompat.app.b bVar) {
        this.f5980a = bVar;
    }

    public static androidx.appcompat.app.b N(androidx.appcompat.app.b bVar) {
        return bVar == null ? bVar : new al5.p0(bVar);
    }

    @Override // androidx.appcompat.app.b
    public void B(boolean z17) {
        this.f5980a.B(z17);
    }

    @Override // androidx.appcompat.app.b
    public void C(int i17) {
        this.f5980a.C(i17);
    }

    @Override // androidx.appcompat.app.b
    public void D(boolean z17) {
        this.f5980a.D(z17);
    }

    @Override // androidx.appcompat.app.b
    public void E(boolean z17) {
        this.f5980a.E(z17);
    }

    @Override // androidx.appcompat.app.b
    public void F(boolean z17) {
        this.f5980a.F(z17);
    }

    @Override // androidx.appcompat.app.b
    public void G(float f17) {
        this.f5980a.G(f17);
    }

    @Override // androidx.appcompat.app.b
    public void H(int i17) {
        this.f5980a.H(i17);
    }

    @Override // androidx.appcompat.app.b
    public void I(android.graphics.drawable.Drawable drawable) {
        this.f5980a.I(drawable);
    }

    @Override // androidx.appcompat.app.b
    public void L() {
        this.f5980a.L();
    }

    public final void O() {
        androidx.appcompat.app.b bVar = this.f5980a;
        if (bVar.j() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMActionBarProxy", "updateMenuView, getCustomView is null.");
            this.f5981b = null;
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) bVar.j().findViewById(com.tencent.mm.R.id.coz);
        if (viewGroup == null) {
            this.f5981b = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMActionBarProxy", "preSetCustomView, mActionbar.customMenuContainerOutside is null.");
            return;
        }
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.coy);
        if (!(findViewById instanceof android.view.ViewGroup)) {
            this.f5981b = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMActionBarProxy", "preSetCustomView, menuView no instanceof ViewGroup.");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMActionBarProxy", "preSetCustomView,, ((ViewGroup)menuView).getChildCount(): " + ((android.view.ViewGroup) findViewById).getChildCount() + ", menuView = " + findViewById);
        android.view.View findViewById2 = findViewById.findViewById(com.tencent.mm.R.id.coy);
        this.f5981b = findViewById2;
        P(findViewById2);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMActionBarProxy", "preSetCustomView, menuViewCache: " + this.f5981b);
    }

    public final void P(android.view.View view) {
        if (view.getParent() instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) view.getParent()).removeView(view);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMActionBarProxy", "removeParentHold, menuView is hasparent, has ? " + view.getParent());
        }
    }

    public final void Q() {
        android.view.View j17 = this.f5980a.j();
        if (j17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMActionBarProxy", "updateMenuView, getCustomView is null.");
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) j17.findViewById(com.tencent.mm.R.id.coz);
        if (viewGroup == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMActionBarProxy", "updateMenuView, customMenuContainerOutside is null.");
            return;
        }
        if (!(this.f5981b instanceof android.view.ViewGroup)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMActionBarProxy", "preSetCustomView, menuView no instanceof ViewGroup.");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMActionBarProxy", "updateMenuView, menuViewCache = ." + this.f5981b + ", menuView childCount = " + ((android.view.ViewGroup) this.f5981b).getChildCount() + ", customMenuContainerOutside = " + viewGroup);
        P(this.f5981b);
        viewGroup.removeAllViews();
        viewGroup.addView(this.f5981b);
    }

    @Override // androidx.appcompat.app.b
    public android.view.View j() {
        return this.f5980a.j();
    }

    @Override // androidx.appcompat.app.b
    public int k() {
        return this.f5980a.k();
    }

    @Override // androidx.appcompat.app.b
    public int l() {
        return this.f5980a.l();
    }

    @Override // androidx.appcompat.app.b
    public android.content.Context m() {
        return this.f5980a.m();
    }

    @Override // androidx.appcompat.app.b
    public java.lang.CharSequence n() {
        return this.f5980a.n();
    }

    @Override // androidx.appcompat.app.b
    public void o() {
        this.f5980a.o();
    }

    @Override // androidx.appcompat.app.b
    public boolean q() {
        return this.f5980a.q();
    }

    @Override // androidx.appcompat.app.b
    public void w(android.graphics.drawable.Drawable drawable) {
        this.f5980a.w(drawable);
    }

    @Override // androidx.appcompat.app.b
    public void x(int i17) {
        O();
        this.f5980a.x(i17);
        Q();
    }

    @Override // androidx.appcompat.app.b
    public void y(android.view.View view) {
        O();
        this.f5980a.y(view);
        Q();
    }

    @Override // androidx.appcompat.app.b
    public void z(android.view.View view, androidx.appcompat.app.ActionBar$LayoutParams actionBar$LayoutParams) {
        O();
        this.f5980a.z(view, actionBar$LayoutParams);
        Q();
    }
}
