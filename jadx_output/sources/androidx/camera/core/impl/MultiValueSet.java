package androidx.camera.core.impl;

/* loaded from: classes13.dex */
public abstract class MultiValueSet<C> {
    private java.util.Set<C> mSet = new java.util.HashSet();

    public void addAll(java.util.List<C> list) {
        this.mSet.addAll(list);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public abstract androidx.camera.core.impl.MultiValueSet<C> m2clone();

    public java.util.List<C> getAllItems() {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList(this.mSet));
    }
}
