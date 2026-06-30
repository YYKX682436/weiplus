package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class k3 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f105624e = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.finder.extension.reddot.jb.Q, "FinderRedDotInfo2")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f105625d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(l75.k0 db6) {
        super(db6, com.tencent.mm.plugin.finder.extension.reddot.jb.Q, "FinderRedDotInfo2", dm.a5.f235624u);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = com.tencent.mm.plugin.finder.extension.reddot.jb.Q;
        this.f105625d = db6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        r3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r3 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r3 = kb2.b.f306225a;
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        r3 = new org.json.JSONObject();
        r3.put("tips_id", r2.field_tipsId);
        r3.put("tips_uuid", r2.field_tips_uuid);
        r3.put("is_field_ctrInfo_null", true);
        r3.put("paths", r2.J0());
        r3.put("stack", com.tencent.mm.sdk.platformtools.z3.b(true));
        pm0.z.b(xy2.b.f458155b, "FinderRedDotCtrInfoStorage_queryAll_ctrInfo_null", false, pm0.w.f356806g, null, false, r9, new com.tencent.mm.plugin.finder.extension.reddot.j3(r3), 24, null);
        com.tencent.mars.xlog.Log.e("Finder.RedDotCtrInfoStorage", "delete[" + delete(r2.systemRowid) + "] table=" + r15 + " tips_uuid=" + r2.field_tips_uuid + " tipsId=" + r2.field_tipsId);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00df, code lost:
    
        if (r1.moveToNext() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d8, code lost:
    
        r0.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e1, code lost:
    
        vz5.b.a(r1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r1.moveToFirst() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        r2 = new com.tencent.mm.plugin.finder.extension.reddot.jb();
        r2.convertFrom(r1);
        z0(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (r2.field_ctrInfo != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedList D0(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.k3.D0(java.lang.String):java.util.LinkedList");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // l75.n0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public boolean replace(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, boolean z17) {
        boolean h17;
        int i17 = 0;
        if (jbVar == null) {
            com.tencent.mars.xlog.Log.i("Finder.RedDotCtrInfoStorage", "[replace] failure!");
            return false;
        }
        z0(jbVar);
        java.lang.String str = jbVar.field_tips_uuid;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("Finder.RedDotCtrInfoStorage", "tips_uuid is null! " + jbVar);
            h17 = false;
        } else {
            p75.n0 n0Var = dm.a5.f235622s;
            p75.d TIPS_UUID = dm.a5.f235623t;
            kotlin.jvm.internal.o.f(TIPS_UUID, "TIPS_UUID");
            p75.i0 h18 = n0Var.h(TIPS_UUID);
            java.lang.String field_tips_uuid = jbVar.field_tips_uuid;
            kotlin.jvm.internal.o.f(field_tips_uuid, "field_tips_uuid");
            h18.f352657d = TIPS_UUID.j(field_tips_uuid);
            h17 = h18.a().h(this.f105625d);
        }
        try {
            i17 = h17 ? super.update(jbVar, new java.lang.String[0]) : super.insert(jbVar);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.RedDotCtrInfoStorage", e17, "isExist=" + h17 + " tips_uuid=" + jbVar.field_tips_uuid + " tipsId=" + jbVar.field_tipsId, new java.lang.Object[i17]);
            com.tencent.mm.autogen.mmdata.rpt.FinderExceptionDetectStruct finderExceptionDetectStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderExceptionDetectStruct();
            finderExceptionDetectStruct.f56725d = finderExceptionDetectStruct.b("InnerVersion", "1", true);
            finderExceptionDetectStruct.f56726e = 10003L;
            finderExceptionDetectStruct.k();
        }
        com.tencent.mars.xlog.Log.i("Finder.RedDotCtrInfoStorage", "[replace] ret=" + i17 + " isExist=" + h17 + " tips_uuid=" + jbVar.field_tips_uuid + " tipsId=" + jbVar.field_tipsId);
        return i17;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public boolean delete(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, boolean z17, java.lang.String... keys) {
        kotlin.jvm.internal.o.g(keys, "keys");
        if (jbVar == null) {
            return false;
        }
        z0(jbVar);
        p75.n0 n0Var = dm.a5.f235622s;
        n0Var.getClass();
        p75.d dVar = dm.a5.f235623t;
        java.lang.String field_tips_uuid = jbVar.field_tips_uuid;
        kotlin.jvm.internal.o.f(field_tips_uuid, "field_tips_uuid");
        p75.m0 j17 = dVar.j(field_tips_uuid);
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        int f17 = new p75.i(n0Var.b(), j17.b(), j17.e()).f(this.f105625d);
        com.tencent.mars.xlog.Log.i("Finder.RedDotCtrInfoStorage", "[delete] ret=" + f17 + " rowId=" + jbVar.systemRowid + " tips_uuid=" + jbVar.field_tips_uuid + " tipsId=" + jbVar.field_tipsId + " isNotify=" + z17);
        return f17 >= 0;
    }

    public final void z0(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar) {
        r45.vs2 vs2Var;
        r45.vs2 vs2Var2;
        java.lang.String str = jbVar != null ? jbVar.field_tips_uuid : null;
        if (str == null || str.length() == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[fallbackTipsUuid] tips_uuid=");
            sb6.append((jbVar == null || (vs2Var2 = jbVar.field_ctrInfo) == null) ? null : vs2Var2.f388503x);
            sb6.append(" field_tipsId=");
            sb6.append(jbVar != null ? jbVar.field_tipsId : null);
            com.tencent.mars.xlog.Log.w("Finder.RedDotCtrInfoStorage", sb6.toString());
            java.lang.String str2 = (jbVar == null || (vs2Var = jbVar.field_ctrInfo) == null) ? null : vs2Var.f388503x;
            if (!(str2 == null || str2.length() == 0) && jbVar != null) {
                r45.vs2 vs2Var3 = jbVar.field_ctrInfo;
                jbVar.field_tips_uuid = vs2Var3 != null ? vs2Var3.f388503x : null;
            }
            java.lang.String str3 = jbVar != null ? jbVar.field_tips_uuid : null;
            if (!(str3 == null || str3.length() == 0) || jbVar == null) {
                return;
            }
            r45.vs2 vs2Var4 = jbVar.field_ctrInfo;
            jbVar.field_tips_uuid = vs2Var4 != null ? vs2Var4.f388490h : null;
        }
    }
}
