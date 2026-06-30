package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzjr */
/* loaded from: classes16.dex */
public class C2331x394c88 implements com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde {

    /* renamed from: zzacw */
    private com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 f6989x6f02155;

    /* renamed from: zzaqa */
    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2241x394c1f f6990x6f022f1;

    /* renamed from: zzaqb */
    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2220x394c05 f6991x6f022f2;

    /* renamed from: zzaqc */
    private com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2192x394be4 f6992x6f022f3;

    /* renamed from: zzaqd */
    private com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2225x394c0a f6993x6f022f4;

    /* renamed from: zzaqe */
    private com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2327x394c84 f6994x6f022f5;

    /* renamed from: zzaqf */
    private com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2185x394bdd f6995x6f022f6;

    /* renamed from: zzaqg */
    private boolean f6996x6f022f7;

    /* renamed from: zzaqh */
    private long f6997x6f022f8;

    /* renamed from: zzaqi */
    private java.util.List<java.lang.Runnable> f6998x6f022f9;

    /* renamed from: zzaqj */
    private int f6999x6f022fa;

    /* renamed from: zzaqk */
    private int f7000x6f022fb;

    /* renamed from: zzaql */
    private boolean f7001x6f022fc;

    /* renamed from: zzaqm */
    private boolean f7002x6f022fd;

    /* renamed from: zzaqn */
    private boolean f7003x6f022fe;

    /* renamed from: zzaqo */
    private java.nio.channels.FileLock f7004x6f022ff;

    /* renamed from: zzaqp */
    private java.nio.channels.FileChannel f7005x6f02300;

    /* renamed from: zzaqq */
    private java.util.List<java.lang.Long> f7006x6f02301;

    /* renamed from: zzaqr */
    private java.util.List<java.lang.Long> f7007x6f02302;

    /* renamed from: zzaqs */
    long f7008x6f02303;

    /* renamed from: zzvo */
    private boolean f7009x394df9 = false;

    private final int zza(java.nio.channels.FileChannel fileChannel) {
        mo19164x394b61();
        if (fileChannel == null || !fileChannel.isOpen()) {
            mo18976x394c1e().m19108x394c64().log("Bad channel to read from");
            return 0;
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
        try {
            fileChannel.position(0L);
            int read = fileChannel.read(allocate);
            if (read == 4) {
                allocate.flip();
                return allocate.getInt();
            }
            if (read != -1) {
                mo18976x394c1e().m19111x394c67().zzg("Unexpected data length. Bytes read", java.lang.Integer.valueOf(read));
            }
            return 0;
        } catch (java.io.IOException e17) {
            mo18976x394c1e().m19108x394c64().zzg("Failed to read from channel", e17);
            return 0;
        }
    }

    private final void zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2182x394bd5 c2182x394bd5) {
        x.b bVar;
        mo19164x394b61();
        if (android.text.TextUtils.isEmpty(c2182x394bd5.m18980x9061da68())) {
            zzb(c2182x394bd5.m18986x394b67(), 204, null, null, null);
            return;
        }
        java.lang.String m18980x9061da68 = c2182x394bd5.m18980x9061da68();
        java.lang.String m18979x4b6169db = c2182x394bd5.m18979x4b6169db();
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        android.net.Uri.Builder encodedAuthority = builder.scheme(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2206x394bf2.f6544x6f021c7.get()).encodedAuthority(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2206x394bf2.f6545x6f021c8.get());
        java.lang.String valueOf = java.lang.String.valueOf(m18980x9061da68);
        encodedAuthority.path(valueOf.length() != 0 ? "config/app/".concat(valueOf) : new java.lang.String("config/app/")).appendQueryParameter("app_instance_id", m18979x4b6169db).appendQueryParameter("platform", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f).appendQueryParameter("gmp_version", "12451");
        java.lang.String uri = builder.build().toString();
        try {
            java.net.URL url = new java.net.URL(uri);
            mo18976x394c1e().m19115x394c6b().zzg("Fetching remote configuration", c2182x394bd5.m18986x394b67());
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2350x394ca0 m19148x394b93 = m19258x394ca2().m19148x394b93(c2182x394bd5.m18986x394b67());
            java.lang.String m19149x394b94 = m19258x394ca2().m19149x394b94(c2182x394bd5.m18986x394b67());
            if (m19148x394b93 == null || android.text.TextUtils.isEmpty(m19149x394b94)) {
                bVar = null;
            } else {
                bVar = new x.b();
                bVar.put("If-Modified-Since", m19149x394b94);
            }
            this.f7001x6f022fc = true;
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2220x394c05 m19270x394ca3 = m19270x394ca3();
            java.lang.String m18986x394b67 = c2182x394bd5.m18986x394b67();
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2333x394c8a c2333x394c8a = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2333x394c8a(this);
            m19270x394ca3.mo18961x394b61();
            m19270x394ca3.m19257x394ba5();
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(url);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2333x394c8a);
            m19270x394ca3.mo18975x394c1d().zzd(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2224x394c09(m19270x394ca3, m18986x394b67, url, null, bVar, c2333x394c8a));
        } catch (java.net.MalformedURLException unused) {
            mo18976x394c1e().m19108x394c64().zze("Failed to parse config URL. Not fetching. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(c2182x394bd5.m18986x394b67()), uri);
        }
    }

