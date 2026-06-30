package fk2;

/* loaded from: classes3.dex */
public final class p2 extends we2.o {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f344985m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(we2.a liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f344985m = "CommentItemRewardRankingNotice";
    }

    @Override // we2.o
    public void d(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.Object D = msg.D();
        boolean z17 = D instanceof r45.zj1;
        java.lang.String str = this.f344985m;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "onBindRewardRankNoticeMsg payloadContent isn't FinderLiveAppMsgRewardRankingNoticeInfo");
            return;
        }
        int m75939xb282bd08 = ((r45.zj1) D).m75939xb282bd08(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "onBindRewardRankNoticeMsg ranking_position " + m75939xb282bd08);
        if (m75939xb282bd08 < 1) {
            return;
        }
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = holder.f103460e;
        android.text.TextPaint m84162x74f59ea8 = c22624x85d69039.m84162x74f59ea8();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m84162x74f59ea8, "getPaint(...)");
        java.lang.CharSequence nf6 = c61.yb.nf((c61.yb) c17, context, m84162x74f59ea8, zl2.r4.D0(zl2.r4.f555483a, msg.a(), msg.k(), false, 4, null), 0, 8, null);
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dyu, java.lang.Integer.valueOf(m75939xb282bd08));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d5t, ((java.lang.Object) nf6) + ' ' + string);
        ((ke0.e) xVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, string2));
        android.graphics.drawable.Drawable a17 = gm2.u.a(gm2.v.f355031f, g(), 0.0f, 0.0f, 6, null);
        java.lang.String g17 = g();
        float f17 = gm2.w.f355044k;
        f0Var.c(new gm2.v(a17, new gm2.w(g17, f17, f17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b), gm2.w.f355042i, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0), gm2.w.f355043j, 0.0f, 128, null)), 0, g().length() + 0, 33);
        android.view.ViewParent parent = c22624x85d69039.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) parent;
        relativeLayout.setPadding(0, relativeLayout.getPaddingTop(), relativeLayout.getPaddingRight(), relativeLayout.getPaddingBottom());
        c22624x85d69039.b(f0Var);
        c22624x85d69039.m84185x3abfd950(this.f526780h);
        holder.f103462g.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a1k));
    }

    @Override // we2.o
    public dk2.zf e(r45.ch1 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return new dk2.mc(msg);
    }

    @Override // we2.o
    public int n() {
        return 20014;
    }
}
