package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes.dex */
public final class wa extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15449xa84711 f217861d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15449xa84711 c15449xa84711) {
        super(0);
        this.f217861d = c15449xa84711;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String stringExtra = this.f217861d.m158354x19263085().getIntent().getStringExtra("key_biz_passthrough_info");
        if (stringExtra == null) {
            stringExtra = "{}";
        }
        return d75.b.e(new org.json.JSONObject(stringExtra), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.va.f217764d);
    }
}
