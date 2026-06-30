package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes15.dex */
public class t extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 implements android.view.View.OnClickListener, android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f220817d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f220818e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f220819f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f220820g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewGroup f220821h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f220822i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f220823m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f220824n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.ImageView f220825o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88 f220826p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c f220827q;

    /* renamed from: r, reason: collision with root package name */
    public int f220828r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.u f220829s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.u uVar, android.view.View view) {
        super(view);
        this.f220829s = uVar;
        this.f220817d = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f567392jc3);
        this.f220818e = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f567393jc4);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f564473se);
        this.f220819f = textView;
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h6y);
        this.f220820g = imageView;
        textView.setOnClickListener(this);
        imageView.setOnClickListener(this);
        imageView.setOnLongClickListener(this);
        this.f220821h = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.f569056ov5);
        this.f220822i = view.findViewById(com.p314xaae8f345.mm.R.id.ov7);
        this.f220823m = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ov6);
        this.f220824n = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f569055ov4);
        this.f220825o = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.i0u);
    }

    public final void i(int i17) {
        long j17;
        if (i17 == 1) {
            j17 = 6;
        } else if (i17 == 2) {
            j17 = 7;
        } else if (i17 != 3) {
            return;
        } else {
            j17 = 28;
        }
        long j18 = j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88 c15744x2fe9df88 = this.f220826p;
        if (c15744x2fe9df88 != null) {
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.f fVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a;
            long j19 = this.f220828r + 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15847x71fbf6b5 c15847x71fbf6b5 = this.f220829s.f220835e;
            fVar.l(j19, j18, c15847x71fbf6b5.f220407h2, c15847x71fbf6b5.f220406g2, c15744x2fe9df88.f36637xf02988d6);
        }
    }

    public final void j(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f43) {
        android.graphics.drawable.GradientDrawable gradientDrawable;
        if (c15748x3e43f43 != null) {
            java.lang.String str = c15748x3e43f43.f36646xa0e2915a;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            java.lang.Integer l17 = s33.y.l(str);
            if (l17 == null || (gradientDrawable = (android.graphics.drawable.GradientDrawable) this.f220822i.getBackground()) == null) {
                return;
            }
            gradientDrawable.setColor(l17.intValue());
        }
    }

    @Override // android.view.View.OnClickListener
    public synchronized void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88 c15744x2fe9df88 = this.f220826p;
        if (c15744x2fe9df88 != null && com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18.equals(c15744x2fe9df88.f36637xf02988d6) && !s33.y.e(this.f220826p.f36622x3923b317).f484023a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15847x71fbf6b5 c15847x71fbf6b5 = this.f220829s.f220835e;
            i(s33.y.h(c15847x71fbf6b5.f220405f2, c15847x71fbf6b5.f220414o2));
            yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88 c15744x2fe9df882 = this.f220826p;
        if (c15744x2fe9df882 != null && !s33.y.e(c15744x2fe9df882.f36622x3923b317).f484023a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c2 = this.f220827q;
            if (c15780xf49d6a1c2 != null && c15780xf49d6a1c2.f36742x28d6c0ab == 1 && (c15780xf49d6a1c = this.f220829s.f220835e.f220412m2) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c15780xf49d6a1c.f36743xf0cd21de)) {
                java.lang.String str = this.f220829s.f220835e.f220412m2.f36744xf6825b11;
                if (str == null) {
                    str = "";
                }
                if (str.equals(this.f220827q.f36744xf6825b11)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1.a(this.f220829s.f220835e.f220412m2.f36743xf0cd21de, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.s(this));
                }
            }
            i(s33.y.h(this.f220829s.f220835e.f220405f2, this.f220827q));
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c3 = this.f220827q;
            if (c15780xf49d6a1c3 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.ChatMemberListView", "slot jump url: %s", c15780xf49d6a1c3.f36743xf0cd21de);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$ViewHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88 c15744x2fe9df88 = this.f220826p;
        if (c15744x2fe9df88 != null && !com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18.equals(c15744x2fe9df88.f36637xf02988d6) && !s33.y.e(this.f220826p.f36622x3923b317).f484023a && !s33.y.e(this.f220826p.f36622x3923b317).f484024b) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5237xbeff673c c5237xbeff673c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5237xbeff673c();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88 c15744x2fe9df882 = this.f220826p;
            java.lang.String str = c15744x2fe9df882.f36637xf02988d6;
            am.b2 b2Var = c5237xbeff673c.f135570g;
            b2Var.f87741a = str;
            b2Var.f87742b = c15744x2fe9df882.f36632x436a86e;
            c5237xbeff673c.e();
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.f fVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a;
            long j17 = this.f220828r + 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15847x71fbf6b5 c15847x71fbf6b5 = this.f220829s.f220835e;
            fVar.l(j17, 27L, c15847x71fbf6b5.f220407h2, c15847x71fbf6b5.f220406g2, this.f220826p.f36637xf02988d6);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$ViewHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
