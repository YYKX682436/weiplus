package s82;

/* loaded from: classes9.dex */
public class z extends s82.c {

    /* renamed from: f, reason: collision with root package name */
    public final int f486391f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f486392g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View.OnClickListener f486393h;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra raVar) {
        super(raVar);
        this.f486393h = new s82.x(this);
        this.f486391f = i65.a.h(raVar.f182917a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561308ew);
        this.f486392g = new java.util.HashSet();
    }

    public static void l(s82.z zVar, android.widget.ImageView imageView) {
        java.util.HashSet hashSet = (java.util.HashSet) zVar.f486392g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavBaseListItem", "mask iv set size is %d", java.lang.Integer.valueOf(hashSet.size()));
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            android.widget.ImageView imageView2 = (android.widget.ImageView) it.next();
            if (imageView2 == imageView) {
                imageView2.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.as6);
            } else {
                imageView2.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.as8);
            }
        }
    }

    @Override // s82.c
    public java.lang.String c(s82.g gVar, o72.r2 r2Var) {
        return o72.x1.J(r2Var).f456941f;
    }

    @Override // s82.c
    public java.lang.Integer d(r45.gp0 gp0Var) {
        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79117xea106884);
    }

    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var) {
        android.view.View view2;
        s82.y yVar;
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            yVar = new s82.y();
            view2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.abb, null);
            a(view2, yVar, r2Var);
            yVar.f486386q = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.dum);
            yVar.f486388s = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.dwp);
            yVar.f486389t = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f565847du0);
            yVar.f486387r = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.dur);
            ((android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.dvy)).setVisibility(8);
            yVar.f486387r.setOnClickListener(this.f486393h);
            yVar.f486387r.setVisibility(0);
            ((java.util.HashSet) this.f486392g).add(yVar.f486387r);
        } else {
            try {
                view2 = view;
                yVar = (s82.y) view.getTag();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavBaseListItem", "invalid type, message:" + e17.getMessage());
                return view;
            }
        }
        g(yVar, r2Var);
        r45.gp0 J2 = o72.x1.J(r2Var);
        yVar.f486388s.setText(J2.f456937d);
        s82.c.h(yVar.f486386q, 7);
        yVar.f486389t.setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra raVar = this.f486272c;
        android.widget.ImageView imageView = yVar.f486386q;
        int i17 = this.f486391f;
        raVar.c(imageView, J2, r2Var, com.p314xaae8f345.mm.R.raw.f80683x65f07627, i17, i17);
        yVar.f486387r.setTag(r2Var);
        if (o72.x1.k0(J2)) {
            yVar.f486387r.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.as6);
            yVar.f486387r.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572044x5));
        } else {
            yVar.f486387r.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.as8);
            yVar.f486387r.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572052xf));
        }
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionMusic.k(view.getContext(), null)) {
            s82.y yVar = (s82.y) view.getTag();
            android.content.Context context = view.getContext();
            ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(context, yVar.f486307a, dq0Var);
        }
    }
}
