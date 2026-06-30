package oj5;

/* loaded from: classes14.dex */
public final class q extends java.util.concurrent.ConcurrentHashMap {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oj5.r f427409d;

    public q(oj5.r rVar) {
        this.f427409d = rVar;
    }

    public final void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        if (k3Var != null && k3Var.f3639x46306858.getParent() == null) {
            android.view.View view = k3Var.f3639x46306858;
            oj5.r rVar = this.f427409d;
            rVar.getClass();
            if ((view != null ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view.getTag(com.p314xaae8f345.mm.R.id.f563884c6), 1) : false) || (k3Var instanceof oj5.p)) {
                return;
            }
            jz5.g gVar = oj5.x.f427439a;
            java.lang.reflect.Field declaredField = p012xc85e97e9.p103xe821e364.p104xd1075a44.k3.class.getDeclaredField("mFlags");
            declaredField.setAccessible(true);
            declaredField.set(k3Var, 6);
            android.view.View itemView = k3Var.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            rVar.d(itemView, true);
            rVar.f427416f.d(k3Var);
        }
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof java.lang.Integer) {
            return super.containsKey((java.lang.Integer) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (obj instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) {
            return super.containsValue((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof java.lang.Integer) {
            return (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) super.get((java.lang.Integer) obj);
        }
        return null;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return !(obj instanceof java.lang.Integer) ? obj2 : (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) super.getOrDefault((java.lang.Integer) obj, (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) obj2);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object remove(java.lang.Object obj) {
        if (obj instanceof java.lang.Integer) {
            return (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) super.remove((java.lang.Integer) obj);
        }
        return null;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* bridge */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        if ((obj instanceof java.lang.Integer) && (obj2 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.k3)) {
            return super.remove((java.lang.Integer) obj, (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) obj2);
        }
        return false;
    }
}
