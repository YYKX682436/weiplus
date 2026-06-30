package vm3;

/* loaded from: classes14.dex */
public final class d extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f519677d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f519678e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f519677d = jz5.h.b(new vm3.c(this));
    }

    public final void T6() {
        android.view.View currentFocus = m158354x19263085().getWindow().getCurrentFocus();
        if (currentFocus != null) {
            int[] iArr = new int[2];
            currentFocus.getLocationInWindow(iArr);
            android.view.ViewParent parent = currentFocus.getParent();
            int height = iArr[1] + currentFocus.getHeight() + com.p314xaae8f345.mm.ui.kk.a(currentFocus);
            if (parent instanceof android.view.ViewGroup) {
                int[] iArr2 = new int[2];
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                viewGroup.getLocationInWindow(iArr2);
                height = iArr2[1] + viewGroup.getHeight();
            }
            android.view.View decorView = m158354x19263085().getWindow().getDecorView();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
            android.graphics.Rect rect = new android.graphics.Rect();
            decorView.getWindowVisibleDisplayFrame(rect);
            int i17 = height - rect.bottom;
            int i18 = -i65.a.b(m80379x76847179(), 56);
            if (i17 > i18) {
                int scrollY = (i17 + U6().getScrollY()) - i18;
                android.widget.ScrollView U6 = U6();
                if (U6 != null) {
                    U6.post(new vm3.a(scrollY, this));
                }
            }
        }
    }

    public final android.widget.ScrollView U6() {
        return (android.widget.ScrollView) ((jz5.n) this.f519677d).mo141623x754a37bb();
    }

    public final void V6(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeyboardInputChangeUIC", "onFocusChange() called with: focus = " + z17 + " isKeyboardShow:" + this.f519678e);
        if (z17 && this.f519678e) {
            T6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleFocused */
    public void mo58275xd317978f() {
        super.mo58275xd317978f();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d2049 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f78277xe59a1298);
        if (c22607x763d2049 != null) {
            c22607x763d2049.e(new vm3.b(this));
        }
    }
}
