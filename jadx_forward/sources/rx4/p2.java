package rx4;

/* loaded from: classes.dex */
public class p2 extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public int T6() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bja;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.owo);
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            android.view.View inflate = android.view.LayoutInflater.from(m158354x19263085()).inflate(T6(), (android.view.ViewGroup) null);
            frameLayout.addView(inflate);
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.gya);
            if (findViewById != null) {
                findViewById.setOnClickListener(new rx4.o2(this));
            }
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gzd);
            if (textView != null) {
                textView.setText(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.hku));
                com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
            }
        }
    }
}
