package cj;

/* loaded from: classes12.dex */
public final class k extends cj.c {

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f41836e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.matrix.resource.watcher.f watcher) {
        super(watcher);
        kotlin.jvm.internal.o.g(watcher, "watcher");
        this.f41836e = jz5.h.b(new cj.g(watcher));
        jz5.g b17 = jz5.h.b(new cj.j(this, watcher));
        android.content.Context context = watcher.f395858d;
        if (oj.m.c(context)) {
            try {
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                com.tencent.matrix.resource.processor.NativeForkAnalyzeProcessor$screenStateReceiver$2$1 nativeForkAnalyzeProcessor$screenStateReceiver$2$1 = (com.tencent.matrix.resource.processor.NativeForkAnalyzeProcessor$screenStateReceiver$2$1) ((jz5.n) b17).getValue();
                oj.j.c("Matrix.LeakProcessor.NativeForkAnalyze", "Screen state receiver " + nativeForkAnalyzeProcessor$screenStateReceiver$2$1 + " registered.", new java.lang.Object[0]);
                int i17 = android.os.Build.VERSION.SDK_INT;
                com.tencent.matrix.resource.x xVar = watcher.f52980e;
                if (i17 < 33 || context.getApplicationInfo().targetSdkVersion < 34) {
                    kotlin.jvm.internal.o.f(xVar, "watcher.resourcePlugin");
                    xVar.f363453e.registerReceiver(nativeForkAnalyzeProcessor$screenStateReceiver$2$1, intentFilter);
                } else {
                    kotlin.jvm.internal.o.f(xVar, "watcher.resourcePlugin");
                    xVar.f363453e.registerReceiver(nativeForkAnalyzeProcessor$screenStateReceiver$2$1, intentFilter, 4);
                }
            } catch (java.lang.Throwable th6) {
                oj.j.d("Matrix.LeakProcessor.NativeForkAnalyze", th6, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // cj.c
    public boolean b(com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo destroyedActivityInfo) {
        java.io.File file;
        java.io.File file2;
        kotlin.jvm.internal.o.g(destroyedActivityInfo, "destroyedActivityInfo");
        c(0, wi.b.NO_DUMP, destroyedActivityInfo.mActivityName, destroyedActivityInfo.mKey, "no dump", "0");
        boolean z17 = false;
        try {
            file = xi.k.f454661e.f("NFAP", true);
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.Safe", th6, "", new java.lang.Object[0]);
            file = null;
        }
        if (file == null) {
            c(0, wi.b.FORK_ANALYSE, destroyedActivityInfo.mActivityName, "[unknown]", "Failed to create hprof file.", "0");
            return true;
        }
        java.lang.String activity = destroyedActivityInfo.mActivityName;
        java.lang.String key = destroyedActivityInfo.mKey;
        this.f41825a.d();
        oj.j.c("Matrix.LeakProcessor.NativeForkAnalyze", "fork dump and analyse", new java.lang.Object[0]);
        java.lang.String absolutePath = file.getAbsolutePath();
        kotlin.jvm.internal.o.f(absolutePath, "hprof.absolutePath");
        kotlin.jvm.internal.o.f(key, "key");
        java.io.File file3 = com.tencent.matrix.resource.MemoryUtil.f52933a;
        com.tencent.matrix.resource.MemoryUtil memoryUtil = com.tencent.matrix.resource.MemoryUtil.f52936d;
        ti.a f17 = memoryUtil.f(absolutePath, key, 600L, new com.tencent.matrix.resource.s(memoryUtil));
        oj.j.c("Matrix.LeakProcessor.NativeForkAnalyze", "fork dump and analyse done", new java.lang.Object[0]);
        if (f17.f419487f != null) {
            oj.j.c("Matrix.LeakProcessor.NativeForkAnalyze", "Process failed, move into retry repository.", new java.lang.Object[0]);
            java.lang.String failure = f17.f419487f.toString();
            cj.z zVar = (cj.z) ((jz5.n) this.f41836e).getValue();
            if (zVar != null) {
                kotlin.jvm.internal.o.f(activity, "activity");
                kotlin.jvm.internal.o.g(failure, "failure");
                try {
                    if (file.isFile()) {
                        java.lang.String uuid = java.util.UUID.randomUUID().toString();
                        kotlin.jvm.internal.o.f(uuid, "UUID.randomUUID().toString()");
                        oj.j.c("Matrix.LeakProcessor.NativeForkAnalyze", "Save HPROF analyze retry record " + activity + '(' + uuid + ").", new java.lang.Object[0]);
                        synchronized (zVar.f41851a) {
                            try {
                                java.io.File file4 = new java.io.File(zVar.f41852b, "hprof");
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
                                java.io.File file6 = new java.io.File(zVar.f41852b, "key");
                                if (!file6.exists()) {
                                    file6.mkdirs();
                                }
                                java.io.File file7 = new java.io.File(file6, uuid);
                                file7.createNewFile();
                                java.io.Writer outputStreamWriter = new java.io.OutputStreamWriter(new java.io.FileOutputStream(file7), r26.c.f368865a);
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
            c(5, wi.b.FORK_ANALYSE, activity, key, failure, java.lang.String.valueOf(f17.f419488g));
        } else {
            file2 = file;
            if (f17.f419485d) {
                this.f41825a.b(activity, false);
                java.lang.String aVar = f17.toString();
                c(0, wi.b.FORK_ANALYSE, activity, key, aVar, java.lang.String.valueOf(f17.f419488g));
                oj.j.c("Matrix.LeakProcessor.NativeForkAnalyze", "leak found: " + aVar, new java.lang.Object[0]);
            }
        }
        cj.l.a(file2);
        return true;
    }
}
