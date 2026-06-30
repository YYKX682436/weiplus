package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f211242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f211243e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15010xb447a21d f211244f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.zi2 f211245g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wt3.h0 f211246h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f211247i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(boolean z17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15010xb447a21d activityC15010xb447a21d, r45.zi2 zi2Var, wt3.h0 h0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        super(0);
        this.f211242d = z17;
        this.f211243e = str;
        this.f211244f = activityC15010xb447a21d;
        this.f211245g = zi2Var;
        this.f211246h = h0Var;
        this.f211247i = u3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        if (this.f211242d) {
            java.lang.String str = this.f211243e;
            if (!com.p314xaae8f345.mm.vfs.w6.j(str) || com.p314xaae8f345.mm.vfs.w6.k(str) <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.AlbumUI", "onHeaderClicked: download file error");
            } else {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15010xb447a21d.L2;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15010xb447a21d activityC15010xb447a21d = this.f211244f;
                activityC15010xb447a21d.getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enterFollowMusicTake() called with: musicInfo = ");
                r45.zi2 zi2Var = this.f211245g;
                sb6.append(zi2Var);
                sb6.append(", audioInfo = ");
                wt3.h0 h0Var = this.f211246h;
                sb6.append(h0Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AlbumUI", sb6.toString());
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_finder_post_router", 2);
                java.lang.String m75945x2fec8307 = zi2Var.m75945x2fec8307(12);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_ID", m75945x2fec8307);
                intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_PATH", ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a) h0Var).f237248i);
                intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_INFO", zi2Var.mo14344x5f01b1f6());
                intent.putExtra("KEY_FINDER_POST_BGM_IF_ORIGIN", false);
                intent.putExtra("KEY_FINDER_POST_ORIGIN_BGM_URL", zi2Var.m75945x2fec8307(5));
                intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_NAME", java.lang.String.valueOf(zi2Var.m75945x2fec8307(2)));
                intent.putExtra("key_finder_post_from", activityC15010xb447a21d.getIntent().getIntExtra("key_finder_post_from", 5));
                intent.putExtra("key_finder_post_id", activityC15010xb447a21d.f210037u2);
                intent.putExtra("KEY_FINDER_POST_MUSIC_NEED_FINISH", true);
                activityC15010xb447a21d.F2.getClass();
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC15010xb447a21d.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.k1.f33803x366c91de);
                if (iq.b.g(mo55332x76847179) || iq.b.C(mo55332x76847179) || iq.b.v(mo55332x76847179) || iq.b.c(mo55332x76847179, true)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostChecker", "camera check false");
                    z17 = false;
                } else {
                    z17 = true;
                }
                if (z17) {
                    pf5.z zVar = pf5.z.f435481a;
                    java.lang.String str2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216915p;
                    if (str2 == null) {
                        str2 = "";
                    }
                    java.lang.String str3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216918q;
                    if (str3 == null) {
                        str3 = "";
                    }
                    intent.putExtra("key_finder_context_id", str2);
                    intent.putExtra("key_finder_session_id", str3);
                    intent.setClass(mo55332x76847179, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15053x15a6cfc3.class);
                    if (valueOf != null) {
                        int intValue = valueOf.intValue();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(java.lang.Integer.valueOf(intValue));
                        arrayList.add(intent);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.k(mo55332x76847179, arrayList.toArray(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderPostRouterUINoClearTop", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/Integer;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                    } else {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(mo55332x76847179, arrayList2.toArray(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderPostRouterUINoClearTop", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/Integer;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        mo55332x76847179.startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(mo55332x76847179, "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterFinderPostRouterUINoClearTop", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/Integer;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                    mo55332x76847179.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "enterFinderPostRouterUINoClearTop cameraCheck false!");
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                java.lang.String m75945x2fec83072 = zi2Var.m75945x2fec8307(12);
                jSONObject.put("songid", m75945x2fec83072 != null ? m75945x2fec83072 : "");
                c61.w8 w8Var = (c61.w8) activityC15010xb447a21d.D2;
                w8Var.bj("material_shot", 1, jSONObject, w8Var.wi(activityC15010xb447a21d));
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f211247i;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        return jz5.f0.f384359a;
    }
}
