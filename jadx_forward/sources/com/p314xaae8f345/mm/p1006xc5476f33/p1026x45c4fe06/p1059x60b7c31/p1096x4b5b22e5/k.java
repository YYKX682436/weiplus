package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5;

/* loaded from: classes7.dex */
public class k extends com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y f163775e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f163776f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.l f163777g;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.l lVar, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar, int i17) {
        this.f163777g = lVar;
        this.f163775e = yVar;
        this.f163776f = i17;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h
    public void a(android.os.Parcelable parcelable) {
        android.os.Bundle bundle = (android.os.Bundle) parcelable;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.l lVar = this.f163777g;
        int i17 = this.f163776f;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = this.f163775e;
        if (bundle == null) {
            yVar.a(i17, lVar.o("fail:internal error"));
            return;
        }
        bundle.setClassLoader(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.l.class.getClassLoader());
        if (bundle.get("KEY_PRECONDITION_RESULT") != null) {
            yVar.a(i17, lVar.o("ok"));
            return;
        }
        java.lang.String string = bundle.getString("KEY_PRECONDITION_ERR_REASON");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (string == null) {
            string = "";
        }
        yVar.a(i17, lVar.o("fail ".concat(string)));
    }
}
