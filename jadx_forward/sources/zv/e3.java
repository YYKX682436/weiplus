package zv;

/* loaded from: classes.dex */
public final class e3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f557492d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(long j17) {
        super(1);
        this.f557492d = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.content.Intent start = (android.content.Intent) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(start, "$this$start");
        start.putExtra(ya.b.f77502x92235c1b, (int) this.f557492d);
        return jz5.f0.f384359a;
    }
}
