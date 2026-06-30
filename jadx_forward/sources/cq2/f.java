package cq2;

/* loaded from: classes2.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f302912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f302913e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.g f302914f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ys5.e f302915g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.fa2 f302916h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i17, int i18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, ys5.e eVar, r45.fa2 fa2Var) {
        super(0);
        this.f302912d = i17;
        this.f302913e = i18;
        this.f302914f = gVar;
        this.f302915g = eVar;
        this.f302916h = fa2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f302912d;
        int i18 = this.f302913e;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f302914f;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.u80 u80Var = new r45.u80();
        u80Var.set(0, java.lang.Integer.valueOf(this.f302913e));
        r45.fa2 fa2Var = this.f302916h;
        u80Var.set(1, fa2Var.f455665n);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList card_list = fa2Var.f455662h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(card_list, "card_list");
        java.util.Iterator it = card_list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.ea2) it.next()).m75936x14adae67(2);
            if (c19792x256d2725 != null && c19792x256d2725.m76784x5db1b11() != 0) {
                arrayList.add(java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11()));
            }
        }
        u80Var.m75941xfb821914(2).addAll(arrayList);
        u80Var.set(3, java.lang.Integer.valueOf(card_list.size()));
        linkedList.add(u80Var);
        return new aq2.b(new aq2.a(i17, i18, gVar, "", linkedList, 135, 0L, null, null, 0, 0.0f, this.f302915g == ys5.e.f546790e, null, null, null, false, null, 128960, null), null, null, 6, null);
    }
}
