package qy0;

/* loaded from: classes5.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qy0.d0 f449178d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(qy0.d0 d0Var) {
        super(0);
        this.f449178d = d0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qy0.d0 d0Var = this.f449178d;
        p3325xe03a0797.p3326xc267989b.y0 mo144225x95f74600 = d0Var.mo144225x95f74600();
        java.util.List list = d0Var.W6().f151301d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) obj).mo63659xfb85f7b0() == 1) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next()).f219963e);
        }
        return new com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.C11004x58386388(mo144225x95f74600, arrayList2);
    }
}
