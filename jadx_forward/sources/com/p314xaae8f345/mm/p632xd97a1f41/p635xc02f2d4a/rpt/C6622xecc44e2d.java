package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FollowChatroomMemberMangerStruct */
/* loaded from: classes11.dex */
public final class C6622xecc44e2d extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f139745e;

    /* renamed from: f, reason: collision with root package name */
    public long f139746f;

    /* renamed from: g, reason: collision with root package name */
    public int f139747g;

    /* renamed from: h, reason: collision with root package name */
    public int f139748h;

    /* renamed from: i, reason: collision with root package name */
    public int f139749i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f139744d = "";

    /* renamed from: j, reason: collision with root package name */
    public int f139750j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f139751k = 0;

    @Override // jx3.a
    public int g() {
        return 20247;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139744d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139745e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139746f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139747g);
        stringBuffer.append(",");
        stringBuffer.append(this.f139748h);
        stringBuffer.append(",");
        stringBuffer.append(this.f139749i);
        stringBuffer.append(",");
        stringBuffer.append(this.f139750j);
        stringBuffer.append(",");
        stringBuffer.append(this.f139751k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomid:");
        stringBuffer.append(this.f139744d);
        stringBuffer.append("\r\nenterTime:");
        stringBuffer.append(this.f139745e);
        stringBuffer.append("\r\nexitTime:");
        stringBuffer.append(this.f139746f);
        stringBuffer.append("\r\nhasClickedPlus:");
        stringBuffer.append(this.f139747g);
        stringBuffer.append("\r\nhasClickedMinus:");
        stringBuffer.append(this.f139748h);
        stringBuffer.append("\r\nhasConfirmedChanges:");
        stringBuffer.append(this.f139749i);
        stringBuffer.append("\r\nenterFollowCount:");
        stringBuffer.append(this.f139750j);
        stringBuffer.append("\r\nexitFollowCount:");
        stringBuffer.append(this.f139751k);
        return stringBuffer.toString();
    }
}
