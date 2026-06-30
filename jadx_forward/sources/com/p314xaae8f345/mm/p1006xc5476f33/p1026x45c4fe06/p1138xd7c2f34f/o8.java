package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class o8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r8 f166393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f166394e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r8 r8Var, java.util.List list) {
        super(2);
        this.f166393d = r8Var;
        this.f166394e = list;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = (java.lang.String) obj2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("emitParallelPkgDownloadTasks appId:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r8 r8Var = this.f166393d;
        sb6.append(r8Var.f166639d);
        sb6.append(", versionType:");
        sb6.append(r8Var.f166640e);
        sb6.append(", moduleNames:");
        sb6.append(this.f166394e);
        sb6.append(", get error(");
        sb6.append(intValue);
        sb6.append(' ');
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(')');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LaunchCheckPkgHandlerSeparatedPluginsCompatible", sb6.toString());
        return jz5.f0.f384359a;
    }
}
