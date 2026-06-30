package i06;

/* loaded from: classes15.dex */
public final class u extends i06.y {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Field f368287a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.lang.reflect.Field field) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(field, "field");
        this.f368287a = field;
    }

    @Override // i06.y
    public java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.reflect.Field field = this.f368287a;
        java.lang.String name = field.getName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
        sb6.append(x06.o0.a(name));
        sb6.append("()");
        java.lang.Class<?> type = field.getType();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(type, "getType(...)");
        sb6.append(u06.i.b(type));
        return sb6.toString();
    }
}
