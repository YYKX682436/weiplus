package gx1;

/* loaded from: classes12.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx1.y f358865d;

    public x(gx1.y yVar) {
        this.f358865d = yVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorVideoItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gx1.y yVar = this.f358865d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) yVar.f358824d.f422865b;
        abstractActivityC13156x6363e8e1.getClass();
        qx1.q qVar = abstractActivityC13156x6363e8e1.f178033g;
        if (qVar != null) {
            qVar.d(null);
        }
        android.widget.ImageView imageView = yVar.f358837f;
        android.content.Context context = imageView.getContext();
        ix1.m mVar = (ix1.m) yVar.f358836e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f376862r)) {
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorVideoItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(mVar.f376862r)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f fVar = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f.f178086d;
            gx1.v vVar = new gx1.v(this, mVar, context);
            yVar.B = vVar;
            fVar.b(vVar);
            yVar.C = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(imageView.getContext(), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571913td), true, 3, new gx1.w(this));
            fVar.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.c(mVar.f376857m, false, com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.a.TYPE_FILE, -1));
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorVideoItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_detail_info_id", 0);
        intent.putExtra("key_detail_fav_path", mVar.f376862r);
        intent.putExtra("key_detail_fav_thumb_path", mVar.f376879s);
        intent.putExtra("key_detail_fav_video_duration", mVar.f376880t);
        intent.putExtra("key_detail_data_id", mVar.f376844a);
        intent.putExtra("key_detail_statExtStr", "");
        intent.putExtra("key_detail_fav_video_show_download_status", false);
        o72.x1.M0((android.app.Activity) imageView.getContext(), ".ui.detail.FavoriteVideoPlayUI", intent, 1, null);
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorVideoItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
