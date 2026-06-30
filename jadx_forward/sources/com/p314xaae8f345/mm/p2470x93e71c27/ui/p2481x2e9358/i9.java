package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class i9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.n9 f271933d;

    public i9(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.n9 n9Var) {
        this.f271933d = n9Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h8 h8Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/RecentImageBubble$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.n9 n9Var = this.f271933d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.m9 m9Var = n9Var.f272057m;
        if (m9Var != null && (h8Var = n9Var.f272047c) != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k1 k1Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k1) m9Var;
            k1Var.getClass();
            java.lang.String str = h8Var.f271885b;
            android.content.Intent intent = new android.content.Intent();
            java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>(1);
            arrayList2.add(str);
            java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList<>(1);
            arrayList3.add(java.lang.String.valueOf(h8Var.f271884a));
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = k1Var.f271974b;
            java.lang.String str2 = c19666xfd6e2f33.f271544k3;
            if (str2 != null) {
                intent.putExtra("GalleryUI_FromUser", str2);
            }
            java.lang.String str3 = c19666xfd6e2f33.f271550l3;
            if (str3 != null) {
                intent.putExtra("GalleryUI_ToUser", str3);
            }
            intent.putExtra("query_source_type", 3);
            intent.putExtra("preview_image", true);
            intent.putStringArrayListExtra("preview_image_list", arrayList2);
            boolean z17 = false;
            boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C19989xd599637f()) == 1;
            if (z18) {
                intent.putStringArrayListExtra("preview_image_media_id_list", arrayList3);
            }
            if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C19987xd315d07f()) == 1) && z18) {
                z17 = true;
            }
            intent.putExtra("Gallery_LivePhoto_Auto_Enable", z17);
            intent.putExtra("key_from_c2c_recently_quickly_send", true);
            intent.putExtra("max_select_count", 1);
            intent.addFlags(67108864);
            com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = c19666xfd6e2f33.Y2;
            if (abstractViewOnAttachStateChangeListenerC21400xb429b010 != null) {
                j45.l.p(abstractViewOnAttachStateChangeListenerC21400xb429b010, "gallery", ".ui.GalleryEntryUI", intent, 217);
            } else {
                j45.l.n(k1Var.f271973a, "gallery", ".ui.GalleryEntryUI", intent, 217);
            }
        }
        n9Var.f272052h.dismiss();
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/RecentImageBubble$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
