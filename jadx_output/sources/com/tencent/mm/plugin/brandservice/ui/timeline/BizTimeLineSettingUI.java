package com.tencent.mm.plugin.brandservice.ui.timeline;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineSettingUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class BizTimeLineSettingUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f94085p = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f94086d = jz5.h.b(new com.tencent.mm.plugin.brandservice.ui.timeline.v3(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f94087e = jz5.h.b(new com.tencent.mm.plugin.brandservice.ui.timeline.n3(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f94088f = jz5.h.b(new com.tencent.mm.plugin.brandservice.ui.timeline.u3(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f94089g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.x26 f94090h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.g5 f94091i;

    /* renamed from: m, reason: collision with root package name */
    public final kotlinx.coroutines.r2 f94092m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f94093n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f94094o;

    public BizTimeLineSettingUI() {
        jz5.h.b(new com.tencent.mm.plugin.brandservice.ui.timeline.k3(this));
        this.f94089g = jz5.h.b(new com.tencent.mm.plugin.brandservice.ui.timeline.l3(this));
        jz5.h.b(new com.tencent.mm.plugin.brandservice.ui.timeline.s3(this));
        this.f94090h = new r45.x26();
        this.f94091i = com.tencent.wechat.mm.biz.g5.kDefault;
        this.f94092m = kotlinx.coroutines.l.d(v65.m.b(this), null, null, new com.tencent.mm.plugin.brandservice.ui.timeline.p3(this, null), 3, null);
    }

    public static final void V6(com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI bizTimeLineSettingUI) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = bizTimeLineSettingUI.f94094o;
        if (u3Var != null) {
            u3Var.dismiss();
            bizTimeLineSettingUI.f94094o = null;
        }
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(bizTimeLineSettingUI, null, bizTimeLineSettingUI.getString(com.tencent.mm.R.string.f490604zq), true, false, com.tencent.mm.plugin.brandservice.ui.timeline.z3.f94553d);
        bizTimeLineSettingUI.f94094o = Q;
        if (Q != null) {
            Q.setOnCancelListener(new com.tencent.mm.plugin.brandservice.ui.timeline.a4(bizTimeLineSettingUI));
        }
    }

    public final com.tencent.mm.ui.base.preference.CheckBoxPreference W6() {
        return (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) this.f94086d).getValue();
    }

    public final void X6() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.hp3();
        lVar.f70665b = new r45.ip3();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/timeline/gettimelinesetting";
        lVar.f70667d = 4758;
        com.tencent.mm.modelbase.z2.d(lVar.a(), new com.tencent.mm.plugin.brandservice.ui.timeline.q3(new kotlin.jvm.internal.c0(), new java.lang.ref.WeakReference(this)), false);
    }

    public final void Y6(r45.x26 req, java.lang.String key) {
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineSettingUI", "setTimelineSetting personalized_recommend_setting = " + req.f389700d, "pay for head = " + req.f389701e);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = req;
        lVar.f70665b = new r45.y26();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/timeline/settimelinesetting";
        lVar.f70667d = 1460;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        this.f94093n = true;
        com.tencent.mm.modelbase.z2.d(a17, new com.tencent.mm.plugin.brandservice.ui.timeline.w3(c0Var, this, weakReference, key, req), false);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        android.content.Intent intent = getIntent();
        intent.putExtra("personalizedOperation", this.f94091i.f218092d);
        setResult(-1, intent);
        super.finish();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.layout.f488226nk;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.f490555ye);
        setTitleDividerVis(false);
        hideActionbarLine();
        setBackBtn(new com.tencent.mm.plugin.brandservice.ui.timeline.r3(this));
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        kotlin.jvm.internal.o.d(preferenceScreen);
        ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).m("biz_msg_rec_pref", true);
        com.tencent.mm.ui.base.preference.r preferenceScreen2 = getPreferenceScreen();
        kotlin.jvm.internal.o.d(preferenceScreen2);
        ((com.tencent.mm.ui.base.preference.h0) preferenceScreen2).m("biz_msg_finder_rec_pref", true);
        com.tencent.mm.ui.base.preference.r preferenceScreen3 = getPreferenceScreen();
        kotlin.jvm.internal.o.d(preferenceScreen3);
        ((com.tencent.mm.ui.base.preference.h0) preferenceScreen3).m("biz_msg_pay_for_head_pref", true);
        com.tencent.mm.ui.base.preference.r preferenceScreen4 = getPreferenceScreen();
        kotlin.jvm.internal.o.d(preferenceScreen4);
        ((com.tencent.mm.ui.base.preference.h0) preferenceScreen4).m("biz_msg_rec_loading_pref", true);
        com.tencent.mm.ui.base.preference.r preferenceScreen5 = getPreferenceScreen();
        kotlin.jvm.internal.o.d(preferenceScreen5);
        ((com.tencent.mm.ui.base.preference.h0) preferenceScreen5).m("biz_msg_read_dot_switch", true);
        com.tencent.mm.ui.base.preference.r preferenceScreen6 = getPreferenceScreen();
        kotlin.jvm.internal.o.d(preferenceScreen6);
        ((com.tencent.mm.ui.base.preference.h0) preferenceScreen6).m("biz_msg_my_my_biz_setting_title", true);
        kotlinx.coroutines.l.d(v65.m.b(this), null, null, new com.tencent.mm.plugin.brandservice.ui.timeline.t3(this, null), 3, null);
        X6();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        if (rVar == null) {
            return false;
        }
        kotlin.jvm.internal.o.d(preference);
        java.lang.String str = preference.f197780q;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineSettingUI", str + " item has been clicked!");
        kotlin.jvm.internal.o.d(str);
        if (r26.i0.n("biz_msg_rec_pref", str, false) || r26.i0.n("biz_msg_pay_for_head_pref", str, false) || r26.i0.n("biz_msg_read_dot_switch", str, false) || r26.i0.n("biz_msg_finder_rec_pref", str, false)) {
            this.f94090h.f389700d = W6().N();
            this.f94090h.f389704h = ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) this.f94087e).getValue()).N() ? 1 : 2;
            this.f94090h.f389701e = ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) this.f94088f).getValue()).N();
            this.f94090h.f389703g = ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) this.f94089g).getValue()).N() ? 1 : 2;
            if (r26.i0.n("biz_msg_rec_pref", str, false)) {
                com.tencent.wechat.mm.biz.g5 g5Var = this.f94091i;
                com.tencent.wechat.mm.biz.g5 g5Var2 = com.tencent.wechat.mm.biz.g5.kDefault;
                if (g5Var != g5Var2) {
                    this.f94091i = g5Var2;
                } else if (W6().N()) {
                    this.f94091i = com.tencent.wechat.mm.biz.g5.kOpen;
                } else {
                    this.f94091i = com.tencent.wechat.mm.biz.g5.kClose;
                }
            }
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.brandservice.ui.timeline.m3 m3Var = new com.tencent.mm.plugin.brandservice.ui.timeline.m3(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(m3Var, 800L, false);
            Y6(this.f94090h, str);
        }
        return false;
    }
}
