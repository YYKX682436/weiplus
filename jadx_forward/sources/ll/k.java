package ll;

/* loaded from: classes13.dex */
public class k extends android.media.MediaDataSource {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e f400641d;

    public k(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e) {
        this.f400641d = interfaceC25439x37e1318e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e = this.f400641d;
        if (interfaceC25439x37e1318e != null) {
            interfaceC25439x37e1318e.close();
            this.f400641d = null;
        }
    }

    @Override // android.media.MediaDataSource
    public long getSize() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e = this.f400641d;
        if (interfaceC25439x37e1318e != null) {
            return interfaceC25439x37e1318e.mo94260xfb854877();
        }
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j17, byte[] bArr, int i17, int i18) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e = this.f400641d;
        if (interfaceC25439x37e1318e != null) {
            return interfaceC25439x37e1318e.mo94264xc8455469(j17, bArr, i17, i18);
        }
        return -1;
    }
}
