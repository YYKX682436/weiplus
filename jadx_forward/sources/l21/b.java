package l21;

/* loaded from: classes8.dex */
public class b extends java.io.FilterOutputStream {

    /* renamed from: d, reason: collision with root package name */
    public final l21.a f396737d;

    public b(com.p314xaae8f345.mm.vfs.r6 r6Var, long j17) {
        super(com.p314xaae8f345.mm.vfs.w6.I(r6Var.f294699d, r6Var.M(), false));
        this.f396737d = new l21.a(j17);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        l21.a aVar = this.f396737d;
        if (aVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EncEngine", "free mNativePtr: " + aVar.f396736b + " hashcode " + aVar.hashCode());
            com.p314xaae8f345.mm.p1006xc5476f33.p1784xb95d3637.C16115x2e306be6.m65151x30166c(aVar.f396736b);
            aVar.f396736b = 0L;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i17, int i18) {
        l21.a aVar = this.f396737d;
        if (aVar.f396736b == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("transFor ");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EncEngine", sb6.toString());
        }
        long j17 = i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1784xb95d3637.C16115x2e306be6.m65156x4c584101(aVar.f396736b, bArr, aVar.f396735a, j17);
        aVar.f396735a += j17;
        super.write(bArr, i17, i18);
    }
}
