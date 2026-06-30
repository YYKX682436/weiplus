package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class FinderChatProfileStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public long f56619g;

    /* renamed from: j, reason: collision with root package name */
    public long f56622j;

    /* renamed from: k, reason: collision with root package name */
    public long f56623k;

    /* renamed from: l, reason: collision with root package name */
    public long f56624l;

    /* renamed from: m, reason: collision with root package name */
    public long f56625m;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f56616d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f56617e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f56618f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f56620h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f56621i = "";

    @Override // jx3.a
    public int g() {
        return 20692;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56616d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56617e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56618f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56619g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56620h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56621i);
        stringBuffer.append(",");
        stringBuffer.append(this.f56622j);
        stringBuffer.append(",");
        stringBuffer.append(this.f56623k);
        stringBuffer.append(",");
        stringBuffer.append(this.f56624l);
        stringBuffer.append(",");
        stringBuffer.append(this.f56625m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f56616d);
        stringBuffer.append("\r\nclicktabcontextid:");
        stringBuffer.append(this.f56617e);
        stringBuffer.append("\r\nchatSessionid:");
        stringBuffer.append(this.f56618f);
        stringBuffer.append("\r\nmyAccountType:");
        stringBuffer.append(this.f56619g);
        stringBuffer.append("\r\nchatName:");
        stringBuffer.append(this.f56620h);
        stringBuffer.append("\r\ntalkerUsername:");
        stringBuffer.append(this.f56621i);
        stringBuffer.append("\r\nRejectMsgStatus:");
        stringBuffer.append(this.f56622j);
        stringBuffer.append("\r\nopenChatInfoCount:");
        stringBuffer.append(this.f56623k);
        stringBuffer.append("\r\nclearMsgHistoryClickCount:");
        stringBuffer.append(this.f56624l);
        stringBuffer.append("\r\ncomplianClickCount:");
        stringBuffer.append(this.f56625m);
        return stringBuffer.toString();
    }
}
