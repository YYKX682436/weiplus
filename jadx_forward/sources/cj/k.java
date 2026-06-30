package cj;

/* loaded from: classes12.dex */
public final class k extends cj.c {

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f123369e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.f watcher) {
        super(watcher);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(watcher, "watcher");
        this.f123369e = jz5.h.b(new cj.g(watcher));
        jz5.g b17 = jz5.h.b(new cj.j(this, watcher));
        android.content.Context context = watcher.f477391d;
        if (oj.m.c(context)) {
            try {
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p583xbebf4c92.C4707x209bceea c4707x209bceea = (com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p583xbebf4c92.C4707x209bceea) ((jz5.n) b17).mo141623x754a37bb();
                oj.j.c("Matrix.LeakProcessor.NativeForkAnalyze", "Screen state receiver " + c4707x209bceea + " registered.", new java.lang.Object[0]);
                int i17 = android.os.Build.VERSION.SDK_INT;
                com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.x xVar = watcher.f134513e;
                if (i17 < 33 || context.getApplicationInfo().targetSdkVersion < 34) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(xVar, "watcher.resourcePlugin");
                    xVar.f444986e.registerReceiver(c4707x209bceea, intentFilter);
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(xVar, "watcher.resourcePlugin");
                    xVar.f444986e.registerReceiver(c4707x209bceea, intentFilter, 4);
                }
            } catch (java.lang.Throwable th6) {
                oj.j.d("Matrix.LeakProcessor.NativeForkAnalyze", th6, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // cj.c
    public boolean b(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p581xc2f04ca6.p582x633fb29.C4706x164388f6 destroyedActivityInfo) {
        java.io.File file;
        java.io.File file2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destroyedActivityInfo, "destroyedActivityInfo");
        c(0, wi.b.NO_DUMP, destroyedActivityInfo.f20017xf8a7db47, destroyedActivityInfo.f20020x32b2b2, "no dump", "0");
        boolean z17 = false;
        try {
            file = xi.k.f536194e.f("NFAP", true);
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.Safe", th6, "", new java.lang.Object[0]);
            file = null;
        }
        if (file == null) {
            c(0, wi.b.FORK_ANALYSE, destroyedActivityInfo.f20017xf8a7db47, "[unknown]", "Failed to create hprof file.", "0");
            return true;
        }
        java.lang.String activity = destroyedActivityInfo.f20017xf8a7db47;
        java.lang.String key = destroyedActivityInfo.f20020x32b2b2;
        this.f123358a.d();
        oj.j.c("Matrix.LeakProcessor.NativeForkAnalyze", "fork dump and analyse", new java.lang.Object[0]);
        java.lang.String absolutePath = file.getAbsolutePath();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(absolutePath, "hprof.absolutePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key, "key");
        java.io.File file3 = com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.C4705xed2494c3.f134466a;
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.C4705xed2494c3 c4705xed2494c3 = com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.C4705xed2494c3.f134469d;
        ti.a f17 = c4705xed2494c3.f(absolutePath, key, 600L, new com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.s(c4705xed2494c3));
        oj.j.c("Matrix.LeakProcessor.NativeForkAnalyze", "fork dump and analyse done", new java.lang.Object[0]);
        if (f17.f501020f != null) {
            oj.j.c("Matrix.LeakProcessor.NativeForkAnalyze", "Process failed, move into retry repository.", new java.lang.Object[0]);
            java.lang.String failure = f17.f501020f.toString();
            cj.z zVar = (cj.z) ((jz5.n) this.f123369e).mo141623x754a37bb();
            if (zVar != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activity, "activity");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(failure, "failure");
                try {
                    if (file.isFile()) {
                        java.lang.String uuid = java.util.UUID.randomUUID().toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "UUID.randomUUID().toString()");
                        oj.j.c("Matrix.LeakProcessor.NativeForkAnalyze", "Save HPROF analyze retry record " + activity + '(' + uuid + ").", new java.lang.Object[0]);
                        synchronized (zVar.f123384a) {
                            try {
                                java.io.File file4 = new java.io.File(zVar.f123385b, "hprof");
                                if (!file4.exists()) {
                                    file4.mkdirs();
                                }
                                java.io.File file5 = new java.io.File(file4, uuid);
                                if (!file.exists()) {
                                    throw new vz5.t(file, null, "The source file doesn't exist.", 2, null);
                                }
                                if (file5.exists() && !file5.delete()) {
                                    throw new vz5.c(file, file5, "Tried to overwrite the destination, but failed to delete it.");
                                }
                                if (!file.isDirectory()) {
                                    java.io.File parentFile = file5.getParentFile();
                                    if (parentFile != null) {
                                        parentFile.mkdirs();
                                    }
                                    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
                                    try {
                                        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file5);
                                        try {
                                            vz5.a.a(fileInputStream, fileOutputStream, 8192);
                                            vz5.b.a(fileOutputStream, null);
                                            vz5.b.a(fileInputStream, null);
                                        } finally {
                                        }
                                    } finally {
                                    }
                                } else if (!file5.mkdirs()) {
                                    throw new vz5.e(file, file5, "Failed to create target directory.");
                                }
                                java.io.File file6 = new java.io.File(zVar.f123385b, "key");
                                if (!file6.exists()) {
                                    file6.mkdirs();
                                }
                                java.io.File file7 = new java.io.File(file6, uuid);
                                file7.createNewFile();
                                java.io.Writer outputStreamWriter = new java.io.OutputStreamWriter(new java.io.FileOutputStream(file7), r26.c.f450398a);
                                java.io.BufferedWriter bufferedWriter = outputStreamWriter instanceof java.io.BufferedWriter ? (java.io.BufferedWriter) outputStreamWriter : new java.io.BufferedWriter(outputStreamWriter, 8192);
                                try {
                                    bufferedWriter.write(activity);
                                    bufferedWriter.newLine();
                                    bufferedWriter.write(key);
                                    bufferedWriter.newLine();
                                    bufferedWriter.write(failure);
                                    bufferedWriter.flush();
                                    vz5.b.a(bufferedWriter, null);
                                } finally {
                                }
                            } finally {
                            }
                        }
                        z17 = true;
                    }
                } catch (java.lang.Throwable th7) {
                    oj.j.d("Matrix.LeakProcessor.NativeForkAnalyze", th7, "Failed to save HPROF record into retry repository", new java.lang.Object[0]);
                }
                if (z17) {
                    file2 = file;
                }
            }
            file2 = file;
            c(5, wi.b.FORK_ANALYSE, activity, key, failure, java.lang.String.valueOf(f17.f501021g));
        } else {
            file2 = file;
            if (f17.f501018d) {
                this.f123358a.b(activity, false);
                java.lang.String m166611x9616526c = f17.m166611x9616526c();
                c(0, wi.b.FORK_ANALYSE, activity, key, m166611x9616526c, java.lang.String.valueOf(f17.f501021g));
                oj.j.c("Matrix.LeakProcessor.NativeForkAnalyze", "leak found: " + m166611x9616526c, new java.lang.Object[0]);
            }
        }
        cj.l.a(file2);
        return true;
    }
}
