package ng1;

/* loaded from: classes7.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ng1.c f418446d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ng1.c cVar) {
        super(1);
        this.f418446d = cVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.LinkedList<jx3.a> linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 it = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        ng1.c cVar = this.f418446d;
        synchronized (cVar.f418449b) {
            linkedList = new java.util.LinkedList(cVar.f418449b);
            cVar.f418449b.clear();
        }
        for (jx3.a aVar : linkedList) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<this>");
            aVar.k();
        }
        return jz5.f0.f384359a;
    }
}
