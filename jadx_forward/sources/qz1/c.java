package qz1;

/* loaded from: classes12.dex */
public class c implements gy1.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f449362a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f449363b = new java.util.ArrayList();

    public c() {
        this.f449362a = 16334;
        try {
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_data_report_logid_black_list, "", true);
            if (u46.l.e(Zi)) {
                return;
            }
            int i17 = 0;
            int i18 = 0;
            while (i17 >= 0 && i17 < Zi.length() && i18 >= 0) {
                i18 = Zi.indexOf(",", i17);
                try {
                    this.f449363b.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(i18 >= 0 ? Zi.substring(i17, i18) : Zi.substring(i17))));
                } catch (java.lang.Throwable unused) {
                }
                i17 = i18 + 1;
            }
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_smc_max_log_item_size, 15) > 0) {
                this.f449362a = (r0 * 1024) - 50;
            }
        } catch (java.lang.Exception unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ad  */
    @Override // gy1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(long r20, java.lang.String r22, java.util.Map r23, final ky1.d r24) {
        /*
            Method dump skipped, instructions count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qz1.c.a(long, java.lang.String, java.util.Map, ky1.d):boolean");
    }

    @Override // gy1.a
    public int b() {
        return 0;
    }
}
