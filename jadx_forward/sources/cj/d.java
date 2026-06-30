package cj;

/* loaded from: classes12.dex */
public class d extends cj.c {
    @Override // cj.c
    public boolean b(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p581xc2f04ca6.p582x633fb29.C4706x164388f6 c4706x164388f6) {
        java.io.File file;
        c(0, wi.b.NO_DUMP, c4706x164388f6.f20017xf8a7db47, c4706x164388f6.f20020x32b2b2, "no dump", "0");
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 > 31) {
            oj.j.b("Matrix.LeakProcessor.ForkDump", "unsupported API version " + i17, new java.lang.Object[0]);
            return false;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            file = xi.k.f536194e.f("FDP", true);
        } catch (java.io.FileNotFoundException e17) {
            oj.j.d("Matrix.LeakProcessor.ForkDump", e17, "", new java.lang.Object[0]);
            file = null;
        }
        if (file == null) {
            oj.j.b("Matrix.LeakProcessor.ForkDump", "cannot create hprof file, just ignore", new java.lang.Object[0]);
            return true;
        }
        if (!com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.C4705xed2494c3.h(file.getPath(), 600L)) {
            oj.j.b("Matrix.LeakProcessor.ForkDump", java.lang.String.format("heap dump for further analyzing activity with key [%s] was failed, just ignore.", c4706x164388f6.f20020x32b2b2), new java.lang.Object[0]);
            return true;
        }
        oj.j.c("Matrix.LeakProcessor.ForkDump", java.lang.String.format("dump cost=%sms refString=%s path=%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), c4706x164388f6.f20020x32b2b2, file.getPath()), new java.lang.Object[0]);
        java.lang.String str = c4706x164388f6.f20017xf8a7db47;
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.f fVar = this.f123358a;
        fVar.b(str, true);
        fVar.d();
        if (this.f123360c == null) {
            this.f123360c = new cj.b(this);
        }
        ((cj.b) this.f123360c).a(new ti.w0(file, c4706x164388f6.f20020x32b2b2, c4706x164388f6.f20017xf8a7db47));
        return true;
    }
}
