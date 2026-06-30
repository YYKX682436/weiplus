package sr2;

/* loaded from: classes10.dex */
public final class g4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 f493104d;

    public g4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6) {
        this.f493104d = c14609xb4d6eef6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/PostMainUIC$initDelMediaBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6 = this.f493104d;
        sr2.w0 F7 = c14609xb4d6eef6.F7();
        F7.m158359x1e885992().putExtra("saveDesc", F7.V6().getText().toString());
        android.content.Intent m158359x1e885992 = F7.m158359x1e885992();
        rx2.d b17 = F7.d7().b();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = b17.f482498a.entrySet().iterator();
        while (true) {
            byte[] bArr = null;
            if (!it.hasNext()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            r45.gb4 gb4Var = (r45.gb4) entry.getValue();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.C13678x881de345 c13678x881de345 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.C13678x881de345();
            c13678x881de345.f183518d = gb4Var.m75945x2fec8307(0);
            c13678x881de345.f183519e = gb4Var.m75945x2fec8307(1);
            c13678x881de345.f183520f = gb4Var.m75945x2fec8307(2);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc) gb4Var.m75936x14adae67(3);
            if (c19780xceb4c4dc != null) {
                bArr = c19780xceb4c4dc.mo14344x5f01b1f6();
            }
            c13678x881de345.f183521g = bArr;
            c13678x881de345.f183522h = gb4Var.m75942xfb822ef2(4);
            c13678x881de345.f183523i = gb4Var.m75939xb282bd08(5);
            c13678x881de345.f183524m = gb4Var.m75939xb282bd08(7);
            arrayList2.add(c13678x881de345);
        }
        m158359x1e885992.putExtra("saveDescAt", arrayList2);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(c14609xb4d6eef6.m158359x1e885992());
        intent.putExtra("album_from_finder_add_media", true);
        zv2.r0 r0Var = c14609xb4d6eef6.C7().f493214f;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = r0Var != null ? ((zv2.b) r0Var).f557930f : null;
        intent.putExtra("KEY_POST_SET_MEMBER_LINK", c19786x6a1e2862 != null && c19786x6a1e2862.m76480xe2ee1ca3() == 52);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).nl(intent, c14609xb4d6eef6.m158359x1e885992());
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = c14609xb4d6eef6.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        intent.putExtra("key_post_has_show_safe_dialog", ((dv2.e1) pf5.z.f435481a.a(activity).a(dv2.e1.class)).f325450d > 0);
        if (c14609xb4d6eef6.k7().p()) {
            intent.putExtra("KEY_POST_WARM_GOODS_SELECT_MEDIA", true);
        }
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = c14609xb4d6eef6.m158354x19263085();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c17).fk(context, intent, 3, 9, bool, -1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        p2Var.B(1);
        p2Var.G("andr_Post_Page_New_Select", null);
        ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ui("FinderPostingPageThumbnail", c14609xb4d6eef6.m158359x1e885992().getIntExtra("key_ref_enter_scene", 0), 0, ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).hj(), false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/PostMainUIC$initDelMediaBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
