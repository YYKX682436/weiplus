package m50;

/* loaded from: classes.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m50.x f405020d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m50.x xVar) {
        super(0);
        this.f405020d = xVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        m50.x xVar = this.f405020d;
        if (!xVar.m158354x19263085().isFinishing() && !xVar.m158354x19263085().isDestroyed()) {
            xVar.m158354x19263085().finish();
        }
        return jz5.f0.f384359a;
    }
}
