package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class xb implements com.tencent.mm.plugin.appbrand.launching.z8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.yb f85419a;

    public xb(com.tencent.mm.plugin.appbrand.launching.yb ybVar) {
        this.f85419a = ybVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.z8
    public boolean invoke() {
        com.tencent.mm.plugin.appbrand.launching.v8[] v8VarArr = {com.tencent.mm.plugin.appbrand.launching.v8.ATTRS_NOT_FOUND, com.tencent.mm.plugin.appbrand.launching.v8.VERSION_NOT_FOUND};
        com.tencent.mm.plugin.appbrand.launching.yb ybVar = this.f85419a;
        boolean z17 = false;
        if (u46.a.b(v8VarArr, ybVar.f85443d.C)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.launching.v8 v8Var = com.tencent.mm.plugin.appbrand.launching.v8.INVALID_FIELDS;
        com.tencent.mm.plugin.appbrand.launching.vb vbVar = ybVar.f85443d;
        boolean z18 = v8Var == vbVar.C;
        if (!android.text.TextUtils.isEmpty(vbVar.f85283i)) {
            com.tencent.mm.plugin.appbrand.launching.vb vbVar2 = ybVar.f85443d;
            java.lang.String str = vbVar2.f85283i;
            return !com.tencent.mm.plugin.appbrand.config.q.l(str, z18, false, vbVar2.f85287p != null ? r1.field_syncTimeSecond : 0L);
        }
        com.tencent.mm.plugin.appbrand.launching.vb vbVar3 = ybVar.f85443d;
        java.lang.String str2 = vbVar3.f85284m;
        k91.v5 v5Var = vbVar3.f85287p;
        long j17 = v5Var != null ? v5Var.field_syncTimeSecond : 0L;
        if (com.tencent.mm.plugin.appbrand.app.r9.ij() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WxaAttrSyncHelper", "needUpdateAttrByAppId(%s), storage NULL", str2);
        } else {
            long i17 = com.tencent.mm.sdk.platformtools.t8.i1();
            long g17 = com.tencent.mm.plugin.appbrand.config.q.g(z18, false);
            com.tencent.mars.xlog.Log.getLogLevel();
            if (i17 - j17 >= g17 || j17 > i17 + g17) {
                z17 = true;
            }
        }
        return !z17;
    }
}
