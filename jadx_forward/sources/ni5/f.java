package ni5;

/* loaded from: classes.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192 f419323d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192 activityC22459x1ac69192) {
        super(0);
        this.f419323d = activityC22459x1ac69192;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        return java.lang.Integer.valueOf(this.f419323d.getIntent().getIntExtra("KOrientation", -1));
    }
}
