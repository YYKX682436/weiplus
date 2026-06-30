package aw2;

/* loaded from: classes10.dex */
public final class a implements ya2.r1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f14717d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14718e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.Intent f14719f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.FinderExtendActivityView f14720g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f14721h;

    public a(com.tencent.mm.ui.MMActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f14717d = activity;
        android.view.View findViewById = activity.findViewById(com.tencent.mm.R.id.bu6);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f14720g = (com.tencent.mm.plugin.finder.view.FinderExtendActivityView) findViewById;
        android.view.View findViewById2 = activity.findViewById(com.tencent.mm.R.id.f483718bu5);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f14721h = findViewById2;
        ya2.h.f460484a.b(xy2.c.e(activity));
        this.f14718e = activity.getIntent().getIntExtra("KEY_ACTION_TYPE", 0);
    }

    public final r45.e21 a() {
        java.lang.String stringExtra;
        android.content.Intent intent = this.f14719f;
        if (intent == null) {
            kotlin.jvm.internal.o.o("intent");
            throw null;
        }
        if (!intent.getBooleanExtra("saveActivity", false)) {
            return null;
        }
        r45.e21 e21Var = new r45.e21();
        android.content.Intent intent2 = this.f14719f;
        if (intent2 == null) {
            kotlin.jvm.internal.o.o("intent");
            throw null;
        }
        e21Var.set(0, java.lang.Long.valueOf(intent2.getLongExtra("key_topic_id", 0L)));
        android.content.Intent intent3 = this.f14719f;
        if (intent3 == null) {
            kotlin.jvm.internal.o.o("intent");
            throw null;
        }
        e21Var.set(14, java.lang.Integer.valueOf(intent3.getIntExtra("key_activity_type", 0) != 101 ? 1 : 0));
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
        if (e21Var.getInteger(14) == 0) {
            android.content.Context context = this.f14720g.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            stringExtra = xy2.c.e(context);
        } else {
            android.content.Intent intent4 = this.f14719f;
            if (intent4 == null) {
                kotlin.jvm.internal.o.o("intent");
                throw null;
            }
            stringExtra = intent4.getStringExtra("key_user_name");
            if (stringExtra == null) {
                stringExtra = "";
            }
        }
        finderContact.setUsername(stringExtra);
        android.content.Intent intent5 = this.f14719f;
        if (intent5 == null) {
            kotlin.jvm.internal.o.o("intent");
            throw null;
        }
        java.lang.String stringExtra2 = intent5.getStringExtra("key_nick_name");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        finderContact.setNickname(stringExtra2);
        android.content.Intent intent6 = this.f14719f;
        if (intent6 == null) {
            kotlin.jvm.internal.o.o("intent");
            throw null;
        }
        java.lang.String stringExtra3 = intent6.getStringExtra("key_avatar_url");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        finderContact.setHeadUrl(stringExtra3);
        e21Var.set(1, finderContact);
        android.content.Intent intent7 = this.f14719f;
        if (intent7 == null) {
            kotlin.jvm.internal.o.o("intent");
            throw null;
        }
        java.lang.String stringExtra4 = intent7.getStringExtra("key_cover_url");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        e21Var.set(5, stringExtra4);
        android.content.Intent intent8 = this.f14719f;
        if (intent8 == null) {
            kotlin.jvm.internal.o.o("intent");
            throw null;
        }
        java.lang.String stringExtra5 = intent8.getStringExtra("key_activity_name");
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        e21Var.set(2, stringExtra5);
        android.content.Intent intent9 = this.f14719f;
        if (intent9 == null) {
            kotlin.jvm.internal.o.o("intent");
            throw null;
        }
        java.lang.String stringExtra6 = intent9.getStringExtra("key_activity_desc");
        e21Var.set(3, stringExtra6 != null ? stringExtra6 : "");
        android.content.Intent intent10 = this.f14719f;
        if (intent10 == null) {
            kotlin.jvm.internal.o.o("intent");
            throw null;
        }
        e21Var.set(13, java.lang.Long.valueOf(intent10.getLongExtra("key_activity_end_time", 0L)));
        android.content.Intent intent11 = this.f14719f;
        if (intent11 != null) {
            e21Var.set(17, java.lang.Long.valueOf(intent11.getLongExtra("key_activity_display_mask", 0L)));
            return e21Var;
        }
        kotlin.jvm.internal.o.o("intent");
        throw null;
    }

    public final void b() {
        ya2.g gVar = ya2.h.f460484a;
        com.tencent.mm.ui.MMActivity mMActivity = this.f14717d;
        ya2.b2 b17 = gVar.b(xy2.c.e(mMActivity));
        com.tencent.mm.plugin.finder.view.FinderExtendActivityView finderExtendActivityView = this.f14720g;
        finderExtendActivityView.setContact(b17);
        sr2.o1 o1Var = (sr2.o1) pf5.z.f353948a.a(mMActivity).a(sr2.o1.class);
        int i17 = ((o1Var.T6() || o1Var.R6()) || 1 == this.f14718e) ? 8 : 0;
        finderExtendActivityView.setVisibility(i17);
        android.view.View view = this.f14721h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/upload/postui/postwidget/FinderActivityWidget", "refresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/upload/postui/postwidget/FinderActivityWidget", "refresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void c(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        int intExtra = intent.getIntExtra("key_activity_type", 100);
        android.content.Intent intent2 = this.f14719f;
        if (intent2 == null) {
            kotlin.jvm.internal.o.o("intent");
            throw null;
        }
        intent2.putExtra("saveActivity", true);
        com.tencent.mm.plugin.finder.view.FinderExtendActivityView finderExtendActivityView = this.f14720g;
        finderExtendActivityView.b(intent, intExtra);
        android.content.Intent intent3 = this.f14719f;
        if (intent3 != null) {
            finderExtendActivityView.setIntentParam(intent3);
        } else {
            kotlin.jvm.internal.o.o("intent");
            throw null;
        }
    }

    @Override // ya2.r1
    public void w4(m92.b account) {
        kotlin.jvm.internal.o.g(account, "account");
        b();
    }
}
