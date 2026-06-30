package or1;

/* loaded from: classes9.dex */
public class l0 implements fb5.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871 f429058a;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871 c12980x8e9ea871) {
        this.f429058a = c12980x8e9ea871;
    }

    @Override // fb5.l
    public android.view.View a(fb5.n nVar, android.view.View view, android.view.ViewGroup viewGroup, int i17, int i18, boolean z17, boolean z18) {
        or1.u0 u0Var;
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871 c12980x8e9ea871 = this.f429058a;
        android.content.Context context = c12980x8e9ea871.getContext();
        if (view == null) {
            view = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570274a92, (android.view.ViewGroup) null);
            u0Var = new or1.u0();
            u0Var.f429115e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.bdd);
            u0Var.f429114d = view.findViewById(com.p314xaae8f345.mm.R.id.cgr);
            u0Var.f429117g = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f564616w4);
            u0Var.f429116f = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.k9j);
            u0Var.f429118h = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.awx);
            u0Var.f429119i = view.findViewById(com.p314xaae8f345.mm.R.id.mkr);
            view.setTag(u0Var);
        } else {
            u0Var = (or1.u0) view.getTag();
        }
        r45.co coVar = (r45.co) nVar.f342431b;
        if (coVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandService.EnterpriseBizContactListView", "should not be empty");
            return view;
        }
        boolean F0 = coVar.f453211f.F0();
        if (!c12980x8e9ea871.f279405p || !z17) {
            u0Var.f429115e.setVisibility(8);
        } else if (nVar.f342430a.equals("!2")) {
            u0Var.f429115e.setText(c12980x8e9ea871.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c1m));
            u0Var.f429115e.setVisibility(0);
        } else if (nVar.f342430a.equals("!1")) {
            u0Var.f429115e.setVisibility(8);
        } else {
            u0Var.f429115e.setText(nVar.f342430a);
            u0Var.f429115e.setVisibility(0);
        }
        u0Var.f429113c = null;
        if (F0) {
            u0Var.f429111a = coVar.f453209d;
            u0Var.f429117g.setImageResource(com.p314xaae8f345.mm.R.raw.f79059x63f41def);
            java.lang.String string = c12980x8e9ea871.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572657c13);
            android.widget.TextView textView = u0Var.f429118h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871.h(c12980x8e9ea871, textView, context, string, (int) textView.getTextSize());
        } else {
            if (coVar instanceof or1.n0) {
                or1.n0 n0Var = (or1.n0) coVar;
                if (n0Var.f429074g) {
                    r45.d67 d67Var = n0Var.f429075h;
                    u0Var.f429113c = d67Var;
                    u0Var.f429112b = d67Var.f453720f;
                    n11.a.b().h(u0Var.f429112b, u0Var.f429117g, or1.v1.a(context, com.p314xaae8f345.mm.R.raw.f79059x63f41def));
                    android.widget.TextView textView2 = u0Var.f429118h;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871.h(c12980x8e9ea871, textView2, context, u0Var.f429113c.f453719e, (int) textView2.getTextSize());
                }
            }
            java.lang.String str = coVar.f453209d;
            u0Var.f429111a = str;
            u0Var.f429112b = coVar.f453211f.f66734xea1bd3d4;
            u0Var.f429117g.setTag(str);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(u0Var.f429117g, u0Var.f429111a, null);
            java.lang.String g27 = coVar.f453210e.g2();
            android.widget.TextView textView3 = u0Var.f429118h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871.h(c12980x8e9ea871, textView3, context, g27, (int) textView3.getTextSize());
        }
        int i19 = coVar.f453211f.f66745x10a0fed7;
        u0Var.f429116f.setVisibility(coVar.f453211f.f66745x10a0fed7 != 1 ? 8 : 0);
        if (c12980x8e9ea871.m79354xfb82a219() == 0 && z18) {
            u0Var.f429119i.setBackground(null);
        } else {
            u0Var.f429119i.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bfj);
        }
        if (c12980x8e9ea871.f279406q) {
            android.view.View view2 = u0Var.f429114d;
            view2.setPadding(view2.getPaddingLeft(), u0Var.f429114d.getPaddingTop(), (int) c12980x8e9ea871.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561094d), u0Var.f429114d.getPaddingBottom());
        } else {
            android.view.View view3 = u0Var.f429114d;
            view3.setPadding(view3.getPaddingLeft(), u0Var.f429114d.getPaddingTop(), (int) c12980x8e9ea871.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.i_), u0Var.f429114d.getPaddingBottom());
        }
        android.os.SystemClock.elapsedRealtime();
        return view;
    }
}
