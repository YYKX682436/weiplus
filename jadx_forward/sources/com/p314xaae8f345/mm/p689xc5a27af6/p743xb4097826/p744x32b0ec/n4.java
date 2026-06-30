package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes.dex */
public final class n4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f148373e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1);
        this.f148372d = str;
        this.f148373e = interfaceC29045xdcb5ca57;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.LinkedList m75941xfb821914;
        r45.dl2 dl2Var;
        r45.nw1 nw1Var;
        java.util.LinkedList m75941xfb8219142;
        java.lang.Integer num;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#requestAndRefreshActivityIcon errType:");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152148a) : null);
        sb6.append(" errCode:");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152149b) : null);
        sb6.append(" feedId:");
        sb6.append(this.f148372d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", sb6.toString());
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f148373e;
        if (fVar != null && fVar.f152148a == 0 && fVar.f152149b == 0) {
            r45.ov0 ov0Var = (r45.ov0) fVar.f152151d;
            int intValue = (ov0Var == null || (m75941xfb821914 = ov0Var.m75941xfb821914(1)) == null || (dl2Var = (r45.dl2) kz5.n0.a0(m75941xfb821914, 0)) == null || (nw1Var = (r45.nw1) dl2Var.m75936x14adae67(1)) == null || (m75941xfb8219142 = nw1Var.m75941xfb821914(33)) == null || (num = (java.lang.Integer) kz5.n0.a0(m75941xfb8219142, 0)) == null) ? 0 : num.intValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "#requestAndRefreshActivityIcon actType=" + intValue);
            r45.ov0 ov0Var2 = (r45.ov0) fVar.f152151d;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.p1(ov0Var2 != null ? ov0Var2.m75939xb282bd08(3) : 0, intValue)));
        } else {
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.p1(0, 0)));
        }
        return jz5.f0.f384359a;
    }
}
