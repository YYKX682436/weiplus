package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805;

/* loaded from: classes9.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.m f237039d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.m mVar) {
        this.f237039d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.os.Bundle bundleExtra;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        et3.b bVar = (et3.b) view.getTag();
        if (((fo.e) ((le5.e) i95.n0.c(le5.e.class))).bj(view.getContext(), pt0.f0.Li(bVar.f338133k, bVar.f338125c).G, bVar.f338123a.M)) {
            yj0.a.h(this, "com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int i17 = bVar.f338127e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.m mVar = this.f237039d;
        if (i17 == 0) {
            android.content.Intent intent = new android.content.Intent(view.getContext(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf.class);
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20527x9fe0c926()) == 1) {
                intent = new android.content.Intent(view.getContext(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2717x62f6fe4.ActivityC22445xcae55707.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.m.c(mVar, intent, view);
                pf5.j0.a(intent, gi5.h.class);
            }
            intent.putExtra("message_id", bVar.f338125c);
            intent.putExtra("message_talker", bVar.f338133k);
            intent.putExtra("record_data_id", bVar.f338123a.T);
            intent.putExtra("record_xml", bVar.f338126d);
            intent.putExtra("from_scene", mVar.f237077h);
            intent.putExtra("chatTypeForAppbrand", mVar.f237076g);
            if ((view.getContext() instanceof android.app.Activity) && ((android.app.Activity) view.getContext()).getIntent() != null && (bundleExtra = ((android.app.Activity) view.getContext()).getIntent().getBundleExtra("_stat_obj")) != null) {
                intent.putExtra("_stat_obj", bundleExtra);
            }
            android.content.Context context = view.getContext();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (i17 == 1) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_detail_info_id", bVar.f338124b.f67645x88be67a1);
            intent2.putExtra("key_detail_data_id", bVar.f338123a.T);
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20027xc7c42c3d()) == 1) {
                android.content.Intent intent3 = new android.content.Intent(view.getContext(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2717x62f6fe4.ActivityC22445xcae55707.class);
                intent3.putExtras(intent2.getExtras());
                com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.m.c(mVar, intent3, view);
                pf5.j0.a(intent3, bi5.a.class);
                o72.x1.M0(view.getContext(), "com.tencent.mm.ui.media.MediaGalleryContainerUI", intent3, 1, null);
            } else {
                o72.x1.M0(view.getContext(), ".ui.FavImgGalleryUI", intent2, 1, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
