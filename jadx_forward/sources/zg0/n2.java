package zg0;

/* loaded from: classes.dex */
public final class n2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f554299d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(android.content.Intent intent) {
        super(0);
        this.f554299d = intent;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        return java.lang.Boolean.valueOf(this.f554299d.getBooleanExtra("vertical_scroll", true));
    }
}
