package u06;

/* loaded from: classes16.dex */
public final class a0 extends u06.f0 implements e16.k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Constructor f505020a;

    public a0(java.lang.reflect.Constructor member) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(member, "member");
        this.f505020a = member;
    }

    @Override // u06.f0
    public java.lang.reflect.Member c() {
        return this.f505020a;
    }

    @Override // e16.w
    /* renamed from: getTypeParameters */
    public java.util.List mo126782xb121b9ba() {
        java.lang.reflect.TypeVariable[] typeParameters = this.f505020a.getTypeParameters();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(typeParameters, "getTypeParameters(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(typeParameters.length);
        for (java.lang.reflect.TypeVariable typeVariable : typeParameters) {
            arrayList.add(new u06.l0(typeVariable));
        }
        return arrayList;
    }
}
