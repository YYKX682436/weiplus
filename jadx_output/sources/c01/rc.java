package c01;

/* loaded from: classes15.dex */
public abstract class rc {
    public rc(c01.sc scVar, c01.fc fcVar) {
    }

    public abstract boolean a(c01.pb pbVar);

    public c01.pb b(int i17, java.lang.Object... objArr) {
        int i18 = 1;
        if (objArr != null && objArr.length > 0) {
            i18 = com.tencent.mm.sdk.platformtools.t8.o1(objArr[0], 1);
        }
        c01.pb pbVar = new c01.pb();
        pbVar.f37379d = i17;
        pbVar.f37380e = "" + i18;
        pbVar.f37381f = 0L;
        return pbVar;
    }

    public void c(c01.pb pbVar, java.lang.Object... objArr) {
        int i17 = 1;
        if (objArr != null && objArr.length > 0) {
            i17 = com.tencent.mm.sdk.platformtools.t8.o1(objArr[0], 1);
        }
        pbVar.f37380e = "" + (com.tencent.mm.sdk.platformtools.t8.P(pbVar.f37380e, 0) + i17);
    }
}
