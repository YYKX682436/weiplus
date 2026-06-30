package s82;

/* loaded from: classes9.dex */
public final class q extends s82.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra imageServer) {
        super(imageServer);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageServer, "imageServer");
        i65.a.h(imageServer.f182917a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561306eu);
    }

    @Override // s82.c
    public java.lang.String c(s82.g gVar, o72.r2 r2Var) {
        java.lang.String str;
        r45.bq0 bq0Var;
        r45.kv2 kv2Var;
        if (r2Var == null || (bq0Var = r2Var.f67640x5ab01132) == null || (kv2Var = bq0Var.M) == null) {
            str = null;
        } else {
            java.lang.String m75945x2fec8307 = kv2Var.m75945x2fec8307(15);
            java.lang.String m75945x2fec83072 = m75945x2fec8307 == null || m75945x2fec8307.length() == 0 ? kv2Var.m75945x2fec8307(2) : kv2Var.m75945x2fec8307(15);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            ((ke0.e) xVar).getClass();
            str = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, m75945x2fec83072).toString();
        }
        return str == null ? "" : str;
    }

    @Override // s82.c
    public java.lang.Integer d(r45.gp0 gp0Var) {
        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80119x628f1c9a);
    }

    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var) {
        s82.p pVar;
        android.view.View view2;
        r45.bq0 bq0Var;
        r45.kv2 kv2Var;
        android.content.Context context = viewGroup != null ? viewGroup.getContext() : null;
        if (view == null) {
            pVar = new s82.p(this);
            view2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.abe, null);
            a(view2, pVar, r2Var);
            android.view.View findViewById = view2.findViewById(com.p314xaae8f345.mm.R.id.dvj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
            pVar.f486359s = (android.widget.ImageView) findViewById;
            android.view.View findViewById2 = view2.findViewById(com.p314xaae8f345.mm.R.id.dvr);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            pVar.f486357q = (android.widget.TextView) findViewById2;
            android.view.View findViewById3 = view2.findViewById(com.p314xaae8f345.mm.R.id.dvk);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            pVar.f486358r = (android.widget.TextView) findViewById3;
            android.view.View findViewById4 = view2.findViewById(com.p314xaae8f345.mm.R.id.f566061ei5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById4, "null cannot be cast to non-null type android.widget.ImageView");
            pVar.f486360t = (android.widget.ImageView) findViewById4;
            android.view.View findViewById5 = view2.findViewById(com.p314xaae8f345.mm.R.id.dvq);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById5, "null cannot be cast to non-null type android.widget.ImageView");
            pVar.f486361u = (android.widget.ImageView) findViewById5;
        } else {
            java.lang.Object tag = view.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.fav.ui.listitem.FavFinderListItem.FavFinderHolder");
            pVar = (s82.p) tag;
            view2 = view;
        }
        g(pVar, r2Var);
        s82.c.j(pVar.f486359s, r2Var);
        android.widget.TextView textView = pVar.f486357q;
        if (textView != null) {
            textView.setText("");
        }
        android.widget.TextView textView2 = pVar.f486358r;
        if (textView2 != null) {
            textView2.setText("");
        }
        if (r2Var != null && (bq0Var = r2Var.f67640x5ab01132) != null && (kv2Var = bq0Var.M) != null) {
            java.lang.String m75945x2fec8307 = kv2Var.m75945x2fec8307(15);
            boolean z17 = true;
            java.lang.String m75945x2fec83072 = m75945x2fec8307 == null || m75945x2fec8307.length() == 0 ? kv2Var.m75945x2fec8307(2) : kv2Var.m75945x2fec8307(15);
            if (kv2Var.m75939xb282bd08(5) != 1) {
                java.lang.String m75945x2fec83073 = kv2Var.m75945x2fec8307(4);
                if (m75945x2fec83073 != null && m75945x2fec83073.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    android.widget.TextView textView3 = pVar.f486358r;
                    if (textView3 != null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
                        textView3.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572749cd3, m75945x2fec83072));
                    }
                } else {
                    android.widget.TextView textView4 = pVar.f486358r;
                    if (textView4 != null) {
                        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                        java.lang.String m75945x2fec83074 = kv2Var.m75945x2fec8307(4);
                        ((ke0.e) xVar).getClass();
                        textView4.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, m75945x2fec83074));
                    }
                }
            }
            android.widget.ImageView imageView = pVar.f486361u;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            int m75939xb282bd08 = kv2Var.m75939xb282bd08(5);
            if (m75939xb282bd08 == 2) {
                android.widget.ImageView imageView2 = pVar.f486360t;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                android.widget.ImageView imageView3 = pVar.f486360t;
                if (imageView3 != null) {
                    imageView3.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79630x4129ee57, i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an)));
                }
            } else if (m75939xb282bd08 != 4) {
                android.widget.ImageView imageView4 = pVar.f486360t;
                if (imageView4 != null) {
                    imageView4.setVisibility(8);
                }
            } else {
                android.widget.ImageView imageView5 = pVar.f486361u;
                if (imageView5 != null) {
                    imageView5.setVisibility(0);
                }
            }
            if (kv2Var.m75941xfb821914(7) != null && !kv2Var.m75941xfb821914(7).isEmpty()) {
                r45.iv2 iv2Var = (r45.iv2) kv2Var.m75941xfb821914(7).get(0);
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                zy2.v8.b(ya2.l.f542035a, iv2Var.m75945x2fec8307(2), pVar.f486359s, null, 4, null);
            }
        }
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        r45.bq0 bq0Var;
        r45.kv2 kv2Var;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionChannels.k(view != null ? view.getContext() : null, null)) {
            java.lang.Object tag = view != null ? view.getTag() : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.fav.ui.listitem.FavFinderListItem.FavFinderHolder");
            o72.r2 r2Var = ((s82.p) tag).f486307a;
            if (r2Var == null || (bq0Var = r2Var.f67640x5ab01132) == null || (kv2Var = bq0Var.M) == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x2.f183127a;
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            x2Var.a(context, kv2Var);
        }
    }
}
