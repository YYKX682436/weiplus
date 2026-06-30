package ul3;

/* loaded from: classes7.dex */
public class b implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e {

    /* renamed from: d, reason: collision with root package name */
    public final n01.f f510132d;

    public b(n01.f fVar) {
        this.f510132d = fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i("MicroMsg.Audio.InputStreamDataSource", "close");
        n01.f fVar = this.f510132d;
        if (fVar != null) {
            fVar.close();
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: getAudioType */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType mo94257xaa5357a() {
        n01.f fVar = this.f510132d;
        if (fVar == null) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e("MicroMsg.Audio.InputStreamDataSource", "[getAudioType] unsupport");
            return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.UNSUPPORT;
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i("MicroMsg.Audio.InputStreamDataSource", "getAudioType:" + ((jh1.c) fVar).a());
        int a17 = ((jh1.c) fVar).a();
        if (a17 == 0) {
            return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.UNSUPPORT;
        }
        if (a17 == 1) {
            return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.AAC;
        }
        if (a17 == 2) {
            return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.MP3;
        }
        if (a17 == 3) {
            return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.WAV;
        }
        if (a17 == 4) {
            return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.OGG;
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e("MicroMsg.Audio.InputStreamDataSource", "[getAudioType] unsupport");
        return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.UNSUPPORT;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: getSize */
    public long mo94260xfb854877() {
        n01.f fVar = this.f510132d;
        if (fVar != null) {
            return fVar.mo140932xfb854877();
        }
        return 0L;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: open */
    public void mo94263x34264a() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i("MicroMsg.Audio.InputStreamDataSource", "open");
        n01.f fVar = this.f510132d;
        if (fVar != null) {
            jh1.c cVar = (jh1.c) fVar;
            cVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaAudioDataSource", "open");
            if (cVar.f381334f == null) {
                cVar.f381334f = cVar.b(cVar.f381332d, cVar.f381333e);
            }
            cVar.f381335g = 0L;
            nf.a aVar = cVar.f381334f;
            if (aVar != null) {
                aVar.b(0);
            }
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: readAt */
    public int mo94264xc8455469(long j17, byte[] bArr, int i17, int i18) {
        n01.f fVar = this.f510132d;
        if (fVar != null) {
            return fVar.mo140933xc8455469(j17, bArr, i17, i18);
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e("MicroMsg.Audio.InputStreamDataSource", "[readAt]audioDataSource is null");
        return -1;
    }
}
