package tl;

/* loaded from: classes3.dex */
public abstract class g0 {
    public static int a(java.lang.String str, int i17) {
        try {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(str), i17);
        } catch (java.lang.Error unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecorderSwitch", "error on parseInt failed, key: " + str);
            return i17;
        } catch (java.lang.Exception unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecorderSwitch", "getIntValFromDynamicConfig parseInt failed, key: " + str);
            return i17;
        }
    }
}
