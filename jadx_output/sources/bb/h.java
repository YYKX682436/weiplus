package bb;

/* loaded from: classes13.dex */
public final class h implements com.google.firebase.components.ComponentContainer {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f18716a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f18717b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.firebase.components.ComponentContainer f18718c;

    public h(java.lang.Iterable iterable, com.google.firebase.components.ComponentContainer componentContainer) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            com.google.firebase.components.Dependency dependency = (com.google.firebase.components.Dependency) it.next();
            dependency.getClass();
            hashSet.add(dependency.f44645a);
        }
        this.f18716a = java.util.Collections.unmodifiableSet(hashSet);
        this.f18717b = java.util.Collections.unmodifiableSet(hashSet2);
        this.f18718c = componentContainer;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final java.lang.Object get(java.lang.Class cls) {
        if (this.f18716a.contains(cls)) {
            return this.f18718c.get(cls);
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Requesting %s is not allowed.", cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final com.google.firebase.inject.Provider getProvider(java.lang.Class cls) {
        if (this.f18717b.contains(cls)) {
            return this.f18718c.getProvider(cls);
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Requesting Provider<%s> is not allowed.", cls));
    }
}
