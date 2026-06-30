package s82;

/* loaded from: classes9.dex */
public class u extends s82.c {
    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var) {
        android.view.View view2;
        s82.t tVar;
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            tVar = new s82.t();
            view2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.abc, null);
            a(view2, tVar, r2Var);
            tVar.f486371q = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.dum);
            tVar.f486372r = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.dwp);
            tVar.f486373s = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f565848du3);
            s82.c.j(tVar.f486372r, r2Var);
        } else {
            view2 = view;
            tVar = (s82.t) view.getTag();
        }
        g(tVar, r2Var);
        tVar.f486371q.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563008bi4);
        r45.bq0 bq0Var = r2Var.f67640x5ab01132;
        r45.pp0 pp0Var = bq0Var.f452499h;
        java.lang.String str = bq0Var.f452503o;
        java.lang.String str2 = "";
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            android.widget.TextView textView = tVar.f486372r;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = tVar.f486372r.getContext();
            float textSize = tVar.f486372r.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context2, str, textSize));
            if (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.qa.c(l(pp0Var))) {
                tVar.f486373s.setText(l(pp0Var));
            } else {
                android.widget.TextView textView2 = tVar.f486373s;
                if (pp0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavBaseListItem", "getLabel but locItem is null");
                } else {
                    str2 = pp0Var.f464805m;
                }
                textView2.setText(str2);
            }
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.qa.c(l(pp0Var))) {
            tVar.f486372r.setText(l(pp0Var));
            android.widget.TextView textView3 = tVar.f486373s;
            if (pp0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavBaseListItem", "getLabel but locItem is null");
            } else {
                str2 = pp0Var.f464805m;
            }
            textView3.setText(str2);
        } else {
            android.widget.TextView textView4 = tVar.f486372r;
            if (pp0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavBaseListItem", "getLabel but locItem is null");
            } else {
                str2 = pp0Var.f464805m;
            }
            textView4.setText(str2);
            tVar.f486373s.setVisibility(8);
        }
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionLocation.k(view.getContext(), null)) {
            s82.t tVar = (s82.t) view.getTag();
            android.content.Context context = view.getContext();
            ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(context, tVar.f486307a, dq0Var);
        }
    }

    public final java.lang.String l(r45.pp0 pp0Var) {
        if (pp0Var != null) {
            return pp0Var.f464807o;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavBaseListItem", "getPoiname but locItem is null");
        return "";
    }
}
