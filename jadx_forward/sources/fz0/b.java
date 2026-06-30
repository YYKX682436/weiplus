package fz0;

/* loaded from: classes10.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f348815d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Intent intent) {
        super(0);
        this.f348815d = intent;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Intent intent = this.f348815d;
        java.lang.String stringExtra = intent.getStringExtra("key_finder_context_id");
        if (stringExtra != null) {
            return stringExtra;
        }
        java.lang.String stringExtra2 = intent.getStringExtra("key_context_id");
        return stringExtra2 == null ? "" : stringExtra2;
    }
}
