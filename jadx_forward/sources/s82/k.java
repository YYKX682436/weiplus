package s82;

/* loaded from: classes9.dex */
public class k extends s82.c {
    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var) {
        android.view.View view2;
        s82.j jVar;
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            jVar = new s82.j();
            view2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.abb, null);
            a(view2, jVar, r2Var);
            jVar.f486335q = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.dum);
            android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.dwp);
            jVar.f486336r = textView;
            textView.setSingleLine(false);
            jVar.f486336r.setMaxLines(2);
            jVar.f486337s = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f565847du0);
            jVar.f486338t = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.dvy);
        } else {
            view2 = view;
            jVar = (s82.j) view.getTag();
        }
        g(jVar, r2Var);
        com.p314xaae8f345.mm.p2621x8fb0427b.y8 D3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().D3(o72.x1.J(r2Var).f456941f);
        java.lang.String str = D3.f277891a;
        if (str == null || str.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavCardListItem", "parse possible friend msg failed");
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l(D3))) {
            jVar.f486337s.setVisibility(8);
        } else {
            jVar.f486337s.setText(l(D3));
        }
        jVar.f486338t.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cay);
        jVar.f486338t.setVisibility(0);
        android.widget.ImageView imageView = jVar.f486335q;
        java.lang.String str2 = D3.f277891a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str2, null);
        }
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        s82.j jVar = (s82.j) view.getTag();
        android.content.Context context = view.getContext();
        ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(context, jVar.f486307a, dq0Var);
    }

    public java.lang.String l(com.p314xaae8f345.mm.p2621x8fb0427b.y8 y8Var) {
        java.lang.String str = y8Var.f277893c;
        boolean z17 = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = y8Var.f277891a;
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.y3(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.E4(str)) {
                z17 = true;
            }
        }
        boolean z18 = (z17 || ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h(str)) ? z17 : true;
        int i17 = y8Var.f277907q;
        java.util.Set set = c01.e2.f118650a;
        return (z18 || com.p314xaae8f345.mm.p2621x8fb0427b.z3.D3(i17)) ? "" : str;
    }
}
