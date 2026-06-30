package com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/open_voice_control/card/A2ACardActivity;", "Lcom/tencent/mm/ui/BaseActivity;", "<init>", "()V", "f41/a", "open-voice-control-impl_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.open_voice_control.card.A2ACardActivity */
/* loaded from: classes11.dex */
public final class ActivityC11198x400818af extends com.p314xaae8f345.mm.ui.AbstractActivityC21348x43985120 {
    public static final f41.a B = new f41.a(null);
    public android.content.res.Resources A;

    /* renamed from: z, reason: collision with root package name */
    public boolean f153757z;

    public final void T6(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = mo7595x9cdc264().m7630xb2c12e75();
        m7630xb2c12e75.k(com.p314xaae8f345.mm.R.id.gd9, componentCallbacksC1101xa17d4670, null);
        m7630xb2c12e75.e();
    }

    public final void U6(int i17, java.lang.String[] usernames, f41.n scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(usernames, "usernames");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        int i18 = com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11202x49ad0094.f153767p;
        com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11202x49ad0094 c11202x49ad0094 = new com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11202x49ad0094();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("ui_id", i17);
        bundle.putStringArray("usernames", usernames);
        bundle.putInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, scene.ordinal());
        c11202x49ad0094.mo7562xe26dab14(bundle);
        T6(c11202x49ad0094);
    }

    public final void V6(int i17, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        int i18 = com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11205xa3c55569.f153776v;
        com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11205xa3c55569 c11205xa3c55569 = new com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11205xa3c55569();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("ui_id", i17);
        bundle.putString(dm.i4.f66875xa013b0d5, username);
        c11205xa3c55569.mo7562xe26dab14(bundle);
        T6(c11205xa3c55569);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, com.p314xaae8f345.mm.R.C30854x2dc211.f559255j);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21348x43985120
    /* renamed from: getLayoutId */
    public int mo32073x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569393dy3;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        if (getAssets() == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e == null) {
            android.content.res.Resources resources = super.getResources();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resources, "getResources(...)");
            return resources;
        }
        if (!this.f153757z || this.A == null) {
            android.content.res.Resources resources2 = getBaseContext().getResources();
            android.content.res.Resources resources3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
            this.A = resources3;
            if ((resources3 instanceof j65.j) && resources2 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(resources3, "null cannot be cast to non-null type com.tencent.mm.resources.MMResources");
                j65.j jVar = (j65.j) resources3;
                android.content.res.Configuration b17 = jVar.f379494e.b(resources2.getConfiguration());
                j65.m.c(b17, com.p314xaae8f345.mm.ui.bk.E(this.A));
                jVar.getConfiguration().updateFrom(b17);
                this.A = jVar;
                this.f153757z = true;
            }
        }
        android.content.res.Resources resources4 = this.A;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(resources4);
        return resources4;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21348x43985120, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.View decorView = getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(1792);
        getWindow().setNavigationBarColor(0);
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 2 | 4);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        decorView.setBackgroundColor(0);
        mo2510x96a7816d().a(this, new f41.b(this));
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_diable_a2a_watermark_android, 0) == 0) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.vov);
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
                    textView.setTextColor(getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                    textView.setTextSize(14.0f);
                    com.p314xaae8f345.mm.ui.fk.a(textView);
                    textView.setText("内部测试严禁外传\n" + c01.z1.b());
                    linearLayout2.addView(textView);
                }
                linearLayout.addView(linearLayout2);
            }
        }
        if (bundle == null) {
            f41.c cVar = (f41.c) ((rz5.c) f41.c.f341006g).get(getIntent().getIntExtra("card_type", 0));
            int intExtra = getIntent().getIntExtra("ui_id", 0);
            if (cVar == f41.c.f341003d) {
                java.lang.String[] stringArrayExtra = getIntent().getStringArrayExtra("usernames");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new java.lang.String[0];
                }
                U6(intExtra, stringArrayExtra, (f41.n) ((rz5.c) f41.n.f341034h).get(getIntent().getIntExtra("select_contact_scene", 0)));
                return;
            }
            if (cVar == f41.c.f341004e) {
                com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11201x6771ccd0 c11201x6771ccd0 = new com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11201x6771ccd0();
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putInt("ui_id", intExtra);
                c11201x6771ccd0.mo7562xe26dab14(bundle2);
                T6(c11201x6771ccd0);
                return;
            }
            if (cVar != f41.c.f341007h) {
                java.lang.String stringExtra = getIntent().getStringExtra(dm.i4.f66875xa013b0d5);
                if (stringExtra == null) {
                    stringExtra = "";
                }
                V6(intExtra, stringExtra);
                return;
            }
            com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11200x558f7a4c c11200x558f7a4c = new com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11200x558f7a4c();
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putInt("ui_id", intExtra);
            c11200x558f7a4c.mo7562xe26dab14(bundle3);
            T6(c11200x558f7a4c);
        }
    }
}
