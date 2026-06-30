package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd;

/* renamed from: com.tencent.thumbplayer.core.thirdparties.LocalCache */
/* loaded from: classes13.dex */
public class C26450xc2f3a6f7 {

    /* renamed from: MAX_COUNT */
    private static final int f53737xcdd7e234 = Integer.MAX_VALUE;

    /* renamed from: MAX_SIZE */
    private static final int f53738x48bb921c = 50000000;

    /* renamed from: TIME_DAY */
    public static final int f53739xb2e7530a = 86400;

    /* renamed from: TIME_HOUR */
    public static final int f53740xaa051416 = 3600;

    /* renamed from: mInstanceMap */
    private static java.util.Map<java.lang.String, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7> f53741x2cc2e5da = new java.util.HashMap();

    /* renamed from: mCache */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7.ACacheManager f53742xbdddfb15;

    /* renamed from: com.tencent.thumbplayer.core.thirdparties.LocalCache$ACacheManager */
    /* loaded from: classes13.dex */
    public class ACacheManager {

        /* renamed from: cacheCount */
        private final java.util.concurrent.atomic.AtomicInteger f53743x2f12ad;

        /* renamed from: cacheDir */
        protected java.io.File f53744xe62915ab;

        /* renamed from: cacheSize */
        private final java.util.concurrent.atomic.AtomicLong f53745xdf0072a3;

        /* renamed from: countLimit */
        private final int f53746xc13c5bec;

        /* renamed from: lastUsageDates */
        private final java.util.Map<java.io.File, java.lang.Long> f53747xa1fea09a;

        /* renamed from: sizeLimit */
        private final long f53748x1c8b543a;

