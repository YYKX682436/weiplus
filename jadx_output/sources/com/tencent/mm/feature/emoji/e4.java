package com.tencent.mm.feature.emoji;

/* loaded from: classes12.dex */
public final class e4 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.emoji.f4 f66242a;

    public e4(com.tencent.mm.feature.emoji.f4 f4Var) {
        this.f66242a = f4Var;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e(this.f66242a.f66264d, "create emoticonGlobalStore fail");
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mm.feature.emoji.f4 f4Var = this.f66242a;
        com.tencent.mars.xlog.Log.i(f4Var.f66264d, "create emoticonGlobalStore success");
        f4Var.f66267g = true;
        f4Var.getClass();
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        r45.we3 z07 = com.tencent.mm.storage.n5.f().e().z0(5);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (z07 != null) {
            java.util.Iterator it = z07.f389086f.iterator();
            while (it.hasNext()) {
                r45.zj0 zj0Var = (r45.zj0) it.next();
                kotlin.jvm.internal.o.d(zj0Var);
                arrayList.add(f4Var.Di(zj0Var));
            }
            java.util.Iterator it6 = z07.f389093p.iterator();
            while (it6.hasNext()) {
                r45.kj0 kj0Var = (r45.kj0) it6.next();
                kotlin.jvm.internal.o.d(kj0Var);
                arrayList2.add(f4Var.Bi(kj0Var));
            }
        }
        com.tencent.mars.xlog.Log.i(f4Var.f66264d, "sendNativeEmoticonCache");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.putOpt("emotionSummary", arrayList);
        jSONObject.putOpt("emotionBannerSet", arrayList2);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        if (g0Var != null) {
            ((com.tencent.mm.feature.lite.i) g0Var).rj(f4Var.f66265e, f4Var.f66266f, jSONObject);
        }
    }
}
