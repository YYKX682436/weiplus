package yc1;

@j95.b
/* loaded from: classes7.dex */
public class g0 extends i95.w implements qe.g0 {
    public boolean wi() {
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.i().getString("appbrandgame_open_nativelibuv", "");
        if (!((string == null || !string.equalsIgnoreCase("close")) ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE).booleanValue()) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.NativeInstallHelperSwitchDelegateImpl", "use libuv Command close");
        return false;
    }
}
