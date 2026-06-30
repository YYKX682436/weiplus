package aq1;

/* loaded from: classes5.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f94576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.v60 f94577e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f94578f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y35.r f94579g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f94580h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r45.v60 v60Var, java.lang.String str, y35.r rVar, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f94577e = v60Var;
        this.f94578f = str;
        this.f94579g = rVar;
        this.f94580h = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new aq1.g(this.f94577e, this.f94578f, this.f94579g, this.f94580h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((aq1.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f94576d;
        java.lang.String userName = this.f94578f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            hr3.ag agVar = hr3.ag.f364937a;
            r45.v60 imgInfo = this.f94577e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imgInfo, "$imgInfo");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(userName, "$userName");
            boolean z17 = this.f94579g.f540770f;
            long j17 = this.f94580h;
            this.f94576d = 1;
            obj = agVar.i(imgInfo, userName, z17, j17, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        long longValue = ((java.lang.Number) obj).longValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "tryToAddSayHiMsg img inserted to db , imgMsgId = " + longValue);
        gc0.f0 f0Var = gc0.f0.f351700a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(userName, "$userName");
        r45.ml5 b17 = f0Var.b(userName);
        b17.m75941xfb821914(6).add(java.lang.Long.valueOf(longValue));
        f0Var.c().H(userName, b17.mo14344x5f01b1f6());
        return jz5.f0.f384359a;
    }
}
