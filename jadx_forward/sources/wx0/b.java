package wx0;

/* loaded from: classes5.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wx0.f f531989d;

    public b(wx0.f fVar) {
        this.f531989d = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/BackgroundPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f531989d.f413347d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view2, "<this>");
        by0.c cVar = by0.c.f117856a;
        android.content.Context context = view2.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.app.Activity a17 = cVar.a(context);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackgroundPlugin", "openAlbum: activity is null ");
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("max_select_count", 1);
            ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
            int J2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.J2();
            bundle.putInt("album_video_max_duration", J2);
            bundle.putInt("album_video_min_duration", 0);
            bundle.putInt("key_max_video_duration", J2);
            bundle.putInt("key_min_video_duration", 0);
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(view2.getContext(), "com.tencent.mm.plugin.finder.ui.FinderAlbumUI");
            intent.putExtra("key_can_select_video_and_pic", false);
            intent.putExtra("show_header_view", false);
            intent.putExtra("query_source_type", 39);
            intent.putExtra("query_media_type", 1);
            intent.putExtra("is_hide_album_footer", false);
            intent.putExtras(bundle);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(672);
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.k(a17, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/BackgroundPlugin", "openAlbum", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/BackgroundPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
