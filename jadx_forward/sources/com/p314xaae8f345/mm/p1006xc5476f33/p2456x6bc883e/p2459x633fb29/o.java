package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29;

/* loaded from: classes8.dex */
public class o {

    /* renamed from: g, reason: collision with root package name */
    public static final java.nio.ByteOrder f269978g = java.nio.ByteOrder.BIG_ENDIAN;

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.r6 f269979a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f269980b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f269981c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f269982d = 0;

    /* renamed from: e, reason: collision with root package name */
    public volatile r45.l87 f269983e = null;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.util.LinkedList f269984f = null;

    public o(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        boolean z17 = false;
        this.f269980b = false;
        java.nio.channels.FileChannel fileChannel = null;
        this.f269979a = r6Var;
        try {
            fileChannel = com.p314xaae8f345.mm.vfs.w6.B(r6Var.u(), false).getChannel();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Wepkg.WePkgReader", "openfile failed, " + e17.getMessage());
        }
        if (fileChannel != null) {
            try {
                try {
                    fileChannel.position(0L);
                    java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(4);
                    allocateDirect.order(f269978g);
                    fileChannel.read(allocateDirect);
                    this.f269981c = allocateDirect.getInt(0);
                    z17 = b(fileChannel);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Wepkg.WePkgReader", "parseHeader error, " + e18.getMessage());
                }
            } finally {
                a(fileChannel);
            }
        }
        this.f269980b = z17;
    }

    public final void a(java.nio.channels.FileChannel fileChannel) {
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public final boolean b(java.nio.channels.FileChannel fileChannel) {
        if (this.f269981c <= 0) {
            return false;
        }
        try {
            fileChannel.position(4);
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(this.f269981c);
            allocateDirect.order(f269978g);
            fileChannel.read(allocateDirect);
            byte[] a17 = ik1.f.a(allocateDirect);
            if (a17 != null && a17.length != 0) {
                this.f269983e = new r45.l87();
                this.f269983e.mo11468x92b714fd(a17);
                this.f269984f = this.f269983e.f460771d;
                java.lang.String str = this.f269983e.f460772e;
                java.lang.String str2 = this.f269983e.f460773f;
                this.f269982d = 4 + this.f269981c;
                return true;
            }
            return false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Wepkg.WePkgReader", "dealProtoData error, " + e17.getMessage());
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x001e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.LinkedList c() {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o.c():java.util.LinkedList");
    }

    public java.lang.String d(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f269984f) || this.f269982d < 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Wepkg.WePkgReader", "getTargetFile, mFileIndexList is null");
            return null;
        }
        java.util.Iterator it = this.f269984f.iterator();
        while (true) {
            if (!it.hasNext()) {
                return "";
            }
            r45.ps0 ps0Var = (r45.ps0) it.next();
            if ((str != null ? str : "").equals(ps0Var.f464900d) && !e(ps0Var.f464903g)) {
                try {
                    byte[] b17 = ik1.f.b(new a05.b(this.f269979a, this.f269982d + ps0Var.f464901e, ps0Var.f464902f));
                    return "utf8".equals(str2) ? new java.lang.String(b17, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c) : android.util.Base64.encodeToString(b17, 2);
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Wepkg.WePkgReader", "getTargetFile: " + e17.getMessage());
                } catch (java.lang.OutOfMemoryError e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Wepkg.WePkgReader", "getTargetFile: " + e18.getMessage());
                }
            }
        }
    }

    public final boolean e(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        return str.startsWith("video/") || str.startsWith("audio/");
    }
}
