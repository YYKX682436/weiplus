package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class vm implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f104798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f104799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.wm f104800c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104802e;

    public vm(kotlin.jvm.internal.h0 h0Var, int i17, com.tencent.mm.plugin.finder.convert.wm wmVar, in5.s0 s0Var, java.lang.String str) {
        this.f104798a = h0Var;
        this.f104799b = i17;
        this.f104800c = wmVar;
        this.f104801d = s0Var;
        this.f104802e = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            r45.c32 c32Var = (r45.c32) ((r45.qu0) fVar.f70618d).getCustom(1);
            this.f104798a.f310123d = c32Var;
            java.lang.String str = this.f104802e;
            com.tencent.mm.plugin.finder.convert.wm wmVar = this.f104800c;
            in5.s0 s0Var = this.f104801d;
            int i17 = this.f104799b;
            if (i17 == 1) {
                wmVar.n(s0Var, c32Var, str);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                db5.t7.m(context, context.getString(com.tencent.mm.R.string.nkp));
                i95.m c17 = i95.n0.c(c50.c1.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                c50.c1 c1Var = (c50.c1) c17;
                ml2.i5 i5Var = ml2.i5.f327571f;
                java.lang.String str2 = this.f104802e;
                android.content.Context context2 = s0Var.f293121e;
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                java.lang.String valueOf = java.lang.String.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("notice_type", 2);
                c50.c1.l9(c1Var, i5Var, str2, 0L, 0, valueOf, null, null, null, null, null, null, null, jSONObject.toString(), 0L, 0, null, 61408, null);
            } else if (i17 == 2) {
                wmVar.n(s0Var, c32Var, str);
                android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                db5.t7.h(context3, context3.getString(com.tencent.mm.R.string.cn8));
                i95.m c18 = i95.n0.c(c50.c1.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                c50.c1 c1Var2 = (c50.c1) c18;
                ml2.i5 i5Var2 = ml2.i5.f327572g;
                java.lang.String str3 = this.f104802e;
                android.content.Context context4 = s0Var.f293121e;
                kotlin.jvm.internal.o.f(context4, "getContext(...)");
                pf5.z zVar2 = pf5.z.f353948a;
                if (!(context4 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                java.lang.String valueOf2 = java.lang.String.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar2.a((androidx.appcompat.app.AppCompatActivity) context4).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("notice_type", 2);
                c50.c1.l9(c1Var2, i5Var2, str3, 0L, 0, valueOf2, null, null, null, null, null, null, null, jSONObject2.toString(), 0L, 0, null, 61408, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
