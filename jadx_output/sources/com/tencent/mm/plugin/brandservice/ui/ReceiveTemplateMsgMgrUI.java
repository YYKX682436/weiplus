package com.tencent.mm.plugin.brandservice.ui;

/* loaded from: classes8.dex */
public class ReceiveTemplateMsgMgrUI extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0 {

    /* renamed from: h, reason: collision with root package name */
    public static java.util.LinkedList f94038h;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f94039d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f94040e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f94041f = false;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f94042g;

    public final void V6(boolean z17) {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.llp);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.llq);
        if (findViewById != null) {
            if (z17) {
                ((android.widget.TextView) findViewById).setVisibility(0);
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/brandservice/ui/ReceiveTemplateMsgMgrUI", "setEmptyTipsVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/brandservice/ui/ReceiveTemplateMsgMgrUI", "setEmptyTipsVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                return;
            }
            ((android.widget.TextView) findViewById).setVisibility(8);
            if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/brandservice/ui/ReceiveTemplateMsgMgrUI", "setEmptyTipsVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/brandservice/ui/ReceiveTemplateMsgMgrUI", "setEmptyTipsVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getHeaderResourceId() {
        return com.tencent.mm.R.layout.cce;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ccf;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494914bg;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.bge);
        this.f94039d = getPreferenceScreen();
        java.lang.String stringExtra = getIntent().getStringExtra("enterprise_biz_name");
        this.f94040e = stringExtra;
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "bizName is null");
            finish();
        } else {
            setBackBtn(new or1.z1(this));
            lr1.d0 d0Var = new lr1.d0(this.f94040e);
            gm0.j1.d().g(d0Var);
            this.f94042g = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.hsf), true, true, new or1.a2(this, d0Var));
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.d().a(1031, this);
        gm0.j1.d().a(mc1.c.CTRL_INDEX, this);
        initView();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(1031, this);
        gm0.j1.d().q(mc1.c.CTRL_INDEX, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        if (this.f94041f) {
            this.f94041f = false;
            gm0.j1.d().g(new lr1.i0(this.f94040e, f94038h));
        }
        super.onPause();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        if (f94038h == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "mRecvOptions == null");
            return false;
        }
        java.lang.String str = preference.f197780q;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "key is null");
            return false;
        }
        java.util.Iterator it = f94038h.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r45.ye4 ye4Var = (r45.ye4) it.next();
            java.lang.String str2 = ye4Var.f391012d;
            if (str2 == null) {
                str2 = "";
            }
            if (str.equals(str2)) {
                this.f94041f = true;
                if (((com.tencent.mm.ui.base.preference.CheckBoxPreference) preference).N()) {
                    ye4Var.f391014f = 0;
                } else {
                    ye4Var.f391014f = 1;
                }
            }
        }
        if (this.f94041f) {
            com.tencent.mm.sdk.platformtools.u3.i(new or1.b2(this), 4000L);
        }
        return false;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.protobuf.f fVar;
        if (m1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "onSceneEnd: [%d], [%d], [%s], scene is null", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "onSceneEnd: [%d], [%d], [%s], sceneType[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(m1Var.getType()));
        if (m1Var.getType() != 1031) {
            if (m1Var.getType() == 1030) {
                if (i17 == 0 && i18 == 0) {
                    return;
                }
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                dp.a.makeText(context, context.getString(com.tencent.mm.R.string.hsd), 0).show();
                return;
            }
            return;
        }
        android.app.ProgressDialog progressDialog = this.f94042g;
        r45.af4 af4Var = null;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f94042g.dismiss();
            this.f94042g = null;
        }
        if (i17 != 0 || i18 != 0) {
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            dp.a.makeText(context2, context2.getString(com.tencent.mm.R.string.hsc), 1).show();
            V6(true);
            return;
        }
        com.tencent.mm.modelbase.o oVar = ((lr1.d0) m1Var).f320650e;
        if (oVar != null && (fVar = oVar.f70711b.f70700a) != null) {
            af4Var = (r45.af4) fVar;
        }
        java.util.LinkedList linkedList = af4Var.f369980d;
        f94038h = linkedList;
        ((com.tencent.mm.ui.base.preference.h0) this.f94039d).t();
        if (linkedList == null || linkedList.size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "recvOption is empty");
            V6(true);
            return;
        }
        V6(false);
        linkedList.size();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.ye4 ye4Var = (r45.ye4) it.next();
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = new com.tencent.mm.ui.base.preference.CheckBoxPreference(this);
            checkBoxPreference.f197785v = false;
            checkBoxPreference.C(ye4Var.f391012d);
            checkBoxPreference.L(ye4Var.f391013e);
            checkBoxPreference.L = ye4Var.f391014f == 0;
            ((com.tencent.mm.ui.base.preference.h0) this.f94039d).d(checkBoxPreference, -1);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f94039d).notifyDataSetChanged();
    }
}
