package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class SnsTemplateReportStruct extends jx3.a {
    public SnsTemplateReportStruct() {
        j(ya.b.SOURCE, 0);
        j("sessionID", "");
        j("mediadetail", "");
        j("egviewcnt", 0);
        j("egpreviewcnt", 0);
        j("egendcnt", 0);
        j("musiccnt", 0);
        j("egdetail", "");
        j("editdetail", "");
        j("moreAction", 0);
        j("installMiaojian", 0);
        j("miaojiansheet", 0);
        j("final_egid", "");
        j("final_musicid", "");
        j("final_musictype", 0);
        j("goToMJAppResult", 0);
    }

    @Override // jx3.a
    public int g() {
        return 25245;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(f(ya.b.SOURCE));
        stringBuffer.append(",");
        stringBuffer.append(f("sessionID"));
        stringBuffer.append(",");
        stringBuffer.append(f("mediadetail"));
        stringBuffer.append(",");
        stringBuffer.append(f("egviewcnt"));
        stringBuffer.append(",");
        stringBuffer.append(f("egpreviewcnt"));
        stringBuffer.append(",");
        stringBuffer.append(f("egendcnt"));
        stringBuffer.append(",");
        stringBuffer.append(f("musiccnt"));
        stringBuffer.append(",");
        stringBuffer.append(f("egdetail"));
        stringBuffer.append(",");
        stringBuffer.append(f("editdetail"));
        stringBuffer.append(",");
        stringBuffer.append(f("moreAction"));
        stringBuffer.append(",");
        stringBuffer.append(f("installMiaojian"));
        stringBuffer.append(",");
        stringBuffer.append(f("miaojiansheet"));
        stringBuffer.append(",");
        stringBuffer.append(f("final_egid"));
        stringBuffer.append(",");
        stringBuffer.append(f("final_musicid"));
        stringBuffer.append(",");
        stringBuffer.append(f("final_musictype"));
        stringBuffer.append(",");
        stringBuffer.append(f("goToMJAppResult"));
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("source:");
        stringBuffer.append(f(ya.b.SOURCE));
        stringBuffer.append("\r\nsessionID:");
        stringBuffer.append(f("sessionID"));
        stringBuffer.append("\r\nmediadetail:");
        stringBuffer.append(f("mediadetail"));
        stringBuffer.append("\r\negviewcnt:");
        stringBuffer.append(f("egviewcnt"));
        stringBuffer.append("\r\negpreviewcnt:");
        stringBuffer.append(f("egpreviewcnt"));
        stringBuffer.append("\r\negendcnt:");
        stringBuffer.append(f("egendcnt"));
        stringBuffer.append("\r\nmusiccnt:");
        stringBuffer.append(f("musiccnt"));
        stringBuffer.append("\r\negdetail:");
        stringBuffer.append(f("egdetail"));
        stringBuffer.append("\r\neditdetail:");
        stringBuffer.append(f("editdetail"));
        stringBuffer.append("\r\nmoreAction:");
        stringBuffer.append(f("moreAction"));
        stringBuffer.append("\r\ninstallMiaojian:");
        stringBuffer.append(f("installMiaojian"));
        stringBuffer.append("\r\nmiaojiansheet:");
        stringBuffer.append(f("miaojiansheet"));
        stringBuffer.append("\r\nfinal_egid:");
        stringBuffer.append(f("final_egid"));
        stringBuffer.append("\r\nfinal_musicid:");
        stringBuffer.append(f("final_musicid"));
        stringBuffer.append("\r\nfinal_musictype:");
        stringBuffer.append(f("final_musictype"));
        stringBuffer.append("\r\ngoToMJAppResult:");
        stringBuffer.append(f("goToMJAppResult"));
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.SnsTemplateReportStruct setEditdetail(java.lang.String str) {
        j("editdetail", b("editdetail", str, true));
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.SnsTemplateReportStruct setEgdetail(java.lang.String str) {
        j("egdetail", b("egdetail", str, true));
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.SnsTemplateReportStruct setEgendcnt(int i17) {
        j("egendcnt", java.lang.Integer.valueOf(i17));
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.SnsTemplateReportStruct setEgpreviewcnt(int i17) {
        j("egpreviewcnt", java.lang.Integer.valueOf(i17));
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.SnsTemplateReportStruct setEgviewcnt(int i17) {
        j("egviewcnt", java.lang.Integer.valueOf(i17));
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.SnsTemplateReportStruct setFinal_egid(java.lang.String str) {
        j("final_egid", b("final_egid", str, true));
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.SnsTemplateReportStruct setFinal_musicid(java.lang.String str) {
        j("final_musicid", b("final_musicid", str, true));
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.SnsTemplateReportStruct setFinal_musictype(int i17) {
        j("final_musictype", java.lang.Integer.valueOf(i17));
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.SnsTemplateReportStruct setGoToMJAppResult(int i17) {
        j("goToMJAppResult", java.lang.Integer.valueOf(i17));
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.SnsTemplateReportStruct setInstallMiaojian(int i17) {
        j("installMiaojian", java.lang.Integer.valueOf(i17));
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.SnsTemplateReportStruct setMediadetail(java.lang.String str) {
        j("mediadetail", b("mediadetail", str, true));
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.SnsTemplateReportStruct setMiaojiansheet(int i17) {
        j("miaojiansheet", java.lang.Integer.valueOf(i17));
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.SnsTemplateReportStruct setMoreAction(int i17) {
        j("moreAction", java.lang.Integer.valueOf(i17));
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.SnsTemplateReportStruct setMusiccnt(int i17) {
        j("musiccnt", java.lang.Integer.valueOf(i17));
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.SnsTemplateReportStruct setSessionID(java.lang.String str) {
        j("sessionID", b("sessionID", str, true));
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.SnsTemplateReportStruct setSource(int i17) {
        j(ya.b.SOURCE, java.lang.Integer.valueOf(i17));
        return this;
    }
}
