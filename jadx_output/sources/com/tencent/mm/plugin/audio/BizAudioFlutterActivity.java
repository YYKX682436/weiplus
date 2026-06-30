package com.tencent.mm.plugin.audio;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/audio/BizAudioFlutterActivity;", "Lcom/tencent/mm/plugin/flutter/ui/MMFlutterViewActivity;", "Lum1/a;", "<init>", "()V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BizAudioFlutterActivity extends com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity implements um1.a {

    /* renamed from: x, reason: collision with root package name */
    public static int f92465x = -1;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f92466u = "MicroMsg.BizAudioFlutterActivity#" + hashCode();

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f92467v = jz5.h.b(new mm1.k(this));

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f92468w = jz5.h.b(new mm1.i(this));

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity
    public boolean V6() {
        boolean h17 = ep1.m.h(((zm1.h) pf5.z.f353948a.a(this).a(zm1.h.class)).getActivity().getIntent());
        com.tencent.mars.xlog.Log.i(this.f92466u, "interceptEnterActivityStyle needEnterFloatBallAnimation " + h17);
        if (!h17) {
            return this instanceof com.tencent.mm.plugin.wenote.flutter.WeNoteFlutterUI;
        }
        overridePendingTransition(-1, com.tencent.mm.ui.uc.f211079b);
        return true;
    }

    public java.lang.Object a7(kotlin.coroutines.Continuation continuation) {
        ((zm1.h) pf5.z.f353948a.a(this).a(zm1.h.class)).f474144o = true;
        return jz5.f0.f302826a;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return f92465x;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.Set<java.lang.Class<? extends com.tencent.mm.ui.component.UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents != null) {
            return kz5.q1.i(importUIComponents, kz5.z.D0(new java.lang.Class[]{zm1.m.class, zm1.h.class, bn1.c0.class}));
        }
        return null;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onBusinessPermissionDenied(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f92466u, "onBusinessPermissionDenied permission: " + str);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onBusinessPermissionGranted(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f92466u, "onBusinessPermissionGranted permission: " + str);
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mm1.b0 b0Var = (mm1.b0) ((mm1.f0) ((rv.k2) i95.n0.c(rv.k2.class))).Bi();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizAudioRouter", "cancelDelayTerminal");
        ((fv.k) ((jz5.n) b0Var.f328642h).getValue()).b();
        pf5.z zVar = pf5.z.f353948a;
        ((zm1.m) zVar.a(this).a(zm1.m.class)).R((mm1.h) ((jz5.n) this.f92468w).getValue());
        ((zm1.m) zVar.a(this).a(zm1.m.class)).k5((mm1.j) ((jz5.n) this.f92467v).getValue());
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        java.lang.String stringExtra = getIntent().getStringExtra("session_id");
        rv.j2 Bi = ((mm1.f0) ((rv.k2) i95.n0.c(rv.k2.class))).Bi();
        if (stringExtra == null) {
            stringExtra = "";
        }
        mm1.b0 b0Var = (mm1.b0) Bi;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizAudioRouter", "delayTerminal, sessionId: ".concat(stringExtra));
        if (kotlin.jvm.internal.o.b(stringExtra, b0Var.f328639e)) {
            if (((ov.b) ((pv.z) i95.n0.c(pv.z.class))).Ai() == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizAudioRouter", "delayTerminal with empty status");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BizAudioRouter", "clearAppSessionId");
            b0Var.f328639e = "";
            ((fv.k) ((jz5.n) b0Var.f328642h).getValue()).c();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizAudioRouter", "delayTerminal, sessionId not match, return");
        }
        pf5.z zVar = pf5.z.f353948a;
        ((zm1.m) zVar.a(this).a(zm1.m.class)).m0((mm1.h) ((jz5.n) this.f92468w).getValue());
        ((zm1.m) zVar.a(this).a(zm1.m.class)).m2((mm1.j) ((jz5.n) this.f92467v).getValue());
        f92465x = -1;
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        um1.a aVar = mm1.b0.f328635i;
        if (kotlin.jvm.internal.o.b(mm1.b0.f328635i, this)) {
            mm1.b0.f328635i = null;
        }
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout;
        super.onResume();
        um1.a aVar = mm1.b0.f328635i;
        mm1.b0.f328635i = this;
        if (!ep1.m.h(getIntent()) || (swipeBackLayout = getSwipeBackLayout()) == null) {
            return;
        }
        swipeBackLayout.setNeedRequestActivityTranslucent(false);
        swipeBackLayout.d(true);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle outState) {
        kotlin.jvm.internal.o.g(outState, "outState");
        super.onSaveInstanceState(outState);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, pi0.o0
    public void pop() {
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new mm1.l(this, null), 3, null);
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, pi0.w0
    public void u3(pi0.w0 host) {
        kotlin.jvm.internal.o.g(host, "host");
        super.u3(host);
        finish();
    }
}
