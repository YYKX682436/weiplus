package o50;

/* loaded from: classes5.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o50.j f424593d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o50.j jVar) {
        super(0);
        this.f424593d = jVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        o50.j jVar = this.f424593d;
        java.lang.String stringExtra = jVar.m158359x1e885992().getStringExtra("Retr_ForwardXmlContent");
        if (stringExtra == null) {
            stringExtra = "";
        }
        co.a T6 = jVar.T6();
        T6.m126728xdc93280d(stringExtra);
        T6.set(T6.f125235d + 6, java.lang.Boolean.valueOf(!((java.lang.Boolean) ((jz5.n) jVar.f424604h).mo141623x754a37bb()).booleanValue()));
        return T6;
    }
}
