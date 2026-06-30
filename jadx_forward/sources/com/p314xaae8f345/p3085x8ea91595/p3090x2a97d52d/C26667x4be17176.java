package com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d;

/* renamed from: com.tencent.tmassistantsdk.downloadservice.DownloadInfo */
/* loaded from: classes13.dex */
public class C26667x4be17176 {

    /* renamed from: CONTENTTYPE */
    public static final java.lang.String f56081x69307313 = "contentType";

    /* renamed from: DOWNLOADFAILEDERRCODE */
    public static final java.lang.String f56082x82d1164d = "downloadFailedErrCode";

    /* renamed from: DOWNLOADFAILEDTIME */
    public static final java.lang.String f56083x8c621b12 = "downloadFailedTime";

    /* renamed from: FILENAME */
    public static final java.lang.String f56084x2da4207 = "fileName";

    /* renamed from: FINALURL */
    public static final java.lang.String f56085x60af839 = "finalUrl";

    /* renamed from: HEADERPARAMS */
    public static final java.lang.String f56086x321be653 = "headerParams";

    /* renamed from: NETTYPE */
    public static final java.lang.String f56087x98abae37 = "netType";

    /* renamed from: PRIORITY */
    public static final java.lang.String f56088xe92e69a4 = "priority";

    /* renamed from: RECEIVEDBYTES */
    public static final java.lang.String f56089x2f8bf30a = "receivedBytes";

    /* renamed from: REDIRECTCNT */
    public static final java.lang.String f56090xf5c4bfed = "redirectCnt";

    /* renamed from: REQUESTFILESIZE */
    public static final java.lang.String f56091xad4546ec = "requestFileSize";

    /* renamed from: RETRYCNT */
    public static final java.lang.String f56092x1c326dc1 = "retryCnt";

    /* renamed from: SECONDARYURL */
    public static final java.lang.String f56093x77ef577b = "secondaryUrl";

    /* renamed from: STATUS */
    public static final java.lang.String f56094x9260c3f2 = "status";
    public static final java.lang.String TAG = "_DownloadInfo";

    /* renamed from: TASKID */
    public static final java.lang.String f56095x9311e960 = "taskId";

    /* renamed from: TASKURL */
    public static final java.lang.String f56096xcf2b71aa = "taskUrl";

    /* renamed from: TOTALBYTES */
    public static final java.lang.String f56097xf30b3ba7 = "totalBytes";
    public static final java.lang.String UID = "uId";

    /* renamed from: mAutoRetry */
    private boolean f56098xdcfed44c;

    /* renamed from: mContentType */
    public java.lang.String f56099x92db64a6;

    /* renamed from: mDownloadFailedErrCode */
    public int f56100x9d2defe0;

    /* renamed from: mDownloadFailedTime */
    public long f56101x9990ea9f;

    /* renamed from: mDownloadTaskId */
    public int f56102x2dcb29f5;

    /* renamed from: mFileName */
    public java.lang.String f56103xf9236db4;

    /* renamed from: mHeaderParamString */
    private java.lang.String f56104xc25c2944;

    /* renamed from: mHeaderParams */
    private java.util.HashMap<java.lang.String, java.lang.String> f56105x8f70380;

    /* renamed from: mNetType */
    public java.lang.String f56106xbea494a;

    /* renamed from: mPriority */
    public int f56107xdf862131;

    /* renamed from: mReceivedBytes */
    public long f56108xcf18f39d;

    /* renamed from: mRedirectCnt */
    public int f56109x1f7dc540;

    /* renamed from: mRequestFileSize */
    public java.lang.Long f56110x3e27b31f;

    /* renamed from: mRequestURL */
    public java.lang.String f56111xde6810ad;

    /* renamed from: mRetryCnt */
    public int f56112x1289ad2e;

    /* renamed from: mSecondaryUrl */
    public java.lang.String f56113x85651068;

    /* renamed from: mStatus */
    public int f56114x1a39f6bf;

    /* renamed from: mTaskIsRunning */
    boolean f56115x77db5c3;

    /* renamed from: mTempFileName */
    protected java.lang.String f56116x8b847328;

