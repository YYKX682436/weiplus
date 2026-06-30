package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class q6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f232919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.t6 f232920e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.t6 t6Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f232920e = t6Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q6(this.f232920e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.LinkedList m75941xfb821914;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f232919d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.t6 t6Var = this.f232920e;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = t6Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            java.util.LinkedList P6 = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6.class)).P6();
            t6Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(P6, "<set-?>");
            t6Var.f232995g = P6;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initBgTrackView size:");
            sb6.append(t6Var.f232993e.size());
            sb6.append(", mediaInfoList.size:");
            sb6.append(t6Var.f232995g.size());
            sb6.append(", trackData?.refObjectList.size:");
            r45.ss4 ss4Var = t6Var.f232992d;
            sb6.append((ss4Var == null || (m75941xfb821914 = ss4Var.m75941xfb821914(1)) == null) ? null : new java.lang.Integer(m75941xfb821914.size()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvPreviewTrackUIC", sb6.toString());
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.p6 p6Var = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.p6(t6Var, null);
            this.f232919d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, p6Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
