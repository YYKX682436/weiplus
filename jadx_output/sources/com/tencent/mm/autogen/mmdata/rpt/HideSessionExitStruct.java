package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class HideSessionExitStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58443d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f58444e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f58445f;

    /* renamed from: g, reason: collision with root package name */
    public long f58446g;

    /* renamed from: h, reason: collision with root package name */
    public long f58447h;

    /* renamed from: i, reason: collision with root package name */
    public long f58448i;

    /* renamed from: j, reason: collision with root package name */
    public long f58449j;

    @Override // jx3.a
    public int g() {
        return 21169;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58443d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58444e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58445f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58446g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58447h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58448i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58449j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("EnterScene:");
        stringBuffer.append(this.f58443d);
        stringBuffer.append("\r\nChatName:");
        stringBuffer.append(this.f58444e);
        stringBuffer.append("\r\nEnterTimeStamp:");
        stringBuffer.append(this.f58445f);
        stringBuffer.append("\r\nExitTimeStamp:");
        stringBuffer.append(this.f58446g);
        stringBuffer.append("\r\nEnterChatType:");
        stringBuffer.append(this.f58447h);
        stringBuffer.append("\r\nExitChatType:");
        stringBuffer.append(this.f58448i);
        stringBuffer.append("\r\nExitHiddenStatus:");
        stringBuffer.append(this.f58449j);
        return stringBuffer.toString();
    }
}
