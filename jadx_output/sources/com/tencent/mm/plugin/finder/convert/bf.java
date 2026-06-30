package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class bf extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f102967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.d1 f102968e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout f102969f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(in5.s0 s0Var, so2.d1 d1Var, com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout) {
        super(1);
        this.f102967d = s0Var;
        this.f102968e = d1Var;
        this.f102969f = finderFullSeekBarLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Context context = this.f102967d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.m50 m50Var = (com.tencent.mm.plugin.finder.viewmodel.component.m50) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.m50.class);
        long j17 = this.f102968e.getFeedObject().field_id;
        boolean z17 = !booleanValue;
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout fullSeekBarLayout = this.f102969f;
        kotlin.jvm.internal.o.f(fullSeekBarLayout, "$fullSeekBarLayout");
        m50Var.getClass();
        m50Var.Q6("playImage." + z17 + " feedId=" + pm0.v.u(j17));
        if (m50Var.f135129i > 0) {
            com.tencent.mm.sdk.platformtools.b4 b4Var = m50Var.f135136s;
            if (z17) {
                if (!m50Var.f135134q) {
                    m50Var.P6(0, true, j17, 0, 0, true);
                    m50Var.f135132o = -1L;
                    m50Var.f135137t = null;
                    b4Var.d();
                }
                m50Var.f135135r = true;
            } else {
                m50Var.f135133p = j17;
                m50Var.f135124d = 1;
                b4Var.c(1000L, 1000L);
                m50Var.f135137t = fullSeekBarLayout;
                m50Var.f135134q = false;
                if (m50Var.f135135r) {
                    m50Var.P6(m50Var.f135132o == j17 ? 1 : 0, true, j17, 0, 0, false);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
