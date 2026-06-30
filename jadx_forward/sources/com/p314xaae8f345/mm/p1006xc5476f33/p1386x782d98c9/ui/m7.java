package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes12.dex */
public final class m7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f181104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f181105e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f181106f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.ed6 f181107g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13481xc7ac0134 f181108h;

    public m7(boolean z17, int i17, org.json.JSONObject jSONObject, r45.ed6 ed6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13481xc7ac0134 activityC13481xc7ac0134) {
        this.f181104d = z17;
        this.f181105e = i17;
        this.f181106f = jSONObject;
        this.f181107g = ed6Var;
        this.f181108h = activityC13481xc7ac0134;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/SportHistoryUI$HistoryItemConvert$onBindViewHolder$2$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f181104d && this.f181105e == 1) {
            java.lang.String optString = this.f181106f.optString("finder_username");
            a42.c cVar = a42.c.f82733a;
            java.lang.String appName = this.f181107g.f454861e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appName, "appName");
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13481xc7ac0134 activityC13481xc7ac0134 = this.f181108h;
            cVar.a(3, 2, appName, 1, 1, activityC13481xc7ac0134.f180924g);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13481xc7ac0134.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("finder_username", optString);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f542005a.w(mo55332x76847179, intent);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/SportHistoryUI$HistoryItemConvert$onBindViewHolder$2$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
