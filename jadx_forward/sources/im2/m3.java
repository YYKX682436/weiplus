package im2;

/* loaded from: classes.dex */
public final class m3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f373972d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(im2.z3 z3Var) {
        super(0);
        this.f373972d = z3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String stringExtra = this.f373972d.m158359x1e885992().getStringExtra("KEY_FINDER_LIVE_NOTICE_CREATE_SESSION_ID");
        if (stringExtra == null || stringExtra.length() == 0) {
            stringExtra = java.lang.String.valueOf(c01.id.c());
        }
        return stringExtra == null ? "" : stringExtra;
    }
}
