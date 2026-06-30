package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes.dex */
public final class db extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f210596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f210597e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(java.lang.String str, java.lang.String str2) {
        super(1);
        this.f210596d = str;
        this.f210597e = str2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String it = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderModifyNameUI", "click ".concat(it));
        java.lang.String str2 = this.f210596d;
        if (str2 != null && (str = this.f210597e) != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
            am.nx nxVar = c6113xa3727625.f136390g;
            nxVar.f88999a = str2;
            nxVar.f89000b = str;
            c6113xa3727625.e();
        }
        return jz5.f0.f384359a;
    }
}
