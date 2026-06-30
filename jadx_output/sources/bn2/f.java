package bn2;

/* loaded from: classes14.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn2.i f22855d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(bn2.i iVar) {
        super(1);
        this.f22855d = iVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        lo0.m mostRevealedGroup = (lo0.m) obj;
        kotlin.jvm.internal.o.g(mostRevealedGroup, "mostRevealedGroup");
        bn2.i iVar = this.f22855d;
        java.util.Iterator it = ((java.util.ArrayList) iVar.f22866i).iterator();
        while (it.hasNext()) {
            an2.a aVar = (an2.a) it.next();
            if (kotlin.jvm.internal.o.b(aVar.f8841b, mostRevealedGroup)) {
                iVar.f22867j.a(aVar);
                return jz5.f0.f302826a;
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
