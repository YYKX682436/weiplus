package dn;

/* loaded from: classes15.dex */
public abstract class e {
    public static dn.o a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        dn.o oVar = new dn.o();
        oVar.f69601xaca5bdda = str;
        oVar.f69591xf9dbbe9c = str3;
        oVar.f69575xf11df5f5 = str4;
        oVar.f69595x6d25b0d9 = str5;
        oVar.M1 = str2;
        oVar.f323344z = str2;
        oVar.f323324l1 = true;
        oVar.f323322h = 8;
        oVar.f69580x454032b6 = 8;
        oVar.f69592xf1ebe47b = 5;
        bw5.ei0 ei0Var = new bw5.ei0();
        ei0Var.f108462h = bw5.fi0.VIDEO;
        boolean[] zArr = ei0Var.f108463i;
        zArr[5] = true;
        ei0Var.f108458d = str6;
        zArr[1] = true;
        ei0Var.f108459e = "index.m3u8";
        zArr[2] = true;
        try {
            oVar.P = ei0Var.mo14344x5f01b1f6();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TaskInfoCreator", "buildRequestTask failed. %s", e17.getMessage());
        }
        return oVar;
    }

    public static dn.o b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        dn.o oVar = new dn.o();
        oVar.f69601xaca5bdda = str;
        oVar.f69591xf9dbbe9c = str2;
        oVar.f69575xf11df5f5 = str3;
        oVar.f69595x6d25b0d9 = str4;
        oVar.M1 = "master.m3u8";
        oVar.f323344z = "master.m3u8";
        oVar.f323322h = 8;
        oVar.f69580x454032b6 = 8;
        oVar.f69592xf1ebe47b = 5;
        bw5.ei0 ei0Var = new bw5.ei0();
        ei0Var.f108462h = bw5.fi0.VIDEO;
        boolean[] zArr = ei0Var.f108463i;
        zArr[5] = true;
        ei0Var.f108458d = str5;
        zArr[1] = true;
        ei0Var.f108459e = "index.m3u8";
        zArr[2] = true;
        try {
            oVar.P = ei0Var.mo14344x5f01b1f6();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TaskInfoCreator", "buildRequestTask failed. %s", e17.getMessage());
        }
        return oVar;
    }
}
