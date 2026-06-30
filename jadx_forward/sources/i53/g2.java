package i53;

/* loaded from: classes8.dex */
public final class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15910x98b51341 f370113d;

    public g2(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15910x98b51341 c15910x98b51341) {
        this.f370113d = c15910x98b51341;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/media/GameRecommendVideoFragment$onViewCreated$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15910x98b51341 c15910x98b51341 = this.f370113d;
        p33.e0 videoAlbumItem = c15910x98b51341.f221595d;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = c15910x98b51341.mo7430x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoAlbumItem, "videoAlbumItem");
        if (mo7430x19263085 != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("createTimeSec", videoAlbumItem.f433071e);
            p33.f0 f0Var = videoAlbumItem.f433073g;
            if (f0Var != null) {
                jSONObject.put("duration", f0Var.f433098i);
                jSONObject.put("subTitle", f0Var.f433100n);
                jSONObject.put("thumbUrl", f0Var.f433094e);
                jSONObject.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, f0Var.f433097h);
                jSONObject.put("videoUrl", f0Var.f433093d);
                p33.j jVar = videoAlbumItem.f433075i;
                jSONObject.put("transInfo", jVar != null ? jVar.f433131e : null);
            }
            android.content.Intent intent = new android.content.Intent();
            p33.k kVar = videoAlbumItem.f433072f;
            intent.putExtra("key_game_video_appid", kVar != null ? kVar.f433132d : null);
            p33.k kVar2 = videoAlbumItem.f433072f;
            intent.putExtra("key_game_video_appname", kVar2 != null ? kVar2.f433133e : null);
            intent.putExtra("key_game_video_page_type", 2);
            p33.j jVar2 = videoAlbumItem.f433075i;
            intent.putExtra("key_game_trans_info", jVar2 != null ? jVar2.f433131e : null);
            intent.putExtra("key_game_video_encode_json_array", true);
            cl0.e eVar = new cl0.e();
            eVar.q(jSONObject);
            intent.putExtra("key_video_info", eVar.mo15068x9616526c());
            mo7430x19263085.setResult(-1, intent);
            mo7430x19263085.finish();
        }
        c15910x98b51341.j0(true, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/game/media/GameRecommendVideoFragment$onViewCreated$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
