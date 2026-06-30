package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public class vc implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.g6 f166836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f166837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f166838f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc f166839g;

    public vc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc xcVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.g6 g6Var, java.lang.String str, java.lang.String str2) {
        this.f166839g = xcVar;
        this.f166836d = g6Var;
        this.f166837e = str;
        this.f166838f = str2;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeAppLauncher", "openBusinessViewByOpenSdk, user canceled");
        this.f166839g.f166953d = true;
        this.f166836d.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.z.b(null, this.f166837e, null, this.f166838f, -2);
    }
}