        /* renamed from: calculateCacheSizeAndCacheCount */
        private void m102945x2e852507() {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3051x6a710b1.C26452x3df100e2.m102976x9cf0d20b().m102984x137f2902().execute(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.core.thirdparties.LocalCache.ACacheManager.1
                @Override // java.lang.Runnable
                public void run() {
                    java.io.File[] listFiles = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7.ACacheManager.this.f53744xe62915ab.listFiles();
                    if (listFiles != null) {
                        int i17 = 0;
                        int i18 = 0;
                        for (java.io.File file : listFiles) {
                            i17 = (int) (i17 + com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7.ACacheManager.this.m102946xdd083487(file));
                            i18++;
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7.ACacheManager.this.f53747xa1fea09a.put(file, java.lang.Long.valueOf(file.lastModified()));
                        }
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7.ACacheManager.this.f53745xdf0072a3.set(i17);
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7.ACacheManager.this.f53743x2f12ad.set(i18);
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: calculateSize */
        public long m102946xdd083487(java.io.File file) {
            if (file == null) {
                return 0L;
            }
            return file.length();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: clear */
        public void m102947x5a5b64d() {
            this.f53747xa1fea09a.clear();
            this.f53745xdf0072a3.set(0L);
            java.io.File[] listFiles = this.f53744xe62915ab.listFiles();
            if (listFiles != null) {
                for (java.io.File file : listFiles) {
                    file.delete();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.io.File get(java.lang.String str) {
            java.io.File m102948x6df5433c = m102948x6df5433c(str);
            java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
            m102948x6df5433c.setLastModified(valueOf.longValue());
            this.f53747xa1fea09a.put(m102948x6df5433c, valueOf);
            return m102948x6df5433c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: newFile */
        public java.io.File m102948x6df5433c(java.lang.String str) {
            return new java.io.File(this.f53744xe62915ab, str.hashCode() + "");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void put(java.io.File file) {
            int i17 = this.f53743x2f12ad.get();
            while (i17 + 1 > this.f53746xc13c5bec) {
                this.f53745xdf0072a3.addAndGet(-m102950x41781597());
                i17 = this.f53743x2f12ad.addAndGet(-1);
            }
            this.f53743x2f12ad.addAndGet(1);
            long m102946xdd083487 = m102946xdd083487(file);
            long j17 = this.f53745xdf0072a3.get();
            while (j17 + m102946xdd083487 > this.f53748x1c8b543a) {
                j17 = this.f53745xdf0072a3.addAndGet(-m102950x41781597());
            }
            this.f53745xdf0072a3.addAndGet(m102946xdd083487);
            java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
            file.setLastModified(valueOf.longValue());
            this.f53747xa1fea09a.put(file, valueOf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: remove */
        public boolean m102949xc84af884(java.lang.String str) {
            return get(str).delete();
        }

        /* renamed from: removeNext */
        private long m102950x41781597() {
            java.io.File file;
            if (this.f53747xa1fea09a.isEmpty()) {
                return 0L;
            }
            java.util.Set<java.util.Map.Entry<java.io.File, java.lang.Long>> entrySet = this.f53747xa1fea09a.entrySet();
            synchronized (this.f53747xa1fea09a) {
                file = null;
                java.lang.Long l17 = null;
                for (java.util.Map.Entry<java.io.File, java.lang.Long> entry : entrySet) {
                    if (file == null) {
                        file = entry.getKey();
                        l17 = entry.getValue();
                    } else {
                        java.lang.Long value = entry.getValue();
                        if (value.longValue() < l17.longValue()) {
                            file = entry.getKey();
                            l17 = value;
                        }
                    }
                }
            }
            if (file == null) {
                return 0L;
            }
            long m102946xdd083487 = m102946xdd083487(file);
            if (file.delete()) {
                this.f53747xa1fea09a.remove(file);
            }
            return m102946xdd083487;
        }

        private ACacheManager(java.io.File file, long j17, int i17) {
            this.f53747xa1fea09a = java.util.Collections.synchronizedMap(new java.util.HashMap());
            this.f53744xe62915ab = file;
            this.f53748x1c8b543a = j17;
            this.f53746xc13c5bec = i17;
            this.f53745xdf0072a3 = new java.util.concurrent.atomic.AtomicLong();
            this.f53743x2f12ad = new java.util.concurrent.atomic.AtomicInteger();
            m102945x2e852507();
        }
    }

    /* renamed from: com.tencent.thumbplayer.core.thirdparties.LocalCache$Utils */
    /* loaded from: classes13.dex */
    public static class Utils {

        /* renamed from: mSeparator */
        private static final char f53751xe2002cf8 = ' ';

        /* renamed from: _hellAccFlag_ */
        private byte f53752x7f11beae;

        private Utils() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: Bitmap2Bytes */
        public static byte[] m102951xba3d8568(android.graphics.Bitmap bitmap) {
            if (bitmap == null) {
                return null;
            }
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: Bytes2Bimap */
        public static android.graphics.Bitmap m102952x2117eaae(byte[] bArr) {
            int length = bArr.length;
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: bitmap2Drawable */
        public static android.graphics.drawable.Drawable m102963x76b686a1(android.graphics.Bitmap bitmap) {
            if (bitmap == null) {
                return null;
            }
            return new android.graphics.drawable.BitmapDrawable(bitmap);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: clearDateInfo */
        public static java.lang.String m102964x3ed5bee9(java.lang.String str) {
            return (str == null || !m102970x162afe36(str.getBytes())) ? str : str.substring(str.indexOf(32) + 1, str.length());
        }

        /* renamed from: copyOfRange */
        private static byte[] m102966x7d73d471(byte[] bArr, int i17, int i18) {
            int i19 = i18 - i17;
            if (i19 >= 0) {
                byte[] bArr2 = new byte[i19];
                java.lang.System.arraycopy(bArr, i17, bArr2, 0, java.lang.Math.min(bArr.length - i17, i19));
                return bArr2;
            }
            throw new java.lang.IllegalArgumentException(i17 + " > " + i18);
        }

        /* renamed from: createDateInfo */
        private static java.lang.String m102967xa1d38a98(int i17) {
            java.lang.String str = java.lang.System.currentTimeMillis() + "";
            while (str.length() < 13) {
                str = "0".concat(str);
            }
            return str + "-" + i17 + f53751xe2002cf8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: drawable2Bitmap */
        public static android.graphics.Bitmap m102968xe4c2a1a3(android.graphics.drawable.Drawable drawable) {
            if (drawable == null) {
                return null;
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            android.graphics.Bitmap.Config config = drawable.getOpacity() != -1 ? android.graphics.Bitmap.Config.ARGB_8888 : android.graphics.Bitmap.Config.RGB_565;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(intrinsicHeight));
            arrayList.add(java.lang.Integer.valueOf(intrinsicWidth));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/thumbplayer/core/thirdparties/LocalCache$Utils", "drawable2Bitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/thumbplayer/core/thirdparties/LocalCache$Utils", "drawable2Bitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return createBitmap;
        }

        /* renamed from: getDateInfoFromDate */
        private static java.lang.String[] m102969xc7a6678a(byte[] bArr) {
            if (m102970x162afe36(bArr)) {
                return new java.lang.String[]{new java.lang.String(m102966x7d73d471(bArr, 0, 13)), new java.lang.String(m102966x7d73d471(bArr, 14, m102971x73d44649(bArr, f53751xe2002cf8)))};
            }
            return null;
        }

        /* renamed from: hasDateInfo */
        private static boolean m102970x162afe36(byte[] bArr) {
            return bArr != null && bArr.length > 15 && bArr[13] == 45 && m102971x73d44649(bArr, f53751xe2002cf8) > 14;
        }

        /* renamed from: indexOf */
        private static int m102971x73d44649(byte[] bArr, char c17) {
            for (int i17 = 0; i17 < bArr.length; i17++) {
                if (bArr[i17] == c17) {
                    return i17;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: isDue */
        public static boolean m102972x5fcf86a(java.lang.String str) {
            return m102973x5fcf86a(str.getBytes());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: newByteArrayWithDateInfo */
        public static byte[] m102974xddcb3373(int i17, byte[] bArr) {
            byte[] bytes = m102967xa1d38a98(i17).getBytes();
            byte[] bArr2 = new byte[bytes.length + bArr.length];
            java.lang.System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
            java.lang.System.arraycopy(bArr, 0, bArr2, bytes.length, bArr.length);
            return bArr2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: newStringWithDateInfo */
        public static java.lang.String m102975xbf490d3(int i17, java.lang.String str) {
            return m102967xa1d38a98(i17) + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: isDue */
        public static boolean m102973x5fcf86a(byte[] bArr) {
            java.lang.String[] m102969xc7a6678a = m102969xc7a6678a(bArr);
            if (m102969xc7a6678a != null && m102969xc7a6678a.length == 2) {
                java.lang.String str = m102969xc7a6678a[0];
                while (str.startsWith("0")) {
                    str = str.substring(1, str.length());
                }
                try {
                    if (java.lang.System.currentTimeMillis() > java.lang.Long.valueOf(str).longValue() + (java.lang.Long.valueOf(m102969xc7a6678a[1]).longValue() * 1000)) {
                        return true;
                    }
                } catch (java.lang.Exception unused) {
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: clearDateInfo */
        public static byte[] m102965x3ed5bee9(byte[] bArr) {
            return m102970x162afe36(bArr) ? m102966x7d73d471(bArr, m102971x73d44649(bArr, f53751xe2002cf8) + 1, bArr.length) : bArr;
        }
    }

    private C26450xc2f3a6f7(java.io.File file, long j17, int i17) {
        if (file.exists() || file.mkdirs()) {
            this.f53742xbdddfb15 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7.ACacheManager(file, j17, i17);
        } else {
            this.f53742xbdddfb15 = null;
        }
    }

    public static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7 get(android.content.Context context) {
        return get(context, "LocalCache");
    }

    /* renamed from: myPid */
    private static java.lang.String m102925x6383c3f() {
        return "_" + android.os.Process.myPid();
    }

    /* renamed from: clear */
    public void m102926x5a5b64d() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7.ACacheManager aCacheManager = this.f53742xbdddfb15;
        if (aCacheManager == null) {
            return;
        }
        aCacheManager.m102947x5a5b64d();
    }

    /* renamed from: file */
    public java.io.File m102927x2ff57c(java.lang.String str) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7.ACacheManager aCacheManager = this.f53742xbdddfb15;
        if (aCacheManager == null) {
            return null;
        }
        java.io.File m102948x6df5433c = aCacheManager.m102948x6df5433c(str);
        if (m102948x6df5433c.exists()) {
            return m102948x6df5433c;
        }
        return null;
    }

    /* renamed from: getAsBinary */
    public byte[] m102928x1233d449(java.lang.String str) {
        java.io.RandomAccessFile randomAccessFile;
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7.ACacheManager aCacheManager = this.f53742xbdddfb15;
        java.io.RandomAccessFile randomAccessFile2 = null;
        if (aCacheManager == null) {
            return null;
        }
        try {
            java.io.File file = aCacheManager.get(str);
            if (!file.exists()) {
                return null;
            }
            randomAccessFile = new java.io.RandomAccessFile(file, "r");
            try {
                byte[] bArr = new byte[(int) randomAccessFile.length()];
                if (randomAccessFile.read(bArr) <= 0) {
                    try {
                        randomAccessFile.close();
                    } catch (java.io.IOException unused) {
                    }
                    return null;
                }
                if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7.Utils.m102973x5fcf86a(bArr)) {
                    try {
                        randomAccessFile.close();
                    } catch (java.io.IOException unused2) {
                    }
                    m102935xc84af884(str);
                    return null;
                }
                byte[] m102965x3ed5bee9 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7.Utils.m102965x3ed5bee9(bArr);
                try {
                    randomAccessFile.close();
                } catch (java.io.IOException unused3) {
                }
                return m102965x3ed5bee9;
            } catch (java.lang.Exception unused4) {
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (java.io.IOException unused5) {
                    }
                }
                return null;
            } catch (java.lang.Throwable th6) {
                th = th6;
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 != null) {
                    try {
                        randomAccessFile2.close();
                    } catch (java.io.IOException unused6) {
                    }
                }
                throw th;
            }
        } catch (java.lang.Exception unused7) {
            randomAccessFile = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    /* renamed from: getAsBitmap */
    public android.graphics.Bitmap m102929x1236b977(java.lang.String str) {
        if (m102928x1233d449(str) == null) {
            return null;
        }
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7.Utils.m102952x2117eaae(m102928x1233d449(str));
    }

    /* renamed from: getAsDrawable */
    public android.graphics.drawable.Drawable m102930xeb6956e6(java.lang.String str) {
        if (m102928x1233d449(str) == null) {
            return null;
        }
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7.Utils.m102963x76b686a1(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7.Utils.m102952x2117eaae(m102928x1233d449(str)));
    }

    /* renamed from: getAsJSONArray */
    public org.json.JSONArray m102931x67354129(java.lang.String str) {
        try {
            return new org.json.JSONArray(m102934x2fd32859(str));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: getAsJSONObject */
    public org.json.JSONObject m102932x9671ae6f(java.lang.String str) {
        try {
            return new org.json.JSONObject(m102934x2fd32859(str));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: getAsObject */
    public java.lang.Object m102933x27fe6b87(java.lang.String str) {
        java.io.ByteArrayInputStream byteArrayInputStream;
        java.lang.Throwable th6;
        java.io.ObjectInputStream objectInputStream;
        byte[] m102928x1233d449 = m102928x1233d449(str);
        if (m102928x1233d449 != null) {
            try {
                byteArrayInputStream = new java.io.ByteArrayInputStream(m102928x1233d449);
                try {
                    objectInputStream = new java.io.ObjectInputStream(byteArrayInputStream);
                    try {
                        java.lang.Object readObject = objectInputStream.readObject();
                        try {
                            byteArrayInputStream.close();
                        } catch (java.io.IOException unused) {
                        }
                        try {
                            objectInputStream.close();
                        } catch (java.io.IOException unused2) {
                        }
                        return readObject;
                    } catch (java.lang.Exception unused3) {
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                            } catch (java.io.IOException unused4) {
                            }
                        }
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (java.io.IOException unused5) {
                            }
                        }
                        return null;
                    } catch (java.lang.Throwable th7) {
                        th6 = th7;
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                            } catch (java.io.IOException unused6) {
                            }
                        }
                        if (objectInputStream == null) {
                            throw th6;
                        }
                        try {
                            objectInputStream.close();
                            throw th6;
                        } catch (java.io.IOException unused7) {
                            throw th6;
                        }
                    }
                } catch (java.lang.Exception unused8) {
                    objectInputStream = null;
                } catch (java.lang.Throwable th8) {
                    th6 = th8;
                    objectInputStream = null;
                }
            } catch (java.lang.Exception unused9) {
                objectInputStream = null;
                byteArrayInputStream = null;
            } catch (java.lang.Throwable th9) {
                byteArrayInputStream = null;
                th6 = th9;
                objectInputStream = null;
            }
        }
        return null;
    }

    /* renamed from: getAsString */
    public java.lang.String m102934x2fd32859(java.lang.String str) {
        java.io.BufferedReader bufferedReader;
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7.ACacheManager aCacheManager = this.f53742xbdddfb15;
        java.io.BufferedReader bufferedReader2 = null;
        if (aCacheManager == null) {
            return null;
        }
        java.io.File file = aCacheManager.get(str);
        if (!file.exists()) {
            return null;
        }
        try {
            bufferedReader = new java.io.BufferedReader(new java.io.FileReader(file));
            java.lang.String str2 = "";
            while (true) {
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    str2 = str2 + readLine;
                } catch (java.io.IOException unused) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (java.io.IOException unused2) {
                        }
                    }
                    return null;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (java.io.IOException unused3) {
                        }
                    }
                    throw th;
                }
            }
            if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7.Utils.m102972x5fcf86a(str2)) {
                try {
                    bufferedReader.close();
                } catch (java.io.IOException unused4) {
                }
                m102935xc84af884(str);
                return null;
            }
            java.lang.String m102964x3ed5bee9 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7.Utils.m102964x3ed5bee9(str2);
            try {
                bufferedReader.close();
            } catch (java.io.IOException unused5) {
            }
            return m102964x3ed5bee9;
        } catch (java.io.IOException unused6) {
            bufferedReader = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public void put(java.lang.String str, java.lang.String str2) {
        java.io.BufferedWriter bufferedWriter;
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7.ACacheManager aCacheManager = this.f53742xbdddfb15;
        if (aCacheManager == null) {
            return;
        }
        java.io.File m102948x6df5433c = aCacheManager.m102948x6df5433c(str);
        java.io.BufferedWriter bufferedWriter2 = null;
        try {
            try {
                bufferedWriter = new java.io.BufferedWriter(new java.io.FileWriter(m102948x6df5433c), 1024);
            } catch (java.io.IOException unused) {
                this.f53742xbdddfb15.put(m102948x6df5433c);
            }
            try {
                bufferedWriter.write(str2);
                try {
                    bufferedWriter.flush();
                } catch (java.io.IOException unused2) {
                }
                bufferedWriter.close();
            } catch (java.io.IOException unused3) {
                bufferedWriter2 = bufferedWriter;
                if (bufferedWriter2 != null) {
                    try {
                        bufferedWriter2.flush();
                    } catch (java.io.IOException unused4) {
                    }
                    bufferedWriter2.close();
                }
                this.f53742xbdddfb15.put(m102948x6df5433c);
            } catch (java.lang.Throwable th6) {
                th = th6;
                bufferedWriter2 = bufferedWriter;
                if (bufferedWriter2 != null) {
                    try {
                        bufferedWriter2.flush();
                    } catch (java.io.IOException unused5) {
                    }
                    try {
                        bufferedWriter2.close();
                    } catch (java.io.IOException unused6) {
                    }
                }
                this.f53742xbdddfb15.put(m102948x6df5433c);
                throw th;
            }
        } catch (java.io.IOException unused7) {
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    /* renamed from: remove */
    public boolean m102935xc84af884(java.lang.String str) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7.ACacheManager aCacheManager = this.f53742xbdddfb15;
        if (aCacheManager == null) {
            return false;
        }
        return aCacheManager.m102949xc84af884(str);
    }

    public static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7 get(android.content.Context context, java.lang.String str) {
        return get(new java.io.File(context.getCacheDir(), str), 50000000L, Integer.MAX_VALUE);
    }

    public static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7 get(java.io.File file) {
        return get(file, 50000000L, Integer.MAX_VALUE);
    }

    public static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7 get(android.content.Context context, long j17, int i17) {
        return get(new java.io.File(context.getCacheDir(), "LocalCache"), j17, i17);
    }

    public static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7 get(java.io.File file, long j17, int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7 c26450xc2f3a6f7;
        try {
            c26450xc2f3a6f7 = f53741x2cc2e5da.get(file.getAbsoluteFile() + m102925x6383c3f());
        } catch (java.lang.Exception unused) {
            c26450xc2f3a6f7 = null;
        }
        if (c26450xc2f3a6f7 != null) {
            return c26450xc2f3a6f7;
        }
        try {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7 c26450xc2f3a6f72 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7(file, j17, i17);
            try {
                f53741x2cc2e5da.put(file.getAbsolutePath() + m102925x6383c3f(), c26450xc2f3a6f72);
            } catch (java.lang.Throwable unused2) {
            }
            return c26450xc2f3a6f72;
        } catch (java.lang.Throwable unused3) {
            return c26450xc2f3a6f7;
        }
    }

    public void put(java.lang.String str, java.lang.String str2, int i17) {
        put(str, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7.Utils.m102975xbf490d3(i17, str2));
    }

    public void put(java.lang.String str, org.json.JSONObject jSONObject) {
        put(str, jSONObject.toString());
    }

    public void put(java.lang.String str, org.json.JSONObject jSONObject, int i17) {
        put(str, jSONObject.toString(), i17);
    }

    public void put(java.lang.String str, org.json.JSONArray jSONArray) {
        put(str, jSONArray.toString());
    }

    public void put(java.lang.String str, org.json.JSONArray jSONArray, int i17) {
        put(str, jSONArray.toString(), i17);
    }

    public void put(java.lang.String str, byte[] bArr) {
        java.io.FileOutputStream fileOutputStream;
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7.ACacheManager aCacheManager = this.f53742xbdddfb15;
        if (aCacheManager == null) {
            return;
        }
        java.io.File m102948x6df5433c = aCacheManager.m102948x6df5433c(str);
        java.io.FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new java.io.FileOutputStream(m102948x6df5433c);
            } catch (java.io.IOException unused) {
            }
        } catch (java.lang.Exception unused2) {
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (java.lang.Exception unused3) {
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                fileOutputStream2.flush();
                fileOutputStream2.close();
            }
            this.f53742xbdddfb15.put(m102948x6df5433c);
        } catch (java.lang.Throwable th7) {
            th = th7;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                } catch (java.io.IOException unused4) {
                }
            }
            this.f53742xbdddfb15.put(m102948x6df5433c);
            throw th;
        }
        this.f53742xbdddfb15.put(m102948x6df5433c);
    }

    public void put(java.lang.String str, byte[] bArr, int i17) {
        put(str, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7.Utils.m102974xddcb3373(i17, bArr));
    }

    public void put(java.lang.String str, java.io.Serializable serializable) {
        put(str, serializable, -1);
    }

    public void put(java.lang.String str, java.io.Serializable serializable, int i17) {
        java.io.ObjectOutputStream objectOutputStream = null;
        try {
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                java.io.ObjectOutputStream objectOutputStream2 = new java.io.ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeObject(serializable);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (i17 != -1) {
                        put(str, byteArray, i17);
                    } else {
                        put(str, byteArray);
                    }
                    objectOutputStream2.close();
                } catch (java.lang.Exception unused) {
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream == null) {
                        return;
                    }
                    objectOutputStream.close();
                } catch (java.lang.Throwable unused2) {
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream == null) {
                        return;
                    }
                    objectOutputStream.close();
                }
            } catch (java.lang.Throwable unused3) {
            }
        } catch (java.lang.Exception unused4) {
        } catch (java.lang.Throwable unused5) {
        }
    }

    public void put(java.lang.String str, android.graphics.Bitmap bitmap) {
        put(str, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7.Utils.m102951xba3d8568(bitmap));
    }

    public void put(java.lang.String str, android.graphics.Bitmap bitmap, int i17) {
        put(str, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7.Utils.m102951xba3d8568(bitmap), i17);
    }

    public void put(java.lang.String str, android.graphics.drawable.Drawable drawable) {
        put(str, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7.Utils.m102968xe4c2a1a3(drawable));
    }

    public void put(java.lang.String str, android.graphics.drawable.Drawable drawable, int i17) {
        put(str, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3049x96b2b2bd.C26450xc2f3a6f7.Utils.m102968xe4c2a1a3(drawable), i17);
    }
}
