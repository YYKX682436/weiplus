package c01;

/* loaded from: classes12.dex */
public class ga implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final java.nio.channels.FileChannel f118743d;

    /* renamed from: e, reason: collision with root package name */
    public final java.nio.ByteBuffer f118744e;

    /* renamed from: f, reason: collision with root package name */
    public long f118745f;

    /* renamed from: g, reason: collision with root package name */
    public long f118746g;

    public ga() {
        try {
            java.nio.channels.FileChannel channel = com.p314xaae8f345.mm.vfs.w6.A(new com.p314xaae8f345.mm.vfs.z7(null, null, new java.io.File(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getCacheDir(), "asyncClearMsgStat").getPath(), null, null), true).getChannel();
            this.f118743d = channel;
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(8);
            this.f118744e = allocateDirect;
            channel.read(allocateDirect, 0L);
            if (allocateDirect.remaining() == 8) {
                this.f118745f = allocateDirect.getLong(0);
            }
            allocateDirect.clear();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgInfoStorageLogic", e17, "Cannot init time statistics", new java.lang.Object[0]);
            com.p314xaae8f345.mm.vfs.e8.d(this.f118743d);
            this.f118743d = null;
        }
    }

    public static void b() {
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(new com.p314xaae8f345.mm.vfs.z7(null, null, new java.io.File(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getCacheDir(), "asyncClearMsgStat").getPath(), null, null), null);
        if (m17.a()) {
            m17.f294799a.d(m17.f294800b);
        }
    }

    public void a() {
        if (this.f118746g == 0) {
            return;
        }
        long currentTimeMillis = this.f118745f + (java.lang.System.currentTimeMillis() - this.f118746g);
        this.f118745f = currentTimeMillis;
        java.nio.channels.FileChannel fileChannel = this.f118743d;
        if (fileChannel != null) {
            java.nio.ByteBuffer byteBuffer = this.f118744e;
            byteBuffer.putLong(0, currentTimeMillis);
            try {
                fileChannel.write(byteBuffer, 0L);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorageLogic", "Cannot update time statistics: " + e17.getMessage());
            }
            byteBuffer.clear();
        }
        this.f118746g = 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f118743d.close();
    }
}
