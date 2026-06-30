package bb2;

/* loaded from: classes10.dex */
public final class e2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13683xee96bb27 f100383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f100384e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f100385f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13683xee96bb27 c13683xee96bb27, int i17, boolean z17) {
        super(0);
        this.f100383d = c13683xee96bb27;
        this.f100384e = i17;
        this.f100385f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13683xee96bb27 c13683xee96bb27 = this.f100383d;
        if (c13683xee96bb27.isAttachedToWindow()) {
            if (c13683xee96bb27.m55605xfb7f4e14().h2(c13683xee96bb27.getBulletManager().f100579k)) {
                c13683xee96bb27.getBulletManager().q(this.f100384e);
            }
            if (c13683xee96bb27.h() && !this.f100385f) {
                c13683xee96bb27.j();
                c13683xee96bb27.getBulletManager().getClass();
                xp.d.f().f537395s = false;
            }
        }
        return jz5.f0.f384359a;
    }
}
