package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.MultiValueSet */
/* loaded from: classes13.dex */
public abstract class AbstractC0729x433a916a<C> {

    /* renamed from: mSet */
    private java.util.Set<C> f1709x32d0b5 = new java.util.HashSet();

    /* renamed from: addAll */
    public void m5516xab35b940(java.util.List<C> list) {
        this.f1709x32d0b5.addAll(list);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0729x433a916a<C> m5518x5a5dd5d();

    /* renamed from: getAllItems */
    public java.util.List<C> m5519xe5d39815() {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList(this.f1709x32d0b5));
    }
}
