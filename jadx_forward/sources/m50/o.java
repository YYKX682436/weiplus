package m50;

/* loaded from: classes.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m50.x f405029d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m50.x xVar) {
        super(0);
        this.f405029d = xVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        m50.x xVar = this.f405029d;
        java.lang.String stringExtra = xVar.m158359x1e885992().getStringExtra("Retr_Msg_view_model");
        if (stringExtra == null) {
            stringExtra = "";
        }
        co.a V6 = xVar.V6();
        V6.m126728xdc93280d(stringExtra);
        return V6;
    }
}
