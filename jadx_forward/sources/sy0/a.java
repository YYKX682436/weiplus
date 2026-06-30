package sy0;

/* loaded from: classes4.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.app.Activity context, android.content.Intent originIntent, int i17, sy0.b scene, java.util.List mediaList, com.p314xaae8f345.mm.p916x4268f0dc.api.C11010x5ff4d15f c11010x5ff4d15f) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originIntent, "originIntent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaList, "mediaList");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(originIntent);
        intent.setClass(context, com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p919x7e63ca91.ActivityC11007x7cb63ad9.class);
        intent.putParcelableArrayListExtra("Template_Media_List", new java.util.ArrayList<>(mediaList));
        intent.putExtra("maas_album_template.scene", scene.ordinal());
        if (c11010x5ff4d15f != null) {
            intent.putExtra("request_params", new com.p314xaae8f345.mm.p916x4268f0dc.api.C11012xa5f608f2(mediaList, c11010x5ff4d15f));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(context, arrayList.toArray(), "com/tencent/mm/mj_template/album_template/single_template/MaasAlbumTemplatePreviewUI$Companion", "jumpToTemplateUI", "(Landroid/app/Activity;Landroid/content/Intent;ILcom/tencent/mm/mj_template/album_template/single_template/MaasAlbumTemplatePreviewUI$Scene;Ljava/util/List;Lcom/tencent/mm/mj_template/api/MJTemplateSession;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }
}
