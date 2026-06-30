package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

@mk0.a
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI$$d */
/* loaded from: classes8.dex */
public class C19371xe76b3af0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.i<android.os.Bundle, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d> {
    private C19371xe76b3af0() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        int i17;
        int i18;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("key_image_path");
        int i19 = bundle.getInt("key_img_source");
        int i27 = bundle.getInt("key_scene");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "MMOpenCameraTask, chooseFilePath = " + string + ", source = " + i19 + ", originalScene = " + i27);
        try {
            if (i27 == 3147) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "MMOpenCameraTask, map ORDER1_SEARCH to CircleToSearchScene.OrderAndShop");
                i17 = 17;
            } else if (i27 == 4501) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "MMOpenCameraTask, map GIFT_SEARCH_MIN to CircleToSearchScene.Present");
                i17 = 18;
            } else if (((s50.u0) ((u50.z) i95.n0.c(u50.z.class))).Bi(i27)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "MMOpenCameraTask, map finder scene " + i27 + " to CircleToSearchScene.FinderEducationPic");
                i17 = 19;
            } else {
                i17 = 11;
            }
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            int i28 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74.E4;
            switch (i19) {
                case 18:
                case 20:
                    i18 = 6;
                    break;
                case 19:
                case 21:
                    i18 = 7;
                    break;
                default:
                    i18 = 0;
                    break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74.D9(context, i17, i18, string, i19);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.BaseSearchWebViewUI", "doOpenCamera fail, ex = " + e17);
        }
        if (rVar != null) {
            rVar.a(bundle);
        }
    }
}
