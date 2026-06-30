package f53;

/* loaded from: classes10.dex */
public final class r implements com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.C15904x23af11da f341219a;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.C15904x23af11da c15904x23af11da) {
        this.f341219a = c15904x23af11da;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void a(java.lang.String str) {
        java.lang.String valueOf;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.C15904x23af11da c15904x23af11da = this.f341219a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 k0Var = c15904x23af11da.f221534d;
        if (k0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("textListener");
            throw null;
        }
        k0Var.a(str);
        if (c15904x23af11da.getPickEmojiStr().length() > 0) {
            valueOf = c15904x23af11da.getPickEmojiStr() + ';' + str;
        } else {
            valueOf = java.lang.String.valueOf(str);
        }
        c15904x23af11da.m64609xc0eb58ce(valueOf);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("emoticonID", str);
        } catch (org.json.JSONException unused) {
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(c15904x23af11da.getContext(), 90, 9001, 1, 2, c15904x23af11da.getMsourceScene(), jSONObject.toString());
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void b() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void d() {
    }
}
