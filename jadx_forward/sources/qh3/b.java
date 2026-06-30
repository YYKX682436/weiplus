package qh3;

/* loaded from: classes15.dex */
public class b implements qh3.a {

    /* renamed from: a, reason: collision with root package name */
    public final rh3.p f444978a;

    /* renamed from: b, reason: collision with root package name */
    public final wh3.b f444979b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f444980c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f444981d;

    /* renamed from: e, reason: collision with root package name */
    public yz0.a f444982e;

    public b(rh3.p onePlayContext, wh3.b mediaSource, java.lang.String originMediaId, java.lang.String playMediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onePlayContext, "onePlayContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaSource, "mediaSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originMediaId, "originMediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playMediaId, "playMediaId");
        this.f444978a = onePlayContext;
        this.f444979b = mediaSource;
        this.f444980c = originMediaId;
        this.f444981d = playMediaId;
        yz0.a a17 = xz0.b.f539704a.a(mediaSource.f527498a, false);
        java.lang.String value = mediaSource.f527499b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        a17.f69140x4b6e88aa = value;
        this.f444982e = a17;
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(a17.t0());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i(), "create ResourceLoaderProxy, cache:" + this.f444982e + " mediaCache path:" + this.f444982e.t0() + ", exists:" + j17 + ' ');
        int i17 = this.f444982e.f69137x29d3a50c;
        if (i17 == -2 || i17 == -1 || i17 == 0) {
            j();
        } else if ((i17 == 2 || i17 == 3) && !j17) {
            j();
        }
    }

    @Override // qh3.a
    public boolean a() {
        yz0.a aVar = this.f444982e;
        return aVar.f69138x78351860 > 0 && aVar.f69125x799e9d9e > 0 && aVar.f69137x29d3a50c == 3;
    }

    @Override // qh3.a
    public long b() {
        return this.f444982e.f69125x799e9d9e;
    }

    @Override // qh3.a
    public long c() {
        return this.f444982e.f69138x78351860;
    }

    @Override // qh3.a
    public void d(java.lang.String fileFormat) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileFormat, "fileFormat");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i(), "updateFileFormat fileFormat:".concat(fileFormat));
        yz0.a a17 = xz0.b.f539704a.a(this.f444981d, false);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17.f69136x42ba17f7, fileFormat)) {
            a17.f69136x42ba17f7 = fileFormat;
        }
        k();
    }

    @Override // qh3.a
    public boolean e() {
        return this.f444982e.f69133x84465715;
    }

    @Override // qh3.a
    public void f(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i(), "markStateError retCode:" + i17);
        xz0.b bVar = xz0.b.f539704a;
        yz0.a a17 = bVar.a(this.f444981d, false);
        a17.f69125x799e9d9e = a17.f69125x799e9d9e;
        a17.f69138x78351860 = a17.f69138x78351860;
        a17.f69137x29d3a50c = a17.f69137x29d3a50c;
        java.lang.String str = this.f444981d;
        java.lang.String str2 = this.f444980c;
        java.lang.String str3 = this.f444979b.f527499b;
        int i18 = a17.f69126xc56863e8;
        java.lang.String str4 = a17.f69136x42ba17f7;
        if (str4 == null) {
            str4 = "";
        }
        bVar.c(str, str2, str3, i18, str4, 0, 0L, 0L, -1, a17.f69128xa7075739, "", "");
        k();
    }

    @Override // qh3.a
    public void g(long j17, long j18, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i(), "updateProgressMemory cacheSize:" + j17 + " totalSize:" + j18 + " state:" + i17);
        yz0.a a17 = xz0.b.f539704a.a(this.f444981d, false);
        a17.f69125x799e9d9e = j17;
        a17.f69138x78351860 = j18;
        a17.f69137x29d3a50c = i17;
        k();
    }

    @Override // qh3.a
    /* renamed from: getFilePath */
    public java.lang.String mo53277x5000ed37() {
        return this.f444982e.t0();
    }

    @Override // qh3.a
    public void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i(), "updateMoovReady");
        xz0.b.f539704a.a(this.f444981d, false).f69133x84465715 = true;
        k();
    }

    public final java.lang.String i() {
        return ((rh3.q) this.f444978a).f("FVFDbCache");
    }

    public final void j() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i(), "resetMediaCache");
        xz0.b bVar = xz0.b.f539704a;
        yz0.a a17 = bVar.a(this.f444981d, false);
        a17.f69125x799e9d9e = a17.f69125x799e9d9e;
        a17.f69138x78351860 = a17.f69138x78351860;
        a17.f69137x29d3a50c = a17.f69137x29d3a50c;
        java.lang.String str = this.f444981d;
        java.lang.String str2 = this.f444980c;
        java.lang.String str3 = this.f444979b.f527499b;
        int i17 = a17.f69126xc56863e8;
        java.lang.String str4 = a17.f69136x42ba17f7;
        if (str4 == null) {
            str4 = "";
        }
        bVar.c(str, str2, str3, i17, str4, 0, 0L, 0L, 1, a17.f69128xa7075739, "", "");
        k();
    }

    public final void k() {
        this.f444982e = xz0.b.f539704a.a(this.f444981d, false);
    }
}
