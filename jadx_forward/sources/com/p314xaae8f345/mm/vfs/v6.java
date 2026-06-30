package com.p314xaae8f345.mm.vfs;

/* loaded from: classes11.dex */
public class v6 implements com.p314xaae8f345.mm.vfs.b8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f294748a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.z2 f294749b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f294750c;

    public v6(int i17, com.p314xaae8f345.mm.vfs.z2 z2Var, java.util.HashSet hashSet) {
        this.f294748a = i17;
        this.f294749b = z2Var;
        this.f294750c = hashSet;
    }

    @Override // com.p314xaae8f345.mm.vfs.b8
    /* renamed from: accept */
    public boolean mo82370xab27b508(java.lang.Object obj) {
        boolean z17;
        com.p314xaae8f345.mm.vfs.x1 x1Var = (com.p314xaae8f345.mm.vfs.x1) obj;
        java.lang.String substring = x1Var.f294764a.substring(this.f294748a);
        if (!substring.startsWith("/")) {
            substring = "/".concat(substring);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.vfs.z2 z2Var = this.f294749b;
        sb6.append(z2Var.f294800b);
        sb6.append(substring);
        java.lang.String sb7 = sb6.toString();
        try {
            z17 = z2Var.f294799a.t(sb7, x1Var.f294770g, x1Var.f294764a);
        } catch (java.io.IOException unused) {
            z17 = false;
        }
        if (z17) {
            this.f294750c.add(sb7);
        }
        return !z17;
    }
}
