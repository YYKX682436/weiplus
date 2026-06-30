package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class o0 extends com.p314xaae8f345.mm.vfs.k4 implements com.p314xaae8f345.mm.vfs.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.q2 f294633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.C22744x8a210741 f294634e;

    public o0(com.p314xaae8f345.mm.vfs.C22744x8a210741 c22744x8a210741, com.p314xaae8f345.mm.vfs.q2 q2Var) {
        this.f294634e = c22744x8a210741;
        this.f294633d = q2Var;
    }

    @Override // com.p314xaae8f345.mm.vfs.p2
    public java.util.List E() {
        return java.util.Collections.singletonList(this.f294633d);
    }

    /* renamed from: equals */
    public boolean m82442xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof com.p314xaae8f345.mm.vfs.o0) {
            if (this.f294633d.equals(((com.p314xaae8f345.mm.vfs.o0) obj).f294633d)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m82443x8cdac1b() {
        return com.p314xaae8f345.mm.vfs.o0.class.hashCode() ^ this.f294633d.hashCode();
    }

    @Override // com.p314xaae8f345.mm.vfs.k4, com.p314xaae8f345.mm.vfs.q2
    public void q(android.os.CancellationSignal cancellationSignal) {
        com.p314xaae8f345.mm.vfs.q2 q2Var = this.f294633d;
        q2Var.e("", true);
        cancellationSignal.throwIfCanceled();
        q2Var.q(cancellationSignal);
    }

    /* renamed from: toString */
    public java.lang.String m82444x9616526c() {
        return "delete <- " + this.f294633d;
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb y() {
        return this.f294634e;
    }
}
