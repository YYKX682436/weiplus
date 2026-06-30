package eb2;

/* loaded from: classes2.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db2.n3 f332307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f332308e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f332309f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ db2.c3 f332310g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(db2.n3 n3Var, int i17, java.util.List list, db2.c3 c3Var) {
        super(0);
        this.f332307d = n3Var;
        this.f332308e = i17;
        this.f332309f = list;
        this.f332310g = c3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tabType=");
        sb6.append(this.f332307d.f309612d);
        sb6.append(" pullType=");
        sb6.append(this.f332308e);
        sb6.append(" valid=");
        sb6.append(this.f332309f.size());
        sb6.append(" raw=");
        db2.c3 c3Var = this.f332310g;
        sb6.append(c3Var.m75941xfb821914(1).size());
        sb6.append(' ');
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("invalidFeed=");
        java.util.LinkedList m75941xfb821914 = c3Var.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : m75941xfb821914) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj);
            if (!hc2.o0.C(r6)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next();
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(pm0.v.u(c19792x256d2725.m76784x5db1b11()));
            sb8.append('#');
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
            sb8.append(m76802x2dd01666 != null ? java.lang.Integer.valueOf(m76802x2dd01666.m76964x7f025288()) : null);
            arrayList2.add(sb8.toString());
        }
        sb7.append(arrayList2);
        sb6.append(r26.i0.v(sb7.toString(), ",", ";", false, 4, null));
        return sb6.toString();
    }
}
