package ja1;

/* loaded from: classes7.dex */
public class c implements com.p314xaae8f345.mm.tcp.p2626x32db76dc.b {
    @Override // com.p314xaae8f345.mm.tcp.p2626x32db76dc.b
    /* renamed from: loadLibrary */
    public void mo78211xeb57c8f5(java.lang.String str) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGame.MBLoadDelegateRegistryWC", "loadLibrary libName:%s", str);
            boolean z17 = ja1.e.f380136a;
            fp.d0.n(str);
        } catch (java.lang.UnsatisfiedLinkError e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WAGame.MBLoadDelegateRegistryWC", e17, "hy: link %s error!!", str);
            va1.f.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
    }
}
