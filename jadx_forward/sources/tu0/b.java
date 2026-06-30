package tu0;

/* loaded from: classes5.dex */
public abstract class b implements tu0.f {

    /* renamed from: d, reason: collision with root package name */
    public byte[] f503611d;

    /* renamed from: a, reason: collision with root package name */
    public tu0.e f503608a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f503609b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f503610c = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f503612e = 0;

    public void a(byte[] bArr, int i17, boolean z17) {
        if (this.f503608a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.AudioEncoder", "mEncodeListener is null, return");
            return;
        }
        int i18 = this.f503610c;
        if (i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.AudioEncoder", "no frameSize, return");
            return;
        }
        if (i17 > i18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Record.AudioEncoder", "buffSize:%d frameSize:%d, buffSize > frameSize ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f503610c));
        }
        this.f503608a.b(bArr, i17, z17);
        int i19 = this.f503612e;
        int i27 = i19 + i17;
        if (i27 >= this.f503610c && bArr != null) {
            if (i27 > this.f503611d.length) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioEncoder", "expand the end codeBuffer:%d", java.lang.Integer.valueOf(i27));
                byte[] bArr2 = this.f503611d;
                byte[] bArr3 = new byte[i27];
                this.f503611d = bArr3;
                java.lang.System.arraycopy(bArr2, 0, bArr3, 0, this.f503612e);
            }
            java.lang.System.arraycopy(bArr, 0, this.f503611d, this.f503612e, i17);
            this.f503608a.a(this.f503611d, i27, false);
            this.f503612e = 0;
        } else if (bArr != null) {
            java.lang.System.arraycopy(bArr, 0, this.f503611d, i19, i17);
            this.f503612e = i27;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioEncoder", "isEnd is true, flush the buffer, bufferedSize:%d", java.lang.Integer.valueOf(this.f503612e));
            this.f503608a.a(this.f503611d, this.f503612e, z17);
            this.f503612e = 0;
        }
    }
}
