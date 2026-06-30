package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class ForwardHalfPanelReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58219d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f58220e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f58221f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f58222g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f58223h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f58224i = 0;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f58225j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f58226k = "";

    /* renamed from: l, reason: collision with root package name */
    public long f58227l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f58228m = 0;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f58229n = "";

    @Override // jx3.a
    public int g() {
        return 24035;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58219d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58220e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58221f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58222g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58223h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58224i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58225j);
        stringBuffer.append(",");
        stringBuffer.append(this.f58226k);
        stringBuffer.append(",");
        stringBuffer.append(this.f58227l);
        stringBuffer.append(",");
        stringBuffer.append(this.f58228m);
        stringBuffer.append(",");
        stringBuffer.append(this.f58229n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("exit_type:");
        stringBuffer.append(this.f58219d);
        stringBuffer.append("\r\nDel_count:");
        stringBuffer.append(this.f58220e);
        stringBuffer.append("\r\nDel_list:");
        stringBuffer.append(this.f58221f);
        stringBuffer.append("\r\nfastListSeq:");
        stringBuffer.append(this.f58222g);
        stringBuffer.append("\r\nOneLineCount:");
        stringBuffer.append(this.f58223h);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f58224i);
        stringBuffer.append("\r\nMsgType:");
        stringBuffer.append(this.f58225j);
        stringBuffer.append("\r\nInnerAppMsgType:");
        stringBuffer.append(this.f58226k);
        stringBuffer.append("\r\nCostTime:");
        stringBuffer.append(this.f58227l);
        stringBuffer.append("\r\nLogVersion:");
        stringBuffer.append(this.f58228m);
        stringBuffer.append("\r\nToUser:");
        stringBuffer.append(this.f58229n);
        return stringBuffer.toString();
    }
}
