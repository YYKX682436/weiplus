package sf;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static sf.b f488473b;

    /* renamed from: a, reason: collision with root package name */
    public static final sf.c f488472a = new sf.c();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Queue f488474c = new java.util.ArrayDeque(2);

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, sf.b content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (tVar == null || lVar == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appBrandPage == null: ");
            sb6.append(tVar == null);
            sb6.append(", appBrandService == null: ");
            sb6.append(lVar == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.ExtendEditableKeyboardHeightDispatcher", sb6.toString());
            return;
        }
        f488473b = content;
        yz5.a aVar = content.f488471d;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        sf.b bVar = f488473b;
        if (bVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1 p1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1();
            int i17 = bVar.f488468a > 0 ? bVar.f488469b : 0;
            java.lang.Integer num = bVar.f488470c;
            if ((num != null ? num.intValue() : -1) < 0) {
                num = null;
            }
            p1Var.s("height", java.lang.Integer.valueOf(ik1.w.e(i17)));
            if (num != null) {
                p1Var.s("viewId", java.lang.Integer.valueOf(num.intValue()));
            }
            p1Var.u(lVar);
            p1Var.m();
            p1Var.u(tVar);
            p1Var.m();
        }
        f488473b = null;
    }

    public final boolean b() {
        java.util.Queue queue = f488474c;
        if (((java.util.ArrayDeque) queue).size() < 2) {
            return true;
        }
        sf.a aVar = (sf.a) kz5.n0.W(queue);
        int i17 = aVar != null ? aVar.f488466a : -1;
        sf.a aVar2 = (sf.a) kz5.n0.h0(queue);
        return i17 == (aVar2 != null ? aVar2.f488466a : -1);
    }

    public final void c(sf.a action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        java.util.Queue queue = f488474c;
        if (!queue.isEmpty()) {
            if (action.f488467b == ((sf.a) kz5.n0.h0(queue)).f488467b) {
                return;
            }
        }
        if (((java.util.ArrayDeque) queue).size() == 2) {
            ((java.util.ArrayDeque) queue).poll();
        }
        ((java.util.ArrayDeque) queue).offer(action);
    }
}
