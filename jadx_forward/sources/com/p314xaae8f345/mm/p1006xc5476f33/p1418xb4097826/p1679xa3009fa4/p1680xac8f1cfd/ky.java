package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ky extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny f216529d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar) {
        super(1);
        this.f216529d = nyVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject updateClientPageUdfKvObject = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(updateClientPageUdfKvObject, "$this$updateClientPageUdfKvObject");
        updateClientPageUdfKvObject.put("avatar_uuid", this.f216529d.m158354x19263085().getIntent().getStringExtra("UUID_INTENT_KEY"));
        return jz5.f0.f384359a;
    }
}
