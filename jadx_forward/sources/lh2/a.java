package lh2;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f400192a;

    /* renamed from: b, reason: collision with root package name */
    public java.io.OutputStream f400193b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f400194c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f400195d;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85371p).mo141623x754a37bb()).r()).intValue() == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "filename"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r0)
            r1.<init>()
            r1.f400192a = r2
            zl2.q4 r2 = zl2.q4.f555466a
            boolean r2 = r2.E()
            if (r2 == 0) goto L2c
            ae2.in r2 = ae2.in.f85221a
            jz5.g r2 = ae2.in.f85371p
            jz5.n r2 = (jz5.n) r2
            java.lang.Object r2 = r2.mo141623x754a37bb()
            lb2.j r2 = (lb2.j) r2
            java.lang.Object r2 = r2.r()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r0 = 1
            if (r2 != r0) goto L2c
            goto L2d
        L2c:
            r0 = 0
        L2d:
            r1.f400195d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lh2.a.<init>(java.lang.String):void");
    }

    public final void a() {
        if (this.f400194c) {
            return;
        }
        this.f400194c = true;
        try {
            java.lang.String str = lp0.b.e0() + "/A_live_ktv_test/";
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (m17.a()) {
                m17.f294799a.r(m17.f294800b);
            }
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str, this.f400192a);
            if (r6Var.m()) {
                r6Var.l();
            }
            r6Var.k();
            this.f400193b = com.p314xaae8f345.mm.vfs.w6.H(r6Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVFileSaver", "createNewFile path: " + r6Var.o());
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KTVFileSaver", "createNewFile error: " + jz5.f0.f384359a);
        }
    }

    public final void b(byte[] buffer, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        if (this.f400195d) {
            try {
                a();
                java.io.OutputStream outputStream = this.f400193b;
                if (outputStream != null) {
                    outputStream.write(buffer, 0, i17);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}
