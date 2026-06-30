package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9;

/* renamed from: com.tencent.qqmusic.mediaplayer.perf.PrefInfoCollector */
/* loaded from: classes13.dex */
public class C25403x925889fc implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.InterfaceC25402xe1ccbdfe {

    /* renamed from: ENCODING_UTF_8 */
    private static final java.lang.String f45957xa7320594 = "utf-8";

    /* renamed from: FILE_NAME */
    private static final java.lang.String f45958x59634b6e = "pref_infos.xml";

    /* renamed from: NAMESPACE */
    private static final java.lang.String f45959xf0bb653b = null;

    /* renamed from: ROOT */
    private static final java.lang.String f45960x2678e2 = "root";
    private static final java.lang.String TAG = "PrefInfoCollector";

    /* renamed from: instance */
    private static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25403x925889fc f45961x21169495;

    /* renamed from: mHandlerThread */
    private android.os.HandlerThread f45962x3e0f3a87;

    /* renamed from: mReportHandler */
    private android.os.Handler f45963x4f692009;

    /* renamed from: outputStream */
    private java.io.FileOutputStream f45964xf83acfe1;

    /* renamed from: prefInfos */
    private java.util.HashMap<java.lang.String, java.lang.Long> f45965xb1527d22;

    /* renamed from: reportFilePath */
    private java.lang.String f45966x6b0ef515;

    /* renamed from: xmlSerializer */
    private org.xmlpull.v1.XmlSerializer f45967x37b73109;

