package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes4.dex */
public class d4 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f288193d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f288194e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f288195f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f288196g;

    public d4(android.content.Context context, java.util.List list, java.util.List list2, boolean z17) {
        this.f288194e = list;
        this.f288193d = context;
        this.f288196g = z17;
        this.f288195f = list2;
    }

    public int a() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bim;
    }

    public int c(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        return ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(z3Var.d1());
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f288194e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f288194e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        com.p314xaae8f345.mm.ui.p2690x38b72420.k4 k4Var;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) this.f288194e.get(i17);
        android.content.Context context = this.f288193d;
        if (view == null) {
            k4Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.k4();
            view2 = android.view.View.inflate(context, a(), null);
            k4Var.f288523b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.gtx);
            k4Var.f288522a = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.gtz);
            k4Var.f288524c = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.gtw);
            k4Var.f288525d = (android.widget.CheckBox) view2.findViewById(com.p314xaae8f345.mm.R.id.mie);
            k4Var.f288526e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view2.findViewById(com.p314xaae8f345.mm.R.id.gty);
            view2.setTag(k4Var);
        } else {
            view2 = view;
            k4Var = (com.p314xaae8f345.mm.ui.p2690x38b72420.k4) view.getTag();
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(k4Var.f288524c, z3Var.d1(), null);
        android.widget.TextView textView = k4Var.f288522a;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String d17 = z3Var.d1();
        ((sg3.a) v0Var).getClass();
        textView.setText(((ke0.e) xVar).bj(context, c01.a2.e(d17), i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia)));
        k4Var.f288523b.setText("(" + c(z3Var) + ")");
        if (c01.e2.R(z3Var.d1())) {
            android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80791xd2795aeb);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            k4Var.f288522a.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawable, (android.graphics.drawable.Drawable) null);
        } else {
            k4Var.f288522a.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        }
        if (this.f288196g) {
            k4Var.f288525d.setVisibility(0);
            if (this.f288195f.contains(z3Var.d1())) {
                k4Var.f288525d.setChecked(true);
            } else {
                k4Var.f288525d.setChecked(false);
            }
        }
        return view2;
    }
}
