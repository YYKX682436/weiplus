package com.p314xaae8f345.mm.p965xc41bc71e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/msgsubscription/ui/BizSubscribeMsgManagerUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Li31/d;", "<init>", "()V", "m31/g", "plugin-comm_release"}, k = 1, mv = {1, 9, 0})
@gm0.a2
/* renamed from: com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI */
/* loaded from: classes9.dex */
public final class ActivityC11164x65f4bfb7 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a implements i31.d {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f153382n = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f153383d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f153384e = "";

    /* renamed from: f, reason: collision with root package name */
    public m31.f f153385f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f153386g;

    /* renamed from: h, reason: collision with root package name */
    public i31.a f153387h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p965xc41bc71e.ui.C11165x5b5212e8 f153388i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f153389m;

    public final void U6(boolean z17) {
        m31.f fVar = this.f153385f;
        boolean z18 = (fVar != null ? fVar.mo1894x7e414b06() : 0) > 0;
        com.p314xaae8f345.mm.p965xc41bc71e.ui.C11165x5b5212e8 c11165x5b5212e8 = this.f153388i;
        if (c11165x5b5212e8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("subscribeMsgList");
            throw null;
        }
        c11165x5b5212e8.setVisibility((z18 && z17) ? 0 : 8);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nrf);
        if (!z18 || z17) {
            textView.setVisibility(8);
        } else {
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.ake);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{this.f153384e}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            textView.setText(format);
            textView.setVisibility(0);
        }
        m31.f fVar2 = this.f153385f;
        if (fVar2 != null) {
            fVar2.m8146xced61ae5();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        i31.a aVar = this.f153387h;
        if (aVar != null) {
            aVar.g(this);
        }
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569756l2;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("key_biz_presenter_class");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (stringExtra.length() == 0) {
            throw new java.lang.Exception("Presenter ClassName is empty");
        }
        try {
            i31.a aVar = (i31.a) java.lang.Class.forName(stringExtra).newInstance();
            this.f153387h = aVar;
            if (aVar != null) {
                aVar.f369633a = this;
            }
            if (aVar != null) {
                aVar.d(this);
            }
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.akf);
            i31.a aVar2 = this.f153387h;
            this.f153385f = aVar2 != null ? aVar2.c(this) : null;
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.iiv);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            this.f153389m = (android.widget.LinearLayout) findViewById;
            android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.nra);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
            com.p314xaae8f345.mm.p965xc41bc71e.ui.C11165x5b5212e8 c11165x5b5212e8 = (com.p314xaae8f345.mm.p965xc41bc71e.ui.C11165x5b5212e8) findViewById2;
            this.f153388i = c11165x5b5212e8;
            c11165x5b5212e8.mo7960x6cab2c8d(this.f153385f);
            com.p314xaae8f345.mm.p965xc41bc71e.ui.C11165x5b5212e8 c11165x5b5212e82 = this.f153388i;
            if (c11165x5b5212e82 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("subscribeMsgList");
                throw null;
            }
            c11165x5b5212e82.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this, 1, false));
            android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.nrd);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById3, "null cannot be cast to non-null type com.tencent.mm.ui.widget.MMSwitchBtn");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById3;
            this.f153386g = viewOnClickListenerC22631x1cc07cc8;
            viewOnClickListenerC22631x1cc07cc8.m81396xb3e0a10a(new m31.h(this));
            android.widget.LinearLayout linearLayout = this.f153389m;
            if (linearLayout == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ll");
                throw null;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.aki));
            sb6.append(',');
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82 = this.f153386g;
            sb6.append((java.lang.Object) (viewOnClickListenerC22631x1cc07cc82 != null ? viewOnClickListenerC22631x1cc07cc82.getContentDescription() : null));
            linearLayout.setContentDescription(sb6.toString());
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc83 = this.f153386g;
            if (viewOnClickListenerC22631x1cc07cc83 != null) {
                viewOnClickListenerC22631x1cc07cc83.setFocusable(false);
            }
            java.lang.String stringExtra2 = getIntent().getStringExtra("key_biz_username");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            this.f153383d = stringExtra2;
            java.lang.String stringExtra3 = getIntent().getStringExtra("key_biz_nickname");
            java.lang.String str = stringExtra3 != null ? stringExtra3 : "";
            this.f153384e = str;
            m31.f fVar = this.f153385f;
            if (fVar != null) {
                fVar.f404672i = str;
            }
            java.lang.String str2 = this.f153383d;
            i31.a aVar3 = this.f153387h;
            if (aVar3 != null) {
                aVar3.a(str2, new m31.j(this));
            }
            mo54448x9c8c0d33(new m31.k(this));
        } catch (java.lang.Exception e17) {
            throw new java.lang.Exception("create presenter instance fail!", e17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        i31.a aVar = this.f153387h;
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSubscribeMsgManagerUI", "onDestroy");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        i31.a aVar = this.f153387h;
        if (aVar != null) {
            aVar.e(this);
        }
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        i31.a aVar = this.f153387h;
        if (aVar != null) {
            aVar.f(this);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(m31.g.class);
    }
}
