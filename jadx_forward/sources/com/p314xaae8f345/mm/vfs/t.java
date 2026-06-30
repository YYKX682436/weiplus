package com.p314xaae8f345.mm.vfs;

/* loaded from: classes4.dex */
public class t extends com.p314xaae8f345.mm.vfs.p1 implements android.os.Handler.Callback {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f294708i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.HashMap f294709m;

    /* renamed from: n, reason: collision with root package name */
    public final android.os.Handler f294710n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.C22740xea8e1d93 f294711o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.p314xaae8f345.mm.vfs.C22740xea8e1d93 c22740xea8e1d93, com.p314xaae8f345.mm.vfs.q2 q2Var, java.util.Map map) {
        super(c22740xea8e1d93, q2Var, c22740xea8e1d93.f294229i, map);
        this.f294711o = c22740xea8e1d93;
        this.f294708i = new java.lang.Object();
        if (c22740xea8e1d93.f294230m) {
            this.f294709m = new java.util.HashMap();
            this.f294710n = new android.os.Handler(com.p314xaae8f345.mm.vfs.a3.f294314a.f294357r.getLooper(), this);
        } else {
            this.f294709m = null;
            this.f294710n = null;
        }
    }

    public final void O(java.lang.String str, boolean z17) {
        boolean isEmpty;
        if (this.f294711o.f294230m) {
            if (z17) {
                synchronized (this.f294708i) {
                    this.f294709m.remove(str);
                }
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            synchronized (this.f294708i) {
                isEmpty = this.f294709m.isEmpty();
                this.f294709m.put(str, java.lang.Long.valueOf(currentTimeMillis));
            }
            if (isEmpty) {
                this.f294710n.sendMessageDelayed(android.os.Message.obtain(), 60000L);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.vfs.m0, com.p314xaae8f345.mm.vfs.q2
    public java.io.InputStream a(java.lang.String str) {
        java.io.InputStream a17 = this.f294653e.a(str);
        O(str, false);
        return a17;
    }

    @Override // com.p314xaae8f345.mm.vfs.m0, com.p314xaae8f345.mm.vfs.q2
    public java.io.OutputStream c(java.lang.String str, boolean z17) {
        java.io.OutputStream c17 = this.f294653e.c(str, z17);
        O(str, true);
        return c17;
    }

    @Override // com.p314xaae8f345.mm.vfs.m0, com.p314xaae8f345.mm.vfs.a, com.p314xaae8f345.mm.vfs.q2
    public java.nio.channels.WritableByteChannel h(java.lang.String str, boolean z17) {
        java.nio.channels.WritableByteChannel h17 = this.f294653e.h(str, z17);
        O(str, true);
        return h17;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        java.util.HashMap hashMap;
        synchronized (this.f294708i) {
            if (this.f294709m.isEmpty()) {
                hashMap = null;
            } else {
                hashMap = this.f294709m;
                this.f294709m = new java.util.HashMap();
            }
        }
        if (hashMap == null) {
            return true;
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            this.f294653e.n((java.lang.String) entry.getKey(), ((java.lang.Long) entry.getValue()).longValue());
        }
        hashMap.size();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0729 A[LOOP:3: B:120:0x0723->B:122:0x0729, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x05b5  */
    @Override // com.p314xaae8f345.mm.vfs.p1, com.p314xaae8f345.mm.vfs.m0, com.p314xaae8f345.mm.vfs.a, com.p314xaae8f345.mm.vfs.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(android.os.CancellationSignal r76) {
        /*
            Method dump skipped, instructions count: 1847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.vfs.t.q(android.os.CancellationSignal):void");
    }

    @Override // com.p314xaae8f345.mm.vfs.m0, com.p314xaae8f345.mm.vfs.a, com.p314xaae8f345.mm.vfs.q2
    public java.nio.channels.ReadableByteChannel s(java.lang.String str) {
        java.nio.channels.ReadableByteChannel s17 = this.f294653e.s(str);
        O(str, false);
        return s17;
    }

    @Override // com.p314xaae8f345.mm.vfs.m0, com.p314xaae8f345.mm.vfs.a, com.p314xaae8f345.mm.vfs.q2
    public android.os.ParcelFileDescriptor x(java.lang.String str, java.lang.String str2) {
        android.os.ParcelFileDescriptor x17 = this.f294653e.x(str, str2);
        O(str, str2.contains("w"));
        return x17;
    }
}
