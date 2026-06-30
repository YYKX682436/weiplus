package zj3;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f554834a = new java.util.ArrayList();

    public final void a() {
        java.util.List list = this.f554834a;
        jz5.l lVar = (jz5.l) kz5.n0.k0(list);
        if (lVar != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
        }
    }

    public final void b() {
        ((java.util.ArrayList) this.f554834a).add(new jz5.l(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 0L));
    }

    public final void c() {
        jz5.l lVar = (jz5.l) kz5.n0.k0(this.f554834a);
        boolean z17 = false;
        if (lVar != null && ((java.lang.Number) lVar.f384367e).longValue() == 0) {
            z17 = true;
        }
        if (z17) {
            a();
        }
    }

    public final java.lang.String d() {
        return kz5.n0.g0(this.f554834a, ";", null, null, 0, null, zj3.e.f554833d, 30, null);
    }

    public final long e() {
        long j17 = 0;
        for (jz5.l lVar : this.f554834a) {
            long longValue = ((java.lang.Number) lVar.f384367e).longValue();
            java.lang.Object obj = lVar.f384366d;
            j17 += longValue > ((java.lang.Number) obj).longValue() ? ((java.lang.Number) lVar.f384367e).longValue() - ((java.lang.Number) obj).longValue() : 0L;
        }
        return j17 / 1000;
    }
}
