package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes9.dex */
public class r1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f264618d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f264619e;

    /* renamed from: f, reason: collision with root package name */
    public long f264620f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f264621g;

    public r1(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.LinkedList linkedList, int i18, java.lang.String str4, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.lang.String str5, int i19, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, java.lang.Boolean bool, boolean z17) {
        java.lang.String str6 = str5;
        this.f264620f = 0L;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        this.f264621g = linkedList2;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.uv5();
        lVar.f152198b = new r45.vv5();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/sdk_oauth_authorize_confirm";
        lVar.f152200d = 1346;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f264618d = a17;
        r45.uv5 uv5Var = (r45.uv5) a17.f152243a.f152217a;
        uv5Var.f469205d = i17;
        uv5Var.f469207f = str;
        uv5Var.f469206e = linkedList;
        uv5Var.f469208g = str2;
        uv5Var.f469209h = str3;
        uv5Var.f469210i = i18;
        uv5Var.f469211m = str4;
        uv5Var.f469216r = gVar2;
        uv5Var.f469217s = bool.booleanValue();
        uv5Var.f469218t = z17;
        this.f264620f = java.lang.System.currentTimeMillis();
        uv5Var.f469213o = gVar;
        if (linkedList != null) {
            linkedList2.addAll(linkedList);
        }
        if (str6 != null) {
            uv5Var.f469214p = str6;
        }
        uv5Var.f469215q = i19;
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = str;
        objArr[1] = str3;
        objArr[2] = java.lang.Integer.valueOf(gVar != null ? gVar.f273689a.length : 0);
        objArr[3] = str6 == null ? "" : str6;
        objArr[4] = java.lang.Integer.valueOf(i19);
        objArr[5] = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSDKOauthAuthorizeConfirm", "do sdk confirm appId=%s, packageName=%s, oauthContextBuffer size=%d, token=%s, authenticationResult=%d, isOption1=%b", objArr);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f264620f = java.lang.System.currentTimeMillis();
        this.f264619e = u0Var;
        return mo9409x10f9447a(sVar, this.f264618d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1346;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f264619e.mo815x76e0bfae(i18, i19, str, this);
        hy4.b.INSTANCE.b(4, (int) (java.lang.System.currentTimeMillis() - this.f264620f), i19);
    }

    public r1(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.LinkedList linkedList, int i18, java.lang.String str4, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.lang.String str5, int i19, boolean z17) {
        this(i17, str, str2, str3, linkedList, i18, str4, gVar, str5, i19, null, java.lang.Boolean.FALSE, z17);
    }
}
