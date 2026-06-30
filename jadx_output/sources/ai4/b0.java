package ai4;

/* loaded from: classes11.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ai4.b0 f5123a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f5124b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f5125c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f5126d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f5127e;

    /* renamed from: f, reason: collision with root package name */
    public static int f5128f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f5129g;

    static {
        ai4.b0 b0Var = new ai4.b0();
        f5123a = b0Var;
        f5124b = com.tencent.mm.sdk.platformtools.o4.L();
        f5127e = jz5.h.b(ai4.r.f5191d);
        f5129g = jz5.h.b(ai4.n.f5175d);
        f5125c = true;
        boolean z17 = b0Var.g() && b0Var.f();
        f5126d = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.StatusAffDBTransfer", "init canTransferAff=true, canReadFromAff=" + z17 + ", thread=" + java.lang.Thread.currentThread().getName());
        int i17 = h.h.f277767a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final kotlinx.coroutines.f1 a(ai4.b0 b0Var, kotlinx.coroutines.y0 y0Var, ai4.a aVar, yz5.l lVar) {
        java.lang.String c17 = b0Var.c(aVar);
        com.tencent.mm.sdk.platformtools.o4 o4Var = f5124b;
        com.tencent.mars.xlog.Log.i("MicroMsg.StatusAffDBTransfer", "checkStartTransferJob: " + aVar.name() + ", isDone=" + o4Var.h(c17));
        if (o4Var.h(c17)) {
            return new kotlinx.coroutines.a0(null);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int ordinal = aVar.ordinal() + 1;
        java.lang.String valueOf = java.lang.String.valueOf(currentTimeMillis);
        kotlinx.coroutines.f1 b17 = kotlinx.coroutines.l.b(y0Var, null, null, new ai4.p(ordinal, valueOf, lVar, null), 3, null);
        ((kotlinx.coroutines.c3) b17).p(new ai4.o(currentTimeMillis, b17, c17, aVar, ordinal, valueOf));
        return b17;
    }

    public final java.lang.String b(int i17) {
        return "V7_T2_P13_TimeCost_StatusAffDBTransfer_" + i17 + '_' + gm0.j1.b().h();
    }

    public final java.lang.String c(ai4.a type) {
        kotlin.jvm.internal.o.g(type, "type");
        return "V7_T2_P13_Is_Done_StatusAffDBTransfer_Job_" + gm0.j1.b().h() + '_' + type.name();
    }

    public final java.lang.String d() {
        return "V7_T2_P13_StatusAffDBTransfer_StartNum_" + gm0.j1.b().h();
    }

    public final int e() {
        return ((java.lang.Number) ((jz5.n) f5127e).getValue()).intValue();
    }

    public final boolean f() {
        java.lang.String c17 = c(ai4.a.f5115f);
        com.tencent.mm.sdk.platformtools.o4 o4Var = f5124b;
        boolean z17 = o4Var.h(c17) && o4Var.h(c(ai4.a.f5116g)) && o4Var.h(c(ai4.a.f5117h));
        com.tencent.mars.xlog.Log.i("MicroMsg.StatusAffDBTransfer", "hasFinishTransferAffLikeCommentDB: " + z17);
        return z17;
    }

    public final boolean g() {
        java.lang.String c17 = c(ai4.a.f5113d);
        com.tencent.mm.sdk.platformtools.o4 o4Var = f5124b;
        boolean z17 = o4Var.h(c17) && o4Var.h(c(ai4.a.f5114e));
        com.tencent.mars.xlog.Log.i("MicroMsg.StatusAffDBTransfer", "hasFinishTransferAffMainStatusDB: " + z17);
        return z17;
    }

    public final boolean h(mj4.l lVar) {
        java.lang.String str = lVar.field_LikeId;
        bw5.sl0 insertOrReplaceLikeData = com.tencent.wechat.aff.status.StatusLogicCommentManager.getInstance().insertOrReplaceLikeData(ai4.f.f5139a.g(lVar, str == null || r26.n0.N(str) ? mj4.m.a(lVar) : ""));
        if (insertOrReplaceLikeData == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StatusAffDBTransfer", "insertAffLike: resp null");
            return false;
        }
        if (insertOrReplaceLikeData.f33040d) {
            return true;
        }
        int i17 = insertOrReplaceLikeData.f33041e;
        boolean[] zArr = insertOrReplaceLikeData.f33044h;
        if (i17 == -7) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("insertAffLike: db exist newer data, ");
            sb6.append(zArr[3] ? insertOrReplaceLikeData.f33042f : "");
            com.tencent.mars.xlog.Log.i("MicroMsg.StatusAffDBTransfer", sb6.toString());
            return true;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("insertAffLike: failed ");
        sb7.append(insertOrReplaceLikeData.f33041e);
        sb7.append(", ");
        sb7.append(zArr[3] ? insertOrReplaceLikeData.f33042f : "");
        com.tencent.mars.xlog.Log.e("MicroMsg.StatusAffDBTransfer", sb7.toString());
        return false;
    }

    public final void i() {
        java.lang.String str = "V7_T2_P13_StateDailyReportTime_StatusAffDBTransfer_" + gm0.j1.b().h();
        com.tencent.mm.sdk.platformtools.o4 o4Var = f5124b;
        if (java.lang.System.currentTimeMillis() - o4Var.q(str, 0L) < 86400000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StatusAffDBTransfer", "reportTransferDBStateTimely: skip");
            return;
        }
        boolean z17 = f5125c;
        qj4.s.f363958a.r(z17 && g() && f() ? 48 : z17 ? o4Var.n(d()) >= e() ? 64 : 32 : 16, (r20 & 2) != 0 ? null : null, (r20 & 4) != 0 ? null : null, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? null : null, (r20 & 32) != 0 ? null : null, (r20 & 64) != 0 ? null : null);
        o4Var.B(str, java.lang.System.currentTimeMillis());
    }
}
