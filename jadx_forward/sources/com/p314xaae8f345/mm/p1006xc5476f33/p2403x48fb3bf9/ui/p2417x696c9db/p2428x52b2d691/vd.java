package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class vd extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f268123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268124e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268125f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, java.lang.String str, java.lang.String str2) {
        super(1);
        this.f268123d = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f268124e = str;
        this.f268125f = str2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String path = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        nw4.n nVar = this.f268123d.f265377p0;
        jz5.l lVar = new jz5.l("sourceType", 1);
        jz5.l lVar2 = new jz5.l("type", "emoticon");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("md5", this.f268124e);
        jSONObject.put("emojiInfo", this.f268125f);
        jSONObject.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, path);
        nVar.N(kz5.c1.l(lVar, lVar2, new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject.toString())));
        return jz5.f0.f384359a;
    }
}
