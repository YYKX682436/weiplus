package s82;

/* loaded from: classes9.dex */
public class g0 extends s82.c {

    /* renamed from: f, reason: collision with root package name */
    public final int f486323f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f486324g;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra raVar) {
        super(raVar);
        this.f486323f = i65.a.h(raVar.f182917a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561308ew);
        this.f486324g = raVar.f182917a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cbz);
    }

    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var) {
        android.view.View view2;
        s82.f0 f0Var;
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            f0Var = new s82.f0();
            view2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.abb, null);
            a(view2, f0Var, r2Var);
            f0Var.f486304q = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.dum);
            f0Var.f486305r = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.dwp);
            ((android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f565847du0)).setVisibility(8);
            android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.dvy);
            f0Var.f486306s = textView;
            textView.setVisibility(0);
            s82.c.h(f0Var.f486304q, 11);
        } else {
            view2 = view;
            f0Var = (s82.f0) view.getTag();
        }
        g(f0Var, r2Var);
        r45.aq0 aq0Var = r2Var.f67640x5ab01132.f452513y;
        android.widget.TextView textView2 = f0Var.f486305r;
        java.lang.String str = aq0Var.f451721d;
        if (str == null) {
            str = "";
        }
        textView2.setText(str);
        android.widget.TextView textView3 = f0Var.f486306s;
        java.lang.String v17 = o72.x1.v(context, r2Var.f67640x5ab01132.f452495d.f459583w);
        if (v17 == null) {
            v17 = this.f486324g;
        }
        textView3.setText(v17);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra raVar = this.f486272c;
        android.widget.ImageView imageView = f0Var.f486304q;
        int bj6 = ((ot.g) ((pt.m0) i95.n0.c(pt.m0.class))).bj();
        int i17 = this.f486323f;
        raVar.c(imageView, null, r2Var, bj6, i17, i17);
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        s82.f0 f0Var = (s82.f0) view.getTag();
        android.content.Context context = view.getContext();
        ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(context, f0Var.f486307a, dq0Var);
    }
}
