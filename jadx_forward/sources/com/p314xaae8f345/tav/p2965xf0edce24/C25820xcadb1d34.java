package com.p314xaae8f345.tav.p2965xf0edce24;

/* renamed from: com.tencent.tav.extractor.AssetExtractor */
/* loaded from: classes16.dex */
public class C25820xcadb1d34 implements java.lang.Cloneable {

    /* renamed from: SAMPLE_FLAG_ENCRYPTED */
    public static final int f48539xc54d1fc6 = 2;

    /* renamed from: SAMPLE_FLAG_SYNC */
    public static final int f48540xcbd96f39 = 1;

    /* renamed from: SEEK_TO_CLOSEST_SYNC */
    public static final int f48541xf3f8185e = 2;

    /* renamed from: SEEK_TO_NEXT_SYNC */
    public static final int f48542xeaa7760a = 1;

    /* renamed from: SEEK_TO_PREVIOUS_SYNC */
    public static final int f48543xb4692706 = 0;
    private final java.lang.String TAG;

    /* renamed from: _hellAccFlag_ */
    private byte f48544x7f11beae;

    /* renamed from: delegate */
    private com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680 f48545x30d5dd85;

    /* renamed from: duration */
    private long f48546x89444d94;

    /* renamed from: mNativeContext */
    private long f48547x5abc8e2b;

    /* renamed from: preferRotation */
    private int f48548xcc7d15ae;

    /* renamed from: released */
    private boolean f48549xdf23d93d;

    /* renamed from: size */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 f48550x35e001;

    /* renamed from: sourcePath */
    private java.lang.String f48551xbdbebae0;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.tencent.tav.extractor.AssetExtractor$SampleFlag */
    /* loaded from: classes6.dex */
    public @interface SampleFlag {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.tencent.tav.extractor.AssetExtractor$SeekMode */
    /* loaded from: classes6.dex */
    public @interface SeekMode {
    }

    static {
        if (com.p314xaae8f345.tav.C25631xd106c456.m96104xe6c221cf()) {
            m97949xb90145c7();
            return;
        }
        java.lang.System.out.println("loadlibrary : tav start");
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("tav");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/tav/extractor/AssetExtractor", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/tav/extractor/AssetExtractor", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.p314xaae8f345.tav.C25631xd106c456.m96106x16e18707(true);
            m97949xb90145c7();
        } catch (java.lang.Throwable unused) {
        }
    }

    public C25820xcadb1d34() {
        this(com.p314xaae8f345.tav.p2965xf0edce24.C25821x46b9d596.f48552x34c297d2);
    }

    /* renamed from: advanceNative */
    private native synchronized boolean m97943xdd40fb39();

    /* renamed from: getSampleTimeNative */
    private native synchronized long m97944x26f7ae04();

    /* renamed from: getSampleTrackIndexNative */
    private native synchronized int m97945xb34b25fe();

    /* renamed from: getTrackCountNative */
    private final native synchronized int m97946xb7503731();

    /* renamed from: getTrackFormatNative */
    private native synchronized java.util.Map<java.lang.String, java.lang.Object> m97947xdbae5323(int i17);

    /* renamed from: nativeFinalize */
    private final native synchronized void m97948xef578955();

    /* renamed from: nativeInit */
    private static final native synchronized void m97949xb90145c7();

    /* renamed from: readSampleDataNative */
    private native synchronized int m97950xb1a3bb61(java.nio.ByteBuffer byteBuffer, int i17);

    /* renamed from: releaseNative */
    private final native synchronized void m97951xb27602fe();

    /* renamed from: seekToNative */
    private native void m97952x1cf97d0a(long j17, int i17);

    /* renamed from: selectTrackNative */
    private native synchronized void m97953x9dba86a6(int i17);

    /* renamed from: unselectTrackNative */
    private native synchronized void m97954x13485d2d(int i17);

    /* renamed from: advance */
    public synchronized boolean m97955xbc8da882() {
        com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680 interfaceC25824xcbed6680 = this.f48545x30d5dd85;
        if (interfaceC25824xcbed6680 != null) {
            return interfaceC25824xcbed6680.mo72439xbc8da882();
        }
        if (this.f48549xdf23d93d) {
            return false;
        }
        return m97943xdd40fb39();
    }

