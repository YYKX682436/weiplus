package yw2;

/* loaded from: classes5.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw2.a0 f548204d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(yw2.a0 a0Var) {
        super(1);
        this.f548204d = a0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ux2.h imageItem = (ux2.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageItem, "imageItem");
        java.lang.String str = imageItem.f513405b;
        if (str != null) {
            android.content.Context l17 = this.f548204d.l();
            android.content.Intent intent = new android.content.Intent();
            boolean z17 = l17 instanceof android.app.Activity;
            android.content.Intent intent2 = !z17 ? intent : null;
            if (intent2 != null) {
                intent2.addFlags(268435456);
            }
            intent.setClassName(l17, "com.tencent.mm.plugin.finder.ui.FinderAlbumUI");
            intent.putExtra("ENTER_FROM_RECENT_IMAGE", true);
            intent.putExtra("is_hide_album_footer", false);
            intent.putExtra("show_header_view", false);
            intent.putExtra("max_select_count", 1);
            intent.putExtra("query_source_type", 48);
            intent.putExtra("query_media_type", 1);
            intent.putExtra("preview_image", true);
            intent.putStringArrayListExtra("preview_image_list", kz5.c0.d(str));
            if (z17) {
                android.app.Activity activity = (android.app.Activity) l17;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(503);
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "enterFinderRecentImageAlbumUI", "(Landroid/content/Context;Ljava/lang/String;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(l17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "enterFinderRecentImageAlbumUI", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                l17.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(l17, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "enterFinderRecentImageAlbumUI", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        return jz5.f0.f384359a;
    }
}
