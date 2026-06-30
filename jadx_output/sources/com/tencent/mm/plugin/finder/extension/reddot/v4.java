package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes5.dex */
public final class v4 implements ys.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f105919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.bt2 f105920b;

    public v4(java.lang.String str, r45.bt2 bt2Var) {
        this.f105919a = str;
        this.f105920b = bt2Var;
    }

    @Override // ys.e
    public void a(java.lang.String sessionId, int i17, java.util.Map map) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        if (i17 == 0) {
            if ((map == null || map.isEmpty()) || !kotlin.jvm.internal.o.b(sessionId, this.f105919a)) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
            for (java.util.Map.Entry entry : map.entrySet()) {
                r45.nq2 nq2Var = new r45.nq2();
                nq2Var.set(0, (java.lang.String) entry.getKey());
                nq2Var.set(1, java.lang.Float.valueOf(((java.lang.Number) entry.getValue()).floatValue()));
                arrayList.add(nq2Var);
            }
            this.f105920b.set(9, new java.util.LinkedList(arrayList));
        }
    }
}
