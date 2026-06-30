package b92;

/* loaded from: classes3.dex */
public final class c1 extends qz5.l implements yz5.p {
    public final /* synthetic */ long L;

    /* renamed from: d, reason: collision with root package name */
    public int f99940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f99941e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99942f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(yl2.g1 g1Var, java.lang.String str, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f99941e = g1Var;
        this.f99942f = str;
        this.L = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new b92.c1(this.f99941e, this.f99942f, this.L, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b92.c1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f99940d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            yl2.g1 g1Var = this.f99941e;
            this.f99940d = 1;
            obj = yl2.g1.t(g1Var, null, false, this, 3, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        yl2.a0 a0Var = (yl2.a0) obj;
        if (a0Var instanceof yl2.x) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommonLiveService", "startChatLiveWithPrefilledTopic startLiveCheck failed, errCode=" + ((yl2.x) a0Var).f544614a);
        } else {
            boolean z17 = a0Var instanceof yl2.z;
            yl2.g1 g1Var2 = this.f99941e;
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommonLiveService", "startChatLiveWithPrefilledTopic continueLive (recover existing live, no prefill)");
                g1Var2.d(((yl2.z) a0Var).f544620a);
            } else if (a0Var instanceof yl2.y) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startChatLiveWithPrefilledTopic goToLive with prefilledTopic=");
                java.lang.String str = this.f99942f;
                sb6.append(str);
                sb6.append(", mode=Voice/NewVoiceChatRoom");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommonLiveService", sb6.toString());
                ((ml2.j0) i95.n0.c(ml2.j0.class)).ck(ml2.y3.f409815t);
                ml2.j0.f409116i.a("entrance_type", java.lang.String.valueOf(18));
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("KEY_PARAMS_POST_CREATE_LIVE_WITH_MODE", true);
                intent.putExtra("KEY_PARAMS_POST_CREATE_LIVE_MODE", 2);
                intent.putExtra("KEY_PARAMS_POST_CREATE_LIVE_SUB_MODE", 16);
                if (!(str == null || str.length() == 0)) {
                    intent.putExtra("KEY_PARAMS_PREFILLED_LIVE_TOPIC", str);
                    intent.putExtra("KEY_PARAMS_PREFILLED_MIC_TOPIC", str);
                    intent.putExtra("KEY_PARAMS_PREFILLED_MIC_TOPIC_SOURCE", 1);
                    intent.putExtra("KEY_PARAMS_PREFILLED_MIC_TOPIC_REF_FEED_ID", this.L);
                }
                g1Var2.h(intent, ((yl2.y) a0Var).f544616a, false);
            }
        }
        return jz5.f0.f384359a;
    }
}
