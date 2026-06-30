package com.tencent.mm.plugin.finder.activity.base.uic;

/* loaded from: classes2.dex */
public abstract class FinderBaseContentUIC extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public int f101741d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f101742e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f101743f;

    /* renamed from: g, reason: collision with root package name */
    public long f101744g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f101745h;

    /* renamed from: i, reason: collision with root package name */
    public r45.e21 f101746i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f101747m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC$finderTopicInfoListener$1 f101748n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC$feedStickyListener$1 f101749o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC$finderTopicInfoListener$1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC$feedStickyListener$1] */
    public FinderBaseContentUIC(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f101742e = "";
        this.f101747m = jz5.h.b(new x92.p(this));
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f101748n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderTopicEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC$finderTopicInfoListener$1
            {
                this.__eventId = 1705444769;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderTopicEvent finderTopicEvent) {
                com.tencent.mm.autogen.events.FinderTopicEvent event = finderTopicEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.od odVar = event.f54335g;
                int i17 = odVar != null ? odVar.f7524b : -1;
                com.tencent.mars.xlog.Log.i(pf5.o.TAG, "FinderTopicEvent : " + i17);
                com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC finderBaseContentUIC = com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC.this;
                if (i17 != 0 && i17 != -4056 && i17 != -4058 && i17 != -4063) {
                    finderBaseContentUIC.Y6();
                    return true;
                }
                if (i17 != 0) {
                    return true;
                }
                finderBaseContentUIC.f101746i = null;
                finderBaseContentUIC.Z6(null);
                return true;
            }
        };
        this.f101749o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedStickyEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC$feedStickyListener$1
            {
                this.__eventId = -1128941181;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedStickyEvent feedStickyEvent) {
                com.tencent.mm.autogen.events.FeedStickyEvent event = feedStickyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (event.f54251g.f6828a != 1001) {
                    return false;
                }
                com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC.this.X6(event);
                return false;
            }
        };
    }

    public int O6(int i17) {
        if (i17 >= 3) {
            return 12;
        }
        return T6();
    }

    public int P6() {
        return 59;
    }

    public int Q6() {
        return 1;
    }

    public abstract com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC R6();

    public java.lang.String S6() {
        java.lang.String stringExtra = getIntent().getStringExtra("key_activity_name");
        return stringExtra == null ? "" : stringExtra;
    }

    public int T6() {
        return 7;
    }

    public final vb2.c U6() {
        return (vb2.c) ((jz5.n) this.f101747m).getValue();
    }

    public boolean V6() {
        return this.f101741d == 2;
    }

    public boolean W6() {
        return this instanceof ea2.j0;
    }

    public abstract void X6(com.tencent.mm.autogen.events.FeedStickyEvent feedStickyEvent);

    public abstract void Y6();

    public abstract void Z6(r45.e21 e21Var);

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ado;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        int i17 = 1;
        if (getFragment() instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) {
            androidx.fragment.app.Fragment fragment = getFragment();
            kotlin.jvm.internal.o.e(fragment, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment");
            int i18 = ((com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) fragment).f129265p;
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "convertInnerTabType : " + i18);
            i17 = 1 + i18;
        }
        this.f101741d = i17;
        this.f101744g = getIntent().getLongExtra("key_activity_id", 0L);
        if (this.f101741d >= 3 && (getFragment() instanceof com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment)) {
            androidx.fragment.app.Fragment fragment2 = getFragment();
            kotlin.jvm.internal.o.e(fragment2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment");
            this.f101744g = ((com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment) fragment2).f101753u;
        }
        this.f101745h = getIntent().getStringExtra("key_encrypted_topic_id");
        this.f101742e = S6();
        this.f101743f = getIntent().getStringExtra("key_by_pass_info");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        r45.r03 r03Var = (r45.r03) ((com.tencent.mm.plugin.finder.activity.uic.o) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.activity.uic.o.class)).f452719d;
        this.f101746i = r03Var != null ? (r45.e21) r03Var.getCustom(16) : null;
        alive();
        alive();
        setCoveredStyle();
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "topic:" + this.f101742e + " topicType:" + T6() + " innerTabType:" + this.f101741d + " eventTopicId:" + this.f101744g + " encryptedEventTopicId:" + this.f101745h);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onPreDestroyed() {
        androidx.fragment.app.Fragment fragment = getFragment();
        if (fragment != null) {
            ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).getClass();
            ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).onDestroy();
        }
        super.onPreDestroyed();
        dead();
        dead();
    }

    public void setCoveredStyle() {
    }
}
