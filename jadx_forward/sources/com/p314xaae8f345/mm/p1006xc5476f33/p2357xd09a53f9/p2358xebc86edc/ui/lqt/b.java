package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final r45.de4 f259629d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f259630e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.c f259631f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.d f259632g;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.d dVar, android.content.Context context, r45.de4 de4Var, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.c cVar) {
        this.f259632g = dVar;
        this.f259630e = context;
        this.f259629d = de4Var;
        this.f259631f = cVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Context context;
        this.f259632g.f259661b = null;
        r45.de4 de4Var = this.f259629d;
        if (de4Var == null || (context = this.f259630e) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LqtDialogHelper", "LqtDialogBtn or context is null");
            return;
        }
        int i18 = de4Var.f453883e;
        if (i18 == 2) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(context, de4Var.f453884f, true);
        } else if (i18 == 3) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0(de4Var.f453885g, de4Var.f453886h, 0, 1061);
        } else if (i18 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtDialogHelper", "continue action");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtDialogHelper", "jump type not support native or none");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.c cVar = this.f259631f;
        if (cVar != null) {
            int i19 = de4Var.f453883e;
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.AnonymousClass42 anonymousClass42 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.g7) cVar).f259720a;
            if (i19 == 2 || i19 == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.this.f259591l1 = true;
            } else if (i19 == 4) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.this.f259586e.a();
            }
        }
    }
}
