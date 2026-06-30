package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class w3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4 f205846d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4 f4Var) {
        super(0);
        this.f205846d = f4Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String stringExtra = this.f205846d.m158359x1e885992().getStringExtra("key_poi_interaction_info");
        if (stringExtra == null) {
            return null;
        }
        if (!(stringExtra.length() > 0)) {
            return null;
        }
        r45.so2 so2Var = new r45.so2();
        byte[] c17 = ot5.e.c(stringExtra);
        if (c17 == null) {
            return null;
        }
        try {
            so2Var.mo11468x92b714fd(c17);
            return so2Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            return null;
        }
    }
}
