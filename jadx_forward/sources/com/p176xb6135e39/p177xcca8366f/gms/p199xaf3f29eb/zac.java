package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb;

/* loaded from: classes13.dex */
final class zac implements android.content.DialogInterface.OnClickListener {
    final /* synthetic */ android.app.Activity zaa;
    final /* synthetic */ int zab;
    final /* synthetic */ p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c zac;
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc zad;

    public zac(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc c1705x2db7dcfc, android.app.Activity activity, int i17, p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c cVar) {
        this.zad = c1705x2db7dcfc;
        this.zaa = activity;
        this.zab = i17;
        this.zac = cVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        android.app.PendingIntent mo17627x6703115 = this.zad.mo17627x6703115(this.zaa, this.zab, 0);
        if (mo17627x6703115 == null) {
            return;
        }
        this.zac.a(new p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.C0061xc6e4d93e(mo17627x6703115.getIntentSender(), null, 0, 0), null);
    }
}
