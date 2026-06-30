package t61;

/* loaded from: classes9.dex */
public class d implements fb5.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.p1012xd1075a44.C11381x88d3a085 f497520a;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.p1012xd1075a44.C11381x88d3a085 c11381x88d3a085) {
        this.f497520a = c11381x88d3a085;
    }

    @Override // fb5.l
    public android.view.View a(fb5.n nVar, android.view.View view, android.view.ViewGroup viewGroup, int i17, int i18, boolean z17, boolean z18) {
        t61.e eVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.p1012xd1075a44.C11381x88d3a085 c11381x88d3a085 = this.f497520a;
        if (view == null) {
            view = android.view.View.inflate(c11381x88d3a085.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.cde, null);
            eVar = new t61.e(c11381x88d3a085);
            eVar.f497521a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f566592ge4);
            eVar.f497522b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.get);
            eVar.f497523c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.bdd);
            eVar.f497524d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.geq);
            eVar.f497525e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f564245lv);
            eVar.f497526f = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.f564225lf);
        } else {
            eVar = (t61.e) view.getTag();
        }
        r61.y1 y1Var = (r61.y1) nVar.f342431b;
        eVar.f497527g = y1Var;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(eVar.f497521a, y1Var.f474533a.f67922xdd77ad16, null);
        android.widget.TextView textView = eVar.f497522b;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = view.getContext();
        java.lang.String str = y1Var.f474533a.f67923x21f9b213;
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str));
        com.p314xaae8f345.mm.p2621x8fb0427b.p7 p7Var = y1Var.f474534b;
        if (p7Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p7Var.f66491xbeb3161d)) {
            eVar.f497524d.setVisibility(8);
        } else {
            eVar.f497524d.setVisibility(0);
            android.widget.TextView textView2 = eVar.f497522b;
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = view.getContext();
            java.lang.String str2 = p7Var.f66491xbeb3161d;
            ((ke0.e) xVar2).getClass();
            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context2, str2));
        }
        if (c11381x88d3a085.f279405p && z17) {
            eVar.f497523c.setText(nVar.f342430a);
            eVar.f497523c.setVisibility(0);
        } else {
            eVar.f497523c.setVisibility(8);
        }
        if ((!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y1Var.f474533a.f67922xdd77ad16) && c01.e2.J(y1Var.f474533a.f67922xdd77ad16)) || (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y1Var.f474533a.f67929xdec927b) && c01.e2.J(y1Var.f474533a.f67929xdec927b))) {
            eVar.f497525e.setVisibility(0);
            eVar.f497525e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571539i8);
            eVar.f497526f.setVisibility(8);
        } else if (y1Var.f474533a.f67921xd370a215 == 1) {
            eVar.f497525e.setVisibility(0);
            eVar.f497525e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ffg);
            eVar.f497526f.setVisibility(8);
        } else {
            eVar.f497525e.setVisibility(8);
            eVar.f497526f.setVisibility(0);
            eVar.f497526f.setOnClickListener(new t61.c(this, eVar));
        }
        view.setTag(eVar);
        return view;
    }
}
