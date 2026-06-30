package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes15.dex */
public class l1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f267156d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f267157e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.c36 f267158f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19318x97abd302 f267159g;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19318x97abd302 activityC19318x97abd302, android.content.Context context, java.util.LinkedList linkedList, r45.xv5 xv5Var) {
        this.f267159g = activityC19318x97abd302;
        android.view.LayoutInflater.from(context);
        this.f267156d = linkedList;
        this.f267157e = linkedList;
        r45.c36 c36Var = new r45.c36();
        this.f267158f = c36Var;
        c36Var.f452789e = activityC19318x97abd302.f265198w;
        java.util.LinkedList linkedList2 = activityC19318x97abd302.f265197v;
        c36Var.f452788d = linkedList2;
        activityC19318x97abd302.f265196u = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.e1(context, activityC19318x97abd302.f265199x.f451850e.f473947d, linkedList2);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.cih, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.mcw);
        textView.getPaint().setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        textView.getPaint().setStrokeWidth(0.8f);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.e1 e1Var = activityC19318x97abd302.f265196u;
        e1Var.f265647a.t(inflate);
        e1Var.f265651e = inflate;
        activityC19318x97abd302.f265196u.f265654h.mo7806x9d92d11c((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.j1(this, activityC19318x97abd302));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f267157e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.m1 m1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.m1) k3Var;
        r45.h04 h04Var = (r45.h04) this.f267157e.get(i17);
        m1Var.f267205e.setText(h04Var.f457243e);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h04Var.f457244f);
        android.widget.TextView textView = m1Var.f267207g;
        if (K0) {
            textView.setVisibility(8);
        } else {
            textView.setText(h04Var.f457244f);
        }
        m1Var.f267204d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.k1(this, i17));
        for (int i18 = 0; i18 < ((r45.h04) this.f267157e.get(i17)).f457246h.size(); i18++) {
            int i19 = ((r45.yv6) this.f267158f.f452788d.get(i17)).f472962e;
            r45.f14 f14Var = (r45.f14) ((r45.h04) this.f267157e.get(i17)).f457246h.get(i18);
            if (f14Var.f455459d == i19) {
                m1Var.f267206f.setText(f14Var.f455460e);
                return;
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19318x97abd302 activityC19318x97abd302 = this.f267159g;
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.m1(activityC19318x97abd302, com.p314xaae8f345.mm.ui.id.b(activityC19318x97abd302.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cij, viewGroup, false));
    }
}
