package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes2.dex */
public final class FinderVideoPlayerSizeMonitorStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f58074d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f58075e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f58076f;

    /* renamed from: g, reason: collision with root package name */
    public int f58077g;

    /* renamed from: h, reason: collision with root package name */
    public int f58078h;

    /* renamed from: i, reason: collision with root package name */
    public int f58079i;

    /* renamed from: j, reason: collision with root package name */
    public int f58080j;

    @Override // jx3.a
    public int g() {
        return 36040;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58074d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58075e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58076f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58077g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58078h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58079i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58080j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("feed_id:");
        stringBuffer.append(this.f58074d);
        stringBuffer.append("\r\nfeed_bitrate_level:");
        stringBuffer.append(this.f58075e);
        stringBuffer.append("\r\nfinder_object_width:");
        stringBuffer.append(this.f58076f);
        stringBuffer.append("\r\nfinder_object_height:");
        stringBuffer.append(this.f58077g);
        stringBuffer.append("\r\nvideo_moov_width:");
        stringBuffer.append(this.f58078h);
        stringBuffer.append("\r\nvideo_moov_height:");
        stringBuffer.append(this.f58079i);
        stringBuffer.append("\r\nratio_delta:");
        stringBuffer.append(this.f58080j);
        return stringBuffer.toString();
    }
}
