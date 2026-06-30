package s82;

/* loaded from: classes9.dex */
public class s extends s82.c {
    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var) {
        android.view.View view2;
        s82.r rVar;
        android.content.Context context = viewGroup.getContext();
        b(viewGroup);
        if (view == null) {
            rVar = new s82.r();
            view2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.abh, null);
            a(view2, rVar, r2Var);
            android.widget.ImageView imageView = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.duu);
            rVar.f486365q = imageView;
            k(imageView);
        } else {
            view2 = view;
            rVar = (s82.r) view.getTag();
        }
        g(rVar, r2Var);
        s82.c.j(rVar.f486365q, r2Var);
        r45.gp0 J2 = o72.x1.J(r2Var);
        android.widget.ImageView imageView2 = rVar.f486365q;
        int i17 = this.f486270a;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra.d(imageView2, com.p314xaae8f345.mm.R.raw.f79106xd105c448, J2, r2Var, false, i17, i17);
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        s82.r rVar = (s82.r) view.getTag();
        android.content.Context context = view.getContext();
        ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(context, rVar.f486307a, dq0Var);
    }
}
