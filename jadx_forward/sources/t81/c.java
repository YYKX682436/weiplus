package t81;

/* loaded from: classes7.dex */
public final class c extends dm.n9 implements qj1.d {
    public static final java.lang.String[] Y;
    public static final l75.e0 Z = dm.n9.m125344x3593deb(t81.c.class);

    static {
        java.lang.String[] strArr = {"appId", "type", "version", "packageKey", "packageType"};
        Y = strArr;
        java.lang.String str = " PRIMARY KEY ( ";
        for (java.lang.String str2 : strArr) {
            str = str + ", " + str2;
        }
        java.lang.String str3 = str.replaceFirst(",", "") + " )";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l75.e0 e0Var = Z;
        sb6.append(e0Var.f398489e);
        sb6.append(",");
        sb6.append(str3);
        e0Var.f398489e = sb6.toString();
    }

    @Override // dm.n9, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return Z;
    }

    @Override // qj1.d
    /* renamed from: getKeys */
    public java.lang.String[] mo49271xfb81966a() {
        return Y;
    }

    /* renamed from: toString */
    public java.lang.String m166001x9616526c() {
        return "CmdGetCodePersistentInfo{field_appId='" + this.f67698x28d45f97 + "', field_version=" + this.f67716x8987ca93 + ", field_type=" + this.f67715x2262335f + ", field_retryTimes=" + this.f67712x74b591e3 + ", field_retriedCount=" + this.f67710x17fc513d + ", field_retryInterval=" + this.f67711x33417908 + ", field_networkType=" + this.f67705xf813eec3 + ", field_pkgMd5='" + this.f67708xb05c6f7 + "', field_packageKey='" + this.f67706xbae6789e + "', field_packageType=" + this.f67707xa1ecfcdb + ", field_lastRetryTime=" + this.f67701xd252a11a + ", field_firstTimeTried=" + this.f67700xfc3d51d2 + ", field_reportId=" + this.f67709x44eeb14 + ", field_splitDownloadURLCgi=" + this.f67714x8221aa33 + ", field_scene=" + this.f67713x29cbf907 + ", field_cmdSequence=" + this.f67699x427bdb56 + '}';
    }
}
