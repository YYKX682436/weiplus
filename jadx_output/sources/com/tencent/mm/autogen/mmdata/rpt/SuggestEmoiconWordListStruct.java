package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class SuggestEmoiconWordListStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f61014d;

    /* renamed from: e, reason: collision with root package name */
    public long f61015e;

    /* renamed from: f, reason: collision with root package name */
    public long f61016f;

    /* renamed from: g, reason: collision with root package name */
    public long f61017g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f61018h = "";

    @Override // jx3.a
    public int g() {
        return 20203;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61014d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61015e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61016f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61017g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61018h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PullStartTimeStamp:");
        stringBuffer.append(this.f61014d);
        stringBuffer.append("\r\nPullEndTimeStamp:");
        stringBuffer.append(this.f61015e);
        stringBuffer.append("\r\nIsSuccess:");
        stringBuffer.append(this.f61016f);
        stringBuffer.append("\r\nWordSize:");
        stringBuffer.append(this.f61017g);
        stringBuffer.append("\r\nWordVersion:");
        stringBuffer.append(this.f61018h);
        return stringBuffer.toString();
    }
}
