package gq2;

/* loaded from: classes2.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gq2.j f356088d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(gq2.j jVar) {
        super(0);
        this.f356088d = jVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String stringExtra;
        android.content.Intent intent = this.f356088d.f356095e.getIntent();
        return (intent == null || (stringExtra = intent.getStringExtra("NEARBY_LIVE_TARGET_FROM_COMMENT_SCENE_KEY")) == null) ? "" : stringExtra;
    }
}
