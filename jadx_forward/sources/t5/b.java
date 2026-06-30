package t5;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final t5.a f497216a = new t5.a(null);

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f497217b = new java.util.HashMap();

    /* renamed from: toString */
    public java.lang.String m165878x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LinkedMultimap( ");
        t5.a aVar = this.f497216a;
        t5.a aVar2 = aVar.f497215d;
        while (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar2, aVar)) {
            sb6.append('{');
            sb6.append(aVar2.f497212a);
            sb6.append(':');
            java.util.List list = aVar2.f497213b;
            sb6.append(list == null ? 0 : ((java.util.ArrayList) list).size());
            sb6.append('}');
            aVar2 = aVar2.f497215d;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar2, aVar)) {
                sb6.append(", ");
            }
        }
        sb6.append(" )");
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "StringBuilder().apply(builderAction).toString()");
        return sb7;
    }
}
