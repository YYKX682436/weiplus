package uh1;

/* loaded from: classes7.dex */
public final class d1 implements uh1.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uh1.c1 f509305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f509306b;

    public d1(uh1.c1 c1Var, int i17) {
        this.f509305a = c1Var;
        this.f509306b = i17;
    }

    @Override // uh1.p1
    public final void a(android.net.Network network) {
        java.io.FileDescriptor fileDescriptor;
        boolean z17 = false;
        uh1.c1 c1Var = this.f509305a;
        if (network == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindSocketToNetworkLogic", "bindSocketToWifi, network is null");
            ((yc1.l) c1Var).a(false);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindSocketToNetwork, socketFd: ");
        int i17 = this.f509306b;
        sb6.append(i17);
        sb6.append(", network: ");
        sb6.append(network);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindSocketToNetworkLogic", sb6.toString());
        uh1.z0 z0Var = uh1.z0.f509481b;
        z0Var.getClass();
        ((uh1.b1) z0Var.f509482a).getClass();
        java.lang.reflect.Field field = (java.lang.reflect.Field) ((jz5.n) uh1.b1.f509302b).mo141623x754a37bb();
        if (field != null) {
            try {
                fileDescriptor = new java.io.FileDescriptor();
                field.setInt(fileDescriptor, i17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BindSocketToNetworkApi23Ability", "set descriptorField fail since " + e17);
                fileDescriptor = null;
            }
            if (fileDescriptor != null) {
                try {
                    network.bindSocket(fileDescriptor);
                    z17 = true;
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BindSocketToNetworkApi23Ability", "bindSocket fail since " + e18);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindSocketToNetworkLogic", "bindSocketToWifi, bind: " + z17);
        ((yc1.l) c1Var).a(z17);
    }
}
