package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class FTSVoiceSearchReportInfoStruct extends jx3.a {

    /* renamed from: h, reason: collision with root package name */
    public long f56152h;

    /* renamed from: i, reason: collision with root package name */
    public int f56153i;

    /* renamed from: l, reason: collision with root package name */
    public int f56156l;

    /* renamed from: m, reason: collision with root package name */
    public int f56157m;

    /* renamed from: o, reason: collision with root package name */
    public long f56159o;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f56148d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f56149e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f56150f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f56151g = "";

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f56154j = "";

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f56155k = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f56158n = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f56160p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f56161q = "";

    @Override // jx3.a
    public int g() {
        return 36992;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56148d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56149e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56150f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56151g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56152h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56153i);
        stringBuffer.append(",");
        stringBuffer.append(this.f56154j);
        stringBuffer.append(",");
        stringBuffer.append(this.f56155k);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f56156l);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f56157m);
        stringBuffer.append(",");
        stringBuffer.append(this.f56158n);
        stringBuffer.append(",");
        stringBuffer.append(this.f56159o);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f56160p);
        stringBuffer.append(",");
        stringBuffer.append(this.f56161q);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f56148d);
        stringBuffer.append("\r\nsearchid:");
        stringBuffer.append(this.f56149e);
        stringBuffer.append("\r\nsuggestionid:");
        stringBuffer.append(this.f56150f);
        stringBuffer.append("\r\nrequestid:");
        stringBuffer.append(this.f56151g);
        stringBuffer.append("\r\ntimestampms:");
        stringBuffer.append(this.f56152h);
        stringBuffer.append("\r\nactionid:");
        stringBuffer.append(this.f56153i);
        stringBuffer.append("\r\niteminfo:");
        stringBuffer.append(this.f56154j);
        stringBuffer.append("\r\ndocinfo:");
        stringBuffer.append(this.f56155k);
        stringBuffer.append("\r\nh5version:0\r\nscene:");
        stringBuffer.append(this.f56156l);
        stringBuffer.append("\r\nreqbusinesstype:0\r\nscenetype:");
        stringBuffer.append(this.f56157m);
        stringBuffer.append("\r\nextinfo:");
        stringBuffer.append(this.f56158n);
        stringBuffer.append("\r\ntimestampmssvr:");
        stringBuffer.append(this.f56159o);
        stringBuffer.append("\r\nisCache:0\r\nquery:");
        stringBuffer.append(this.f56160p);
        stringBuffer.append("\r\ngestureid:");
        stringBuffer.append(this.f56161q);
        return stringBuffer.toString();
    }
}
