package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderMusicTopicVideoFlowUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderBaseGridFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/x10;", "Lcom/tencent/mm/plugin/finder/feed/r10;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderMusicTopicVideoFlowUI */
/* loaded from: classes2.dex */
public final class ActivityC14056xd83dc38d extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13938x39dfb2f<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10> {

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 f190996t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 f190997u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f190998v = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.rg(this));

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    /* renamed from: W6 */
    public int getD() {
        return 138;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13938x39dfb2f
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0 c7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 r10Var = this.f190996t;
        if (r10Var != null) {
            return r10Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13938x39dfb2f
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 d7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 x10Var = this.f190997u;
        if (x10Var != null) {
            return x10Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13938x39dfb2f
    public void f7() {
        mo56582xbf7c1df6(g7() ? com.p314xaae8f345.mm.R.C30867xcad56011.ezd : com.p314xaae8f345.mm.R.C30867xcad56011.eqe);
        if (g7()) {
            int dimensionPixelOffset = mo55332x76847179().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561206ca);
            findViewById(com.p314xaae8f345.mm.R.id.oh8).setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
        }
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        int intExtra = getIntent().getIntExtra("KEY_INNER_TAB_TYPE", 3);
        final java.lang.String stringExtra = getIntent().getStringExtra("key_activity_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        final r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        final java.lang.String stringExtra2 = getIntent().getStringExtra("key_by_pass_info");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba c13918xdafe8cba = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba(stringExtra, V6, stringExtra2) { // from class: com.tencent.mm.plugin.finder.feed.ui.FinderMusicTopicVideoFlowUI$initOnCreate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(15, stringExtra, V6, stringExtra2, 0, 16, null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
            }

            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28
            /* renamed from: interceptPostStart */
            public boolean mo56105x90835900() {
                return true;
            }
        };
        c13918xdafe8cba.m56361x5fd54ec8(getIntent());
        c13918xdafe8cba.f189213s = getIntent().getLongExtra("key_activity_id", 0L);
        c13918xdafe8cba.f189214t = getIntent().getStringExtra("key_encrypted_topic_id");
        c13918xdafe8cba.f189215u = intExtra;
        c13918xdafe8cba.f189208n = java.lang.Long.valueOf(getIntent().getLongExtra("key_feed_ref_id", 0L));
        c13918xdafe8cba.f189217w = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.pg pgVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.pg(this, 138, c13918xdafe8cba);
        java.lang.String stringExtra3 = getIntent().getStringExtra("key_topic_title");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        pgVar.f190401o = stringExtra3;
        pgVar.f190399m = 15;
        pgVar.f190400n = getIntent().getLongExtra("key_activity_id", 0L);
        this.f190996t = pgVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.qg qgVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.qg(this, 138);
        java.lang.String stringExtra4 = getIntent().getStringExtra("key_topic_title");
        qgVar.F = stringExtra4 != null ? stringExtra4 : "";
        qgVar.I = getIntent().getLongExtra("key_activity_id", 0L);
        qgVar.D = 15;
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.m6e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        qgVar.f187713m = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) findViewById;
        qgVar.f192556J = intExtra;
        qgVar.N = false;
        this.f190997u = qgVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 r10Var = this.f190996t;
        if (r10Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        qgVar.f187715o = r10Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 x10Var = this.f190997u;
        if (x10Var != null) {
            x10Var.f187713m.m82690xd3a27e96(false);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
    }

    public final boolean g7() {
        return ((java.lang.Boolean) ((jz5.n) this.f190998v).mo141623x754a37bb()).booleanValue();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570576b45;
    }
}