    private final java.lang.Boolean zzc(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2182x394bd5 c2182x394bd5) {
        try {
            if (c2182x394bd5.m18998x394c26() != -2147483648L) {
                if (c2182x394bd5.m18998x394c26() == com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p220x84170e40.C2020x87f17260.m18642x2e2c3887(mo18960x76847179()).m18639xffec0de(c2182x394bd5.m18986x394b67(), 0).versionCode) {
                    return java.lang.Boolean.TRUE;
                }
            } else {
                java.lang.String str = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p220x84170e40.C2020x87f17260.m18642x2e2c3887(mo18960x76847179()).m18639xffec0de(c2182x394bd5.m18986x394b67(), 0).versionName;
                if (c2182x394bd5.m18985x394b66() != null && c2182x394bd5.m18985x394b66().equals(str)) {
                    return java.lang.Boolean.TRUE;
                }
            }
            return java.lang.Boolean.FALSE;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2182x394bd5 zzg(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 r8) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2331x394c88.zzg(com.google.android.gms.internal.measurement.zzdz):com.google.android.gms.internal.measurement.zzdy");
    }

    /* renamed from: zzkm */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2241x394c1f m19258x394ca2() {
        zza(this.f6990x6f022f1);
        return this.f6990x6f022f1;
    }

    /* renamed from: zzko */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2225x394c0a m19259x394ca4() {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2225x394c0a c2225x394c0a = this.f6993x6f022f4;
        if (c2225x394c0a != null) {
            return c2225x394c0a;
        }
        throw new java.lang.IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: zzkp */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2327x394c84 m19260x394ca5() {
        zza(this.f6994x6f022f5);
        return this.f6994x6f022f5;
    }

    /* renamed from: zzkr */
    private final long m19261x394ca7() {
        long mo18536x5cbba1cc = mo18962x394b92().mo18536x5cbba1cc();
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2227x394c0c mo19175x394c1f = mo19175x394c1f();
        mo19175x394c1f.m19186x394ba5();
        mo19175x394c1f.mo18961x394b61();
        long j17 = mo19175x394c1f.f6652x6f02230.get();
        if (j17 == 0) {
            j17 = mo19175x394c1f.mo18973x394c1b().m19291x394cb7().nextInt(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26672xc5b068cb.f56198x1c9ff21c) + 1;
            mo19175x394c1f.f6652x6f02230.set(j17);
        }
        return ((((mo18536x5cbba1cc + j17) / 1000) / 60) / 60) / 24;
    }

    /* renamed from: zzkt */
    private final boolean m19262x394ca9() {
        mo19164x394b61();
        m19271x394ca6();
        return m19269x394c6f().m19063x394c4b() || !android.text.TextUtils.isEmpty(m19269x394c6f().m19058x394c46());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0184  */
    /* renamed from: zzku */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m19263x394caa() {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2331x394c88.m19263x394caa():void");
    }

    /* renamed from: zzkv */
    private final void m19264x394cab() {
        mo19164x394b61();
        if (this.f7001x6f022fc || this.f7002x6f022fd || this.f7003x6f022fe) {
            mo18976x394c1e().m19115x394c6b().zzd("Not stopping services. fetch, network, upload", java.lang.Boolean.valueOf(this.f7001x6f022fc), java.lang.Boolean.valueOf(this.f7002x6f022fd), java.lang.Boolean.valueOf(this.f7003x6f022fe));
            return;
        }
        mo18976x394c1e().m19115x394c6b().log("Stopping uploading service(s)");
        java.util.List<java.lang.Runnable> list = this.f6998x6f022f9;
        if (list == null) {
            return;
        }
        java.util.Iterator<java.lang.Runnable> it = list.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.f6998x6f022f9.clear();
    }

    /* renamed from: zzkw */
    private final boolean m19265x394cac() {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 m19108x394c64;
        java.lang.String str;
        mo19164x394b61();
        try {
            java.nio.channels.FileChannel channel = new java.io.RandomAccessFile(new java.io.File(mo18960x76847179().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.f7005x6f02300 = channel;
            java.nio.channels.FileLock tryLock = channel.tryLock();
            this.f7004x6f022ff = tryLock;
            if (tryLock != null) {
                mo18976x394c1e().m19115x394c6b().log("Storage concurrent access okay");
                return true;
            }
            mo18976x394c1e().m19108x394c64().log("Storage concurrent data access panic");
            return false;
        } catch (java.io.FileNotFoundException e17) {
            e = e17;
            m19108x394c64 = mo18976x394c1e().m19108x394c64();
            str = "Failed to acquire storage lock";
            m19108x394c64.zzg(str, e);
            return false;
        } catch (java.io.IOException e18) {
            e = e18;
            m19108x394c64 = mo18976x394c1e().m19108x394c64();
            str = "Failed to access storage lock file";
            m19108x394c64.zzg(str, e);
            return false;
        }
    }

    /* renamed from: zzky */
    private final boolean m19266x394cae() {
        mo19164x394b61();
        m19271x394ca6();
        return this.f6996x6f022f7;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: getContext */
    public android.content.Context mo18960x76847179() {
        return this.f6989x6f02155.mo18960x76847179();
    }

    /* renamed from: start */
    public void mo19163x68ac462() {
        mo19164x394b61();
        m19269x394c6f().m19060x394c48();
        if (mo19175x394c1f().f6648x6f0222c.get() == 0) {
            mo19175x394c1f().f6648x6f0222c.set(mo18962x394b92().mo18536x5cbba1cc());
        }
        m19263x394caa();
    }

    /* renamed from: zzab */
    public void mo19164x394b61() {
        mo18975x394c1d().mo18961x394b61();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: zzbt */
    public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.InterfaceC1991x3e2ebee mo18962x394b92() {
        return this.f6989x6f02155.mo18962x394b92();
    }

    /* renamed from: zzcb */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 m19267x394b9f(java.lang.String str) {
        java.lang.String str2;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 c2218x394c03;
        java.lang.Object obj;
        java.lang.String str3 = str;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2182x394bd5 m19053x394b81 = m19269x394c6f().m19053x394b81(str3);
        if (m19053x394b81 == null || android.text.TextUtils.isEmpty(m19053x394b81.m18985x394b66())) {
            str2 = "No app data available; dropping";
            obj = str3;
            c2218x394c03 = mo18976x394c1e().m19114x394c6a();
        } else {
            java.lang.Boolean zzc = zzc(m19053x394b81);
            if (zzc == null || zzc.booleanValue()) {
                return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6(str, m19053x394b81.m18980x9061da68(), m19053x394b81.m18985x394b66(), m19053x394b81.m18998x394c26(), m19053x394b81.m18999x394c27(), m19053x394b81.m19000x394c28(), m19053x394b81.m19001x394c29(), (java.lang.String) null, m19053x394b81.m18981x38846eaf(), false, m19053x394b81.m18995x394c23(), m19053x394b81.m19014x394c3b(), 0L, 0, m19053x394b81.m19015x394c3c(), m19053x394b81.m19016x394c3d(), false);
            }
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 m19108x394c64 = mo18976x394c1e().m19108x394c64();
            str2 = "App version does not match; dropping. appId";
            obj = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str);
            c2218x394c03 = m19108x394c64;
        }
        c2218x394c03.zzg(str2, obj);
        return null;
    }

    public final void zzd(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 c2183x394bd6) {
        if (this.f7006x6f02301 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.f7007x6f02302 = arrayList;
            arrayList.addAll(this.f7006x6f02301);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2192x394be4 m19269x394c6f = m19269x394c6f();
        java.lang.String str = c2183x394bd6.f6455x362a8ff1;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        m19269x394c6f.mo18961x394b61();
        m19269x394c6f.m19257x394ba5();
        try {
            android.database.sqlite.SQLiteDatabase m19049x240d90b1 = m19269x394c6f.m19049x240d90b1();
            java.lang.String[] strArr = {str};
            int delete = m19049x240d90b1.delete("apps", "app_id=?", strArr) + 0 + m19049x240d90b1.delete("events", "app_id=?", strArr) + m19049x240d90b1.delete("user_attributes", "app_id=?", strArr) + m19049x240d90b1.delete("conditional_properties", "app_id=?", strArr) + m19049x240d90b1.delete("raw_events", "app_id=?", strArr) + m19049x240d90b1.delete("raw_events_metadata", "app_id=?", strArr) + m19049x240d90b1.delete("queue", "app_id=?", strArr) + m19049x240d90b1.delete("audience_filter_values", "app_id=?", strArr) + m19049x240d90b1.delete("main_event_params", "app_id=?", strArr);
            if (delete > 0) {
                m19269x394c6f.mo18976x394c1e().m19115x394c6b().zze("Reset analytics data. app, records", str, java.lang.Integer.valueOf(delete));
            }
        } catch (android.database.sqlite.SQLiteException e17) {
            m19269x394c6f.mo18976x394c1e().m19108x394c64().zze("Error resetting analytics data. appId, error", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str), e17);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 zza = zza(mo18960x76847179(), c2183x394bd6.f6455x362a8ff1, c2183x394bd6.f6456x6f0216a, c2183x394bd6.f6462x6f02174, c2183x394bd6.f6464x6f02176, c2183x394bd6.f6465x6f02177, c2183x394bd6.f6468x6f02189);
        if (!mo19176x394c20().m19031x394b79(c2183x394bd6.f6455x362a8ff1) || c2183x394bd6.f6462x6f02174) {
            zzf(zza);
        }
    }

    public final void zze(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 c2183x394bd6) {
        mo19164x394b61();
        m19271x394ca6();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(c2183x394bd6.f6455x362a8ff1);
        zzg(c2183x394bd6);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x03a0 A[Catch: all -> 0x03ca, TryCatch #2 {all -> 0x03ca, blocks: (B:25:0x0095, B:27:0x00a3, B:29:0x00a9, B:31:0x00b5, B:33:0x00db, B:35:0x0124, B:39:0x0137, B:41:0x014c, B:44:0x0159, B:46:0x0166, B:47:0x01ca, B:49:0x01cf, B:50:0x01d7, B:52:0x01eb, B:55:0x01fc, B:57:0x0247, B:59:0x024b, B:60:0x0250, B:62:0x025a, B:63:0x02fe, B:65:0x0319, B:66:0x031c, B:67:0x032d, B:68:0x0381, B:69:0x039c, B:70:0x03bb, B:75:0x026f, B:77:0x0297, B:79:0x029f, B:81:0x02a5, B:82:0x02ab, B:85:0x02b5, B:89:0x02c3, B:92:0x02ec, B:94:0x02f2, B:95:0x02f5, B:97:0x02fb, B:100:0x02d6, B:103:0x0280, B:106:0x0337, B:108:0x0368, B:110:0x036c, B:111:0x036f, B:112:0x03a0, B:114:0x03a4, B:116:0x01de, B:119:0x018d, B:121:0x0198, B:123:0x01a4), top: B:24:0x0095, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01eb A[Catch: all -> 0x03ca, TRY_LEAVE, TryCatch #2 {all -> 0x03ca, blocks: (B:25:0x0095, B:27:0x00a3, B:29:0x00a9, B:31:0x00b5, B:33:0x00db, B:35:0x0124, B:39:0x0137, B:41:0x014c, B:44:0x0159, B:46:0x0166, B:47:0x01ca, B:49:0x01cf, B:50:0x01d7, B:52:0x01eb, B:55:0x01fc, B:57:0x0247, B:59:0x024b, B:60:0x0250, B:62:0x025a, B:63:0x02fe, B:65:0x0319, B:66:0x031c, B:67:0x032d, B:68:0x0381, B:69:0x039c, B:70:0x03bb, B:75:0x026f, B:77:0x0297, B:79:0x029f, B:81:0x02a5, B:82:0x02ab, B:85:0x02b5, B:89:0x02c3, B:92:0x02ec, B:94:0x02f2, B:95:0x02f5, B:97:0x02fb, B:100:0x02d6, B:103:0x0280, B:106:0x0337, B:108:0x0368, B:110:0x036c, B:111:0x036f, B:112:0x03a0, B:114:0x03a4, B:116:0x01de, B:119:0x018d, B:121:0x0198, B:123:0x01a4), top: B:24:0x0095, inners: #0, #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 r23) {
        /*
            Method dump skipped, instructions count: 979
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2331x394c88.zzf(com.google.android.gms.internal.measurement.zzdz):void");
    }

    /* renamed from: zzfw */
    public com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2198x394bea mo19168x394c11() {
        return this.f6989x6f02155.mo19168x394c11();
    }

    /* renamed from: zzga */
    public com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2214x394bff mo19172x394c1a() {
        return this.f6989x6f02155.mo19172x394c1a();
    }

    /* renamed from: zzgb */
    public com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96 mo19173x394c1b() {
        return this.f6989x6f02155.mo19173x394c1b();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: zzgd */
    public com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2242x394c20 mo18975x394c1d() {
        return this.f6989x6f02155.mo18975x394c1d();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: zzge */
    public com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01 mo18976x394c1e() {
        return this.f6989x6f02155.mo18976x394c1e();
    }

    /* renamed from: zzgf */
    public com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2227x394c0c mo19175x394c1f() {
        return this.f6989x6f02155.mo19175x394c1f();
    }

    /* renamed from: zzgg */
    public com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2189x394be1 mo19176x394c20() {
        return this.f6989x6f02155.mo19176x394c20();
    }

    public final java.lang.String zzh(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 c2183x394bd6) {
        try {
            return (java.lang.String) mo18975x394c1d().zzb(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.CallableC2334x394c8b(this, c2183x394bd6)).get(30000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e17) {
            mo18976x394c1e().m19108x394c64().zze("Failed to get app instance id. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(c2183x394bd6.f6455x362a8ff1), e17);
            return null;
        }
    }

    /* renamed from: zziw */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2185x394bdd m19268x394c6e() {
        zza(this.f6995x6f022f6);
        return this.f6995x6f022f6;
    }

    /* renamed from: zzix */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2192x394be4 m19269x394c6f() {
        zza(this.f6992x6f022f3);
        return this.f6992x6f022f3;
    }

    /* renamed from: zzkn */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2220x394c05 m19270x394ca3() {
        zza(this.f6991x6f022f2);
        return this.f6991x6f022f2;
    }

    /* renamed from: zzkq */
    public final void m19271x394ca6() {
        if (!this.f7009x394df9) {
            throw new java.lang.IllegalStateException("UploadController is not initialized");
        }
    }

    /* renamed from: zzks */
    public final void m19272x394ca8() {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2182x394bd5 m19053x394b81;
        java.lang.String str;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 m19115x394c6b;
        java.lang.String str2;
        mo19164x394b61();
        m19271x394ca6();
        this.f7003x6f022fe = true;
        try {
            java.lang.Boolean m19234x394c9b = this.f6989x6f02155.m19169x394c12().m19234x394c9b();
            if (m19234x394c9b == null) {
                m19115x394c6b = mo18976x394c1e().m19111x394c67();
                str2 = "Upload data called on the client side before use of service was decided";
            } else {
                if (!m19234x394c9b.booleanValue()) {
                    if (this.f6997x6f022f8 <= 0) {
                        mo19164x394b61();
                        if (this.f7006x6f02301 != null) {
                            m19115x394c6b = mo18976x394c1e().m19115x394c6b();
                            str2 = "Uploading requested multiple times";
                        } else {
                            if (m19270x394ca3().m19117x394bf3()) {
                                long mo18536x5cbba1cc = mo18962x394b92().mo18536x5cbba1cc();
                                zzd(null, mo18536x5cbba1cc - com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2189x394be1.m19021x394c41());
                                long j17 = mo19175x394c1f().f6648x6f0222c.get();
                                if (j17 != 0) {
                                    mo18976x394c1e().m19114x394c6a().zzg("Uploading events. Elapsed time since last upload attempt (ms)", java.lang.Long.valueOf(java.lang.Math.abs(mo18536x5cbba1cc - j17)));
                                }
                                java.lang.String m19058x394c46 = m19269x394c6f().m19058x394c46();
                                if (android.text.TextUtils.isEmpty(m19058x394c46)) {
                                    this.f7008x6f02303 = -1L;
                                    java.lang.String m19051x394b61 = m19269x394c6f().m19051x394b61(mo18536x5cbba1cc - com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2189x394be1.m19021x394c41());
                                    if (!android.text.TextUtils.isEmpty(m19051x394b61) && (m19053x394b81 = m19269x394c6f().m19053x394b81(m19051x394b61)) != null) {
                                        zzb(m19053x394b81);
                                    }
                                } else {
                                    if (this.f7008x6f02303 == -1) {
                                        this.f7008x6f02303 = m19269x394c6f().m19065x394c4d();
                                    }
                                    java.util.List<android.util.Pair<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6, java.lang.Long>> zzb = m19269x394c6f().zzb(m19058x394c46, mo19176x394c20().zzb(m19058x394c46, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2206x394bf2.f6546x6f021c9), java.lang.Math.max(0, mo19176x394c20().zzb(m19058x394c46, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2206x394bf2.f6547x6f021ca)));
                                    if (!zzb.isEmpty()) {
                                        java.util.Iterator<android.util.Pair<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6, java.lang.Long>> it = zzb.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                str = null;
                                                break;
                                            }
                                            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6 c2356x394ca6 = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6) it.next().first;
                                            if (!android.text.TextUtils.isEmpty(c2356x394ca6.f7122x6f02363)) {
                                                str = c2356x394ca6.f7122x6f02363;
                                                break;
                                            }
                                        }
                                        if (str != null) {
                                            int i17 = 0;
                                            while (true) {
                                                if (i17 >= zzb.size()) {
                                                    break;
                                                }
                                                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6 c2356x394ca62 = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6) zzb.get(i17).first;
                                                if (!android.text.TextUtils.isEmpty(c2356x394ca62.f7122x6f02363) && !c2356x394ca62.f7122x6f02363.equals(str)) {
                                                    zzb = zzb.subList(0, i17);
                                                    break;
                                                }
                                                i17++;
                                            }
                                        }
                                        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2355x394ca5 c2355x394ca5 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2355x394ca5();
                                        c2355x394ca5.f7100x6f02353 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6[zzb.size()];
                                        java.util.ArrayList arrayList = new java.util.ArrayList(zzb.size());
                                        boolean z17 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2189x394be1.m19022x394c43() && mo19176x394c20().m19025x394b73(m19058x394c46);
                                        int i18 = 0;
                                        while (true) {
                                            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6[] c2356x394ca6Arr = c2355x394ca5.f7100x6f02353;
                                            if (i18 >= c2356x394ca6Arr.length) {
                                                break;
                                            }
                                            c2356x394ca6Arr[i18] = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6) zzb.get(i18).first;
                                            arrayList.add((java.lang.Long) zzb.get(i18).second);
                                            c2355x394ca5.f7100x6f02353[i18].f7121x6f02362 = 12451L;
                                            c2355x394ca5.f7100x6f02353[i18].f7111x6f02358 = java.lang.Long.valueOf(mo18536x5cbba1cc);
                                            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6 c2356x394ca63 = c2355x394ca5.f7100x6f02353[i18];
                                            c2356x394ca63.f7126x6f02367 = java.lang.Boolean.FALSE;
                                            if (!z17) {
                                                c2356x394ca63.f7134x6f02374 = null;
                                            }
                                            i18++;
                                        }
                                        java.lang.String zza = mo18976x394c1e().m19107x492678c7(2) ? mo19172x394c1a().zza(c2355x394ca5) : null;
                                        byte[] zzb2 = mo19173x394c1b().zzb(c2355x394ca5);
                                        java.lang.String str3 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2206x394bf2.f6556x6f021d3.get();
                                        try {
                                            java.net.URL url = new java.net.URL(str3);
                                            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18197x312c1fe5(!arrayList.isEmpty());
                                            if (this.f7006x6f02301 != null) {
                                                mo18976x394c1e().m19108x394c64().log("Set uploading progress before finishing the previous upload");
                                            } else {
                                                this.f7006x6f02301 = new java.util.ArrayList(arrayList);
                                            }
                                            mo19175x394c1f().f6649x6f0222d.set(mo18536x5cbba1cc);
                                            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6[] c2356x394ca6Arr2 = c2355x394ca5.f7100x6f02353;
                                            mo18976x394c1e().m19115x394c6b().zzd("Uploading data. app, uncompressed size, data", c2356x394ca6Arr2.length > 0 ? c2356x394ca6Arr2[0].f7138x394db5 : "?", java.lang.Integer.valueOf(zzb2.length), zza);
                                            this.f7002x6f022fd = true;
                                            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2220x394c05 m19270x394ca3 = m19270x394ca3();
                                            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2332x394c89 c2332x394c89 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2332x394c89(this, m19058x394c46);
                                            m19270x394ca3.mo18961x394b61();
                                            m19270x394ca3.m19257x394ba5();
                                            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(url);
                                            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(zzb2);
                                            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2332x394c89);
                                            m19270x394ca3.mo18975x394c1d().zzd(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2224x394c09(m19270x394ca3, m19058x394c46, url, zzb2, null, c2332x394c89));
                                        } catch (java.net.MalformedURLException unused) {
                                            mo18976x394c1e().m19108x394c64().zze("Failed to parse upload URL. Not uploading. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(m19058x394c46), str3);
                                        }
                                    }
                                }
                            }
                            mo18976x394c1e().m19115x394c6b().log("Network not connected, ignoring upload request");
                        }
                    }
                    m19263x394caa();
                }
                m19115x394c6b = mo18976x394c1e().m19108x394c64();
                str2 = "Upload called in the client side when service should be used";
            }
            m19115x394c6b.log(str2);
        } finally {
            this.f7003x6f022fe = false;
            m19264x394cab();
        }
    }

    /* renamed from: zzkx */
    public final void m19273x394cad() {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 m19108x394c64;
        java.lang.Integer valueOf;
        java.lang.Integer valueOf2;
        java.lang.String str;
        mo19164x394b61();
        m19271x394ca6();
        if (this.f6996x6f022f7) {
            return;
        }
        mo18976x394c1e().m19113x394c69().log("This instance being marked as an uploader");
        mo19164x394b61();
        m19271x394ca6();
        if (m19266x394cae() && m19265x394cac()) {
            int zza = zza(this.f7005x6f02300);
            int m19095x394c61 = this.f6989x6f02155.m19167x394c10().m19095x394c61();
            mo19164x394b61();
            if (zza > m19095x394c61) {
                m19108x394c64 = mo18976x394c1e().m19108x394c64();
                valueOf = java.lang.Integer.valueOf(zza);
                valueOf2 = java.lang.Integer.valueOf(m19095x394c61);
                str = "Panic: can't downgrade version. Previous, current version";
            } else if (zza < m19095x394c61) {
                if (zza(m19095x394c61, this.f7005x6f02300)) {
                    m19108x394c64 = mo18976x394c1e().m19115x394c6b();
                    valueOf = java.lang.Integer.valueOf(zza);
                    valueOf2 = java.lang.Integer.valueOf(m19095x394c61);
                    str = "Storage version upgraded. Previous, current version";
                } else {
                    m19108x394c64 = mo18976x394c1e().m19108x394c64();
                    valueOf = java.lang.Integer.valueOf(zza);
                    valueOf2 = java.lang.Integer.valueOf(m19095x394c61);
                    str = "Storage version upgrade failed. Previous, current version";
                }
            }
            m19108x394c64.zze(str, valueOf, valueOf2);
        }
        this.f6996x6f022f7 = true;
        m19263x394caa();
    }

    /* renamed from: zzkz */
    public final void m19274x394caf() {
        this.f7000x6f022fb++;
    }

    /* renamed from: zzla */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 m19275x394cb5() {
        return this.f6989x6f02155;
    }

    public final void zzm(boolean z17) {
        m19263x394caa();
    }

    /* JADX WARN: Code restructure failed: missing block: B:389:0x026f, code lost:
    
        if (r9 == null) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0623 A[Catch: all -> 0x0ae2, TryCatch #3 {all -> 0x0ae2, blocks: (B:3:0x000b, B:18:0x0076, B:19:0x0272, B:21:0x0276, B:26:0x0282, B:27:0x029d, B:29:0x02a5, B:32:0x02bf, B:34:0x02ee, B:39:0x0302, B:41:0x030a, B:44:0x0588, B:46:0x032a, B:48:0x033c, B:54:0x052d, B:56:0x0537, B:58:0x053b, B:61:0x053f, B:63:0x054c, B:64:0x055e, B:65:0x0562, B:66:0x0582, B:68:0x056b, B:70:0x0356, B:72:0x035a, B:73:0x035f, B:78:0x0372, B:80:0x037e, B:82:0x039a, B:83:0x0389, B:85:0x0391, B:91:0x03a7, B:93:0x03ea, B:94:0x0422, B:97:0x0454, B:99:0x0459, B:103:0x0463, B:105:0x046c, B:107:0x0472, B:108:0x047a, B:101:0x047d, B:109:0x0482, B:112:0x048c, B:114:0x04bd, B:116:0x04da, B:120:0x04ef, B:121:0x04e6, B:129:0x04f6, B:131:0x0508, B:132:0x0514, B:137:0x0592, B:139:0x05a5, B:141:0x05b1, B:143:0x05bf, B:146:0x05c4, B:147:0x0602, B:148:0x061e, B:150:0x0623, B:154:0x062d, B:156:0x0639, B:159:0x0655, B:152:0x0633, B:162:0x05e7, B:163:0x066b, B:165:0x0687, B:167:0x06a0, B:170:0x06b0, B:172:0x06c3, B:173:0x06d2, B:175:0x06d6, B:177:0x06e2, B:178:0x06ef, B:180:0x06f3, B:182:0x06f9, B:183:0x070a, B:187:0x08e2, B:189:0x071a, B:193:0x072b, B:195:0x0735, B:199:0x0743, B:201:0x074b, B:203:0x074f, B:205:0x0757, B:207:0x075b, B:211:0x0773, B:213:0x0785, B:215:0x07a3, B:217:0x07ad, B:219:0x07bd, B:220:0x07f3, B:223:0x0803, B:225:0x080a, B:227:0x0814, B:229:0x0818, B:231:0x081c, B:233:0x0820, B:234:0x082c, B:236:0x0832, B:238:0x084d, B:239:0x0856, B:240:0x086a, B:242:0x0885, B:244:0x08b1, B:245:0x08bc, B:247:0x08cd, B:249:0x08d6, B:197:0x0765, B:258:0x08ee, B:260:0x08f3, B:261:0x08fb, B:262:0x0903, B:264:0x0909, B:266:0x091d, B:267:0x0931, B:269:0x0936, B:271:0x0948, B:272:0x094c, B:274:0x095c, B:276:0x0960, B:279:0x0963, B:281:0x0971, B:282:0x09e3, B:284:0x09e8, B:286:0x09f6, B:289:0x09fb, B:290:0x0a24, B:291:0x09fe, B:293:0x0a08, B:294:0x0a0f, B:295:0x0a2d, B:296:0x0a44, B:299:0x0a4c, B:301:0x0a51, B:304:0x0a61, B:306:0x0a7b, B:307:0x0a94, B:309:0x0a9c, B:310:0x0ab9, B:317:0x0aa8, B:318:0x0987, B:320:0x098c, B:322:0x0996, B:323:0x099c, B:328:0x09ae, B:329:0x09b4, B:333:0x0ac9, B:349:0x0127, B:369:0x01cb, B:394:0x0ade, B:395:0x0ae1, B:390:0x0233), top: B:2:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0639 A[Catch: all -> 0x0ae2, TryCatch #3 {all -> 0x0ae2, blocks: (B:3:0x000b, B:18:0x0076, B:19:0x0272, B:21:0x0276, B:26:0x0282, B:27:0x029d, B:29:0x02a5, B:32:0x02bf, B:34:0x02ee, B:39:0x0302, B:41:0x030a, B:44:0x0588, B:46:0x032a, B:48:0x033c, B:54:0x052d, B:56:0x0537, B:58:0x053b, B:61:0x053f, B:63:0x054c, B:64:0x055e, B:65:0x0562, B:66:0x0582, B:68:0x056b, B:70:0x0356, B:72:0x035a, B:73:0x035f, B:78:0x0372, B:80:0x037e, B:82:0x039a, B:83:0x0389, B:85:0x0391, B:91:0x03a7, B:93:0x03ea, B:94:0x0422, B:97:0x0454, B:99:0x0459, B:103:0x0463, B:105:0x046c, B:107:0x0472, B:108:0x047a, B:101:0x047d, B:109:0x0482, B:112:0x048c, B:114:0x04bd, B:116:0x04da, B:120:0x04ef, B:121:0x04e6, B:129:0x04f6, B:131:0x0508, B:132:0x0514, B:137:0x0592, B:139:0x05a5, B:141:0x05b1, B:143:0x05bf, B:146:0x05c4, B:147:0x0602, B:148:0x061e, B:150:0x0623, B:154:0x062d, B:156:0x0639, B:159:0x0655, B:152:0x0633, B:162:0x05e7, B:163:0x066b, B:165:0x0687, B:167:0x06a0, B:170:0x06b0, B:172:0x06c3, B:173:0x06d2, B:175:0x06d6, B:177:0x06e2, B:178:0x06ef, B:180:0x06f3, B:182:0x06f9, B:183:0x070a, B:187:0x08e2, B:189:0x071a, B:193:0x072b, B:195:0x0735, B:199:0x0743, B:201:0x074b, B:203:0x074f, B:205:0x0757, B:207:0x075b, B:211:0x0773, B:213:0x0785, B:215:0x07a3, B:217:0x07ad, B:219:0x07bd, B:220:0x07f3, B:223:0x0803, B:225:0x080a, B:227:0x0814, B:229:0x0818, B:231:0x081c, B:233:0x0820, B:234:0x082c, B:236:0x0832, B:238:0x084d, B:239:0x0856, B:240:0x086a, B:242:0x0885, B:244:0x08b1, B:245:0x08bc, B:247:0x08cd, B:249:0x08d6, B:197:0x0765, B:258:0x08ee, B:260:0x08f3, B:261:0x08fb, B:262:0x0903, B:264:0x0909, B:266:0x091d, B:267:0x0931, B:269:0x0936, B:271:0x0948, B:272:0x094c, B:274:0x095c, B:276:0x0960, B:279:0x0963, B:281:0x0971, B:282:0x09e3, B:284:0x09e8, B:286:0x09f6, B:289:0x09fb, B:290:0x0a24, B:291:0x09fe, B:293:0x0a08, B:294:0x0a0f, B:295:0x0a2d, B:296:0x0a44, B:299:0x0a4c, B:301:0x0a51, B:304:0x0a61, B:306:0x0a7b, B:307:0x0a94, B:309:0x0a9c, B:310:0x0ab9, B:317:0x0aa8, B:318:0x0987, B:320:0x098c, B:322:0x0996, B:323:0x099c, B:328:0x09ae, B:329:0x09b4, B:333:0x0ac9, B:349:0x0127, B:369:0x01cb, B:394:0x0ade, B:395:0x0ae1, B:390:0x0233), top: B:2:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0655 A[Catch: all -> 0x0ae2, TryCatch #3 {all -> 0x0ae2, blocks: (B:3:0x000b, B:18:0x0076, B:19:0x0272, B:21:0x0276, B:26:0x0282, B:27:0x029d, B:29:0x02a5, B:32:0x02bf, B:34:0x02ee, B:39:0x0302, B:41:0x030a, B:44:0x0588, B:46:0x032a, B:48:0x033c, B:54:0x052d, B:56:0x0537, B:58:0x053b, B:61:0x053f, B:63:0x054c, B:64:0x055e, B:65:0x0562, B:66:0x0582, B:68:0x056b, B:70:0x0356, B:72:0x035a, B:73:0x035f, B:78:0x0372, B:80:0x037e, B:82:0x039a, B:83:0x0389, B:85:0x0391, B:91:0x03a7, B:93:0x03ea, B:94:0x0422, B:97:0x0454, B:99:0x0459, B:103:0x0463, B:105:0x046c, B:107:0x0472, B:108:0x047a, B:101:0x047d, B:109:0x0482, B:112:0x048c, B:114:0x04bd, B:116:0x04da, B:120:0x04ef, B:121:0x04e6, B:129:0x04f6, B:131:0x0508, B:132:0x0514, B:137:0x0592, B:139:0x05a5, B:141:0x05b1, B:143:0x05bf, B:146:0x05c4, B:147:0x0602, B:148:0x061e, B:150:0x0623, B:154:0x062d, B:156:0x0639, B:159:0x0655, B:152:0x0633, B:162:0x05e7, B:163:0x066b, B:165:0x0687, B:167:0x06a0, B:170:0x06b0, B:172:0x06c3, B:173:0x06d2, B:175:0x06d6, B:177:0x06e2, B:178:0x06ef, B:180:0x06f3, B:182:0x06f9, B:183:0x070a, B:187:0x08e2, B:189:0x071a, B:193:0x072b, B:195:0x0735, B:199:0x0743, B:201:0x074b, B:203:0x074f, B:205:0x0757, B:207:0x075b, B:211:0x0773, B:213:0x0785, B:215:0x07a3, B:217:0x07ad, B:219:0x07bd, B:220:0x07f3, B:223:0x0803, B:225:0x080a, B:227:0x0814, B:229:0x0818, B:231:0x081c, B:233:0x0820, B:234:0x082c, B:236:0x0832, B:238:0x084d, B:239:0x0856, B:240:0x086a, B:242:0x0885, B:244:0x08b1, B:245:0x08bc, B:247:0x08cd, B:249:0x08d6, B:197:0x0765, B:258:0x08ee, B:260:0x08f3, B:261:0x08fb, B:262:0x0903, B:264:0x0909, B:266:0x091d, B:267:0x0931, B:269:0x0936, B:271:0x0948, B:272:0x094c, B:274:0x095c, B:276:0x0960, B:279:0x0963, B:281:0x0971, B:282:0x09e3, B:284:0x09e8, B:286:0x09f6, B:289:0x09fb, B:290:0x0a24, B:291:0x09fe, B:293:0x0a08, B:294:0x0a0f, B:295:0x0a2d, B:296:0x0a44, B:299:0x0a4c, B:301:0x0a51, B:304:0x0a61, B:306:0x0a7b, B:307:0x0a94, B:309:0x0a9c, B:310:0x0ab9, B:317:0x0aa8, B:318:0x0987, B:320:0x098c, B:322:0x0996, B:323:0x099c, B:328:0x09ae, B:329:0x09b4, B:333:0x0ac9, B:349:0x0127, B:369:0x01cb, B:394:0x0ade, B:395:0x0ae1, B:390:0x0233), top: B:2:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0636 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0773 A[Catch: all -> 0x0ae2, TryCatch #3 {all -> 0x0ae2, blocks: (B:3:0x000b, B:18:0x0076, B:19:0x0272, B:21:0x0276, B:26:0x0282, B:27:0x029d, B:29:0x02a5, B:32:0x02bf, B:34:0x02ee, B:39:0x0302, B:41:0x030a, B:44:0x0588, B:46:0x032a, B:48:0x033c, B:54:0x052d, B:56:0x0537, B:58:0x053b, B:61:0x053f, B:63:0x054c, B:64:0x055e, B:65:0x0562, B:66:0x0582, B:68:0x056b, B:70:0x0356, B:72:0x035a, B:73:0x035f, B:78:0x0372, B:80:0x037e, B:82:0x039a, B:83:0x0389, B:85:0x0391, B:91:0x03a7, B:93:0x03ea, B:94:0x0422, B:97:0x0454, B:99:0x0459, B:103:0x0463, B:105:0x046c, B:107:0x0472, B:108:0x047a, B:101:0x047d, B:109:0x0482, B:112:0x048c, B:114:0x04bd, B:116:0x04da, B:120:0x04ef, B:121:0x04e6, B:129:0x04f6, B:131:0x0508, B:132:0x0514, B:137:0x0592, B:139:0x05a5, B:141:0x05b1, B:143:0x05bf, B:146:0x05c4, B:147:0x0602, B:148:0x061e, B:150:0x0623, B:154:0x062d, B:156:0x0639, B:159:0x0655, B:152:0x0633, B:162:0x05e7, B:163:0x066b, B:165:0x0687, B:167:0x06a0, B:170:0x06b0, B:172:0x06c3, B:173:0x06d2, B:175:0x06d6, B:177:0x06e2, B:178:0x06ef, B:180:0x06f3, B:182:0x06f9, B:183:0x070a, B:187:0x08e2, B:189:0x071a, B:193:0x072b, B:195:0x0735, B:199:0x0743, B:201:0x074b, B:203:0x074f, B:205:0x0757, B:207:0x075b, B:211:0x0773, B:213:0x0785, B:215:0x07a3, B:217:0x07ad, B:219:0x07bd, B:220:0x07f3, B:223:0x0803, B:225:0x080a, B:227:0x0814, B:229:0x0818, B:231:0x081c, B:233:0x0820, B:234:0x082c, B:236:0x0832, B:238:0x084d, B:239:0x0856, B:240:0x086a, B:242:0x0885, B:244:0x08b1, B:245:0x08bc, B:247:0x08cd, B:249:0x08d6, B:197:0x0765, B:258:0x08ee, B:260:0x08f3, B:261:0x08fb, B:262:0x0903, B:264:0x0909, B:266:0x091d, B:267:0x0931, B:269:0x0936, B:271:0x0948, B:272:0x094c, B:274:0x095c, B:276:0x0960, B:279:0x0963, B:281:0x0971, B:282:0x09e3, B:284:0x09e8, B:286:0x09f6, B:289:0x09fb, B:290:0x0a24, B:291:0x09fe, B:293:0x0a08, B:294:0x0a0f, B:295:0x0a2d, B:296:0x0a44, B:299:0x0a4c, B:301:0x0a51, B:304:0x0a61, B:306:0x0a7b, B:307:0x0a94, B:309:0x0a9c, B:310:0x0ab9, B:317:0x0aa8, B:318:0x0987, B:320:0x098c, B:322:0x0996, B:323:0x099c, B:328:0x09ae, B:329:0x09b4, B:333:0x0ac9, B:349:0x0127, B:369:0x01cb, B:394:0x0ade, B:395:0x0ae1, B:390:0x0233), top: B:2:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0785 A[Catch: all -> 0x0ae2, TryCatch #3 {all -> 0x0ae2, blocks: (B:3:0x000b, B:18:0x0076, B:19:0x0272, B:21:0x0276, B:26:0x0282, B:27:0x029d, B:29:0x02a5, B:32:0x02bf, B:34:0x02ee, B:39:0x0302, B:41:0x030a, B:44:0x0588, B:46:0x032a, B:48:0x033c, B:54:0x052d, B:56:0x0537, B:58:0x053b, B:61:0x053f, B:63:0x054c, B:64:0x055e, B:65:0x0562, B:66:0x0582, B:68:0x056b, B:70:0x0356, B:72:0x035a, B:73:0x035f, B:78:0x0372, B:80:0x037e, B:82:0x039a, B:83:0x0389, B:85:0x0391, B:91:0x03a7, B:93:0x03ea, B:94:0x0422, B:97:0x0454, B:99:0x0459, B:103:0x0463, B:105:0x046c, B:107:0x0472, B:108:0x047a, B:101:0x047d, B:109:0x0482, B:112:0x048c, B:114:0x04bd, B:116:0x04da, B:120:0x04ef, B:121:0x04e6, B:129:0x04f6, B:131:0x0508, B:132:0x0514, B:137:0x0592, B:139:0x05a5, B:141:0x05b1, B:143:0x05bf, B:146:0x05c4, B:147:0x0602, B:148:0x061e, B:150:0x0623, B:154:0x062d, B:156:0x0639, B:159:0x0655, B:152:0x0633, B:162:0x05e7, B:163:0x066b, B:165:0x0687, B:167:0x06a0, B:170:0x06b0, B:172:0x06c3, B:173:0x06d2, B:175:0x06d6, B:177:0x06e2, B:178:0x06ef, B:180:0x06f3, B:182:0x06f9, B:183:0x070a, B:187:0x08e2, B:189:0x071a, B:193:0x072b, B:195:0x0735, B:199:0x0743, B:201:0x074b, B:203:0x074f, B:205:0x0757, B:207:0x075b, B:211:0x0773, B:213:0x0785, B:215:0x07a3, B:217:0x07ad, B:219:0x07bd, B:220:0x07f3, B:223:0x0803, B:225:0x080a, B:227:0x0814, B:229:0x0818, B:231:0x081c, B:233:0x0820, B:234:0x082c, B:236:0x0832, B:238:0x084d, B:239:0x0856, B:240:0x086a, B:242:0x0885, B:244:0x08b1, B:245:0x08bc, B:247:0x08cd, B:249:0x08d6, B:197:0x0765, B:258:0x08ee, B:260:0x08f3, B:261:0x08fb, B:262:0x0903, B:264:0x0909, B:266:0x091d, B:267:0x0931, B:269:0x0936, B:271:0x0948, B:272:0x094c, B:274:0x095c, B:276:0x0960, B:279:0x0963, B:281:0x0971, B:282:0x09e3, B:284:0x09e8, B:286:0x09f6, B:289:0x09fb, B:290:0x0a24, B:291:0x09fe, B:293:0x0a08, B:294:0x0a0f, B:295:0x0a2d, B:296:0x0a44, B:299:0x0a4c, B:301:0x0a51, B:304:0x0a61, B:306:0x0a7b, B:307:0x0a94, B:309:0x0a9c, B:310:0x0ab9, B:317:0x0aa8, B:318:0x0987, B:320:0x098c, B:322:0x0996, B:323:0x099c, B:328:0x09ae, B:329:0x09b4, B:333:0x0ac9, B:349:0x0127, B:369:0x01cb, B:394:0x0ade, B:395:0x0ae1, B:390:0x0233), top: B:2:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x07a3 A[Catch: all -> 0x0ae2, TryCatch #3 {all -> 0x0ae2, blocks: (B:3:0x000b, B:18:0x0076, B:19:0x0272, B:21:0x0276, B:26:0x0282, B:27:0x029d, B:29:0x02a5, B:32:0x02bf, B:34:0x02ee, B:39:0x0302, B:41:0x030a, B:44:0x0588, B:46:0x032a, B:48:0x033c, B:54:0x052d, B:56:0x0537, B:58:0x053b, B:61:0x053f, B:63:0x054c, B:64:0x055e, B:65:0x0562, B:66:0x0582, B:68:0x056b, B:70:0x0356, B:72:0x035a, B:73:0x035f, B:78:0x0372, B:80:0x037e, B:82:0x039a, B:83:0x0389, B:85:0x0391, B:91:0x03a7, B:93:0x03ea, B:94:0x0422, B:97:0x0454, B:99:0x0459, B:103:0x0463, B:105:0x046c, B:107:0x0472, B:108:0x047a, B:101:0x047d, B:109:0x0482, B:112:0x048c, B:114:0x04bd, B:116:0x04da, B:120:0x04ef, B:121:0x04e6, B:129:0x04f6, B:131:0x0508, B:132:0x0514, B:137:0x0592, B:139:0x05a5, B:141:0x05b1, B:143:0x05bf, B:146:0x05c4, B:147:0x0602, B:148:0x061e, B:150:0x0623, B:154:0x062d, B:156:0x0639, B:159:0x0655, B:152:0x0633, B:162:0x05e7, B:163:0x066b, B:165:0x0687, B:167:0x06a0, B:170:0x06b0, B:172:0x06c3, B:173:0x06d2, B:175:0x06d6, B:177:0x06e2, B:178:0x06ef, B:180:0x06f3, B:182:0x06f9, B:183:0x070a, B:187:0x08e2, B:189:0x071a, B:193:0x072b, B:195:0x0735, B:199:0x0743, B:201:0x074b, B:203:0x074f, B:205:0x0757, B:207:0x075b, B:211:0x0773, B:213:0x0785, B:215:0x07a3, B:217:0x07ad, B:219:0x07bd, B:220:0x07f3, B:223:0x0803, B:225:0x080a, B:227:0x0814, B:229:0x0818, B:231:0x081c, B:233:0x0820, B:234:0x082c, B:236:0x0832, B:238:0x084d, B:239:0x0856, B:240:0x086a, B:242:0x0885, B:244:0x08b1, B:245:0x08bc, B:247:0x08cd, B:249:0x08d6, B:197:0x0765, B:258:0x08ee, B:260:0x08f3, B:261:0x08fb, B:262:0x0903, B:264:0x0909, B:266:0x091d, B:267:0x0931, B:269:0x0936, B:271:0x0948, B:272:0x094c, B:274:0x095c, B:276:0x0960, B:279:0x0963, B:281:0x0971, B:282:0x09e3, B:284:0x09e8, B:286:0x09f6, B:289:0x09fb, B:290:0x0a24, B:291:0x09fe, B:293:0x0a08, B:294:0x0a0f, B:295:0x0a2d, B:296:0x0a44, B:299:0x0a4c, B:301:0x0a51, B:304:0x0a61, B:306:0x0a7b, B:307:0x0a94, B:309:0x0a9c, B:310:0x0ab9, B:317:0x0aa8, B:318:0x0987, B:320:0x098c, B:322:0x0996, B:323:0x099c, B:328:0x09ae, B:329:0x09b4, B:333:0x0ac9, B:349:0x0127, B:369:0x01cb, B:394:0x0ade, B:395:0x0ae1, B:390:0x0233), top: B:2:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0276 A[Catch: all -> 0x0ae2, TryCatch #3 {all -> 0x0ae2, blocks: (B:3:0x000b, B:18:0x0076, B:19:0x0272, B:21:0x0276, B:26:0x0282, B:27:0x029d, B:29:0x02a5, B:32:0x02bf, B:34:0x02ee, B:39:0x0302, B:41:0x030a, B:44:0x0588, B:46:0x032a, B:48:0x033c, B:54:0x052d, B:56:0x0537, B:58:0x053b, B:61:0x053f, B:63:0x054c, B:64:0x055e, B:65:0x0562, B:66:0x0582, B:68:0x056b, B:70:0x0356, B:72:0x035a, B:73:0x035f, B:78:0x0372, B:80:0x037e, B:82:0x039a, B:83:0x0389, B:85:0x0391, B:91:0x03a7, B:93:0x03ea, B:94:0x0422, B:97:0x0454, B:99:0x0459, B:103:0x0463, B:105:0x046c, B:107:0x0472, B:108:0x047a, B:101:0x047d, B:109:0x0482, B:112:0x048c, B:114:0x04bd, B:116:0x04da, B:120:0x04ef, B:121:0x04e6, B:129:0x04f6, B:131:0x0508, B:132:0x0514, B:137:0x0592, B:139:0x05a5, B:141:0x05b1, B:143:0x05bf, B:146:0x05c4, B:147:0x0602, B:148:0x061e, B:150:0x0623, B:154:0x062d, B:156:0x0639, B:159:0x0655, B:152:0x0633, B:162:0x05e7, B:163:0x066b, B:165:0x0687, B:167:0x06a0, B:170:0x06b0, B:172:0x06c3, B:173:0x06d2, B:175:0x06d6, B:177:0x06e2, B:178:0x06ef, B:180:0x06f3, B:182:0x06f9, B:183:0x070a, B:187:0x08e2, B:189:0x071a, B:193:0x072b, B:195:0x0735, B:199:0x0743, B:201:0x074b, B:203:0x074f, B:205:0x0757, B:207:0x075b, B:211:0x0773, B:213:0x0785, B:215:0x07a3, B:217:0x07ad, B:219:0x07bd, B:220:0x07f3, B:223:0x0803, B:225:0x080a, B:227:0x0814, B:229:0x0818, B:231:0x081c, B:233:0x0820, B:234:0x082c, B:236:0x0832, B:238:0x084d, B:239:0x0856, B:240:0x086a, B:242:0x0885, B:244:0x08b1, B:245:0x08bc, B:247:0x08cd, B:249:0x08d6, B:197:0x0765, B:258:0x08ee, B:260:0x08f3, B:261:0x08fb, B:262:0x0903, B:264:0x0909, B:266:0x091d, B:267:0x0931, B:269:0x0936, B:271:0x0948, B:272:0x094c, B:274:0x095c, B:276:0x0960, B:279:0x0963, B:281:0x0971, B:282:0x09e3, B:284:0x09e8, B:286:0x09f6, B:289:0x09fb, B:290:0x0a24, B:291:0x09fe, B:293:0x0a08, B:294:0x0a0f, B:295:0x0a2d, B:296:0x0a44, B:299:0x0a4c, B:301:0x0a51, B:304:0x0a61, B:306:0x0a7b, B:307:0x0a94, B:309:0x0a9c, B:310:0x0ab9, B:317:0x0aa8, B:318:0x0987, B:320:0x098c, B:322:0x0996, B:323:0x099c, B:328:0x09ae, B:329:0x09b4, B:333:0x0ac9, B:349:0x0127, B:369:0x01cb, B:394:0x0ade, B:395:0x0ae1, B:390:0x0233), top: B:2:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0282 A[Catch: all -> 0x0ae2, TryCatch #3 {all -> 0x0ae2, blocks: (B:3:0x000b, B:18:0x0076, B:19:0x0272, B:21:0x0276, B:26:0x0282, B:27:0x029d, B:29:0x02a5, B:32:0x02bf, B:34:0x02ee, B:39:0x0302, B:41:0x030a, B:44:0x0588, B:46:0x032a, B:48:0x033c, B:54:0x052d, B:56:0x0537, B:58:0x053b, B:61:0x053f, B:63:0x054c, B:64:0x055e, B:65:0x0562, B:66:0x0582, B:68:0x056b, B:70:0x0356, B:72:0x035a, B:73:0x035f, B:78:0x0372, B:80:0x037e, B:82:0x039a, B:83:0x0389, B:85:0x0391, B:91:0x03a7, B:93:0x03ea, B:94:0x0422, B:97:0x0454, B:99:0x0459, B:103:0x0463, B:105:0x046c, B:107:0x0472, B:108:0x047a, B:101:0x047d, B:109:0x0482, B:112:0x048c, B:114:0x04bd, B:116:0x04da, B:120:0x04ef, B:121:0x04e6, B:129:0x04f6, B:131:0x0508, B:132:0x0514, B:137:0x0592, B:139:0x05a5, B:141:0x05b1, B:143:0x05bf, B:146:0x05c4, B:147:0x0602, B:148:0x061e, B:150:0x0623, B:154:0x062d, B:156:0x0639, B:159:0x0655, B:152:0x0633, B:162:0x05e7, B:163:0x066b, B:165:0x0687, B:167:0x06a0, B:170:0x06b0, B:172:0x06c3, B:173:0x06d2, B:175:0x06d6, B:177:0x06e2, B:178:0x06ef, B:180:0x06f3, B:182:0x06f9, B:183:0x070a, B:187:0x08e2, B:189:0x071a, B:193:0x072b, B:195:0x0735, B:199:0x0743, B:201:0x074b, B:203:0x074f, B:205:0x0757, B:207:0x075b, B:211:0x0773, B:213:0x0785, B:215:0x07a3, B:217:0x07ad, B:219:0x07bd, B:220:0x07f3, B:223:0x0803, B:225:0x080a, B:227:0x0814, B:229:0x0818, B:231:0x081c, B:233:0x0820, B:234:0x082c, B:236:0x0832, B:238:0x084d, B:239:0x0856, B:240:0x086a, B:242:0x0885, B:244:0x08b1, B:245:0x08bc, B:247:0x08cd, B:249:0x08d6, B:197:0x0765, B:258:0x08ee, B:260:0x08f3, B:261:0x08fb, B:262:0x0903, B:264:0x0909, B:266:0x091d, B:267:0x0931, B:269:0x0936, B:271:0x0948, B:272:0x094c, B:274:0x095c, B:276:0x0960, B:279:0x0963, B:281:0x0971, B:282:0x09e3, B:284:0x09e8, B:286:0x09f6, B:289:0x09fb, B:290:0x0a24, B:291:0x09fe, B:293:0x0a08, B:294:0x0a0f, B:295:0x0a2d, B:296:0x0a44, B:299:0x0a4c, B:301:0x0a51, B:304:0x0a61, B:306:0x0a7b, B:307:0x0a94, B:309:0x0a9c, B:310:0x0ab9, B:317:0x0aa8, B:318:0x0987, B:320:0x098c, B:322:0x0996, B:323:0x099c, B:328:0x09ae, B:329:0x09b4, B:333:0x0ac9, B:349:0x0127, B:369:0x01cb, B:394:0x0ade, B:395:0x0ae1, B:390:0x0233), top: B:2:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0ac9 A[Catch: all -> 0x0ae2, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0ae2, blocks: (B:3:0x000b, B:18:0x0076, B:19:0x0272, B:21:0x0276, B:26:0x0282, B:27:0x029d, B:29:0x02a5, B:32:0x02bf, B:34:0x02ee, B:39:0x0302, B:41:0x030a, B:44:0x0588, B:46:0x032a, B:48:0x033c, B:54:0x052d, B:56:0x0537, B:58:0x053b, B:61:0x053f, B:63:0x054c, B:64:0x055e, B:65:0x0562, B:66:0x0582, B:68:0x056b, B:70:0x0356, B:72:0x035a, B:73:0x035f, B:78:0x0372, B:80:0x037e, B:82:0x039a, B:83:0x0389, B:85:0x0391, B:91:0x03a7, B:93:0x03ea, B:94:0x0422, B:97:0x0454, B:99:0x0459, B:103:0x0463, B:105:0x046c, B:107:0x0472, B:108:0x047a, B:101:0x047d, B:109:0x0482, B:112:0x048c, B:114:0x04bd, B:116:0x04da, B:120:0x04ef, B:121:0x04e6, B:129:0x04f6, B:131:0x0508, B:132:0x0514, B:137:0x0592, B:139:0x05a5, B:141:0x05b1, B:143:0x05bf, B:146:0x05c4, B:147:0x0602, B:148:0x061e, B:150:0x0623, B:154:0x062d, B:156:0x0639, B:159:0x0655, B:152:0x0633, B:162:0x05e7, B:163:0x066b, B:165:0x0687, B:167:0x06a0, B:170:0x06b0, B:172:0x06c3, B:173:0x06d2, B:175:0x06d6, B:177:0x06e2, B:178:0x06ef, B:180:0x06f3, B:182:0x06f9, B:183:0x070a, B:187:0x08e2, B:189:0x071a, B:193:0x072b, B:195:0x0735, B:199:0x0743, B:201:0x074b, B:203:0x074f, B:205:0x0757, B:207:0x075b, B:211:0x0773, B:213:0x0785, B:215:0x07a3, B:217:0x07ad, B:219:0x07bd, B:220:0x07f3, B:223:0x0803, B:225:0x080a, B:227:0x0814, B:229:0x0818, B:231:0x081c, B:233:0x0820, B:234:0x082c, B:236:0x0832, B:238:0x084d, B:239:0x0856, B:240:0x086a, B:242:0x0885, B:244:0x08b1, B:245:0x08bc, B:247:0x08cd, B:249:0x08d6, B:197:0x0765, B:258:0x08ee, B:260:0x08f3, B:261:0x08fb, B:262:0x0903, B:264:0x0909, B:266:0x091d, B:267:0x0931, B:269:0x0936, B:271:0x0948, B:272:0x094c, B:274:0x095c, B:276:0x0960, B:279:0x0963, B:281:0x0971, B:282:0x09e3, B:284:0x09e8, B:286:0x09f6, B:289:0x09fb, B:290:0x0a24, B:291:0x09fe, B:293:0x0a08, B:294:0x0a0f, B:295:0x0a2d, B:296:0x0a44, B:299:0x0a4c, B:301:0x0a51, B:304:0x0a61, B:306:0x0a7b, B:307:0x0a94, B:309:0x0a9c, B:310:0x0ab9, B:317:0x0aa8, B:318:0x0987, B:320:0x098c, B:322:0x0996, B:323:0x099c, B:328:0x09ae, B:329:0x09b4, B:333:0x0ac9, B:349:0x0127, B:369:0x01cb, B:394:0x0ade, B:395:0x0ae1, B:390:0x0233), top: B:2:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0116 A[Catch: all -> 0x012c, SQLiteException -> 0x0131, TRY_ENTER, TRY_LEAVE, TryCatch #16 {SQLiteException -> 0x0131, all -> 0x012c, blocks: (B:348:0x0116, B:356:0x014d, B:360:0x0169), top: B:346:0x0114 }] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0136 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0ade A[Catch: all -> 0x0ae2, TRY_ENTER, TryCatch #3 {all -> 0x0ae2, blocks: (B:3:0x000b, B:18:0x0076, B:19:0x0272, B:21:0x0276, B:26:0x0282, B:27:0x029d, B:29:0x02a5, B:32:0x02bf, B:34:0x02ee, B:39:0x0302, B:41:0x030a, B:44:0x0588, B:46:0x032a, B:48:0x033c, B:54:0x052d, B:56:0x0537, B:58:0x053b, B:61:0x053f, B:63:0x054c, B:64:0x055e, B:65:0x0562, B:66:0x0582, B:68:0x056b, B:70:0x0356, B:72:0x035a, B:73:0x035f, B:78:0x0372, B:80:0x037e, B:82:0x039a, B:83:0x0389, B:85:0x0391, B:91:0x03a7, B:93:0x03ea, B:94:0x0422, B:97:0x0454, B:99:0x0459, B:103:0x0463, B:105:0x046c, B:107:0x0472, B:108:0x047a, B:101:0x047d, B:109:0x0482, B:112:0x048c, B:114:0x04bd, B:116:0x04da, B:120:0x04ef, B:121:0x04e6, B:129:0x04f6, B:131:0x0508, B:132:0x0514, B:137:0x0592, B:139:0x05a5, B:141:0x05b1, B:143:0x05bf, B:146:0x05c4, B:147:0x0602, B:148:0x061e, B:150:0x0623, B:154:0x062d, B:156:0x0639, B:159:0x0655, B:152:0x0633, B:162:0x05e7, B:163:0x066b, B:165:0x0687, B:167:0x06a0, B:170:0x06b0, B:172:0x06c3, B:173:0x06d2, B:175:0x06d6, B:177:0x06e2, B:178:0x06ef, B:180:0x06f3, B:182:0x06f9, B:183:0x070a, B:187:0x08e2, B:189:0x071a, B:193:0x072b, B:195:0x0735, B:199:0x0743, B:201:0x074b, B:203:0x074f, B:205:0x0757, B:207:0x075b, B:211:0x0773, B:213:0x0785, B:215:0x07a3, B:217:0x07ad, B:219:0x07bd, B:220:0x07f3, B:223:0x0803, B:225:0x080a, B:227:0x0814, B:229:0x0818, B:231:0x081c, B:233:0x0820, B:234:0x082c, B:236:0x0832, B:238:0x084d, B:239:0x0856, B:240:0x086a, B:242:0x0885, B:244:0x08b1, B:245:0x08bc, B:247:0x08cd, B:249:0x08d6, B:197:0x0765, B:258:0x08ee, B:260:0x08f3, B:261:0x08fb, B:262:0x0903, B:264:0x0909, B:266:0x091d, B:267:0x0931, B:269:0x0936, B:271:0x0948, B:272:0x094c, B:274:0x095c, B:276:0x0960, B:279:0x0963, B:281:0x0971, B:282:0x09e3, B:284:0x09e8, B:286:0x09f6, B:289:0x09fb, B:290:0x0a24, B:291:0x09fe, B:293:0x0a08, B:294:0x0a0f, B:295:0x0a2d, B:296:0x0a44, B:299:0x0a4c, B:301:0x0a51, B:304:0x0a61, B:306:0x0a7b, B:307:0x0a94, B:309:0x0a9c, B:310:0x0ab9, B:317:0x0aa8, B:318:0x0987, B:320:0x098c, B:322:0x0996, B:323:0x099c, B:328:0x09ae, B:329:0x09b4, B:333:0x0ac9, B:349:0x0127, B:369:0x01cb, B:394:0x0ade, B:395:0x0ae1, B:390:0x0233), top: B:2:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:396:? A[Catch: all -> 0x0ae2, SYNTHETIC, TRY_LEAVE, TryCatch #3 {all -> 0x0ae2, blocks: (B:3:0x000b, B:18:0x0076, B:19:0x0272, B:21:0x0276, B:26:0x0282, B:27:0x029d, B:29:0x02a5, B:32:0x02bf, B:34:0x02ee, B:39:0x0302, B:41:0x030a, B:44:0x0588, B:46:0x032a, B:48:0x033c, B:54:0x052d, B:56:0x0537, B:58:0x053b, B:61:0x053f, B:63:0x054c, B:64:0x055e, B:65:0x0562, B:66:0x0582, B:68:0x056b, B:70:0x0356, B:72:0x035a, B:73:0x035f, B:78:0x0372, B:80:0x037e, B:82:0x039a, B:83:0x0389, B:85:0x0391, B:91:0x03a7, B:93:0x03ea, B:94:0x0422, B:97:0x0454, B:99:0x0459, B:103:0x0463, B:105:0x046c, B:107:0x0472, B:108:0x047a, B:101:0x047d, B:109:0x0482, B:112:0x048c, B:114:0x04bd, B:116:0x04da, B:120:0x04ef, B:121:0x04e6, B:129:0x04f6, B:131:0x0508, B:132:0x0514, B:137:0x0592, B:139:0x05a5, B:141:0x05b1, B:143:0x05bf, B:146:0x05c4, B:147:0x0602, B:148:0x061e, B:150:0x0623, B:154:0x062d, B:156:0x0639, B:159:0x0655, B:152:0x0633, B:162:0x05e7, B:163:0x066b, B:165:0x0687, B:167:0x06a0, B:170:0x06b0, B:172:0x06c3, B:173:0x06d2, B:175:0x06d6, B:177:0x06e2, B:178:0x06ef, B:180:0x06f3, B:182:0x06f9, B:183:0x070a, B:187:0x08e2, B:189:0x071a, B:193:0x072b, B:195:0x0735, B:199:0x0743, B:201:0x074b, B:203:0x074f, B:205:0x0757, B:207:0x075b, B:211:0x0773, B:213:0x0785, B:215:0x07a3, B:217:0x07ad, B:219:0x07bd, B:220:0x07f3, B:223:0x0803, B:225:0x080a, B:227:0x0814, B:229:0x0818, B:231:0x081c, B:233:0x0820, B:234:0x082c, B:236:0x0832, B:238:0x084d, B:239:0x0856, B:240:0x086a, B:242:0x0885, B:244:0x08b1, B:245:0x08bc, B:247:0x08cd, B:249:0x08d6, B:197:0x0765, B:258:0x08ee, B:260:0x08f3, B:261:0x08fb, B:262:0x0903, B:264:0x0909, B:266:0x091d, B:267:0x0931, B:269:0x0936, B:271:0x0948, B:272:0x094c, B:274:0x095c, B:276:0x0960, B:279:0x0963, B:281:0x0971, B:282:0x09e3, B:284:0x09e8, B:286:0x09f6, B:289:0x09fb, B:290:0x0a24, B:291:0x09fe, B:293:0x0a08, B:294:0x0a0f, B:295:0x0a2d, B:296:0x0a44, B:299:0x0a4c, B:301:0x0a51, B:304:0x0a61, B:306:0x0a7b, B:307:0x0a94, B:309:0x0a9c, B:310:0x0ab9, B:317:0x0aa8, B:318:0x0987, B:320:0x098c, B:322:0x0996, B:323:0x099c, B:328:0x09ae, B:329:0x09b4, B:333:0x0ac9, B:349:0x0127, B:369:0x01cb, B:394:0x0ade, B:395:0x0ae1, B:390:0x0233), top: B:2:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x054c A[Catch: all -> 0x0ae2, TryCatch #3 {all -> 0x0ae2, blocks: (B:3:0x000b, B:18:0x0076, B:19:0x0272, B:21:0x0276, B:26:0x0282, B:27:0x029d, B:29:0x02a5, B:32:0x02bf, B:34:0x02ee, B:39:0x0302, B:41:0x030a, B:44:0x0588, B:46:0x032a, B:48:0x033c, B:54:0x052d, B:56:0x0537, B:58:0x053b, B:61:0x053f, B:63:0x054c, B:64:0x055e, B:65:0x0562, B:66:0x0582, B:68:0x056b, B:70:0x0356, B:72:0x035a, B:73:0x035f, B:78:0x0372, B:80:0x037e, B:82:0x039a, B:83:0x0389, B:85:0x0391, B:91:0x03a7, B:93:0x03ea, B:94:0x0422, B:97:0x0454, B:99:0x0459, B:103:0x0463, B:105:0x046c, B:107:0x0472, B:108:0x047a, B:101:0x047d, B:109:0x0482, B:112:0x048c, B:114:0x04bd, B:116:0x04da, B:120:0x04ef, B:121:0x04e6, B:129:0x04f6, B:131:0x0508, B:132:0x0514, B:137:0x0592, B:139:0x05a5, B:141:0x05b1, B:143:0x05bf, B:146:0x05c4, B:147:0x0602, B:148:0x061e, B:150:0x0623, B:154:0x062d, B:156:0x0639, B:159:0x0655, B:152:0x0633, B:162:0x05e7, B:163:0x066b, B:165:0x0687, B:167:0x06a0, B:170:0x06b0, B:172:0x06c3, B:173:0x06d2, B:175:0x06d6, B:177:0x06e2, B:178:0x06ef, B:180:0x06f3, B:182:0x06f9, B:183:0x070a, B:187:0x08e2, B:189:0x071a, B:193:0x072b, B:195:0x0735, B:199:0x0743, B:201:0x074b, B:203:0x074f, B:205:0x0757, B:207:0x075b, B:211:0x0773, B:213:0x0785, B:215:0x07a3, B:217:0x07ad, B:219:0x07bd, B:220:0x07f3, B:223:0x0803, B:225:0x080a, B:227:0x0814, B:229:0x0818, B:231:0x081c, B:233:0x0820, B:234:0x082c, B:236:0x0832, B:238:0x084d, B:239:0x0856, B:240:0x086a, B:242:0x0885, B:244:0x08b1, B:245:0x08bc, B:247:0x08cd, B:249:0x08d6, B:197:0x0765, B:258:0x08ee, B:260:0x08f3, B:261:0x08fb, B:262:0x0903, B:264:0x0909, B:266:0x091d, B:267:0x0931, B:269:0x0936, B:271:0x0948, B:272:0x094c, B:274:0x095c, B:276:0x0960, B:279:0x0963, B:281:0x0971, B:282:0x09e3, B:284:0x09e8, B:286:0x09f6, B:289:0x09fb, B:290:0x0a24, B:291:0x09fe, B:293:0x0a08, B:294:0x0a0f, B:295:0x0a2d, B:296:0x0a44, B:299:0x0a4c, B:301:0x0a51, B:304:0x0a61, B:306:0x0a7b, B:307:0x0a94, B:309:0x0a9c, B:310:0x0ab9, B:317:0x0aa8, B:318:0x0987, B:320:0x098c, B:322:0x0996, B:323:0x099c, B:328:0x09ae, B:329:0x09b4, B:333:0x0ac9, B:349:0x0127, B:369:0x01cb, B:394:0x0ade, B:395:0x0ae1, B:390:0x0233), top: B:2:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0562 A[Catch: all -> 0x0ae2, TryCatch #3 {all -> 0x0ae2, blocks: (B:3:0x000b, B:18:0x0076, B:19:0x0272, B:21:0x0276, B:26:0x0282, B:27:0x029d, B:29:0x02a5, B:32:0x02bf, B:34:0x02ee, B:39:0x0302, B:41:0x030a, B:44:0x0588, B:46:0x032a, B:48:0x033c, B:54:0x052d, B:56:0x0537, B:58:0x053b, B:61:0x053f, B:63:0x054c, B:64:0x055e, B:65:0x0562, B:66:0x0582, B:68:0x056b, B:70:0x0356, B:72:0x035a, B:73:0x035f, B:78:0x0372, B:80:0x037e, B:82:0x039a, B:83:0x0389, B:85:0x0391, B:91:0x03a7, B:93:0x03ea, B:94:0x0422, B:97:0x0454, B:99:0x0459, B:103:0x0463, B:105:0x046c, B:107:0x0472, B:108:0x047a, B:101:0x047d, B:109:0x0482, B:112:0x048c, B:114:0x04bd, B:116:0x04da, B:120:0x04ef, B:121:0x04e6, B:129:0x04f6, B:131:0x0508, B:132:0x0514, B:137:0x0592, B:139:0x05a5, B:141:0x05b1, B:143:0x05bf, B:146:0x05c4, B:147:0x0602, B:148:0x061e, B:150:0x0623, B:154:0x062d, B:156:0x0639, B:159:0x0655, B:152:0x0633, B:162:0x05e7, B:163:0x066b, B:165:0x0687, B:167:0x06a0, B:170:0x06b0, B:172:0x06c3, B:173:0x06d2, B:175:0x06d6, B:177:0x06e2, B:178:0x06ef, B:180:0x06f3, B:182:0x06f9, B:183:0x070a, B:187:0x08e2, B:189:0x071a, B:193:0x072b, B:195:0x0735, B:199:0x0743, B:201:0x074b, B:203:0x074f, B:205:0x0757, B:207:0x075b, B:211:0x0773, B:213:0x0785, B:215:0x07a3, B:217:0x07ad, B:219:0x07bd, B:220:0x07f3, B:223:0x0803, B:225:0x080a, B:227:0x0814, B:229:0x0818, B:231:0x081c, B:233:0x0820, B:234:0x082c, B:236:0x0832, B:238:0x084d, B:239:0x0856, B:240:0x086a, B:242:0x0885, B:244:0x08b1, B:245:0x08bc, B:247:0x08cd, B:249:0x08d6, B:197:0x0765, B:258:0x08ee, B:260:0x08f3, B:261:0x08fb, B:262:0x0903, B:264:0x0909, B:266:0x091d, B:267:0x0931, B:269:0x0936, B:271:0x0948, B:272:0x094c, B:274:0x095c, B:276:0x0960, B:279:0x0963, B:281:0x0971, B:282:0x09e3, B:284:0x09e8, B:286:0x09f6, B:289:0x09fb, B:290:0x0a24, B:291:0x09fe, B:293:0x0a08, B:294:0x0a0f, B:295:0x0a2d, B:296:0x0a44, B:299:0x0a4c, B:301:0x0a51, B:304:0x0a61, B:306:0x0a7b, B:307:0x0a94, B:309:0x0a9c, B:310:0x0ab9, B:317:0x0aa8, B:318:0x0987, B:320:0x098c, B:322:0x0996, B:323:0x099c, B:328:0x09ae, B:329:0x09b4, B:333:0x0ac9, B:349:0x0127, B:369:0x01cb, B:394:0x0ade, B:395:0x0ae1, B:390:0x0233), top: B:2:0x000b, inners: #10 }] */
    /* JADX WARN: Type inference failed for: r12v44, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.internal.measurement.zzjs] */
    /* JADX WARN: Type inference failed for: r4v108 */
    /* JADX WARN: Type inference failed for: r4v110 */
    /* JADX WARN: Type inference failed for: r4v118 */
    /* JADX WARN: Type inference failed for: r4v119, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v128 */
    /* JADX WARN: Type inference failed for: r4v130 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzd(java.lang.String r40, long r41) {
        /*
            Method dump skipped, instructions count: 2796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2331x394c88.zzd(java.lang.String, long):boolean");
    }

    public final void zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf c2187x394bdf, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 c2183x394bd6) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 m19108x394c64;
        java.lang.String str;
        java.lang.Object m19104x394b8b;
        java.lang.String m19103x394b8a;
        java.lang.Object m19277x754a37bb;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 m19108x394c642;
        java.lang.String str2;
        java.lang.Object m19104x394b8b2;
        java.lang.String m19103x394b8a2;
        java.lang.Object obj;
        boolean z17;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2187x394bdf);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(c2187x394bdf.f6476x362a8ff1);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2187x394bdf.f6475xc3e1af26);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2187x394bdf.f6480x6f0218c);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(c2187x394bdf.f6480x6f0218c.f7021x337a8b);
        mo19164x394b61();
        m19271x394ca6();
        if (android.text.TextUtils.isEmpty(c2183x394bd6.f6456x6f0216a)) {
            return;
        }
        if (!c2183x394bd6.f6462x6f02174) {
            zzg(c2183x394bd6);
            return;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf c2187x394bdf2 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf(c2187x394bdf);
        boolean z18 = false;
        c2187x394bdf2.f6473xab2f7f06 = false;
        m19269x394c6f().m19047xb2c12e75();
        try {
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf zzi = m19269x394c6f().zzi(c2187x394bdf2.f6476x362a8ff1, c2187x394bdf2.f6480x6f0218c.f7021x337a8b);
            if (zzi != null && !zzi.f6475xc3e1af26.equals(c2187x394bdf2.f6475xc3e1af26)) {
                mo18976x394c1e().m19111x394c67().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", mo19172x394c1a().m19103x394b8a(c2187x394bdf2.f6480x6f0218c.f7021x337a8b), c2187x394bdf2.f6475xc3e1af26, zzi.f6475xc3e1af26);
            }
            if (zzi != null && (z17 = zzi.f6473xab2f7f06)) {
                c2187x394bdf2.f6475xc3e1af26 = zzi.f6475xc3e1af26;
                c2187x394bdf2.f6474xe9ef24f7 = zzi.f6474xe9ef24f7;
                c2187x394bdf2.f6479xbe733089 = zzi.f6479xbe733089;
                c2187x394bdf2.f6478xed343d6d = zzi.f6478xed343d6d;
                c2187x394bdf2.f6482x6f0218e = zzi.f6482x6f0218e;
                c2187x394bdf2.f6473xab2f7f06 = z17;
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e c2337x394c8e = c2187x394bdf2.f6480x6f0218c;
                c2187x394bdf2.f6480x6f0218c = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e(c2337x394c8e.f7021x337a8b, zzi.f6480x6f0218c.f7025x6f0230a, c2337x394c8e.m19277x754a37bb(), zzi.f6480x6f0218c.f7022xc3e1af26);
            } else if (android.text.TextUtils.isEmpty(c2187x394bdf2.f6478xed343d6d)) {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e c2337x394c8e2 = c2187x394bdf2.f6480x6f0218c;
                c2187x394bdf2.f6480x6f0218c = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e(c2337x394c8e2.f7021x337a8b, c2187x394bdf2.f6474xe9ef24f7, c2337x394c8e2.m19277x754a37bb(), c2187x394bdf2.f6480x6f0218c.f7022xc3e1af26);
                z18 = true;
                c2187x394bdf2.f6473xab2f7f06 = true;
            }
            if (c2187x394bdf2.f6473xab2f7f06) {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e c2337x394c8e3 = c2187x394bdf2.f6480x6f0218c;
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2339x394c90 c2339x394c90 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2339x394c90(c2187x394bdf2.f6476x362a8ff1, c2187x394bdf2.f6475xc3e1af26, c2337x394c8e3.f7021x337a8b, c2337x394c8e3.f7025x6f0230a, c2337x394c8e3.m19277x754a37bb());
                if (m19269x394c6f().zza(c2339x394c90)) {
                    m19108x394c642 = mo18976x394c1e().m19114x394c6a();
                    str2 = "User property updated immediately";
                    m19104x394b8b2 = c2187x394bdf2.f6476x362a8ff1;
                    m19103x394b8a2 = mo19172x394c1a().m19103x394b8a(c2339x394c90.f7029x337a8b);
                    obj = c2339x394c90.f7031x6ac9171;
                } else {
                    m19108x394c642 = mo18976x394c1e().m19108x394c64();
                    str2 = "(2)Too many active user properties, ignoring";
                    m19104x394b8b2 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(c2187x394bdf2.f6476x362a8ff1);
                    m19103x394b8a2 = mo19172x394c1a().m19103x394b8a(c2339x394c90.f7029x337a8b);
                    obj = c2339x394c90.f7031x6ac9171;
                }
                m19108x394c642.zzd(str2, m19104x394b8b2, m19103x394b8a2, obj);
                if (z18 && c2187x394bdf2.f6482x6f0218e != null) {
                    zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0(c2187x394bdf2.f6482x6f0218e, c2187x394bdf2.f6474xe9ef24f7), c2183x394bd6);
                }
            }
            if (m19269x394c6f().zza(c2187x394bdf2)) {
                m19108x394c64 = mo18976x394c1e().m19114x394c6a();
                str = "Conditional property added";
                m19104x394b8b = c2187x394bdf2.f6476x362a8ff1;
                m19103x394b8a = mo19172x394c1a().m19103x394b8a(c2187x394bdf2.f6480x6f0218c.f7021x337a8b);
                m19277x754a37bb = c2187x394bdf2.f6480x6f0218c.m19277x754a37bb();
            } else {
                m19108x394c64 = mo18976x394c1e().m19108x394c64();
                str = "Too many conditional properties, ignoring";
                m19104x394b8b = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(c2187x394bdf2.f6476x362a8ff1);
                m19103x394b8a = mo19172x394c1a().m19103x394b8a(c2187x394bdf2.f6480x6f0218c.f7021x337a8b);
                m19277x754a37bb = c2187x394bdf2.f6480x6f0218c.m19277x754a37bb();
            }
            m19108x394c64.zzd(str, m19104x394b8b, m19103x394b8a, m19277x754a37bb);
            m19269x394c6f().m19050x576b60d6();
        } finally {
            m19269x394c6f().m19048x7d3c6b03();
        }
    }

    public final void zzc(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf c2187x394bdf, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 c2183x394bd6) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2187x394bdf);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(c2187x394bdf.f6476x362a8ff1);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2187x394bdf.f6480x6f0218c);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(c2187x394bdf.f6480x6f0218c.f7021x337a8b);
        mo19164x394b61();
        m19271x394ca6();
        if (android.text.TextUtils.isEmpty(c2183x394bd6.f6456x6f0216a)) {
            return;
        }
        if (!c2183x394bd6.f6462x6f02174) {
            zzg(c2183x394bd6);
            return;
        }
        m19269x394c6f().m19047xb2c12e75();
        try {
            zzg(c2183x394bd6);
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf zzi = m19269x394c6f().zzi(c2187x394bdf.f6476x362a8ff1, c2187x394bdf.f6480x6f0218c.f7021x337a8b);
            if (zzi != null) {
                mo18976x394c1e().m19114x394c6a().zze("Removing conditional user property", c2187x394bdf.f6476x362a8ff1, mo19172x394c1a().m19103x394b8a(c2187x394bdf.f6480x6f0218c.f7021x337a8b));
                m19269x394c6f().zzj(c2187x394bdf.f6476x362a8ff1, c2187x394bdf.f6480x6f0218c.f7021x337a8b);
                if (zzi.f6473xab2f7f06) {
                    m19269x394c6f().zzg(c2187x394bdf.f6476x362a8ff1, c2187x394bdf.f6480x6f0218c.f7021x337a8b);
                }
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0 c2204x394bf0 = c2187x394bdf.f6483x6f0218f;
                if (c2204x394bf0 != null) {
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2201x394bed c2201x394bed = c2204x394bf0.f6532x6f021ac;
                    android.os.Bundle m19082x394c5d = c2201x394bed != null ? c2201x394bed.m19082x394c5d() : null;
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96 mo19173x394c1b = mo19173x394c1b();
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0 c2204x394bf02 = c2187x394bdf.f6483x6f0218f;
                    zzc(mo19173x394c1b.zza(c2204x394bf02.f6530x337a8b, m19082x394c5d, zzi.f6475xc3e1af26, c2204x394bf02.f6533x6f021bc, true, false), c2183x394bd6);
                }
            } else {
                mo18976x394c1e().m19111x394c67().zze("Conditional user property doesn't exist", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(c2187x394bdf.f6476x362a8ff1), mo19172x394c1a().m19103x394b8a(c2187x394bdf.f6480x6f0218c.f7021x337a8b));
            }
            m19269x394c6f().m19050x576b60d6();
        } finally {
            m19269x394c6f().m19048x7d3c6b03();
        }
    }

    public final void zzg(java.lang.Runnable runnable) {
        mo19164x394b61();
        if (this.f6998x6f022f9 == null) {
            this.f6998x6f022f9 = new java.util.ArrayList();
        }
        this.f6998x6f022f9.add(runnable);
    }

    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 zza(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, boolean z19, long j17) {
        java.lang.String str3;
        int i17;
        java.lang.String str4;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            mo18976x394c1e().m19108x394c64().log("PackageManager is null, can not log app install information");
            return null;
        }
        try {
            str3 = packageManager.getInstallerPackageName(str);
        } catch (java.lang.IllegalArgumentException unused) {
            mo18976x394c1e().m19108x394c64().zzg("Error retrieving installer package name. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str));
            str3 = "Unknown";
        }
        if (str3 == null) {
            str3 = "manual_install";
        } else if ("com.android.vending".equals(str3)) {
            str3 = "";
        }
        java.lang.String str5 = str3;
        try {
            android.content.pm.PackageInfo m18639xffec0de = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p220x84170e40.C2020x87f17260.m18642x2e2c3887(context).m18639xffec0de(str, 0);
            if (m18639xffec0de != null) {
                java.lang.CharSequence m18637xa6cfc2fa = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p220x84170e40.C2020x87f17260.m18642x2e2c3887(context).m18637xa6cfc2fa(str);
                if (!android.text.TextUtils.isEmpty(m18637xa6cfc2fa)) {
                    m18637xa6cfc2fa.toString();
                }
                java.lang.String str6 = m18639xffec0de.versionName;
                i17 = m18639xffec0de.versionCode;
                str4 = str6;
            } else {
                i17 = Integer.MIN_VALUE;
                str4 = "Unknown";
            }
            return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6(str, str2, str4, i17, str5, 12451L, mo19173x394c1b().zzd(context, str), (java.lang.String) null, z17, false, "", 0L, mo19176x394c20().m19032x394b7f(str) ? j17 : 0L, 0, z18, z19, false);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
            mo18976x394c1e().m19108x394c64().zze("Error retrieving newly installed package info. appId, appName", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str), "Unknown");
            return null;
        }
    }

    public final void zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0 c2204x394bf0, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 c2183x394bd6) {
        java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf> zzb;
        java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf> zzb2;
        java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf> zzb3;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 m19108x394c64;
        java.lang.String str;
        java.lang.Object m19104x394b8b;
        java.lang.String m19103x394b8a;
        java.lang.Object obj;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2183x394bd6);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(c2183x394bd6.f6455x362a8ff1);
        mo19164x394b61();
        m19271x394ca6();
        java.lang.String str2 = c2183x394bd6.f6455x362a8ff1;
        long j17 = c2204x394bf0.f6533x6f021bc;
        mo19173x394c1b();
        if (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zzd(c2204x394bf0, c2183x394bd6)) {
            if (!c2183x394bd6.f6462x6f02174) {
                zzg(c2183x394bd6);
                return;
            }
            m19269x394c6f().m19047xb2c12e75();
            try {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2192x394be4 m19269x394c6f = m19269x394c6f();
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str2);
                m19269x394c6f.mo18961x394b61();
                m19269x394c6f.m19257x394ba5();
                if (j17 < 0) {
                    m19269x394c6f.mo18976x394c1e().m19111x394c67().zze("Invalid time querying timed out conditional properties", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str2), java.lang.Long.valueOf(j17));
                    zzb = java.util.Collections.emptyList();
                } else {
                    zzb = m19269x394c6f.zzb("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new java.lang.String[]{str2, java.lang.String.valueOf(j17)});
                }
                for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf c2187x394bdf : zzb) {
                    if (c2187x394bdf != null) {
                        mo18976x394c1e().m19114x394c6a().zzd("User property timed out", c2187x394bdf.f6476x362a8ff1, mo19172x394c1a().m19103x394b8a(c2187x394bdf.f6480x6f0218c.f7021x337a8b), c2187x394bdf.f6480x6f0218c.m19277x754a37bb());
                        if (c2187x394bdf.f6481x6f0218d != null) {
                            zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0(c2187x394bdf.f6481x6f0218d, j17), c2183x394bd6);
                        }
                        m19269x394c6f().zzj(str2, c2187x394bdf.f6480x6f0218c.f7021x337a8b);
                    }
                }
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2192x394be4 m19269x394c6f2 = m19269x394c6f();
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str2);
                m19269x394c6f2.mo18961x394b61();
                m19269x394c6f2.m19257x394ba5();
                if (j17 < 0) {
                    m19269x394c6f2.mo18976x394c1e().m19111x394c67().zze("Invalid time querying expired conditional properties", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str2), java.lang.Long.valueOf(j17));
                    zzb2 = java.util.Collections.emptyList();
                } else {
                    zzb2 = m19269x394c6f2.zzb("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new java.lang.String[]{str2, java.lang.String.valueOf(j17)});
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(zzb2.size());
                for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf c2187x394bdf2 : zzb2) {
                    if (c2187x394bdf2 != null) {
                        mo18976x394c1e().m19114x394c6a().zzd("User property expired", c2187x394bdf2.f6476x362a8ff1, mo19172x394c1a().m19103x394b8a(c2187x394bdf2.f6480x6f0218c.f7021x337a8b), c2187x394bdf2.f6480x6f0218c.m19277x754a37bb());
                        m19269x394c6f().zzg(str2, c2187x394bdf2.f6480x6f0218c.f7021x337a8b);
                        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0 c2204x394bf02 = c2187x394bdf2.f6483x6f0218f;
                        if (c2204x394bf02 != null) {
                            arrayList.add(c2204x394bf02);
                        }
                        m19269x394c6f().zzj(str2, c2187x394bdf2.f6480x6f0218c.f7021x337a8b);
                    }
                }
                int size = arrayList.size();
                int i17 = 0;
                while (i17 < size) {
                    java.lang.Object obj2 = arrayList.get(i17);
                    i17++;
                    zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0((com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0) obj2, j17), c2183x394bd6);
                }
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2192x394be4 m19269x394c6f3 = m19269x394c6f();
                java.lang.String str3 = c2204x394bf0.f6530x337a8b;
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str2);
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str3);
                m19269x394c6f3.mo18961x394b61();
                m19269x394c6f3.m19257x394ba5();
                if (j17 < 0) {
                    m19269x394c6f3.mo18976x394c1e().m19111x394c67().zzd("Invalid time querying triggered conditional properties", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str2), m19269x394c6f3.mo18972x394c1a().m19101x394b88(str3), java.lang.Long.valueOf(j17));
                    zzb3 = java.util.Collections.emptyList();
                } else {
                    zzb3 = m19269x394c6f3.zzb("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new java.lang.String[]{str2, str3, java.lang.String.valueOf(j17)});
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(zzb3.size());
                for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf c2187x394bdf3 : zzb3) {
                    if (c2187x394bdf3 != null) {
                        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e c2337x394c8e = c2187x394bdf3.f6480x6f0218c;
                        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2339x394c90 c2339x394c90 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2339x394c90(c2187x394bdf3.f6476x362a8ff1, c2187x394bdf3.f6475xc3e1af26, c2337x394c8e.f7021x337a8b, j17, c2337x394c8e.m19277x754a37bb());
                        if (m19269x394c6f().zza(c2339x394c90)) {
                            m19108x394c64 = mo18976x394c1e().m19114x394c6a();
                            str = "User property triggered";
                            m19104x394b8b = c2187x394bdf3.f6476x362a8ff1;
                            m19103x394b8a = mo19172x394c1a().m19103x394b8a(c2339x394c90.f7029x337a8b);
                            obj = c2339x394c90.f7031x6ac9171;
                        } else {
                            m19108x394c64 = mo18976x394c1e().m19108x394c64();
                            str = "Too many active user properties, ignoring";
                            m19104x394b8b = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(c2187x394bdf3.f6476x362a8ff1);
                            m19103x394b8a = mo19172x394c1a().m19103x394b8a(c2339x394c90.f7029x337a8b);
                            obj = c2339x394c90.f7031x6ac9171;
                        }
                        m19108x394c64.zzd(str, m19104x394b8b, m19103x394b8a, obj);
                        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0 c2204x394bf03 = c2187x394bdf3.f6482x6f0218e;
                        if (c2204x394bf03 != null) {
                            arrayList2.add(c2204x394bf03);
                        }
                        c2187x394bdf3.f6480x6f0218c = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e(c2339x394c90);
                        c2187x394bdf3.f6473xab2f7f06 = true;
                        m19269x394c6f().zza(c2187x394bdf3);
                    }
                }
                zzc(c2204x394bf0, c2183x394bd6);
                int size2 = arrayList2.size();
                int i18 = 0;
                while (i18 < size2) {
                    java.lang.Object obj3 = arrayList2.get(i18);
                    i18++;
                    zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0((com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0) obj3, j17), c2183x394bd6);
                }
                m19269x394c6f().m19050x576b60d6();
            } finally {
                m19269x394c6f().m19048x7d3c6b03();
            }
        }
    }

    public final void zzc(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0 c2204x394bf0, java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2182x394bd5 m19053x394b81 = m19269x394c6f().m19053x394b81(str);
        if (m19053x394b81 == null || android.text.TextUtils.isEmpty(m19053x394b81.m18985x394b66())) {
            mo18976x394c1e().m19114x394c6a().zzg("No app data available; dropping event", str);
            return;
        }
        java.lang.Boolean zzc = zzc(m19053x394b81);
        if (zzc == null) {
            if (!"_ui".equals(c2204x394bf0.f6530x337a8b)) {
                mo18976x394c1e().m19111x394c67().zzg("Could not find package. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str));
            }
        } else if (!zzc.booleanValue()) {
            mo18976x394c1e().m19108x394c64().zzg("App version does not match; dropping event. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str));
            return;
        }
        zzb(c2204x394bf0, new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6(str, m19053x394b81.m18980x9061da68(), m19053x394b81.m18985x394b66(), m19053x394b81.m18998x394c26(), m19053x394b81.m18999x394c27(), m19053x394b81.m19000x394c28(), m19053x394b81.m19001x394c29(), (java.lang.String) null, m19053x394b81.m18981x38846eaf(), false, m19053x394b81.m18995x394c23(), m19053x394b81.m19014x394c3b(), 0L, 0, m19053x394b81.m19015x394c3c(), m19053x394b81.m19016x394c3d(), false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0142, code lost:
    
        mo19175x394c1f().f6650x6f0222e.set(mo18962x394b92().mo18536x5cbba1cc());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(int r10, java.lang.Throwable r11, byte[] r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2331x394c88.zza(int, java.lang.Throwable, byte[], java.lang.String):void");
    }

    public final void zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2330x394c87 abstractC2330x394c87) {
        this.f6999x6f022fa++;
    }

    public final void zzc(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e c2337x394c8e, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 c2183x394bd6) {
        mo19164x394b61();
        m19271x394ca6();
        if (android.text.TextUtils.isEmpty(c2183x394bd6.f6456x6f0216a)) {
            return;
        }
        if (!c2183x394bd6.f6462x6f02174) {
            zzg(c2183x394bd6);
            return;
        }
        mo18976x394c1e().m19114x394c6a().zzg("Removing user property", mo19172x394c1a().m19103x394b8a(c2337x394c8e.f7021x337a8b));
        m19269x394c6f().m19047xb2c12e75();
        try {
            zzg(c2183x394bd6);
            m19269x394c6f().zzg(c2183x394bd6.f6455x362a8ff1, c2337x394c8e.f7021x337a8b);
            m19269x394c6f().m19050x576b60d6();
            mo18976x394c1e().m19114x394c6a().zzg("User property removed", mo19172x394c1a().m19103x394b8a(c2337x394c8e.f7021x337a8b));
        } finally {
            m19269x394c6f().m19048x7d3c6b03();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0565, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzc(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0 r34, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 r35) {
        /*
            Method dump skipped, instructions count: 1563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2331x394c88.zzc(com.google.android.gms.internal.measurement.zzeu, com.google.android.gms.internal.measurement.zzdz):void");
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 c2247x394c25) {
        this.f6989x6f02155 = c2247x394c25;
    }

    public final void zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e c2337x394c8e, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 c2183x394bd6) {
        mo19164x394b61();
        m19271x394ca6();
        if (android.text.TextUtils.isEmpty(c2183x394bd6.f6456x6f0216a)) {
            return;
        }
        if (!c2183x394bd6.f6462x6f02174) {
            zzg(c2183x394bd6);
            return;
        }
        int m19287x394ba3 = mo19173x394c1b().m19287x394ba3(c2337x394c8e.f7021x337a8b);
        int i17 = 0;
        if (m19287x394ba3 != 0) {
            mo19173x394c1b();
            java.lang.String zza = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zza(c2337x394c8e.f7021x337a8b, 24, true);
            java.lang.String str = c2337x394c8e.f7021x337a8b;
            mo19173x394c1b().zza(c2183x394bd6.f6455x362a8ff1, m19287x394ba3, "_ev", zza, str != null ? str.length() : 0);
            return;
        }
        int zzi = mo19173x394c1b().zzi(c2337x394c8e.f7021x337a8b, c2337x394c8e.m19277x754a37bb());
        if (zzi != 0) {
            mo19173x394c1b();
            java.lang.String zza2 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zza(c2337x394c8e.f7021x337a8b, 24, true);
            java.lang.Object m19277x754a37bb = c2337x394c8e.m19277x754a37bb();
            if (m19277x754a37bb != null && ((m19277x754a37bb instanceof java.lang.String) || (m19277x754a37bb instanceof java.lang.CharSequence))) {
                i17 = java.lang.String.valueOf(m19277x754a37bb).length();
            }
            mo19173x394c1b().zza(c2183x394bd6.f6455x362a8ff1, zzi, "_ev", zza2, i17);
            return;
        }
        java.lang.Object zzj = mo19173x394c1b().zzj(c2337x394c8e.f7021x337a8b, c2337x394c8e.m19277x754a37bb());
        if (zzj == null) {
            return;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2339x394c90 c2339x394c90 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2339x394c90(c2183x394bd6.f6455x362a8ff1, c2337x394c8e.f7022xc3e1af26, c2337x394c8e.f7021x337a8b, c2337x394c8e.f7025x6f0230a, zzj);
        mo18976x394c1e().m19114x394c6a().zze("Setting user property", mo19172x394c1a().m19103x394b8a(c2339x394c90.f7029x337a8b), zzj);
        m19269x394c6f().m19047xb2c12e75();
        try {
            zzg(c2183x394bd6);
            boolean zza3 = m19269x394c6f().zza(c2339x394c90);
            m19269x394c6f().m19050x576b60d6();
            if (zza3) {
                mo18976x394c1e().m19114x394c6a().zze("User property set", mo19172x394c1a().m19103x394b8a(c2339x394c90.f7029x337a8b), c2339x394c90.f7031x6ac9171);
            } else {
                mo18976x394c1e().m19108x394c64().zze("Too many unique user properties are set. Ignoring user property", mo19172x394c1a().m19103x394b8a(c2339x394c90.f7029x337a8b), c2339x394c90.f7031x6ac9171);
                mo19173x394c1b().zza(c2183x394bd6.f6455x362a8ff1, 9, (java.lang.String) null, (java.lang.String) null, 0);
            }
        } finally {
            m19269x394c6f().m19048x7d3c6b03();
        }
    }

    private static void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2330x394c87 abstractC2330x394c87) {
        if (abstractC2330x394c87 == null) {
            throw new java.lang.IllegalStateException("Upload component not created");
        }
        if (abstractC2330x394c87.m19256xf582434a()) {
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(abstractC2330x394c87.getClass());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 27);
        sb6.append("Component not initialized: ");
        sb6.append(valueOf);
        throw new java.lang.IllegalStateException(sb6.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
    
        mo19175x394c1f().f6650x6f0222e.set(mo18962x394b92().mo18536x5cbba1cc());
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0120 A[Catch: all -> 0x0163, TryCatch #0 {all -> 0x0163, blocks: (B:5:0x0027, B:12:0x0043, B:13:0x0157, B:24:0x005d, B:31:0x00a4, B:32:0x00b5, B:35:0x00bd, B:37:0x00c9, B:39:0x00cf, B:43:0x00dc, B:46:0x010c, B:48:0x0120, B:49:0x0144, B:51:0x014e, B:53:0x0154, B:54:0x012e, B:55:0x00f3, B:57:0x00fd), top: B:4:0x0027, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012e A[Catch: all -> 0x0163, TryCatch #0 {all -> 0x0163, blocks: (B:5:0x0027, B:12:0x0043, B:13:0x0157, B:24:0x005d, B:31:0x00a4, B:32:0x00b5, B:35:0x00bd, B:37:0x00c9, B:39:0x00cf, B:43:0x00dc, B:46:0x010c, B:48:0x0120, B:49:0x0144, B:51:0x014e, B:53:0x0154, B:54:0x012e, B:55:0x00f3, B:57:0x00fd), top: B:4:0x0027, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2331x394c88.zzb(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2336x394c8d c2336x394c8d) {
        mo19164x394b61();
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2192x394be4 c2192x394be4 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2192x394be4(this.f6989x6f02155);
        c2192x394be4.zzm();
        this.f6992x6f022f3 = c2192x394be4;
        mo19176x394c20().zza(this.f6990x6f022f1);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2185x394bdd c2185x394bdd = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2185x394bdd(this.f6989x6f02155);
        c2185x394bdd.zzm();
        this.f6995x6f022f6 = c2185x394bdd;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2327x394c84 c2327x394c84 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2327x394c84(this.f6989x6f02155);
        c2327x394c84.zzm();
        this.f6994x6f022f5 = c2327x394c84;
        this.f6993x6f022f4 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2225x394c0a(this.f6989x6f02155);
        if (this.f6999x6f022fa != this.f7000x6f022fb) {
            mo18976x394c1e().m19108x394c64().zze("Not all upload components initialized", java.lang.Integer.valueOf(this.f6999x6f022fa), java.lang.Integer.valueOf(this.f7000x6f022fb));
        }
        this.f7009x394df9 = true;
    }

    private final boolean zza(int i17, java.nio.channels.FileChannel fileChannel) {
        mo19164x394b61();
        if (fileChannel == null || !fileChannel.isOpen()) {
            mo18976x394c1e().m19108x394c64().log("Bad channel to read from");
            return false;
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
        allocate.putInt(i17);
        allocate.flip();
        try {
            fileChannel.truncate(0L);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                mo18976x394c1e().m19108x394c64().zzg("Error writing to channel. Bytes written", java.lang.Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (java.io.IOException e17) {
            mo18976x394c1e().m19108x394c64().zzg("Failed to write to channel", e17);
            return false;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:15|(1:17)(1:33)|18|(2:20|(3:22|23|(1:25)))|26|27|28|29|23|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ef, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f0, code lost:
    
        r0.mo18976x394c1e().m19108x394c64().zze("Error pruning currencies. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(r14), r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zza(java.lang.String r14, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0 r15) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2331x394c88.zza(java.lang.String, com.google.android.gms.internal.measurement.zzeu):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final byte[] zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0 c2204x394bf0, java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2339x394c90 c2339x394c90;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6 c2356x394ca6;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2355x394ca5 c2355x394ca5;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2182x394bd5 c2182x394bd5;
        byte[] bArr;
        android.os.Bundle bundle;
        long j17;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 m19111x394c67;
        java.lang.String str2;
        java.lang.Object m19104x394b8b;
        m19271x394ca6();
        mo19164x394b61();
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25.m19161x394c0c();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2204x394bf0);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2355x394ca5 c2355x394ca52 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2355x394ca5();
        m19269x394c6f().m19047xb2c12e75();
        try {
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2182x394bd5 m19053x394b81 = m19269x394c6f().m19053x394b81(str);
            if (m19053x394b81 == null) {
                mo18976x394c1e().m19114x394c6a().zzg("Log and bundle not available. package_name", str);
            } else {
                if (m19053x394b81.m18981x38846eaf()) {
                    if (("_iap".equals(c2204x394bf0.f6530x337a8b) || ya.a.f77439xd6514440.equals(c2204x394bf0.f6530x337a8b)) && !zza(str, c2204x394bf0)) {
                        mo18976x394c1e().m19111x394c67().zzg("Failed to handle purchase event at single event bundle creation. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str));
                    }
                    boolean m19027x394b75 = mo19176x394c20().m19027x394b75(str);
                    java.lang.Long l17 = 0L;
                    if (m19027x394b75 && "_e".equals(c2204x394bf0.f6530x337a8b)) {
                        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2201x394bed c2201x394bed = c2204x394bf0.f6532x6f021ac;
                        if (c2201x394bed != null && c2201x394bed.m19079x35e001() != 0) {
                            if (c2204x394bf0.f6532x6f021ac.m19077xfb822ef2("_et") == null) {
                                m19111x394c67 = mo18976x394c1e().m19111x394c67();
                                str2 = "The engagement event does not include duration. appId";
                                m19104x394b8b = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str);
                                m19111x394c67.zzg(str2, m19104x394b8b);
                            } else {
                                l17 = c2204x394bf0.f6532x6f021ac.m19077xfb822ef2("_et");
                            }
                        }
                        m19111x394c67 = mo18976x394c1e().m19111x394c67();
                        str2 = "The engagement event does not contain any parameters. appId";
                        m19104x394b8b = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str);
                        m19111x394c67.zzg(str2, m19104x394b8b);
                    }
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6 c2356x394ca62 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6();
                    c2355x394ca52.f7100x6f02353 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6[]{c2356x394ca62};
                    c2356x394ca62.f7108x6f02355 = 1;
                    c2356x394ca62.f7116x6f0235d = com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f;
                    c2356x394ca62.f7138x394db5 = m19053x394b81.m18986x394b67();
                    c2356x394ca62.f7105x6f02171 = m19053x394b81.m18999x394c27();
                    c2356x394ca62.f7137x394db4 = m19053x394b81.m18985x394b66();
                    long m18998x394c26 = m19053x394b81.m18998x394c26();
                    c2356x394ca62.f7128x6f0236e = m18998x394c26 == -2147483648L ? null : java.lang.Integer.valueOf((int) m18998x394c26);
                    c2356x394ca62.f7120x6f02361 = java.lang.Long.valueOf(m19053x394b81.m19000x394c28());
                    c2356x394ca62.f7103x6f0216a = m19053x394b81.m18980x9061da68();
                    c2356x394ca62.f7124x6f02365 = java.lang.Long.valueOf(m19053x394b81.m19001x394c29());
                    if (this.f6989x6f02155.m19162x7d80d2b7() && com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2189x394be1.m19022x394c43() && mo19176x394c20().m19025x394b73(c2356x394ca62.f7138x394db5)) {
                        c2356x394ca62.f7134x6f02374 = null;
                    }
                    android.util.Pair<java.lang.String, java.lang.Boolean> m19125x394b8d = mo19175x394c1f().m19125x394b8d(m19053x394b81.m18986x394b67());
                    if (m19053x394b81.m19015x394c3c() && m19125x394b8d != null && !android.text.TextUtils.isEmpty((java.lang.CharSequence) m19125x394b8d.first)) {
                        c2356x394ca62.f7122x6f02363 = (java.lang.String) m19125x394b8d.first;
                        c2356x394ca62.f7123x6f02364 = (java.lang.Boolean) m19125x394b8d.second;
                    }
                    mo19168x394c11().m19186x394ba5();
                    c2356x394ca62.f7118x6f0235f = android.os.Build.MODEL;
                    mo19168x394c11().m19186x394ba5();
                    c2356x394ca62.f7117x6f0235e = android.os.Build.VERSION.RELEASE;
                    c2356x394ca62.f7119x6f02360 = java.lang.Integer.valueOf((int) mo19168x394c11().m19070x394c5a());
                    c2356x394ca62.f7107x6f021a9 = mo19168x394c11().m19071x394c5b();
                    c2356x394ca62.f7102x6f02169 = m19053x394b81.m18979x4b6169db();
                    c2356x394ca62.f7104x6f0216c = m19053x394b81.m18995x394c23();
                    java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2339x394c90> m19052x394b80 = m19269x394c6f().m19052x394b80(m19053x394b81.m18986x394b67());
                    c2356x394ca62.f7110x6f02357 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2358x394ca8[m19052x394b80.size()];
                    if (m19027x394b75) {
                        c2339x394c90 = m19269x394c6f().zzh(c2356x394ca62.f7138x394db5, "_lte");
                        if (c2339x394c90 != null && c2339x394c90.f7031x6ac9171 != null) {
                            if (l17.longValue() > 0) {
                                c2339x394c90 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2339x394c90(c2356x394ca62.f7138x394db5, "auto", "_lte", mo18962x394b92().mo18536x5cbba1cc(), java.lang.Long.valueOf(((java.lang.Long) c2339x394c90.f7031x6ac9171).longValue() + l17.longValue()));
                            }
                        }
                        c2339x394c90 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2339x394c90(c2356x394ca62.f7138x394db5, "auto", "_lte", mo18962x394b92().mo18536x5cbba1cc(), l17);
                    } else {
                        c2339x394c90 = null;
                    }
                    int i17 = 0;
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2358x394ca8 c2358x394ca8 = null;
                    while (i17 < m19052x394b80.size()) {
                        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2358x394ca8 c2358x394ca82 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2358x394ca8();
                        c2356x394ca62.f7110x6f02357[i17] = c2358x394ca82;
                        c2358x394ca82.f7142x337a8b = m19052x394b80.get(i17).f7029x337a8b;
                        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2182x394bd5 c2182x394bd52 = m19053x394b81;
                        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2355x394ca5 c2355x394ca53 = c2355x394ca52;
                        c2358x394ca82.f7147x6f0237a = java.lang.Long.valueOf(m19052x394b80.get(i17).f7032x6f0230a);
                        mo19173x394c1b().zza(c2358x394ca82, m19052x394b80.get(i17).f7031x6ac9171);
                        if (m19027x394b75 && "_lte".equals(c2358x394ca82.f7142x337a8b)) {
                            c2358x394ca82.f7146x6f02352 = (java.lang.Long) c2339x394c90.f7031x6ac9171;
                            c2358x394ca82.f7147x6f0237a = java.lang.Long.valueOf(mo18962x394b92().mo18536x5cbba1cc());
                            c2358x394ca8 = c2358x394ca82;
                        }
                        i17++;
                        c2355x394ca52 = c2355x394ca53;
                        m19053x394b81 = c2182x394bd52;
                    }
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2182x394bd5 c2182x394bd53 = m19053x394b81;
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2355x394ca5 c2355x394ca54 = c2355x394ca52;
                    if (m19027x394b75 && c2358x394ca8 == null) {
                        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2358x394ca8 c2358x394ca83 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2358x394ca8();
                        c2358x394ca83.f7142x337a8b = "_lte";
                        c2358x394ca83.f7147x6f0237a = java.lang.Long.valueOf(mo18962x394b92().mo18536x5cbba1cc());
                        c2358x394ca83.f7146x6f02352 = (java.lang.Long) c2339x394c90.f7031x6ac9171;
                        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2358x394ca8[] c2358x394ca8Arr = c2356x394ca62.f7110x6f02357;
                        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2358x394ca8[] c2358x394ca8Arr2 = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2358x394ca8[]) java.util.Arrays.copyOf(c2358x394ca8Arr, c2358x394ca8Arr.length + 1);
                        c2356x394ca62.f7110x6f02357 = c2358x394ca8Arr2;
                        c2358x394ca8Arr2[c2358x394ca8Arr2.length - 1] = c2358x394ca83;
                    }
                    if (l17.longValue() > 0) {
                        m19269x394c6f().zza(c2339x394c90);
                    }
                    android.os.Bundle m19082x394c5d = c2204x394bf0.f6532x6f021ac.m19082x394c5d();
                    if ("_iap".equals(c2204x394bf0.f6530x337a8b)) {
                        m19082x394c5d.putLong("_c", 1L);
                        mo18976x394c1e().m19114x394c6a().log("Marking in-app purchase as real-time");
                        m19082x394c5d.putLong("_r", 1L);
                    }
                    m19082x394c5d.putString("_o", c2204x394bf0.f6531xc3e1af26);
                    if (mo19173x394c1b().m19289x394ba7(c2356x394ca62.f7138x394db5)) {
                        mo19173x394c1b().zza(m19082x394c5d, "_dbg", (java.lang.Object) 1L);
                        mo19173x394c1b().zza(m19082x394c5d, "_r", (java.lang.Object) 1L);
                    }
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2200x394bec zzf = m19269x394c6f().zzf(str, c2204x394bf0.f6530x337a8b);
                    if (zzf == null) {
                        bArr = null;
                        c2356x394ca6 = c2356x394ca62;
                        c2182x394bd5 = c2182x394bd53;
                        c2355x394ca5 = c2355x394ca54;
                        bundle = m19082x394c5d;
                        m19269x394c6f().zza(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2200x394bec(str, c2204x394bf0.f6530x337a8b, 1L, 0L, c2204x394bf0.f6533x6f021bc, 0L, null, null, null));
                        j17 = 0;
                    } else {
                        c2356x394ca6 = c2356x394ca62;
                        c2355x394ca5 = c2355x394ca54;
                        c2182x394bd5 = c2182x394bd53;
                        bArr = null;
                        bundle = m19082x394c5d;
                        long j18 = zzf.f6519x6f021af;
                        m19269x394c6f().zza(zzf.m19073x394b62(c2204x394bf0.f6533x6f021bc).m19075x394c5c());
                        j17 = j18;
                    }
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2199x394beb c2199x394beb = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2199x394beb(this.f6989x6f02155, c2204x394bf0.f6531xc3e1af26, str, c2204x394bf0.f6530x337a8b, c2204x394bf0.f6533x6f021bc, j17, bundle);
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2353x394ca3 c2353x394ca3 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2353x394ca3();
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6 c2356x394ca63 = c2356x394ca6;
                    c2356x394ca63.f7109x6f02356 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2353x394ca3[]{c2353x394ca3};
                    c2353x394ca3.f7092x6f0234f = java.lang.Long.valueOf(c2199x394beb.f6512x3492916);
                    c2353x394ca3.f7090x337a8b = c2199x394beb.f6510x337a8b;
                    c2353x394ca3.f7093x6f02350 = java.lang.Long.valueOf(c2199x394beb.f6513x6f021ab);
                    c2353x394ca3.f7091x6f0234e = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4[c2199x394beb.f6514x6f021ac.m19079x35e001()];
                    java.util.Iterator<java.lang.String> it = c2199x394beb.f6514x6f021ac.iterator();
                    int i18 = 0;
                    while (it.hasNext()) {
                        java.lang.String next = it.next();
                        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4 c2354x394ca4 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4();
                        c2353x394ca3.f7091x6f0234e[i18] = c2354x394ca4;
                        c2354x394ca4.f7095x337a8b = next;
                        mo19173x394c1b().zza(c2354x394ca4, c2199x394beb.f6514x6f021ac.get(next));
                        i18++;
                    }
                    c2356x394ca63.f7127x6f0236d = zza(c2182x394bd5.m18986x394b67(), c2356x394ca63.f7110x6f02357, c2356x394ca63.f7109x6f02356);
                    java.lang.Long l18 = c2353x394ca3.f7092x6f0234f;
                    c2356x394ca63.f7112x6f02359 = l18;
                    c2356x394ca63.f7113x6f0235a = l18;
                    long m18997x394c25 = c2182x394bd5.m18997x394c25();
                    c2356x394ca63.f7115x6f0235c = m18997x394c25 != 0 ? java.lang.Long.valueOf(m18997x394c25) : bArr;
                    long m18996x394c24 = c2182x394bd5.m18996x394c24();
                    if (m18996x394c24 != 0) {
                        m18997x394c25 = m18996x394c24;
                    }
                    c2356x394ca63.f7114x6f0235b = m18997x394c25 != 0 ? java.lang.Long.valueOf(m18997x394c25) : bArr;
                    c2182x394bd5.m19005x394c2d();
                    c2356x394ca63.f7125x6f02366 = java.lang.Integer.valueOf((int) c2182x394bd5.m19002x394c2a());
                    c2356x394ca63.f7121x6f02362 = 12451L;
                    c2356x394ca63.f7111x6f02358 = java.lang.Long.valueOf(mo18962x394b92().mo18536x5cbba1cc());
                    c2356x394ca63.f7126x6f02367 = java.lang.Boolean.TRUE;
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2182x394bd5 c2182x394bd54 = c2182x394bd5;
                    c2182x394bd54.zzm(c2356x394ca63.f7112x6f02359.longValue());
                    c2182x394bd54.zzn(c2356x394ca63.f7113x6f0235a.longValue());
                    m19269x394c6f().zza(c2182x394bd54);
                    m19269x394c6f().m19050x576b60d6();
                    try {
                        int m18953x394df7 = c2355x394ca5.m18953x394df7();
                        byte[] bArr2 = new byte[m18953x394df7];
                        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136 zzb = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzb(bArr2, 0, m18953x394df7);
                        c2355x394ca5.zza(zzb);
                        zzb.m18920x394def();
                        return mo19173x394c1b().zza(bArr2);
                    } catch (java.io.IOException e17) {
                        mo18976x394c1e().m19108x394c64().zze("Data loss. Failed to bundle and serialize. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str), e17);
                        return bArr;
                    }
                }
                mo18976x394c1e().m19114x394c6a().zzg("Log and bundle disabled. package_name", str);
            }
            return new byte[0];
        } finally {
            m19269x394c6f().m19048x7d3c6b03();
        }
    }

    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2352x394ca2[] zza(java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2358x394ca8[] c2358x394ca8Arr, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2353x394ca3[] c2353x394ca3Arr) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        return m19268x394c6e().zza(str, c2353x394ca3Arr, c2358x394ca8Arr);
    }
}
