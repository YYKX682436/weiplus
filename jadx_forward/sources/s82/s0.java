package s82;

/* loaded from: classes9.dex */
public final class s0 extends s82.c {

    /* renamed from: f, reason: collision with root package name */
    public final int f486368f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f486369g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View.OnClickListener f486370h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra imageServer) {
        super(imageServer);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageServer, "imageServer");
        this.f486370h = new s82.r0(imageServer, this);
        this.f486368f = i65.a.h(imageServer.f182917a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561308ew);
        this.f486369g = new java.util.HashSet();
    }

    public static final void l(s82.s0 s0Var, android.widget.ImageView imageView) {
        java.util.HashSet hashSet = (java.util.HashSet) s0Var.f486369g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTingMusicListItem", "mask iv set size is %d", java.lang.Integer.valueOf(hashSet.size()));
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            android.widget.ImageView imageView2 = (android.widget.ImageView) it.next();
            if (imageView2 == imageView) {
                if (imageView2 != null) {
                    imageView2.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.as6);
                }
            } else if (imageView2 != null) {
                imageView2.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.as8);
            }
        }
    }

    @Override // s82.c
    public java.lang.String c(s82.g gVar, o72.r2 r2Var) {
        java.lang.String m75945x2fec8307;
        r45.gp0 J2 = o72.x1.J(r2Var);
        java.lang.String str = J2.f456941f;
        r45.hp0 hp0Var = J2.J1;
        r45.xs4 xs4Var = hp0Var != null ? hp0Var.C : null;
        java.lang.String m75945x2fec83072 = xs4Var != null ? xs4Var.m75945x2fec8307(4) : null;
        if (!(m75945x2fec83072 == null || m75945x2fec83072.length() == 0)) {
            str = (xs4Var == null || (m75945x2fec8307 = xs4Var.m75945x2fec8307(4)) == null) ? "" : m75945x2fec8307;
        }
        return str == null ? "" : str;
    }

    @Override // s82.c
    public java.lang.Integer d(r45.gp0 gp0Var) {
        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79117xea106884);
    }

    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup parent, o72.r2 r2Var) {
        android.view.View view2;
        s82.q0 q0Var;
        android.widget.ImageView imageView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.content.Context context = parent.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (view == null) {
            s82.q0 q0Var2 = new s82.q0();
            android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.abb, null);
            a(inflate, q0Var2, r2Var);
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.dum);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
            q0Var2.f486362q = (android.widget.ImageView) findViewById;
            android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.dwp);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            q0Var2.f486364s = (android.widget.TextView) findViewById2;
            android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f565847du0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.dur);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById4, "null cannot be cast to non-null type android.widget.ImageView");
            q0Var2.f486363r = (android.widget.ImageView) findViewById4;
            android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.dvy);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
            ((android.widget.TextView) findViewById5).setVisibility(8);
            android.widget.ImageView imageView2 = q0Var2.f486363r;
            if (imageView2 != null) {
                imageView2.setOnClickListener(this.f486370h);
            }
            android.widget.ImageView imageView3 = q0Var2.f486363r;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            }
            ((java.util.HashSet) this.f486369g).add(q0Var2.f486363r);
            s82.c.i(q0Var2.f486362q, 32, o72.x1.J(r2Var));
            q0Var = q0Var2;
            view2 = inflate;
        } else {
            try {
                java.lang.Object tag = view.getTag();
                view2 = view;
                q0Var = tag instanceof s82.q0 ? (s82.q0) tag : null;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavTingMusicListItem", "invalid type, message:" + e17.getMessage());
                return view;
            }
        }
        if (q0Var == null) {
            return view2;
        }
        g(q0Var, r2Var);
        r45.gp0 J2 = o72.x1.J(r2Var);
        if (J2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavTingMusicListItem", "getView, data item is null");
            return view2;
        }
        java.lang.String str = J2.f456937d;
        r45.hp0 hp0Var = J2.J1;
        r45.xs4 xs4Var = hp0Var != null ? hp0Var.C : null;
        java.lang.String m75945x2fec8307 = xs4Var != null ? xs4Var.m75945x2fec8307(4) : null;
        if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0) && xs4Var != null) {
            xs4Var.m75945x2fec8307(4);
        }
        if (xs4Var != null) {
            xs4Var.m75945x2fec8307(16);
        }
        android.widget.TextView textView = q0Var.f486364s;
        if (textView != null) {
            textView.setText(str);
        }
        if (J2.J1 == null) {
            J2.J1 = new r45.hp0();
        }
        r45.hp0 hp0Var2 = J2.J1;
        if (hp0Var2.C == null) {
            hp0Var2.C = new r45.xs4();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra raVar = this.f486272c;
        android.widget.ImageView imageView4 = q0Var.f486362q;
        int Vi = ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Vi();
        int i17 = this.f486368f;
        raVar.c(imageView4, J2, r2Var, Vi, i17, i17);
        android.widget.ImageView imageView5 = q0Var.f486363r;
        if (imageView5 != null) {
            imageView5.setTag(r2Var);
        }
        android.widget.ImageView imageView6 = q0Var.f486363r;
        if (imageView6 != null) {
            imageView6.setVisibility(0);
        }
        if (o72.x1.k0(J2)) {
            android.widget.ImageView imageView7 = q0Var.f486363r;
            if (imageView7 != null) {
                imageView7.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.as6);
            }
            android.widget.ImageView imageView8 = q0Var.f486363r;
            if (imageView8 != null) {
                imageView8.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572044x5));
            }
        } else {
            android.widget.ImageView imageView9 = q0Var.f486363r;
            if (imageView9 != null) {
                imageView9.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.as8);
            }
            android.widget.ImageView imageView10 = q0Var.f486363r;
            if (imageView10 != null) {
                imageView10.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572052xf));
            }
        }
        if (xs4Var != null && xs4Var.m75939xb282bd08(18) > 0) {
            qk.i9 i9Var = (qk.i9) i95.n0.c(qk.i9.class);
            int m75939xb282bd08 = xs4Var.m75939xb282bd08(18);
            ((ef0.l4) i9Var).getClass();
            if (!km4.v.b(context, m75939xb282bd08, false) && (imageView = q0Var.f486363r) != null) {
                imageView.setVisibility(8);
            }
        }
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionMusic.k(view.getContext(), null)) {
            java.lang.Object tag = view.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.fav.ui.listitem.FavTingMusicListItem.FavTingMusicHolder");
            ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(view.getContext(), ((s82.q0) tag).f486307a, dq0Var);
        }
    }
}
