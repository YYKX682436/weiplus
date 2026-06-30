package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class u3 extends wu5.m {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f289627d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f289628e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public int f289629f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w3 f289630g;

    public u3(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w3 w3Var, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22370x7a6f3d0d c22370x7a6f3d0d) {
        this.f289630g = w3Var;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized java.lang.Integer call() {
        if (this.f289630g.f289748d.size() <= 1 && !this.f289630g.f289748d.contains(null)) {
            if (this.f289630g.f289748d.size() > 0) {
                java.lang.String str = (java.lang.String) this.f289630g.f289748d.remove(0);
                if (str == null) {
                    d();
                } else {
                    e(str);
                }
            }
        }
        d();
        return java.lang.Integer.valueOf(this.f289629f);
    }

    public synchronized com.p314xaae8f345.mm.ui.p2695x2c1ddc83.v3 c(java.util.Set set) {
        int i17;
        int i18;
        int i19;
        int i27;
        long c17 = c01.id.c() - 86400000;
        i17 = 0;
        i18 = 0;
        i19 = 0;
        i27 = 0;
        for (java.util.Map.Entry entry : ((java.util.HashMap) this.f289627d).entrySet()) {
            if (((java.lang.Integer) entry.getValue()).intValue() > 0 && (set == null || set.contains(entry.getKey()))) {
                java.lang.Long l17 = (java.lang.Long) ((java.util.HashMap) this.f289628e).get(entry.getKey());
                if (l17 == null || l17.longValue() < c17) {
                    i18++;
                    i27 += ((java.lang.Integer) entry.getValue()).intValue();
                } else {
                    i17++;
                    i19 += ((java.lang.Integer) entry.getValue()).intValue();
                }
            }
        }
        return new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.v3(i17, i18, i19, i27);
    }

    public final void d() {
        this.f289629f = 0;
        java.util.Map map = this.f289627d;
        ((java.util.HashMap) map).clear();
        java.util.Map map2 = this.f289628e;
        ((java.util.HashMap) map2).clear();
        this.f289630g.f289748d.clear();
        for (java.util.Map.Entry entry : c01.h2.f(1).entrySet()) {
            int d17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.l4) entry.getValue()).d1();
            this.f289629f += d17;
            ((java.util.HashMap) map).put((java.lang.String) entry.getKey(), java.lang.Integer.valueOf(d17));
            ((java.util.HashMap) map2).put((java.lang.String) entry.getKey(), java.lang.Long.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.l4) entry.getValue()).w0()));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationUnreadHelper", "refreshAllFromDb totalCount = " + this.f289629f);
    }

    public final void e(java.lang.String str) {
        int d17 = !c01.h2.h(str) ? c01.h2.d(str, c01.e2.f118653d) : 0;
        java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) this.f289627d).put(str, java.lang.Integer.valueOf(d17));
        this.f289629f += num == null ? d17 : d17 - num.intValue();
        java.util.Map map = this.f289628e;
        if (d17 > 0) {
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).p(str);
            ((java.util.HashMap) map).put(str, java.lang.Long.valueOf(p17 != null ? p17.w0() : 0L));
        } else {
            ((java.util.HashMap) map).remove(str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationUnreadHelper", "refreshPartialFromDb username %s, preUnread %s, unread %d", str, num, java.lang.Integer.valueOf(d17));
    }
}
