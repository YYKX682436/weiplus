package c61;

/* loaded from: classes.dex */
public final class n9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f120721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f120722e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f120723f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(android.content.Intent intent, long j17, yz5.l lVar) {
        super(2);
        this.f120721d = intent;
        this.f120722e = j17;
        this.f120723f = lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent intent = this.f120721d;
        intent.putExtra("KEY_INTENT_ENTER_ITEM_ID", this.f120722e);
        intent.putExtra("KEY_INTENT_FLUENT_VIDEO_ENTER", true);
        this.f120723f.mo146xb9724478(java.lang.Boolean.FALSE);
        return jz5.f0.f384359a;
    }
}
