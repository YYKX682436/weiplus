package e46;

/* loaded from: classes16.dex */
public class h extends e46.d {

    /* renamed from: a, reason: collision with root package name */
    public final long f330982a;

    /* renamed from: b, reason: collision with root package name */
    public long f330983b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e46.i f330984c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e46.i iVar, long j17, e46.b bVar) {
        super(null);
        this.f330984c = iVar;
        this.f330982a = j17;
    }

    @Override // e46.d
    public int a() {
        long j17 = this.f330982a - this.f330983b;
        r46.a aVar = this.f330984c.f330992f;
        return (int) java.lang.Math.min(j17, (aVar.f474032g + (aVar.f474029d.available() * 8)) / 8);
    }

    @Override // e46.d
    public boolean b() {
        return this.f330983b < this.f330982a;
    }

    @Override // e46.d
    public int c(byte[] bArr, int i17, int i18) {
        int i19;
        int i27 = 0;
        if (i18 == 0) {
            return 0;
        }
        int min = (int) java.lang.Math.min(this.f330982a - this.f330983b, i18);
        while (i27 < min) {
            e46.i iVar = this.f330984c;
            if (iVar.f330992f.f474032g > 0) {
                byte f17 = (byte) iVar.f(8);
                iVar.f330994h.a(f17);
                bArr[i17 + i27] = f17;
                i19 = 1;
            } else {
                int i28 = i17 + i27;
                int read = iVar.f330993g.read(bArr, i28, min - i27);
                if (read == -1) {
                    throw new java.io.EOFException("Truncated Deflate64 Stream");
                }
                e46.e eVar = iVar.f330994h;
                eVar.getClass();
                for (int i29 = i28; i29 < i28 + read; i29++) {
                    eVar.a(bArr[i29]);
                }
                i19 = read;
            }
            this.f330983b += i19;
            i27 += i19;
        }
        return min;
    }

    @Override // e46.d
    public e46.j d() {
        return this.f330983b < this.f330982a ? e46.j.STORED : e46.j.INITIAL;
    }
}
