package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class e2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f160977a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f160978b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.f2 f160979c;

    public e2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.f2 f2Var) {
        this.f160977a = e9Var;
        this.f160978b = i17;
        this.f160979c = f2Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u
    /* renamed from: onReceiveResult */
    public void mo50331x8a4d1541(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12001x1574efee c12001x1574efee = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12001x1574efee) abstractC11888x1a859600;
        java.util.HashMap hashMap = new java.util.HashMap(2);
        boolean z17 = c12001x1574efee != null && c12001x1574efee.f160886e == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.f2 f2Var = this.f160979c;
        int i17 = this.f160978b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f160977a;
        if (z17) {
            hashMap.put("mobileTicket", c12001x1574efee.f160885d);
            f2Var.getClass();
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 0);
            e9Var.a(i17, f2Var.t("ok", hashMap));
            return;
        }
        if (c12001x1574efee == null || (str = java.lang.Integer.valueOf(c12001x1574efee.f160886e).toString()) == null) {
            str = "";
        }
        hashMap.put("errCode", str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fail errCode:  ");
        sb6.append(c12001x1574efee != null ? java.lang.Integer.valueOf(c12001x1574efee.f160886e) : null);
        sb6.append(" errMsg: ");
        sb6.append(c12001x1574efee != null ? c12001x1574efee.f160887f : null);
        java.lang.String sb7 = sb6.toString();
        f2Var.getClass();
        if (sb7 == null) {
            sb7 = "fail:jsapi invalid request data";
        }
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hashMap.put("errno", 101);
        e9Var.a(i17, f2Var.t(sb7, hashMap));
    }
}
