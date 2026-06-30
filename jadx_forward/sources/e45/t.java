package e45;

/* loaded from: classes.dex */
public final class t extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f330960d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.owo);
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.C30864xbddafb2a.ac9);
            if (mo144222x4ff8c0f0 == null) {
                mo144222x4ff8c0f0 = android.view.LayoutInflater.from(m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ac9, (android.view.ViewGroup) null);
            }
            android.widget.TextView textView = (android.widget.TextView) mo144222x4ff8c0f0.findViewById(com.p314xaae8f345.mm.R.id.gzf);
            com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
            this.f330960d = textView;
            frameLayout.addView(mo144222x4ff8c0f0);
            android.view.View findViewById = mo144222x4ff8c0f0.findViewById(com.p314xaae8f345.mm.R.id.bzi);
            if (findViewById != null) {
                findViewById.setOnClickListener(new e45.s(this));
            }
        }
    }
}
