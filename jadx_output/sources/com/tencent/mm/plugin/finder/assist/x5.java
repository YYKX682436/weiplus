package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class x5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f102681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f102682e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f102683f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102684g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f102685h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102686i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f102687m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f102688n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f102689o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(androidx.appcompat.app.AppCompatActivity appCompatActivity, in5.s0 s0Var, com.tencent.mm.protocal.protobuf.FinderObject finderObject, java.lang.String str, boolean z17, java.lang.String str2, int i17, yz5.l lVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        super(2);
        this.f102681d = appCompatActivity;
        this.f102682e = s0Var;
        this.f102683f = finderObject;
        this.f102684g = str;
        this.f102685h = z17;
        this.f102686i = str2;
        this.f102687m = i17;
        this.f102688n = lVar;
        this.f102689o = baseFinderFeed;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        in5.s0 s0Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        if (booleanValue) {
            androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f102681d;
            kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.tencent.mm.plugin.finder.viewmodel.component.je jeVar = (com.tencent.mm.plugin.finder.viewmodel.component.je) pf5.z.f353948a.a((com.tencent.mm.ui.MMActivity) appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.je.class);
            jeVar.getClass();
            if (com.tencent.mm.plugin.finder.viewmodel.component.ee.f134265m && intValue == 1 && (s0Var = this.f102682e) != null) {
                android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.mnj);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) s0Var.p(com.tencent.mm.R.id.f486686m51);
                if (weImageView != null) {
                    weImageView.setVisibility(0);
                }
                if (textView != null) {
                    textView.setText(jeVar.getContext().getResources().getString(com.tencent.mm.R.string.f2c));
                }
                if (textView != null) {
                    textView.setTextColor(jeVar.getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
                }
            }
            long id6 = this.f102683f.getId();
            int i17 = this.f102687m;
            java.lang.String reportJson = this.f102686i;
            kotlin.jvm.internal.o.g(reportJson, "reportJson");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("feedid", pm0.v.u(id6));
                if (this.f102685h) {
                    jSONObject.put("entrance", 1);
                } else {
                    jSONObject.put("entrance", 2);
                }
                if (com.tencent.mm.plugin.finder.viewmodel.component.ee.f134265m) {
                    jSONObject.put("feed_source", 1);
                } else {
                    jSONObject.put("feed_source", 0);
                }
                jSONObject.put("set_type", intValue);
                java.lang.String str = this.f102684g;
                if (str != null) {
                    if (str.length() > 0) {
                        jSONObject.put("songid", str);
                    }
                }
                if (reportJson.length() > 0) {
                    jSONObject.put("bell_info", reportJson);
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("intab", i17);
                    jSONObject.put("video_pos_info", jSONObject2.toString());
                }
            } catch (org.json.JSONException unused) {
            }
            com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
            boolean z17 = appCompatActivity instanceof com.tencent.mm.ui.MMFragmentActivity;
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = z17 ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.b6.d(b6Var, nyVar != null ? nyVar.V6() : null, "set_song_success", 1, jSONObject, false, null, 48, null);
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = z17 ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            if (nyVar2 != null) {
                com.tencent.mm.plugin.finder.report.l0.f125109a.b(nyVar2.V6(), this.f102689o, 45);
            }
        }
        this.f102688n.invoke(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f302826a;
    }
}
