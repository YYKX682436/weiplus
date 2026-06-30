package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class b4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f199353a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oo0 f199354b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f199355c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f199356d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f199357e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f199358f;

    /* renamed from: g, reason: collision with root package name */
    public c50.m0 f199359g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f199360h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f199361i;

    public b4(android.view.ViewGroup root, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oo0 plugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        this.f199353a = root;
        this.f199354b = plugin;
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.f566279fe4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f199355c = findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.fur);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f199356d = findViewById2;
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.rok);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f199357e = findViewById3;
        android.view.View findViewById4 = root.findViewById(com.p314xaae8f345.mm.R.id.f566352tp2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f199358f = findViewById4;
    }

    public static final void a(r45.h32 h32Var, android.widget.TextView textView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b4 b4Var) {
        if (h32Var.m75939xb282bd08(1) == 1) {
            textView.setText(b4Var.f199353a.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cs6));
            android.view.ViewGroup viewGroup = b4Var.f199353a;
            textView.setTextColor(viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77913xe61cad94));
            textView.setBackground(viewGroup.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a_5));
            return;
        }
        textView.setText(b4Var.f199353a.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cs7));
        android.view.ViewGroup viewGroup2 = b4Var.f199353a;
        textView.setTextColor(viewGroup2.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b));
        textView.setBackground(viewGroup2.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563217zz));
    }

    public final void b(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, ml2.x1 x1Var, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b4 b4Var;
        org.json.JSONObject jSONObject2;
        if (jSONObject == null) {
            jSONObject2 = new org.json.JSONObject();
            b4Var = this;
        } else {
            b4Var = this;
            jSONObject2 = jSONObject;
        }
        jSONObject2.put("liveid", pm0.v.u(b4Var.f199354b.Y().f492192n.m75942xfb822ef2(0)));
        jSONObject2.put("exposeType", 1);
        java.lang.String jSONObject3 = jSONObject2.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAfterNextLiveInfoWidget", "abel end page log, 21053, action=" + x1Var.f409753d + ", extra=" + jSONObject3);
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        java.lang.String m76836x6c03c64c = c19792x256d2725.m76836x6c03c64c();
        java.lang.String valueOf = java.lang.String.valueOf(c19792x256d2725.m76824xa52af937());
        long m76824xa52af937 = c19792x256d2725.m76824xa52af937();
        r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
        long m75942xfb822ef2 = m76794xd0557130 != null ? m76794xd0557130.m75942xfb822ef2(0) : 0L;
        ml2.q1 q1Var = ml2.q1.f409345e;
        r45.nw1 m76794xd05571302 = c19792x256d2725.m76794xd0557130();
        int m75939xb282bd08 = m76794xd05571302 != null ? m76794xd05571302.m75939xb282bd08(1) : -1;
        java.lang.String m76801x8010e5e4 = c19792x256d2725.m76801x8010e5e4();
        if (m76801x8010e5e4 == null) {
            m76801x8010e5e4 = "";
        }
        ((b92.d1) zbVar).wi(new ml2.f0(null, m76836x6c03c64c, 0, valueOf, m76824xa52af937, m75942xfb822ef2, x1Var, "temp_30", m75939xb282bd08, m76801x8010e5e4, ml2.e0.f408904f, false, false, 0, null, null, jSONObject3, null, 1L, null, 0, 0L, 0, null, null, null, 66777088, null));
    }

    public final void c(int i17) {
        android.view.ViewGroup viewGroup = this.f199353a;
        viewGroup.setVisibility(i17);
        android.content.Context context = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((pl2.x) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(pl2.x.class)).f438216f) {
            viewGroup.setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x03e4, code lost:
    
        if (r3 == null) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(r45.h32 r49, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 r50, boolean r51, r45.l71 r52, r45.fw4 r53) {
        /*
            Method dump skipped, instructions count: 2002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b4.d(r45.h32, com.tencent.mm.protocal.protobuf.FinderObject, boolean, r45.l71, r45.fw4):boolean");
    }
}
