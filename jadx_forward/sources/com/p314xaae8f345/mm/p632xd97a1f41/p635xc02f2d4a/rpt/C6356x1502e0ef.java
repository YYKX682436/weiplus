package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.CameraEditorSessionActionStruct */
/* loaded from: classes4.dex */
public final class C6356x1502e0ef extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f137064d;

    /* renamed from: e, reason: collision with root package name */
    public int f137065e;

    /* renamed from: f, reason: collision with root package name */
    public int f137066f;

    /* renamed from: g, reason: collision with root package name */
    public int f137067g;

    /* renamed from: h, reason: collision with root package name */
    public int f137068h;

    /* renamed from: i, reason: collision with root package name */
    public int f137069i;

    /* renamed from: n, reason: collision with root package name */
    public int f137074n;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f137070j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f137071k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f137072l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f137073m = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f137075o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f137076p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f137077q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f137078r = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f137079s = "";

    @Override // jx3.a
    public int g() {
        return 36153;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137064d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137065e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137066f);
        stringBuffer.append(",");
        stringBuffer.append(this.f137067g);
        stringBuffer.append(",");
        stringBuffer.append(this.f137068h);
        stringBuffer.append(",");
        stringBuffer.append(this.f137069i);
        stringBuffer.append(",");
        stringBuffer.append(this.f137070j);
        stringBuffer.append(",");
        stringBuffer.append(this.f137071k);
        stringBuffer.append(",");
        stringBuffer.append(this.f137072l);
        stringBuffer.append(",");
        stringBuffer.append(this.f137073m);
        stringBuffer.append(",");
        stringBuffer.append(this.f137074n);
        stringBuffer.append(",");
        stringBuffer.append(this.f137075o);
        stringBuffer.append(",");
        stringBuffer.append(this.f137076p);
        stringBuffer.append(",");
        stringBuffer.append(this.f137077q);
        stringBuffer.append(",");
        stringBuffer.append(this.f137078r);
        stringBuffer.append(",");
        stringBuffer.append(this.f137079s);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PicUse:");
        stringBuffer.append(this.f137064d);
        stringBuffer.append("\r\nIsFromCamera:");
        stringBuffer.append(this.f137065e);
        stringBuffer.append("\r\nIsFromEditor:");
        stringBuffer.append(this.f137066f);
        stringBuffer.append("\r\nPicSource:");
        stringBuffer.append(this.f137067g);
        stringBuffer.append("\r\nContentType:");
        stringBuffer.append(this.f137068h);
        stringBuffer.append("\r\nIsOriginalPic:");
        stringBuffer.append(this.f137069i);
        stringBuffer.append("\r\nCameraEnterSessionID:");
        stringBuffer.append(this.f137070j);
        stringBuffer.append("\r\nCameraSessionID:");
        stringBuffer.append(this.f137071k);
        stringBuffer.append("\r\nEditSessionID:");
        stringBuffer.append(this.f137072l);
        stringBuffer.append("\r\nChatUserName:");
        stringBuffer.append(this.f137073m);
        stringBuffer.append("\r\nRoomSize:");
        stringBuffer.append(this.f137074n);
        stringBuffer.append("\r\nSvrMsgID:");
        stringBuffer.append(this.f137075o);
        stringBuffer.append("\r\nSnsPublishID:");
        stringBuffer.append(this.f137076p);
        stringBuffer.append("\r\nOriginalContentInformation:");
        stringBuffer.append(this.f137077q);
        stringBuffer.append("\r\nEditedContentInformation:");
        stringBuffer.append(this.f137078r);
        stringBuffer.append("\r\nSendContentInformation:");
        stringBuffer.append(this.f137079s);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6356x1502e0ef p(java.lang.String str) {
        this.f137078r = b("EditedContentInformation", str, true);
        return this;
    }
}
