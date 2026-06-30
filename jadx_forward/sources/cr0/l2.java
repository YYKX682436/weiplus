package cr0;

/* loaded from: classes12.dex */
public final class l2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr0.j f303209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f303210e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(cr0.j jVar, long j17) {
        super(1);
        this.f303209d = jVar;
        this.f303210e = j17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.Map it = (java.util.Map) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        cr0.u1 u1Var = cr0.u1.f303293a;
        it.put("enable", java.lang.Integer.valueOf((int) (!u1Var.e() ? 0 : u1Var.g().f303290a)));
        cr0.j jVar = this.f303209d;
        it.put("uid-collect-min", java.lang.Long.valueOf(jVar.f303320d.f477085a.longValue() / com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8));
        long j17 = 0;
        it.put("uid-collect-ratio", java.lang.Long.valueOf(this.f303210e > 0 ? a06.d.c((jVar.f303320d.f477085a.floatValue() * 100.0f) / ((float) r3)) : -1L));
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
        java.util.List b17 = jVar.b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : b17) {
            java.lang.String str2 = ((cr0.r) obj2).f303258d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            if (!r26.i0.A(str2, str, false, 2, null)) {
                arrayList.add(obj2);
            }
        }
        java.util.List F0 = kz5.n0.F0(arrayList, new cr0.k2());
        if (!F0.isEmpty()) {
            java.util.Iterator it6 = F0.iterator();
            while (it6.hasNext()) {
                java.lang.Number number = ((cr0.r) it6.next()).f303260f.f477085a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number, "get(...)");
                j17 += ((java.lang.Long) number).longValue();
            }
            it.put("sum", java.lang.Long.valueOf(j17));
        }
        return jz5.f0.f384359a;
    }
}
