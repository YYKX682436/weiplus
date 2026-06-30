package t26;

/* loaded from: classes14.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t26.a f496885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f496886e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t26.a aVar, java.lang.Runnable runnable) {
        super(1);
        this.f496885d = aVar;
        this.f496886e = runnable;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        this.f496885d.f496877e.removeCallbacks(this.f496886e);
        return jz5.f0.f384359a;
    }
}
