package lz2;

/* loaded from: classes14.dex */
public class w implements android.content.DialogInterface.OnShowListener, android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.DialogC15522xdfb03a79 f403890d;

    /* renamed from: e, reason: collision with root package name */
    public pz2.a f403891e;

    /* renamed from: f, reason: collision with root package name */
    public lz2.a f403892f;

    /* renamed from: g, reason: collision with root package name */
    public int f403893g;

    /* renamed from: h, reason: collision with root package name */
    public int f403894h = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f403895i = false;

    /* renamed from: m, reason: collision with root package name */
    public final pz2.c f403896m = new lz2.t(this);

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.DialogC15522xdfb03a79 dialogC15522xdfb03a79, lz2.a aVar, android.os.Bundle bundle) {
        this.f403890d = dialogC15522xdfb03a79;
        this.f403892f = aVar;
        if (bundle != null) {
            this.f403893g = bundle.getInt("face_auth_scene");
        }
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletFaceIdDialog", "auth cancel");
        lz2.a aVar = this.f403892f;
        if (aVar != null) {
            aVar.mo11325x21a77981();
            this.f403892f = null;
        }
    }

    public final void b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletFaceIdDialog", "auth fail");
        lz2.a aVar = this.f403892f;
        if (aVar != null) {
            aVar.mo11326xfa7237e5(i17);
            this.f403892f = null;
        }
        this.f403890d.dismiss();
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletFaceIdDialog", "req faceid auth");
        pz2.a aVar = this.f403891e;
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletFaceIdDialog", "mgr is null");
            return;
        }
        aVar.mo148659x428ac225();
        if (!this.f403891e.a1()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletFaceIdDialog", "no faceid enrolled");
            b(-2);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mz2.d2.IML.f414644d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletFaceIdDialog", "no challenge");
            b(-3);
        } else {
            this.f403891e.Q7(this.f403896m, 3000, this.f403893g);
            com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.DialogC15522xdfb03a79 dialogC15522xdfb03a79 = this.f403890d;
            dialogC15522xdfb03a79.f218519d.a(com.p314xaae8f345.mm.R.C30861xcebc809e.f562991th, new lz2.s(dialogC15522xdfb03a79));
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        a();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletFaceIdDialog", "face id dialog dismiss");
        this.f403891e.mo148659x428ac225();
        if (this.f403893g == 1) {
            a();
        }
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletFaceIdDialog", "face id dialog show");
        this.f403891e = (pz2.a) gm0.j1.s(pz2.a.class);
        ju5.n.c().b();
        c();
    }
}
