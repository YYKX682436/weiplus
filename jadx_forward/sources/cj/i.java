package cj;

/* loaded from: classes12.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p583xbebf4c92.C4707x209bceea f123366d;

    public i(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p583xbebf4c92.C4707x209bceea c4707x209bceea) {
        this.f123366d = c4707x209bceea;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.io.File[] fileArr;
        cj.z zVar = (cj.z) ((jz5.n) this.f123366d.f134497a.f123367d.f123369e).mo141623x754a37bb();
        if (zVar != null) {
            cj.h hVar = new cj.h(this);
            synchronized (zVar.f123384a) {
                java.io.File file = new java.io.File(zVar.f123385b, "hprof");
                if (!file.exists()) {
                    file.mkdirs();
                }
                java.io.File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    listFiles = new java.io.File[0];
                }
                fileArr = listFiles;
            }
            int length = fileArr.length;
            for (int i17 = 0; i17 < length; i17++) {
                java.io.File hprofFile = fileArr[i17];
                java.io.File file2 = new java.io.File(zVar.f123385b, "key");
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(hprofFile, "hprofFile");
                java.io.File file3 = new java.io.File(file2, hprofFile.getName());
                try {
                    if (file3.isFile()) {
                        java.io.Reader inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream(file3), r26.c.f450398a);
                        java.io.BufferedReader bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
                        try {
                            java.lang.String activity = bufferedReader.readLine();
                            java.lang.String key = bufferedReader.readLine();
                            java.lang.String failure = bufferedReader.readLine();
                            vz5.b.a(bufferedReader, null);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activity, "activity");
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key, "key");
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(failure, "failure");
                            hVar.v(hprofFile, file3, activity, key, failure);
                        } catch (java.lang.Throwable th6) {
                            try {
                                throw th6;
                                break;
                            } catch (java.lang.Throwable th7) {
                                vz5.b.a(bufferedReader, th6);
                                throw th7;
                                break;
                            }
                        }
                    } else {
                        continue;
                    }
                } finally {
                    try {
                    } catch (java.lang.Throwable th8) {
                    }
                }
                cj.l.a(hprofFile);
                cj.l.a(file3);
            }
        }
    }
}
