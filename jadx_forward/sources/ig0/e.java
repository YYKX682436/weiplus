package ig0;

/* loaded from: classes12.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ig0.o f372845d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p3325xe03a0797.p3326xc267989b.y0 y0Var, ig0.o oVar) {
        super(2);
        this.f372845d = oVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        jz5.f0 f0Var;
        c01.v8 v8Var;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        java.lang.String msgTalker = (java.lang.String) obj;
        long longValue = ((java.lang.Number) obj2).longValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgTalker, "msgTalker");
        try {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(msgTalker, longValue);
            if (k17 != null) {
                ig0.o oVar = this.f372845d;
                java.lang.ref.WeakReference weakReference = oVar.f372866m;
                if (weakReference != null && (v8Var = (c01.v8) weakReference.get()) != null) {
                    v8Var.a(k17);
                }
                ((ku5.t0) ku5.t0.f394148d).B(new ig0.n(oVar, k17));
                f0Var = f0Var2;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceMsgFeatureService", "asyncDownloadVoice notifiers msgInfo is null");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceMsgFeatureService", "asyncDownloadVoice notifiers error: " + e17);
        }
        return f0Var2;
    }
}
