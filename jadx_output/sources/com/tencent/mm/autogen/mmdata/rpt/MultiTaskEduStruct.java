package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class MultiTaskEduStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59364d;

    /* renamed from: e, reason: collision with root package name */
    public long f59365e;

    /* renamed from: f, reason: collision with root package name */
    public long f59366f;

    /* renamed from: g, reason: collision with root package name */
    public long f59367g;

    @Override // jx3.a
    public int g() {
        return 22591;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59364d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59365e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59366f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59367g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("EduType:");
        stringBuffer.append(this.f59364d);
        stringBuffer.append("\r\nExitType:");
        stringBuffer.append(this.f59365e);
        stringBuffer.append("\r\nDuration:");
        stringBuffer.append(this.f59366f);
        stringBuffer.append("\r\nListEduType:");
        stringBuffer.append(this.f59367g);
        return stringBuffer.toString();
    }
}
