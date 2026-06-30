package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class ea implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f282000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282001e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f282002f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f282003g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x72.b f282004h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.la f282005i;

    public ea(com.p314xaae8f345.mm.ui.p2650x55bb7a46.la laVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, java.util.HashSet hashSet, java.lang.Object obj, x72.b bVar) {
        this.f282005i = laVar;
        this.f282000d = f9Var;
        this.f282001e = str;
        this.f282002f = hashSet;
        this.f282003g = obj;
        this.f282004h = bVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        boolean z18;
        java.lang.String str2 = this.f282001e;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f282000d;
        boolean z19 = true;
        if (i17 == 0 && hVar != null && hVar.f69553xb5f54fe9 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavMsgHandle", "oreh downloadTpUrl done msgId:%d, mediaId:%s, path:%s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), str, str2);
            z18 = true;
        } else {
            z18 = false;
        }
        if (i17 == 0 && (hVar == null || hVar.f69553xb5f54fe9 == 0)) {
            z19 = z18;
        } else {
            java.lang.Object[] objArr = new java.lang.Object[5];
            objArr[0] = java.lang.Long.valueOf(f9Var.m124847x74d37ac6());
            objArr[1] = str;
            objArr[2] = str2;
            objArr[3] = java.lang.Integer.valueOf(i17);
            objArr[4] = java.lang.Integer.valueOf(hVar == null ? 0 : hVar.f69553xb5f54fe9);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavMsgHandle", "oreh downloadTpUrl error msgId:%d, mediaId:%s, path:%s, err:(%d,%d)", objArr);
        }
        if (!z19) {
            return 0;
        }
        java.util.HashSet hashSet = this.f282002f;
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.da(this));
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
