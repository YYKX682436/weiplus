package b73;

/* loaded from: classes15.dex */
public class b implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b73.g f18201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b73.i f18202e;

    public b(b73.i iVar, b73.g gVar) {
        this.f18202e = iVar;
        this.f18201d = gVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        j6.c aVar;
        b73.g gVar = this.f18201d;
        b73.i iVar = this.f18202e;
        iVar.getClass();
        int i17 = j6.b.f297839d;
        if (iBinder == null) {
            aVar = null;
        } else {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof j6.c)) ? new j6.a(iBinder) : (j6.c) queryLocalInterface;
        }
        iVar.f18217b = aVar;
        java.lang.String packageName = iVar.f18216a.getPackageName();
        try {
            int j17 = ((j6.a) iVar.f18217b).j(3, packageName, "inapp");
            if (j17 != 0) {
                if (gVar != null) {
                    gVar.a(new b73.j(j17, "Error checking for billing v3 support."));
                }
            } else {
                ((j6.a) iVar.f18217b).j(3, packageName, "subs");
                iVar.f18219d = true;
                if (gVar != null) {
                    gVar.a(new b73.j(0, "Setup successful."));
                }
            }
        } catch (android.os.RemoteException e17) {
            if (gVar != null) {
                gVar.a(new b73.j(com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMNOTFOUND, "RemoteException while setting up in-app billing."));
            }
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.IabHelper", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        b73.i iVar = this.f18202e;
        iVar.getClass();
        iVar.f18217b = null;
    }
}
