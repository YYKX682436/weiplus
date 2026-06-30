package com.tencent.mm.plugin.appbrand.phonenumber;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManagerUI;", "Lcom/tencent/mm/ui/base/BaseLuggageActivity;", "<init>", "()V", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class PhoneNumberManagerUI extends com.tencent.mm.ui.base.BaseLuggageActivity {
    public static final /* synthetic */ int D = 0;
    public vi1.h0 B;
    public boolean C;

    public final void U6(boolean z17) {
        this.C = z17;
        vi1.h0 h0Var = this.B;
        if (h0Var != null) {
            vi1.b2 b2Var = (vi1.b2) h0Var;
            boolean z18 = !z17;
            b2Var.f437283g = z18;
            vi1.i0 i0Var = b2Var.f437280d;
            if (i0Var != null) {
                ((vi1.i2) i0Var).a(z18, b2Var.f437281e);
            }
        }
    }

    public final void V6() {
        java.util.LinkedList linkedList = this.f196605x;
        if (!linkedList.isEmpty()) {
            linkedList.clear();
            supportInvalidateOptionsMenu();
        }
        vi1.h0 h0Var = this.B;
        if (h0Var != null) {
            boolean z17 = this.C;
            vi1.b2 b2Var = (vi1.b2) h0Var;
            java.util.ArrayList arrayList = b2Var.f437281e;
            arrayList.clear();
            arrayList.addAll(vi1.o0.f437416a.b());
            vi1.i0 i0Var = b2Var.f437280d;
            if (i0Var != null) {
                ((vi1.i2) i0Var).a(z17, arrayList);
            }
        }
        boolean z18 = this.C;
        com.tencent.mm.ui.r1 r1Var = com.tencent.mm.ui.r1.TEXT;
        if (z18) {
            O6(0, 0, getString(com.tencent.mm.R.string.a3k), new vi1.c2(this), null, r1Var);
            Q6(new vi1.d2(this), com.tencent.mm.R.raw.actionbar_icon_dark_close, com.tencent.mm.ui.p1.CUSTOM);
        } else {
            O6(0, 0, getString(com.tencent.mm.R.string.a3q), new vi1.e2(this), null, r1Var);
            Q6(new vi1.f2(this), 0, com.tencent.mm.ui.p1.BACK);
        }
    }

    @Override // com.tencent.mm.ui.base.BaseLuggageActivity, com.tencent.mm.ui.BaseActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488023eo;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!this.C) {
            super.onBackPressed();
        } else {
            U6(false);
            V6();
        }
    }

    @Override // com.tencent.mm.ui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        vi1.i0 i0Var;
        setTheme(com.tencent.mm.R.style.f494678t8);
        super.onCreate(bundle);
        P6(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f478491c));
        setNavigationbarColor(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f478490b));
        if (getSupportActionBar() != null) {
            getSupportActionBar().G(0.0f);
        }
        setTitle(com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.a3r));
        java.lang.String stringExtra = getIntent().getStringExtra("APPID");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.view.View view = null;
        iz5.a.c(null, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.PhoneNumberManagerUI", "onCreate() appId:" + stringExtra);
        java.lang.String stringExtra2 = getIntent().getStringExtra("PAGEPATH");
        vi1.g0 a17 = vi1.l1.f437399a.a();
        kotlin.jvm.internal.o.d(stringExtra);
        kotlin.jvm.internal.o.d(stringExtra2);
        vi1.h0 U1 = a17.U1(this, stringExtra, stringExtra2);
        this.B = U1;
        if (U1 != null) {
            vi1.b2 b2Var = (vi1.b2) U1;
            b2Var.f437280d = new vi1.i2(b2Var.f437277a, b2Var);
            java.util.ArrayList arrayList = b2Var.f437281e;
            arrayList.clear();
            arrayList.addAll(vi1.o0.f437416a.b());
            vi1.l2.f437401a.b(b2Var.f437278b);
        }
        vi1.h0 h0Var = this.B;
        if (h0Var != null && (i0Var = ((vi1.b2) h0Var).f437280d) != null) {
            view = ((vi1.i2) i0Var).f437333c;
        }
        setContentView(view);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        vi1.h0 h0Var = this.B;
        if (h0Var != null) {
            vi1.l2.f437401a.c(((vi1.b2) h0Var).f437278b);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        V6();
    }
}
