package com.tencent.mm.open_voice_control.card;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/open_voice_control/card/A2ACardActivity;", "Lcom/tencent/mm/ui/BaseActivity;", "<init>", "()V", "f41/a", "open-voice-control-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class A2ACardActivity extends com.tencent.mm.ui.BaseActivity {
    public static final f41.a B = new f41.a(null);
    public android.content.res.Resources A;

    /* renamed from: z, reason: collision with root package name */
    public boolean f72224z;

    public final void T6(androidx.fragment.app.Fragment fragment) {
        androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.k(com.tencent.mm.R.id.gd9, fragment, null);
        beginTransaction.e();
    }

    public final void U6(int i17, java.lang.String[] usernames, f41.n scene) {
        kotlin.jvm.internal.o.g(usernames, "usernames");
        kotlin.jvm.internal.o.g(scene, "scene");
        int i18 = com.tencent.mm.open_voice_control.card.SelectContactCard.f72234p;
        com.tencent.mm.open_voice_control.card.SelectContactCard selectContactCard = new com.tencent.mm.open_voice_control.card.SelectContactCard();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("ui_id", i17);
        bundle.putStringArray("usernames", usernames);
        bundle.putInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, scene.ordinal());
        selectContactCard.setArguments(bundle);
        T6(selectContactCard);
    }

    public final void V6(int i17, java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        int i18 = com.tencent.mm.open_voice_control.card.SendMsgCard.f72243v;
        com.tencent.mm.open_voice_control.card.SendMsgCard sendMsgCard = new com.tencent.mm.open_voice_control.card.SendMsgCard();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("ui_id", i17);
        bundle.putString(dm.i4.COL_USERNAME, username);
        sendMsgCard.setArguments(bundle);
        T6(sendMsgCard);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, com.tencent.mm.R.anim.f477722j);
    }

    @Override // com.tencent.mm.ui.BaseActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f487860dy3;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        if (getAssets() == null || com.tencent.mm.sdk.platformtools.x2.f193075e == null) {
            android.content.res.Resources resources = super.getResources();
            kotlin.jvm.internal.o.f(resources, "getResources(...)");
            return resources;
        }
        if (!this.f72224z || this.A == null) {
            android.content.res.Resources resources2 = getBaseContext().getResources();
            android.content.res.Resources resources3 = com.tencent.mm.sdk.platformtools.x2.f193075e;
            this.A = resources3;
            if ((resources3 instanceof j65.j) && resources2 != null) {
                kotlin.jvm.internal.o.e(resources3, "null cannot be cast to non-null type com.tencent.mm.resources.MMResources");
                j65.j jVar = (j65.j) resources3;
                android.content.res.Configuration b17 = jVar.f297961e.b(resources2.getConfiguration());
                j65.m.c(b17, com.tencent.mm.ui.bk.E(this.A));
                jVar.getConfiguration().updateFrom(b17);
                this.A = jVar;
                this.f72224z = true;
            }
        }
        android.content.res.Resources resources4 = this.A;
        kotlin.jvm.internal.o.d(resources4);
        return resources4;
    }

    @Override // com.tencent.mm.ui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(1792);
        getWindow().setNavigationBarColor(0);
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 2 | 4);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        decorView.setBackgroundColor(0);
        getOnBackPressedDispatcher().a(this, new f41.b(this));
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_diable_a2a_watermark_android, 0) == 0) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.vov);
            for (int i17 = 0; i17 < 6; i17++) {
                android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(this);
                linearLayout2.setOrientation(0);
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 0);
                layoutParams.weight = 1.0f;
                linearLayout2.setLayoutParams(layoutParams);
                for (int i18 = 0; i18 < 3; i18++) {
                    android.widget.TextView textView = new android.widget.TextView(this);
                    android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(0, -1);
                    layoutParams2.weight = 1.0f;
                    textView.setLayoutParams(layoutParams2);
                    textView.setAlpha(0.08f);
                    textView.setGravity(17);
                    textView.setRotation(-30.0f);
                    textView.setTextColor(getColor(com.tencent.mm.R.color.FG_0));
                    textView.setTextSize(14.0f);
                    com.tencent.mm.ui.fk.a(textView);
                    textView.setText("内部测试严禁外传\n" + c01.z1.b());
                    linearLayout2.addView(textView);
                }
                linearLayout.addView(linearLayout2);
            }
        }
        if (bundle == null) {
            f41.c cVar = (f41.c) ((rz5.c) f41.c.f259473g).get(getIntent().getIntExtra("card_type", 0));
            int intExtra = getIntent().getIntExtra("ui_id", 0);
            if (cVar == f41.c.f259470d) {
                java.lang.String[] stringArrayExtra = getIntent().getStringArrayExtra("usernames");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new java.lang.String[0];
                }
                U6(intExtra, stringArrayExtra, (f41.n) ((rz5.c) f41.n.f259501h).get(getIntent().getIntExtra("select_contact_scene", 0)));
                return;
            }
            if (cVar == f41.c.f259471e) {
                com.tencent.mm.open_voice_control.card.PermissionRequestCard permissionRequestCard = new com.tencent.mm.open_voice_control.card.PermissionRequestCard();
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putInt("ui_id", intExtra);
                permissionRequestCard.setArguments(bundle2);
                T6(permissionRequestCard);
                return;
            }
            if (cVar != f41.c.f259474h) {
                java.lang.String stringExtra = getIntent().getStringExtra(dm.i4.COL_USERNAME);
                if (stringExtra == null) {
                    stringExtra = "";
                }
                V6(intExtra, stringExtra);
                return;
            }
            com.tencent.mm.open_voice_control.card.LoadingCard loadingCard = new com.tencent.mm.open_voice_control.card.LoadingCard();
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putInt("ui_id", intExtra);
            loadingCard.setArguments(bundle3);
            T6(loadingCard);
        }
    }
}
