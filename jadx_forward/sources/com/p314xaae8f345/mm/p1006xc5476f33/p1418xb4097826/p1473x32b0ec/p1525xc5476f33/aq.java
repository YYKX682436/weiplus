package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class aq extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq f193461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f193462e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ce2.i f193463f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f193464g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f193465h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq dqVar, java.lang.String str, ce2.i iVar, int i17, long j17) {
        super(0);
        this.f193461d = dqVar;
        this.f193462e = str;
        this.f193463f = iVar;
        this.f193464g = i17;
        this.f193465h = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq dqVar = this.f193461d;
        dqVar.C1();
        android.content.Context context = dqVar.f446856d.getContext();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showWecoinNotEnoughDialog comboId:");
        java.lang.String str = this.f193462e;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftSendPlugin", sb6.toString());
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = dqVar.U;
        if ((k0Var != null && k0Var.i()) || zl2.r4.R1(zl2.r4.f555483a, this.f193462e, dqVar.T, false, 4, null)) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("showWecoinNotEnoughDialog isShowing:");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = dqVar.U;
            sb7.append(k0Var2 != null ? java.lang.Boolean.valueOf(k0Var2.i()) : null);
            sb7.append(",notEnoughWecoinComboId:");
            sb7.append(dqVar.T);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftSendPlugin", sb7.toString());
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
            android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570475aw1, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) inflate;
            c22646x1e9ca55.b(com.p314xaae8f345.mm.ui.zk.a(context, 12), com.p314xaae8f345.mm.ui.zk.a(context, 12), 0.0f, 0.0f);
            android.widget.TextView textView = (android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.g4e);
            android.widget.TextView textView2 = (android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.f565984eb4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
            com.p314xaae8f345.mm.ui.fk.a(textView);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
            com.p314xaae8f345.mm.ui.fk.a(textView2);
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
            ce2.i iVar = this.f193463f;
            if (iVar == null) {
                textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dib));
                textView2.setVisibility(8);
            } else {
                float P0 = iVar.P0() * this.f193464g;
                long j17 = this.f193465h;
                if (j17 < 0) {
                    j17 = 0;
                }
                int i17 = (int) (P0 - ((float) j17));
                f0Var.f391649d = i17;
                if (i17 <= 0) {
                    textView2.setVisibility(8);
                    textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dib));
                } else {
                    textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dia));
                    textView2.setVisibility(0);
                    textView2.setText(java.lang.String.valueOf(f0Var.f391649d));
                }
            }
            android.widget.Button button = (android.widget.Button) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.khs);
            android.widget.Button button2 = (android.widget.Button) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.b5i);
            button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xp(dqVar, context, f0Var, k0Var3));
            button2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yp(k0Var3));
            k0Var3.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zp(k0Var3, c22646x1e9ca55);
            k0Var3.e(true);
            k0Var3.v();
            dqVar.U = k0Var3;
            dqVar.T = str;
        }
        return jz5.f0.f384359a;
    }
}
