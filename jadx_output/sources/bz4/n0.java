package bz4;

/* loaded from: classes12.dex */
public class n0 implements o72.g5, zs3.x, com.tencent.mm.modelcdntran.o3 {

    /* renamed from: d, reason: collision with root package name */
    public static mz4.d f36834d;

    @Override // zs3.x
    public void B0(int i17, zs3.y yVar) {
        b(hz4.k.a(yVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ca, code lost:
    
        if (r6 != r0.f296125c) goto L83;
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
        o72.r2 a17 = hz4.l.a(e2Var.field_favLocalId);
        if (a17 == null) {
            hz4.h hVar = ((hz4.f) hz4.f.wi()).f286407d;
            if (hVar == null || (mVar = hVar.f286413d) == null) {
                return;
            }
            long j17 = e2Var.field_favLocalId;
            if (j17 != mVar.f296125c) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Note.WNNoteFavCdnChangedListener", "info null and not match localId:%s, %s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(hVar.f286413d.f296125c));
                return;
            }
        } else if (a17.field_type != 18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.WNNoteFavCdnChangedListener", "Not Note CDN onCdnStatusChanged %d", java.lang.Long.valueOf(e2Var.field_favLocalId));
            return;
        }
        if (e2Var.field_status == 3 && com.tencent.mm.vfs.w6.j(e2Var.field_path) && e2Var.field_path.endsWith("..htm")) {
            hz4.l.h(e2Var.field_favLocalId, e2Var.field_path);
        }
        hz4.k kVar = new hz4.k();
        kVar.field_favLocalId = e2Var.field_favLocalId;
        kVar.field_dataId = e2Var.field_dataId;
        kVar.field_status = e2Var.field_status;
        kVar.field_offset = e2Var.field_offset;
        kVar.field_totalLen = e2Var.field_totalLen;
        kVar.field_path = e2Var.field_path;
        b(kVar);
    }
}