    private C25403x925889fc() {
        this.f45965xb1527d22 = null;
        this.f45967x37b73109 = null;
        this.f45965xb1527d22 = new java.util.HashMap<>();
        this.f45967x37b73109 = android.util.Xml.newSerializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createOutputs */
    public void m94137x43f92af6() {
        try {
            java.io.File file = new java.io.File(android.os.Environment.getExternalStorageDirectory().getAbsolutePath(), f45958x59634b6e);
            if (file.exists()) {
                file.delete();
                file.createNewFile();
            }
            java.lang.String str = TAG;
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(str, "setInstrumentation: outputFile: " + file);
            this.f45966x6b0ef515 = file.getAbsolutePath();
            this.f45964xf83acfe1 = new java.io.FileOutputStream(file);
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(str, "setInstrumentation: outputFilepath: " + this.f45966x6b0ef515);
            try {
                this.f45967x37b73109.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
                this.f45967x37b73109.setOutput(this.f45964xf83acfe1, "utf-8");
                this.f45967x37b73109.startDocument("utf-8", java.lang.Boolean.TRUE);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "Unable to open serializer", e17);
                throw new java.lang.RuntimeException("Unable to open serializer: " + e17.getMessage(), e17);
            }
        } catch (java.io.FileNotFoundException e18) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "Unable to open report file: pref_infos.xml", e18);
            throw new java.lang.RuntimeException("Unable to open report file: " + e18.getMessage(), e18);
        } catch (java.io.IOException e19) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "Unable to create report file: pref_infos.xml", e19);
            throw new java.lang.RuntimeException("Unable to create report file: " + e19.getMessage(), e19);
        }
    }

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25403x925889fc m94138x9cf0d20b() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25403x925889fc c25403x925889fc;
        synchronized (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25403x925889fc.class) {
            if (f45961x21169495 == null) {
                f45961x21169495 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25403x925889fc();
            }
            c25403x925889fc = f45961x21169495;
        }
        return c25403x925889fc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: printPrefInfos */
    public void m94139x38e9cf5(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 c25316x94782396) {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f45965xb1527d22.entrySet());
        java.util.Collections.sort(arrayList, new java.util.Comparator<java.util.Map.Entry<java.lang.String, java.lang.Long>>() { // from class: com.tencent.qqmusic.mediaplayer.perf.PrefInfoCollector.1
            @Override // java.util.Comparator
            public int compare(java.util.Map.Entry<java.lang.String, java.lang.Long> entry, java.util.Map.Entry<java.lang.String, java.lang.Long> entry2) {
                if (entry.getKey().charAt(0) > entry2.getKey().charAt(0)) {
                    return 1;
                }
                return entry.getKey().charAt(0) == entry2.getKey().charAt(0) ? 0 : -1;
            }
        });
        if (arrayList.isEmpty()) {
            return;
        }
        this.f45967x37b73109.startTag(f45959xf0bb653b, f45960x2678e2);
        m94140xc774f7a2("device.manufacturer", android.os.Build.MANUFACTURER);
        m94140xc774f7a2("device.model", android.os.Build.MODEL);
        m94140xc774f7a2("device.apiLevel", java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT));
        m94142xca52fadf(c25316x94782396);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            long longValue = ((java.lang.Long) entry.getValue()).longValue();
            m94140xc774f7a2((java.lang.String) entry.getKey(), longValue + "");
        }
        this.f45967x37b73109.endTag(f45959xf0bb653b, f45960x2678e2);
        this.f45967x37b73109.endDocument();
        this.f45967x37b73109.flush();
    }

    /* renamed from: printProperty */
    private void m94140xc774f7a2(java.lang.String str, java.lang.String str2) {
        org.xmlpull.v1.XmlSerializer xmlSerializer = this.f45967x37b73109;
        java.lang.String str3 = f45959xf0bb653b;
        xmlSerializer.startTag(str3, str);
        this.f45967x37b73109.text(str2);
        this.f45967x37b73109.endTag(str3, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: upLoadByCommonPost */
    public void m94141xe7f59da3() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "upLoadByCommonPost");
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(" http://musict.proxy.music.qq.com/qmtm2/PlayPerformanceReport.fcg").openConnection();
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
        httpURLConnection.setRequestProperty("Charset", com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        httpURLConnection.setRequestProperty("Content-Type", "text/xml");
        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(httpURLConnection.getOutputStream());
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(this.f45966x6b0ef515);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                fileInputStream.close();
                dataOutputStream.writeBytes(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
                dataOutputStream.flush();
                java.io.InputStream inputStream = httpURLConnection.getInputStream();
                java.lang.String readLine = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c)).readLine();
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "upload result:" + readLine);
                dataOutputStream.close();
                inputStream.close();
                return;
            }
            dataOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: printAudioInfomation */
    public void m94142xca52fadf(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 c25316x94782396) {
        m94140xc774f7a2("audio.format", c25316x94782396.m93536xaa5357a() + "");
        m94140xc774f7a2("audio.sampleRate", c25316x94782396.m93542xf6c809a0() + "");
        m94140xc774f7a2("audio.PlaySample", c25316x94782396.m93541x4b916df4() + "");
        m94140xc774f7a2("audio.bitDepth", c25316x94782396.m93537xbc5bbb2c() + "");
        m94140xc774f7a2("audio.channels", c25316x94782396.m93539xd13e6146() + "");
        m94140xc774f7a2("audio.duration", c25316x94782396.m93540x51e8b0a() + "");
        m94140xc774f7a2("audio.bitRate", c25316x94782396.m93538x37b4b737() + "");
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.InterfaceC25402xe1ccbdfe
    /* renamed from: putBoolean */
    public void mo94128x1c849219(java.lang.String str, boolean z17) {
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.InterfaceC25402xe1ccbdfe
    /* renamed from: putInt */
    public void mo94129xc5c55e60(java.lang.String str, int i17) {
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.InterfaceC25402xe1ccbdfe
    /* renamed from: putLong */
    public void mo94130xf2e7ce2b(java.lang.String str, long j17) {
        this.f45965xb1527d22.put(str, java.lang.Long.valueOf(j17));
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.InterfaceC25402xe1ccbdfe
    /* renamed from: putString */
    public void mo94131xe4673800(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.InterfaceC25402xe1ccbdfe
    /* renamed from: putUri */
    public void mo94132xc5c58bdd(java.lang.String str, android.net.Uri uri) {
    }

    /* renamed from: upLoadPrefInfos */
    public void m94143x758f001(final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 c25316x94782396) {
        java.util.HashMap<java.lang.String, java.lang.Long> hashMap = this.f45965xb1527d22;
        if (hashMap == null || hashMap.isEmpty()) {
            return;
        }
        if (this.f45962x3e0f3a87 == null || this.f45963x4f692009 == null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread(TAG);
            this.f45962x3e0f3a87 = handlerThread;
            handlerThread.start();
            this.f45963x4f692009 = new android.os.Handler(this.f45962x3e0f3a87.getLooper());
        }
        this.f45963x4f692009.post(new java.lang.Runnable() { // from class: com.tencent.qqmusic.mediaplayer.perf.PrefInfoCollector.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25403x925889fc.this.m94137x43f92af6();
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25403x925889fc.this.m94139x38e9cf5(c25316x94782396);
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25403x925889fc.this.m94141xe7f59da3();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25403x925889fc.TAG, e17);
                }
            }
        });
    }
}
