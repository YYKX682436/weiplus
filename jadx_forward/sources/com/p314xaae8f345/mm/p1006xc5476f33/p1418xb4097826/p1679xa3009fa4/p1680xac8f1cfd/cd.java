package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class cd extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f215546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7 f215547e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7 c15452x854f54e7) {
        super(0);
        this.f215546d = s0Var;
        this.f215547e = c15452x854f54e7;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        in5.s0 s0Var = this.f215546d;
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.eft);
        if (p17 == null) {
            android.view.ViewStub viewStub = (android.view.ViewStub) s0Var.p(com.p314xaae8f345.mm.R.id.ipv);
            p17 = viewStub != null ? viewStub.inflate() : null;
        }
        if (p17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7 c15452x854f54e7 = this.f215547e;
            if (c15452x854f54e7.f215093h.isRunning() || p17.getVisibility() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedMegaVideoBtnAnimUIC", "startAppearAnim: the guide view is showing");
            } else {
                c15452x854f54e7.f215090e = p17;
                p17.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.yc(s0Var));
                c15452x854f54e7.f215091f = s0Var.p(com.p314xaae8f345.mm.R.id.ipz).getWidth();
                android.widget.TextView textView = (android.widget.TextView) p17.findViewById(com.p314xaae8f345.mm.R.id.iqq);
                if (textView != null) {
                    textView.setText(((android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.f567242iq1)).getText());
                    textView.setTextColor(p17.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77660x7595c307));
                }
                ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) p17.findViewById(com.p314xaae8f345.mm.R.id.iqs)).m82040x7541828(p17.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77660x7595c307));
                ((android.widget.TextView) p17.findViewById(com.p314xaae8f345.mm.R.id.iqr)).setAlpha(0.0f);
                android.view.View findViewById = p17.findViewById(com.p314xaae8f345.mm.R.id.f564576v2);
                findViewById.getLayoutParams().width = c15452x854f54e7.f215091f;
                findViewById.requestLayout();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedMegaVideoBtnAnimUIC$startAppearAnim$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedMegaVideoBtnAnimUIC$startAppearAnim$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.content.Context context = s0Var.f374654e;
                int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560780tz);
                int color2 = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560791ua);
                android.animation.ValueAnimator valueAnimator = c15452x854f54e7.f215093h;
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.removeAllListeners();
                valueAnimator.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zc(c15452x854f54e7, p17, findViewById, color, color2));
                valueAnimator.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ad(findViewById));
                valueAnimator.start();
                pm0.v.V(5000L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bd(c15452x854f54e7));
            }
        }
        return jz5.f0.f384359a;
    }
}
