package on2;

/* loaded from: classes3.dex */
public final class m1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ on2.a2 f428502d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(on2.a2 a2Var) {
        super(0);
        this.f428502d = a2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int m58105x1a7dbbfd;
        on2.a2 a2Var = this.f428502d;
        if (a2Var.f428363m) {
            float m58105x1a7dbbfd2 = a2Var.m58105x1a7dbbfd();
            float m58107x754ccc10 = a2Var.m58107x754ccc10();
            if (m58105x1a7dbbfd2 > m58107x754ccc10) {
                m58105x1a7dbbfd2 = m58107x754ccc10;
            }
            m58105x1a7dbbfd = (int) (m58105x1a7dbbfd2 - com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz));
        } else {
            m58105x1a7dbbfd = (int) (a2Var.m58105x1a7dbbfd() * (ae2.in.f85221a.h0() / 100.0f));
        }
        return java.lang.Integer.valueOf(m58105x1a7dbbfd);
    }
}
