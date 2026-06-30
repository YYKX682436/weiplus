package f06;

/* loaded from: classes15.dex */
public final class e0 implements java.lang.reflect.TypeVariable, java.lang.reflect.Type {

    /* renamed from: d, reason: collision with root package name */
    public final f06.x f339981d;

    public e0(f06.x typeParameter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeParameter, "typeParameter");
        this.f339981d = typeParameter;
    }

    /* renamed from: equals */
    public boolean m128648xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.reflect.TypeVariable) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(getName(), ((java.lang.reflect.TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    public java.lang.reflect.Type[] getBounds() {
        i06.y3 y3Var = (i06.y3) this.f339981d;
        y3Var.getClass();
        f06.v vVar = i06.y3.f368334g[0];
        java.lang.Object mo152xb9724478 = y3Var.f368336e.mo152xb9724478();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo152xb9724478, "getValue(...)");
        java.util.List list = (java.util.List) mo152xb9724478;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(f06.h0.b((f06.w) it.next(), true));
        }
        return (java.lang.reflect.Type[]) arrayList.toArray(new java.lang.reflect.Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public java.lang.reflect.GenericDeclaration getGenericDeclaration() {
        throw new jz5.k("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f339981d));
    }

    @Override // java.lang.reflect.TypeVariable
    public java.lang.String getName() {
        return ((i06.y3) this.f339981d).b();
    }

    @Override // java.lang.reflect.Type
    public java.lang.String getTypeName() {
        return getName();
    }

    /* renamed from: hashCode */
    public int m128649x8cdac1b() {
        getName();
        getGenericDeclaration();
        throw null;
    }

    /* renamed from: toString */
    public java.lang.String m128650x9616526c() {
        return getName();
    }
}
