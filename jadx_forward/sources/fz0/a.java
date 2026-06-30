package fz0;

/* loaded from: classes5.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f348814d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Intent intent) {
        super(0);
        this.f348814d = intent;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String stringExtra = this.f348814d.getStringExtra("key_click_tab_context_id");
        return stringExtra == null ? "" : stringExtra;
    }
}
