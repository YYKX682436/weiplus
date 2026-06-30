package com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui;

/* loaded from: classes15.dex */
public class q0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f233732d;

    /* renamed from: e, reason: collision with root package name */
    public bb5.g f233733e = new bb5.g(15, new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.n0(this));

    /* renamed from: f, reason: collision with root package name */
    public bb5.e f233734f = null;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a f233735g;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a activityC16724xf2604f0a, android.content.Context context) {
        this.f233735g = activityC16724xf2604f0a;
        this.f233732d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f233735g.f233626m.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (r45.b64) ((java.util.LinkedList) this.f233735g.f233626m).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.r0 r0Var;
        if (this.f233734f == null) {
            this.f233734f = new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.o0(this);
        }
        bb5.g gVar = this.f233733e;
        if (gVar != null) {
            gVar.b(i17, this.f233734f);
        }
        android.content.Context context = this.f233732d;
        if (view == null) {
            r0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.r0();
            view2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.c68, null);
            r0Var.f233737a = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.k5r);
            r0Var.f233739c = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.k5u);
            r0Var.f233738b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.k5m);
            r0Var.f233740d = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.k5l);
            r0Var.f233741e = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.k5o);
            r0Var.f233742f = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.k5w);
            r0Var.f233743g = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.k5v);
            r0Var.f233745i = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.k5i);
            r0Var.f233746j = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.k5j);
            r0Var.f233747k = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.k5k);
            r0Var.f233748l = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2);
            android.view.ViewGroup.LayoutParams layoutParams = r0Var.f233743g.getLayoutParams();
            layoutParams.height = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.i_);
            layoutParams.width = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.i_);
            r0Var.f233743g.setLayoutParams(layoutParams);
            r0Var.f233744h = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.k5t);
            view2.setTag(r0Var);
        } else {
            view2 = view;
            r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.r0) view.getTag();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a activityC16724xf2604f0a = this.f233735g;
        r45.b64 b64Var = (r45.b64) ((java.util.LinkedList) activityC16724xf2604f0a.f233626m).get(i17);
        android.widget.TextView textView = r0Var.f233737a;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str = b64Var.f452084e;
        float textSize = r0Var.f233737a.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
        if (activityC16724xf2604f0a.f233629p == 1) {
            int i18 = b64Var.f452089m;
            if (i18 == 1) {
                r0Var.f233744h.setVisibility(0);
                r0Var.f233744h.setImageResource(com.p314xaae8f345.mm.R.raw.f79507xeac913cb);
                r0Var.f233744h.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574000gr0));
            } else if (i18 != 2) {
                r0Var.f233744h.setVisibility(8);
            } else {
                r0Var.f233744h.setVisibility(0);
                r0Var.f233744h.setImageResource(com.p314xaae8f345.mm.R.raw.f79506x511a318a);
                r0Var.f233744h.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cea));
            }
        } else {
            r0Var.f233744h.setVisibility(8);
        }
        if (b64Var.f452091o == 0 || c01.n8.b() == null) {
            r0Var.f233742f.setVisibility(8);
        } else {
            r0Var.f233742f.setVisibility(0);
            r0Var.f233742f.setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.j.a(((xf4.d) c01.n8.b()).b(b64Var.f452091o, true), 2.0f));
            r0Var.f233744h.setVisibility(8);
        }
        r0Var.f233738b.setText(b64Var.f452088i);
        r0Var.f233745i.setVisibility(8);
        r0Var.f233746j.setVisibility(8);
        r0Var.f233747k.setVisibility(8);
        r0Var.f233748l.setVisibility(8);
        if (b64Var instanceof an3.c) {
            java.util.LinkedList linkedList = ((an3.c) b64Var).F;
            if (linkedList != null && linkedList.size() == 1) {
                r0Var.f233745i.setVisibility(0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a.T6(activityC16724xf2604f0a, r0Var.f233745i, (java.lang.String) linkedList.get(0));
            } else if (linkedList != null && linkedList.size() == 2) {
                r0Var.f233745i.setVisibility(0);
                r0Var.f233746j.setVisibility(0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a.T6(activityC16724xf2604f0a, r0Var.f233745i, (java.lang.String) linkedList.get(0));
                com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a.T6(activityC16724xf2604f0a, r0Var.f233746j, (java.lang.String) linkedList.get(1));
            } else if (linkedList != null && linkedList.size() >= 3) {
                r0Var.f233745i.setVisibility(0);
                r0Var.f233746j.setVisibility(0);
                r0Var.f233747k.setVisibility(0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a.T6(activityC16724xf2604f0a, r0Var.f233745i, (java.lang.String) linkedList.get(0));
                com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a.T6(activityC16724xf2604f0a, r0Var.f233746j, (java.lang.String) linkedList.get(1));
                com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a.T6(activityC16724xf2604f0a, r0Var.f233747k, (java.lang.String) linkedList.get(2));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.l0) ((java.util.HashMap) activityC16724xf2604f0a.f233627n).get(b64Var.f452083d);
            if (l0Var != null) {
                int i19 = l0Var.f233707l;
                if (i19 == -1) {
                    i19 = 0;
                }
                l0Var.f233707l = i19;
                if (l0Var.f233698c > 0) {
                    r0Var.f233748l.setVisibility(0);
                }
            }
            r0Var.f233748l.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.p0(this, b64Var));
        }
        java.lang.String str2 = b64Var.f452087h;
        if (str2 == null || str2.trim().equals("")) {
            r0Var.f233739c.setVisibility(8);
        } else {
            r0Var.f233739c.setVisibility(0);
            android.widget.TextView textView2 = r0Var.f233739c;
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str3 = b64Var.f452087h;
            float textSize2 = r0Var.f233739c.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str3, textSize2));
        }
        r45.cb6 cb6Var = b64Var.f452099w;
        if (cb6Var == null || (cb6Var.f452961d & 1) <= 0) {
            r0Var.f233743g.setVisibility(8);
        } else {
            r0Var.f233743g.setVisibility(0);
        }
        if (b64Var.f452089m == 10000) {
            r0Var.f233740d.setImageBitmap(null);
            o11.f fVar = new o11.f();
            fVar.f423616g = g83.a.a();
            fVar.f423611b = true;
            fVar.f423628s = true;
            n11.a.b().h(b64Var.f452102z, r0Var.f233740d, fVar.a());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b64Var.f452094r)) {
                r0Var.f233741e.setVisibility(8);
            } else {
                r0Var.f233741e.setText(b64Var.f452094r);
                r0Var.f233741e.setVisibility(0);
            }
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(r0Var.f233740d, b64Var.f452083d, null);
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h(b64Var.f452083d)) {
                r0Var.f233741e.setVisibility(0);
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.D3(b64Var.f452091o)) {
                    r0Var.f233741e.setText(activityC16724xf2604f0a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574153h62));
                } else {
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 q17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(b64Var.f452083d);
                    if (q17 != null) {
                        android.widget.TextView textView3 = r0Var.f233737a;
                        le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                        java.lang.String g27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q17.g2()) ? b64Var.f452084e : q17.g2();
                        float textSize3 = r0Var.f233737a.getTextSize();
                        ((ke0.e) xVar3).getClass();
                        textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, g27, textSize3));
                    }
                    r0Var.f233741e.setText(activityC16724xf2604f0a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h67));
                }
            } else {
                r0Var.f233741e.setVisibility(8);
            }
        }
        return view2;
    }
}
