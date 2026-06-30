package mk1;

/* loaded from: classes7.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f408648d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(android.view.Surface surface) {
        super(1);
        this.f408648d = surface;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ye1.r doOrAddPendingAction = (ye1.r) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(doOrAddPendingAction, "$this$doOrAddPendingAction");
        doOrAddPendingAction.mo1864x42c875eb(this.f408648d);
        return jz5.f0.f384359a;
    }
}
