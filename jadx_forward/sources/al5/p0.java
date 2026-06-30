package al5;

/* loaded from: classes14.dex */
public class p0 extends p012xc85e97e9.p016x746ad0e3.app.b {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.b f87513a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f87514b;

    public p0(p012xc85e97e9.p016x746ad0e3.app.b bVar) {
        this.f87513a = bVar;
    }

    public static p012xc85e97e9.p016x746ad0e3.app.b N(p012xc85e97e9.p016x746ad0e3.app.b bVar) {
        return bVar == null ? bVar : new al5.p0(bVar);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void B(boolean z17) {
        this.f87513a.B(z17);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void C(int i17) {
        this.f87513a.C(i17);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void D(boolean z17) {
        this.f87513a.D(z17);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void E(boolean z17) {
        this.f87513a.E(z17);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void F(boolean z17) {
        this.f87513a.F(z17);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void G(float f17) {
        this.f87513a.G(f17);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void H(int i17) {
        this.f87513a.H(i17);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void I(android.graphics.drawable.Drawable drawable) {
        this.f87513a.I(drawable);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void L() {
        this.f87513a.L();
    }

    public final void O() {
        p012xc85e97e9.p016x746ad0e3.app.b bVar = this.f87513a;
        if (bVar.j() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMActionBarProxy", "updateMenuView, getCustomView is null.");
            this.f87514b = null;
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) bVar.j().findViewById(com.p314xaae8f345.mm.R.id.coz);
        if (viewGroup == null) {
            this.f87514b = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMActionBarProxy", "preSetCustomView, mActionbar.customMenuContainerOutside is null.");
            return;
        }
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.coy);
        if (!(findViewById instanceof android.view.ViewGroup)) {
            this.f87514b = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMActionBarProxy", "preSetCustomView, menuView no instanceof ViewGroup.");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMActionBarProxy", "preSetCustomView,, ((ViewGroup)menuView).getChildCount(): " + ((android.view.ViewGroup) findViewById).getChildCount() + ", menuView = " + findViewById);
        android.view.View findViewById2 = findViewById.findViewById(com.p314xaae8f345.mm.R.id.coy);
        this.f87514b = findViewById2;
        P(findViewById2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMActionBarProxy", "preSetCustomView, menuViewCache: " + this.f87514b);
    }

    public final void P(android.view.View view) {
        if (view.getParent() instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) view.getParent()).removeView(view);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMActionBarProxy", "removeParentHold, menuView is hasparent, has ? " + view.getParent());
        }
    }

    public final void Q() {
        android.view.View j17 = this.f87513a.j();
        if (j17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMActionBarProxy", "updateMenuView, getCustomView is null.");
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) j17.findViewById(com.p314xaae8f345.mm.R.id.coz);
        if (viewGroup == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMActionBarProxy", "updateMenuView, customMenuContainerOutside is null.");
            return;
        }
        if (!(this.f87514b instanceof android.view.ViewGroup)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMActionBarProxy", "preSetCustomView, menuView no instanceof ViewGroup.");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMActionBarProxy", "updateMenuView, menuViewCache = ." + this.f87514b + ", menuView childCount = " + ((android.view.ViewGroup) this.f87514b).getChildCount() + ", customMenuContainerOutside = " + viewGroup);
        P(this.f87514b);
        viewGroup.removeAllViews();
        viewGroup.addView(this.f87514b);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public android.view.View j() {
        return this.f87513a.j();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public int k() {
        return this.f87513a.k();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public int l() {
        return this.f87513a.l();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public android.content.Context m() {
        return this.f87513a.m();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public java.lang.CharSequence n() {
        return this.f87513a.n();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void o() {
        this.f87513a.o();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public boolean q() {
        return this.f87513a.q();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void w(android.graphics.drawable.Drawable drawable) {
        this.f87513a.w(drawable);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void x(int i17) {
        O();
        this.f87513a.x(i17);
        Q();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void y(android.view.View view) {
        O();
        this.f87513a.y(view);
        Q();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void z(android.view.View view, p012xc85e97e9.p016x746ad0e3.app.C0063x293d4d7 c0063x293d4d7) {
        O();
        this.f87513a.z(view, c0063x293d4d7);
        Q();
    }
}
