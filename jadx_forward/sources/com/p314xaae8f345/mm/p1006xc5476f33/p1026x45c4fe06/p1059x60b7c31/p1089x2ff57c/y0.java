package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public final class y0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.util.ArrayMap f162675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162676b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cf.d f162677c;

    public y0(android.util.ArrayMap arrayMap, java.lang.String str, cf.d dVar) {
        this.f162675a = arrayMap;
        this.f162676b = str;
        this.f162677c = dVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b3
    public void b(java.lang.String str) {
        java.lang.String str2;
        if (str == null || str.length() == 0) {
            str2 = "fail";
        } else {
            str2 = "fail " + str;
        }
        this.f162675a.put(this.f162676b, str2);
        this.f162677c.a();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b3
    /* renamed from: onSuccess */
    public void mo1150xe05b4124(java.lang.String str) {
        this.f162675a.put(this.f162676b, "ok");
        this.f162677c.a();
    }
}
