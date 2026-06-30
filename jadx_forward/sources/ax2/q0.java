package ax2;

/* loaded from: classes10.dex */
public final class q0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15393xd4ca7d1b f96617d;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15393xd4ca7d1b c15393xd4ca7d1b) {
        this.f96617d = c15393xd4ca7d1b;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        android.widget.LinearLayout m62581xd437bdd9;
        android.widget.LinearLayout m62582xd437d1bf;
        android.widget.LinearLayout m62581xd437bdd92;
        android.widget.LinearLayout m62582xd437d1bf2;
        android.widget.LinearLayout m62581xd437bdd93;
        android.widget.LinearLayout m62582xd437d1bf3;
        android.widget.ScrollView m62583xa2597bb5;
        r45.zh5 b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15393xd4ca7d1b c15393xd4ca7d1b = this.f96617d;
        m62581xd437bdd9 = c15393xd4ca7d1b.m62581xd437bdd9();
        android.view.View childAt = m62581xd437bdd9.getChildAt(0);
        m62582xd437d1bf = c15393xd4ca7d1b.m62582xd437d1bf();
        android.view.View childAt2 = m62582xd437d1bf.getChildAt(0);
        m62581xd437bdd92 = c15393xd4ca7d1b.m62581xd437bdd9();
        m62581xd437bdd92.removeAllViews();
        m62582xd437d1bf2 = c15393xd4ca7d1b.m62582xd437d1bf();
        m62582xd437d1bf2.removeAllViews();
        m62581xd437bdd93 = c15393xd4ca7d1b.m62581xd437bdd9();
        m62581xd437bdd93.addView(childAt2);
        m62582xd437d1bf3 = c15393xd4ca7d1b.m62582xd437d1bf();
        m62582xd437d1bf3.addView(childAt);
        m62583xa2597bb5 = c15393xd4ca7d1b.m62583xa2597bb5();
        if (m62583xa2597bb5 != null) {
            m62583xa2597bb5.setScrollY(0);
        }
        java.lang.Object tag = childAt2.getTag();
        java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        if (str == null || (b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15393xd4ca7d1b.b(c15393xd4ca7d1b, str)) == null) {
            return;
        }
        if ((childAt2 instanceof android.widget.TextView ? (android.widget.TextView) childAt2 : null) != null) {
            c15393xd4ca7d1b.i((android.widget.TextView) childAt2, b17);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        android.widget.LinearLayout m62582xd437d1bf;
        r45.zh5 b17;
        android.widget.SeekBar m62586x1d47bd70;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15393xd4ca7d1b c15393xd4ca7d1b = this.f96617d;
        m62582xd437d1bf = c15393xd4ca7d1b.m62582xd437d1bf();
        java.lang.Object tag = m62582xd437d1bf.getChildAt(0).getTag();
        java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        if (str == null || (b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15393xd4ca7d1b.b(c15393xd4ca7d1b, str)) == null) {
            return;
        }
        m62586x1d47bd70 = c15393xd4ca7d1b.m62586x1d47bd70();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m62586x1d47bd70, "access$getProgressBar(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15393xd4ca7d1b.a(c15393xd4ca7d1b, m62586x1d47bd70, (int) b17.m75942xfb822ef2(2), (int) b17.m75942xfb822ef2(1));
    }
}
