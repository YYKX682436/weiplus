package my2;

/* loaded from: classes3.dex */
public final class f0 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my2.k0 f414262d;

    public f0(my2.k0 k0Var) {
        this.f414262d = k0Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteCardPlugin$setRestartVoteSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        my2.k0 k0Var = this.f414262d;
        mm2.e1 e1Var = (mm2.e1) k0Var.P0(mm2.e1.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVoteCardPlugin", "voteInfo clear by restart");
        k0Var.K0(8);
        k0Var.v1(8);
        qo0.c.a(k0Var.f414276p, qo0.b.f446972y2, null, 2, null);
        mm2.c1 c1Var = (mm2.c1) k0Var.P0(mm2.c1.class);
        c1Var.f410317b6 = null;
        c1Var.f410322c6 = false;
        c1Var.f410327d6 = false;
        ky2.g0 g0Var = k0Var.f414285y;
        if (g0Var != null) {
            g0Var.f395076f.clear();
            g0Var.m8146xced61ae5();
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.content.Context context = k0Var.f446856d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        r4Var.k1(context, e1Var.f410521r.m75942xfb822ef2(0), e1Var.f410516m, e1Var.f410525v, ((mm2.c1) k0Var.P0(mm2.c1.class)).f410385o);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteCardPlugin$setRestartVoteSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(this.f414262d.f446856d.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aki));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
