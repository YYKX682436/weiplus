package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderSwitchCommentRoleStruct */
/* loaded from: classes10.dex */
public final class C6590xecfe43b0 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f139415d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f139416e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f139417f;

    /* renamed from: g, reason: collision with root package name */
    public long f139418g;

    /* renamed from: h, reason: collision with root package name */
    public long f139419h;

    /* renamed from: i, reason: collision with root package name */
    public long f139420i;

    /* renamed from: j, reason: collision with root package name */
    public long f139421j;

    @Override // jx3.a
    public int g() {
        return 19387;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139415d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139416e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139417f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139418g);
        stringBuffer.append(",");
        stringBuffer.append(this.f139419h);
        stringBuffer.append(",");
        stringBuffer.append(this.f139420i);
        stringBuffer.append(",");
        stringBuffer.append(this.f139421j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f139415d);
        stringBuffer.append("\r\nfeedid:");
        stringBuffer.append(this.f139416e);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f139417f);
        stringBuffer.append("\r\nFeedLikeCount:");
        stringBuffer.append(this.f139418g);
        stringBuffer.append("\r\nFeedCommentCount:");
        stringBuffer.append(this.f139419h);
        stringBuffer.append("\r\nFeedFriLikeCount:");
        stringBuffer.append(this.f139420i);
        stringBuffer.append("\r\nRoleBeforeSwitch:");
        stringBuffer.append(this.f139421j);
        return stringBuffer.toString();
    }
}
