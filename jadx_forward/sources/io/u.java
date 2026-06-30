package io;

/* loaded from: classes9.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xd5.a f374964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f374965e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l15.c f374966f;

    public u(xd5.a aVar, android.content.Context context, l15.c cVar) {
        this.f374964d = aVar;
        this.f374965e = context;
        this.f374966f = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        v05.b k17;
        v05.b k18;
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatting/viewfactory/ChattingRecordView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xd5.a aVar = this.f374964d;
        long j17 = aVar.j();
        android.content.Context context = this.f374965e;
        if (j17 > 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_detail_info_id", aVar.j());
            intent.putExtra("record_show_share", false);
            intent.putExtra("prePublishId", "msgrecord_detail");
            j45.l.j(context, "record", ".ui.FavRecordDetailUI", intent, null);
        } else {
            str = "";
            if (aVar.m75942xfb822ef2(aVar.f125235d + 0) > 0) {
                if (((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).nj(aVar.m75945x2fec8307(aVar.f125235d + 1))) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 m17 = pt0.f0.f439742b1.m(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(aVar.m75942xfb822ef2(aVar.f125235d + 0), aVar.m75945x2fec8307(aVar.f125235d + 1)));
                    hu.f fVar = new hu.f();
                    fVar.w(aVar.m75942xfb822ef2(aVar.f125235d + 0));
                    fVar.y(java.lang.Long.valueOf(m17.I0()));
                    java.lang.String Q0 = m17.Q0();
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (Q0 == null) {
                        Q0 = "";
                    }
                    fVar.z(Q0);
                    java.lang.String V1 = m17.V1();
                    if (V1 == null) {
                        V1 = m17.y0();
                    }
                    fVar.x(V1 != null ? V1 : "");
                    fVar.u(3);
                    fVar.B(false);
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.setClassName(context, "com.tencent.mm.feature.appmsg.ui.RecordDetailUI");
                    intent2.putExtra("params", fVar.mo126745xcc31ba03().toString());
                    android.content.Context context2 = this.f374965e;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent2);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/chatting/viewfactory/ChattingRecordView$onUpdateViewModel$1$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context2.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(context2, "com/tencent/mm/chatting/viewfactory/ChattingRecordView$onUpdateViewModel$1$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.putExtra("message_id", aVar.m75942xfb822ef2(aVar.f125235d + 0));
                    intent3.putExtra("message_talker", aVar.m75945x2fec8307(aVar.f125235d + 1));
                    v05.b k19 = this.f374966f.k();
                    if (k19 != null && (m75945x2fec83072 = k19.m75945x2fec8307(k19.f513848e + 44)) != null) {
                        str = m75945x2fec83072;
                    }
                    intent3.putExtra("record_xml", str);
                    intent3.putExtra("record_show_share", false);
                    j45.l.j(context, "record", ".ui.RecordMsgDetailUI", intent3, null);
                }
            } else if (((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).nj(aVar.m75945x2fec8307(aVar.f125235d + 1))) {
                hu.f fVar2 = new hu.f();
                fVar2.u(3);
                l15.c k27 = aVar.k();
                if (k27 != null && (k18 = k27.k()) != null && (m75945x2fec8307 = k18.m75945x2fec8307(k18.f513848e + 44)) != null) {
                    str = m75945x2fec8307;
                }
                fVar2.A(str);
                fVar2.B(false);
                android.content.Intent intent4 = new android.content.Intent();
                intent4.setClassName(context, "com.tencent.mm.feature.appmsg.ui.RecordDetailUI");
                intent4.putExtra("params", fVar2.mo126745xcc31ba03().toString());
                android.content.Context context3 = this.f374965e;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(intent4);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(context3, arrayList3.toArray(), "com/tencent/mm/chatting/viewfactory/ChattingRecordView$onUpdateViewModel$1$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context3.startActivity((android.content.Intent) arrayList3.get(0));
                yj0.a.f(context3, "com/tencent/mm/chatting/viewfactory/ChattingRecordView$onUpdateViewModel$1$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                android.content.Intent intent5 = new android.content.Intent();
                l15.c k28 = aVar.k();
                intent5.putExtra("record_xml", (k28 == null || (k17 = k28.k()) == null) ? null : k17.m75945x2fec8307(k17.f513848e + 44));
                intent5.putExtra("record_show_share", false);
                intent5.putExtra("from_scene", 3);
                j45.l.j(context, "record", ".ui.RecordMsgDetailUI", intent5, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/chatting/viewfactory/ChattingRecordView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
