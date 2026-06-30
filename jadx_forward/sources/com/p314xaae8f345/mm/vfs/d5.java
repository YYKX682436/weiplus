package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class d5 implements pm5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f294431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.g5 f294432e;

    public d5(com.p314xaae8f345.mm.vfs.g5 g5Var, boolean z17) {
        this.f294432e = g5Var;
        this.f294431d = z17;
    }

    @Override // pm5.j
    public java.lang.Object d(java.lang.Object obj) {
        com.p314xaae8f345.mm.vfs.x1 x1Var = (com.p314xaae8f345.mm.vfs.x1) obj;
        if (this.f294431d && ".ref".equals(x1Var.f294765b)) {
            return null;
        }
        boolean z17 = x1Var.f294769f;
        com.p314xaae8f345.mm.vfs.g5 g5Var = this.f294432e;
        if (!z17) {
            if (x1Var.f294765b.charAt(r0.length() - 1) == 8982) {
                return g5Var.L(x1Var.f294764a.substring(0, r0.length() - 1), x1Var);
            }
        }
        g5Var.getClass();
        return new com.p314xaae8f345.mm.vfs.x1(g5Var, x1Var.f294764a, x1Var.f294765b, x1Var.f294766c, x1Var.f294767d, x1Var.f294768e, x1Var.f294769f);
    }
}
