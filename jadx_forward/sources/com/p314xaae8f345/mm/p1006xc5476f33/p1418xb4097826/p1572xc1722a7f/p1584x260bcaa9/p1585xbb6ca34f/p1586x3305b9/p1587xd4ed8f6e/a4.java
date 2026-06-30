package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class a4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f203105e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1);
        this.f203104d = str;
        this.f203105e = interfaceC29045xdcb5ca57;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.LinkedList m75941xfb821914;
        r45.dl2 dl2Var;
        r45.nw1 nw1Var;
        java.util.LinkedList m75941xfb8219142;
        r45.dl2 dl2Var2;
        r45.nw1 nw1Var2;
        java.util.LinkedList m75941xfb8219143;
        r45.dl2 dl2Var3;
        r45.nw1 nw1Var3;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#requestAndRefreshActivityIcon errType:");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152148a) : null);
        sb6.append(" errCode:");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152149b) : null);
        sb6.append(" feedId:");
        sb6.append(this.f203104d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivingConvert", sb6.toString());
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f203105e;
        if (fVar != null && fVar.f152148a == 0 && fVar.f152149b == 0) {
            r45.ov0 ov0Var = (r45.ov0) fVar.f152151d;
            int m75939xb282bd08 = (ov0Var == null || (m75941xfb8219143 = ov0Var.m75941xfb821914(1)) == null || (dl2Var3 = (r45.dl2) kz5.n0.a0(m75941xfb8219143, 0)) == null || (nw1Var3 = (r45.nw1) dl2Var3.m75936x14adae67(1)) == null) ? 0 : nw1Var3.m75939xb282bd08(10);
            r45.ov0 ov0Var2 = (r45.ov0) fVar.f152151d;
            boolean z17 = ((ov0Var2 == null || (m75941xfb8219142 = ov0Var2.m75941xfb821914(1)) == null || (dl2Var2 = (r45.dl2) kz5.n0.a0(m75941xfb8219142, 0)) == null || (nw1Var2 = (r45.nw1) dl2Var2.m75936x14adae67(1)) == null) ? 1 : nw1Var2.m75939xb282bd08(2)) == 1;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("#requestAndRefreshActivityIcon participantCount=");
            sb7.append(m75939xb282bd08);
            sb7.append(", liveStatus=");
            r45.ov0 ov0Var3 = (r45.ov0) fVar.f152151d;
            sb7.append((ov0Var3 == null || (m75941xfb821914 = ov0Var3.m75941xfb821914(1)) == null || (dl2Var = (r45.dl2) kz5.n0.a0(m75941xfb821914, 0)) == null || (nw1Var = (r45.nw1) dl2Var.m75936x14adae67(1)) == null) ? null : java.lang.Integer.valueOf(nw1Var.m75939xb282bd08(2)));
            sb7.append(" interval=");
            r45.ov0 ov0Var4 = (r45.ov0) fVar.f152151d;
            sb7.append(ov0Var4 != null ? java.lang.Integer.valueOf(ov0Var4.m75939xb282bd08(3)) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivingConvert", sb7.toString());
            r45.ov0 ov0Var5 = (r45.ov0) fVar.f152151d;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.k2(true, ov0Var5 != null ? ov0Var5.m75939xb282bd08(3) : 0, m75939xb282bd08, z17)));
        } else {
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.k2(false, 0, 0, true)));
        }
        return jz5.f0.f384359a;
    }
}
