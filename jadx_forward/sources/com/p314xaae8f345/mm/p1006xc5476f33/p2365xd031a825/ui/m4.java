package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class m4 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.LayoutInflater f262023d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f262024e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21523x2cc1edc7 f262025f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f262026g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.g0 f262027h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.j4 f262028i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.k4 f262029m;

    public m4(android.content.Context context) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        this.f262023d = android.view.LayoutInflater.from(context);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d6f, (android.view.ViewGroup) null);
        this.f262024e = inflate;
        this.f262025f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21523x2cc1edc7) inflate.findViewById(com.p314xaae8f345.mm.R.id.pcb);
        this.f262026g = (android.widget.TextView) this.f262024e.findViewById(com.p314xaae8f345.mm.R.id.pc9);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.j4 j4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.j4(this);
        this.f262028i = j4Var;
        this.f262025f.setAdapter((android.widget.ListAdapter) j4Var);
        this.f262024e.findViewById(com.p314xaae8f345.mm.R.id.pc_).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.g4(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.m4 c(android.content.Context r16, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 r17, java.lang.String r18, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.k4 r19, android.content.DialogInterface.OnCancelListener r20) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.m4.c(android.content.Context, com.tencent.mm.plugin.wallet_core.model.Orders, java.lang.String, com.tencent.mm.plugin.wallet_core.ui.k4, android.content.DialogInterface$OnCancelListener):com.tencent.mm.plugin.wallet_core.ui.m4");
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            super.dismiss();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletFavorDialog", "dismiss exception, e = " + e17.getMessage());
        }
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f262024e);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.j4 j4Var;
        if (i17 == 4 && (j4Var = this.f262028i) != null) {
            at4.o0 o0Var = j4Var.f261891g;
            this.f262029m.a(this.f262027h.g(o0Var.a(o0Var.f95444c, -1)));
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z17) {
        super.setCancelable(z17);
        setCanceledOnTouchOutside(z17);
    }
}
