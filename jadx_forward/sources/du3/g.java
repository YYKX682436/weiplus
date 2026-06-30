package du3;

/* loaded from: classes10.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1994xb9e77aab.C17003xb6ccea09 f325117d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1994xb9e77aab.C17003xb6ccea09 c17003xb6ccea09) {
        super(1);
        this.f325117d = c17003xb6ccea09;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String it = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        du3.b0 b0Var = this.f325117d.f237290p;
        b0Var.getClass();
        if (!android.text.TextUtils.isEmpty(b0Var.f325074z)) {
            str = b0Var.f325074z;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        } else if (com.p314xaae8f345.mm.vfs.w6.j(it)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 Ai = ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).Ai(it);
            b0Var.f325074z = Ai.f264269e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoAiPlugin", "convertToImageItem path:" + it + " to id:" + Ai.f264269e);
            str = Ai.f264269e;
        } else {
            str = null;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImproveEditPhotoAiPlugin", "web local id is null");
        } else {
            try {
                b0Var.C = it;
                b0Var.A = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
                ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enablePublishLivePhoto", "com.tencent.mm.feature.sns.SnsFeatureService");
                boolean a17 = pc4.e.f434959a.a();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enablePublishLivePhoto", "com.tencent.mm.feature.sns.SnsFeatureService");
                java.lang.String str3 = b0Var.f325065q;
                java.lang.Object[] objArr = new java.lang.Object[5];
                du3.b bVar = b0Var.f325066r;
                objArr[0] = bVar != null ? bVar.f325056d : null;
                objArr[1] = java.net.URLEncoder.encode(b0Var.A, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                du3.b bVar2 = b0Var.f325066r;
                if (bVar2 == null || (str2 = bVar2.f325054b) == null) {
                    str2 = "";
                }
                objArr[2] = java.net.URLEncoder.encode(str2, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                objArr[3] = java.net.URLEncoder.encode(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                objArr[4] = java.net.URLEncoder.encode(java.lang.String.valueOf(a17 ? 1 : 0), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                java.lang.String format = java.lang.String.format(str3, java.util.Arrays.copyOf(objArr, 5));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoAiPlugin", "open ai page:" + b0Var.f325066r + " url:" + format);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", format);
                intent.putExtra("disable_swipe_back", true);
                intent.putExtra("key_select_pic_from_mm_gallery_without_clear_top", true);
                j45.l.n(b0Var.f325057f.getContext(), "webview", ".ui.tools.WebViewUI", intent, b0Var.f325058g);
            } catch (java.io.UnsupportedEncodingException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ImproveEditPhotoAiPlugin", e17, "open page error", new java.lang.Object[0]);
            }
        }
        return jz5.f0.f384359a;
    }
}
