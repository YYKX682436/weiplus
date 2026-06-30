package o20;

/* loaded from: classes14.dex */
public final class a0 implements o20.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p737xc53e9ae1.C10556x2b36b1cb f423900a;

    public a0(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p737xc53e9ae1.C10556x2b36b1cb c10556x2b36b1cb) {
        this.f423900a = c10556x2b36b1cb;
    }

    @Override // o20.u
    public void a(o20.t oldState, o20.t newState) {
        android.widget.ImageView m44391x4baea9ad;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldState, "oldState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newState, "newState");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(newState, o20.p.f423929a)) {
            m44391x4baea9ad = this.f423900a.m44391x4baea9ad();
            m44391x4baea9ad.setVisibility(8);
        }
    }
}