    /* renamed from: dispose */
    public synchronized void m97958x63a5261f() {
        if (this.f48551xbdbebae0.isEmpty()) {
            return;
        }
        if (!this.f48549xdf23d93d && this.f48545x30d5dd85 == null) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "dispose: sourcePath = " + this.f48551xbdbebae0);
            m97951xb27602fe();
        }
        com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680 interfaceC25824xcbed6680 = this.f48545x30d5dd85;
        if (interfaceC25824xcbed6680 != null) {
            interfaceC25824xcbed6680.mo72447x41012807();
            this.f48545x30d5dd85 = null;
        }
    }

    /* renamed from: finalize */
    public void m97959xd764dc1e() {
        if (this.f48545x30d5dd85 == null && !this.f48549xdf23d93d) {
            synchronized (this) {
                if (!this.f48549xdf23d93d) {
                    this.f48549xdf23d93d = true;
                    m97948xef578955();
                }
            }
        }
    }

    /* renamed from: getAudioDuration */
    public synchronized long m97960xd375d3d4() {
        return com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97460xd375d3d4(this);
    }

    /* renamed from: getDuration */
    public synchronized long m97961x51e8b0a() {
        if (this.f48546x89444d94 == 0) {
            this.f48546x89444d94 = com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97461x51e8b0a(this);
        }
        return this.f48546x89444d94;
    }

    /* renamed from: getPreferRotation */
    public synchronized int m97962xbb14e2a4() {
        if (this.f48548xcc7d15ae == -1) {
            this.f48548xcc7d15ae = com.p314xaae8f345.tav.p2965xf0edce24.C25823x281c550d.m97988xbb14e2a4(this);
        }
        return this.f48548xcc7d15ae;
    }

    /* renamed from: getSampleFlags */
    public native int m97963xe194c9c7();

    /* renamed from: getSampleTime */
    public synchronized long m97964xf6c90f8d() {
        com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680 interfaceC25824xcbed6680 = this.f48545x30d5dd85;
        if (interfaceC25824xcbed6680 != null) {
            return interfaceC25824xcbed6680.mo72441xf6c90f8d();
        }
        if (this.f48549xdf23d93d) {
            return -1L;
        }
        return m97944x26f7ae04();
    }

    /* renamed from: getSampleTrackIndex */
    public synchronized int m97965x452c8b07() {
        com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680 interfaceC25824xcbed6680 = this.f48545x30d5dd85;
        if (interfaceC25824xcbed6680 != null) {
            return interfaceC25824xcbed6680.mo72442x452c8b07();
        }
        if (this.f48549xdf23d93d) {
            return -1;
        }
        return m97945xb34b25fe();
    }

    /* renamed from: getSize */
    public synchronized com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m97966xfb854877() {
        if (this.f48550x35e001 == null) {
            this.f48550x35e001 = com.p314xaae8f345.tav.p2965xf0edce24.C25823x281c550d.m97989x4ee02466(this);
        }
        return this.f48550x35e001;
    }

    /* renamed from: getSourcePath */
    public java.lang.String m97967xabff72d6() {
        return this.f48551xbdbebae0;
    }

    /* renamed from: getTrackCount */
    public final synchronized int m97968x31d73e7a() {
        com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680 interfaceC25824xcbed6680 = this.f48545x30d5dd85;
        if (interfaceC25824xcbed6680 != null) {
            return interfaceC25824xcbed6680.mo72443x31d73e7a();
        }
        if (this.f48549xdf23d93d) {
            return 0;
        }
        return m97946xb7503731();
    }

    /* renamed from: getTrackFormat */
    public synchronized android.media.MediaFormat m97969xe2db7ec(int i17) {
        com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680 interfaceC25824xcbed6680 = this.f48545x30d5dd85;
        if (interfaceC25824xcbed6680 != null) {
            android.media.MediaFormat mo72444xe2db7ec = interfaceC25824xcbed6680.mo72444xe2db7ec(i17);
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "getTrackFormat(delegate): index = " + i17 + ", format = " + mo72444xe2db7ec);
            return mo72444xe2db7ec;
        }
        android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
        if (this.f48549xdf23d93d) {
            return mediaFormat;
        }
        java.util.Map<java.lang.String, java.lang.Object> m97947xdbae5323 = m97947xdbae5323(i17);
        try {
            java.lang.reflect.Field declaredField = android.media.MediaFormat.class.getDeclaredField("mMap");
            declaredField.setAccessible(true);
            declaredField.set(mediaFormat, m97947xdbae5323);
        } catch (java.lang.Exception e17) {
            e17.getMessage();
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "getTrackFormat: index = " + i17 + ", format = " + mediaFormat);
        return mediaFormat;
    }

    /* renamed from: isReleased */
    public boolean m97970xafdb8087() {
        return this.f48549xdf23d93d;
    }

    /* renamed from: needMirror */
    public boolean m97971xa5b697f5() {
        com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680 interfaceC25824xcbed6680 = this.f48545x30d5dd85;
        if (interfaceC25824xcbed6680 != null) {
            return interfaceC25824xcbed6680.mo72445xa5b697f5();
        }
        return true;
    }

    /* renamed from: readSampleData */
    public synchronized int m97972x416da6aa(java.nio.ByteBuffer byteBuffer, int i17) {
        com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680 interfaceC25824xcbed6680 = this.f48545x30d5dd85;
        if (interfaceC25824xcbed6680 != null) {
            int mo72446x416da6aa = interfaceC25824xcbed6680.mo72446x416da6aa(byteBuffer, i17);
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "readSampleData(delegate): ret = " + mo72446x416da6aa + ", buf = " + byteBuffer);
            return mo72446x416da6aa;
        }
        if (this.f48549xdf23d93d) {
            return -1;
        }
        int m97950xb1a3bb61 = m97950xb1a3bb61(byteBuffer, i17);
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "readSampleData: ret = " + m97950xb1a3bb61 + ", buf = " + byteBuffer);
        return m97950xb1a3bb61;
    }

    /* renamed from: release */
    public final synchronized void m97973x41012807() {
        com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680 interfaceC25824xcbed6680 = this.f48545x30d5dd85;
        if (interfaceC25824xcbed6680 != null) {
            interfaceC25824xcbed6680.mo72447x41012807();
            this.f48545x30d5dd85 = null;
        } else {
            if (!this.f48549xdf23d93d) {
                m97951xb27602fe();
                this.f48549xdf23d93d = true;
            }
        }
    }

    /* renamed from: seekTo */
    public synchronized void m97974xc9fc1b13(long j17, int i17) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "seekTo() called with: timeUs = [" + j17 + "], mode = [" + i17 + "]");
        com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680 interfaceC25824xcbed6680 = this.f48545x30d5dd85;
        if (interfaceC25824xcbed6680 != null) {
            interfaceC25824xcbed6680.mo72448xc9fc1b13(j17, i17);
        } else {
            if (!this.f48549xdf23d93d) {
                m97952x1cf97d0a(j17, i17);
            }
        }
    }

    /* renamed from: selectTrack */
    public synchronized void m97975xc3b89af(int i17) {
        com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680 interfaceC25824xcbed6680 = this.f48545x30d5dd85;
        if (interfaceC25824xcbed6680 != null) {
            interfaceC25824xcbed6680.mo72449xc3b89af(i17);
        } else {
            if (!this.f48549xdf23d93d) {
                m97953x9dba86a6(i17);
            }
        }
    }

    /* renamed from: setDataSource */
    public final native void m97976x683d6267(java.io.FileDescriptor fileDescriptor, long j17, long j18);

    /* renamed from: setDataSource */
    public final synchronized void m97977x683d6267(java.lang.String str) {
        com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680 interfaceC25824xcbed6680 = this.f48545x30d5dd85;
        if (interfaceC25824xcbed6680 != null) {
            interfaceC25824xcbed6680.mo72450x683d6267(str);
        }
        this.f48551xbdbebae0 = str;
        if (com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493.C25827x17249eab.m98005xde2d761f(str)) {
            com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493.C25827x17249eab.m98006xb408aa08(this.f48551xbdbebae0, this);
        } else {
            com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493.C25825xcbc87737.m97993xf85f90c2(str);
        }
    }

    /* renamed from: setDuration */
    public void m97978xffd6ec16(long j17) {
        this.f48546x89444d94 = j17;
    }

    /* renamed from: setIsSoft */
    public synchronized void m97979x11f52776(boolean z17) {
        com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680 interfaceC25824xcbed6680 = this.f48545x30d5dd85;
        if (interfaceC25824xcbed6680 != null) {
            interfaceC25824xcbed6680.mo72451x11f52776(z17);
        }
    }

    /* renamed from: setPreferRotation */
    public void m97980x830b4ab0(int i17) {
        this.f48548xcc7d15ae = i17;
    }

    /* renamed from: setSize */
    public void m97981x76500f83(com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85) {
        this.f48550x35e001 = c25732x76648a85;
    }

    /* renamed from: unselectTrack */
    public synchronized void m97982x5c729176(int i17) {
        com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680 interfaceC25824xcbed6680 = this.f48545x30d5dd85;
        if (interfaceC25824xcbed6680 != null) {
            interfaceC25824xcbed6680.mo72452x5c729176(i17);
        } else {
            if (!this.f48549xdf23d93d) {
                m97954x13485d2d(i17);
            }
        }
    }

    public C25820xcadb1d34(boolean z17) {
        this.TAG = "AssetExtractor@" + java.lang.Integer.toHexString(hashCode());
        this.f48549xdf23d93d = false;
        this.f48547x5abc8e2b = 0L;
        this.f48551xbdbebae0 = "";
        this.f48546x89444d94 = 0L;
        this.f48550x35e001 = null;
        this.f48548xcc7d15ae = -1;
        if (z17) {
            this.f48545x30d5dd85 = com.p314xaae8f345.tav.p2965xf0edce24.C25822x78481d21.m97984x67d326a1();
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 m97957x5a5dd5d() {
        com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34 = new com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34();
        c25820xcadb1d34.m97981x76500f83(m97966xfb854877());
        c25820xcadb1d34.m97980x830b4ab0(m97962xbb14e2a4());
        c25820xcadb1d34.m97978xffd6ec16(m97961x51e8b0a());
        c25820xcadb1d34.m97977x683d6267(this.f48551xbdbebae0);
        return c25820xcadb1d34;
    }
}
