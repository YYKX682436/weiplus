package sj5;

/* loaded from: classes2.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f490455d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.content.Context context) {
        super(0);
        this.f490455d = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        return java.lang.Float.valueOf(android.view.ViewConfiguration.get(this.f490455d).getScaledTouchSlop());
    }
}
