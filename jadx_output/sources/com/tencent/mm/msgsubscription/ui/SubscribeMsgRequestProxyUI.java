package com.tencent.mm.msgsubscription.ui;

@db5.a(7)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/msgsubscription/ui/SubscribeMsgRequestProxyUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-comm_release"}, k = 1, mv = {1, 9, 0})
@gm0.a2
/* loaded from: classes9.dex */
public final class SubscribeMsgRequestProxyUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f71874u = 0;

    /* renamed from: d, reason: collision with root package name */
    public fl1.c0 f71875d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f71876e;

    /* renamed from: f, reason: collision with root package name */
    public h31.r f71877f;

    /* renamed from: g, reason: collision with root package name */
    public int f71878g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f71879h = jz5.h.b(new m31.x1(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f71880i = jz5.h.b(new m31.s1(this));

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f71881m = jz5.h.b(new m31.r1(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f71882n = jz5.h.b(new m31.q1(this));

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f71883o = jz5.h.b(new m31.a2(this));

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f71884p = jz5.h.b(new m31.z1(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f71885q = jz5.h.b(new m31.t1(this));

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f71886r = jz5.h.b(new m31.w1(this));

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f71887s = jz5.h.b(new m31.u1(this));

    /* renamed from: t, reason: collision with root package name */
    public final m31.y1 f71888t = new m31.y1(this);

    public static void T6(com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI subscribeMsgRequestProxyUI, int i17, java.lang.String str, boolean z17, android.os.Bundle bundle, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            z17 = false;
        }
        if ((i18 & 8) != 0) {
            bundle = null;
        }
        ((java.lang.Boolean) ((jz5.n) subscribeMsgRequestProxyUI.f71886r).getValue()).booleanValue();
        if (!((java.lang.Boolean) ((jz5.n) subscribeMsgRequestProxyUI.f71886r).getValue()).booleanValue()) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = subscribeMsgRequestProxyUI.f71876e;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            if (z17) {
                subscribeMsgRequestProxyUI.getContentView().postDelayed(new m31.v1(subscribeMsgRequestProxyUI), 300L);
                return;
            } else {
                subscribeMsgRequestProxyUI.finish();
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_result_err_code", i17);
        intent.putExtra("key_result_err_msg", str);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        subscribeMsgRequestProxyUI.setResult(-1, intent);
        com.tencent.mm.ui.widget.dialog.u3 u3Var2 = subscribeMsgRequestProxyUI.f71876e;
        if (u3Var2 != null) {
            u3Var2.dismiss();
        }
        if (z17) {
            subscribeMsgRequestProxyUI.getContentView().postDelayed(new m31.v1(subscribeMsgRequestProxyUI), 300L);
        } else {
            subscribeMsgRequestProxyUI.finish();
        }
    }

    public final int U6() {
        return ((java.lang.Number) ((jz5.n) this.f71882n).getValue()).intValue();
    }

    public final java.lang.String V6() {
        return (java.lang.String) ((jz5.n) this.f71880i).getValue();
    }

    public final int W6() {
        return ((java.lang.Number) ((jz5.n) this.f71879h).getValue()).intValue();
    }

    public final void X6(boolean z17) {
        T6(this, 10005, "user cancel", z17, null, 8, null);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i17 = this.f71878g;
        h31.s sVar = h31.s.f278446a;
        if (i17 == 3 || i17 == 1) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f71876e;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            h31.s.f278446a.a(this.f71877f);
            X6(false);
            return;
        }
        if (!(i17 == 2)) {
            h31.s.f278446a.a(this.f71877f);
            X6(false);
            return;
        }
        fl1.c0 c0Var = this.f71875d;
        if (c0Var != null && c0Var.e()) {
            return;
        }
        h31.s.f278446a.a(this.f71877f);
        X6(false);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        h31.r rVar;
        super.onCreate(bundle);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        this.f71876e = db5.e1.Q(this, "", getResources().getString(com.tencent.mm.R.string.gga), false, false, null);
        int W6 = W6();
        jz5.g gVar = this.f71887s;
        jz5.g gVar2 = this.f71881m;
        if (W6 == 1) {
            rVar = new h31.r(new java.lang.ref.WeakReference(getContext()), U6(), V6(), (java.lang.String) ((jz5.n) gVar2).getValue(), (java.lang.String) ((jz5.n) this.f71884p).getValue(), (java.lang.String) ((jz5.n) this.f71885q).getValue(), (java.lang.String) ((jz5.n) gVar).getValue(), this.f71888t);
        } else if (W6() == 2) {
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(getContext());
            int U6 = U6();
            java.lang.String bizAppId = (java.lang.String) ((jz5.n) gVar2).getValue();
            java.lang.Object value = ((jz5.n) this.f71883o).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            java.lang.String extInfo = (java.lang.String) ((jz5.n) gVar).getValue();
            m31.y1 y1Var = this.f71888t;
            kotlin.jvm.internal.o.g(bizAppId, "bizAppId");
            kotlin.jvm.internal.o.g(extInfo, "extInfo");
            rVar = new h31.r(weakReference, U6, "", bizAppId, "", "", extInfo, y1Var);
            java.util.ArrayList arrayList = rVar.f278436j;
            arrayList.clear();
            arrayList.addAll((java.util.ArrayList) value);
            arrayList.size();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubscribeMsgRequestProxyUI", "requestSubscribeMessage scene invalid: " + W6());
            rVar = null;
        }
        this.f71877f = rVar;
        if (rVar != null) {
            rVar.f278444r = W6();
            int U62 = U6();
            h31.s sVar = h31.s.f278446a;
            if (U62 == 3 || U62 == 1) {
                rVar.c();
            } else {
                if (U6() == 2) {
                    rVar.c();
                }
            }
        }
        this.f71878g = U6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f71876e;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        h31.r rVar = this.f71877f;
        if (rVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandSubscribeMsgRequestController", "release");
            com.tencent.mm.ui.widget.dialog.j0 j0Var = rVar.f278437k;
            if (j0Var != null) {
                j0Var.dismiss();
            }
            m31.p1 p1Var = rVar.f278438l;
            if (p1Var != null) {
                p1Var.dismiss();
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getWindow().setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.f478490b));
    }
}
