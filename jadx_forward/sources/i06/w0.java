package i06;

/* loaded from: classes15.dex */
public final class w0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.f1 f368309d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(i06.f1 f1Var) {
        super(0);
        this.f368309d = f1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        y16.s z17 = this.f368309d.a().z();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(z17, "getUnsubstitutedInnerClassesScope(...)");
        java.util.Collection a17 = y16.v.a(z17, null, null, 3, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : a17) {
            if (!r16.i.n((o06.m) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o06.m mVar = (o06.m) it.next();
            o06.g gVar = mVar instanceof o06.g ? (o06.g) mVar : null;
            java.lang.Class k17 = gVar != null ? i06.o4.k(gVar) : null;
            i06.k1 k1Var = k17 != null ? new i06.k1(k17) : null;
            if (k1Var != null) {
                arrayList2.add(k1Var);
            }
        }
        return arrayList2;
    }
}