    /* renamed from: mTotalBytes */
    protected long f56117xb09057d4;

    /* renamed from: mURL */
    public java.lang.String f56118x32d5c2;

    /* renamed from: mUUID */
    public java.lang.String f56119x627eda8;

    public C26667x4be17176() {
        this.f56098xdcfed44c = false;
        this.f56115x77db5c3 = false;
    }

    /* renamed from: readFromCursor */
    public static com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176 m104894x9e4de1d6(android.database.Cursor cursor) {
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176 c26667x4be17176 = new com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176();
        c26667x4be17176.f56102x2dcb29f5 = cursor.getInt(cursor.getColumnIndex("taskId"));
        c26667x4be17176.f56119x627eda8 = cursor.getString(cursor.getColumnIndex(UID));
        c26667x4be17176.f56111xde6810ad = cursor.getString(cursor.getColumnIndex(f56085x60af839));
        c26667x4be17176.f56118x32d5c2 = cursor.getString(cursor.getColumnIndex("taskUrl"));
        c26667x4be17176.f56113x85651068 = cursor.getString(cursor.getColumnIndex(f56093x77ef577b));
        c26667x4be17176.f56110x3e27b31f = java.lang.Long.valueOf(cursor.getLong(cursor.getColumnIndex(f56091xad4546ec)));
        c26667x4be17176.f56103xf9236db4 = cursor.getString(cursor.getColumnIndex(f56084x2da4207));
        c26667x4be17176.f56099x92db64a6 = cursor.getString(cursor.getColumnIndex(f56081x69307313));
        c26667x4be17176.f56109x1f7dc540 = cursor.getInt(cursor.getColumnIndex(f56090xf5c4bfed));
        c26667x4be17176.f56112x1289ad2e = cursor.getInt(cursor.getColumnIndex(f56092x1c326dc1));
        c26667x4be17176.f56117xb09057d4 = cursor.getLong(cursor.getColumnIndex(f56097xf30b3ba7));
        c26667x4be17176.f56114x1a39f6bf = cursor.getInt(cursor.getColumnIndex("status"));
        c26667x4be17176.f56108xcf18f39d = cursor.getLong(cursor.getColumnIndex(f56089x2f8bf30a));
        c26667x4be17176.f56107xdf862131 = cursor.getInt(cursor.getColumnIndex(f56088xe92e69a4));
        c26667x4be17176.f56106xbea494a = cursor.getString(cursor.getColumnIndex(f56087x98abae37));
        c26667x4be17176.f56100x9d2defe0 = cursor.getInt(cursor.getColumnIndex(f56082x82d1164d));
        c26667x4be17176.f56101x9990ea9f = cursor.getLong(cursor.getColumnIndex(f56083x8c621b12));
        c26667x4be17176.f56104xc25c2944 = cursor.getString(cursor.getColumnIndex(f56086x321be653));
        return c26667x4be17176;
    }

    /* renamed from: readFromSimpleCursor */
    public static com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176 m104895x12e29228(android.database.Cursor cursor) {
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176 c26667x4be17176 = new com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176();
        c26667x4be17176.f56102x2dcb29f5 = cursor.getInt(cursor.getColumnIndex("taskId"));
        c26667x4be17176.f56119x627eda8 = cursor.getString(cursor.getColumnIndex(UID));
        c26667x4be17176.f56111xde6810ad = cursor.getString(cursor.getColumnIndex(f56085x60af839));
        c26667x4be17176.f56118x32d5c2 = cursor.getString(cursor.getColumnIndex("taskUrl"));
        c26667x4be17176.f56113x85651068 = cursor.getString(cursor.getColumnIndex(f56093x77ef577b));
        c26667x4be17176.f56110x3e27b31f = java.lang.Long.valueOf(cursor.getLong(cursor.getColumnIndex(f56091xad4546ec)));
        c26667x4be17176.f56103xf9236db4 = cursor.getString(cursor.getColumnIndex(f56084x2da4207));
        c26667x4be17176.f56099x92db64a6 = cursor.getString(cursor.getColumnIndex(f56081x69307313));
        c26667x4be17176.f56109x1f7dc540 = cursor.getInt(cursor.getColumnIndex(f56090xf5c4bfed));
        c26667x4be17176.f56112x1289ad2e = cursor.getInt(cursor.getColumnIndex(f56092x1c326dc1));
        c26667x4be17176.f56117xb09057d4 = cursor.getLong(cursor.getColumnIndex(f56097xf30b3ba7));
        c26667x4be17176.f56114x1a39f6bf = cursor.getInt(cursor.getColumnIndex("status"));
        c26667x4be17176.f56108xcf18f39d = cursor.getLong(cursor.getColumnIndex(f56089x2f8bf30a));
        c26667x4be17176.f56107xdf862131 = cursor.getInt(cursor.getColumnIndex(f56088xe92e69a4));
        c26667x4be17176.f56106xbea494a = null;
        c26667x4be17176.f56100x9d2defe0 = 0;
        c26667x4be17176.f56101x9990ea9f = 0L;
        c26667x4be17176.f56104xc25c2944 = null;
        return c26667x4be17176;
    }

