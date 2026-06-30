package xj1;

/* loaded from: classes7.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e.C12708x81c12732 f536337d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e.C12708x81c12732 c12708x81c12732) {
        super(0);
        this.f536337d = c12708x81c12732;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        android.content.Intent intent;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = this.f536337d.mo7430x19263085();
        if (mo7430x19263085 != null && (intent = mo7430x19263085.getIntent()) != null) {
            i17 = 8;
            int intExtra = intent.getIntExtra("extra_get_usage_reason", 8);
            int intExtra2 = intent.getIntExtra("extra_get_usage_prescene", 0);
            if (intExtra != 7) {
                if (intExtra == 8 && intExtra2 == 2) {
                    i17 = 6;
                }
            }
            return java.lang.Integer.valueOf(i17);
        }
        i17 = 3;
        return java.lang.Integer.valueOf(i17);
    }
}
