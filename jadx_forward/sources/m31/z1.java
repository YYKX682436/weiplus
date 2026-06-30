package m31;

/* loaded from: classes9.dex */
public final class z1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11168xbe8821ca f404776d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11168xbe8821ca activityC11168xbe8821ca) {
        super(0);
        this.f404776d = activityC11168xbe8821ca;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String stringExtra = this.f404776d.getIntent().getStringExtra("key_subscribe_url");
        return stringExtra == null ? "" : stringExtra;
    }
}
