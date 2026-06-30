package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class v4 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f102623b;

    public v4(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f102622a = context;
        this.f102623b = baseFinderFeed;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
            android.content.Context context = this.f102622a;
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("feedid", pm0.v.u(this.f102623b.getItemId()));
            com.tencent.mm.plugin.finder.report.b6.d(b6Var, V6, "speedplay", 0, jSONObject, false, null, 48, null);
        }
    }
}
