package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class BackupMigrationReportStruct extends jx3.a {
    public BackupMigrationReportStruct() {
        j("Type", 0);
        j("PairDevice", 0);
        j("Action", 0);
        j("Status", 0);
        j("CostTime", 0);
        j("Size", 0);
        j("SessionID", "");
        j("Size2", 0);
        j("Size3", 0);
    }

    @Override // jx3.a
    public int g() {
        return 26824;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(f("Type"));
        stringBuffer.append(",");
        stringBuffer.append(f("PairDevice"));
        stringBuffer.append(",");
        stringBuffer.append(f("Action"));
        stringBuffer.append(",");
        stringBuffer.append(f("Status"));
        stringBuffer.append(",");
        stringBuffer.append(f("CostTime"));
        stringBuffer.append(",");
        stringBuffer.append(f("Size"));
        stringBuffer.append(",");
        stringBuffer.append(f("SessionID"));
        stringBuffer.append(",");
        stringBuffer.append(f("Size2"));
        stringBuffer.append(",");
        stringBuffer.append(f("Size3"));
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Type:");
        stringBuffer.append(f("Type"));
        stringBuffer.append("\r\nPairDevice:");
        stringBuffer.append(f("PairDevice"));
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(f("Action"));
        stringBuffer.append("\r\nStatus:");
        stringBuffer.append(f("Status"));
        stringBuffer.append("\r\nCostTime:");
        stringBuffer.append(f("CostTime"));
        stringBuffer.append("\r\nSize:");
        stringBuffer.append(f("Size"));
        stringBuffer.append("\r\nSessionID:");
        stringBuffer.append(f("SessionID"));
        stringBuffer.append("\r\nSize2:");
        stringBuffer.append(f("Size2"));
        stringBuffer.append("\r\nSize3:");
        stringBuffer.append(f("Size3"));
        return stringBuffer.toString();
    }
}
