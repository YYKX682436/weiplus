package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class StoryFriendVisitPageExposeStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f60913d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f60914e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f60915f = "";

    @Override // jx3.a
    public int g() {
        return 18744;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f60913d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60914e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60915f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Storyid:0\r\nBrowseFriendsCount:");
        stringBuffer.append(this.f60913d);
        stringBuffer.append("\r\nCommentFriendsCount:");
        stringBuffer.append(this.f60914e);
        stringBuffer.append("\r\nStoryidStr:");
        stringBuffer.append(this.f60915f);
        return stringBuffer.toString();
    }
}
