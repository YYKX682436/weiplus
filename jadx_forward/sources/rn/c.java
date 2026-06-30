package rn;

/* loaded from: classes13.dex */
public class c extends dm.d6 {
    public static final l75.e0 T = dm.d6.m124877x3593deb(rn.c.class);
    public final java.util.List S = new java.util.ArrayList();

    @Override // dm.d6, l75.f0
    /* renamed from: convertFrom */
    public void mo9015xbf5d97fd(android.database.Cursor cursor) {
        super.mo9015xbf5d97fd(cursor);
        java.util.ArrayList arrayList = (java.util.ArrayList) this.S;
        arrayList.clear();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f66258x2e3d1810)) {
            return;
        }
        for (java.lang.String str : this.f66258x2e3d1810.split(",")) {
            arrayList.add(java.lang.Long.valueOf(java.lang.Long.parseLong(str)));
        }
    }

    /* renamed from: equals */
    public boolean m162745xb2c87fbf(java.lang.Object obj) {
        rn.c cVar = (rn.c) obj;
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(cVar.f66264x1210aac6, this.f66264x1210aac6) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(cVar.f66259x137a1f8b, this.f66259x137a1f8b);
    }

    @Override // dm.d6, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return T;
    }

    public void t0(long j17) {
        java.util.List list = this.S;
        if (((java.util.ArrayList) list).contains(java.lang.Long.valueOf(j17))) {
            return;
        }
        ((java.util.ArrayList) list).add(java.lang.Long.valueOf(j17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            sb6.append(((java.lang.Long) it.next()).longValue());
            sb6.append(",");
        }
        if (sb6.length() - 1 >= 0) {
            sb6.deleteCharAt(sb6.length() - 1);
        }
        this.f66258x2e3d1810 = sb6.toString();
    }

    public long u0() {
        java.util.List list = this.S;
        if (((java.util.ArrayList) list).size() > 0) {
            return ((java.lang.Long) ((java.util.ArrayList) list).get(0)).longValue();
        }
        return 0L;
    }

    public boolean v0() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("roomannouncement@app.origin", this.f66266xdec927b);
    }
}
