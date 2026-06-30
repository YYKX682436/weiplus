package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class u4 extends com.p314xaae8f345.mm.vfs.m0 implements android.os.Handler.Callback {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.q2 f294732e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f294733f;

    /* renamed from: g, reason: collision with root package name */
    public final long f294734g;

    /* renamed from: h, reason: collision with root package name */
    public final long f294735h;

    /* renamed from: i, reason: collision with root package name */
    public final long f294736i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f294737m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Object f294738n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.HashMap f294739o;

    /* renamed from: p, reason: collision with root package name */
    public final android.os.Handler f294740p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.C22761xdd3c6343 f294741q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(com.p314xaae8f345.mm.vfs.C22761xdd3c6343 c22761xdd3c6343, com.p314xaae8f345.mm.vfs.q2 q2Var, long j17, long j18, long j19, boolean z17, java.util.Map map) {
        super(c22761xdd3c6343, map);
        this.f294741q = c22761xdd3c6343;
        this.f294738n = new java.lang.Object();
        this.f294732e = q2Var;
        this.f294733f = java.util.Collections.singletonList(q2Var);
        this.f294734g = j17;
        this.f294735h = j18;
        this.f294736i = j19;
        this.f294737m = z17;
        if (z17) {
            this.f294739o = new java.util.HashMap();
            this.f294740p = new android.os.Handler(com.p314xaae8f345.mm.vfs.a3.f294314a.f294357r.getLooper(), this);
        } else {
            this.f294739o = null;
            this.f294740p = null;
        }
    }

    @Override // com.p314xaae8f345.mm.vfs.m0
    public java.util.List K() {
        return this.f294733f;
    }

    @Override // com.p314xaae8f345.mm.vfs.m0
    public com.p314xaae8f345.mm.vfs.q2 L(java.lang.String str, int i17) {
        return this.f294732e;
    }

    public final void O(java.lang.String str, boolean z17) {
        boolean isEmpty;
        if (this.f294737m) {
            if (z17) {
                synchronized (this.f294738n) {
                    this.f294739o.remove(str);
                }
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            synchronized (this.f294738n) {
                isEmpty = this.f294739o.isEmpty();
                this.f294739o.put(str, java.lang.Long.valueOf(currentTimeMillis));
            }
            if (isEmpty) {
                this.f294740p.sendMessageDelayed(android.os.Message.obtain(), 60000L);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.vfs.m0, com.p314xaae8f345.mm.vfs.q2
    public java.io.InputStream a(java.lang.String str) {
        java.io.InputStream a17 = this.f294732e.a(str);
        O(str, false);
        return a17;
    }

    @Override // com.p314xaae8f345.mm.vfs.m0, com.p314xaae8f345.mm.vfs.q2
    public java.io.OutputStream c(java.lang.String str, boolean z17) {
        java.io.OutputStream c17 = this.f294732e.c(str, z17);
        O(str, true);
        return c17;
    }

    /* renamed from: equals */
    public boolean m82479xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.mm.vfs.u4)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.u4 u4Var = (com.p314xaae8f345.mm.vfs.u4) obj;
        return this.f294732e.equals(u4Var.f294732e) && this.f294734g == u4Var.f294734g && this.f294736i == u4Var.f294736i && this.f294735h == u4Var.f294735h && this.f294737m == u4Var.f294737m;
    }

    @Override // com.p314xaae8f345.mm.vfs.m0, com.p314xaae8f345.mm.vfs.a, com.p314xaae8f345.mm.vfs.q2
    public java.nio.channels.WritableByteChannel h(java.lang.String str, boolean z17) {
        java.nio.channels.WritableByteChannel h17 = this.f294732e.h(str, z17);
        O(str, true);
        return h17;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        java.util.HashMap hashMap;
        synchronized (this.f294738n) {
            if (this.f294739o.isEmpty()) {
                hashMap = null;
            } else {
                hashMap = this.f294739o;
                this.f294739o = new java.util.HashMap();
            }
        }
        if (hashMap == null) {
            return true;
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            this.f294732e.n((java.lang.String) entry.getKey(), ((java.lang.Long) entry.getValue()).longValue());
        }
        hashMap.size();
        return true;
    }

    /* renamed from: hashCode */
    public int m82480x8cdac1b() {
        int hashCode = com.p314xaae8f345.mm.vfs.u4.class.hashCode();
        java.lang.Object[] objArr = {this.f294732e, java.lang.Long.valueOf(this.f294734g), java.lang.Long.valueOf(this.f294735h), java.lang.Boolean.valueOf(this.f294737m)};
        java.util.regex.Pattern pattern = com.p314xaae8f345.mm.vfs.e8.f294450a;
        return hashCode ^ java.util.Arrays.deepHashCode(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x034e  */
    @Override // com.p314xaae8f345.mm.vfs.m0, com.p314xaae8f345.mm.vfs.a, com.p314xaae8f345.mm.vfs.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(android.os.CancellationSignal r23) {
        /*
            Method dump skipped, instructions count: 881
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.vfs.u4.q(android.os.CancellationSignal):void");
    }

    @Override // com.p314xaae8f345.mm.vfs.m0, com.p314xaae8f345.mm.vfs.a, com.p314xaae8f345.mm.vfs.q2
    public java.nio.channels.ReadableByteChannel s(java.lang.String str) {
        java.nio.channels.ReadableByteChannel s17 = this.f294732e.s(str);
        O(str, false);
        return s17;
    }

    @Override // com.p314xaae8f345.mm.vfs.a
    /* renamed from: toString */
    public java.lang.String mo82287x9616526c() {
        return "quota(" + com.p314xaae8f345.mm.vfs.e8.g(this.f294734g) + " / " + com.p314xaae8f345.mm.vfs.e8.g(this.f294735h) + ") <- " + this.f294732e;
    }

    @Override // com.p314xaae8f345.mm.vfs.m0, com.p314xaae8f345.mm.vfs.a, com.p314xaae8f345.mm.vfs.q2
    public android.os.ParcelFileDescriptor x(java.lang.String str, java.lang.String str2) {
        android.os.ParcelFileDescriptor x17 = this.f294732e.x(str, str2);
        O(str, str2.contains("w"));
        return x17;
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb y() {
        return this.f294741q;
    }
}
