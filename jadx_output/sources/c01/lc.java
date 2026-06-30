package c01;

/* loaded from: classes15.dex */
public class lc extends c01.rc {
    public lc(c01.sc scVar) {
        super(scVar, null);
    }

    @Override // c01.rc
    public boolean a(c01.pb pbVar) {
        if (java.lang.System.currentTimeMillis() - pbVar.f37381f <= 3600000 || pbVar.f37380e.length() <= 0) {
            return false;
        }
        c01.sc.b(pbVar.f37379d, pbVar.f37380e);
        pbVar.f37380e = "";
        pbVar.f37381f = java.lang.System.currentTimeMillis();
        return true;
    }

    @Override // c01.rc
    public c01.pb b(int i17, java.lang.Object... objArr) {
        c01.pb pbVar = new c01.pb();
        pbVar.f37379d = i17;
        if (objArr != null && objArr.length > 0) {
            pbVar.f37380e = "" + objArr[0];
        }
        pbVar.f37381f = 0L;
        return pbVar;
    }

    @Override // c01.rc
    public void c(c01.pb pbVar, java.lang.Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        pbVar.f37380e = "" + objArr[0];
    }
}
