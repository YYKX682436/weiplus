package q16;

/* loaded from: classes15.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q16.a0 f441319d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(q16.a0 a0Var) {
        super(0);
        this.f441319d = a0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        q16.v vVar = q16.v.f441318d;
        q16.a0 a0Var = this.f441319d;
        a0Var.getClass();
        q16.g0 g0Var = a0Var.f441234d;
        g0Var.getClass();
        q16.g0 g0Var2 = new q16.g0();
        java.lang.reflect.Field[] declaredFields = q16.g0.class.getDeclaredFields();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredFields, "getDeclaredFields(...)");
        int length = declaredFields.length;
        ?? r76 = 0;
        int i17 = 0;
        while (i17 < length) {
            java.lang.reflect.Field field = declaredFields[i17];
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                java.lang.Object obj = field.get(g0Var);
                b06.b bVar = obj instanceof b06.b ? (b06.b) obj : null;
                if (bVar != null) {
                    java.lang.String name = field.getName();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
                    r26.i0.y(name, "is", r76);
                    f06.d a17 = p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(q16.g0.class);
                    java.lang.String name2 = field.getName();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get");
                    java.lang.String name3 = field.getName();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name3, "getName(...)");
                    if (name3.length() > 0 ? true : r76) {
                        char upperCase = java.lang.Character.toUpperCase(name3.charAt(r76));
                        java.lang.String substring = name3.substring(1);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                        name3 = upperCase + substring;
                    }
                    sb6.append(name3);
                    new p3321xbce91901.jvm.p3324x21ffc6bd.a0(a17, name2, sb6.toString());
                    field.set(g0Var2, new q16.e0(bVar.f98522a, g0Var2));
                }
            }
            i17++;
            r76 = 0;
        }
        vVar.mo146xb9724478(g0Var2);
        g0Var2.f441263a = true;
        return new q16.a0(g0Var2);
    }
}
