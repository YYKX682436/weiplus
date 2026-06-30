package dk2;

/* loaded from: classes3.dex */
public final class i3 implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f315139b;

    public i3(dk2.r4 r4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f315138a = r4Var;
        this.f315139b = interfaceC29045xdcb5ca57;
    }

    @Override // s40.t0
    /* renamed from: onLiveStatusCallback */
    public void mo44975x964762a2(long j17, int i17, java.lang.Object obj) {
        km2.b bVar;
        dk2.r4 r4Var = this.f315138a;
        java.lang.String str = r4Var.f315542d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getLiveInfo,liveData.business(LiveCommonSlice::class.java).liveId:");
        boolean z17 = false;
        sb6.append(((mm2.e1) r4Var.m(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
        sb6.append(",respLiveId:");
        sb6.append(j17);
        sb6.append(",liveStatus:");
        sb6.append(i17);
        sb6.append(",resp:");
        sb6.append(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (j17 == ((mm2.e1) r4Var.m(mm2.e1.class)).f410521r.m75942xfb822ef2(0) && (obj instanceof r45.l71)) {
            z17 = true;
        }
        boolean z18 = z17;
        if (z18) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveInfoResp");
            bVar = r4Var.c0((r45.l71) obj);
        } else {
            bVar = null;
        }
        km2.b bVar2 = bVar;
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f315139b.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new dk2.r0(z18, 0, 0, "", bVar2)));
    }
}
