package qx4;

/* loaded from: classes8.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f448953e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(java.lang.String str, int i17) {
        super(0);
        this.f448952d = str;
        this.f448953e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.os.Looper.myQueue().addIdleHandler(new qx4.j0(this.f448952d, this.f448953e));
        return jz5.f0.f384359a;
    }
}
