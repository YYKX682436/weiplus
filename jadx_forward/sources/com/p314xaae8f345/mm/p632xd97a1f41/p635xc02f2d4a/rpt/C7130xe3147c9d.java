package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeNoteMenuOperationStruct */
/* loaded from: classes12.dex */
public final class C7130xe3147c9d extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f144447d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f144448e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f144449f;

    /* renamed from: g, reason: collision with root package name */
    public int f144450g;

    @Override // jx3.a
    public int g() {
        return 26791;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f144447d);
        stringBuffer.append(",");
        stringBuffer.append(this.f144448e);
        stringBuffer.append(",");
        stringBuffer.append(this.f144449f);
        stringBuffer.append(",");
        stringBuffer.append(this.f144450g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionID:");
        stringBuffer.append(this.f144447d);
        stringBuffer.append("\r\nnoteid:");
        stringBuffer.append(this.f144448e);
        stringBuffer.append("\r\npicStatus:");
        stringBuffer.append(this.f144449f);
        stringBuffer.append("\r\nOperationType:");
        stringBuffer.append(this.f144450g);
        return stringBuffer.toString();
    }
}
