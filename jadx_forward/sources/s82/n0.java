package s82;

/* loaded from: classes9.dex */
public class n0 extends s82.c {

    /* renamed from: f, reason: collision with root package name */
    public final int f486353f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f486354g;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra raVar) {
        super(raVar);
        this.f486353f = i65.a.h(raVar.f182917a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561308ew);
        this.f486354g = "";
    }

    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var) {
        android.view.View view2;
        s82.m0 m0Var;
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            m0Var = new s82.m0();
            view2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.abb, null);
            a(view2, m0Var, r2Var);
            m0Var.f486346q = (com.p314xaae8f345.mm.ui.C21405x85fc1ce0) view2.findViewById(com.p314xaae8f345.mm.R.id.dum);
            m0Var.f486347r = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.dwp);
            m0Var.f486348s = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f565847du0);
            android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.dvy);
            m0Var.f486349t = textView;
            textView.setVisibility(0);
            s82.c.j(m0Var.f486347r, r2Var);
        } else {
            view2 = view;
            m0Var = (s82.m0) view.getTag();
        }
        g(m0Var, r2Var);
        r45.mq0 mq0Var = r2Var.f67640x5ab01132.C;
        if (mq0Var != null) {
            android.widget.TextView textView2 = m0Var.f486347r;
            java.lang.String str = mq0Var.f462268d;
            if (str == null) {
                str = "";
            }
            textView2.setText(str);
            android.widget.TextView textView3 = m0Var.f486348s;
            java.lang.String str2 = mq0Var.f462270f;
            textView3.setText(str2 != null ? str2 : "");
        } else {
            m0Var.f486347r.setText("");
            m0Var.f486348s.setText("");
        }
        android.widget.TextView textView4 = m0Var.f486349t;
        java.lang.String v17 = o72.x1.v(context, r2Var.f67640x5ab01132.f452495d.f459583w);
        if (v17 == null) {
            v17 = this.f486354g;
        }
        textView4.setText(v17);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra raVar = this.f486272c;
        com.p314xaae8f345.mm.ui.C21405x85fc1ce0 c21405x85fc1ce0 = m0Var.f486346q;
        int bj6 = ((ot.g) ((pt.m0) i95.n0.c(pt.m0.class))).bj();
        int i17 = this.f486353f;
        raVar.c(c21405x85fc1ce0, null, r2Var, bj6, i17, i17);
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        s82.m0 m0Var = (s82.m0) view.getTag();
        android.content.Context context = view.getContext();
        ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(context, m0Var.f486307a, dq0Var);
    }
}
