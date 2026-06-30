package wj5;

/* loaded from: classes5.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f528332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f528333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f528334f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f528335g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xj5.c f528336h;

    public g(java.lang.String str, boolean z17, boolean z18, in5.s0 s0Var, xj5.c cVar) {
        this.f528332d = str;
        this.f528333e = z17;
        this.f528334f = z18;
        this.f528335g = s0Var;
        this.f528336h = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        long j17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tipsbar/convert/ChatRoomNotifyTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = this.f528332d;
        intent.putExtra("RoomInfo_Id", str);
        intent.putExtra("room_notice", c01.v1.d(str));
        intent.putExtra("room_notice_xml", c01.v1.g(str));
        intent.putExtra("room_notice_publish_time", c01.v1.f(str));
        intent.putExtra("room_notice_editor", c01.v1.e(str));
        intent.putExtra("from_scene", 2);
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(z07, "get(...)");
        boolean z17 = this.f528333e;
        intent.putExtra("Is_RoomOwner", z17);
        boolean z18 = this.f528334f;
        intent.putExtra("Is_RoomManager", z18);
        intent.putExtra("room_member_count", z07.f69098xbcb1bed0);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.x) ((d81.e) i95.n0.c(d81.e.class))).Di(this.f528335g.f374654e, intent);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7002x3df26ffe c7002x3df26ffe = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7002x3df26ffe();
        c7002x3df26ffe.f143167d = c7002x3df26ffe.b("ChatName", str, true);
        c7002x3df26ffe.f143169f = z07.f69098xbcb1bed0;
        if (z17) {
            j17 = 1;
        } else {
            j17 = z18 ? 2 : 0;
        }
        c7002x3df26ffe.f143168e = j17;
        c7002x3df26ffe.f143171h = c7002x3df26ffe.b("NoticeId", "" + z07.f69092x65ba57ac, true);
        c7002x3df26ffe.f143170g = 23L;
        c7002x3df26ffe.k();
        this.f528336h.f536430e = 1;
        yj0.a.h(this, "com/tencent/mm/ui/tipsbar/convert/ChatRoomNotifyTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
