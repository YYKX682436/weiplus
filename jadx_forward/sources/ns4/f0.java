package ns4;

/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f421051a;

    public f0(java.util.List wording, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wording, "wording");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f421051a = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(context);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f571146d61, null);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.c_3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        ((android.widget.Button) findViewById).setOnClickListener(new ns4.e0(this));
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568856oa0);
        java.util.Iterator it = wording.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams.bottomMargin = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
            android.widget.TextView textView = new android.widget.TextView(context);
            textView.setLayoutParams(layoutParams);
            textView.setText(str);
            linearLayout.addView(textView);
        }
        this.f421051a.k(inflate);
    }
}
