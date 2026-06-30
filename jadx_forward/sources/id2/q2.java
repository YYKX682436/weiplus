package id2;

/* loaded from: classes3.dex */
public final class q2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f372291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f372292e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f372293f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(r45.nw1 nw1Var, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f372292e = nw1Var;
        this.f372293f = context;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new id2.q2(this.f372292e, this.f372293f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((id2.q2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f372291d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.i72 i72Var = (r45.i72) this.f372292e.m75936x14adae67(44);
            long m75942xfb822ef2 = i72Var != null ? i72Var.m75942xfb822ef2(12) : 0L;
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            this.f372291d = 1;
            obj = ((c61.l7) b6Var).pl(m75942xfb822ef2, null, 0, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj;
        if (c19792x256d2725 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePersonalCente", "Attempting to jump to replay feed");
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            s40.w0.ba((s40.w0) c17, this.f372293f, c19792x256d2725, false, null, 12, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLivePersonalCente", "Failed to obtain jumpReplayFinderObject");
        }
        return jz5.f0.f384359a;
    }
}
