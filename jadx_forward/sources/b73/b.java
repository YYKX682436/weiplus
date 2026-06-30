package b73;

/* loaded from: classes15.dex */
public class b implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b73.g f99734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b73.i f99735e;

    public b(b73.i iVar, b73.g gVar) {
        this.f99735e = iVar;
        this.f99734d = gVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        j6.c aVar;
        b73.g gVar = this.f99734d;
        b73.i iVar = this.f99735e;
        iVar.getClass();
        int i17 = j6.b.f379372d;
        if (iBinder == null) {
            aVar = null;
        } else {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof j6.c)) ? new j6.a(iBinder) : (j6.c) queryLocalInterface;
        }
        iVar.f99750b = aVar;
        java.lang.String packageName = iVar.f99749a.getPackageName();
        try {
            int j17 = ((j6.a) iVar.f99750b).j(3, packageName, "inapp");
            if (j17 != 0) {
                if (gVar != null) {
                    gVar.a(new b73.j(j17, "Error checking for billing v3 support."));
                }
            } else {
                ((j6.a) iVar.f99750b).j(3, packageName, "subs");
                iVar.f99752d = true;
                if (gVar != null) {
                    gVar.a(new b73.j(0, "Setup successful."));
                }
            }
        } catch (android.os.RemoteException e17) {
            if (gVar != null) {
                gVar.a(new b73.j(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15116xa552212a, "RemoteException while setting up in-app billing."));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.IabHelper", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        b73.i iVar = this.f99735e;
        iVar.getClass();
        iVar.f99750b = null;
    }
}
