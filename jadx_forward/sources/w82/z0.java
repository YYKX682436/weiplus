package w82;

/* loaded from: classes11.dex */
public final class z0 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnFocusChangeListener f525482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13624x28778504 f525483e;

    public z0(android.view.View.OnFocusChangeListener onFocusChangeListener, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13624x28778504 c13624x28778504) {
        this.f525482d = onFocusChangeListener;
        this.f525483e = c13624x28778504;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f525482d;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z17);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("core editTextView onFocus change = ");
        sb6.append(z17);
        sb6.append(", panelChange = ");
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13624x28778504 c13624x28778504 = this.f525483e;
        sb6.append(c13624x28778504.f183095p1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopTagPanel", sb6.toString());
        if (z17) {
            if (!c13624x28778504.f183095p1) {
                c13624x28778504.m79119xbc895012().setCursorVisible(true);
            }
            c13624x28778504.f183095p1 = false;
        } else {
            c13624x28778504.f();
        }
        w82.p0 p0Var = c13624x28778504.T;
        if (p0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopFilter", "[onFocusChange] hasFocus = " + z17);
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 z7Var = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.v7) p0Var).f183025a;
            if (!z17) {
                z7Var.d();
                return;
            }
            if (z7Var.f183198k.getVisibility() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13582xd706766c c13582xd706766c = z7Var.f183200m;
                if (c13582xd706766c != null) {
                    c13582xd706766c.startAnimation(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7.b(z7Var));
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFlRvContains");
                    throw null;
                }
            }
        }
    }
}
