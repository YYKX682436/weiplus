package bb;

/* loaded from: classes13.dex */
public final class d implements com.google.firebase.components.ComponentContainer {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f18706a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f18707b = new java.util.HashMap();

    public d(java.lang.Iterable iterable, com.google.firebase.components.Component... componentArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((com.google.firebase.components.ComponentRegistrar) it.next()).getComponents());
        }
        java.util.Collections.addAll(arrayList, componentArr);
        java.util.HashMap hashMap = new java.util.HashMap(arrayList.size());
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            com.google.firebase.components.Component component = (com.google.firebase.components.Component) it6.next();
            bb.e eVar = new bb.e(component);
            for (java.lang.Class cls : component.f44637a) {
                if (hashMap.put(cls, eVar) != null) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Multiple components provide %s.", cls));
                }
            }
        }
        for (bb.e eVar2 : hashMap.values()) {
            for (com.google.firebase.components.Dependency dependency : eVar2.f18708a.f44638b) {
                dependency.getClass();
                bb.e eVar3 = (bb.e) hashMap.get(dependency.f44645a);
                if (eVar3 != null) {
                    ((java.util.HashSet) eVar2.f18709b).add(eVar3);
                    ((java.util.HashSet) eVar3.f18710c).add(eVar2);
                }
            }
        }
        java.util.HashSet hashSet = new java.util.HashSet(hashMap.values());
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.Iterator it7 = hashSet.iterator();
        while (it7.hasNext()) {
            bb.e eVar4 = (bb.e) it7.next();
            if (((java.util.HashSet) eVar4.f18710c).isEmpty()) {
                hashSet2.add(eVar4);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (!hashSet2.isEmpty()) {
            bb.e eVar5 = (bb.e) hashSet2.iterator().next();
            hashSet2.remove(eVar5);
            arrayList2.add(eVar5.f18708a);
            java.util.Iterator it8 = ((java.util.HashSet) eVar5.f18709b).iterator();
            while (it8.hasNext()) {
                bb.e eVar6 = (bb.e) it8.next();
                ((java.util.HashSet) eVar6.f18710c).remove(eVar5);
                if (((java.util.HashSet) eVar6.f18710c).isEmpty()) {
                    hashSet2.add(eVar6);
                }
            }
        }
        if (arrayList2.size() != arrayList.size()) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it9 = hashSet.iterator();
            while (it9.hasNext()) {
                bb.e eVar7 = (bb.e) it9.next();
                if (!((java.util.HashSet) eVar7.f18710c).isEmpty() && !((java.util.HashSet) eVar7.f18709b).isEmpty()) {
                    arrayList3.add(eVar7.f18708a);
                }
            }
            throw new com.google.firebase.components.DependencyCycleException(arrayList3);
        }
        java.util.Collections.reverse(arrayList2);
        java.util.List<com.google.firebase.components.Component> unmodifiableList = java.util.Collections.unmodifiableList(arrayList2);
        this.f18706a = unmodifiableList;
        for (com.google.firebase.components.Component component2 : unmodifiableList) {
            bb.f fVar = new bb.f(component2.f44640d, new bb.h(component2.f44638b, this));
            java.util.Iterator it10 = component2.f44637a.iterator();
            while (it10.hasNext()) {
                ((java.util.HashMap) this.f18707b).put((java.lang.Class) it10.next(), fVar);
            }
        }
        for (com.google.firebase.components.Component component3 : this.f18706a) {
            for (com.google.firebase.components.Dependency dependency2 : component3.f44638b) {
                dependency2.getClass();
                java.util.HashMap hashMap2 = (java.util.HashMap) this.f18707b;
                java.lang.Class cls2 = dependency2.f44645a;
                if (!hashMap2.containsKey(cls2)) {
                    throw new com.google.firebase.components.MissingDependencyException(java.lang.String.format("Unsatisfied dependency for component %s: %s", component3, cls2));
                }
            }
        }
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final java.lang.Object get(java.lang.Class cls) {
        return bb.a.get(this, cls);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final com.google.firebase.inject.Provider getProvider(java.lang.Class cls) {
        if (cls != null) {
            return (com.google.firebase.inject.Provider) ((java.util.HashMap) this.f18707b).get(cls);
        }
        throw new java.lang.NullPointerException("Null interface requested.");
    }
}
