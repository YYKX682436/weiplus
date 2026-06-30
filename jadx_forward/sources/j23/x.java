package j23;

/* loaded from: classes12.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f378821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j23.y f378822e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f378823f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378824g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(j23.y yVar, long j17, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f378822e = yVar;
        this.f378823f = j17;
        this.f378824g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new j23.x(this.f378822e, this.f378823f, this.f378824g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((j23.x) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean z17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f378821d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f378821d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(500L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        j23.y yVar = this.f378822e;
        synchronized (yVar.f378832r) {
            if (yVar.f378832r.get()) {
                z17 = true;
            } else {
                yVar.f378832r.set(true);
                z17 = false;
            }
        }
        if (!z17) {
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
            java.lang.String str = this.f378824g;
            if (c20976x6ba6452a != null) {
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.l.d(c20976x6ba6452a, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new j23.w(yVar, str, null), 2, null);
            }
            if (str == null) {
                str = "";
            }
            long j17 = this.f378823f;
            android.content.Context context = yVar.f496092e;
            if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity");
                j75.f m67437x4bd5310 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) context).m67437x4bd5310();
                if (m67437x4bd5310 != null) {
                    m67437x4bd5310.B3(new fi0.j(j17, str, true));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
