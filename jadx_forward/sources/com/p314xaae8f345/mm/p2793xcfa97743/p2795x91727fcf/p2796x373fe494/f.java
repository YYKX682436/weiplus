package com.p314xaae8f345.mm.p2793xcfa97743.p2795x91727fcf.p2796x373fe494;

/* loaded from: classes8.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2793xcfa97743.p2795x91727fcf.p2796x373fe494.g f295298d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p2793xcfa97743.p2795x91727fcf.p2796x373fe494.g gVar) {
        super(1);
        this.f295298d = gVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject it = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.String optString = it.optString("talker");
        java.lang.String optString2 = it.optString("invite");
        java.lang.Long valueOf = java.lang.Long.valueOf(it.optLong("roomId"));
        com.p314xaae8f345.mm.p2793xcfa97743.p2795x91727fcf.p2796x373fe494.g gVar = this.f295298d;
        gVar.f295301f = valueOf;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "")) {
            java.util.ArrayList arrayList = gVar.f295299d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            arrayList.add(new com.p314xaae8f345.mm.p2793xcfa97743.p2795x91727fcf.p2796x373fe494.b(optString, optString2));
        }
        return jz5.f0.f384359a;
    }
}
