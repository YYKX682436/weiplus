package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class CameraEditorSessionActionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f55531d;

    /* renamed from: e, reason: collision with root package name */
    public int f55532e;

    /* renamed from: f, reason: collision with root package name */
    public int f55533f;

    /* renamed from: g, reason: collision with root package name */
    public int f55534g;

    /* renamed from: h, reason: collision with root package name */
    public int f55535h;

    /* renamed from: i, reason: collision with root package name */
    public int f55536i;

    /* renamed from: n, reason: collision with root package name */
    public int f55541n;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f55537j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f55538k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f55539l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f55540m = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f55542o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f55543p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f55544q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f55545r = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f55546s = "";

    @Override // jx3.a
    public int g() {
        return 36153;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55531d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55532e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55533f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55534g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55535h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55536i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55537j);
        stringBuffer.append(",");
        stringBuffer.append(this.f55538k);
        stringBuffer.append(",");
        stringBuffer.append(this.f55539l);
        stringBuffer.append(",");
        stringBuffer.append(this.f55540m);
        stringBuffer.append(",");
        stringBuffer.append(this.f55541n);
        stringBuffer.append(",");
        stringBuffer.append(this.f55542o);
        stringBuffer.append(",");
        stringBuffer.append(this.f55543p);
        stringBuffer.append(",");
        stringBuffer.append(this.f55544q);
        stringBuffer.append(",");
        stringBuffer.append(this.f55545r);
        stringBuffer.append(",");
        stringBuffer.append(this.f55546s);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PicUse:");
        stringBuffer.append(this.f55531d);
        stringBuffer.append("\r\nIsFromCamera:");
        stringBuffer.append(this.f55532e);
        stringBuffer.append("\r\nIsFromEditor:");
        stringBuffer.append(this.f55533f);
        stringBuffer.append("\r\nPicSource:");
        stringBuffer.append(this.f55534g);
        stringBuffer.append("\r\nContentType:");
        stringBuffer.append(this.f55535h);
        stringBuffer.append("\r\nIsOriginalPic:");
        stringBuffer.append(this.f55536i);
        stringBuffer.append("\r\nCameraEnterSessionID:");
        stringBuffer.append(this.f55537j);
        stringBuffer.append("\r\nCameraSessionID:");
        stringBuffer.append(this.f55538k);
        stringBuffer.append("\r\nEditSessionID:");
        stringBuffer.append(this.f55539l);
        stringBuffer.append("\r\nChatUserName:");
        stringBuffer.append(this.f55540m);
        stringBuffer.append("\r\nRoomSize:");
        stringBuffer.append(this.f55541n);
        stringBuffer.append("\r\nSvrMsgID:");
        stringBuffer.append(this.f55542o);
        stringBuffer.append("\r\nSnsPublishID:");
        stringBuffer.append(this.f55543p);
        stringBuffer.append("\r\nOriginalContentInformation:");
        stringBuffer.append(this.f55544q);
        stringBuffer.append("\r\nEditedContentInformation:");
        stringBuffer.append(this.f55545r);
        stringBuffer.append("\r\nSendContentInformation:");
        stringBuffer.append(this.f55546s);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.CameraEditorSessionActionStruct p(java.lang.String str) {
        this.f55545r = b("EditedContentInformation", str, true);
        return this;
    }
}
