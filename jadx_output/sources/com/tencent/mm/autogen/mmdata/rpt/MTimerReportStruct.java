package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class MTimerReportStruct extends jx3.a {
    public MTimerReportStruct() {
        j("initOfflineTask", "");
        j("setTask", "");
        j("unsetTask", "");
        j("executeTask", "");
        j("executeTaskTime", 0);
        j(dm.i4.COL_UPDATETIME, "");
    }

    @Override // jx3.a
    public int g() {
        return 25357;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(f("initOfflineTask"));
        stringBuffer.append(",");
        stringBuffer.append(f("setTask"));
        stringBuffer.append(",");
        stringBuffer.append(f("unsetTask"));
        stringBuffer.append(",");
        stringBuffer.append(f("executeTask"));
        stringBuffer.append(",");
        stringBuffer.append(f("executeTaskTime"));
        stringBuffer.append(",");
        stringBuffer.append(f(dm.i4.COL_UPDATETIME));
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("initOfflineTask:");
        stringBuffer.append(f("initOfflineTask"));
        stringBuffer.append("\r\nsetTask:");
        stringBuffer.append(f("setTask"));
        stringBuffer.append("\r\nunsetTask:");
        stringBuffer.append(f("unsetTask"));
        stringBuffer.append("\r\nexecuteTask:");
        stringBuffer.append(f("executeTask"));
        stringBuffer.append("\r\nexecuteTaskTime:");
        stringBuffer.append(f("executeTaskTime"));
        stringBuffer.append("\r\nupdateTime:");
        stringBuffer.append(f(dm.i4.COL_UPDATETIME));
        return stringBuffer.toString();
    }
}
