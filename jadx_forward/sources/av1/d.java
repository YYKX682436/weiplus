package av1;

/* loaded from: classes5.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.ui.ActivityC13086x84522870 f95710d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.ui.ActivityC13086x84522870 activityC13086x84522870) {
        super(0);
        this.f95710d = activityC13086x84522870;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.ArrayList<java.lang.String> stringArrayListExtra = this.f95710d.getIntent().getStringArrayListExtra("params_image_path");
        return stringArrayListExtra == null ? new java.util.ArrayList() : stringArrayListExtra;
    }
}
