package hr3;

/* loaded from: classes3.dex */
public final class dd extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16867xd9c62d0d f365019d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16867xd9c62d0d activityC16867xd9c62d0d) {
        super(0);
        this.f365019d = activityC16867xd9c62d0d;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String stringExtra = this.f365019d.getIntent().getStringExtra("INTENT_KEY_REPORT_SESSION_ID");
        return stringExtra == null ? "" : stringExtra;
    }
}
