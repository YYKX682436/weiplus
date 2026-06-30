package bp4;

/* loaded from: classes10.dex */
public final class j1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.m1 f104736d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(bp4.m1 m1Var) {
        super(2);
        this.f104736d = m1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        uq5.y yVar;
        ((java.lang.Number) obj).intValue();
        ro4.e item = (ro4.e) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        boolean z17 = item instanceof ro4.d;
        bp4.m1 m1Var = this.f104736d;
        if (z17) {
            com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc = so4.g.f492314f;
            if (c22979xbb268bc != null) {
                uq5.k kVar = uq5.k.PAGGlobalAnimateEffect;
                android.content.res.AssetManager assets = m1Var.f104789d.getContext().getAssets();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(assets, "getAssets(...)");
                yVar = c22979xbb268bc.h(kVar, assets, ((ro4.d) item).f479658b.f479649a);
            } else {
                yVar = null;
            }
            com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc2 = so4.g.f492314f;
            if (c22979xbb268bc2 != null) {
                c22979xbb268bc2.c(yVar);
            }
            bp4.k0 k0Var = m1Var.f104792g;
            k0Var.A();
            com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb68 = k0Var.f104747m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textureViewSurfaceTextureListenerC22778x581fb68);
            long m82509xa86cd69f = textureViewSurfaceTextureListenerC22778x581fb68.m82509xa86cd69f();
            long j17 = 0;
            long j18 = m82509xa86cd69f + j17;
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 u0Var = m1Var.f104791f;
            if (j18 > u0Var.f257276t.h()) {
                j18 = u0Var.f257276t.h();
                m82509xa86cd69f = java.lang.Math.max(j18 - j17, 0L);
            }
            long j19 = m82509xa86cd69f;
            long j27 = j18;
            if (yVar != null) {
                yVar.b(j19, j27);
            }
            ro4.b bVar = new ro4.b(((ro4.d) item).f479658b, yVar, j19, j27, 0, 16, null);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("add magic: ");
            sb6.append(yVar);
            sb6.append(", ");
            sb6.append(yVar != null ? java.lang.Long.valueOf(yVar.f511800a) : null);
            sb6.append(", ");
            sb6.append(j19);
            sb6.append(", ");
            sb6.append(j27);
            sb6.append(", 0");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiEditMagicPlugin", sb6.toString());
            ro4.c cVar = m1Var.f104800r;
            cVar.getClass();
            java.util.LinkedList linkedList = cVar.f479656a;
            linkedList.add(0, bVar);
            bVar.f479655f = linkedList.size();
            m1Var.f104798p.x(cVar.a());
            bp4.m1.a(m1Var, bVar);
            m1Var.f104794i.m68236x76500a7f(false);
        } else if (item instanceof ro4.b) {
            bp4.m1.a(m1Var, (ro4.b) item);
            m1Var.f104794i.m68236x76500a7f(false);
        }
        return jz5.f0.f384359a;
    }
}
