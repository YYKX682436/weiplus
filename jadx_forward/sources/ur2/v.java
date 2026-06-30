package ur2;

/* loaded from: classes10.dex */
public final class v extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f511957d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f511958e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f511959f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f511960g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f511961h;

    /* renamed from: i, reason: collision with root package name */
    public ur2.o f511962i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f511963m;

    /* renamed from: n, reason: collision with root package name */
    public ry2.e f511964n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if ((r1.length() > 0) != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O6(boolean r17) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ur2.v.O6(boolean):void");
    }

    public final void P6(long j17) {
        java.lang.CharSequence charSequence;
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f511963m;
        if (f5Var != null) {
            f5Var.d();
        }
        if (this.f511957d) {
            android.widget.TextView textView = this.f511960g;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tvTitle");
                throw null;
            }
            charSequence = textView.getText();
        } else {
            charSequence = "";
        }
        ur2.o oVar = this.f511962i;
        if (oVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("previewHalfScreen");
            throw null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(charSequence);
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i17 = b17.x;
        int i18 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!z17) {
            if (i18 >= i17) {
                i17 = i18;
            }
            i18 = i17;
        }
        oVar.f511946m = i18 - oVar.f511940d.findViewById(com.p314xaae8f345.mm.R.id.jlt).getHeight();
        oVar.f511945i = false;
        oVar.f511952s.f();
        android.view.View view = oVar.f511949p;
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), oVar.f511946m);
        android.view.View view2 = oVar.f511947n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/post/shorttitle/PostShortTitleHalfScreen", "tryShow", "(JLjava/lang/CharSequence;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/post/shorttitle/PostShortTitleHalfScreen", "tryShow", "(JLjava/lang/CharSequence;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z18 = charSequence.length() > 0;
        android.widget.EditText editText = oVar.f511948o;
        if (z18) {
            editText.setText(charSequence);
        }
        editText.requestFocus();
        editText.postDelayed(new ur2.n(oVar), j17);
    }

    public final void Q6(boolean z17, java.lang.CharSequence charSequence) {
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f511961h;
            if (c22699x3dcdb352 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ivIcon");
                throw null;
            }
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f81170xc02fa8b4);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f511961h;
            if (c22699x3dcdb3522 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ivIcon");
                throw null;
            }
            c22699x3dcdb3522.m82040x7541828(m80379x76847179().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19));
            android.widget.TextView textView = this.f511960g;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tvTitle");
                throw null;
            }
            textView.setTextColor(m80379x76847179().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19));
            android.widget.TextView textView2 = this.f511960g;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tvTitle");
                throw null;
            }
            textView2.setText(charSequence);
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f511961h;
            if (c22699x3dcdb3523 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ivIcon");
                throw null;
            }
            c22699x3dcdb3523.setImageResource(com.p314xaae8f345.mm.R.raw.f81171xcbe58ac7);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = this.f511961h;
            if (c22699x3dcdb3524 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ivIcon");
                throw null;
            }
            c22699x3dcdb3524.m82040x7541828(m80379x76847179().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abw));
            android.widget.TextView textView3 = this.f511960g;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tvTitle");
                throw null;
            }
            textView3.setTextColor(m80379x76847179().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abw));
            android.widget.TextView textView4 = this.f511960g;
            if (textView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tvTitle");
                throw null;
            }
            textView4.setText(m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nmf));
        }
        this.f511957d = z17;
    }
}
