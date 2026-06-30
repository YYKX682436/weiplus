package bb;

/* loaded from: classes13.dex */
public final class h implements com.p176xb6135e39.p271xde6bf207.p275xe5548316.InterfaceC2735x45fc5824 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f100249a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f100250b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p176xb6135e39.p271xde6bf207.p275xe5548316.InterfaceC2735x45fc5824 f100251c;

    public h(java.lang.Iterable iterable, com.p176xb6135e39.p271xde6bf207.p275xe5548316.InterfaceC2735x45fc5824 interfaceC2735x45fc5824) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            com.p176xb6135e39.p271xde6bf207.p275xe5548316.C2739x7540af6b c2739x7540af6b = (com.p176xb6135e39.p271xde6bf207.p275xe5548316.C2739x7540af6b) it.next();
            c2739x7540af6b.getClass();
            hashSet.add(c2739x7540af6b.f126178a);
        }
        this.f100249a = java.util.Collections.unmodifiableSet(hashSet);
        this.f100250b = java.util.Collections.unmodifiableSet(hashSet2);
        this.f100251c = interfaceC2735x45fc5824;
    }

    @Override // com.p176xb6135e39.p271xde6bf207.p275xe5548316.InterfaceC2735x45fc5824
    public final java.lang.Object get(java.lang.Class cls) {
        if (this.f100249a.contains(cls)) {
            return this.f100251c.get(cls);
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Requesting %s is not allowed.", cls));
    }

    @Override // com.p176xb6135e39.p271xde6bf207.p275xe5548316.InterfaceC2735x45fc5824
    /* renamed from: getProvider */
    public final com.p176xb6135e39.p271xde6bf207.p277xb96ca991.InterfaceC2748xc8fe6a11 mo10084x40fe4367(java.lang.Class cls) {
        if (this.f100250b.contains(cls)) {
            return this.f100251c.mo10084x40fe4367(cls);
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Requesting Provider<%s> is not allowed.", cls));
    }
}
