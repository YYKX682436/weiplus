package s82;

/* loaded from: classes9.dex */
public class l0 extends s82.c {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f486345f;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra raVar) {
        super(raVar);
        this.f486345f = new java.util.HashSet();
    }

    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var) {
        android.view.View view2;
        s82.k0 k0Var;
        b(viewGroup);
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            k0Var = new s82.k0();
            view2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.abj, null);
            a(view2, k0Var, r2Var);
            k0Var.f486340q = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.duu);
            k0Var.f486341r = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.dx7);
            s82.c.j(k0Var.f486340q, r2Var);
        } else {
            view2 = view;
            k0Var = (s82.k0) view.getTag();
        }
        java.util.LinkedList linkedList = r2Var.f67640x5ab01132.f452497f;
        if (linkedList.size() > 0) {
            int i17 = ((r45.gp0) linkedList.getFirst()).f456981y;
            k0Var.f486341r.setText(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w6.b(context, i17));
            if (i17 <= 1) {
                java.util.HashSet hashSet = this.f486345f;
                if (!hashSet.contains(java.lang.Long.valueOf(r2Var.f67645x88be67a1))) {
                    hashSet.add(java.lang.Long.valueOf(r2Var.f67645x88be67a1));
                    gm0.j1.e().j(new s82.j0(this, r2Var));
                }
            }
            k0Var.f486341r.setVisibility(0);
        } else {
            k0Var.f486341r.setVisibility(8);
        }
        g(k0Var, r2Var);
        r45.gp0 J2 = o72.x1.J(r2Var);
        k(k0Var.f486340q);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra raVar = this.f486272c;
        android.widget.ImageView imageView = k0Var.f486340q;
        int i18 = this.f486270a;
        raVar.c(imageView, J2, r2Var, com.p314xaae8f345.mm.R.raw.f78433xb28fb9bc, i18, i18);
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        s82.k0 k0Var = (s82.k0) view.getTag();
        android.content.Context context = view.getContext();
        ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(context, k0Var.f486307a, dq0Var);
    }
}
