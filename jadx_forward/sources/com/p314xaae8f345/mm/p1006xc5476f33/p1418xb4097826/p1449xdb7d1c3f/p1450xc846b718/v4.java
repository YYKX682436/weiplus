package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes5.dex */
public final class v4 implements ys.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187452a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.bt2 f187453b;

    public v4(java.lang.String str, r45.bt2 bt2Var) {
        this.f187452a = str;
        this.f187453b = bt2Var;
    }

    @Override // ys.e
    public void a(java.lang.String sessionId, int i17, java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        if (i17 == 0) {
            if ((map == null || map.isEmpty()) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(sessionId, this.f187452a)) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
            for (java.util.Map.Entry entry : map.entrySet()) {
                r45.nq2 nq2Var = new r45.nq2();
                nq2Var.set(0, (java.lang.String) entry.getKey());
                nq2Var.set(1, java.lang.Float.valueOf(((java.lang.Number) entry.getValue()).floatValue()));
                arrayList.add(nq2Var);
            }
            this.f187453b.set(9, new java.util.LinkedList(arrayList));
        }
    }
}
