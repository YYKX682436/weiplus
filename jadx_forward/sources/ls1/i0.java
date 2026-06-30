package ls1;

/* loaded from: classes8.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f402525d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(int i17) {
        super(0);
        this.f402525d = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.os.Looper.myQueue().addIdleHandler(new ls1.h0(this.f402525d));
        return jz5.f0.f384359a;
    }
}
