package sp2;

/* loaded from: classes2.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f492710d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(sp2.o2 o2Var) {
        super(0);
        this.f492710d = o2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String stringExtra;
        android.content.Intent intent = this.f492710d.f492654a.getIntent();
        return (intent == null || (stringExtra = intent.getStringExtra("NEARBY_LIVE_TARGET_FROM_COMMENT_SCENE_KEY")) == null) ? "" : stringExtra;
    }
}
