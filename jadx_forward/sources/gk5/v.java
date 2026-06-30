package gk5;

/* loaded from: classes3.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk5.y f354256d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(gk5.y yVar) {
        super(0);
        this.f354256d = yVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        gk5.y yVar = this.f354256d;
        if (!yVar.m158354x19263085().isFinishing() && !yVar.m158354x19263085().isDestroyed()) {
            yVar.m158354x19263085().setResult(0);
            yVar.m158354x19263085().finish();
        }
        return jz5.f0.f384359a;
    }
}
