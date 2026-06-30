package c01;

/* loaded from: classes15.dex */
public abstract class rc {
    public rc(c01.sc scVar, c01.fc fcVar) {
    }

    public abstract boolean a(c01.pb pbVar);

    public c01.pb b(int i17, java.lang.Object... objArr) {
        int i18 = 1;
        if (objArr != null && objArr.length > 0) {
            i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o1(objArr[0], 1);
        }
        c01.pb pbVar = new c01.pb();
        pbVar.f118912d = i17;
        pbVar.f118913e = "" + i18;
        pbVar.f118914f = 0L;
        return pbVar;
    }

    public void c(c01.pb pbVar, java.lang.Object... objArr) {
        int i17 = 1;
        if (objArr != null && objArr.length > 0) {
            i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o1(objArr[0], 1);
        }
        pbVar.f118913e = "" + (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(pbVar.f118913e, 0) + i17);
    }
}
