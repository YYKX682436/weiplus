package aw2;

/* loaded from: classes10.dex */
public final class a implements ya2.r1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f96250d;

    /* renamed from: e, reason: collision with root package name */
    public final int f96251e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.Intent f96252f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15278x20ac9974 f96253g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f96254h;

    public a(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f96250d = activity;
        android.view.View findViewById = activity.findViewById(com.p314xaae8f345.mm.R.id.bu6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f96253g = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15278x20ac9974) findViewById;
        android.view.View findViewById2 = activity.findViewById(com.p314xaae8f345.mm.R.id.f565251bu5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f96254h = findViewById2;
        ya2.h.f542017a.b(xy2.c.e(activity));
        this.f96251e = activity.getIntent().getIntExtra("KEY_ACTION_TYPE", 0);
    }

    public final r45.e21 a() {
        java.lang.String stringExtra;
        android.content.Intent intent = this.f96252f;
        if (intent == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
            throw null;
        }
        if (!intent.getBooleanExtra("saveActivity", false)) {
            return null;
        }
        r45.e21 e21Var = new r45.e21();
        android.content.Intent intent2 = this.f96252f;
        if (intent2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
            throw null;
        }
        e21Var.set(0, java.lang.Long.valueOf(intent2.getLongExtra("key_topic_id", 0L)));
        android.content.Intent intent3 = this.f96252f;
        if (intent3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
            throw null;
        }
        e21Var.set(14, java.lang.Integer.valueOf(intent3.getIntExtra("key_activity_type", 0) != 101 ? 1 : 0));
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
        if (e21Var.m75939xb282bd08(14) == 0) {
            android.content.Context context = this.f96253g.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            stringExtra = xy2.c.e(context);
        } else {
            android.content.Intent intent4 = this.f96252f;
            if (intent4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
                throw null;
            }
            stringExtra = intent4.getStringExtra("key_user_name");
            if (stringExtra == null) {
                stringExtra = "";
            }
        }
        c19782x23db1cfa.m76240x66bc2758(stringExtra);
        android.content.Intent intent5 = this.f96252f;
        if (intent5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
            throw null;
        }
        java.lang.String stringExtra2 = intent5.getStringExtra("key_nick_name");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        c19782x23db1cfa.m76227x7ac946f0(stringExtra2);
        android.content.Intent intent6 = this.f96252f;
        if (intent6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
            throw null;
        }
        java.lang.String stringExtra3 = intent6.getStringExtra("key_avatar_url");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        c19782x23db1cfa.m76218xe0a5bcad(stringExtra3);
        e21Var.set(1, c19782x23db1cfa);
        android.content.Intent intent7 = this.f96252f;
        if (intent7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
            throw null;
        }
        java.lang.String stringExtra4 = intent7.getStringExtra("key_cover_url");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        e21Var.set(5, stringExtra4);
        android.content.Intent intent8 = this.f96252f;
        if (intent8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
            throw null;
        }
        java.lang.String stringExtra5 = intent8.getStringExtra("key_activity_name");
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        e21Var.set(2, stringExtra5);
        android.content.Intent intent9 = this.f96252f;
        if (intent9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
            throw null;
        }
        java.lang.String stringExtra6 = intent9.getStringExtra("key_activity_desc");
        e21Var.set(3, stringExtra6 != null ? stringExtra6 : "");
        android.content.Intent intent10 = this.f96252f;
        if (intent10 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
            throw null;
        }
        e21Var.set(13, java.lang.Long.valueOf(intent10.getLongExtra("key_activity_end_time", 0L)));
        android.content.Intent intent11 = this.f96252f;
        if (intent11 != null) {
            e21Var.set(17, java.lang.Long.valueOf(intent11.getLongExtra("key_activity_display_mask", 0L)));
            return e21Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
        throw null;
    }

    public final void b() {
        ya2.g gVar = ya2.h.f542017a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f96250d;
        ya2.b2 b17 = gVar.b(xy2.c.e(abstractActivityC21394xb3d2c0cf));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15278x20ac9974 c15278x20ac9974 = this.f96253g;
        c15278x20ac9974.m62027xe9f5ad5e(b17);
        sr2.o1 o1Var = (sr2.o1) pf5.z.f435481a.a(abstractActivityC21394xb3d2c0cf).a(sr2.o1.class);
        int i17 = ((o1Var.T6() || o1Var.R6()) || 1 == this.f96251e) ? 8 : 0;
        c15278x20ac9974.setVisibility(i17);
        android.view.View view = this.f96254h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/upload/postui/postwidget/FinderActivityWidget", "refresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/upload/postui/postwidget/FinderActivityWidget", "refresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void c(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        int intExtra = intent.getIntExtra("key_activity_type", 100);
        android.content.Intent intent2 = this.f96252f;
        if (intent2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
            throw null;
        }
        intent2.putExtra("saveActivity", true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15278x20ac9974 c15278x20ac9974 = this.f96253g;
        c15278x20ac9974.b(intent, intExtra);
        android.content.Intent intent3 = this.f96252f;
        if (intent3 != null) {
            c15278x20ac9974.m62029x29e56d8f(intent3);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
            throw null;
        }
    }

    @Override // ya2.r1
    public void w4(m92.b account) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(account, "account");
        b();
    }
}
