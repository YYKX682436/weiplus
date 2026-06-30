package ye3;

/* loaded from: classes15.dex */
public class k implements qh3.a {

    /* renamed from: a, reason: collision with root package name */
    public final wh3.b f542755a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f542756b;

    /* renamed from: c, reason: collision with root package name */
    public ye3.n f542757c;

    public k(wh3.b mediaSource, java.lang.String playMediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaSource, "mediaSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playMediaId, "playMediaId");
        this.f542755a = mediaSource;
        this.f542756b = playMediaId;
        ye3.n a17 = ye3.m.f542759a.a(mediaSource.f527498a, false);
        java.lang.String value = mediaSource.f527499b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        a17.f69016x4b6e88aa = value;
        this.f542757c = a17;
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(a17.t0());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "create MBExternalVideoFileStateCache, cache:" + this.f542757c + " path:" + this.f542757c.t0() + ", exists:" + j17);
        int i17 = this.f542757c.f69013x29d3a50c;
        if (i17 == -2 || i17 == -1 || i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "resetMediaCache");
            i(1);
        } else if (i17 == 2 && !j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "resetMediaCache");
            i(1);
        }
    }

    @Override // qh3.a
    public boolean a() {
        ye3.n nVar = this.f542757c;
        return nVar.f69014x78351860 > 0 && nVar.f69004x799e9d9e > 0 && nVar.f69013x29d3a50c == 2;
    }

    @Override // qh3.a
    public long b() {
        return this.f542757c.f69004x799e9d9e;
    }

    @Override // qh3.a
    public long c() {
        return this.f542757c.f69014x78351860;
    }

    @Override // qh3.a
    public void d(java.lang.String fileFormat) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileFormat, "fileFormat");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "updateFileFormat fileFormat:".concat(fileFormat));
        ye3.m mVar = ye3.m.f542759a;
        java.lang.String str = this.f542756b;
        ye3.n a17 = mVar.a(str, false);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17.f69012x42ba17f7, fileFormat)) {
            a17.f69012x42ba17f7 = fileFormat;
        }
        mVar.b(a17, "MBVideoFileStateCache.updateCache");
        this.f542757c = mVar.a(str, false);
    }

    @Override // qh3.a
    public boolean e() {
        return this.f542757c.f69011x84465715;
    }

    @Override // qh3.a
    public void f(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "markStateError retCode:" + i17);
        i(-1);
    }

    @Override // qh3.a
    public void g(long j17, long j18, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "updateProgressMemory cacheSize:" + j17 + " totalSize:" + j18 + " state:" + i17);
        ye3.m mVar = ye3.m.f542759a;
        java.lang.String str = this.f542756b;
        ye3.n a17 = mVar.a(str, false);
        a17.f69004x799e9d9e = j17;
        a17.f69014x78351860 = j18;
        a17.f69013x29d3a50c = i17;
        mVar.b(a17, "MBVideoFileStateCache.updateCache");
        this.f542757c = mVar.a(str, false);
    }

    @Override // qh3.a
    /* renamed from: getFilePath */
    public java.lang.String mo53277x5000ed37() {
        return this.f542757c.t0();
    }

    @Override // qh3.a
    public void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "updateMoovReady");
        ye3.m mVar = ye3.m.f542759a;
        java.lang.String str = this.f542756b;
        ye3.n a17 = mVar.a(str, false);
        a17.f69011x84465715 = true;
        mVar.b(a17, "MBVideoFileStateCache.updateCache");
        this.f542757c = mVar.a(str, false);
    }

    public final void i(int i17) {
        ye3.m mVar = ye3.m.f542759a;
        java.lang.String url = this.f542755a.f527499b;
        ye3.n nVar = this.f542757c;
        int i18 = nVar.f69005xc56863e8;
        java.lang.String str = nVar.f69012x42ba17f7;
        if (str == null) {
            str = "";
        }
        int i19 = nVar.f69006xa7075739;
        java.lang.String mediaId = this.f542756b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (mediaId.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MB_External_surface_DB", "[store] mediaId is isNullOrEmpty, skip");
        } else {
            ye3.n a17 = mVar.a(mediaId, false);
            a17.f69010xaca5bdda = mediaId;
            a17.f69016x4b6e88aa = url;
            a17.f69012x42ba17f7 = str;
            a17.f69005xc56863e8 = i18;
            a17.f69007xc0e4813d = 0;
            a17.f69004x799e9d9e = 0L;
            a17.f69014x78351860 = 0L;
            a17.f69013x29d3a50c = i17;
            a17.f69006xa7075739 = i19;
            mVar.b(a17, "store");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[store] success. mediaId:");
            sb6.append(mediaId);
            sb6.append(" state:");
            sb6.append(i17);
            sb6.append(" progress=");
            long j17 = a17.f69014x78351860;
            sb6.append(j17 <= 0 ? 0 : (int) ((((float) a17.f69004x799e9d9e) / ((float) j17)) * 100));
            sb6.append('%');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", sb6.toString());
        }
        this.f542757c = mVar.a(mediaId, false);
    }
}
