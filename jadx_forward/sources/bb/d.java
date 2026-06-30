package bb;

/* loaded from: classes13.dex */
public final class d implements com.p176xb6135e39.p271xde6bf207.p275xe5548316.InterfaceC2735x45fc5824 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f100239a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f100240b = new java.util.HashMap();

    public d(java.lang.Iterable iterable, com.p176xb6135e39.p271xde6bf207.p275xe5548316.C2734x24013cdd... c2734x24013cddArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((com.p176xb6135e39.p271xde6bf207.p275xe5548316.InterfaceC2738x6324e090) it.next()).mo20451xd3953b0c());
        }
        java.util.Collections.addAll(arrayList, c2734x24013cddArr);
        java.util.HashMap hashMap = new java.util.HashMap(arrayList.size());
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            com.p176xb6135e39.p271xde6bf207.p275xe5548316.C2734x24013cdd c2734x24013cdd = (com.p176xb6135e39.p271xde6bf207.p275xe5548316.C2734x24013cdd) it6.next();
            bb.e eVar = new bb.e(c2734x24013cdd);
            for (java.lang.Class cls : c2734x24013cdd.f126170a) {
                if (hashMap.put(cls, eVar) != null) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Multiple components provide %s.", cls));
                }
            }
        }
        for (bb.e eVar2 : hashMap.values()) {
            for (com.p176xb6135e39.p271xde6bf207.p275xe5548316.C2739x7540af6b c2739x7540af6b : eVar2.f100241a.f126171b) {
                c2739x7540af6b.getClass();
                bb.e eVar3 = (bb.e) hashMap.get(c2739x7540af6b.f126178a);
                if (eVar3 != null) {
                    ((java.util.HashSet) eVar2.f100242b).add(eVar3);
                    ((java.util.HashSet) eVar3.f100243c).add(eVar2);
                }
            }
        }
        java.util.HashSet hashSet = new java.util.HashSet(hashMap.values());
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.Iterator it7 = hashSet.iterator();
        while (it7.hasNext()) {
            bb.e eVar4 = (bb.e) it7.next();
            if (((java.util.HashSet) eVar4.f100243c).isEmpty()) {
                hashSet2.add(eVar4);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (!hashSet2.isEmpty()) {
            bb.e eVar5 = (bb.e) hashSet2.iterator().next();
            hashSet2.remove(eVar5);
            arrayList2.add(eVar5.f100241a);
            java.util.Iterator it8 = ((java.util.HashSet) eVar5.f100242b).iterator();
            while (it8.hasNext()) {
                bb.e eVar6 = (bb.e) it8.next();
                ((java.util.HashSet) eVar6.f100243c).remove(eVar5);
                if (((java.util.HashSet) eVar6.f100243c).isEmpty()) {
                    hashSet2.add(eVar6);
                }
            }
        }
        if (arrayList2.size() != arrayList.size()) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it9 = hashSet.iterator();
            while (it9.hasNext()) {
                bb.e eVar7 = (bb.e) it9.next();
                if (!((java.util.HashSet) eVar7.f100243c).isEmpty() && !((java.util.HashSet) eVar7.f100242b).isEmpty()) {
                    arrayList3.add(eVar7.f100241a);
                }
            }
            throw new com.p176xb6135e39.p271xde6bf207.p275xe5548316.C2740xa57b9e54(arrayList3);
        }
        java.util.Collections.reverse(arrayList2);
        java.util.List<com.p176xb6135e39.p271xde6bf207.p275xe5548316.C2734x24013cdd> unmodifiableList = java.util.Collections.unmodifiableList(arrayList2);
        this.f100239a = unmodifiableList;
        for (com.p176xb6135e39.p271xde6bf207.p275xe5548316.C2734x24013cdd c2734x24013cdd2 : unmodifiableList) {
            bb.f fVar = new bb.f(c2734x24013cdd2.f126173d, new bb.h(c2734x24013cdd2.f126171b, this));
            java.util.Iterator it10 = c2734x24013cdd2.f126170a.iterator();
            while (it10.hasNext()) {
                ((java.util.HashMap) this.f100240b).put((java.lang.Class) it10.next(), fVar);
            }
        }
        for (com.p176xb6135e39.p271xde6bf207.p275xe5548316.C2734x24013cdd c2734x24013cdd3 : this.f100239a) {
            for (com.p176xb6135e39.p271xde6bf207.p275xe5548316.C2739x7540af6b c2739x7540af6b2 : c2734x24013cdd3.f126171b) {
                c2739x7540af6b2.getClass();
                java.util.HashMap hashMap2 = (java.util.HashMap) this.f100240b;
                java.lang.Class cls2 = c2739x7540af6b2.f126178a;
                if (!hashMap2.containsKey(cls2)) {
                    throw new com.p176xb6135e39.p271xde6bf207.p275xe5548316.C2742xa9614e1e(java.lang.String.format("Unsatisfied dependency for component %s: %s", c2734x24013cdd3, cls2));
                }
            }
        }
    }

    @Override // com.p176xb6135e39.p271xde6bf207.p275xe5548316.InterfaceC2735x45fc5824
    public final java.lang.Object get(java.lang.Class cls) {
        return bb.a.get(this, cls);
    }

    @Override // com.p176xb6135e39.p271xde6bf207.p275xe5548316.InterfaceC2735x45fc5824
    /* renamed from: getProvider */
    public final com.p176xb6135e39.p271xde6bf207.p277xb96ca991.InterfaceC2748xc8fe6a11 mo10084x40fe4367(java.lang.Class cls) {
        if (cls != null) {
            return (com.p176xb6135e39.p271xde6bf207.p277xb96ca991.InterfaceC2748xc8fe6a11) ((java.util.HashMap) this.f100240b).get(cls);
        }
        throw new java.lang.NullPointerException("Null interface requested.");
    }
}
