package ju3;

/* loaded from: classes10.dex */
public final class d1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17020xf8b8139d f383462d;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17020xf8b8139d c17020xf8b8139d) {
        this.f383462d = c17020xf8b8139d;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaTabCameraKitPluginLayout", "onRequestPermissionsResult: click jump");
        dialogInterface.dismiss();
        this.f383462d.S = true;
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
    }
}
