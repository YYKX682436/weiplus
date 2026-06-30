package wu;

/* loaded from: classes9.dex */
public final class h0 extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(hu.f uiParams, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiParams, "uiParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = (com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905) containerView.findViewById(com.p314xaae8f345.mm.R.id.uxi);
        if (abstractC11172x705e5905 == null) {
            return;
        }
        z01.q qVar = new z01.q();
        qVar.f550673e = new wu.f0(item, this);
        qVar.f550674f = new wu.g0(this, item);
        abstractC11172x705e5905.m48330xfcfee142(qVar);
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        android.content.Intent intent;
        android.os.Bundle bundleExtra;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.content.Context context = view.getContext();
        java.text.SimpleDateFormat simpleDateFormat = vu.a.f521579a;
        hu.f fVar = this.f531143e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
        long n17 = fVar.n();
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(n17, fVar.q());
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 m17 = pt0.f0.f439742b1.m(c16564xb55e1d5);
        le5.e eVar = (le5.e) i95.n0.c(le5.e.class);
        java.lang.String str = m17.G;
        s15.h hVar = item.f366530e;
        if (((fo.e) eVar).bj(context, str, hVar.m75945x2fec8307(hVar.f384955d + 10))) {
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setClassName(context, "com.tencent.mm.ui.media.MediaGalleryContainerUI");
        pf5.j0.a(intent2, gi5.h.class);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int width = view.getWidth();
        int height = view.getHeight();
        intent2.putExtra("img_gallery_left", iArr[0]);
        intent2.putExtra("img_gallery_top", iArr[1]);
        intent2.putExtra("img_gallery_width", width);
        intent2.putExtra("img_gallery_height", height);
        intent2.putExtra("message_id", n17);
        intent2.putExtra("message_talker", c16564xb55e1d5.a());
        intent2.putExtra("record_data_id", hVar.m75945x2fec8307(hVar.f384955d + 3));
        intent2.putExtra("params", fVar.mo126745xcc31ba03().toString());
        intent2.putExtra("from_scene", 0);
        intent2.putExtra("chatTypeForAppbrand", k01.d.a(c16564xb55e1d5.a()));
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && (intent = activity.getIntent()) != null && (bundleExtra = intent.getBundleExtra("_stat_obj")) != null) {
            intent2.putExtra("_stat_obj", bundleExtra);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/appmsg/ui/item/RecordDetailImgItemConvert", "goToImage", "(Landroid/view/View;Lcom/tencent/mm/feature/appmsg/record/detail/RecordDetailUIParams;Lcom/tencent/mm/feature/appmsg/record/detail/RecordDetailItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailImgItemConvert", "goToImage", "(Landroid/view/View;Lcom/tencent/mm/feature/appmsg/record/detail/RecordDetailUIParams;Lcom/tencent/mm/feature/appmsg/record/detail/RecordDetailItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        r31.n Ai = ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 t17 = ((bf5.a) Ai).t(context);
        t17.setId(com.p314xaae8f345.mm.R.id.uxi);
        containerView.addView(t17, -2, -2);
    }
}
