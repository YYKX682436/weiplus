package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826;

/* loaded from: classes7.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f162736e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162737f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f162738g;

    public e1(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, java.lang.String str2, org.json.JSONObject jSONObject) {
        this.f162735d = str;
        this.f162736e = e9Var;
        this.f162737f = str2;
        this.f162738g = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f162735d;
        if (str != null) {
            int hashCode = str.hashCode();
            java.lang.String str2 = this.f162737f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f162736e;
            switch (hashCode) {
                case -1867169789:
                    if (str.equals(ya.b.f77504xbb80cbe3)) {
                        db5.t7.h(e9Var.getF229340d(), str2);
                        return;
                    }
                    return;
                case 3135262:
                    if (str.equals("fail")) {
                        db5.t7.g(e9Var.getF229340d(), str2);
                        return;
                    }
                    return;
                case 3387192:
                    if (str.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc)) {
                        db5.t7.m(e9Var.getF229340d(), str2);
                        return;
                    }
                    return;
                case 336650556:
                    if (str.equals("loading")) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12129x91a53a65 c12129x91a53a65 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12129x91a53a65();
                        c12129x91a53a65.b(this.f162738g.toString());
                        android.content.Context f229340d = e9Var.getF229340d();
                        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(f229340d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, c12129x91a53a65, null, null);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
