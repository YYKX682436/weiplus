package bb2;

/* loaded from: classes10.dex */
public final class c2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13683xee96bb27 f100357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f100358e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13683xee96bb27 c13683xee96bb27, float f17) {
        super(0);
        this.f100357d = c13683xee96bb27;
        this.f100358e = f17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13683xee96bb27 c13683xee96bb27 = this.f100357d;
        if (c13683xee96bb27.isAttachedToWindow() && c13683xee96bb27.m55605xfb7f4e14().h2(c13683xee96bb27.getBulletManager().f100579k)) {
            c13683xee96bb27.getBulletManager().c(this.f100358e, c13683xee96bb27.getContext().getResources().getConfiguration().orientation == 2);
        }
        return jz5.f0.f384359a;
    }
}
