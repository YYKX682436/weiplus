package au;

/* loaded from: classes9.dex */
public final class a extends ru.j {

    /* renamed from: o, reason: collision with root package name */
    public final au.b f14045o;

    /* renamed from: p, reason: collision with root package name */
    public final int f14046p;

    /* renamed from: q, reason: collision with root package name */
    public final int f14047q;

    /* renamed from: r, reason: collision with root package name */
    public final int f14048r;

    /* renamed from: s, reason: collision with root package name */
    public final int f14049s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(au.b params) {
        super(params);
        kotlin.jvm.internal.o.g(params, "params");
        this.f14045o = params;
        this.f14046p = 480;
        this.f14047q = 640;
        this.f14048r = 131072;
        this.f14049s = 1000;
    }

    @Override // ru.j
    public void G(com.tencent.mm.storage.f9 msgInfo, l15.c commonMsg, java.lang.String thumbName) {
        jz5.l lVar;
        java.lang.String optString;
        z05.c cVar;
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        kotlin.jvm.internal.o.g(commonMsg, "commonMsg");
        kotlin.jvm.internal.o.g(thumbName, "thumbName");
        v05.b k17 = commonMsg.k();
        java.lang.String l17 = (k17 == null || (cVar = (z05.c) k17.getCustom(k17.f432315e + 64)) == null) ? null : cVar.l();
        boolean z17 = l17 == null || l17.length() == 0;
        au.b bVar = this.f14045o;
        if (z17) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b1.Di().V3(msgInfo, bVar.f412181c, false, android.graphics.Bitmap.CompressFormat.PNG, false, thumbName);
            return;
        }
        int i17 = this.f14046p;
        try {
            optString = new org.json.JSONObject(l17).optString("ratioType");
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseSendAppMsgTask", e17.getMessage());
            lVar = new jz5.l(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i17));
        }
        if (optString != null) {
            int hashCode = optString.hashCode();
            if (hashCode != 48936) {
                int i18 = this.f14047q;
                if (hashCode != 50861) {
                    if (hashCode == 51821 && optString.equals("4:3")) {
                        lVar = new jz5.l(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
                        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                        m11.b1.Di().j4(msgInfo, bVar.f412181c, android.graphics.Bitmap.CompressFormat.PNG, ((java.lang.Number) lVar.f302833d).intValue(), ((java.lang.Number) lVar.f302834e).intValue(), this.f14048r, j62.e.g().i("clicfg_w1w_card_img_crop_longer_len_threshold", this.f14049s, true, true), thumbName);
                    }
                } else if (optString.equals("3:4")) {
                    lVar = new jz5.l(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                    ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                    m11.b1.Di().j4(msgInfo, bVar.f412181c, android.graphics.Bitmap.CompressFormat.PNG, ((java.lang.Number) lVar.f302833d).intValue(), ((java.lang.Number) lVar.f302834e).intValue(), this.f14048r, j62.e.g().i("clicfg_w1w_card_img_crop_longer_len_threshold", this.f14049s, true, true), thumbName);
                }
            } else if (optString.equals("1:1")) {
                lVar = new jz5.l(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i17));
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                m11.b1.Di().j4(msgInfo, bVar.f412181c, android.graphics.Bitmap.CompressFormat.PNG, ((java.lang.Number) lVar.f302833d).intValue(), ((java.lang.Number) lVar.f302834e).intValue(), this.f14048r, j62.e.g().i("clicfg_w1w_card_img_crop_longer_len_threshold", this.f14049s, true, true), thumbName);
            }
        }
        lVar = new jz5.l(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i17));
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.b1.Di().j4(msgInfo, bVar.f412181c, android.graphics.Bitmap.CompressFormat.PNG, ((java.lang.Number) lVar.f302833d).intValue(), ((java.lang.Number) lVar.f302834e).intValue(), this.f14048r, j62.e.g().i("clicfg_w1w_card_img_crop_longer_len_threshold", this.f14049s, true, true), thumbName);
    }
}
