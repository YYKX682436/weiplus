package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f;

/* loaded from: classes12.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.z f279986d;

    public x(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.z zVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.a0 a0Var) {
        this.f279986d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof java.lang.Integer)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaHistoryGalleryAdapter", "getTag is %s", view.getTag());
            yj0.a.h(this, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.z zVar = this.f279986d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.w x17 = zVar.f279995n.x(((java.lang.Integer) view.getTag()).intValue());
        if (x17 == null) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.a0 a0Var = zVar.f279995n;
        a0Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_biz_chat_id", a0Var.f279924n);
        intent.putExtra("key_is_biz_chat", a0Var.f279923m);
        intent.putExtra("KOpenArticleSceneFromScene", 140);
        if (x17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaHistoryGalleryAdapter", "[enterGallery] item == null");
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = x17.f279980b;
            if (f9Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaHistoryGalleryAdapter", "[enterGallery] msg == null");
            } else {
                if (!((fo.e) ((le5.e) i95.n0.c(le5.e.class))).bj(view.getContext(), f9Var.G, null)) {
                    android.content.Context context = a0Var.f279917d;
                    int i17 = context.getResources().getConfiguration().orientation;
                    int[] iArr = new int[2];
                    int width = view.getWidth();
                    int height = view.getHeight();
                    view.getLocationInWindow(iArr);
                    intent.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
                    intent.putExtra("img_gallery_msg_id", f9Var.m124847x74d37ac6()).putExtra("img_gallery_msg_svr_id", f9Var.I0()).putExtra("img_gallery_talker", f9Var.Q0()).putExtra("img_gallery_chatroom_name", f9Var.Q0()).putExtra("img_gallery_orientation", i17);
                    intent.putExtra("img_gallery_width", width).putExtra("img_gallery_height", height).putExtra("img_gallery_left", iArr[0]).putExtra("img_gallery_top", iArr[1]).putExtra("img_gallery_enter_from_grid", true);
                    if (c01.ia.M(f9Var)) {
                        intent.putExtra("msg_type", 2);
                    }
                    intent.putExtra("key_enter_scene", 3);
                    j45.l.u(context, "com.tencent.mm.ui.chatting.gallery.ImageGalleryUI", intent, null);
                    ((android.app.Activity) context).overridePendingTransition(0, 0);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
