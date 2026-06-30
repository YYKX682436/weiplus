package xs2;

/* loaded from: classes3.dex */
public final class u0 implements rl5.n {

    /* renamed from: a, reason: collision with root package name */
    public static final xs2.u0 f537922a = new xs2.u0();

    @Override // rl5.n
    public final android.view.View a(android.content.Context context, android.view.MenuItem menuItem) {
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.c_6, null);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.h5n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.obc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.cg7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        ((android.widget.LinearLayout) findViewById3).getLayoutParams().width = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561267dr);
        c22699x3dcdb352.setImageDrawable(menuItem.getIcon());
        textView.setText(menuItem.getTitle());
        db5.h4 h4Var = (db5.h4) menuItem;
        int i17 = h4Var.f309911v;
        int i18 = h4Var.f309903n;
        if (i17 != 0) {
            c22699x3dcdb352.m82040x7541828(i17);
        }
        if (i18 != 0) {
            textView.setTextColor(i18);
        }
        return inflate;
    }
}
