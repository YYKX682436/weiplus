package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class MultiTaskPageActionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59389d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59390e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f59391f;

    /* renamed from: g, reason: collision with root package name */
    public long f59392g;

    /* renamed from: h, reason: collision with root package name */
    public long f59393h;

    /* renamed from: i, reason: collision with root package name */
    public long f59394i;

    /* renamed from: j, reason: collision with root package name */
    public long f59395j;

    /* renamed from: k, reason: collision with root package name */
    public long f59396k;

    @Override // jx3.a
    public int g() {
        return 21920;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59389d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59390e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59391f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59392g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59393h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59394i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59395j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59396k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f59389d);
        stringBuffer.append("\r\nContextId:");
        stringBuffer.append(this.f59390e);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f59391f);
        stringBuffer.append("\r\nUserAction:");
        stringBuffer.append(this.f59392g);
        stringBuffer.append("\r\nFullScreen:");
        stringBuffer.append(this.f59393h);
        stringBuffer.append("\r\nTaskCount:");
        stringBuffer.append(this.f59394i);
        stringBuffer.append("\r\nDuration:");
        stringBuffer.append(this.f59395j);
        stringBuffer.append("\r\nEnterChatting:");
        stringBuffer.append(this.f59396k);
        return stringBuffer.toString();
    }
}
