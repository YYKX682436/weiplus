package gp;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.media.MediaExtractor f355695a = new android.media.MediaExtractor();

    public boolean a() {
        return this.f355695a.advance();
    }

    public long b() {
        return this.f355695a.getSampleTime();
    }

    public int c() {
        return this.f355695a.getSampleTrackIndex();
    }

    public final int d() {
        return this.f355695a.getTrackCount();
    }

    public android.media.MediaFormat e(int i17) {
        return this.f355695a.getTrackFormat(i17);
    }

    public int f(java.nio.ByteBuffer byteBuffer, int i17) {
        return this.f355695a.readSampleData(byteBuffer, i17);
    }

    public final void g() {
        this.f355695a.release();
    }

    public void h(long j17, int i17) {
        this.f355695a.seekTo(j17, i17);
    }

    public void i(int i17) {
        this.f355695a.selectTrack(i17);
    }

    public final void j(java.io.FileDescriptor fileDescriptor, long j17, long j18) {
        this.f355695a.setDataSource(fileDescriptor, j17, j18);
    }

    public final void k(java.lang.String str) {
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(str, false);
        android.media.MediaExtractor mediaExtractor = this.f355695a;
        if (i17 != null) {
            try {
                mediaExtractor.setDataSource(str, null);
                return;
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w("MicroMsg.VFSMediaExtractor", "Cannot open by path: " + str + ", " + e17.getMessage());
            }
        }
        try {
            android.os.ParcelFileDescriptor z17 = com.p314xaae8f345.mm.vfs.w6.z(com.p314xaae8f345.mm.vfs.z7.a(str), null, "r");
            try {
                mediaExtractor.setDataSource(z17.getFileDescriptor());
                z17.close();
            } finally {
            }
        } catch (java.io.IOException e18) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w("MicroMsg.VFSMediaExtractor", "Cannot open by fd: " + str + ", " + e18.getMessage());
            mediaExtractor.setDataSource(str, null);
        }
    }
}
