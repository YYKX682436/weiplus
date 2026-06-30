package zh5;

/* loaded from: classes12.dex */
public final class a0 extends lf3.n implements sf3.e {

    /* renamed from: d, reason: collision with root package name */
    public final zh5.e0 f554530d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f554530d = new zh5.e0();
    }

    @Override // sf3.e
    /* renamed from: create */
    public sf3.d mo162294xaf65a0fc() {
        return new zh5.d0(m158354x19263085(), this.f554530d);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        ((lt0.f) this.f554530d.f554553a).mo143584x5a5b64d();
    }
}
