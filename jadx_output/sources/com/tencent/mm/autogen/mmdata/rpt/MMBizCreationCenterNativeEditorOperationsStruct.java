package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class MMBizCreationCenterNativeEditorOperationsStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58783d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final long f58784e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f58785f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f58786g = "";

    /* renamed from: h, reason: collision with root package name */
    public long f58787h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f58788i = "";

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f58789j = "";

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f58790k = "";

    /* renamed from: l, reason: collision with root package name */
    public long f58791l = 0;

    @Override // jx3.a
    public int g() {
        return 37134;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,0,0,");
        stringBuffer.append(this.f58783d);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f58784e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58785f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58786g);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f58787h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58788i);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f58789j);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f58790k);
        stringBuffer.append(",");
        stringBuffer.append(this.f58791l);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Bizuin:0\r\nEditorType:0\r\nArticleEditorOptype:0\r\nPictureEditorOptype:");
        stringBuffer.append(this.f58783d);
        stringBuffer.append("\r\nPublishFailReason:0\r\nAppmsgid:0\r\nIdx:");
        stringBuffer.append(this.f58784e);
        stringBuffer.append("\r\nEditTimeStamp:");
        stringBuffer.append(this.f58785f);
        stringBuffer.append("\r\nTopicTitle:");
        stringBuffer.append(this.f58786g);
        stringBuffer.append("\r\nTopicPos:0\r\nScene:");
        stringBuffer.append(this.f58787h);
        stringBuffer.append("\r\nFromMiniprogram:");
        stringBuffer.append(this.f58788i);
        stringBuffer.append("\r\nIsHDPicture:0\r\nArticleId:");
        stringBuffer.append(this.f58789j);
        stringBuffer.append("\r\nisHasImageRef:0\r\nRecommendLinkTitle:");
        stringBuffer.append(this.f58790k);
        stringBuffer.append("\r\nBizType:");
        stringBuffer.append(this.f58791l);
        stringBuffer.append("\r\nCanUseRedpacketCover:0");
        return stringBuffer.toString();
    }
}
