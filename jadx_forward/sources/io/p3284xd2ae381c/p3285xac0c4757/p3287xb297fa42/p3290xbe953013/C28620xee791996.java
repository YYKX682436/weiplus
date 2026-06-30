package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.flutter.embedding.engine.loader.ResourceExtractor */
/* loaded from: classes13.dex */
public class C28620xee791996 {

    /* renamed from: SUPPORTED_ABIS */
    private static final java.lang.String[] f71119xd4e0a1c = android.os.Build.SUPPORTED_ABIS;
    private static final java.lang.String TAG = "ResourceExtractor";

    /* renamed from: TIMESTAMP_PREFIX */
    private static final java.lang.String f71120x7a4889fb = "res_timestamp-";

    /* renamed from: mAssetManager */
    private final android.content.res.AssetManager f71121x47a8a7aa;

    /* renamed from: mDataDirPath */
    private final java.lang.String f71122xb54bf49b;

    /* renamed from: mExtractTask */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28620xee791996.ExtractTask f71123x16b36ef9;

    /* renamed from: mPackageManager */
    private final android.content.pm.PackageManager f71124x34df4254;

    /* renamed from: mPackageName */
    private final java.lang.String f71125xe037a144;

    /* renamed from: mResources */
    private final java.util.HashSet<java.lang.String> f71126x4840838 = new java.util.HashSet<>();

    /* renamed from: io.flutter.embedding.engine.loader.ResourceExtractor$ExtractTask */
    /* loaded from: classes13.dex */
    public static class ExtractTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void> {

        /* renamed from: mAssetManager */
        private final android.content.res.AssetManager f71127x47a8a7aa;

        /* renamed from: mDataDirPath */
        private final java.lang.String f71128xb54bf49b;

        /* renamed from: mPackageManager */
        private final android.content.pm.PackageManager f71129x34df4254;

        /* renamed from: mPackageName */
        private final java.lang.String f71130xe037a144;

        /* renamed from: mResources */
        private final java.util.HashSet<java.lang.String> f71131x4840838;

        public ExtractTask(java.lang.String str, java.util.HashSet<java.lang.String> hashSet, java.lang.String str2, android.content.pm.PackageManager packageManager, android.content.res.AssetManager assetManager) {
            this.f71128xb54bf49b = str;
            this.f71131x4840838 = hashSet;
            this.f71127x47a8a7aa = assetManager;
            this.f71130xe037a144 = str2;
            this.f71129x34df4254 = packageManager;
        }

        /* renamed from: extractAPK */
        private boolean m137959x2ccb45db(java.io.File file) {
            java.util.Iterator<java.lang.String> it = this.f71131x4840838.iterator();
            while (it.hasNext()) {
                java.lang.String next = it.next();
                try {
                    java.io.File file2 = new java.io.File(file, next);
                    if (!file2.exists()) {
                        if (file2.getParentFile() != null) {
                            file2.getParentFile().mkdirs();
                        }
                        java.io.InputStream open = this.f71127x47a8a7aa.open(next);
                        try {
                            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
                            try {
                                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28620xee791996.m137951x2eaf75(open, fileOutputStream);
                                fileOutputStream.close();
                                if (open != null) {
                                    open.close();
                                }
                            } catch (java.lang.Throwable th6) {
                                try {
                                    fileOutputStream.close();
                                } catch (java.lang.Throwable th7) {
                                    th6.addSuppressed(th7);
                                }
                                throw th6;
                                break;
                            }
                        } catch (java.lang.Throwable th8) {
                            if (open != null) {
                                try {
                                    open.close();
                                } catch (java.lang.Throwable th9) {
                                    th8.addSuppressed(th9);
                                }
                            }
                            throw th8;
                            break;
                        }
                    }
                } catch (java.io.FileNotFoundException unused) {
                } catch (java.io.IOException e17) {
                    io.p3284xd2ae381c.Log.w(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28620xee791996.TAG, "Exception unpacking resources: " + e17.getMessage());
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28620xee791996.m137952xbbbd178c(this.f71128xb54bf49b, this.f71131x4840838);
                    return false;
                }
            }
            return true;
        }

