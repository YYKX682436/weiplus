package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes8.dex */
public class i1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.t0 {

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f220683e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f220684f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f220685g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c f220686h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f220687i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f220688m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f220689n;

    /* renamed from: o, reason: collision with root package name */
    public long f220690o;

    /* renamed from: p, reason: collision with root package name */
    public long f220691p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f220692q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f220693r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f220694s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f220695t;

    public i1(android.view.View view) {
        super(view);
        this.f220695t = false;
        this.f220683e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.m6w);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.cmc);
        this.f220684f = findViewById;
        this.f220685g = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.cmb);
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.f1(this));
        android.content.Context context = this.f220830d;
        this.f220693r = com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79425x6317ef04, i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77761x52dc92fe));
        this.f220687i = view.findViewById(com.p314xaae8f345.mm.R.id.kth);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) view.findViewById(com.p314xaae8f345.mm.R.id.ktq);
        this.f220688m = c22624x85d69039;
        c22624x85d69039.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y(c22624x85d69039, new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(c22624x85d69039.getContext())));
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.ktb);
        this.f220689n = findViewById2;
        float q17 = i65.a.q(this.f220830d);
        findViewById2.getLayoutParams().height = (int) (findViewById2.getLayoutParams().height * q17);
        findViewById2.getLayoutParams().width = (int) (findViewById2.getLayoutParams().width * q17);
        findViewById2.requestLayout();
        findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.g1(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.t0
    public void i(w33.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.Lbs lbs, int i17, long j17, long j18, java.util.List list) {
        this.f220690o = j17;
        this.f220691p = j18;
        this.f220692q = list;
        this.f220686h = aVar.f524236e;
        android.widget.TextView textView = this.f220683e;
        int i18 = aVar.f524232a;
        if (i18 == 1) {
            textView.setText(aVar.f524235d);
        } else if (i18 == 3) {
            textView.setText(aVar.f524235d);
        }
        if (this.f220686h != null) {
            this.f220685g.setImageDrawable(this.f220693r);
            android.view.View view = this.f220684f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH", "onBindData", "(Lcom/tencent/mm/plugin/game/chatroom/data/ChatRoomInfo;Lcom/tencent/mm/plugin/game/autogen/chatroom/Lbs;IJJLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH", "onBindData", "(Lcom/tencent/mm/plugin/game/chatroom/data/ChatRoomInfo;Lcom/tencent/mm/plugin/game/autogen/chatroom/Lbs;IJJLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = this.f220684f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH", "onBindData", "(Lcom/tencent/mm/plugin/game/chatroom/data/ChatRoomInfo;Lcom/tencent/mm/plugin/game/autogen/chatroom/Lbs;IJJLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH", "onBindData", "(Lcom/tencent/mm/plugin/game/chatroom/data/ChatRoomInfo;Lcom/tencent/mm/plugin/game/autogen/chatroom/Lbs;IJJLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f220694s = i18 == 3;
    }
}
