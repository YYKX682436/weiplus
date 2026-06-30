package bb2;

/* loaded from: classes10.dex */
public final class r2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13684x82c14eb0 f100510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f100511e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13684x82c14eb0 c13684x82c14eb0, int i17) {
        super(0);
        this.f100510d = c13684x82c14eb0;
        this.f100511e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13684x82c14eb0 c13684x82c14eb0 = this.f100510d;
        if (c13684x82c14eb0.m55608xfb7f4e14().h2(c13684x82c14eb0.getBulletManager().f100579k)) {
            c13684x82c14eb0.getBulletManager().q(this.f100511e);
        }
        return jz5.f0.f384359a;
    }
}
