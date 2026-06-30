package mi5;

/* loaded from: classes9.dex */
public final class t0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc5.i f408453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f408454e;

    public t0(fc5.i iVar, android.content.Context context) {
        this.f408453d = iVar;
        this.f408454e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ChattingViewFinderFeed$onUpdateViewModel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l15.c j17 = this.f408453d.j();
        zy2.i iVar = (zy2.i) ot0.q.v(j17 != null ? j17.m126747x696739c() : null).y(zy2.i.class);
        android.content.Intent intent = new android.content.Intent();
        if ((iVar.f558944b.m75939xb282bd08(25) & 4) > 0) {
            intent.putExtra("member_username", iVar.f558944b.m75945x2fec8307(1));
        }
        intent.putExtra("feed_object_id", pm0.v.Z(iVar.f558944b.m75945x2fec8307(0)));
        intent.putExtra("feed_object_nonceId", iVar.f558944b.m75945x2fec8307(8));
        intent.putExtra("business_type", 0);
        intent.putExtra("key_from_user_name", iVar.f558944b.m75945x2fec8307(1));
        intent.putExtra("finder_user_name", iVar.f558944b.m75945x2fec8307(1));
        intent.putExtra("tab_type", 6);
        intent.putExtra("key_source_comment_scene", iVar.f558944b.m75939xb282bd08(29));
        intent.putExtra("feed_local_id", iVar.f558944b.m75942xfb822ef2(9));
        intent.putExtra("key_need_related_list", false);
        if (iVar.f558944b.m75934xbce7f2f(26) != null) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = iVar.f558944b.m75934xbce7f2f(26);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75934xbce7f2f);
            intent.putExtra("key_share_byp_data", m75934xbce7f2f.f273689a);
        }
        boolean Ak = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ak();
        android.content.Context context = this.f408454e;
        ya2.e1 e1Var = ya2.e1.f542005a;
        if (Ak) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
            e1Var.t(context, intent);
        } else {
            xa2.e eVar = (xa2.e) i95.n0.c(xa2.e.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            ((wa2.u) eVar).hj(intent, view, 280L);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
            e1Var.A(context, intent, false);
        }
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ChattingViewFinderFeed$onUpdateViewModel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
