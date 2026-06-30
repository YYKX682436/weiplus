package dn2;

/* loaded from: classes3.dex */
public final class n implements dn2.e {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f323478a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f323479b;

    @Override // dn2.e
    public java.lang.Integer a() {
        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.b1u);
    }

    @Override // dn2.e
    public android.view.View c(android.view.View rootView, dk2.zf liveMsg, cn2.p0 widget) {
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072;
        java.util.LinkedList m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveMsg, "liveMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        android.content.Context context = rootView.getContext();
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.f566107er2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f323478a = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.b1u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f323479b = textView;
        textView.setGravity(3);
        jz5.f0 f0Var = null;
        dk2.kf kfVar = liveMsg instanceof dk2.kf ? (dk2.kf) liveMsg : null;
        if (kfVar != null) {
            java.lang.Object D = kfVar.D();
            r45.jh1 jh1Var = D instanceof r45.jh1 ? (r45.jh1) D : null;
            if (jh1Var != null) {
                int m75939xb282bd08 = jh1Var.m75939xb282bd08(0);
                java.lang.String str = "";
                if (m75939xb282bd08 == 1) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    r45.f62 f62Var = (r45.f62) jh1Var.m75936x14adae67(1);
                    if (f62Var != null && (m75945x2fec8307 = f62Var.m75945x2fec8307(10)) != null) {
                        str = m75945x2fec8307;
                    }
                    objArr[0] = str;
                    str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mp8, objArr);
                } else if (m75939xb282bd08 == 2) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    r45.f62 f62Var2 = (r45.f62) jh1Var.m75936x14adae67(1);
                    if (f62Var2 != null && (m75941xfb821914 = f62Var2.m75941xfb821914(5)) != null) {
                        java.util.Iterator it = m75941xfb821914.iterator();
                        while (it.hasNext()) {
                            linkedList.addAll(((r45.hd6) it.next()).m75941xfb821914(7));
                        }
                    }
                    java.lang.Object[] objArr2 = new java.lang.Object[2];
                    r45.f62 f62Var3 = (r45.f62) jh1Var.m75936x14adae67(1);
                    if (f62Var3 != null && (m75945x2fec83072 = f62Var3.m75945x2fec8307(10)) != null) {
                        str = m75945x2fec83072;
                    }
                    objArr2[0] = str;
                    zl2.r4 r4Var = zl2.r4.f555483a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
                    objArr2[1] = r4Var.J0(context, linkedList);
                    str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mpe, objArr2);
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                android.widget.TextView textView2 = this.f323479b;
                if (textView2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
                    throw null;
                }
                textView2.setText(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CommentTopAreaBulletItem", "show FinderLiveAppMsgAnchorQuestUpdateInfo, tips:".concat(str));
                f0Var = jz5.f0.f384359a;
            }
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CommentTopAreaBulletItem", "invalid livemsg:" + liveMsg);
        }
        return rootView;
    }

    @Override // dn2.e
    /* renamed from: getLayoutId */
    public int mo125815x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570400dj3;
    }
}
