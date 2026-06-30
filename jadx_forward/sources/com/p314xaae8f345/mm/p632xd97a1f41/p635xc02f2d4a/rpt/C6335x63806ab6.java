package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.BackupTransferReportStruct */
/* loaded from: classes4.dex */
public final class C6335x63806ab6 extends jx3.a {
    public C6335x63806ab6() {
        j("prepareTime", 0);
        j("transTime", 0);
        j("importTime", 0);
        j("transSpeed", 0);
        j("mediaSize", 0);
        j("mediaCount", 0);
        j("msgCount", 0);
        j("totalSize", 0);
        j("originDBSize", 0);
        j("packTime", 0);
        j("readDBTime", 0);
        j("error", 0);
    }

    @Override // jx3.a
    public int g() {
        return 26800;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(f("prepareTime"));
        stringBuffer.append(",");
        stringBuffer.append(f("transTime"));
        stringBuffer.append(",");
        stringBuffer.append(f("importTime"));
        stringBuffer.append(",");
        stringBuffer.append(f("transSpeed"));
        stringBuffer.append(",");
        stringBuffer.append(f("mediaSize"));
        stringBuffer.append(",");
        stringBuffer.append(f("mediaCount"));
        stringBuffer.append(",");
        stringBuffer.append(f("msgCount"));
        stringBuffer.append(",");
        stringBuffer.append(f("totalSize"));
        stringBuffer.append(",");
        stringBuffer.append(f("originDBSize"));
        stringBuffer.append(",");
        stringBuffer.append(f("packTime"));
        stringBuffer.append(",");
        stringBuffer.append(f("readDBTime"));
        stringBuffer.append(",");
        stringBuffer.append(f("error"));
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("prepareTime:");
        stringBuffer.append(f("prepareTime"));
        stringBuffer.append("\r\ntransTime:");
        stringBuffer.append(f("transTime"));
        stringBuffer.append("\r\nimportTime:");
        stringBuffer.append(f("importTime"));
        stringBuffer.append("\r\ntransSpeed:");
        stringBuffer.append(f("transSpeed"));
        stringBuffer.append("\r\nmediaSize:");
        stringBuffer.append(f("mediaSize"));
        stringBuffer.append("\r\nmediaCount:");
        stringBuffer.append(f("mediaCount"));
        stringBuffer.append("\r\nmsgCount:");
        stringBuffer.append(f("msgCount"));
        stringBuffer.append("\r\ntotalSize:");
        stringBuffer.append(f("totalSize"));
        stringBuffer.append("\r\noriginDBSize:");
        stringBuffer.append(f("originDBSize"));
        stringBuffer.append("\r\npackTime:");
        stringBuffer.append(f("packTime"));
        stringBuffer.append("\r\nreadDBTime:");
        stringBuffer.append(f("readDBTime"));
        stringBuffer.append("\r\nerror:");
        stringBuffer.append(f("error"));
        return stringBuffer.toString();
    }
}
