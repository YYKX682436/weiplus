package aw2;

/* loaded from: classes10.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.x0 f14800d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(aw2.x0 x0Var) {
        super(0);
        this.f14800d = x0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long longExtra = this.f14800d.f14807d.getIntent().getLongExtra("key_ref_feed_id", 0L);
        if (longExtra != 0) {
            return bu2.j.f24534a.h(longExtra);
        }
        return null;
    }
}
