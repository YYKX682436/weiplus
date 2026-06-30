package x51;

/* loaded from: classes12.dex */
public final class k0 extends d95.b0 {

    /* renamed from: i, reason: collision with root package name */
    public final boolean f533555i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f533556j;

    /* renamed from: k, reason: collision with root package name */
    public final android.util.SparseBooleanArray f533557k = new android.util.SparseBooleanArray();

    public k0(java.lang.String str, boolean z17) {
        this.f533555i = z17;
        this.f533556j = str;
    }

    @Override // d95.b0
    public void L() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GeneralDBHelper", "forbid to use this method %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        if (this.f533557k.size() <= 1) {
            M(null);
        }
    }

    @Override // d95.b0
    public void M(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GeneralDBHelper", "forbid to use this method");
        if (this.f533557k.size() <= 1) {
            super.M(str);
        }
    }

    public void W(int i17) {
        android.util.SparseBooleanArray sparseBooleanArray = this.f533557k;
        sparseBooleanArray.delete(i17);
        if (sparseBooleanArray.size() < 1) {
            M(null);
            x51.l0.f533562a.remove(java.lang.Integer.valueOf(this.f533556j.hashCode()));
        }
    }
}
