package re5;

/* loaded from: classes8.dex */
public final class x extends lf3.o implements re5.a, kg3.d, com.p314xaae8f345.mm.ui.fa {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f476136d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // kg3.d
    public void H2() {
    }

    @Override // lf3.o
    public int T6() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e5h;
    }

    public void V6(boolean z17, gg3.c videoLoadParam) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoLoadParam, "videoLoadParam");
        android.widget.RelativeLayout relativeLayout = this.f476136d;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(z17 ? 0 : 8);
        }
        if (z17) {
            java.lang.String str = videoLoadParam.f353261c;
            java.lang.String n17 = com.p314xaae8f345.mm.vfs.w6.n(str);
            jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 g2Var = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f.e(n17), str);
            g2Var.f270843c = videoLoadParam.f353262d;
            g2Var.f270844d = n17;
            g2Var.f270848h = 3;
            re5.w wVar = new re5.w();
            ((ht.a) vVar).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.u0 u0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.u0(m158354x19263085, g2Var, wVar);
            android.widget.TextView textView = (android.widget.TextView) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.vml);
            if (textView != null) {
                textView.setOnClickListener(new re5.v(u0Var, textView));
            }
        }
    }

    @Override // kg3.d
    public void h4() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        this.f476136d = (android.widget.RelativeLayout) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.vm_);
        android.widget.TextView textView = (android.widget.TextView) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.oyz);
        if (textView != null) {
            textView.setText(textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.pc8));
        }
        android.widget.TextView textView2 = (android.widget.TextView) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.vml);
        if (textView2 != null) {
            textView2.setText(textView2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.pc7));
            textView2.setClickable(true);
        }
    }
}
