package sc;

/* loaded from: classes5.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f487163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f487164e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.Class cls, java.lang.String str) {
        super(0);
        this.f487163d = cls;
        this.f487164e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.reflect.Field declaredField = this.f487163d.getDeclaredField(this.f487164e);
        declaredField.setAccessible(true);
        return declaredField;
    }
}