    /* renamed from: writeToContentValues */
    public static void m104896xf8da4661(android.content.ContentValues contentValues, com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176 c26667x4be17176) {
        if (c26667x4be17176 == null || contentValues == null) {
            return;
        }
        contentValues.put("taskId", java.lang.Integer.valueOf(c26667x4be17176.f56102x2dcb29f5));
        contentValues.put(UID, c26667x4be17176.f56119x627eda8);
        contentValues.put(f56085x60af839, c26667x4be17176.f56111xde6810ad);
        contentValues.put("taskUrl", c26667x4be17176.f56118x32d5c2);
        contentValues.put(f56093x77ef577b, c26667x4be17176.f56113x85651068);
        contentValues.put(f56091xad4546ec, c26667x4be17176.f56110x3e27b31f);
        contentValues.put(f56084x2da4207, c26667x4be17176.f56103xf9236db4);
        contentValues.put(f56081x69307313, c26667x4be17176.f56099x92db64a6);
        contentValues.put(f56090xf5c4bfed, java.lang.Integer.valueOf(c26667x4be17176.f56109x1f7dc540));
        contentValues.put(f56092x1c326dc1, java.lang.Integer.valueOf(c26667x4be17176.f56112x1289ad2e));
        contentValues.put(f56097xf30b3ba7, java.lang.Long.valueOf(c26667x4be17176.f56117xb09057d4));
        contentValues.put("status", java.lang.Integer.valueOf(c26667x4be17176.f56114x1a39f6bf));
        contentValues.put(f56089x2f8bf30a, java.lang.Long.valueOf(c26667x4be17176.f56108xcf18f39d));
        contentValues.put(f56088xe92e69a4, java.lang.Integer.valueOf(c26667x4be17176.f56107xdf862131));
        contentValues.put(f56087x98abae37, c26667x4be17176.f56106xbea494a);
        contentValues.put(f56082x82d1164d, java.lang.Integer.valueOf(c26667x4be17176.f56100x9d2defe0));
        contentValues.put(f56083x8c621b12, java.lang.Long.valueOf(c26667x4be17176.f56101x9990ea9f));
        contentValues.put(f56086x321be653, c26667x4be17176.f56104xc25c2944);
    }

