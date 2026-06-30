package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomFooterView */
/* loaded from: classes8.dex */
public class C15848xb1a1c7b3 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f220417d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f220418e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f220419f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f220420g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f220421h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f220422i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f220423m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f220424n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f220425o;

    /* renamed from: p, reason: collision with root package name */
    public long f220426p;

    /* renamed from: q, reason: collision with root package name */
    public long f220427q;

    public C15848xb1a1c7b3(android.content.Context context) {
        super(context);
        b();
    }

    public void a() {
        android.view.View view = this.f220424n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "hideEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "hideEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void b() {
        android.content.Context context = getContext();
        this.f220417d = context;
        this.f220426p = ((android.app.Activity) context).getIntent().getLongExtra("game_report_sourceid", 0L);
        this.f220427q = ((android.app.Activity) this.f220417d).getIntent().getLongExtra("game_report_ssid", 0L);
        android.view.LayoutInflater.from(this.f220417d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569920rx, (android.view.ViewGroup) this, true);
        this.f220418e = findViewById(com.p314xaae8f345.mm.R.id.e59);
        this.f220419f = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.e58);
        this.f220420g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.e5_);
        this.f220421h = findViewById(com.p314xaae8f345.mm.R.id.bha);
        this.f220422i = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.bh_);
        this.f220423m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.bhb);
        this.f220424n = findViewById(com.p314xaae8f345.mm.R.id.gbr);
        this.f220425o = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.dfj);
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            this.f220425o.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bhz);
        } else {
            this.f220425o.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562938bi0);
        }
    }

    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15723x5bc67ad2 c15723x5bc67ad2, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15723x5bc67ad2 c15723x5bc67ad22) {
        java.lang.Integer num;
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.f fVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a;
        if (c15723x5bc67ad2 != null) {
            android.view.View view = this.f220418e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "setFooterInfo", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomJumpDetail;Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomJumpDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "setFooterInfo", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomJumpDetail;Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomJumpDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (c15723x5bc67ad2.f36513x8e88707b != null) {
                this.f220419f.setVisibility(0);
                r53.y.a().e(this.f220419f, com.p314xaae8f345.mm.ui.bk.C() ? c15723x5bc67ad2.f36513x8e88707b.f36859x91963fa2 : c15723x5bc67ad2.f36513x8e88707b.f36860xf38c7e02, null, null);
            } else {
                this.f220419f.setVisibility(8);
            }
            this.f220420g.setText(c15723x5bc67ad2.f36511x2efe91);
            this.f220418e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.x(this, c15723x5bc67ad2));
            num = 0;
            fVar.k(1003L, 1L, 1L, 0L, this.f220427q, this.f220426p, "", "", "");
        } else {
            num = 0;
        }
        if (c15723x5bc67ad22 != null) {
            android.view.View view2 = this.f220421h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(num);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "setFooterInfo", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomJumpDetail;Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomJumpDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "setFooterInfo", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomJumpDetail;Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomJumpDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (c15723x5bc67ad22.f36513x8e88707b != null) {
                this.f220422i.setVisibility(0);
                r53.y.a().e(this.f220422i, com.p314xaae8f345.mm.ui.bk.C() ? c15723x5bc67ad22.f36513x8e88707b.f36859x91963fa2 : c15723x5bc67ad22.f36513x8e88707b.f36860xf38c7e02, null, null);
            } else {
                this.f220422i.setVisibility(8);
            }
            this.f220423m.setText(c15723x5bc67ad22.f36511x2efe91);
            this.f220421h.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.y(this, c15723x5bc67ad22));
            fVar.k(1003L, 3L, 1L, 0L, this.f220427q, this.f220426p, "", "", "");
        }
    }

    /* renamed from: setLbsInfo */
    public void m64410xb011dd49(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.Lbs lbs) {
    }

    public C15848xb1a1c7b3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public C15848xb1a1c7b3(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        b();
    }
}
