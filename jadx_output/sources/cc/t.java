package cc;

/* loaded from: classes14.dex */
public final class t extends java.util.AbstractCollection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cc.u f40399d;

    public t(cc.u uVar) {
        this.f40399d = uVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        ((cc.r) this.f40399d).b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        java.util.Iterator it = ((cc.e0) this.f40399d.a()).values().iterator();
        while (it.hasNext()) {
            if (((java.util.Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        cc.r rVar = (cc.r) this.f40399d;
        rVar.getClass();
        return new cc.b(rVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return ((cc.r) this.f40399d).f40398h;
    }
}
