package ul3;

/* loaded from: classes7.dex */
public class a implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e {

    /* renamed from: d, reason: collision with root package name */
    public java.nio.ByteBuffer f510128d;

    /* renamed from: e, reason: collision with root package name */
    public long f510129e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f510130f = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f510131g;

    public a(java.nio.ByteBuffer byteBuffer, java.lang.String str) {
        this.f510128d = byteBuffer;
        this.f510131g = str;
    }

    public boolean a() {
        n01.e eVar = dl3.i.s().V;
        return ((java.util.HashSet) ((dl3.j) eVar).f316867a.f316855o).contains(this.f510131g);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f510130f) {
            this.f510128d = null;
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: getAudioType */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType mo94257xaa5357a() {
        return this.f510128d == null ? com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.UNSUPPORT : com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2907x38fb28bd.C25393x11c58fd.m94078xddbe0e37((com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e) this, false);
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: getSize */
    public long mo94260xfb854877() {
        synchronized (this.f510130f) {
            synchronized (dl3.i.s().U) {
                if (this.f510128d == null || !a()) {
                    return -1L;
                }
                return this.f510128d.limit();
            }
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: open */
    public void mo94263x34264a() {
        synchronized (this.f510130f) {
            synchronized (dl3.i.s().U) {
                java.nio.ByteBuffer byteBuffer = this.f510128d;
                if (byteBuffer != null) {
                    byteBuffer.rewind();
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: readAt */
    public int mo94264xc8455469(long j17, byte[] bArr, int i17, int i18) {
        if (this.f510128d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.InputStreamByteBufferDataSource", "buffer is null");
            return -1;
        }
        if (mo94260xfb854877() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.InputStreamByteBufferDataSource", "getSize <= 0");
            return -1;
        }
        if (bArr == null || bArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.InputStreamByteBufferDataSource", "bytes is null");
            return -1;
        }
        if (j17 < 0 || i17 < 0 || i18 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.InputStreamByteBufferDataSource", "position:%d, offset:%d, size:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return -1;
        }
        if (i17 + i18 > bArr.length) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.InputStreamByteBufferDataSource", "offset:%d, size:%d, bytes.length:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(bArr.length));
            return -1;
        }
        if (i18 + j17 > mo94260xfb854877()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.InputStreamByteBufferDataSource", "position:%d, size:%d, getSize():%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(mo94260xfb854877()));
        }
        if (this.f510129e == 0) {
            this.f510129e = mo94260xfb854877();
        }
        long j18 = this.f510129e;
        if (j18 > 0 && j17 > j18 && i18 > 0) {
            return -1;
        }
        synchronized (this.f510130f) {
            synchronized (dl3.i.s().U) {
                if (this.f510128d == null || !a()) {
                    return -1;
                }
                this.f510128d.position((int) j17);
                if (!this.f510128d.hasRemaining()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.InputStreamByteBufferDataSource", "no remaining");
                    return -1;
                }
                int min = java.lang.Math.min(i18, this.f510128d.remaining());
                if (a()) {
                    this.f510128d.get(bArr, i17, min);
                }
                return min;
            }
        }
    }
}
