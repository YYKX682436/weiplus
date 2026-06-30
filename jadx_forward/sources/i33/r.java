package i33;

/* loaded from: classes.dex */
public final class r implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.u f369772d;

    public r(i33.u uVar) {
        this.f369772d = uVar;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        h33.c data = (h33.c) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.g(itemView, data, i17);
        i33.u uVar = this.f369772d;
        uVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = data.f359989e;
        if (abstractC15633xee433078 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) {
            ct.b3 b3Var = (ct.b3) i95.n0.c(ct.b3.class);
            android.app.Activity context = uVar.m80379x76847179();
            java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) abstractC15633xee433078).f219963e;
            java.lang.String f17 = j33.d0.f(str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getFileName(...)");
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.r3) b3Var).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            if (r26.n0.N(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaPreviewFeatureService", "startVideoMediaPreviewUI: filePath is null or blank");
                return;
            }
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2717x62f6fe4.ActivityC22445xcae55707.class);
            pf5.j0.a(intent, re5.g0.class);
            intent.putExtra("KEY_PATH", str);
            intent.putExtra("KEY_VIDEO_FILE_NAME", f17);
            intent.putExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39699xc6812768, true);
            intent.putExtra("KEY_VIDEO_HIDE_MENU", true);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/model/app/MediaPreviewFeatureService", "startVideoMediaPreviewUI", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/pluginsdk/model/app/MediaPreviewFeatureService", "startVideoMediaPreviewUI", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (abstractC15633xee433078 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b) {
            ct.b3 b3Var2 = (ct.b3) i95.n0.c(ct.b3.class);
            android.app.Activity context2 = uVar.m80379x76847179();
            java.lang.String str2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b) abstractC15633xee433078).f219963e;
            if (str2 == null) {
                str2 = "";
            }
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.r3) b3Var2).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            if (r26.n0.N(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaPreviewFeatureService", "startFileMediaPreviewUI: filePath is null or blank");
                return;
            }
            android.content.Intent intent2 = new android.content.Intent(context2, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752.class);
            intent2.putExtra("key_image_path", str2);
            intent2.putExtra("key_favorite", false);
            intent2.putExtra("key_scene", 3);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/model/app/MediaPreviewFeatureService", "startImageMediaPreviewUI", "(Landroid/content/Context;Lcom/tencent/mm/media/model/ImagePreviewParams;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context2, "com/tencent/mm/pluginsdk/model/app/MediaPreviewFeatureService", "startImageMediaPreviewUI", "(Landroid/content/Context;Lcom/tencent/mm/media/model/ImagePreviewParams;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
