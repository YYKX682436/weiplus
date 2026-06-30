package zg2;

/* loaded from: classes3.dex */
public final class d extends p012xc85e97e9.p093xedfae76a.j0 {

    /* renamed from: d, reason: collision with root package name */
    public yz5.p f554355d;

    public d(yz5.p pVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f554355d = (i17 & 1) != 0 ? null : pVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.g0
    /* renamed from: observe */
    public void mo7806x9d92d11c(p012xc85e97e9.p093xedfae76a.y owner, p012xc85e97e9.p093xedfae76a.k0 observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        super.mo7806x9d92d11c(owner, new zg2.c(this, observer));
    }

    @Override // p012xc85e97e9.p093xedfae76a.g0
    /* renamed from: observeForever */
    public void mo7807xc74540ab(p012xc85e97e9.p093xedfae76a.k0 observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        super.mo7807xc74540ab(new zg2.c(this, observer));
    }
}
