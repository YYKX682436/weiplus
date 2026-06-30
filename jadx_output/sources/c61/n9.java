package c61;

/* loaded from: classes.dex */
public final class n9 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f39188d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f39189e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f39190f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(android.content.Intent intent, long j17, yz5.l lVar) {
        super(2);
        this.f39188d = intent;
        this.f39189e = j17;
        this.f39190f = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent intent = this.f39188d;
        intent.putExtra("KEY_INTENT_ENTER_ITEM_ID", this.f39189e);
        intent.putExtra("KEY_INTENT_FLUENT_VIDEO_ENTER", true);
        this.f39190f.invoke(java.lang.Boolean.FALSE);
        return jz5.f0.f302826a;
    }
}
