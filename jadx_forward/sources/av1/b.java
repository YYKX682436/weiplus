package av1;

/* loaded from: classes5.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.ui.ActivityC13086x84522870 f95708d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.ui.ActivityC13086x84522870 activityC13086x84522870) {
        super(0);
        this.f95708d = activityC13086x84522870;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String stringExtra = this.f95708d.getIntent().getStringExtra("params_activity_callback_id");
        return stringExtra == null ? "" : stringExtra;
    }
}
