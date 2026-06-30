package fy4;

/* loaded from: classes8.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fy4.e f348789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f348790e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348791f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(fy4.e eVar, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, java.lang.String str) {
        super(1);
        this.f348789d = eVar;
        this.f348790e = interfaceC4987x84e327cb;
        this.f348791f = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String path = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        nw4.n nVar = this.f348789d.f348792d.f265377p0;
        jz5.l lVar = new jz5.l("sourceType", 2);
        jz5.l lVar2 = new jz5.l("type", "emoticon");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("md5", this.f348790e.mo42933xb5885648());
        jSONObject.put("emojiInfo", this.f348791f);
        jSONObject.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, path);
        nVar.N(kz5.c1.l(lVar, lVar2, new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject.toString())));
        return jz5.f0.f384359a;
    }
}
