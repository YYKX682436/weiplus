package bt3;

/* loaded from: classes9.dex */
public final class h1 extends jm0.g {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f24280f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f24281g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f24282h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
        this.f24280f = jz5.h.b(bt3.b1.f24208d);
        this.f24281g = jz5.h.b(bt3.f1.f24257d);
        this.f24282h = jz5.h.b(new bt3.c1(service));
    }

    public final dn.m T6(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4) {
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_RecordMsgCDNService";
        mVar.field_mediaId = str;
        mVar.f241786e = true;
        mVar.field_priority = 1;
        mVar.field_needStorage = false;
        mVar.field_totalLen = com.tencent.mm.vfs.w6.k(str2);
        mVar.field_aesKey = str3;
        mVar.field_fullpath = str2;
        mVar.field_fileType = i17;
        mVar.field_talker = str4;
        mVar.field_force_aeskeycdn = false;
        mVar.field_trysafecdn = true;
        mVar.field_enable_hitcheck = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordFromFavSendFSC", "[record] summersafecdn doJob TYPE_UPLOAD addSendTask field_force_aeskeycdn:%b, type[%d], aesKey[%s], force_aeskeycdn[%b] trysafecdn[%b] enable_hitcheck[%b], mediaId:%s", false, java.lang.Integer.valueOf(mVar.field_fileType), mVar.field_aesKey, java.lang.Boolean.valueOf(mVar.field_force_aeskeycdn), java.lang.Boolean.valueOf(mVar.field_trysafecdn), java.lang.Boolean.valueOf(mVar.field_enable_hitcheck), mVar.field_mediaId);
        return mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U6(java.util.List r17, java.util.Map r18, java.util.Map r19, java.util.List r20, r45.bq0 r21) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bt3.h1.U6(java.util.List, java.util.Map, java.util.Map, java.util.List, r45.bq0):void");
    }

    public final void V6(r45.bq0 bq0Var) {
        java.util.LinkedList<r45.gp0> linkedList;
        if (bq0Var == null || (linkedList = bq0Var.f370964f) == null) {
            return;
        }
        for (r45.gp0 gp0Var : linkedList) {
            if (o72.x1.h0(gp0Var.I)) {
                V6(gp0Var.f375451y2);
                r45.bq0 bq0Var2 = gp0Var.f375451y2;
                if (bq0Var2 != null) {
                    gp0Var.C0(bt3.g2.N(bq0Var2.f370972q, bq0Var2.f370974s, "", bq0Var2, bq0Var2.f370964f));
                }
            }
        }
    }

    public final void W6() {
        v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) this.f24282h).getValue(), null, new bt3.d1(this, null), 1, null);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0036. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0bf1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0c09  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0c10  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0bfe  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0a6d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0919  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x09d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x09f5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x096e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0aa7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0ac6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0ad3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0adc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0b3a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0bd1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0ae7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0acf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0a9d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0a9f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0560  */
    /* JADX WARN: Type inference failed for: r0v47, types: [int] */
    /* JADX WARN: Type inference failed for: r0v50, types: [int] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v58, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v31, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r39v0, types: [bt3.h1] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55, types: [int] */
    /* JADX WARN: Type inference failed for: r4v105, types: [int] */
    /* JADX WARN: Type inference failed for: r4v115 */
    /* JADX WARN: Type inference failed for: r4v129 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v91 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v114 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v76 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v55 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x0796 -> B:90:0x07a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:220:0x02a7 -> B:147:0x02bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:224:0x02db -> B:150:0x0307). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0a4d -> B:23:0x0a61). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X6(zs3.b0 r40, kotlin.coroutines.Continuation r41) {
        /*
            Method dump skipped, instructions count: 3122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bt3.h1.X6(zs3.b0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void Y6(zs3.b0 b0Var) {
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(b0Var.field_toUser, b0Var.field_msgId);
        n17.r1(5);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(b0Var.field_msgId, n17, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordFromFavSendFSC", "updateMsgSendFail msgId:" + b0Var.field_msgId);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z6(dn.m r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bt3.h1.Z6(dn.m, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
