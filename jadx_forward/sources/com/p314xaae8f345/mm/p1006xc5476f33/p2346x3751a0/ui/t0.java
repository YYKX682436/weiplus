package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui;

/* loaded from: classes14.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.C18918x502f85f5 f258520a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.e f258521b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f258522c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f258523d = false;

    public void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipVoiceMiniManager", "dismiss now.. isFinish: %b, smallView: %s", java.lang.Boolean.valueOf(z17), this.f258520a);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.C18918x502f85f5 c18918x502f85f5 = this.f258520a;
        if (c18918x502f85f5 == null) {
            if (z17) {
                iq4.b.f375331a.d();
                return;
            }
            return;
        }
        if (z17) {
            iq4.b.f375331a.f0(c18918x502f85f5);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.C18918x502f85f5 c18918x502f85f52 = this.f258520a;
        if (c18918x502f85f52 != null) {
            c18918x502f85f52.getClass();
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b abstractC18931xc27fcc5b = c18918x502f85f52.f258466e;
                if (abstractC18931xc27fcc5b != null) {
                    abstractC18931xc27fcc5b.j();
                }
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoipViewFragment", "recycle bitmap failed");
            }
            this.f258520a.setOnClickListener(null);
            this.f258520a = null;
        }
    }

    public final void b(final android.content.Intent intent, boolean z17, final boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipVoiceMiniManager", "mini now..");
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.C18918x502f85f5 c18918x502f85f5 = this.f258520a;
        if (c18918x502f85f5 != null) {
            this.f258521b.c(intent, c18918x502f85f5.a(z17, false));
            return;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f258520a = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.C18918x502f85f5(context, null);
        this.f258523d = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f258522c;
        if (b4Var != null) {
            b4Var.d();
        }
        this.f258520a.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.voip.ui.t0$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.t0 t0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.t0.this;
                t0Var.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                boolean z19 = z18;
                arrayList.add(java.lang.Boolean.valueOf(z19));
                android.content.Intent intent2 = intent;
                arrayList.add(intent2);
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/voip/ui/VoipMiniViewManager", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", t0Var, array);
                iq4.c cVar = iq4.b.f375331a;
                cVar.f174665d.M.f174623m = 3;
                ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().h0(cVar.f174665d);
                if (z19) {
                    intent2.addFlags(268435456);
                    android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent2);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/plugin/voip/ui/VoipMiniViewManager", "lambda$mini$1", "(ZLandroid/content/Intent;Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context2.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(context2, "com/tencent/mm/plugin/voip/ui/VoipMiniViewManager", "lambda$mini$1", "(ZLandroid/content/Intent;Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    java.lang.String str = gq4.v.Bi().f258091a.f257964u;
                    boolean z27 = gq4.v.Bi().f258091a.f257965v;
                    if (android.text.TextUtils.isEmpty(str)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VoipVoiceMiniManager", "null talkName");
                    } else {
                        ((y03.e) i95.n0.c(y03.e.class)).d8(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str, z27, new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.C18920x6790426());
                    }
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.v0(t0Var), false);
                t0Var.f258522c = b4Var2;
                b4Var2.c(2000L, 2000L);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.w0(t0Var), 200L);
                yj0.a.h(t0Var, "com/tencent/mm/plugin/voip/ui/VoipMiniViewManager", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        if (z17) {
            iq4.b.f375331a.e0(4, false, this.f258520a, 1L, false);
        } else {
            iq4.b.f375331a.e0(8, false, this.f258520a, 1L, false);
        }
        iq4.b.f375331a.z();
        this.f258521b.c(intent, this.f258520a.a(z17, false));
        e(gq4.v.Bi().w());
    }

    public void c(boolean z17) {
        if (this.f258520a == null || this.f258523d) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).A("showIcon");
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.e1(this, z17), "showIcon");
    }

    public void d(android.content.Intent intent, boolean z17, boolean z18, com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.e eVar) {
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoipVoiceMiniManager", "showMini, intent cannot be null!");
            return;
        }
        if (eVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoipVoiceMiniManager", "showMini, VoipMiniCallBack cannot be null!");
            return;
        }
        this.f258521b = eVar;
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            eVar.d();
            b(intent, z17, z18);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoipVoiceMiniManager", "mini, permission denied");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        tb0.i iVar = (tb0.i) i95.n0.c(tb0.i.class);
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kbt);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.u0 u0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.u0(this, eVar, intent, z17, z18);
        java.lang.String a17 = n25.a.a();
        ((sb0.f) iVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994.R6(context, 9, string, u0Var, true, false, a17);
    }

    public void e(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.C18918x502f85f5 c18918x502f85f5 = this.f258520a;
        if (c18918x502f85f5 != null) {
            c18918x502f85f5.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipViewFragment", "showRemoteCaptureState pause is " + z17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b abstractC18931xc27fcc5b = c18918x502f85f5.f258466e;
            if (abstractC18931xc27fcc5b != null) {
                abstractC18931xc27fcc5b.i(z17);
            }
        }
    }
}
