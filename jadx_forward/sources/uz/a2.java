package uz;

@j95.b
/* loaded from: classes8.dex */
public class a2 extends i95.w implements vz.y1 {
    public java.lang.String Ai(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        try {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(e02.n.b(r6Var).array());
        } catch (e02.d unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("gamelog.ApkSignUtil", "APK : " + r6Var.o() + " not have apk signature block");
            return null;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("gamelog.ApkSignUtil", "containV2Signature, error: %s", e17.getMessage());
            return null;
        }
    }

    public java.lang.String wi(java.lang.String str) {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.f.a(str);
    }
}
