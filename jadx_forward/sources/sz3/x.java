package sz3;

/* loaded from: classes15.dex */
public final class x {
    public x(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final sz3.y a() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1 d1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240376a;
        java.lang.String str2 = wz3.e.f532310a;
        java.lang.String str3 = wz3.e.f532311b;
        if ((str2.length() > 0) && com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            if ((str3.length() > 0) && com.p314xaae8f345.mm.vfs.w6.j(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanFocusEngineInitModelParam", "getInitModelParam useXNet and model valid");
                sz3.y yVar = new sz3.y();
                yVar.f495691c = true;
                yVar.f495692d = true;
                yVar.f495689a = str2;
                yVar.f495690b = str3;
                return yVar;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanFocusEngineInitModelParam", "getInitModelParam useXNet and model invalid");
        sz3.y yVar2 = new sz3.y();
        yVar2.f495691c = true;
        yVar2.f495692d = false;
        return yVar2;
    }
}
