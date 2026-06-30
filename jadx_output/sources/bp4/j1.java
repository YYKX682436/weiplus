package bp4;

/* loaded from: classes10.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.m1 f23203d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(bp4.m1 m1Var) {
        super(2);
        this.f23203d = m1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        uq5.y yVar;
        ((java.lang.Number) obj).intValue();
        ro4.e item = (ro4.e) obj2;
        kotlin.jvm.internal.o.g(item, "item");
        boolean z17 = item instanceof ro4.d;
        bp4.m1 m1Var = this.f23203d;
        if (z17) {
            com.tencent.mm.xeffect.effect.EffectManager effectManager = so4.g.f410781f;
            if (effectManager != null) {
                uq5.k kVar = uq5.k.PAGGlobalAnimateEffect;
                android.content.res.AssetManager assets = m1Var.f23256d.getContext().getAssets();
                kotlin.jvm.internal.o.f(assets, "getAssets(...)");
                yVar = effectManager.h(kVar, assets, ((ro4.d) item).f398125b.f398116a);
            } else {
                yVar = null;
            }
            com.tencent.mm.xeffect.effect.EffectManager effectManager2 = so4.g.f410781f;
            if (effectManager2 != null) {
                effectManager2.c(yVar);
            }
            bp4.k0 k0Var = m1Var.f23259g;
            k0Var.A();
            com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = k0Var.f23214m;
            kotlin.jvm.internal.o.d(videoCompositionPlayView);
            long position = videoCompositionPlayView.getPosition();
            long j17 = 0;
            long j18 = position + j17;
            com.tencent.mm.plugin.vlog.model.u0 u0Var = m1Var.f23258f;
            if (j18 > u0Var.f175743t.h()) {
                j18 = u0Var.f175743t.h();
                position = java.lang.Math.max(j18 - j17, 0L);
            }
            long j19 = position;
            long j27 = j18;
            if (yVar != null) {
                yVar.b(j19, j27);
            }
            ro4.b bVar = new ro4.b(((ro4.d) item).f398125b, yVar, j19, j27, 0, 16, null);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("add magic: ");
            sb6.append(yVar);
            sb6.append(", ");
            sb6.append(yVar != null ? java.lang.Long.valueOf(yVar.f430267a) : null);
            sb6.append(", ");
            sb6.append(j19);
            sb6.append(", ");
            sb6.append(j27);
            sb6.append(", 0");
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiEditMagicPlugin", sb6.toString());
            ro4.c cVar = m1Var.f23267r;
            cVar.getClass();
            java.util.LinkedList linkedList = cVar.f398123a;
            linkedList.add(0, bVar);
            bVar.f398122f = linkedList.size();
            m1Var.f23265p.x(cVar.a());
            bp4.m1.a(m1Var, bVar);
            m1Var.f23261i.setShow(false);
        } else if (item instanceof ro4.b) {
            bp4.m1.a(m1Var, (ro4.b) item);
            m1Var.f23261i.setShow(false);
        }
        return jz5.f0.f302826a;
    }
}
