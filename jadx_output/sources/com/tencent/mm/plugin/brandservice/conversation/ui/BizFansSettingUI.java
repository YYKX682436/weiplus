package com.tencent.mm.plugin.brandservice.conversation.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/brandservice/conversation/ui/BizFansSettingUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BizFansSettingUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f93957v = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f93958d;

    /* renamed from: g, reason: collision with root package name */
    public int f93961g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f93963i;

    /* renamed from: s, reason: collision with root package name */
    public final androidx.activity.result.c f93970s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f93971t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f93972u;

    /* renamed from: e, reason: collision with root package name */
    public boolean f93959e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f93960f = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f93962h = true;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f93964m = jz5.h.b(new ir1.t1(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f93965n = jz5.h.b(new ir1.y1(this));

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f93966o = jz5.h.b(new ir1.w1(this));

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f93967p = jz5.h.b(new ir1.x1(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f93968q = jz5.h.b(new ir1.a2(this));

    /* renamed from: r, reason: collision with root package name */
    public final kotlinx.coroutines.r2 f93969r = kotlinx.coroutines.l.d(v65.m.b(this), null, null, new ir1.s1(this, null), 3, null);

    public BizFansSettingUI() {
        androidx.activity.result.c registerForActivityResult = registerForActivityResult(new h.f(), new ir1.o1(this));
        kotlin.jvm.internal.o.f(registerForActivityResult, "registerForActivityResult(...)");
        this.f93970s = registerForActivityResult;
    }

    public static final void V6(com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI bizFansSettingUI) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = bizFansSettingUI.f93972u;
        if (u3Var != null) {
            u3Var.dismiss();
            bizFansSettingUI.f93972u = null;
        }
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(bizFansSettingUI, null, bizFansSettingUI.getString(com.tencent.mm.R.string.f490604zq), true, false, ir1.d2.f293956d);
        bizFansSettingUI.f93972u = Q;
        if (Q != null) {
            Q.setOnCancelListener(new ir1.e2(bizFansSettingUI));
        }
    }

    public final void W6() {
        java.lang.String c17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.vn3 vn3Var = new r45.vn3();
        if (this.f93958d == 5) {
            rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr = tk.s.f419870d;
            c17 = ((ox.r) d0Var).Bi(2).c();
        } else {
            rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr2 = tk.s.f419870d;
            c17 = ((ox.r) d0Var2).Bi(1).c();
        }
        vn3Var.f388394d = c17;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add("filter_spam_fansmsg");
        linkedList.add("close_notice_fansmsg");
        linkedList.add("private_msg_scope");
        linkedList.add("is_one_msg_before_reply");
        vn3Var.f388395e = linkedList;
        lVar.f70664a = vn3Var;
        lVar.f70665b = new r45.wn3();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/mp/getsetting";
        lVar.f70667d = 26995;
        com.tencent.mm.modelbase.z2.d(lVar.a(), new ir1.p1(new kotlin.jvm.internal.c0(), new java.lang.ref.WeakReference(this)), false);
    }

    public final com.tencent.mm.ui.base.preference.CheckBoxPreference X6() {
        return (com.tencent.mm.ui.base.preference.CheckBoxPreference) this.f93967p.getValue();
    }

    public final r45.s26 Y6() {
        return (r45.s26) this.f93968q.getValue();
    }

    public final boolean Z6() {
        java.util.LinkedList<r45.k36> list = Y6().f385448e;
        kotlin.jvm.internal.o.f(list, "list");
        for (r45.k36 k36Var : list) {
            if (kotlin.jvm.internal.o.b(k36Var.f378341d, "filter_spam_fansmsg")) {
                return kotlin.jvm.internal.o.b(k36Var.f378342e, "0");
            }
        }
        return true;
    }

    public final boolean a7() {
        java.util.LinkedList<r45.k36> list = Y6().f385448e;
        kotlin.jvm.internal.o.f(list, "list");
        for (r45.k36 k36Var : list) {
            if (kotlin.jvm.internal.o.b(k36Var.f378341d, "close_notice_fansmsg")) {
                return kotlin.jvm.internal.o.b(k36Var.f378342e, "0");
            }
        }
        return true;
    }

    public final void b7(java.lang.String str) {
        if (r26.i0.n("biz_fans_msg_hide_disturb_pref", str, false) || r26.i0.n("biz_fans_remind_pref", str, false) || r26.i0.n("biz_fans_private_msg_scope_pref", str, false) || r26.i0.n("biz_fans_receive_on_msg_limited_pref", str, false)) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            r45.k36 k36Var = new r45.k36();
            k36Var.f378341d = "filter_spam_fansmsg";
            k36Var.f378342e = ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) this.f93964m).getValue()).N() ? "0" : "1";
            linkedList.add(k36Var);
            r45.k36 k36Var2 = new r45.k36();
            k36Var2.f378341d = "close_notice_fansmsg";
            k36Var2.f378342e = ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((jz5.n) this.f93965n).getValue()).N() ? "0" : "1";
            linkedList.add(k36Var2);
            r45.k36 k36Var3 = new r45.k36();
            k36Var3.f378341d = "private_msg_scope";
            k36Var3.f378342e = java.lang.String.valueOf(this.f93961g);
            linkedList.add(k36Var3);
            r45.k36 k36Var4 = new r45.k36();
            k36Var4.f378341d = "is_one_msg_before_reply";
            k36Var4.f378342e = X6().N() ? "1" : "0";
            linkedList.add(k36Var4);
            Y6().f385448e = linkedList;
            ku5.u0 u0Var = ku5.t0.f312615d;
            ir1.q1 q1Var = new ir1.q1(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(q1Var, 800L, false);
            c7(Y6(), str);
        }
    }

    public final void c7(r45.s26 s26Var, java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = s26Var;
        lVar.f70665b = new r45.t26();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/mp/setsetting";
        lVar.f70667d = 29575;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        this.f93971t = true;
        com.tencent.mm.modelbase.z2.d(a17, new ir1.z1(c0Var, this, weakReference, str), false);
    }

    public final void d7(int i17) {
        java.lang.String string;
        this.f93961g = i17;
        com.tencent.mm.ui.base.preference.Preference preference = (com.tencent.mm.ui.base.preference.Preference) this.f93966o.getValue();
        int i18 = this.f93961g;
        if (i18 == 0) {
            string = getString(com.tencent.mm.R.string.nfr);
            kotlin.jvm.internal.o.d(string);
        } else if (i18 == 1) {
            string = getString(com.tencent.mm.R.string.nfs);
            kotlin.jvm.internal.o.d(string);
        } else if (i18 == 2) {
            string = getString(com.tencent.mm.R.string.nft);
            kotlin.jvm.internal.o.d(string);
        } else if (i18 != 3) {
            string = "";
        } else {
            string = getString(com.tencent.mm.R.string.nfu);
            kotlin.jvm.internal.o.d(string);
        }
        preference.H(string);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        if (this.f93963i) {
            if (!a7() && this.f93960f) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_remind_changed", this.f93963i);
                setResult(-1, intent);
            }
            if (a7() && !this.f93960f) {
                if (this.f93958d == 5) {
                    nr1.f Vi = yq1.u0.Vi();
                    kotlin.jvm.internal.o.f(Vi, "getBizPhotoFansConversationStorage(...)");
                    nr1.d dVar = nr1.f.f339140e;
                    rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
                    tk.s[] sVarArr = tk.s.f419870d;
                    Vi.y0(jr1.j.c(((ox.r) d0Var).Bi(2).c()));
                } else {
                    hr1.i Di = yq1.u0.Di();
                    kotlin.jvm.internal.o.f(Di, "getBizFansConversationStorage(...)");
                    hr1.i.y0(Di, null, 1, null);
                }
                ((gr1.h) ((gr1.n) ((rk.g) i95.n0.c(rk.g.class))).wi()).b(this.f93958d);
            }
        }
        super.finish();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.layout.dzp;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("serviceType", 0);
        this.f93958d = intExtra;
        boolean z17 = intExtra == 5;
        if (!((qv.i) ((rv.q2) i95.n0.c(rv.q2.class))).wi() || z17) {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("biz_fans_private_msg_scope_pref", true);
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("biz_fans_receive_on_msg_limited_pref", true);
        }
        setMMTitle(com.tencent.mm.R.string.n5r);
        setTitleDividerVis(false);
        hideActionbarLine();
        setBackBtn(new ir1.u1(this));
        kotlinx.coroutines.l.d(v65.m.b(this), null, null, new ir1.v1(this, null), 3, null);
        W6();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        if (rVar == null) {
            return false;
        }
        kotlin.jvm.internal.o.d(preference);
        java.lang.String str = preference.f197780q;
        com.tencent.mars.xlog.Log.i("BizFans.BizFansSettingUI", str + " item has been clicked!");
        kotlin.jvm.internal.o.d(str);
        if (r26.i0.n("biz_fans_private_msg_scope_pref", str, false)) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.brandservice.conversation.ui.BizFansPrivateMsgScopeSettingUI.class);
            intent.putExtra("key_ori_scope_type", this.f93961g);
            this.f93970s.a(intent, null);
            return true;
        }
        if (r26.i0.n("biz_fans_msg_hide_disturb_pref", str, false) || r26.i0.n("biz_fans_remind_pref", str, false)) {
            b7(str);
            return true;
        }
        if (!r26.i0.n("biz_fans_receive_on_msg_limited_pref", str, false)) {
            return false;
        }
        if (X6().N()) {
            db5.e1.A(this, getString(com.tencent.mm.R.string.nfx), getString(com.tencent.mm.R.string.nfz), getString(com.tencent.mm.R.string.nfy), getString(com.tencent.mm.R.string.nfw), new ir1.f2(this), new ir1.g2(this));
        } else {
            b7(str);
        }
        return true;
    }
}
