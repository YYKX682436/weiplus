package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class v2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f146122d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10342x4f979a0c f146123e;

    public v2(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10342x4f979a0c activityC10342x4f979a0c) {
        this.f146123e = activityC10342x4f979a0c;
    }

    public java.lang.String a(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        java.lang.String z07;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var.w0())) {
            java.lang.String d17 = z3Var.d1();
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = this.f146123e.f145284i;
            z07 = a3Var == null ? null : a3Var.z0(d17);
        } else {
            z07 = z3Var.w0();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07)) {
            z07 = z3Var.w0();
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07) ? z3Var.f2() : z07;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.LinkedList) this.f146122d).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return ((java.util.LinkedList) this.f146122d).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p648x55baa833.ui.w2 w2Var;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10342x4f979a0c activityC10342x4f979a0c = this.f146123e;
        if (view == null) {
            view = android.view.View.inflate(activityC10342x4f979a0c, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569937sd, null);
            w2Var = new com.p314xaae8f345.mm.p648x55baa833.ui.w2(activityC10342x4f979a0c);
            w2Var.f146147a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.bgm);
            w2Var.f146148b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.bgn);
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.bgl);
            w2Var.f146149c = textView;
            textView.setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.u2(this));
            view.setTag(w2Var);
        } else {
            w2Var = (com.p314xaae8f345.mm.p648x55baa833.ui.w2) view.getTag();
        }
        w2Var.f146149c.setTag(java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) getItem(i17);
        java.lang.String a17 = a(z3Var);
        w2Var.f146148b.setText(a17);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = w2Var.f146148b.getTextSize();
        ((ke0.e) xVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(activityC10342x4f979a0c, a17, textSize);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(w2Var.f146147a, z3Var.d1(), null);
        return view;
    }
}
