package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderTimelineMoreFeedExposeStruct */
/* loaded from: classes2.dex */
public final class C6596x6c8aec33 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f139450d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f139451e;

    /* renamed from: f, reason: collision with root package name */
    public long f139452f;

    /* renamed from: g, reason: collision with root package name */
    public long f139453g;

    /* renamed from: h, reason: collision with root package name */
    public long f139454h;

    @Override // jx3.a
    public int g() {
        return 19251;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139450d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139451e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139452f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139453g);
        stringBuffer.append(",");
        stringBuffer.append(this.f139454h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f139450d);
        stringBuffer.append("\r\nMessageType:");
        stringBuffer.append(this.f139451e);
        stringBuffer.append("\r\nActionType:");
        stringBuffer.append(this.f139452f);
        stringBuffer.append("\r\nIsFloat:");
        stringBuffer.append(this.f139453g);
        stringBuffer.append("\r\nCommentScene:");
        stringBuffer.append(this.f139454h);
        return stringBuffer.toString();
    }
}
