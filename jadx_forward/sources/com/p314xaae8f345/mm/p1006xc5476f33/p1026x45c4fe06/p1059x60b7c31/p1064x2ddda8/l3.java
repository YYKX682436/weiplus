package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class l3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n3 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f161160e;

    /* renamed from: f, reason: collision with root package name */
    public final jc1.d f161161f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h4 sharedContext, java.lang.String str, jc1.d errInfo, org.json.JSONObject jSONObject, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(sharedContext, null);
        str = (i17 & 2) != 0 ? null : str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sharedContext, "sharedContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errInfo, "errInfo");
        this.f161160e = str;
        this.f161161f = errInfo;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n3
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h4 h4Var = this.f161072d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff ffVar = h4Var.f161104e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j4 j4Var = h4Var.f161103d;
        org.json.JSONObject jSONObject = ffVar.f162547c;
        java.lang.String str = this.f161160e;
        jc1.d dVar = this.f161161f;
        int i17 = ffVar.f162549e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = ffVar.f162546b;
        if (jSONObject == null) {
            lVar.a(i17, j4Var.r(str, dVar, null));
        } else {
            lVar.a(i17, j4Var.r(str, dVar, jSONObject));
        }
    }
}
