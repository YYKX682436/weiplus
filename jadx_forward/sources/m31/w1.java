package m31;

/* loaded from: classes9.dex */
public final class w1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11168xbe8821ca f404761d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11168xbe8821ca activityC11168xbe8821ca) {
        super(0);
        this.f404761d = activityC11168xbe8821ca;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        return java.lang.Boolean.valueOf(this.f404761d.getIntent().getBooleanExtra("key_need_result", false));
    }
}
