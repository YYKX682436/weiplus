package u7;

/* loaded from: classes13.dex */
public class e extends u7.q {

    /* renamed from: i, reason: collision with root package name */
    public final u7.l f506576i;

    /* renamed from: j, reason: collision with root package name */
    public final v7.b f506577j;

    /* renamed from: k, reason: collision with root package name */
    public u7.b f506578k;

    public e(u7.l lVar, v7.b bVar) {
        super(lVar, bVar);
        this.f506577j = bVar;
        this.f506576i = lVar;
    }

    @Override // u7.q
    public void c(int i17) {
        u7.b bVar = this.f506578k;
        if (bVar != null) {
            java.io.File file = this.f506577j.f515124b;
            java.lang.String str = this.f506576i.f506597c.f506613a;
            u7.j jVar = (u7.j) bVar;
            android.os.Message obtainMessage = jVar.obtainMessage();
            obtainMessage.arg1 = i17;
            obtainMessage.obj = file;
            jVar.sendMessage(obtainMessage);
        }
    }

    public void f(u7.d dVar, java.net.Socket socket) {
        java.lang.String str;
        int read;
        java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(socket.getOutputStream());
        u7.l lVar = this.f506576i;
        synchronized (lVar) {
            if (android.text.TextUtils.isEmpty(lVar.f506597c.f506615c)) {
                lVar.b();
            }
            str = lVar.f506597c.f506615c;
        }
        boolean z17 = !android.text.TextUtils.isEmpty(str);
        long b17 = this.f506577j.e() ? this.f506577j.b() : this.f506576i.c();
        boolean z18 = b17 >= 0;
        boolean z19 = dVar.f506575c;
        long j17 = z19 ? b17 - dVar.f506574b : b17;
        boolean z27 = z18 && z19;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(dVar.f506575c ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n");
        sb6.append("Accept-Ranges: bytes\n");
        sb6.append(z18 ? java.lang.String.format(java.util.Locale.US, "Content-Length: %d\n", java.lang.Long.valueOf(j17)) : "");
        sb6.append(z27 ? java.lang.String.format(java.util.Locale.US, "Content-Range: bytes %d-%d/%d\n", java.lang.Long.valueOf(dVar.f506574b), java.lang.Long.valueOf(b17 - 1), java.lang.Long.valueOf(b17)) : "");
        sb6.append(z17 ? java.lang.String.format(java.util.Locale.US, "Content-Type: %s\n", str) : "");
        sb6.append("\n");
        bufferedOutputStream.write(sb6.toString().getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
        long j18 = dVar.f506574b;
        long c17 = this.f506576i.c();
        if ((((c17 > 0L ? 1 : (c17 == 0L ? 0 : -1)) > 0) && dVar.f506575c && ((float) dVar.f506574b) > ((float) this.f506577j.b()) + (((float) c17) * 0.2f)) ? false : true) {
            byte[] bArr = new byte[8192];
            while (true) {
                if (!(j18 >= 0)) {
                    throw new java.lang.IllegalArgumentException("Data offset must be positive!");
                }
                while (!((v7.b) this.f506606b).e() && ((v7.b) this.f506606b).b() < 8192 + j18 && !this.f506611g) {
                    synchronized (this) {
                        boolean z28 = (this.f506610f == null || this.f506610f.getState() == java.lang.Thread.State.TERMINATED) ? false : true;
                        if (!this.f506611g && !((v7.b) this.f506606b).e() && !z28) {
                            this.f506610f = new java.lang.Thread(new u7.p(this, null), "Source reader for " + this.f506605a);
                            this.f506610f.start();
                        }
                    }
                    synchronized (this.f506607c) {
                        try {
                            this.f506607c.wait(1000L);
                        } catch (java.lang.InterruptedException e17) {
                            throw new u7.r("Waiting source data is interrupted!", e17);
                        }
                    }
                    java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f506609e;
                    int i17 = atomicInteger.get();
                    if (i17 >= 1) {
                        atomicInteger.set(0);
                        throw new u7.r("Error reading source " + i17 + " times");
                    }
                }
                v7.b bVar = (v7.b) this.f506606b;
                synchronized (bVar) {
                    try {
                        bVar.f515125c.seek(j18);
                        read = bVar.f515125c.read(bArr, 0, 8192);
                    } catch (java.io.IOException e18) {
                        throw new u7.r(java.lang.String.format("Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]", 8192, java.lang.Long.valueOf(j18), java.lang.Long.valueOf(bVar.b()), 8192), e18);
                    }
                }
                if (((v7.b) this.f506606b).e() && this.f506612h != 100) {
                    this.f506612h = 100;
                    c(100);
                }
                if (read == -1) {
                    bufferedOutputStream.flush();
                    return;
                } else {
                    bufferedOutputStream.write(bArr, 0, read);
                    j18 += read;
                }
            }
        } else {
            u7.l lVar2 = new u7.l(this.f506576i);
            try {
                lVar2.d((int) j18);
                byte[] bArr2 = new byte[8192];
                while (true) {
                    int f17 = lVar2.f(bArr2);
                    if (f17 == -1) {
                        bufferedOutputStream.flush();
                        return;
                    }
                    bufferedOutputStream.write(bArr2, 0, f17);
                }
            } finally {
                lVar2.a();
            }
        }
    }
}
