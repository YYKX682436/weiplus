package bg2;

/* loaded from: classes.dex */
public final class q5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20412d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(int i17) {
        super(0);
        this.f20412d = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.FINDER_LIVE_FEED_LONG_PRESS_LAST_SHOW_CNT_INT_SYNC, java.lang.Integer.valueOf(this.f20412d + 1));
        return jz5.f0.f302826a;
    }
}
