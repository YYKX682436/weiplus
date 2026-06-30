package o51;

/* loaded from: classes12.dex */
public class b implements p51.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f424617a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String[] f424618b = {"1", "2", "3", "4", "5", "6", "7", "8", "9", com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01.f62845xa1e463a0, "11", "12"};

    /* renamed from: c, reason: collision with root package name */
    public final int[] f424619c = {com.p314xaae8f345.mm.R.C30867xcad56011.him, com.p314xaae8f345.mm.R.C30867xcad56011.hil, com.p314xaae8f345.mm.R.C30867xcad56011.hip, com.p314xaae8f345.mm.R.C30867xcad56011.hii, com.p314xaae8f345.mm.R.C30867xcad56011.hiq, com.p314xaae8f345.mm.R.C30867xcad56011.hio, com.p314xaae8f345.mm.R.C30867xcad56011.hin, com.p314xaae8f345.mm.R.C30867xcad56011.hij, com.p314xaae8f345.mm.R.C30867xcad56011.hit, com.p314xaae8f345.mm.R.C30867xcad56011.his, com.p314xaae8f345.mm.R.C30867xcad56011.hir, com.p314xaae8f345.mm.R.C30867xcad56011.hik};

    public b(android.content.Context context) {
        this.f424617a = context;
    }

    @Override // p51.a
    public java.lang.String a(java.lang.String str) {
        java.lang.String[] strArr = this.f424618b;
        iz5.a.a(12, strArr.length);
        int[] iArr = this.f424619c;
        iz5.a.a(12, iArr.length);
        for (int i17 = 0; i17 < strArr.length; i17++) {
            if (str.equals(strArr[i17])) {
                return this.f424617a.getResources().getString(iArr[i17]);
            }
        }
        return str;
    }
}
