package a13;

/* loaded from: classes14.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a13.t f565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f566e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(a13.t tVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f565d = tVar;
        this.f566e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new a13.p(this.f565d, this.f566e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        a13.p pVar = (a13.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        pVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        b13.m mVar = this.f565d.f577m;
        if (mVar != null) {
            boolean z17 = this.f566e;
            mVar.o0(z17 ? 3 : 4);
            mVar.z0(z17 ? "Speaker" : "Receiver", 20);
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVoipMgr", "onSpeakerStateChanged, isSpeakerOn: %b", java.lang.Boolean.valueOf(z17));
            vq4.m0 m0Var = (vq4.m0) mVar.f176373d;
            m0Var.getClass();
            if (mx3.f0.h()) {
                if (m0Var.C) {
                    m0Var.f439355s = z17 ? new cv.v0(1, null, 0, 6, null) : new cv.v0(2, null, 0, 6, null);
                    m0Var.f439354r = z17 ? new cv.v0(1, null, 0, 6, null) : new cv.v0(2, null, 0, 6, null);
                } else {
                    m0Var.f439355s = z17 ? new cv.v0(1, null, 0, 6, null) : new cv.v0(2, null, 0, 6, null);
                }
            }
            if (z17) {
                m0Var.l(1, true);
            } else {
                m0Var.l(2, true);
            }
            m0Var.f439352p = true;
        }
        return jz5.f0.f302826a;
    }
}
