package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class f4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f162406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f162407e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i4 f162408f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(int i17, java.lang.ref.WeakReference weakReference, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i4 i4Var) {
        super(1);
        this.f162406d = i17;
        this.f162407e = weakReference;
        this.f162408f = i4Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2 = (java.lang.String) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Loader(");
        int i17 = this.f162406d;
        sb6.append(i17);
        sb6.append(").onError, errMsg:");
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.FULL.JsApiBatchGetContact", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) this.f162407e.get();
        if (yVar != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("fail");
            if (str2 == null || str2.length() == 0) {
                str = "";
            } else {
                str = ":" + str2;
            }
            sb7.append(str);
            yVar.a(i17, this.f162408f.o(sb7.toString()));
        }
        return jz5.f0.f384359a;
    }
}
