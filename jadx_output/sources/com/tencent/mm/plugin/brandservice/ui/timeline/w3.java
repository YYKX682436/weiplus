package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes9.dex */
public final class w3 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f94533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI f94534e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f94535f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f94536g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.x26 f94537h;

    public w3(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI bizTimeLineSettingUI, java.lang.ref.WeakReference weakReference, java.lang.String str, r45.x26 x26Var) {
        this.f94533d = c0Var;
        this.f94534e = bizTimeLineSettingUI;
        this.f94535f = weakReference;
        this.f94536g = str;
        this.f94537h = x26Var;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o rr6, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        kotlin.jvm.internal.o.g(rr6, "rr");
        kotlin.jvm.internal.o.g(m1Var, "<anonymous parameter 4>");
        com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineSettingUI", "setTimelineSetting callback " + i17 + ", " + i18 + ", " + str);
        kotlin.jvm.internal.c0 c0Var = this.f94533d;
        if (c0Var.f310112d) {
            return 0;
        }
        this.f94534e.f94093n = false;
        java.lang.ref.WeakReference weakReference = this.f94535f;
        com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI bizTimeLineSettingUI = (com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI) weakReference.get();
        if (bizTimeLineSettingUI != null && (u3Var = bizTimeLineSettingUI.f94094o) != null) {
            u3Var.dismiss();
            bizTimeLineSettingUI.f94094o = null;
        }
        c0Var.f310112d = true;
        if (!(rr6.f70711b.f70700a instanceof r45.y26)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizTimeLineSettingUI", "not my resp");
            return 0;
        }
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.pluginsdk.model.e.f189277a.f(this.f94537h.f389703g == 1);
            com.tencent.mm.autogen.events.BizTimePersonalizedRecommendUpdateEvent bizTimePersonalizedRecommendUpdateEvent = new com.tencent.mm.autogen.events.BizTimePersonalizedRecommendUpdateEvent();
            bizTimePersonalizedRecommendUpdateEvent.f54010g.getClass();
            bizTimePersonalizedRecommendUpdateEvent.b(android.os.Looper.getMainLooper());
            return 0;
        }
        com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI bizTimeLineSettingUI2 = (com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI) weakReference.get();
        if (bizTimeLineSettingUI2 != null) {
            java.lang.String str2 = this.f94536g;
            boolean n17 = r26.i0.n("biz_msg_rec_pref", str2, false);
            r45.x26 x26Var = bizTimeLineSettingUI2.f94090h;
            if (n17) {
                bizTimeLineSettingUI2.W6().S(!x26Var.f389700d);
            } else if (r26.i0.n("biz_msg_pay_for_head_pref", str2, false)) {
                ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) bizTimeLineSettingUI2.f94088f).getValue()).S(!x26Var.f389701e);
            } else if (r26.i0.n("biz_msg_finder_rec_pref", str2, false)) {
                ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) bizTimeLineSettingUI2.f94087e).getValue()).S(x26Var.f389704h != 1);
            }
            if (str != null && !r26.n0.N(str)) {
                r9 = false;
            }
            java.lang.String string = r9 ? bizTimeLineSettingUI2.getString(com.tencent.mm.R.string.f490755an5) : str;
            kotlin.jvm.internal.o.d(string);
            db5.e1.A(bizTimeLineSettingUI2, "", string, bizTimeLineSettingUI2.getString(com.tencent.mm.R.string.f490544y3), bizTimeLineSettingUI2.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.brandservice.ui.timeline.b4(bizTimeLineSettingUI2, str2), new com.tencent.mm.plugin.brandservice.ui.timeline.c4(bizTimeLineSettingUI2));
        }
        return 0;
    }
}
