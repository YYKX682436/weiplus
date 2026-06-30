package sp2;

/* loaded from: classes2.dex */
public final class y implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.b0 f492816d;

    public y(sp2.b0 b0Var) {
        this.f492816d = b0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.vs2 vs2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[personalCenterLiveRedDot] red=");
        sb6.append(z9Var != null ? z9Var.f186862c : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveEntranceFragmentUICMoreIcon", sb6.toString());
        sp2.b0 b0Var = this.f492816d;
        android.widget.ImageView imageView = (android.widget.ImageView) b0Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ub_);
        android.widget.TextView textView = (android.widget.TextView) b0Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ub9);
        if (!(z9Var != null && z9Var.f186860a)) {
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            if (textView == null) {
                return;
            }
            textView.setVisibility(4);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = z9Var.f186862c;
        java.lang.Integer valueOf = (jbVar == null || (vs2Var = jbVar.f65874xb5f7102a) == null) ? null : java.lang.Integer.valueOf(vs2Var.f470020e);
        if (valueOf == null || valueOf.intValue() != 44) {
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            if (textView != null) {
                textView.setVisibility(4);
            }
            b0Var.O6(ll2.a.f400657e);
            return;
        }
        r45.f03 f03Var = z9Var.f186861b;
        int i17 = f03Var != null ? f03Var.f455421e : 0;
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("LivePersonalCenter");
        int i18 = I0 != null ? I0.f455421e : i17;
        if (!(f03Var != null && f03Var.f455420d == 2) || i18 <= 0) {
            if (f03Var != null && f03Var.f455420d == 1) {
                if (!(imageView != null && imageView.getVisibility() == 0)) {
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    b0Var.O6(ll2.a.f400657e);
                }
                if (textView != null) {
                    textView.setVisibility(4);
                }
            } else {
                if (imageView != null) {
                    imageView.setVisibility(4);
                }
                if (textView != null) {
                    textView.setVisibility(4);
                }
            }
        } else {
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            if (textView != null) {
                com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                textView.setTextSize(1, 10.0f);
                textView.setVisibility(0);
                textView.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.a(i18));
                android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
                if (i18 < 10) {
                    layoutParams2.setMarginStart(0);
                    layoutParams2.setMarginEnd((int) b0Var.m80379x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl));
                    layoutParams2.gravity = 8388613;
                } else {
                    layoutParams2.gravity = 8388611;
                    layoutParams2.setMarginStart((int) b0Var.m80379x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
                    layoutParams2.setMarginEnd(0);
                }
                textView.setLayoutParams(layoutParams2);
                android.app.Activity context = b0Var.m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                textView.setBackgroundResource(java.lang.Float.compare(i65.a.q(context), i65.a.z(context)) > 0 ? i18 < 10 ? com.p314xaae8f345.mm.R.C30861xcebc809e.b5b : com.p314xaae8f345.mm.R.C30861xcebc809e.b5e : i18 < 10 ? com.p314xaae8f345.mm.R.C30861xcebc809e.b5c : com.p314xaae8f345.mm.R.C30861xcebc809e.b5d);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveEntranceFragmentUICMoreIcon", "redDotCountView = " + textView.getVisibility());
            b0Var.O6(ll2.a.f400657e);
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("resultCount:");
        sb7.append(i17);
        sb7.append(" count:");
        sb7.append(i18);
        sb7.append(" show_type:");
        sb7.append(f03Var != null ? java.lang.Integer.valueOf(f03Var.f455420d) : null);
        sb7.append(" redDotCountView=");
        sb7.append(textView != null ? java.lang.Integer.valueOf(textView.getVisibility()) : null);
        sb7.append(" redDotNormalView=");
        sb7.append(imageView != null ? java.lang.Integer.valueOf(imageView.getVisibility()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveEntranceFragmentUICMoreIcon", sb7.toString());
    }
}
