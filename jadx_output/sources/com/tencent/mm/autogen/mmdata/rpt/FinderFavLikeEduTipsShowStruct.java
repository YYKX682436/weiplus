package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class FinderFavLikeEduTipsShowStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f56762d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f56763e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f56764f = "";

    @Override // jx3.a
    public int g() {
        return 21726;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56762d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f56763e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56764f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("feedID:");
        stringBuffer.append(this.f56762d);
        stringBuffer.append("\r\nCommentScene:0\r\nClickTabContextId:");
        stringBuffer.append(this.f56763e);
        stringBuffer.append("\r\nContextId:");
        stringBuffer.append(this.f56764f);
        return stringBuffer.toString();
    }
}
