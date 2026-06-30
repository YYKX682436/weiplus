package lj2;

/* loaded from: classes10.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lj2.c0 f400350d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(lj2.c0 c0Var) {
        super(0);
        this.f400350d = c0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        dk2.u4 K;
        lj2.c0 c0Var = this.f400350d;
        lj2.t0 a07 = c0Var.f400364b.a0();
        if (a07 != null && (K = a07.K()) != null) {
            c0Var.b().a(0);
            c0Var.c().b(8);
            if (K.f315691e == 5) {
                lj2.s b17 = c0Var.b();
                b17.f400474e.setVisibility(0);
                b17.f400475f.setVisibility(8);
                b17.f400472c.setVisibility(4);
                b17.f400471b.setVisibility(4);
            } else {
                lj2.s b18 = c0Var.b();
                b18.f400474e.setVisibility(8);
                b18.f400475f.setVisibility(0);
                b18.f400472c.setVisibility(0);
                b18.f400471b.setVisibility(0);
            }
            lj2.s b19 = c0Var.b();
            int i17 = K.f315693g;
            int i18 = K.f315694h;
            int i19 = K.f315699m;
            b19.f400478i = i17;
            b19.f400479j = i19;
            android.widget.TextView textView = b19.f400476g;
            android.view.View view = b19.f400470a;
            if (i17 == 2 && i19 == 0) {
                java.lang.String string = view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dzo);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                textView.setText(string);
            } else {
                java.lang.String string2 = view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d6r);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                textView.setText(string2);
            }
            android.widget.TextView textView2 = b19.f400473d;
            android.widget.TextView textView3 = b19.f400471b;
            if (i18 == 1) {
                b19.b();
                textView3.setText(view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573012d72));
                textView2.setText(view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lje));
            } else {
                b19.b();
                textView3.setText(view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573012d72));
                textView2.setText(view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ljg));
            }
            android.view.View view2 = b19.f400477h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveNewBattleAnchorTipWidget$AcceptViewHolder", "onBindBattleMode", "(III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveNewBattleAnchorTipWidget$AcceptViewHolder", "onBindBattleMode", "(III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(0);
        }
        c0Var.b().f400470a.animate().translationX(0.0f).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).setListener(null).start();
        return jz5.f0.f384359a;
    }
}
