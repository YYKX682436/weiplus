package c01;

/* loaded from: classes12.dex */
public class ga implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final java.nio.channels.FileChannel f37210d;

    /* renamed from: e, reason: collision with root package name */
    public final java.nio.ByteBuffer f37211e;

    /* renamed from: f, reason: collision with root package name */
    public long f37212f;

    /* renamed from: g, reason: collision with root package name */
    public long f37213g;

    public ga() {
        try {
            java.nio.channels.FileChannel channel = com.tencent.mm.vfs.w6.A(new com.tencent.mm.vfs.z7(null, null, new java.io.File(com.tencent.mm.sdk.platformtools.x2.f193071a.getCacheDir(), "asyncClearMsgStat").getPath(), null, null), true).getChannel();
            this.f37210d = channel;
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(8);
            this.f37211e = allocateDirect;
            channel.read(allocateDirect, 0L);
            if (allocateDirect.remaining() == 8) {
                this.f37212f = allocateDirect.getLong(0);
            }
            allocateDirect.clear();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgInfoStorageLogic", e17, "Cannot init time statistics", new java.lang.Object[0]);
            com.tencent.mm.vfs.e8.d(this.f37210d);
            this.f37210d = null;
        }
    }

    public static void b() {
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(new com.tencent.mm.vfs.z7(null, null, new java.io.File(com.tencent.mm.sdk.platformtools.x2.f193071a.getCacheDir(), "asyncClearMsgStat").getPath(), null, null), null);
        if (m17.a()) {
            m17.f213266a.d(m17.f213267b);
        }
    }

    public void a() {
        if (this.f37213g == 0) {
            return;
        }
        long currentTimeMillis = this.f37212f + (java.lang.System.currentTimeMillis() - this.f37213g);
        this.f37212f = currentTimeMillis;
        java.nio.channels.FileChannel fileChannel = this.f37210d;
        if (fileChannel != null) {
            java.nio.ByteBuffer byteBuffer = this.f37211e;
            byteBuffer.putLong(0, currentTimeMillis);
            try {
                fileChannel.write(byteBuffer, 0L);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgInfoStorageLogic", "Cannot update time statistics: " + e17.getMessage());
            }
            byteBuffer.clear();
        }
        this.f37213g = 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f37210d.close();
    }
}