        @Override // android.os.AsyncTask
        public java.lang.Void doInBackground(java.lang.Void... voidArr) {
            java.io.File file = new java.io.File(this.f71128xb54bf49b);
            java.lang.String m137950x70f48cee = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28620xee791996.m137950x70f48cee(file, this.f71129x34df4254, this.f71130xe037a144);
            if (m137950x70f48cee == null) {
                return null;
            }
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28620xee791996.m137952xbbbd178c(this.f71128xb54bf49b, this.f71131x4840838);
            if (!m137959x2ccb45db(file)) {
                return null;
            }
            try {
                new java.io.File(file, m137950x70f48cee).createNewFile();
            } catch (java.io.IOException unused) {
                io.p3284xd2ae381c.Log.w(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28620xee791996.TAG, "Failed to write resource timestamp");
            }
            return null;
        }
    }

    public C28620xee791996(java.lang.String str, java.lang.String str2, android.content.pm.PackageManager packageManager, android.content.res.AssetManager assetManager) {
        this.f71122xb54bf49b = str;
        this.f71125xe037a144 = str2;
        this.f71124x34df4254 = packageManager;
        this.f71121x47a8a7aa = assetManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: checkTimestamp */
    public static java.lang.String m137950x70f48cee(java.io.File file, android.content.pm.PackageManager packageManager, java.lang.String str) {
        try {
            android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo == null) {
                return f71120x7a4889fb;
            }
            java.lang.String str2 = f71120x7a4889fb + m137954x2e159af(packageInfo) + "-" + packageInfo.lastUpdateTime;
            java.lang.String[] m137953x92333bfe = m137953x92333bfe(file);
            if (m137953x92333bfe != null && m137953x92333bfe.length == 1 && str2.equals(m137953x92333bfe[0])) {
                return null;
            }
            return str2;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return f71120x7a4889fb;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: copy */
    public static void m137951x2eaf75(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        byte[] bArr = new byte[16384];
        while (true) {
            int read = inputStream.read(bArr);
            if (read < 0) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: deleteFiles */
    public static void m137952xbbbd178c(java.lang.String str, java.util.HashSet<java.lang.String> hashSet) {
        java.io.File file = new java.io.File(str);
        java.util.Iterator<java.lang.String> it = hashSet.iterator();
        while (it.hasNext()) {
            java.io.File file2 = new java.io.File(file, it.next());
            if (file2.exists()) {
                file2.delete();
            }
        }
        java.lang.String[] m137953x92333bfe = m137953x92333bfe(file);
        if (m137953x92333bfe == null) {
            return;
        }
        for (java.lang.String str2 : m137953x92333bfe) {
            new java.io.File(file, str2).delete();
        }
    }

    /* renamed from: getExistingTimestamps */
    private static java.lang.String[] m137953x92333bfe(java.io.File file) {
        return file.list(new java.io.FilenameFilter() { // from class: io.flutter.embedding.engine.loader.ResourceExtractor.1
            @Override // java.io.FilenameFilter
            public boolean accept(java.io.File file2, java.lang.String str) {
                return str.startsWith(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28620xee791996.f71120x7a4889fb);
            }
        });
    }

    /* renamed from: getVersionCode */
    public static long m137954x2e159af(android.content.pm.PackageInfo packageInfo) {
        return android.os.Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
    }

    /* renamed from: addResource */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28620xee791996 m137955xb1996fcf(java.lang.String str) {
        this.f71126x4840838.add(str);
        return this;
    }

    /* renamed from: addResources */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28620xee791996 m137956x81948a84(java.util.Collection<java.lang.String> collection) {
        this.f71126x4840838.addAll(collection);
        return this;
    }

    /* renamed from: start */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28620xee791996 m137957x68ac462() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28620xee791996.ExtractTask extractTask = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28620xee791996.ExtractTask(this.f71122xb54bf49b, this.f71126x4840838, this.f71125xe037a144, this.f71124x34df4254, this.f71121x47a8a7aa);
        this.f71123x16b36ef9 = extractTask;
        extractTask.executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, new java.lang.Void[0]);
        return this;
    }

    /* renamed from: waitForCompletion */
    public void m137958x5cfb0a10() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28620xee791996.ExtractTask extractTask = this.f71123x16b36ef9;
        if (extractTask == null) {
            return;
        }
        try {
            extractTask.get();
        } catch (java.lang.InterruptedException | java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException unused) {
            m137952xbbbd178c(this.f71122xb54bf49b, this.f71126x4840838);
        }
    }
}