    /* renamed from: dump */
    public void m104897x2f39f4(java.lang.String str) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(str, "--------dump DownloadInfo-----------");
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(str, "mContentType: " + this.f56099x92db64a6);
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(str, "mURL: " + this.f56118x32d5c2);
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(str, "mRequestURL: " + this.f56111xde6810ad);
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(str, "mSecondaryUrl: " + this.f56113x85651068);
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(str, "mRequestFileSize: " + this.f56110x3e27b31f);
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(str, "mRetryCnt: " + this.f56112x1289ad2e);
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(str, "mRedirectCnt: " + this.f56109x1f7dc540);
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(str, "mTotalBytes: " + this.f56117xb09057d4);
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(str, "mUUID: " + this.f56119x627eda8);
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(str, "mStatus: " + this.f56114x1a39f6bf);
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(str, "mReceivedBytes: " + this.f56108xcf18f39d);
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(str, "mFileName: " + this.f56103xf9236db4);
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(str, "mDownloadFailedErrCode: " + this.f56100x9d2defe0);
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(str, "mNetType:" + this.f56106xbea494a);
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(str, "mDownloadFailedTime:" + this.f56101x9990ea9f);
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(str, "mHeaderParamString:" + this.f56104xc25c2944);
    }

    /* renamed from: getHeaderParams */
    public java.util.HashMap<java.lang.String, java.lang.String> m104898xd2547ce9() {
        return this.f56105x8f70380;
    }

    /* renamed from: getTotalSize */
    public long m104899xdd045eaf() {
        return this.f56117xb09057d4;
    }

    /* renamed from: hasFinished */
    public boolean m104900x832d7d2c() {
        return this.f56114x1a39f6bf > 3;
    }

    /* renamed from: hasReceivedAllDataBytes */
    public boolean m104901x5e71f07b() {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "mTotalBytes = " + this.f56117xb09057d4 + ", mReceivedBytes = " + this.f56108xcf18f39d);
        long j17 = this.f56117xb09057d4;
        return j17 != 0 && this.f56108xcf18f39d == j17;
    }

    /* renamed from: hasRetryChance */
    public boolean m104902x931dd502() {
        return this.f56112x1289ad2e <= 5;
    }

    /* renamed from: pauseDownload */
    public void m104903xe51afc9e() {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "DownloadInfo::pauseDownload url: " + this.f56118x32d5c2);
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e.m104941x9cf0d20b().m104943x48fc89c7(this.f56102x2dcb29f5);
        m104910xc7ed7a1b(3, false);
    }

    /* renamed from: setHeaderParams */
    public void m104904x89d77f5(java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        if (hashMap == null || hashMap.size() <= 0) {
            return;
        }
        this.f56105x8f70380 = hashMap;
        this.f56104xc25c2944 = new org.json.JSONObject(hashMap).toString();
    }

    /* renamed from: setTotalSize */
    public void m104905x39581f23(long j17) {
        if (0 == j17) {
            this.f56108xcf18f39d = 0L;
        }
        this.f56117xb09057d4 = j17;
        com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26760xbf3cb54f.m105397x9cf0d20b().m105398xbdd60097(this);
    }

    /* renamed from: startDownloadIfReady */
    public int m104906x1d3a901c() {
        return m104907x1d3a901c(false);
    }

    /* renamed from: stopDownload */
    public void m104908xf2c12aa() {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "DownloadInfo::stopDownload url: " + this.f56118x32d5c2);
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e.m104941x9cf0d20b().m104943x48fc89c7(this.f56102x2dcb29f5);
        m104910xc7ed7a1b(6, false);
    }

    /* renamed from: updateReceivedSize */
    public void m104909x98510ceb(long j17) {
        this.f56108xcf18f39d += j17;
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26668x16cd9691.m104911x9cf0d20b().m104912xdb72a920(this.f56118x32d5c2, this.f56108xcf18f39d, this.f56117xb09057d4);
    }

    /* renamed from: updateStatus */
    public synchronized void m104910xc7ed7a1b(int i17, boolean z17) {
        if (m104900x832d7d2c()) {
            return;
        }
        this.f56114x1a39f6bf = i17;
        if (i17 != 6) {
            if (i17 == 5) {
                this.f56101x9990ea9f = java.lang.System.currentTimeMillis();
            }
            com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26760xbf3cb54f.m105397x9cf0d20b().m105398xbdd60097(this);
            com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26668x16cd9691.m104911x9cf0d20b().m104913xc9b7fa2a(this.f56118x32d5c2, this.f56114x1a39f6bf, this.f56100x9d2defe0, "", z17, this.f56098xdcfed44c);
        } else {
            com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26760xbf3cb54f.m105397x9cf0d20b().m105399xf72dcea1(this.f56118x32d5c2);
        }
    }

    /* renamed from: startDownloadIfReady */
    public int m104907x1d3a901c(boolean z17) {
        java.util.HashMap<java.lang.String, java.lang.String> hashMap;
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "DownloadInfo::startDownloadIfReady url: " + this.f56118x32d5c2);
        if (!android.text.TextUtils.isEmpty(this.f56104xc25c2944) && ((hashMap = this.f56105x8f70380) == null || hashMap.size() <= 0)) {
            java.util.HashMap<java.lang.String, java.lang.String> hashMap2 = new java.util.HashMap<>();
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(this.f56104xc25c2944);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    hashMap2.put(next, jSONObject.getString(next));
                }
                if (hashMap2.size() > 0) {
                    this.f56105x8f70380 = hashMap2;
                }
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            }
        }
        if (this.f56115x77db5c3) {
            return 5;
        }
        this.f56098xdcfed44c = z17;
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "autoRetry = " + this.f56098xdcfed44c);
        if (this.f56103xf9236db4 == null) {
            this.f56103xf9236db4 = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104884x7e916b09(this.f56118x32d5c2, this.f56099x92db64a6);
        }
        if (this.f56116x8b847328 == null) {
            this.f56116x8b847328 = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104884x7e916b09(this.f56118x32d5c2, this.f56099x92db64a6);
        }
        if (this.f56117xb09057d4 == 0) {
            new com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26761xfeddef81(this.f56116x8b847328, this.f56103xf9236db4).m105411x36cbb23b();
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "mFileName = " + this.f56103xf9236db4);
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "mTempFileName = " + this.f56116x8b847328);
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "mTotalBytes = " + this.f56117xb09057d4 + ", mStatus = " + this.f56114x1a39f6bf);
        if (this.f56114x1a39f6bf == 5) {
            this.f56111xde6810ad = this.f56118x32d5c2;
        }
        if (!android.text.TextUtils.isEmpty(this.f56103xf9236db4)) {
            com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26761xfeddef81 c26761xfeddef81 = new com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26761xfeddef81(this.f56116x8b847328, this.f56103xf9236db4);
            long m105415xbe0e3ae6 = c26761xfeddef81.m105415xbe0e3ae6();
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "FileLen: " + m105415xbe0e3ae6 + " filename: " + this.f56103xf9236db4);
            if (m105415xbe0e3ae6 > this.f56117xb09057d4) {
                c26761xfeddef81.m105411x36cbb23b();
                this.f56108xcf18f39d = 0L;
            } else {
                this.f56108xcf18f39d = m105415xbe0e3ae6;
            }
            if (m104901x5e71f07b()) {
                c26761xfeddef81.m105416xa5fca9a6();
                m104910xc7ed7a1b(4, false);
                return 4;
            }
        }
        if (this.f56114x1a39f6bf == 5) {
            this.f56109x1f7dc540 = 0;
            this.f56112x1289ad2e = 0;
            this.f56114x1a39f6bf = 0;
            this.f56100x9d2defe0 = 0;
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "startDownloadIfReady...");
        m104897x2f39f4(TAG);
        if (com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e.m104941x9cf0d20b().m104944xa30d80a3(this.f56118x32d5c2) == null) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "dt is null");
            com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26670x4be6424d c26670x4be6424d = new com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26670x4be6424d(this);
            m104910xc7ed7a1b(1, false);
            this.f56102x2dcb29f5 = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e.m104941x9cf0d20b().m104942xbddad16e(c26670x4be6424d);
        }
        return 0;
    }

    public C26667x4be17176(java.lang.String str, java.lang.String str2, long j17, int i17, java.lang.String str3) {
        this.f56098xdcfed44c = false;
        this.f56118x32d5c2 = str;
        this.f56113x85651068 = str2;
        this.f56111xde6810ad = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104881x44e1d0a5(str);
        this.f56110x3e27b31f = java.lang.Long.valueOf(j17);
        this.f56119x627eda8 = java.util.UUID.randomUUID().toString();
        this.f56107xdf862131 = i17;
        this.f56114x1a39f6bf = 0;
        this.f56100x9d2defe0 = 0;
        this.f56115x77db5c3 = false;
        this.f56099x92db64a6 = str3;
        this.f56106xbea494a = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104885x3d316d39();
        this.f56101x9990ea9f = 0L;
    }
}
