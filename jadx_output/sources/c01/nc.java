package c01;

/* loaded from: classes15.dex */
public class nc extends c01.rc {
    public nc(c01.sc scVar) {
        super(scVar, null);
    }

    @Override // c01.rc
    public boolean a(c01.pb pbVar) {
        if (java.lang.System.currentTimeMillis() - pbVar.f37381f <= 86400000 || com.tencent.mm.sdk.platformtools.t8.P(pbVar.f37380e, 0) <= 0) {
            return false;
        }
        c01.sc.b(pbVar.f37379d, "1");
        pbVar.f37380e = "0";
        pbVar.f37381f = java.lang.System.currentTimeMillis();
        return true;
    }
}
