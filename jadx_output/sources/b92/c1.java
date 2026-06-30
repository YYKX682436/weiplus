package b92;

/* loaded from: classes3.dex */
public final class c1 extends qz5.l implements yz5.p {
    public final /* synthetic */ long L;

    /* renamed from: d, reason: collision with root package name */
    public int f18407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f18408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18409f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(yl2.g1 g1Var, java.lang.String str, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f18408e = g1Var;
        this.f18409f = str;
        this.L = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new b92.c1(this.f18408e, this.f18409f, this.L, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b92.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f18407d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yl2.g1 g1Var = this.f18408e;
            this.f18407d = 1;
            obj = yl2.g1.t(g1Var, null, false, this, 3, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        yl2.a0 a0Var = (yl2.a0) obj;
        if (a0Var instanceof yl2.x) {
            com.tencent.mars.xlog.Log.i("FinderCommonLiveService", "startChatLiveWithPrefilledTopic startLiveCheck failed, errCode=" + ((yl2.x) a0Var).f463081a);
        } else {
            boolean z17 = a0Var instanceof yl2.z;
            yl2.g1 g1Var2 = this.f18408e;
            if (z17) {
                com.tencent.mars.xlog.Log.i("FinderCommonLiveService", "startChatLiveWithPrefilledTopic continueLive (recover existing live, no prefill)");
                g1Var2.d(((yl2.z) a0Var).f463087a);
            } else if (a0Var instanceof yl2.y) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startChatLiveWithPrefilledTopic goToLive with prefilledTopic=");
                java.lang.String str = this.f18409f;
                sb6.append(str);
                sb6.append(", mode=Voice/NewVoiceChatRoom");
                com.tencent.mars.xlog.Log.i("FinderCommonLiveService", sb6.toString());
                ((ml2.j0) i95.n0.c(ml2.j0.class)).ck(ml2.y3.f328282t);
                ml2.j0.f327583i.a("entrance_type", java.lang.String.valueOf(18));
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
                g1Var2.h(intent, ((yl2.y) a0Var).f463083a, false);
            }
        }
        return jz5.f0.f302826a;
    }
}
