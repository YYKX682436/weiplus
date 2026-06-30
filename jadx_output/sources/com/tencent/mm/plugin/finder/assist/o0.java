package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.o0 f102420a = new com.tencent.mm.plugin.finder.assist.o0();

    public final boolean a(gk2.e eVar) {
        kotlin.jvm.internal.o.g(eVar, "<this>");
        ae2.in inVar = ae2.in.f3688a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.R5).getValue()).r()).intValue() == 1;
        boolean z18 = z17 || ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) ((mm2.e0) eVar.a(mm2.e0.class)).f328966f).getValue()).booleanValue();
        com.tencent.mars.xlog.Log.i("Finder.BoxCommon", "svr enable:" + ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) ((mm2.e0) eVar.a(mm2.e0.class)).f328966f).getValue()).booleanValue() + ", local enable:" + z17);
        return z18;
    }

    public final java.lang.String b(r45.qn qnVar) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(qnVar, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hashCode:");
        sb6.append(qnVar.hashCode());
        sb6.append(", liveId:");
        sb6.append(pm0.v.u(qnVar.f384103f));
        sb6.append(", boxId:");
        r45.qm1 qm1Var = qnVar.f384101d;
        java.lang.String str2 = null;
        sb6.append(qm1Var != null ? qm1Var.getString(1) : null);
        sb6.append(", lastEnterTimeStamp:");
        sb6.append(qnVar.f384105h);
        sb6.append(", dataSize:");
        sb6.append(qnVar.f384104g.size());
        sb6.append(", lastBuffer:");
        com.tencent.mm.protobuf.g gVar = qnVar.f384102e;
        if (gVar != null) {
            try {
                str = android.util.Base64.encodeToString(gVar.g(), 2);
                kotlin.jvm.internal.o.f(str, "encodeToString(...)");
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.i("Finder", "ByteString encode failed.");
                str = "";
            }
            str2 = str;
        }
        sb6.append(str2);
        sb6.append('}');
        return sb6.toString();
    }

    public final void c(java.lang.String tag, java.lang.String str) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(str, "str");
        com.tencent.mars.xlog.Log.i(tag, "mainFlowLog ".concat(str));
    }

    public final void d(java.lang.String tag, java.lang.String str) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(str, "str");
        com.tencent.mars.xlog.Log.i(tag, "memDataLog ".concat(str));
    }

    public final void e(java.lang.String tag, int i17, gk2.e buContext) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        ae2.in inVar = ae2.in.f3688a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.R5).getValue()).r()).intValue() == 1;
        boolean z18 = pm0.v.z(i17, 16);
        com.tencent.mars.xlog.Log.i("Finder.BoxCommon", "setBoxEnableByFlag tag:" + tag + ", flag:" + i17 + ", enable:" + z18);
        ((kotlinx.coroutines.flow.h3) ((mm2.e0) buContext.a(mm2.e0.class)).f328966f).k(java.lang.Boolean.valueOf(z17 || z18));
        com.tencent.mars.xlog.Log.i("Finder.BoxCommon", "[commentHeightChange] setBoxEnableByFlag change");
        ((mm2.x4) buContext.a(mm2.x4.class)).B.postValue(null);
    }
}
