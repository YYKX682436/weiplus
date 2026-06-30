package s82;

/* loaded from: classes10.dex */
public final class o extends s82.c {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f486355f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra imageServer) {
        super(imageServer);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageServer, "imageServer");
        this.f486355f = "FavFinderCollectionLiteItem";
    }

    @Override // s82.c
    public java.lang.String c(s82.g gVar, o72.r2 r2Var) {
        r45.bq0 bq0Var;
        r45.ev2 ev2Var;
        ya2.b2 Ui;
        boolean z17 = false;
        if (r2Var != null && r2Var.f67657x2262335f == 34) {
            z17 = true;
        }
        if (!z17 || (bq0Var = r2Var.f67640x5ab01132) == null || (ev2Var = bq0Var.Q) == null) {
            return "";
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        java.lang.String m75945x2fec8307 = ev2Var.m75945x2fec8307(8);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa i17 = (m75945x2fec8307 == null || (Ui = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Ui(m75945x2fec8307)) == null) ? null : ya2.d.i(Ui);
        if (i17 == null) {
            i17 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
            i17.m76227x7ac946f0(ev2Var.m75945x2fec8307(9));
            i17.m76218xe0a5bcad(ev2Var.m75945x2fec8307(10));
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc();
            c19780xceb4c4dc.m76039xa7d6d9ac(ev2Var.m75945x2fec8307(11));
            c19780xceb4c4dc.m76038x5304029d(ev2Var.m75939xb282bd08(12));
            i17.m76203xcbec40f8(c19780xceb4c4dc);
        }
        java.lang.String m76184x8010e5e4 = i17.m76184x8010e5e4();
        return m76184x8010e5e4 == null ? "" : m76184x8010e5e4;
    }

    @Override // s82.c
    public java.lang.Integer d(r45.gp0 gp0Var) {
        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80119x628f1c9a);
    }

    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var) {
        android.view.View view2;
        s82.n nVar;
        r45.bq0 bq0Var;
        r45.ev2 ev2Var;
        android.content.res.Resources resources;
        java.lang.String str = null;
        android.content.Context context = viewGroup != null ? viewGroup.getContext() : null;
        if (view == null) {
            nVar = new s82.n(this);
            view2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570293e54, null);
            a(view2, nVar, r2Var);
            android.view.View findViewById = view2.findViewById(com.p314xaae8f345.mm.R.id.dvj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
            nVar.f486352s = (android.widget.ImageView) findViewById;
            android.view.View findViewById2 = view2.findViewById(com.p314xaae8f345.mm.R.id.dvr);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            nVar.f486350q = (android.widget.TextView) findViewById2;
            android.view.View findViewById3 = view2.findViewById(com.p314xaae8f345.mm.R.id.dvk);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            nVar.f486351r = (android.widget.TextView) findViewById3;
        } else {
            java.lang.Object tag = view.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.fav.ui.listitem.FavFinderCollectionLiteItem.FavFinderCollectionHolder");
            s82.n nVar2 = (s82.n) tag;
            view2 = view;
            nVar = nVar2;
        }
        g(nVar, r2Var);
        s82.c.j(nVar.f486352s, r2Var);
        android.widget.TextView textView = nVar.f486350q;
        if (textView != null) {
            textView.setText("");
        }
        android.widget.TextView textView2 = nVar.f486351r;
        if (textView2 != null) {
            textView2.setText("");
        }
        boolean z17 = true;
        if ((r2Var != null && r2Var.f67657x2262335f == 34) && (bq0Var = r2Var.f67640x5ab01132) != null && (ev2Var = bq0Var.Q) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f486355f, "sourceId=" + r2Var.f67650x85d9e03b + ",finderCollectionItem=" + ev2Var.mo12245xcc313de3());
            java.lang.String m75945x2fec8307 = ev2Var.m75945x2fec8307(1);
            java.lang.String m75945x2fec83072 = m75945x2fec8307 == null || m75945x2fec8307.length() == 0 ? ev2Var.m75945x2fec8307(2) : ev2Var.m75945x2fec8307(1);
            if (m75945x2fec83072 != null && m75945x2fec83072.length() != 0) {
                z17 = false;
            }
            if (z17) {
                android.widget.TextView textView3 = nVar.f486350q;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
            } else {
                android.widget.TextView textView4 = nVar.f486350q;
                if (textView4 != null) {
                    textView4.setText(m75945x2fec83072);
                }
                android.widget.TextView textView5 = nVar.f486350q;
                if (textView5 != null) {
                    textView5.setVisibility(0);
                }
            }
            if (ev2Var.m75939xb282bd08(4) > 0) {
                android.widget.TextView textView6 = nVar.f486351r;
                if (textView6 != null) {
                    if (context != null && (resources = context.getResources()) != null) {
                        str = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572747ng4, java.lang.Integer.valueOf(ev2Var.m75939xb282bd08(4)));
                    }
                    textView6.setText(str);
                }
                android.widget.TextView textView7 = nVar.f486351r;
                if (textView7 != null) {
                    textView7.setTextColor(textView7.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
                    textView7.setTextSize(0, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3));
                }
                android.widget.TextView textView8 = nVar.f486351r;
                if (textView8 != null) {
                    textView8.setVisibility(0);
                }
            } else {
                android.widget.TextView textView9 = nVar.f486351r;
                if (textView9 != null) {
                    textView9.setVisibility(8);
                }
            }
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            zy2.v8.b(ya2.l.f542035a, ev2Var.m75945x2fec8307(3), nVar.f486352s, null, 4, null);
        }
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        r45.bq0 bq0Var;
        r45.ev2 ev2Var;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionChannels.k(view != null ? view.getContext() : null, null)) {
            java.lang.Object tag = view != null ? view.getTag() : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.fav.ui.listitem.FavFinderCollectionLiteItem.FavFinderCollectionHolder");
            o72.r2 r2Var = ((s82.n) tag).f486307a;
            if (!(r2Var != null && r2Var.f67657x2262335f == 34) || r2Var == null || (bq0Var = r2Var.f67640x5ab01132) == null || (ev2Var = bq0Var.Q) == null) {
                return;
            }
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavFinderLogic", "goFinderCollection topicId " + pm0.v.u(ev2Var.m75942xfb822ef2(0)) + '}');
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f542005a.n(context, ev2Var, 43);
        }
    }
}
