package yg2;

/* loaded from: classes3.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yg2.b f543849d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yg2.b bVar) {
        super(0);
        this.f543849d = bVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        final yg2.b bVar = this.f543849d;
        bVar.f543850d.mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.finder.live.infrastructure.coroutine.LiveScope$1$1
            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
            /* renamed from: onDestroy */
            public final void m56831xac79a11b() {
                yg2.b bVar2 = yg2.b.this;
                p3325xe03a0797.p3326xc267989b.z0.e(bVar2, null, 1, null);
                bVar2.f543850d.mo273xed6858b4().c(this);
                bVar2.f543853g.mo10668x2efc64();
            }
        });
        return jz5.f0.f384359a;
    }
}
