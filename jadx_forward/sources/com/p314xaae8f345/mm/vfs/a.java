package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public abstract class a implements com.p314xaae8f345.mm.vfs.q2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.w5 f294297d;

    public a() {
        this.f294297d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public long G(java.lang.String str, com.p314xaae8f345.mm.vfs.q2 q2Var, java.lang.String str2, boolean z17) {
        java.nio.channels.WritableByteChannel writableByteChannel;
        java.util.regex.Pattern pattern = com.p314xaae8f345.mm.vfs.e8.f294450a;
        java.nio.channels.WritableByteChannel writableByteChannel2 = null;
        try {
            java.nio.channels.ReadableByteChannel s17 = q2Var.s(str2);
            try {
                java.nio.channels.WritableByteChannel h17 = h(str, false);
                try {
                    java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(8192);
                    allocateDirect.clear();
                    long j17 = 0;
                    while (j17 < com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
                        long j18 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 - j17;
                        if (j18 < allocateDirect.capacity()) {
                            allocateDirect.limit((int) j18);
                        }
                        if (s17.read(allocateDirect) < 0) {
                            break;
                        }
                        allocateDirect.flip();
                        j17 += h17.write(allocateDirect);
                        allocateDirect.clear();
                    }
                    com.p314xaae8f345.mm.vfs.e8.d(s17);
                    com.p314xaae8f345.mm.vfs.e8.d(h17);
                    return j17;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    writableByteChannel2 = h17;
                    writableByteChannel = writableByteChannel2;
                    writableByteChannel2 = s17;
                    com.p314xaae8f345.mm.vfs.e8.d(writableByteChannel2);
                    com.p314xaae8f345.mm.vfs.e8.d(writableByteChannel);
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
            writableByteChannel = null;
        }
    }

    public boolean H(java.lang.String str, com.p314xaae8f345.mm.vfs.q2 q2Var, java.lang.String str2) {
        return false;
    }

    public boolean I(java.lang.String str, com.p314xaae8f345.mm.vfs.q2 q2Var, java.lang.String str2) {
        return true;
    }

    public void J(int i17, java.lang.Object... objArr) {
        java.util.HashMap hashMap;
        com.p314xaae8f345.mm.vfs.w5 w5Var = this.f294297d;
        if (w5Var == null) {
            return;
        }
        if (objArr.length == 0) {
            hashMap = null;
        } else {
            java.util.HashMap hashMap2 = new java.util.HashMap(objArr.length / 2);
            int i18 = 0;
            while (i18 < objArr.length - 1) {
                int i19 = i18 + 1;
                java.lang.Object obj = objArr[i18];
                if (i19 >= objArr.length) {
                    break;
                }
                hashMap2.put(obj.toString(), objArr[i19]);
                i18 = i19 + 1;
            }
            hashMap = hashMap2;
        }
        w5Var.a(this, i17, hashMap);
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public java.nio.channels.WritableByteChannel h(java.lang.String str, boolean z17) {
        return java.nio.channels.Channels.newChannel(c(str, z17));
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public long i(java.lang.String str, com.p314xaae8f345.mm.vfs.q2 q2Var, java.lang.String str2, boolean z17) {
        com.p314xaae8f345.mm.vfs.q2 q17 = com.p314xaae8f345.mm.vfs.e8.q(this, str, 2);
        com.p314xaae8f345.mm.vfs.q2 q18 = com.p314xaae8f345.mm.vfs.e8.q(q2Var, str2, 1);
        if (q17 == null || q18 == null) {
            throw new java.io.IOException("Cannot resolve delegate filesystem.");
        }
        return q17 instanceof com.p314xaae8f345.mm.vfs.a ? ((com.p314xaae8f345.mm.vfs.a) q17).G(str, q18, str2, z17) : q17.i(str, q18, str2, z17);
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public void q(android.os.CancellationSignal cancellationSignal) {
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public java.nio.channels.ReadableByteChannel s(java.lang.String str) {
        return java.nio.channels.Channels.newChannel(a(str));
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public boolean t(java.lang.String str, com.p314xaae8f345.mm.vfs.q2 q2Var, java.lang.String str2) {
        com.p314xaae8f345.mm.vfs.q2 q17 = com.p314xaae8f345.mm.vfs.e8.q(this, str, 2);
        com.p314xaae8f345.mm.vfs.q2 q18 = com.p314xaae8f345.mm.vfs.e8.q(q2Var, str2, 1);
        if (q17 == null || q18 == null) {
            throw new java.io.IOException("Cannot resolve delegate filesystem.");
        }
        if (!(q18 instanceof com.p314xaae8f345.mm.vfs.a) || ((com.p314xaae8f345.mm.vfs.a) q18).I(str2, q17, str)) {
            return q17 instanceof com.p314xaae8f345.mm.vfs.a ? ((com.p314xaae8f345.mm.vfs.a) q17).H(str, q18, str2) : q17.t(str, q18, str2);
        }
        return false;
    }

    /* renamed from: toString */
    public java.lang.String mo82287x9616526c() {
        return "State -> " + y();
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public android.os.ParcelFileDescriptor x(java.lang.String str, java.lang.String str2) {
        throw new java.io.FileNotFoundException("Not supported by the filesystem.");
    }

    public a(com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb, java.util.Map map) {
        if (!(interfaceC22750xe27c22eb instanceof com.p314xaae8f345.mm.vfs.AbstractC22734x1e3d8cad)) {
            this.f294297d = null;
        } else {
            com.p314xaae8f345.mm.vfs.x5 x5Var = ((com.p314xaae8f345.mm.vfs.AbstractC22734x1e3d8cad) interfaceC22750xe27c22eb).f294212d;
            this.f294297d = x5Var != null ? x5Var.b(map) : null;
        }
    }
}
