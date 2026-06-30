package i53;

/* loaded from: classes8.dex */
public class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15908x78af54de f370313d;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15908x78af54de c15908x78af54de) {
        this.f370313d = c15908x78af54de;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/media/GameLocalGalleryView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15908x78af54de c15908x78af54de = this.f370313d;
        java.util.ArrayList arrayList2 = c15908x78af54de.f221579e.f370128e;
        if ((arrayList2 != null ? arrayList2.size() : 0) > 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(c15908x78af54de.getContext(), "com.tencent.mm.plugin.gallery.ui.ImagePreviewUI");
            intent.putStringArrayListExtra("preview_image_list", c15908x78af54de.f221579e.x());
            intent.putParcelableArrayListExtra("preview_media_item_list", c15908x78af54de.f221579e.f370128e);
            intent.putExtra("max_select_count", c15908x78af54de.f221582h);
            intent.putExtra("send_raw_img", false);
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 87, 8767, 3, 1, 87, nj0.a.c(new java.util.HashMap()));
            android.content.Context context = c15908x78af54de.getContext();
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15908x78af54de.f221577q;
            j45.l.n(context, "gallery", ".ui.ImagePreviewUI", intent, 63802);
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_game_haowan_text", true);
            ((android.app.Activity) c15908x78af54de.getContext()).setResult(-1, intent2);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("content", "3");
            hashMap.put("way", "2");
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 87, 8767, 4, 7, 87, nj0.a.c(hashMap));
            ((android.app.Activity) c15908x78af54de.getContext()).finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
