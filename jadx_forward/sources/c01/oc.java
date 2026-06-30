package c01;

/* loaded from: classes15.dex */
public class oc extends c01.rc {
    public oc(c01.sc scVar) {
        super(scVar, null);
    }

    @Override // c01.rc
    public boolean a(c01.pb pbVar) {
        if (java.lang.System.currentTimeMillis() - pbVar.f118914f <= 3600000 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(pbVar.f118913e, 0) <= 0) {
            return false;
        }
        c01.sc.b(pbVar.f118912d, pbVar.f118913e);
        pbVar.f118913e = "0";
        pbVar.f118914f = java.lang.System.currentTimeMillis();
        return true;
    }
}
