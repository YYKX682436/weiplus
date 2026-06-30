package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class gz implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f200016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f200017e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200018f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rz f200019g;

    public gz(boolean z17, android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rz rzVar) {
        this.f200016d = z17;
        this.f200017e = context;
        this.f200018f = str;
        this.f200019g = rzVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "download game dialog ok isInstall:" + this.f200016d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3 b3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3.f183555a;
        java.lang.String str = this.f200018f;
        if (str == null) {
            str = "";
        }
        b3Var.c(this.f200017e, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rz rzVar = this.f200019g;
        if (rzVar != null) {
            rzVar.a(true);
        }
    }
}
