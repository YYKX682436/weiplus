package bz4;

/* loaded from: classes12.dex */
public class n0 implements o72.g5, zs3.x, com.p314xaae8f345.mm.p947xba6de98f.o3 {

    /* renamed from: d, reason: collision with root package name */
    public static mz4.d f118367d;

    @Override // zs3.x
    public void B0(int i17, zs3.y yVar) {
        b(hz4.k.a(yVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ca, code lost:
    
        if (r6 != r0.f377658c) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(hz4.k r17) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bz4.n0.b(hz4.k):void");
    }

    public void c(o72.e2 e2Var) {
        iz4.m mVar;
        o72.r2 a17 = hz4.l.a(e2Var.f67088x958756b0);
        if (a17 == null) {
            hz4.h hVar = ((hz4.f) hz4.f.wi()).f367940d;
            if (hVar == null || (mVar = hVar.f367946d) == null) {
                return;
            }
            long j17 = e2Var.f67088x958756b0;
            if (j17 != mVar.f377658c) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.WNNoteFavCdnChangedListener", "info null and not match localId:%s, %s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(hVar.f367946d.f377658c));
                return;
            }
        } else if (a17.f67657x2262335f != 18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.WNNoteFavCdnChangedListener", "Not Note CDN onCdnStatusChanged %d", java.lang.Long.valueOf(e2Var.f67088x958756b0));
            return;
        }
        if (e2Var.f67093x10a0fed7 == 3 && com.p314xaae8f345.mm.vfs.w6.j(e2Var.f67091x2260084a) && e2Var.f67091x2260084a.endsWith("..htm")) {
            hz4.l.h(e2Var.f67088x958756b0, e2Var.f67091x2260084a);
        }
        hz4.k kVar = new hz4.k();
        kVar.f69852x958756b0 = e2Var.f67088x958756b0;
        kVar.f69849xf604e54a = e2Var.f67085xf604e54a;
        kVar.f69857x10a0fed7 = e2Var.f67093x10a0fed7;
        kVar.f69855x90a9378 = e2Var.f67090x90a9378;
        kVar.f69858xeb1a61d6 = e2Var.f67094xeb1a61d6;
        kVar.f69856x2260084a = e2Var.f67091x2260084a;
        b(kVar);
    }
}
