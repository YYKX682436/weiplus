package dn;

/* loaded from: classes4.dex */
public class j extends dn.m {
    public java.lang.String D1;
    public java.lang.String E1;
    public java.lang.String F1;
    public java.lang.String G1;
    public java.lang.String[] H1;
    public java.lang.String[] I1;
    public int J1;
    public int K1;
    public boolean L1;
    public java.lang.String M1;
    public java.lang.String N1;
    public java.lang.String O1 = "";
    public int P1 = -1;
    public int Q1 = 0;

    public j() {
        this.K = true;
    }

    public final java.lang.String k(java.lang.String[] strArr) {
        java.lang.String str = "";
        if (strArr != null && strArr.length != 0) {
            for (java.lang.String str2 : strArr) {
                str = str + str2 + ",";
            }
        }
        return str;
    }

    /* renamed from: toString */
    public java.lang.String mo125800x9616526c() {
        return java.lang.String.format("mediaId:%s, url:%s, host:%s, referer:%s, savepath:%s, iplist:%s, slaveIplist:%siplistSource:%d, dcSource:%d, isColdSnsData:%b, signalQuality:%s, snsScene:%s", this.f69601xaca5bdda, this.D1, this.E1, this.F1, this.G1, k(this.H1), k(this.I1), java.lang.Integer.valueOf(this.J1), java.lang.Integer.valueOf(this.K1), java.lang.Boolean.valueOf(this.L1), this.M1, this.N1);
    }
}
