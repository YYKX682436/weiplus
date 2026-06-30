package mt1;

/* loaded from: classes12.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f412784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f412785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f412786f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.UUID f412787g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.k5 f412788h;

    public p(java.util.List list, int i17, long j17, java.util.UUID uuid, com.p314xaae8f345.mm.vfs.k5 k5Var) {
        this.f412784d = list;
        this.f412785e = i17;
        this.f412786f = j17;
        this.f412787g = uuid;
        this.f412788h = k5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CalcWxNewService", "Refresh UUID: " + ot1.h.u0((java.lang.String) this.f412784d.get(this.f412785e)));
        ot1.j n17 = mt1.b0.f412724a.n();
        long j17 = this.f412788h.f294767d;
        n17.getClass();
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.util.UUID uuid = this.f412787g;
        objArr[0] = uuid == null ? null : c01.td.b(uuid);
        objArr[1] = java.lang.Long.valueOf(j17);
        objArr[2] = java.lang.Long.valueOf(this.f412786f);
        n17.f430382d.j("WxFileIndex3", "UPDATE WxFileIndex3 SET linkUUID=?, diskSpace=? WHERE rowid=?", objArr, null);
    }
}
