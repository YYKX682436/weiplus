package dk2;

/* loaded from: classes12.dex */
public final class lb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f315265d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(java.util.List list) {
        super(1);
        this.f315265d = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(!dk2.mb.a(((java.lang.Number) obj).intValue(), this.f315265d));
    }
}
