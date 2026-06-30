package s82;

/* loaded from: classes9.dex */
public class w extends s82.c {

    /* renamed from: f, reason: collision with root package name */
    public final int f486382f;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra raVar) {
        super(raVar);
        this.f486382f = i65.a.h(raVar.f182917a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561308ew);
    }

    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var) {
        android.view.View view2;
        s82.v vVar;
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            vVar = new s82.v();
            view2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.abb, null);
            a(view2, vVar, r2Var);
            vVar.f486378q = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.dum);
            vVar.f486379r = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.dwp);
            vVar.f486380s = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f565847du0);
            ((android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.dvy)).setVisibility(8);
            s82.c.h(vVar.f486378q, 11);
        } else {
            view2 = view;
            vVar = (s82.v) view.getTag();
        }
        g(vVar, r2Var);
        r45.aq0 aq0Var = r2Var.f67640x5ab01132.f452513y;
        android.widget.TextView textView = vVar.f486379r;
        java.lang.String str = aq0Var.f451721d;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        android.widget.TextView textView2 = vVar.f486380s;
        java.lang.String str2 = aq0Var.f451723f;
        textView2.setText(str2 != null ? str2 : "");
        vVar.f486379r.setSingleLine(false);
        vVar.f486379r.setMaxLines(2);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra raVar = this.f486272c;
        android.widget.ImageView imageView = vVar.f486378q;
        int bj6 = ((ot.g) ((pt.m0) i95.n0.c(pt.m0.class))).bj();
        int i17 = this.f486382f;
        raVar.c(imageView, null, r2Var, bj6, i17, i17);
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        s82.v vVar = (s82.v) view.getTag();
        android.content.Context context = view.getContext();
        ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(context, vVar.f486307a, dq0Var);
    }
}
