package z85;

/* loaded from: classes12.dex */
public class b0 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f552317e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21054xf494c2df.F, "SmileyInfo")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f552318f = {"key", "cnValue", "qqValue", "enValue", "twValue", "thValue", "eggIndex", com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f552319d;

    public b0(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21054xf494c2df.F, "SmileyInfo", null);
        this.f552319d = k0Var;
    }

    public boolean y0(java.util.ArrayList arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NewSmileyInfoStorage", "insertSmileyInfoList failed. list is null.");
            return false;
        }
        l75.k0 k0Var = this.f552319d;
        long F = k0Var != null ? k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId())) : -1L;
        k0Var.mo70514xb06685ab("SmileyInfo", null, null);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mo880xb970c2b9((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21054xf494c2df) it.next());
        }
        return (k0Var != null ? k0Var.w(java.lang.Long.valueOf(F)) : -1) >= 0;
    }
}
