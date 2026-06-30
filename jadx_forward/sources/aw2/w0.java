package aw2;

/* loaded from: classes10.dex */
public final class w0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.x0 f96337d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(aw2.x0 x0Var) {
        super(0);
        this.f96337d = x0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String stringExtra = this.f96337d.f96340d.getIntent().getStringExtra("KEY_FINDER_POST_TOPIC_WORD");
        return stringExtra == null ? "" : stringExtra;
    }
}
