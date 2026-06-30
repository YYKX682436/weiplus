package kh1;

/* loaded from: classes13.dex */
public abstract class c implements kh1.e {

    /* renamed from: d, reason: collision with root package name */
    public byte[] f389508d;

    /* renamed from: a, reason: collision with root package name */
    public kh1.d f389505a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f389506b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f389507c = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f389509e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f389510f = 0;

    @Override // kh1.e
    public void a(kh1.d dVar) {
        this.f389505a = dVar;
    }

    @Override // kh1.e
    public void b(double d17) {
        this.f389507c = (int) (1024.0d * d17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioEncoder", "setEncodeBuffFrameSize frameKbSize:%b frameByteSize:%d", java.lang.Double.valueOf(d17), java.lang.Integer.valueOf(this.f389507c));
        this.f389508d = new byte[this.f389507c];
    }

    @Override // kh1.e
    public void c(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioEncoder", "mMinBufferSize:%d", java.lang.Integer.valueOf(this.f389506b));
        this.f389506b = i17;
    }

    public void e(byte[] bArr, int i17, boolean z17) {
        if (this.f389505a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.AudioEncoder", "mEncodeListener is null, return");
            return;
        }
        int i18 = this.f389507c;
        if (i18 == 0.0d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.AudioEncoder", "no frameSize, return");
            return;
        }
        if (i17 > i18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Record.AudioEncoder", "buffSize:%d frameSize:%d, buffSize > frameSize ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f389507c));
        }
        int i19 = this.f389509e;
        int i27 = i19 + i17;
        if (i27 >= this.f389507c && bArr != null) {
            if (i27 > this.f389508d.length) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioEncoder", "expand the end codeBuffer:%d", java.lang.Integer.valueOf(i27));
                byte[] bArr2 = this.f389508d;
                byte[] bArr3 = new byte[i27];
                this.f389508d = bArr3;
                java.lang.System.arraycopy(bArr2, 0, bArr3, 0, this.f389509e);
            }
            java.lang.System.arraycopy(bArr, 0, this.f389508d, this.f389509e, i17);
            this.f389505a.a(this.f389508d, i27, false);
            this.f389509e = 0;
        } else if (bArr != null) {
            java.lang.System.arraycopy(bArr, 0, this.f389508d, i19, i17);
            this.f389509e = i27;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioEncoder", "isEnd is true, flush the buffer, bufferedSize:%d", java.lang.Integer.valueOf(this.f389509e));
            this.f389505a.a(this.f389508d, this.f389509e, z17);
            this.f389509e = 0;
        }
        this.f389510f += i17;
    }
}
