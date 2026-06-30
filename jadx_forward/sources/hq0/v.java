package hq0;

/* loaded from: classes7.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iq0.e f364597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hq0.b0 f364598e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(iq0.e eVar, hq0.b0 b0Var) {
        super(0);
        this.f364597d = eVar;
        this.f364598e = b0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        iq0.e eVar = this.f364597d;
        int i17 = eVar.f375192c;
        hq0.b0 b0Var = this.f364598e;
        if (i17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f364504y, "innerRemoveOffScreenFrameSetViewFromCache but cacheSize <= 0");
        } else {
            java.util.List J1 = hq0.b0.J1(b0Var, eVar, wq0.b.f530028e);
            int size = J1.size() - i17;
            if (size > 0) {
                java.util.List F0 = kz5.n0.F0(J1, new hq0.u());
                if (F0.size() > size) {
                    java.util.Iterator it = kz5.n0.K0(F0, size).iterator();
                    while (it.hasNext()) {
                        fq0.x frameSet = ((com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d) it.next()).getFrameSet();
                        if (frameSet != null) {
                            java.lang.String a17 = vq0.b.a(b0Var, eVar.f375190a, frameSet.f347010a);
                            d75.b.g(new hq0.w(b0Var, eVar, a17));
                            java.lang.String rootConfigId = eVar.a();
                            mq0.l0 l0Var = b0Var.E;
                            l0Var.getClass();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootConfigId, "rootConfigId");
                            mq0.k0 k0Var = (mq0.k0) l0Var.f412117b.get(rootConfigId);
                            if (k0Var != null) {
                                k0Var.f412108c++;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f364504y, "innerRemoveOffScreenFrameSetViewFromCache frameSetId: " + a17);
                        }
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
