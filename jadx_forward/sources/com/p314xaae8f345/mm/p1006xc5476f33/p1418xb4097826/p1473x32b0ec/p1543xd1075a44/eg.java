package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class eg extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gg f199782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f199783e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gg ggVar, int i17) {
        super(0);
        this.f199782d = ggVar;
        this.f199783e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gg ggVar = this.f199782d;
        android.content.Context context = ggVar.f199966n.getContext();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showWecoinNotEnoughDialog needCoin:");
        int i17 = this.f199783e;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFansJoinWidget", sb6.toString());
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
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
        if (i17 <= 0) {
            textView2.setVisibility(8);
            textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dib));
        } else {
            textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dia));
            textView2.setVisibility(0);
            textView2.setText(java.lang.String.valueOf(i17));
        }
        android.widget.Button button = (android.widget.Button) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.khs);
        android.widget.Button button2 = (android.widget.Button) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.b5i);
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bg(ggVar, k0Var));
        button2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cg(k0Var));
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dg(k0Var, c22646x1e9ca55);
        k0Var.e(true);
        k0Var.v();
        return jz5.f0.f384359a;
    }
}
