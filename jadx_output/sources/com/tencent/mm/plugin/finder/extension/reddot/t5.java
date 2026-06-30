package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class t5 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f105873e = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.finder.extension.reddot.pb.P, "FinderRedDotFreqControl")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f105874d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(l75.k0 db6) {
        super(db6, com.tencent.mm.plugin.finder.extension.reddot.pb.P, "FinderRedDotFreqControl", dm.z4.f241450w);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = com.tencent.mm.plugin.finder.extension.reddot.pb.P;
        this.f105874d = db6;
    }

    @Override // l75.n0, l75.g0
    public boolean delete(l75.f0 f0Var, boolean z17, java.lang.String[] keys) {
        com.tencent.mm.plugin.finder.extension.reddot.pb pbVar = (com.tencent.mm.plugin.finder.extension.reddot.pb) f0Var;
        kotlin.jvm.internal.o.g(keys, "keys");
        if (pbVar == null) {
            return false;
        }
        p75.n0 n0Var = dm.z4.f241448u;
        n0Var.getClass();
        p75.d dVar = dm.z4.f241449v;
        java.lang.String field_freqControlId = pbVar.field_freqControlId;
        kotlin.jvm.internal.o.f(field_freqControlId, "field_freqControlId");
        p75.m0 j17 = dVar.j(field_freqControlId);
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String table = n0Var.b();
        p75.h hVar = (p75.h) j17;
        java.lang.String b17 = hVar.b();
        java.lang.String[] e17 = hVar.e();
        kotlin.jvm.internal.o.g(table, "table");
        l75.k0 k0Var = this.f105874d;
        int delete = k0Var != null ? k0Var.delete(table, b17, e17) : -1;
        com.tencent.mars.xlog.Log.i("Finder.RedDotFreqCtrlInfoStorage", "[delete] ret=" + delete + " rowId=" + pbVar.systemRowid + " id=" + pbVar.field_freqControlId + " path=" + pbVar.field_dicPath + " isNotify=" + z17);
        return delete >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // l75.n0
    public boolean replace(l75.f0 f0Var, boolean z17) {
        boolean h17;
        com.tencent.mm.plugin.finder.extension.reddot.pb pbVar = (com.tencent.mm.plugin.finder.extension.reddot.pb) f0Var;
        int i17 = 0;
        boolean z18 = false;
        if (pbVar == null) {
            com.tencent.mars.xlog.Log.i("Finder.RedDotFreqCtrlInfoStorage", "[replace] failure!");
        } else {
            java.lang.String str = pbVar.field_freqControlId;
            if (str == null || str.length() == 0) {
                com.tencent.mars.xlog.Log.e("Finder.RedDotFreqCtrlInfoStorage", "id is null! " + pbVar);
                h17 = false;
            } else {
                p75.n0 n0Var = dm.z4.f241448u;
                p75.d FREQCONTROLID = dm.z4.f241449v;
                kotlin.jvm.internal.o.f(FREQCONTROLID, "FREQCONTROLID");
                p75.i0 h18 = n0Var.h(FREQCONTROLID);
                java.lang.String field_freqControlId = pbVar.field_freqControlId;
                kotlin.jvm.internal.o.f(field_freqControlId, "field_freqControlId");
                h18.f352657d = FREQCONTROLID.j(field_freqControlId);
                h17 = h18.a().h(this.f105874d);
            }
            try {
                i17 = h17 ? super.update(pbVar, new java.lang.String[0]) : super.insert(pbVar);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Finder.RedDotFreqCtrlInfoStorage", e17, "isExist=" + h17 + " id=" + pbVar.field_freqControlId + " path=" + pbVar.field_dicPath, new java.lang.Object[i17]);
            }
            com.tencent.mars.xlog.Log.i("Finder.RedDotFreqCtrlInfoStorage", "[replace] ret=" + i17 + " isExist=" + h17 + " id=" + pbVar.field_freqControlId + " path=" + pbVar.field_dicPath);
            z18 = i17;
        }
        return z18;
    }
}
