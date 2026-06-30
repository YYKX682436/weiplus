package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes4.dex */
public final class db extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.eb f157027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.cb f157028e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.eb ebVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.cb cbVar) {
        super(0);
        this.f157027d = ebVar;
        this.f157028e = cbVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select count(*) from ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.eb ebVar = this.f157027d;
        sb6.append(ebVar.mo145255x88e404c3());
        sb6.append(" where pluginAppID=? and pluginAppVersion=?");
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.cb cbVar = this.f157028e;
        java.lang.String field_pluginAppID = cbVar.f65947x9f94ffc4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_pluginAppID, "field_pluginAppID");
        android.database.Cursor B = ebVar.f157051e.B(sb7, new java.lang.String[]{field_pluginAppID, java.lang.String.valueOf(cbVar.f65948x5da57faf)});
        if (B != null) {
            try {
                if (B.moveToFirst()) {
                    if (B.getInt(0) > 0) {
                        z17 = true;
                        vz5.b.a(B, null);
                    }
                }
                z17 = false;
                vz5.b.a(B, null);
            } finally {
            }
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17 ? ebVar.mo9952xce0038c9(cbVar, new java.lang.String[0]) : ebVar.mo880xb970c2b9(cbVar));
    }
}
