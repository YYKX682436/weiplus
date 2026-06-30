package com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui;

/* loaded from: classes9.dex */
public class r extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f236752d = null;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.p f236753e = null;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f236754f = new java.util.ArrayList(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1((java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PHONE_RECHARGE_RECOMMENDED_LIST_STRING_SYNC, ""), ","));

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.ArrayList arrayList = this.f236752d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f236752d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.q qVar;
        vr4.b1 b1Var = (vr4.b1) getItem(i17);
        if (view == null) {
            view = com.p314xaae8f345.mm.ui.id.b(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ccs, viewGroup, false);
            qVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.q(this, null);
            qVar.f236748b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
            qVar.f236747a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.k3f);
            qVar.f236749c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.l6f);
            qVar.f236750d = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f568093lo4);
            view.setTag(qVar);
        } else {
            qVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.q) view.getTag();
        }
        qVar.f236747a.setText(b1Var.f521224e);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b1Var.f521225f)) {
            qVar.f236748b.setVisibility(8);
        } else {
            qVar.f236748b.setVisibility(0);
            qVar.f236748b.setText(b1Var.f521225f);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b1Var.f521230n)) {
            qVar.f236749c.setVisibility(8);
        } else {
            qVar.f236749c.setVisibility(0);
            qVar.f236749c.setText(b1Var.f521230n);
        }
        if (b1Var.f521226g == 1) {
            view.setEnabled(true);
            qVar.f236748b.setEnabled(true);
            qVar.f236747a.setEnabled(true);
        } else {
            view.setEnabled(false);
            qVar.f236748b.setEnabled(false);
            qVar.f236747a.setEnabled(false);
        }
        if (b1Var.f521236t != 1 || ((java.util.ArrayList) this.f236754f).contains(b1Var.f521237u)) {
            qVar.f236750d.setVisibility(8);
        } else {
            qVar.f236750d.setVisibility(0);
        }
        if (b1Var.f521228i == 1 && b1Var.f521231o.equals("1") && !b1Var.f521232p.equals("0")) {
            android.content.Context context = viewGroup.getContext();
            int b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.b(b1Var.f521232p, false);
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(i65.a.b(context, 2));
            gradientDrawable.setColor(b17);
            android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setCornerRadius(i65.a.b(context, 2));
            gradientDrawable2.setStroke(2, i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29));
            android.graphics.drawable.GradientDrawable gradientDrawable3 = new android.graphics.drawable.GradientDrawable();
            gradientDrawable3.setShape(0);
            gradientDrawable3.setCornerRadius(i65.a.b(context, 2));
            gradientDrawable3.setColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.a2d));
            gradientDrawable3.setStroke(2, b17);
            android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable);
            stateListDrawable.addState(new int[]{-16842910}, gradientDrawable2);
            stateListDrawable.addState(new int[0], gradientDrawable3);
            android.content.Context context2 = viewGroup.getContext();
            android.content.res.ColorStateList colorStateList = new android.content.res.ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[]{-16842910}, new int[0]}, new int[]{i65.a.d(context2, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw), i65.a.d(context2, com.p314xaae8f345.mm.R.C30859x5a72f63.a2b), com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.b(b1Var.f521232p, false)});
            qVar.f236748b.setTextColor(colorStateList);
            qVar.f236747a.setTextColor(colorStateList);
            view.setBackground(stateListDrawable);
        }
        view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.o(this, b1Var, qVar));
        return view;
    }
}
