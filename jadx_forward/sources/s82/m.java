package s82;

/* loaded from: classes9.dex */
public class m extends s82.c {
    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var) {
        android.view.View view2;
        s82.l lVar;
        java.lang.String O;
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            lVar = new s82.l();
            view2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.abc, null);
            a(view2, lVar, r2Var);
            lVar.f486342q = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.dum);
            lVar.f486343r = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.dwp);
            lVar.f486344s = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f565848du3);
        } else {
            view2 = view;
            lVar = (s82.l) view.getTag();
        }
        g(lVar, r2Var);
        r45.gp0 J2 = o72.x1.J(r2Var);
        java.lang.String str = r2Var.f67640x5ab01132.f452505q;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (r2Var.B1 && J2 != null)) {
            str = J2.f456937d;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            lVar.f486343r.setText("");
            lVar.f486344s.setText(o72.x1.O((float) J2.R));
        } else {
            int lastIndexOf = str.lastIndexOf(".");
            if (lastIndexOf != -1) {
                java.lang.String upperCase = str.substring(lastIndexOf + 1).toUpperCase();
                str = str.substring(0, lastIndexOf);
                O = upperCase + " " + o72.x1.O((float) J2.R);
            } else {
                O = o72.x1.O((float) J2.R);
            }
            lVar.f486343r.setText(str);
            lVar.f486344s.setText(O);
        }
        if (J2.X1 == 2) {
            lVar.f486344s.setText(">" + ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).vj() + "MB");
        }
        s82.c.j(lVar.f486343r, r2Var);
        android.widget.ImageView imageView = lVar.f486342q;
        java.lang.String str2 = J2.K;
        kk.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.f182997a;
        imageView.setImageResource(o25.y.a(str2));
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        o72.r2 r2Var = ((s82.l) view.getTag()).f486307a;
        ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(view.getContext(), r2Var, dq0Var);
    }
}
