package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44;

/* loaded from: classes12.dex */
public final class m1 extends com.p314xaae8f345.mm.ui.p2740x696c9db.c9 {

    /* renamed from: r, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f219834r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f219835s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.l1 f219836t;

    public m1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f219834r = activity;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c9
    public boolean h() {
        return this.f219835s;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c9
    public void j(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f, android.view.Menu menu) {
        if (activityC1102x9ee2d9f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTS.FTSVoiceSearchViewHelper", "on add search menu, activity is null");
            return;
        }
        if (this.f291856h == null) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.g(activityC1102x9ee2d9f)) {
                s();
            } else {
                this.f291856h = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.C15620x588c74c5(activityC1102x9ee2d9f);
            }
        }
        super.j(activityC1102x9ee2d9f, menu);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c9
    public void p() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.l1 l1Var = this.f219836t;
        if (l1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15592x3f0b3363 activityC15592x3f0b3363 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.k0) l1Var).f219624a;
            activityC15592x3f0b3363.m67437x4bd5310().B3(new b23.g(activityC15592x3f0b3363.K1));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c9
    public void r(java.lang.String str) {
        t(str, k23.r2.f385216e);
    }

    public final void s() {
        if (this.f291856h != null) {
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f219834r;
        this.f291856h = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v(activityC0065xcd7aa112);
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activityC0065xcd7aa112).a(z13.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        z13.f fVar = (z13.f) a17;
        com.p314xaae8f345.mm.ui.p2740x696c9db.o3 o3Var = this.f291856h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(o3Var, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.widget.FTSActionBarNewSearchView");
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v) o3Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSAISearchManagerUIC", "[ftsaisearch] setSearchView " + vVar);
        fVar.f550932e = vVar;
        yz5.l lVar = fVar.f550933f;
        if (lVar != null) {
            vVar.C = lVar;
        }
        java.lang.Object obj = this.f291856h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type android.view.View");
        if (((android.view.View) obj).getParent() == null) {
            android.view.View findViewById = activityC0065xcd7aa112.findViewById(com.p314xaae8f345.mm.R.id.u8p);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) findViewById).addView((android.view.View) this.f291856h);
        }
    }

    public final void t(java.lang.String str, k23.r2 voiceTextType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voiceTextType, "voiceTextType");
        try {
            super.r(str);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = this.f219834r;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(context).a(z13.f.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            z13.f fVar = (z13.f) a17;
            if (str == null) {
                str = "";
            }
            fVar.h7(str, voiceTextType, "", true);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.FTSVoiceSearchViewHelper", "setSearchContent exception: " + e17.getMessage());
        }
    }

    public final void u(java.lang.String str) {
        super.r(str);
    }
}
