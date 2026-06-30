package cr0;

/* loaded from: classes12.dex */
public final class u3 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g {

    /* renamed from: b, reason: collision with root package name */
    public cr0.n3 f303303b;

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void a() {
        cr0.n3 n3Var = new cr0.n3();
        cr0.w3 w3Var = cr0.w3.f303333a;
        if (w3Var.b()) {
            w3Var.a().m40834x32c52b(new cr0.l3(n3Var));
        }
        this.f303303b = n3Var;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void b() {
        cr0.n3 n3Var = this.f303303b;
        if (n3Var != null) {
            cr0.n3 n3Var2 = new cr0.n3();
            cr0.w3 w3Var = cr0.w3.f303333a;
            if (w3Var.b()) {
                w3Var.a().m40834x32c52b(new cr0.l3(n3Var2));
            }
            cr0.m3 m3Var = new cr0.m3(n3Var, n3Var2);
            long j17 = m3Var.f477020d;
            if (j17 > 600000) {
                cr0.n3 n3Var3 = (cr0.n3) m3Var.f477019c;
                if (!n3Var3.f303172i.isEmpty()) {
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    java.lang.Long l17 = (java.lang.Long) n3Var3.f303167d.f477085a;
                    ob0.r2 r2Var = (ob0.r2) i95.n0.c(ob0.r2.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) r2Var).Ri(l17.longValue(), m3Var, linkedHashMap, new cr0.t3(linkedHashMap, l17, j17));
                    java.lang.String[] strArr = new java.lang.String[4];
                    strArr[0] = java.lang.String.valueOf(j17 / com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8);
                    strArr[1] = ((cr0.d0) n3Var3.f303172i.get(0)).f303137d;
                    strArr[2] = n3Var3.f303172i.size() > 1 ? ((cr0.d0) n3Var3.f303172i.get(1)).f303137d : "";
                    strArr[3] = n3Var3.f303172i.size() > 2 ? ((cr0.d0) n3Var3.f303172i.get(2)).f303137d : "";
                    ap.a.a(1, "statsNetwork", null, linkedHashMap, strArr);
                }
            }
        }
        this.f303303b = null;
    }
}
