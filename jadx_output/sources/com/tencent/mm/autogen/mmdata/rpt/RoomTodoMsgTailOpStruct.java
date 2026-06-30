package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes16.dex */
public final class RoomTodoMsgTailOpStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f60104e;

    /* renamed from: f, reason: collision with root package name */
    public long f60105f;

    /* renamed from: g, reason: collision with root package name */
    public long f60106g;

    /* renamed from: h, reason: collision with root package name */
    public long f60107h;

    /* renamed from: i, reason: collision with root package name */
    public long f60108i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60103d = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f60109j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f60110k = "";

    @Override // jx3.a
    public int g() {
        return 19442;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60103d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60104e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60105f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60106g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60107h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60108i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60109j);
        stringBuffer.append(",");
        stringBuffer.append(this.f60110k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomid:");
        stringBuffer.append(this.f60103d);
        stringBuffer.append("\r\nrole:");
        stringBuffer.append(this.f60104e);
        stringBuffer.append("\r\nexit:");
        stringBuffer.append(this.f60105f);
        stringBuffer.append("\r\nmsgType:");
        stringBuffer.append(this.f60106g);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f60107h);
        stringBuffer.append("\r\nopenHelp:");
        stringBuffer.append(this.f60108i);
        stringBuffer.append("\r\ntodoid:");
        stringBuffer.append(this.f60109j);
        stringBuffer.append("\r\nappusername:");
        stringBuffer.append(this.f60110k);
        return stringBuffer.toString();
    }
}
