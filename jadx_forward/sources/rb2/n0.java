package rb2;

/* loaded from: classes10.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final rb2.n0 f475228a = new rb2.n0();

    public final int a(android.content.Context context, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return z17 ? z18 ? context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77696x3cb0741, null) : context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23, null) : z18 ? context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77696x3cb0741, null) : context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aju, null);
    }

    public final void b(android.content.Context context, so2.y0 item, android.widget.ImageView authView, android.widget.ImageView imageView) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc;
        r45.ub1 m76200x1542c233;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authView, "authView");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76053x3682fe62 = item.f492236d.u0().m76053x3682fe62();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc m76160xd133dfec = m76053x3682fe62 != null ? m76053x3682fe62.m76160xd133dfec() : null;
        if (m76160xd133dfec == null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(item.f492236d.Z0(), xy2.c.e(context))) {
            ya2.b2 b17 = ya2.h.f542017a.b(item.f492236d.Z0());
            c19780xceb4c4dc = b17 != null ? b17.f69300x731cac1b : null;
        } else {
            c19780xceb4c4dc = m76160xd133dfec;
        }
        int m76027x1cbb0791 = c19780xceb4c4dc != null ? c19780xceb4c4dc.m76027x1cbb0791() : 0;
        if (m76027x1cbb0791 == 1 || m76027x1cbb0791 == 2) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            zy2.tb.a(ya2.m1.f542044a, authView, c19780xceb4c4dc, 0, 4, null);
            authView.setVisibility(0);
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        authView.setVisibility(8);
        if (imageView != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76053x3682fe622 = item.f492236d.u0().m76053x3682fe62();
            boolean z17 = (m76053x3682fe622 == null || (m76200x1542c233 = m76053x3682fe622.m76200x1542c233()) == null || m76200x1542c233.m75939xb282bd08(0) != 1) ? false : true;
            if (!item.f492236d.e1() && (!((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.L1().r()).booleanValue() || !z17)) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f80119x628f1c9a, i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7)));
            }
        }
    }

    public final void c(android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 awesomeIv, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(awesomeIv, "awesomeIv");
        int a17 = a(context, z17, z18);
        awesomeIv.setImageResource(z17 ? com.p314xaae8f345.mm.R.raw.f79758xc84e73d5 : com.p314xaae8f345.mm.R.raw.f80313x7abd4f8b);
        awesomeIv.m82040x7541828(a17);
    }

    public final void d(android.content.Context context, android.widget.TextView awesomeTv, boolean z17, int i17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(awesomeTv, "awesomeTv");
        if (i17 > 0) {
            awesomeTv.setVisibility(0);
            awesomeTv.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.d(i17));
        } else {
            awesomeTv.setVisibility(8);
            awesomeTv.setText("");
        }
        if (z18) {
            awesomeTv.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77696x3cb0741, null));
        } else if (z17) {
            awesomeTv.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23, null));
        } else {
            awesomeTv.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833, null));
        }
    }
}
