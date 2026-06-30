package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f157704a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f157705b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f157706c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f157707d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v f157708e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.t0 f157709f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Collection f157710g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f157711h = new java.util.concurrent.ConcurrentHashMap();

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.c2();
    }

    public f2(java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.t0 t0Var) {
        this.f157704a = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str)).o() + "/";
        this.f157705b = str2;
        this.f157706c = str3;
        this.f157709f = t0Var;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.e2(this, null));
        this.f157710g = java.util.Collections.unmodifiableCollection(linkedList);
    }

    public java.nio.ByteBuffer a(java.lang.String str) {
        if (this.f157708e == null) {
            if (this.f157707d == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.t0 t0Var = this.f157709f;
                if (t0Var != null) {
                    this.f157707d = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.k2) t0Var).f162621a.C0();
                }
                if (this.f157707d == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.LuggageBlobFileObjectManager", "service is null");
                    return null;
                }
            }
            this.f157708e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v) this.f157707d.mo50357xcd94f799().h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v.class);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v vVar = this.f157708e;
        if (vVar != null && vVar.H() != null) {
            return this.f157708e.H().a(str);
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(this.f157708e == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.LuggageBlobFileObjectManager", "getBuffer failed, mBufferAddon == null?: [%b]", objArr);
        return null;
    }
}
