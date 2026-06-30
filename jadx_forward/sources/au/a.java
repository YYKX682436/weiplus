package au;

/* loaded from: classes9.dex */
public final class a extends ru.j {

    /* renamed from: o, reason: collision with root package name */
    public final au.b f95578o;

    /* renamed from: p, reason: collision with root package name */
    public final int f95579p;

    /* renamed from: q, reason: collision with root package name */
    public final int f95580q;

    /* renamed from: r, reason: collision with root package name */
    public final int f95581r;

    /* renamed from: s, reason: collision with root package name */
    public final int f95582s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(au.b params) {
        super(params);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f95578o = params;
        this.f95579p = 480;
        this.f95580q = 640;
        this.f95581r = 131072;
        this.f95582s = 1000;
    }

    @Override // ru.j
    public void G(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, l15.c commonMsg, java.lang.String thumbName) {
        jz5.l lVar;
        java.lang.String optString;
        z05.c cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commonMsg, "commonMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbName, "thumbName");
        v05.b k17 = commonMsg.k();
        java.lang.String l17 = (k17 == null || (cVar = (z05.c) k17.m75936x14adae67(k17.f513848e + 64)) == null) ? null : cVar.l();
        boolean z17 = l17 == null || l17.length() == 0;
        au.b bVar = this.f95578o;
        if (z17) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b1.Di().V3(msgInfo, bVar.f493714c, false, android.graphics.Bitmap.CompressFormat.PNG, false, thumbName);
            return;
        }
        int i17 = this.f95579p;
        try {
            optString = new org.json.JSONObject(l17).optString("ratioType");
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseSendAppMsgTask", e17.getMessage());
            lVar = new jz5.l(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i17));
        }
        if (optString != null) {
            int hashCode = optString.hashCode();
            if (hashCode != 48936) {
                int i18 = this.f95580q;
                if (hashCode != 50861) {
                    if (hashCode == 51821 && optString.equals("4:3")) {
                        lVar = new jz5.l(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
                        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                        m11.b1.Di().j4(msgInfo, bVar.f493714c, android.graphics.Bitmap.CompressFormat.PNG, ((java.lang.Number) lVar.f384366d).intValue(), ((java.lang.Number) lVar.f384367e).intValue(), this.f95581r, j62.e.g().i("clicfg_w1w_card_img_crop_longer_len_threshold", this.f95582s, true, true), thumbName);
                    }
                } else if (optString.equals("3:4")) {
                    lVar = new jz5.l(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                    ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                    m11.b1.Di().j4(msgInfo, bVar.f493714c, android.graphics.Bitmap.CompressFormat.PNG, ((java.lang.Number) lVar.f384366d).intValue(), ((java.lang.Number) lVar.f384367e).intValue(), this.f95581r, j62.e.g().i("clicfg_w1w_card_img_crop_longer_len_threshold", this.f95582s, true, true), thumbName);
                }
            } else if (optString.equals("1:1")) {
                lVar = new jz5.l(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i17));
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                m11.b1.Di().j4(msgInfo, bVar.f493714c, android.graphics.Bitmap.CompressFormat.PNG, ((java.lang.Number) lVar.f384366d).intValue(), ((java.lang.Number) lVar.f384367e).intValue(), this.f95581r, j62.e.g().i("clicfg_w1w_card_img_crop_longer_len_threshold", this.f95582s, true, true), thumbName);
            }
        }
        lVar = new jz5.l(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i17));
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.b1.Di().j4(msgInfo, bVar.f493714c, android.graphics.Bitmap.CompressFormat.PNG, ((java.lang.Number) lVar.f384366d).intValue(), ((java.lang.Number) lVar.f384367e).intValue(), this.f95581r, j62.e.g().i("clicfg_w1w_card_img_crop_longer_len_threshold", this.f95582s, true, true), thumbName);
    }
}
