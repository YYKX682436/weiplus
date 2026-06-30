package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class r3 extends com.p314xaae8f345.mm.vfs.k4 implements com.p314xaae8f345.mm.vfs.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f294690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.C22752x2dbf4b4c f294691e;

    public r3(com.p314xaae8f345.mm.vfs.C22752x2dbf4b4c c22752x2dbf4b4c, java.util.List list) {
        this.f294691e = c22752x2dbf4b4c;
        this.f294690d = list;
    }

    @Override // com.p314xaae8f345.mm.vfs.p2
    public java.util.List E() {
        return this.f294690d;
    }

    /* renamed from: equals */
    public boolean m82461xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof com.p314xaae8f345.mm.vfs.r3) {
            if (this.f294690d.equals(((com.p314xaae8f345.mm.vfs.r3) obj).f294690d)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m82462x8cdac1b() {
        return com.p314xaae8f345.mm.vfs.r3.class.hashCode() ^ this.f294690d.hashCode();
    }

    @Override // com.p314xaae8f345.mm.vfs.k4, com.p314xaae8f345.mm.vfs.q2
    public void q(android.os.CancellationSignal cancellationSignal) {
        for (com.p314xaae8f345.mm.vfs.q2 q2Var : this.f294690d) {
            cancellationSignal.throwIfCanceled();
            q2Var.q(cancellationSignal);
        }
    }

    /* renamed from: toString */
    public java.lang.String m82463x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(512);
        sb6.append("maintenanceGroup:");
        for (com.p314xaae8f345.mm.vfs.q2 q2Var : this.f294690d) {
            sb6.append("\n  ");
            sb6.append(q2Var);
        }
        return sb6.toString();
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb y() {
        return this.f294691e;
    }
}
