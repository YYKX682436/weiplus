package i53;

/* loaded from: classes8.dex */
public class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 f370075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i53.i1 f370076e;

    public d1(i53.i1 i1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078) {
        this.f370076e = i1Var;
        this.f370075d = abstractC15633xee433078;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = this.f370075d;
        int mo63659xfb85f7b0 = abstractC15633xee433078.mo63659xfb85f7b0();
        i53.i1 i1Var = this.f370076e;
        if (mo63659xfb85f7b0 != 2) {
            int mo63659xfb85f7b02 = abstractC15633xee433078.mo63659xfb85f7b0();
            i1Var.getClass();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = i1Var.f370127d.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee4330782 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next();
                if (abstractC15633xee4330782.mo63659xfb85f7b0() == mo63659xfb85f7b02) {
                    arrayList2.add(abstractC15633xee4330782);
                }
            }
            ((d60.y) ((e60.c1) i95.n0.c(e60.c1.class))).getClass();
            t23.p0.p(arrayList2);
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(i1Var.f370129f, "com.tencent.mm.plugin.gallery.ui.ImagePreviewUI");
            intent.putStringArrayListExtra("preview_image_list", i1Var.x());
            intent.putParcelableArrayListExtra("preview_media_item_list", i1Var.f370128e);
            intent.putExtra("preview_all", true);
            intent.putExtra("preview_position", arrayList2.indexOf(abstractC15633xee433078));
            intent.putExtra("send_raw_img", false);
            intent.putExtra("max_select_count", i1Var.f370131h);
            android.content.Context context = i1Var.f370129f;
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15908x78af54de.f221577q;
            j45.l.n(context, "gallery", ".ui.ImagePreviewUI", intent, 63802);
        } else {
            if (i1Var.f370128e.size() != 0) {
                db5.e1.T(i1Var.f370134n.getContext(), i65.a.r(i1Var.f370134n.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.fiq));
                yj0.a.h(this, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("game_straight_to_publish", i1Var.f370134n.f221585n);
            m33.v1 v1Var = (m33.v1) i95.n0.c(m33.v1.class);
            android.content.Context context2 = i1Var.f370129f;
            java.lang.String str = abstractC15633xee433078.f219963e;
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15908x78af54de.f221577q;
            int i19 = i1Var.f370134n.f221586o;
            ((i53.x3) v1Var).getClass();
            i53.x3.wi(context2, 4, null, null, str, null, null, true, null, 25690, bundle, i19);
            i1Var.f370134n.c(2, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
