package hr3;

/* loaded from: classes3.dex */
public final class gd extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16867xd9c62d0d f365120d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16867xd9c62d0d activityC16867xd9c62d0d) {
        super(0);
        this.f365120d = activityC16867xd9c62d0d;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String stringExtra = this.f365120d.getIntent().getStringExtra("INTENT_KEY_TIPS_WORDING");
        return stringExtra == null ? "" : stringExtra;
    }
}
