package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public final class m7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f99571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f99572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f99573f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.ed6 f99574g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.SportHistoryUI f99575h;

    public m7(boolean z17, int i17, org.json.JSONObject jSONObject, r45.ed6 ed6Var, com.tencent.mm.plugin.exdevice.ui.SportHistoryUI sportHistoryUI) {
        this.f99571d = z17;
        this.f99572e = i17;
        this.f99573f = jSONObject;
        this.f99574g = ed6Var;
        this.f99575h = sportHistoryUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/SportHistoryUI$HistoryItemConvert$onBindViewHolder$2$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f99571d && this.f99572e == 1) {
            java.lang.String optString = this.f99573f.optString("finder_username");
            a42.c cVar = a42.c.f1200a;
            java.lang.String appName = this.f99574g.f373328e;
            kotlin.jvm.internal.o.f(appName, "appName");
            com.tencent.mm.plugin.exdevice.ui.SportHistoryUI sportHistoryUI = this.f99575h;
            cVar.a(3, 2, appName, 1, 1, sportHistoryUI.f99391g);
            androidx.appcompat.app.AppCompatActivity context = sportHistoryUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            kotlin.jvm.internal.o.d(optString);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("finder_username", optString);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f460472a.w(context, intent);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/SportHistoryUI$HistoryItemConvert$onBindViewHolder$2$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
