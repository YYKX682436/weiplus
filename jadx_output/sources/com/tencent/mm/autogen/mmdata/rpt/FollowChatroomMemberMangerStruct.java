package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class FollowChatroomMemberMangerStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f58212e;

    /* renamed from: f, reason: collision with root package name */
    public long f58213f;

    /* renamed from: g, reason: collision with root package name */
    public int f58214g;

    /* renamed from: h, reason: collision with root package name */
    public int f58215h;

    /* renamed from: i, reason: collision with root package name */
    public int f58216i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f58211d = "";

    /* renamed from: j, reason: collision with root package name */
    public int f58217j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f58218k = 0;

    @Override // jx3.a
    public int g() {
        return 20247;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58211d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58212e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58213f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58214g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58215h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58216i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58217j);
        stringBuffer.append(",");
        stringBuffer.append(this.f58218k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomid:");
        stringBuffer.append(this.f58211d);
        stringBuffer.append("\r\nenterTime:");
        stringBuffer.append(this.f58212e);
        stringBuffer.append("\r\nexitTime:");
        stringBuffer.append(this.f58213f);
        stringBuffer.append("\r\nhasClickedPlus:");
        stringBuffer.append(this.f58214g);
        stringBuffer.append("\r\nhasClickedMinus:");
        stringBuffer.append(this.f58215h);
        stringBuffer.append("\r\nhasConfirmedChanges:");
        stringBuffer.append(this.f58216i);
        stringBuffer.append("\r\nenterFollowCount:");
        stringBuffer.append(this.f58217j);
        stringBuffer.append("\r\nexitFollowCount:");
        stringBuffer.append(this.f58218k);
        return stringBuffer.toString();
    }
}
