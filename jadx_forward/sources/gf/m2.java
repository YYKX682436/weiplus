package gf;

/* loaded from: classes7.dex */
public final class m2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf.n2 f352664d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(gf.n2 n2Var) {
        super(0);
        this.f352664d = n2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        x.b bVar;
        gf.n2 n2Var = this.f352664d;
        if (n2Var.f352678h && n2Var.f352680m && n2Var.f352681n) {
            k91.r rVar = n2Var.f352674d;
            synchronized (rVar.f387274h) {
                java.util.Map map = rVar.g() ? rVar.f387276m : rVar.f387275i;
                if (map == null) {
                    bVar = null;
                } else {
                    bVar = new x.b(map.size());
                    for (java.util.Map.Entry entry : map.entrySet()) {
                        java.lang.String str = (java.lang.String) entry.getKey();
                        k91.j jVar = ((k91.f) entry.getValue()).f387111u;
                        if (jVar != null) {
                            bVar.put(str, jVar);
                        }
                    }
                }
            }
            if (bVar != null) {
                gf.n2 n2Var2 = this.f352664d;
                java.util.Iterator it = ((x.i) bVar.entrySet()).iterator();
                while (it.hasNext()) {
                    java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
                    java.lang.String str2 = (java.lang.String) entry2.getKey();
                    k91.j jVar2 = (k91.j) entry2.getValue();
                    if (n2Var2.a(jVar2 != null ? jVar2.f387155a : null)) {
                        n2Var2.f352684q.a(str2, 1);
                        return java.lang.Boolean.TRUE;
                    }
                    n2Var2.f352684q.a(str2, 0);
                }
            }
        }
        return java.lang.Boolean.FALSE;
    }
}
