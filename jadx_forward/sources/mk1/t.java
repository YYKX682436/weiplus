package mk1;

/* loaded from: classes7.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f408649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f408650e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(float f17, float f18) {
        super(1);
        this.f408649d = f17;
        this.f408650e = f18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ye1.r doOrAddPendingAction = (ye1.r) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(doOrAddPendingAction, "$this$doOrAddPendingAction");
        doOrAddPendingAction.c(this.f408649d, this.f408650e);
        return jz5.f0.f384359a;
    }
}
