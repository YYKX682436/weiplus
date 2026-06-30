package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class x60 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f201833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ re2.h1 f201834e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x60(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z60 z60Var, az2.f fVar, re2.h1 h1Var) {
        super(2);
        this.f201833d = fVar;
        this.f201834e = h1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = (java.lang.String) obj2;
        az2.f fVar = this.f201833d;
        re2.h1 h1Var = this.f201834e;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            fVar.b();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderStartLiveModeTabWidget", "showCoLiveSettingDialog: create failed, errCode=" + intValue + ", errMsg=" + str);
            if (re2.j1.f475971b == h1Var) {
                re2.e0 e0Var = re2.j1.f475971b;
                if (e0Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveTaskManager", "destroy: invitationId=" + e0Var.f475923c + ", phase=" + e0Var.f475922b);
                    e0Var.a();
                }
                re2.j1.f475971b = null;
            }
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w60(fVar, intValue, str, h1Var));
        }
        return jz5.f0.f384359a;
    }
}
