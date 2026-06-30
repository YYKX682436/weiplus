package ay1;

/* loaded from: classes2.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.y f96731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ay1.l f96732e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p012xc85e97e9.p093xedfae76a.y yVar, ay1.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f96731d = yVar;
        this.f96732e = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ay1.a(this.f96731d, this.f96732e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ay1.a aVar = (ay1.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        aVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        final p012xc85e97e9.p093xedfae76a.y yVar = this.f96731d;
        if (yVar != null && (mo273xed6858b4 = yVar.mo273xed6858b4()) != null) {
            if (!(mo273xed6858b4.b() != p012xc85e97e9.p093xedfae76a.n.DESTROYED)) {
                mo273xed6858b4 = null;
            }
            if (mo273xed6858b4 != null) {
                final ay1.l lVar = this.f96732e;
                mo273xed6858b4.a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.datapreloader.FutureTask$1$2
                    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
                    /* renamed from: onDestroy */
                    public final void m54630xac79a11b() {
                        ay1.l lVar2 = ay1.l.this;
                        p3325xe03a0797.p3326xc267989b.z0.d(lVar2.d(), lVar2.f() + ", onDestroy", null, 2, null);
                        if (lVar2.f96759b != null) {
                            lVar2.b().b();
                        } else {
                            p3325xe03a0797.p3326xc267989b.l.d(lVar2.d(), null, null, new ay1.d(lVar2, null), 3, null);
                        }
                        yVar.mo273xed6858b4().c(this);
                    }
                });
            }
        }
        return jz5.f0.f384359a;
    }
}
