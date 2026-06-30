package e33;

/* loaded from: classes8.dex */
public final class a5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15657x27c936d2 f328655d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15657x27c936d2 activityC15657x27c936d2) {
        super(0);
        this.f328655d = activityC15657x27c936d2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        return java.lang.Boolean.valueOf(this.f328655d.getIntent().getBooleanExtra("key_check_permission_on_create", true));
    }
}
