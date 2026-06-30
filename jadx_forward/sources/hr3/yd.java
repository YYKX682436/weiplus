package hr3;

/* loaded from: classes5.dex */
public final class yd extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16870x8255eb46 f365745d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16870x8255eb46 activityC16870x8255eb46) {
        super(0);
        this.f365745d = activityC16870x8255eb46;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String stringExtra = this.f365745d.getIntent().getStringExtra("Contact_User");
        return stringExtra == null ? "" : stringExtra;
    }
}
