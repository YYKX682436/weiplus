package v22;

/* loaded from: classes10.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v22.z f514393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f514394e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(v22.z zVar, boolean z17) {
        super(0);
        this.f514393d = zVar;
        this.f514394e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        v22.z zVar = this.f514393d;
        long j17 = zVar.f514417o;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        zVar.f514416n = java.lang.System.currentTimeMillis() - j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiMixer", "mix used " + zVar.f514416n + "ms, frame:" + zVar.f514412j);
        boolean z18 = this.f514394e;
        if (z18) {
            long j18 = zVar.f514416n;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("markEmojiMixSucc, costTime:");
            sb6.append(j18);
            sb6.append(", removeBackground:");
            boolean z19 = zVar.f514407e;
            sb6.append(z19);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.C(1012L, 21L, 1L);
            if (z19) {
                g0Var.C(1012L, 23L, 1L);
            } else {
                g0Var.C(1012L, 22L, 1L);
            }
            if (z19) {
                g0Var.C(1012L, 42L, j18);
            } else {
                g0Var.C(1012L, 39L, j18);
            }
        }
        yz5.l lVar = zVar.f514415m;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(z18));
        }
        return jz5.f0.f384359a;
    }
}
