package bn2;

/* loaded from: classes14.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn2.i f104388d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(bn2.i iVar) {
        super(1);
        this.f104388d = iVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        lo0.m mostRevealedGroup = (lo0.m) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mostRevealedGroup, "mostRevealedGroup");
        bn2.i iVar = this.f104388d;
        java.util.Iterator it = ((java.util.ArrayList) iVar.f104399i).iterator();
        while (it.hasNext()) {
            an2.a aVar = (an2.a) it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar.f90374b, mostRevealedGroup)) {
                iVar.f104400j.a(aVar);
                return jz5.f0.f384359a;
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
