package gf5;

/* loaded from: classes11.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf5.n f352940d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(gf5.n nVar) {
        super(0);
        this.f352940d = nVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        lz5.m mVar = new lz5.m();
        gf5.n nVar = this.f352940d;
        for (gf5.b0 b0Var : (java.util.List) nVar.f352953m.mo141623x754a37bb()) {
            java.util.Set set = (java.util.Set) mVar.get(b0Var.f352913a);
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            java.util.Iterator it = b0Var.f352914b.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(nVar.f((java.lang.String) it.next()));
            }
            gf5.z zVar = b0Var.f352913a;
            if (set == null) {
                mVar.put(zVar, linkedHashSet);
            } else {
                java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet(set);
                linkedHashSet2.addAll(linkedHashSet);
                mVar.put(zVar, linkedHashSet2);
            }
        }
        return kz5.b1.b(mVar);
    }
}
