package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.EmoticonCustomCreateResultStruct */
/* loaded from: classes10.dex */
public final class C6410x1a153385 extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f137553e;

    /* renamed from: f, reason: collision with root package name */
    public long f137554f;

    /* renamed from: g, reason: collision with root package name */
    public long f137555g;

    /* renamed from: h, reason: collision with root package name */
    public long f137556h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f137552d = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f137557i = "";

    @Override // jx3.a
    public int g() {
        return 29611;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137552d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137553e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137554f);
        stringBuffer.append(",");
        stringBuffer.append(this.f137555g);
        stringBuffer.append(",");
        stringBuffer.append(this.f137556h);
        stringBuffer.append(",");
        stringBuffer.append(this.f137557i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("EditStickerSessionID:");
        stringBuffer.append(this.f137552d);
        stringBuffer.append("\r\nstatus:");
        stringBuffer.append(this.f137553e);
        stringBuffer.append("\r\nEditStickerSource:");
        stringBuffer.append(this.f137554f);
        stringBuffer.append("\r\nEditStickerType:");
        stringBuffer.append(this.f137555g);
        stringBuffer.append("\r\nEditFromScene:");
        stringBuffer.append(this.f137556h);
        stringBuffer.append("\r\nExtraInfo:");
        stringBuffer.append(this.f137557i);
        return stringBuffer.toString();
    }
}
