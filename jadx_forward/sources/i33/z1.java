package i33;

/* loaded from: classes10.dex */
public final class z1 extends i33.c {

    /* renamed from: f, reason: collision with root package name */
    public android.view.Window f369835f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // i33.c
    public void V6(com.p314xaae8f345.mm.ui.q2 oldMode, com.p314xaae8f345.mm.ui.q2 newMode) {
        android.view.Window window;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldMode, "oldMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newMode, "newMode");
        super.V6(oldMode, newMode);
        if (oldMode != newMode) {
            if (newMode == com.p314xaae8f345.mm.ui.q2.FULL_SCREEN_FOCUS) {
                android.view.Window window2 = this.f369835f;
                if (window2 != null) {
                    window2.addFlags(1024);
                    return;
                }
                return;
            }
            if (newMode != com.p314xaae8f345.mm.ui.q2.NORMAL || (window = this.f369835f) == null) {
                return;
            }
            window.clearFlags(1024);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.widget.FrameLayout.LayoutParams layoutParams;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        i33.z0 z0Var = (i33.z0) pf5.z.f435481a.a(activity).e(i33.z0.class);
        if (z0Var != null) {
            i33.z0.Y6(z0Var, this, 0, 2, null);
        }
        int h17 = com.p314xaae8f345.mm.ui.bl.h(m80379x76847179());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "MediaTabAlbumWindowUIC statusBarHeight=" + h17);
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.hvf);
        if (com.p314xaae8f345.mm.ui.b4.c(m80379x76847179())) {
            if (mo144222x4ff8c0f0 != null) {
                android.view.ViewGroup.LayoutParams layoutParams2 = mo144222x4ff8c0f0.getLayoutParams();
                layoutParams = layoutParams2 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams2 : null;
                if (layoutParams != null) {
                    layoutParams.topMargin = h17;
                }
                mo144222x4ff8c0f0.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        if (mo144222x4ff8c0f0 != null) {
            mo144222x4ff8c0f0.setPadding(0, h17, 0, 0);
            android.view.ViewGroup.LayoutParams layoutParams3 = mo144222x4ff8c0f0.getLayoutParams();
            layoutParams = layoutParams3 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams != null) {
                int i17 = layoutParams.height;
                if (i17 <= 0) {
                    i17 = i65.a.f(mo144222x4ff8c0f0.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay);
                }
                layoutParams.height = i17 + h17;
            }
            mo144222x4ff8c0f0.setLayoutParams(layoutParams);
        }
    }
}
