package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class RingToneSetSceneReportStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f60040e;

    /* renamed from: f, reason: collision with root package name */
    public long f60041f;

    /* renamed from: g, reason: collision with root package name */
    public long f60042g;

    /* renamed from: i, reason: collision with root package name */
    public long f60044i;

    /* renamed from: j, reason: collision with root package name */
    public long f60045j;

    /* renamed from: k, reason: collision with root package name */
    public long f60046k;

    /* renamed from: m, reason: collision with root package name */
    public long f60048m;

    /* renamed from: n, reason: collision with root package name */
    public long f60049n;

    /* renamed from: p, reason: collision with root package name */
    public long f60051p;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60039d = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f60043h = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f60047l = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f60050o = "";

    @Override // jx3.a
    public int g() {
        return 24158;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60039d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60040e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60041f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60042g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60043h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60044i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60045j);
        stringBuffer.append(",");
        stringBuffer.append(this.f60046k);
        stringBuffer.append(",");
        stringBuffer.append(this.f60047l);
        stringBuffer.append(",");
        stringBuffer.append(this.f60048m);
        stringBuffer.append(",");
        stringBuffer.append(this.f60049n);
        stringBuffer.append(",");
        stringBuffer.append(this.f60050o);
        stringBuffer.append(",");
        stringBuffer.append(this.f60051p);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("feedid:");
        stringBuffer.append(this.f60039d);
        stringBuffer.append("\r\nfeedtype:");
        stringBuffer.append(this.f60040e);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f60041f);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f60042g);
        stringBuffer.append("\r\nusername:");
        stringBuffer.append(this.f60043h);
        stringBuffer.append("\r\nchannel:");
        stringBuffer.append(this.f60044i);
        stringBuffer.append("\r\nis_individual:");
        stringBuffer.append(this.f60045j);
        stringBuffer.append("\r\nstatus:");
        stringBuffer.append(this.f60046k);
        stringBuffer.append("\r\ntoUserName:");
        stringBuffer.append(this.f60047l);
        stringBuffer.append("\r\nsetType:");
        stringBuffer.append(this.f60048m);
        stringBuffer.append("\r\nis_vibrate:");
        stringBuffer.append(this.f60049n);
        stringBuffer.append("\r\nrec_request_id:");
        stringBuffer.append(this.f60050o);
        stringBuffer.append("\r\nis_video_stream:");
        stringBuffer.append(this.f60051p);
        return stringBuffer.toString();
    }
}
