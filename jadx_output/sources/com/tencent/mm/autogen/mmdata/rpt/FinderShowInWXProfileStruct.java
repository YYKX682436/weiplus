package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes2.dex */
public final class FinderShowInWXProfileStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public int f57829g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57826d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57827e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f57828f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f57830h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f57831i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f57832j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f57833k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f57834l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f57835m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f57836n = "";

    @Override // jx3.a
    public int g() {
        return 21875;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57826d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57827e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57828f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57829g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57830h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57831i);
        stringBuffer.append(",");
        stringBuffer.append(this.f57832j);
        stringBuffer.append(",");
        stringBuffer.append(this.f57833k);
        stringBuffer.append(",");
        stringBuffer.append(this.f57834l);
        stringBuffer.append(",");
        stringBuffer.append(this.f57835m);
        stringBuffer.append(",");
        stringBuffer.append(this.f57836n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f57826d);
        stringBuffer.append("\r\nfindercontextid:");
        stringBuffer.append(this.f57827e);
        stringBuffer.append("\r\ncommentscene:");
        stringBuffer.append(this.f57828f);
        stringBuffer.append("\r\nevent_code:");
        stringBuffer.append(this.f57829g);
        stringBuffer.append("\r\nevent_time:");
        stringBuffer.append(this.f57830h);
        stringBuffer.append("\r\neid:");
        stringBuffer.append(this.f57831i);
        stringBuffer.append("\r\nudf_kv:");
        stringBuffer.append(this.f57832j);
        stringBuffer.append("\r\nclicktabcontextid:");
        stringBuffer.append(this.f57833k);
        stringBuffer.append("\r\nref_commentscene:");
        stringBuffer.append(this.f57834l);
        stringBuffer.append("\r\njump_id:");
        stringBuffer.append(this.f57835m);
        stringBuffer.append("\r\nsession_buffer:");
        stringBuffer.append(this.f57836n);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct p(java.lang.String str) {
        this.f57828f = b("commentscene", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct q(java.lang.String str) {
        this.f57831i = b("eid", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct r(java.lang.String str) {
        this.f57830h = b("event_time", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct s(java.lang.String str) {
        this.f57826d = b("sessionid", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct t(java.lang.String str) {
        this.f57832j = b("udf_kv", str, true);
        return this;
    }
}
