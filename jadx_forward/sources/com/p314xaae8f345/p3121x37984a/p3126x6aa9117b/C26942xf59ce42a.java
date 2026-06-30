package com.p314xaae8f345.p3121x37984a.p3126x6aa9117b;

/* renamed from: com.tencent.wcdb.database.SQLiteConnection */
/* loaded from: classes12.dex */
public final class C26942xf59ce42a implements com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab.OnCancelListener {

    /* renamed from: DEBUG */
    private static final boolean f58098x3de9e33 = false;
    private static final java.lang.String TAG = "WCDB.SQLiteConnection";

    /* renamed from: mAcquiredStack */
    private java.lang.Throwable f58104xb383616d;

    /* renamed from: mAcquiredThread */
    private java.lang.Thread f58105xbdfc4bc5;

    /* renamed from: mAcquiredTid */
    private int f58106xf3eed4b4;

    /* renamed from: mAcquiredTimestamp */
    private long f58107x335dcd7b;

    /* renamed from: mCancellationSignalAttachCount */
    private int f58108x7c3595d2;

    /* renamed from: mCipher */
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 f58109xfe580cd8;

    /* renamed from: mConfiguration */
    private final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f f58110xce417d89;

    /* renamed from: mConnectionId */
    private final int f58111xa3561a6;

    /* renamed from: mConnectionPtr */
    private long f58112x3c76efc3;

    /* renamed from: mIsPrimaryConnection */
    private final boolean f58113xb6ee48c9;

    /* renamed from: mIsReadOnlyConnection */
    private final boolean f58114x40e8c9b7;

    /* renamed from: mNativeHandleCount */
    private int f58115xcde54643;

    /* renamed from: mNativeOperation */
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.Operation f58116x192bfee3;

    /* renamed from: mOnlyAllowReadOnlyOperations */
    private boolean f58117x7800351e;

    /* renamed from: mPassword */
    private byte[] f58118x6d876228;

    /* renamed from: mPool */
    private final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66 f58119x6260e29;

    /* renamed from: mPreparedStatementCache */
    private final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatementCache f58120xcc80c1bd;

    /* renamed from: mPreparedStatementPool */
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement f58121x7a3bd281;

    /* renamed from: mRecentOperations */
    private final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.OperationLog f58122xbc1bcf34 = new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.OperationLog();

    /* renamed from: EMPTY_STRING_ARRAY */
    private static final java.lang.String[] f58100x19b28e5d = new java.lang.String[0];

    /* renamed from: EMPTY_BYTE_ARRAY */
    private static final byte[] f58099x1dbf0a94 = new byte[0];

    /* renamed from: TRIM_SQL_PATTERN */
    private static final java.util.regex.Pattern f58103xeaa07942 = java.util.regex.Pattern.compile("[\\s]*\\n+[\\s]*");

    /* renamed from: HMAC_ALGO_MAPPING */
    private static final java.lang.String[] f58101x8bcb501a = {"HMAC_SHA1", "HMAC_SHA256", "HMAC_SHA512"};

    /* renamed from: PBKDF2_ALGO_MAPPING */
    private static final java.lang.String[] f58102x4411a54a = {"PBKDF2_HMAC_SHA1", "PBKDF2_HMAC_SHA256", "PBKDF2_HMAC_SHA512"};

    /* renamed from: com.tencent.wcdb.database.SQLiteConnection$Operation */
    /* loaded from: classes12.dex */
    public static final class Operation {

        /* renamed from: sDateFormat */
        private static final java.text.SimpleDateFormat f58123x62cf0218 = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

        /* renamed from: mBindArgs */
        java.util.ArrayList<java.lang.Object> f58124x5cf4aa47;

        /* renamed from: mCookie */
        int f58125xfeac3131;

        /* renamed from: mEndTime */
        long f58126x3e4c1d1b;

        /* renamed from: mException */
        java.lang.Exception f58127xd3071a62;

        /* renamed from: mFinished */
        boolean f58128xfcd667ff;

        /* renamed from: mKind */
        java.lang.String f58129x623b1a1;

        /* renamed from: mSql */
        java.lang.String f58130x32d221;

        /* renamed from: mStartTime */
        long f58131xfbccd462;

        /* renamed from: mTid */
        int f58132x32d4e2;

        /* renamed from: mType */
        int f58133x6280547;

        private Operation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: getFormattedStartTime */
        public java.lang.String m107508x5cde6ee9() {
            return f58123x62cf0218.format(new java.util.Date(this.f58131xfbccd462));
        }

        /* renamed from: getStatus */
        private java.lang.String m107509x2fe4f2e8() {
            return !this.f58128xfcd667ff ? "running" : this.f58127xd3071a62 != null ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d : "succeeded";
        }

        /* renamed from: describe */
        public void m107510x3cb0b6cb(java.lang.StringBuilder sb6, boolean z17) {
            java.util.ArrayList<java.lang.Object> arrayList;
            sb6.append(this.f58129x623b1a1);
            if (this.f58128xfcd667ff) {
                sb6.append(" took ");
                sb6.append(this.f58126x3e4c1d1b - this.f58131xfbccd462);
                sb6.append("ms");
            } else {
                sb6.append(" started ");
                sb6.append(java.lang.System.currentTimeMillis() - this.f58131xfbccd462);
                sb6.append("ms ago");
            }
            sb6.append(" - ");
            sb6.append(m107509x2fe4f2e8());
            if (this.f58130x32d221 != null) {
                sb6.append(", sql=\"");
                sb6.append(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.m107476xafa01325(this.f58130x32d221));
                sb6.append("\"");
            }
            if (this.f58132x32d4e2 > 0) {
                sb6.append(", tid=");
                sb6.append(this.f58132x32d4e2);
            }
            if (z17 && (arrayList = this.f58124x5cf4aa47) != null && arrayList.size() != 0) {
                sb6.append(", bindArgs=[");
                int size = this.f58124x5cf4aa47.size();
                for (int i17 = 0; i17 < size; i17++) {
                    java.lang.Object obj = this.f58124x5cf4aa47.get(i17);
                    if (i17 != 0) {
                        sb6.append(", ");
                    }
                    if (obj == null) {
                        sb6.append("null");
                    } else if (obj instanceof byte[]) {
                        sb6.append("<byte[]>");
                    } else if (obj instanceof java.lang.String) {
                        sb6.append("\"");
                        sb6.append((java.lang.String) obj);
                        sb6.append("\"");
                    } else {
                        sb6.append(obj);
                    }
                }
                sb6.append("]");
            }
            java.lang.Exception exc = this.f58127xd3071a62;
            if (exc == null || exc.getMessage() == null) {
                return;
            }
            sb6.append(", exception=\"");
            sb6.append(this.f58127xd3071a62.getMessage());
            sb6.append("\"");
        }

        /* renamed from: dumpJSON */
        public org.json.JSONObject m107511x817c04dc(boolean z17) {
            org.json.JSONObject putOpt = new org.json.JSONObject().put("start", this.f58131xfbccd462).put("kind", this.f58129x623b1a1).put("duration", (this.f58128xfcd667ff ? this.f58126x3e4c1d1b : java.lang.System.currentTimeMillis()) - this.f58131xfbccd462).put("status", m107509x2fe4f2e8()).putOpt("sql", this.f58130x32d221);
            int i17 = this.f58132x32d4e2;
            return putOpt.putOpt("tid", i17 > 0 ? java.lang.Integer.valueOf(i17) : null).putOpt("exception", this.f58127xd3071a62);
        }
    }

    /* renamed from: com.tencent.wcdb.database.SQLiteConnection$OperationLog */
    /* loaded from: classes12.dex */
    public final class OperationLog {

        /* renamed from: COOKIE_GENERATION_SHIFT */
        private static final int f58134xa852b2f6 = 8;

        /* renamed from: COOKIE_INDEX_MASK */
        private static final int f58135x41775714 = 255;

        /* renamed from: MAX_RECENT_OPERATIONS */
        private static final int f58136xd6fa3215 = 20;

        /* renamed from: mGeneration */
        private int f58137xee6aa165;

        /* renamed from: mIndex */
        private int f58138xbe387465;

        /* renamed from: mOperations */
        private final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.Operation[] f58139xdc71d039;

        private OperationLog() {
            this.f58139xdc71d039 = new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.Operation[20];
        }

        /* renamed from: endOperationDeferLogLocked */
        private boolean m107512xe613a608(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.Operation operation) {
            if (operation == null) {
                return false;
            }
            operation.f58126x3e4c1d1b = java.lang.System.currentTimeMillis();
            operation.f58128xfcd667ff = true;
            java.lang.Exception exc = operation.f58127xd3071a62;
            if (exc == null || exc.getMessage() == null) {
                return com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26953xd9a91187.m107755x2d03b5b6(operation.f58126x3e4c1d1b - operation.f58131xfbccd462);
            }
            return true;
        }

        /* renamed from: getOperationLocked */
        private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.Operation m107513x6be5dd1b(int i17) {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.Operation operation = this.f58139xdc71d039[i17 & 255];
            if (operation.f58125xfeac3131 == i17) {
                return operation;
            }
            return null;
        }

        /* renamed from: logOperationLocked */
        private void m107514xf4f9af6d(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.Operation operation, java.lang.String str) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            operation.m107510x3cb0b6cb(sb6, false);
            if (str != null) {
                sb6.append(", ");
                sb6.append(str);
            }
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.i(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.TAG, sb6.toString());
        }

        /* renamed from: newOperationCookieLocked */
        private int m107515x83c8ffd5(int i17) {
            int i18 = this.f58137xee6aa165;
            this.f58137xee6aa165 = i18 + 1;
            return i17 | (i18 << 8);
        }

        /* renamed from: beginOperation */
        public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.Operation m107516x8cfb2abe(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.Operation operation;
            synchronized (this.f58139xdc71d039) {
                int i17 = (this.f58138xbe387465 + 1) % 20;
                operation = this.f58139xdc71d039[i17];
                if (operation == null) {
                    operation = new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.Operation();
                    this.f58139xdc71d039[i17] = operation;
                } else {
                    operation.f58128xfcd667ff = false;
                    operation.f58127xd3071a62 = null;
                    java.util.ArrayList<java.lang.Object> arrayList = operation.f58124x5cf4aa47;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                }
                operation.f58131xfbccd462 = java.lang.System.currentTimeMillis();
                operation.f58129x623b1a1 = str;
                operation.f58130x32d221 = str2;
                if (objArr != null) {
                    java.util.ArrayList<java.lang.Object> arrayList2 = operation.f58124x5cf4aa47;
                    if (arrayList2 == null) {
                        operation.f58124x5cf4aa47 = new java.util.ArrayList<>();
                    } else {
                        arrayList2.clear();
                    }
                    for (java.lang.Object obj : objArr) {
                        if (obj == null || !(obj instanceof byte[])) {
                            operation.f58124x5cf4aa47.add(obj);
                        } else {
                            operation.f58124x5cf4aa47.add(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.f58099x1dbf0a94);
                        }
                    }
                }
                operation.f58125xfeac3131 = m107515x83c8ffd5(i17);
                operation.f58132x32d4e2 = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.this.f58106xf3eed4b4;
                this.f58138xbe387465 = i17;
            }
            return operation;
        }

        /* renamed from: describeCurrentOperation */
        public java.lang.String m107517xbf854d9() {
            synchronized (this.f58139xdc71d039) {
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.Operation operation = this.f58139xdc71d039[this.f58138xbe387465];
                if (operation == null || operation.f58128xfcd667ff) {
                    return null;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                operation.m107510x3cb0b6cb(sb6, false);
                return sb6.toString();
            }
        }

        /* renamed from: dump */
        public void m107518x2f39f4(android.util.Printer printer, boolean z17) {
            synchronized (this.f58139xdc71d039) {
                printer.println("  Most recently executed operations:");
                int i17 = this.f58138xbe387465;
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.Operation operation = this.f58139xdc71d039[i17];
                if (operation != null) {
                    int i18 = 0;
                    do {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append("    ");
                        sb6.append(i18);
                        sb6.append(": [");
                        sb6.append(operation.m107508x5cde6ee9());
                        sb6.append("] ");
                        operation.m107510x3cb0b6cb(sb6, z17);
                        printer.println(sb6.toString());
                        i17 = i17 > 0 ? i17 - 1 : 19;
                        i18++;
                        operation = this.f58139xdc71d039[i17];
                        if (operation == null) {
                            break;
                        }
                    } while (i18 < 20);
                } else {
                    printer.println("    <none>");
                }
            }
        }

        /* renamed from: dumpJSON */
        public org.json.JSONArray m107519x817c04dc(boolean z17) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            synchronized (this.f58139xdc71d039) {
                int i17 = this.f58138xbe387465;
                int i18 = 0;
                while (true) {
                    com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.Operation operation = this.f58139xdc71d039[i17];
                    if (operation == null) {
                        break;
                    }
                    int i19 = i18 + 1;
                    if (i18 >= 20) {
                        break;
                    }
                    jSONArray.put(operation.m107511x817c04dc(z17));
                    i17 = i17 > 0 ? i17 - 1 : 19;
                    i18 = i19;
                }
            }
            return jSONArray;
        }

        /* renamed from: endOperation */
        public void m107520x4a9832cc(int i17) {
            java.lang.String str;
            java.lang.String str2;
            int i18;
            long j17;
            synchronized (this.f58139xdc71d039) {
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.Operation m107513x6be5dd1b = m107513x6be5dd1b(i17);
                if (m107512xe613a608(m107513x6be5dd1b)) {
                    m107514xf4f9af6d(m107513x6be5dd1b, null);
                }
                str = m107513x6be5dd1b.f58130x32d221;
                str2 = m107513x6be5dd1b.f58129x623b1a1;
                i18 = m107513x6be5dd1b.f58133x6280547;
                j17 = m107513x6be5dd1b.f58126x3e4c1d1b - m107513x6be5dd1b.f58131xfbccd462;
            }
            if ("prepare".equals(str2) || com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.this.f58105xbdfc4bc5 == null) {
                return;
            }
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.this.f58119x6260e29.m107600xc1099670(str, i18, j17);
        }

        /* renamed from: endOperationDeferLog */
        public boolean m107521xe146855e(int i17) {
            synchronized (this.f58139xdc71d039) {
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.Operation m107513x6be5dd1b = m107513x6be5dd1b(i17);
                if (m107513x6be5dd1b == null) {
                    return false;
                }
                boolean m107512xe613a608 = m107512xe613a608(m107513x6be5dd1b);
                java.lang.String str = m107513x6be5dd1b.f58130x32d221;
                java.lang.String str2 = m107513x6be5dd1b.f58129x623b1a1;
                int i18 = m107513x6be5dd1b.f58133x6280547;
                long j17 = m107513x6be5dd1b.f58126x3e4c1d1b - m107513x6be5dd1b.f58131xfbccd462;
                if (!"prepare".equals(str2) && com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.this.f58105xbdfc4bc5 != null) {
                    com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.this.f58119x6260e29.m107600xc1099670(str, i18, j17);
                }
                return m107512xe613a608;
            }
        }

        /* renamed from: failOperation */
        public void m107522xedda3fe9(int i17, java.lang.Exception exc) {
            synchronized (this.f58139xdc71d039) {
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.Operation m107513x6be5dd1b = m107513x6be5dd1b(i17);
                if (m107513x6be5dd1b != null) {
                    m107513x6be5dd1b.f58127xd3071a62 = exc;
                }
            }
        }

        /* renamed from: logOperation */
        public void m107523xf234be83(int i17, java.lang.String str) {
            synchronized (this.f58139xdc71d039) {
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.Operation m107513x6be5dd1b = m107513x6be5dd1b(i17);
                if (m107513x6be5dd1b != null) {
                    m107514xf4f9af6d(m107513x6be5dd1b, str);
                }
            }
        }

        /* renamed from: traceCurrentOperation */
        public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79.TraceInfo<java.lang.String> m107524x151f5b53() {
            synchronized (this.f58139xdc71d039) {
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.Operation operation = this.f58139xdc71d039[this.f58138xbe387465];
                if (operation == null || operation.f58128xfcd667ff) {
                    return null;
                }
                return new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79.TraceInfo<>(operation.f58130x32d221, operation.f58131xfbccd462, operation.f58132x32d4e2);
            }
        }
    }

    /* renamed from: com.tencent.wcdb.database.SQLiteConnection$PreparedStatement */
    /* loaded from: classes12.dex */
    public static final class PreparedStatement {

        /* renamed from: mConnection */
        private java.lang.ref.WeakReference<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a> f58141xadf6772b;

        /* renamed from: mInCache */
        private boolean f58142x1019d430;

        /* renamed from: mInUse */
        private boolean f58143xbe383db5;

        /* renamed from: mNumParameters */
        private int f58144x531522a3;

        /* renamed from: mOperation */
        private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.Operation f58145xddd21f7a;

        /* renamed from: mPoolNext */
        private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement f58146x4ad5d0bc;

        /* renamed from: mReadOnly */
        private boolean f58147xf145d9ef;

        /* renamed from: mSql */
        private java.lang.String f58148x32d221;

        /* renamed from: mStatementPtr */
        private long f58149x7755000c;

        /* renamed from: mType */
        private int f58150x6280547;

        public PreparedStatement(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a c26942xf59ce42a) {
            this.f58141xadf6772b = new java.lang.ref.WeakReference<>(c26942xf59ce42a);
        }

        /* renamed from: attachCancellationSignal */
        public void m107540xe56258b0(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a c26942xf59ce42a = this.f58141xadf6772b.get();
            if (c26942xf59ce42a == null) {
                return;
            }
            c26942xf59ce42a.m107420xe56258b0(c26987xeef691ab);
        }

        /* renamed from: beginOperation */
        public void m107541x8cfb2abe(java.lang.String str, java.lang.Object[] objArr) {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a c26942xf59ce42a = this.f58141xadf6772b.get();
            if (c26942xf59ce42a == null) {
                return;
            }
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.Operation m107516x8cfb2abe = c26942xf59ce42a.f58122xbc1bcf34.m107516x8cfb2abe(str, this.f58148x32d221, objArr);
            this.f58145xddd21f7a = m107516x8cfb2abe;
            m107516x8cfb2abe.f58133x6280547 = this.f58150x6280547;
        }

        /* renamed from: bindArguments */
        public void m107542xdb18e999(java.lang.Object[] objArr) {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a c26942xf59ce42a = this.f58141xadf6772b.get();
            if (c26942xf59ce42a == null) {
                return;
            }
            c26942xf59ce42a.m107421xdb18e999(this, objArr);
        }

        /* renamed from: detachCancellationSignal */
        public void m107543x807f0a7e(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a c26942xf59ce42a = this.f58141xadf6772b.get();
            if (c26942xf59ce42a == null) {
                return;
            }
            c26942xf59ce42a.m107422x807f0a7e(c26987xeef691ab);
        }

        /* renamed from: endOperation */
        public void m107544x4a9832cc(java.lang.String str) {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a c26942xf59ce42a;
            if (this.f58145xddd21f7a == null || (c26942xf59ce42a = this.f58141xadf6772b.get()) == null) {
                return;
            }
            if (c26942xf59ce42a.f58122xbc1bcf34.m107521xe146855e(this.f58145xddd21f7a.f58125xfeac3131)) {
                c26942xf59ce42a.f58122xbc1bcf34.m107523xf234be83(this.f58145xddd21f7a.f58125xfeac3131, str);
            }
            this.f58145xddd21f7a = null;
        }

        /* renamed from: failOperation */
        public void m107545xedda3fe9(java.lang.Exception exc) {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a c26942xf59ce42a;
            if (this.f58145xddd21f7a == null || (c26942xf59ce42a = this.f58141xadf6772b.get()) == null) {
                return;
            }
            c26942xf59ce42a.f58122xbc1bcf34.m107522xedda3fe9(this.f58145xddd21f7a.f58125xfeac3131, exc);
        }

        /* renamed from: getPtr */
        public long m107546xb58863b8() {
            return this.f58149x7755000c;
        }

        /* renamed from: getSQL */
        public java.lang.String m107547xb5886a98() {
            return this.f58148x32d221;
        }

        /* renamed from: getType */
        public int m107548xfb85f7b0() {
            return this.f58150x6280547;
        }

        /* renamed from: isReadOnly */
        public boolean m107549x9cffd9ac() {
            return this.f58147xf145d9ef;
        }

        /* renamed from: reset */
        public void m107550x6761d4f(boolean z17) {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a c26942xf59ce42a = this.f58141xadf6772b.get();
            if (c26942xf59ce42a == null) {
                return;
            }
            c26942xf59ce42a.m107463x8dedb4e0(this, z17);
        }
    }

    /* renamed from: com.tencent.wcdb.database.SQLiteConnection$PreparedStatementCache */
    /* loaded from: classes12.dex */
    public final class PreparedStatementCache extends com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26992x30e47533<java.lang.String, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement> {
        public PreparedStatementCache(int i17) {
            super(i17);
        }

        /* renamed from: dump */
        public void m107551x2f39f4(android.util.Printer printer) {
            printer.println("  Prepared statement cache:");
            java.util.Map<java.lang.String, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement> m108044x10fad5c4 = m108044x10fad5c4();
            if (m108044x10fad5c4.isEmpty()) {
                printer.println("    <none>");
                return;
            }
            int i17 = 0;
            for (java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement> entry : m108044x10fad5c4.entrySet()) {
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement value = entry.getValue();
                if (value.f58142x1019d430) {
                    printer.println("    " + i17 + ": statementPtr=0x" + java.lang.Long.toHexString(value.m107546xb58863b8()) + ", numParameters=" + value.f58144x531522a3 + ", type=" + value.f58150x6280547 + ", readOnly=" + value.f58147xf145d9ef + ", sql=\"" + com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.m107476xafa01325(entry.getKey()) + "\"");
                }
                i17++;
            }
        }

        @Override // com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26992x30e47533
        /* renamed from: entryRemoved, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo107552x78d6a38e(boolean z17, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement preparedStatement, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement preparedStatement2) {
            preparedStatement.f58142x1019d430 = false;
            if (preparedStatement.f58143xbe383db5) {
                return;
            }
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.this.m107424xa3ff8d34(preparedStatement);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C26942xf59ce42a(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66 c26943x5700cb66, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f c26949xb6e0a66f, int i17, boolean z17, byte[] bArr, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 c26940xf23b9b2) {
        this.f58118x6d876228 = bArr;
        this.f58109xfe580cd8 = c26940xf23b9b2 != null ? new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2(c26940xf23b9b2) : null;
        this.f58119x6260e29 = c26943x5700cb66;
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f c26949xb6e0a66f2 = new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f(c26949xb6e0a66f);
        this.f58110xce417d89 = c26949xb6e0a66f2;
        this.f58111xa3561a6 = i17;
        this.f58113xb6ee48c9 = z17;
        this.f58114x40e8c9b7 = (c26949xb6e0a66f.f58251x5ac7365d & 1) != 0;
        this.f58120xcc80c1bd = new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatementCache(c26949xb6e0a66f2.f58250x41da7ff9);
    }

    /* renamed from: applyBlockGuardPolicy */
    private void m107419x325904f8(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement preparedStatement) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: attachCancellationSignal */
    public void m107420xe56258b0(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        if (c26987xeef691ab != null) {
            c26987xeef691ab.m108011xf4ed245c();
            int i17 = this.f58108x7c3595d2 + 1;
            this.f58108x7c3595d2 = i17;
            if (i17 == 1) {
                m107450x8f22f412(this.f58112x3c76efc3, true);
                c26987xeef691ab.m108009x57c2e18f(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindArguments */
    public void m107421xdb18e999(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement preparedStatement, java.lang.Object[] objArr) {
        int length = objArr != null ? objArr.length : 0;
        if (length != preparedStatement.f58144x531522a3) {
            throw new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26935xa9138567("Expected " + preparedStatement.f58144x531522a3 + " bind arguments but " + length + " were provided.");
        }
        if (length == 0) {
            return;
        }
        long m107546xb58863b8 = preparedStatement.m107546xb58863b8();
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.Object obj = objArr[i17];
            int m106265x4b494bc6 = com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106265x4b494bc6(obj);
            if (m106265x4b494bc6 == 0) {
                m107430x4fefa49b(this.f58112x3c76efc3, m107546xb58863b8, i17 + 1);
            } else if (m106265x4b494bc6 == 1) {
                m107429x4feea590(this.f58112x3c76efc3, m107546xb58863b8, i17 + 1, ((java.lang.Number) obj).longValue());
            } else if (m106265x4b494bc6 == 2) {
                m107428x137e5e5(this.f58112x3c76efc3, m107546xb58863b8, i17 + 1, ((java.lang.Number) obj).doubleValue());
            } else if (m106265x4b494bc6 == 4) {
                m107427x4fea0eb1(this.f58112x3c76efc3, m107546xb58863b8, i17 + 1, (byte[]) obj);
            } else if (obj instanceof java.lang.Boolean) {
                m107429x4feea590(this.f58112x3c76efc3, m107546xb58863b8, i17 + 1, ((java.lang.Boolean) obj).booleanValue() ? 1L : 0L);
            } else {
                m107431x1b15ca25(this.f58112x3c76efc3, m107546xb58863b8, i17 + 1, obj.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: detachCancellationSignal */
    public void m107422x807f0a7e(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        if (c26987xeef691ab != null) {
            int i17 = this.f58108x7c3595d2 - 1;
            this.f58108x7c3595d2 = i17;
            if (i17 == 0) {
                c26987xeef691ab.m108009x57c2e18f(null);
                m107450x8f22f412(this.f58112x3c76efc3, false);
            }
        }
    }

    /* renamed from: dispose */
    private void m107423x63a5261f(boolean z17) {
        if (this.f58112x3c76efc3 != 0) {
            int i17 = this.f58122xbc1bcf34.m107516x8cfb2abe("close", null, null).f58125xfeac3131;
            try {
                this.f58120xcc80c1bd.m108034x16cbb098();
                m107433x66d21421(this.f58112x3c76efc3);
                this.f58112x3c76efc3 = 0L;
            } finally {
                this.f58122xbc1bcf34.m107520x4a9832cc(i17);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: finalizePreparedStatement */
    public void m107424xa3ff8d34(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement preparedStatement) {
        m107440xc79e6f9a(this.f58112x3c76efc3, preparedStatement.m107546xb58863b8());
        m107462x3cc40f5f(preparedStatement);
    }

    /* renamed from: getMainDbStatsUnsafe */
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26953xd9a91187.DbStats m107425xeb075dd8(int i17, long j17, long j18) {
        java.lang.String str = this.f58110xce417d89.f58252x346425;
        if (!this.f58113xb6ee48c9) {
            str = str + " (" + this.f58111xa3561a6 + ")";
        }
        return new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26953xd9a91187.DbStats(str, j17, j18, i17, this.f58120xcc80c1bd.m108036xafbf113c(), this.f58120xcc80c1bd.m108038x480cf973(), this.f58120xcc80c1bd.m108042x35e001());
    }

    /* renamed from: isCacheable */
    private static boolean m107426x2543f5d2(int i17) {
        return i17 == 2 || i17 == 1;
    }

    /* renamed from: nativeBindBlob */
    private static native void m107427x4fea0eb1(long j17, long j18, int i17, byte[] bArr);

    /* renamed from: nativeBindDouble */
    private static native void m107428x137e5e5(long j17, long j18, int i17, double d17);

    /* renamed from: nativeBindLong */
    private static native void m107429x4feea590(long j17, long j18, int i17, long j19);

    /* renamed from: nativeBindNull */
    private static native void m107430x4fefa49b(long j17, long j18, int i17);

    /* renamed from: nativeBindString */
    private static native void m107431x1b15ca25(long j17, long j18, int i17, java.lang.String str);

    /* renamed from: nativeCancel */
    private static native void m107432x72d4bd71(long j17);

    /* renamed from: nativeClose */
    private static native void m107433x66d21421(long j17);

    /* renamed from: nativeExecute */
    private static native void m107434x7850475e(long j17, long j18);

    /* renamed from: nativeExecuteForChangedRowCount */
    private static native int m107435x239f9a1e(long j17, long j18);

    /* renamed from: nativeExecuteForCursorWindow */
    private static native long m107436x845a8711(long j17, long j18, long j19, int i17, int i18, boolean z17);

    /* renamed from: nativeExecuteForLastInsertedRowId */
    private static native long m107437xa5870e1c(long j17, long j18);

    /* renamed from: nativeExecuteForLong */
    private static native long m107438x609925a7(long j17, long j18);

    /* renamed from: nativeExecuteForString */
    private static native java.lang.String m107439xab20a07c(long j17, long j18);

    /* renamed from: nativeFinalizeStatement */
    private static native void m107440xc79e6f9a(long j17, long j18);

    /* renamed from: nativeGetColumnCount */
    private static native int m107441x747c221a(long j17, long j18);

    /* renamed from: nativeGetColumnName */
    private static native java.lang.String m107442x144adc20(long j17, long j18, int i17);

    /* renamed from: nativeGetDbLookaside */
    private static native int m107443x102779dc(long j17);

    /* renamed from: nativeGetParameterCount */
    private static native int m107444x61f9c85(long j17, long j18);

    /* renamed from: nativeIsReadOnly */
    private static native boolean m107445x82fc1523(long j17, long j18);

    /* renamed from: nativeOpen */
    private native long m107446xb9040701(java.lang.String str, int i17, java.lang.String str2);

    /* renamed from: nativePrepareStatement */
    private static native long m107447xdd4d7a5f(long j17, java.lang.String str);

    /* renamed from: nativeRegisterCustomFunction */
    private static native void m107448x958d44e3(long j17, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26947xb58741b5 c26947xb58741b5);

    /* renamed from: nativeRegisterLocalizedCollators */
    private static native void m107449x72ef42b0(long j17, java.lang.String str);

    /* renamed from: nativeResetCancel */
    private static native void m107450x8f22f412(long j17, boolean z17);

    /* renamed from: nativeResetStatement */
    private static native void m107451x5be15cd7(long j17, long j18, boolean z17);

    /* renamed from: nativeSQLiteHandle */
    private static native long m107452xb0293f0b(long j17, boolean z17);

    /* renamed from: nativeSetKey */
    private static native void m107453x8e5d0594(long j17, byte[] bArr);

    /* renamed from: nativeSetUpdateNotification */
    private static native void m107454xdd4ed87f(long j17, boolean z17, boolean z18);

    /* renamed from: nativeSetWalHook */
    private static native void m107455xd9dab7da(long j17);

    /* renamed from: nativeWalCheckpoint */
    private static native long m107456x96194733(long j17, int i17, java.lang.String str);

    /* renamed from: notifyChange */
    private void m107457x3b9d3c59(java.lang.String str, java.lang.String str2, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f58119x6260e29.m107590x380a4f3a(str, str2, jArr, jArr2, jArr3);
    }

    /* renamed from: notifyCheckpoint */
    private void m107458xd8c801b1(java.lang.String str, int i17) {
        this.f58119x6260e29.m107591xd8c801b1(str, i17);
    }

    /* renamed from: obtainPreparedStatement */
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement m107459xd55e078d(java.lang.String str, long j17, int i17, int i18, boolean z17) {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement preparedStatement = this.f58121x7a3bd281;
        if (preparedStatement != null) {
            this.f58121x7a3bd281 = preparedStatement.f58146x4ad5d0bc;
            preparedStatement.f58146x4ad5d0bc = null;
            preparedStatement.f58142x1019d430 = false;
        } else {
            preparedStatement = new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement(this);
        }
        preparedStatement.f58148x32d221 = str;
        preparedStatement.f58149x7755000c = j17;
        preparedStatement.f58144x531522a3 = i17;
        preparedStatement.f58150x6280547 = i18;
        preparedStatement.f58147xf145d9ef = z17;
        return preparedStatement;
    }

    /* renamed from: open */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a m107460x34264a(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66 c26943x5700cb66, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f c26949xb6e0a66f, int i17, boolean z17, byte[] bArr, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 c26940xf23b9b2) {
        return new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a(c26943x5700cb66, c26949xb6e0a66f, i17, z17, bArr, c26940xf23b9b2);
    }

    /* renamed from: recyclePreparedStatement */
    private void m107462x3cc40f5f(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement preparedStatement) {
        preparedStatement.f58148x32d221 = null;
        preparedStatement.f58146x4ad5d0bc = this.f58121x7a3bd281;
        this.f58121x7a3bd281 = preparedStatement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: resetStatement */
    public void m107463x8dedb4e0(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement preparedStatement, boolean z17) {
        m107451x5be15cd7(this.f58112x3c76efc3, preparedStatement.m107546xb58863b8(), z17);
    }

    /* renamed from: setCheckpointStrategy */
    private void m107464xf030391d() {
        if (this.f58110xce417d89.m107739x46d4026e() || this.f58114x40e8c9b7) {
            return;
        }
        if (this.f58110xce417d89.f58245x9c3ece2d) {
            m107455xd9dab7da(this.f58112x3c76efc3);
        } else if (m107490x92a57db0("PRAGMA wal_autocheckpoint", null, null) != 100) {
            m107490x92a57db0("PRAGMA wal_autocheckpoint=100", null, null);
        }
    }

    /* renamed from: setCipherSpec */
    private void m107465x7b05a68() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 c26940xf23b9b2 = this.f58109xfe580cd8;
        if (c26940xf23b9b2 == null) {
            m107486xb158f775("PRAGMA kdf_iter=64000", null, null);
            m107486xb158f775("PRAGMA cipher_hmac_algorithm=HMAC_SHA1", null, null);
            m107486xb158f775("PRAGMA cipher_kdf_algorithm=PBKDF2_HMAC_SHA1", null, null);
            return;
        }
        if (c26940xf23b9b2.f58095xb6501330 != 0) {
            m107486xb158f775("PRAGMA kdf_iter=" + this.f58109xfe580cd8.f58095xb6501330, null, null);
        }
        m107486xb158f775("PRAGMA cipher_use_hmac=" + this.f58109xfe580cd8.f58093xdd78555a, null, null);
        if (this.f58109xfe580cd8.f58092x93cf5c48 != -1) {
            m107486xb158f775("PRAGMA cipher_hmac_algorithm=" + f58101x8bcb501a[this.f58109xfe580cd8.f58092x93cf5c48], null, null);
        }
        if (this.f58109xfe580cd8.f58094x3abbd8c2 != -1) {
            m107486xb158f775("PRAGMA cipher_kdf_algorithm=" + f58102x4411a54a[this.f58109xfe580cd8.f58094x3abbd8c2], null, null);
        }
    }

    /* renamed from: setForeignKeyModeFromConfiguration */
    private void m107466x5b933d1c() {
        if (this.f58114x40e8c9b7) {
            return;
        }
        long j17 = this.f58110xce417d89.f58247x298db076 ? 1L : 0L;
        if (m107490x92a57db0("PRAGMA foreign_keys", null, null) != j17) {
            m107486xb158f775("PRAGMA foreign_keys=" + j17, null, null);
        }
    }

    /* renamed from: setJournalMode */
    private void m107467x6edca3b8(java.lang.String str) {
        java.lang.String m107491x8b771a45 = m107491x8b771a45("PRAGMA journal_mode", null, null);
        if (m107491x8b771a45.equalsIgnoreCase(str)) {
            return;
        }
        try {
            if (m107491x8b771a45("PRAGMA journal_mode=" + str, null, null).equalsIgnoreCase(str)) {
                return;
            }
        } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26951x537a3f9e unused) {
        }
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.w(TAG, "Could not change the database journal mode of '" + this.f58110xce417d89.f58248x61f7ef4 + "' from '" + m107491x8b771a45 + "' to '" + str + "' because the database is locked.  This usually means that there are other open connections to the database which prevents the database from enabling or disabling write-ahead logging mode.  Proceeding without changing the journal mode.");
    }

    /* renamed from: setJournalSizeLimit */
    private void m107468x7509ef45() {
        if (this.f58110xce417d89.m107739x46d4026e() || this.f58114x40e8c9b7 || m107490x92a57db0("PRAGMA journal_size_limit", null, null) == 524288) {
            return;
        }
        m107490x92a57db0("PRAGMA journal_size_limit=524288", null, null);
    }

    /* renamed from: setLocaleFromConfiguration */
    private void m107469xc1cd8f70() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f c26949xb6e0a66f = this.f58110xce417d89;
        int i17 = c26949xb6e0a66f.f58251x5ac7365d | 16;
        c26949xb6e0a66f.f58251x5ac7365d = i17;
        if ((i17 & 16) != 0) {
            return;
        }
        java.lang.String locale = c26949xb6e0a66f.f58249xbe960e5a.toString();
        m107449x72ef42b0(this.f58112x3c76efc3, locale);
        if (this.f58114x40e8c9b7) {
            return;
        }
        try {
            m107486xb158f775("CREATE TABLE IF NOT EXISTS android_metadata (locale TEXT)", null, null);
            java.lang.String m107491x8b771a45 = m107491x8b771a45("SELECT locale FROM android_metadata UNION SELECT NULL ORDER BY locale DESC LIMIT 1", null, null);
            if (m107491x8b771a45 == null || !m107491x8b771a45.equals(locale)) {
                m107486xb158f775("BEGIN", null, null);
                try {
                    m107486xb158f775("DELETE FROM android_metadata", null, null);
                    m107486xb158f775("INSERT INTO android_metadata (locale) VALUES(?)", new java.lang.Object[]{locale}, null);
                    m107486xb158f775("REINDEX LOCALIZED", null, null);
                    m107486xb158f775("COMMIT", null, null);
                } catch (java.lang.Throwable th6) {
                    m107486xb158f775("ROLLBACK", null, null);
                    throw th6;
                }
            }
        } catch (java.lang.RuntimeException e17) {
            throw new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183("Failed to change locale for db '" + this.f58110xce417d89.f58248x61f7ef4 + "' to '" + locale + "'.", e17);
        }
    }

    /* renamed from: setPageSize */
    private void m107470xa9cc75b2() {
        java.lang.String str;
        int i17;
        if (this.f58110xce417d89.m107739x46d4026e()) {
            return;
        }
        long j17 = 4096;
        if (this.f58118x6d876228 != null) {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 c26940xf23b9b2 = this.f58109xfe580cd8;
            if (c26940xf23b9b2 != null && (i17 = c26940xf23b9b2.f58096x3339d730) > 0) {
                j17 = i17;
            }
            str = "PRAGMA cipher_page_size";
        } else {
            str = "PRAGMA page_size";
        }
        if (m107490x92a57db0(str, null, null) != j17) {
            m107486xb158f775(str + "=" + j17, null, null);
        }
    }

    /* renamed from: setReadOnlyFromConfiguration */
    private void m107471x6bd8a4e8() {
        if (this.f58114x40e8c9b7) {
            m107486xb158f775("PRAGMA query_only = 1", null, null);
        }
    }

    /* renamed from: setSyncModeFromConfiguration */
    private void m107472xe3de5bec() {
        m107486xb158f775("PRAGMA synchronous=" + this.f58110xce417d89.f58253x85631c8c, null, null);
    }

    /* renamed from: setUpdateNotificationFromConfiguration */
    private void m107473x979e73b6() {
        long j17 = this.f58112x3c76efc3;
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f c26949xb6e0a66f = this.f58110xce417d89;
        m107454xdd4ed87f(j17, c26949xb6e0a66f.f58254xdfc2ac4d, c26949xb6e0a66f.f58255xbe5aa881);
    }

    /* renamed from: setWalModeFromConfiguration */
    private void m107474x44ded2c9() {
        if (this.f58110xce417d89.m107739x46d4026e() || this.f58114x40e8c9b7) {
            return;
        }
        m107467x6edca3b8((this.f58110xce417d89.f58251x5ac7365d & com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965) != 0 ? "WAL" : com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26961x60ffeeef.f58296x406ff879);
    }

    /* renamed from: throwIfStatementForbidden */
    private void m107475x26adc74d(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement preparedStatement) {
        if (!this.f58117x7800351e || preparedStatement.f58147xf145d9ef) {
            return;
        }
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(TAG, "Executing write operation in read-only connection.");
        java.lang.Throwable th6 = this.f58104xb383616d;
        if (th6 != null) {
            for (java.lang.StackTraceElement stackTraceElement : th6.getStackTrace()) {
                com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(TAG, "  at " + stackTraceElement.toString());
            }
        }
        throw new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183("Cannot execute this statement because it might modify the database but the connection is read-only.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: trimSqlForDisplay */
    public static java.lang.String m107476xafa01325(java.lang.String str) {
        return f58103xeaa07942.matcher(str).replaceAll(" ");
    }

    /* renamed from: acquirePreparedStatement */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement m107477x54fc0f7c(java.lang.String str) {
        boolean z17;
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement preparedStatement = this.f58120xcc80c1bd.get(str);
        if (preparedStatement == null) {
            z17 = false;
        } else {
            if (!preparedStatement.f58143xbe383db5) {
                preparedStatement.f58143xbe383db5 = true;
                return preparedStatement;
            }
            z17 = true;
        }
        long m107447xdd4d7a5f = m107447xdd4d7a5f(this.f58112x3c76efc3, str);
        try {
            int m107444x61f9c85 = m107444x61f9c85(this.f58112x3c76efc3, m107447xdd4d7a5f);
            int m106264x37a81591 = com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106264x37a81591(str);
            preparedStatement = m107459xd55e078d(str, m107447xdd4d7a5f, m107444x61f9c85, m106264x37a81591, m107445x82fc1523(this.f58112x3c76efc3, m107447xdd4d7a5f));
            if (!z17 && m107426x2543f5d2(m106264x37a81591)) {
                this.f58120xcc80c1bd.put(str, preparedStatement);
                preparedStatement.f58142x1019d430 = true;
            }
            preparedStatement.f58143xbe383db5 = true;
            return preparedStatement;
        } catch (java.lang.RuntimeException e17) {
            if (preparedStatement == null || !preparedStatement.f58142x1019d430) {
                m107440xc79e6f9a(this.f58112x3c76efc3, m107447xdd4d7a5f);
            }
            throw e17;
        }
    }

    /* renamed from: close */
    public void m107478x5a5ddf8() {
        m107423x63a5261f(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[Catch: all -> 0x00c8, SQLiteException -> 0x00cd, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x00cd, blocks: (B:9:0x002e, B:10:0x003d, B:12:0x0043, B:19:0x0086, B:21:0x009d, B:22:0x00b1), top: B:8:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d A[Catch: all -> 0x00c8, SQLiteException -> 0x00cd, TryCatch #1 {SQLiteException -> 0x00cd, blocks: (B:9:0x002e, B:10:0x003d, B:12:0x0043, B:19:0x0086, B:21:0x009d, B:22:0x00b1), top: B:8:0x002e }] */
    /* renamed from: collectDbStats */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m107479x55a55a37(java.util.ArrayList<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26953xd9a91187.DbStats> r26) {
        /*
            r25 = this;
            r9 = r25
            r0 = r26
            java.lang.String r10 = "PRAGMA "
            long r1 = r9.f58112x3c76efc3
            int r2 = m107443x102779dc(r1)
            r11 = 0
            r12 = 0
            java.lang.String r1 = "PRAGMA page_count;"
            long r3 = r9.m107490x92a57db0(r1, r11, r11)     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L1c
            java.lang.String r1 = "PRAGMA page_size;"
            long r5 = r9.m107490x92a57db0(r1, r11, r11)     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L1d
            goto L1e
        L1c:
            r3 = r12
        L1d:
            r5 = r12
        L1e:
            r1 = r25
            com.tencent.wcdb.database.SQLiteDebug$DbStats r1 = r1.m107425xeb075dd8(r2, r3, r5)
            r0.add(r1)
            com.tencent.wcdb.CursorWindow r14 = new com.tencent.wcdb.CursorWindow
            java.lang.String r1 = "collectDbStats"
            r14.<init>(r1)
            java.lang.String r2 = "PRAGMA database_list;"
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r25
            r4 = r14
            r1.m107488xa6f6c61a(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lc8 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> Lcd
            r1 = 1
            r2 = r1
        L3d:
            int r3 = r14.m106203xc688aa49()     // Catch: java.lang.Throwable -> Lc8 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> Lcd
            if (r2 >= r3) goto Lcd
            java.lang.String r3 = r14.m106206x2fec8307(r2, r1)     // Catch: java.lang.Throwable -> Lc8 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> Lcd
            r4 = 2
            java.lang.String r4 = r14.m106206x2fec8307(r2, r4)     // Catch: java.lang.Throwable -> Lc8 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> Lcd
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L81 java.lang.Throwable -> Lc8
            r5.<init>()     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L81 java.lang.Throwable -> Lc8
            r5.append(r10)     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L81 java.lang.Throwable -> Lc8
            r5.append(r3)     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L81 java.lang.Throwable -> Lc8
            java.lang.String r6 = ".page_count;"
            r5.append(r6)     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L81 java.lang.Throwable -> Lc8
            java.lang.String r5 = r5.toString()     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L81 java.lang.Throwable -> Lc8
            long r5 = r9.m107490x92a57db0(r5, r11, r11)     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L81 java.lang.Throwable -> Lc8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L82 java.lang.Throwable -> Lc8
            r7.<init>()     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L82 java.lang.Throwable -> Lc8
            r7.append(r10)     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L82 java.lang.Throwable -> Lc8
            r7.append(r3)     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L82 java.lang.Throwable -> Lc8
            java.lang.String r8 = ".page_size;"
            r7.append(r8)     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L82 java.lang.Throwable -> Lc8
            java.lang.String r7 = r7.toString()     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L82 java.lang.Throwable -> Lc8
            long r7 = r9.m107490x92a57db0(r7, r11, r11)     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L82 java.lang.Throwable -> Lc8
            r17 = r5
            r19 = r7
            goto L86
        L81:
            r5 = r12
        L82:
            r17 = r5
            r19 = r12
        L86:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc8 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> Lcd
            r5.<init>()     // Catch: java.lang.Throwable -> Lc8 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> Lcd
            java.lang.String r6 = "  (attached) "
            r5.append(r6)     // Catch: java.lang.Throwable -> Lc8 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> Lcd
            r5.append(r3)     // Catch: java.lang.Throwable -> Lc8 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> Lcd
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> Lc8 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> Lcd
            int r5 = r4.length()     // Catch: java.lang.Throwable -> Lc8 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> Lcd
            if (r5 == 0) goto Lb1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc8 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> Lcd
            r5.<init>()     // Catch: java.lang.Throwable -> Lc8 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> Lcd
            r5.append(r3)     // Catch: java.lang.Throwable -> Lc8 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> Lcd
            java.lang.String r3 = ": "
            r5.append(r3)     // Catch: java.lang.Throwable -> Lc8 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> Lcd
            r5.append(r4)     // Catch: java.lang.Throwable -> Lc8 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> Lcd
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> Lc8 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> Lcd
        Lb1:
            r16 = r3
            com.tencent.wcdb.database.SQLiteDebug$DbStats r3 = new com.tencent.wcdb.database.SQLiteDebug$DbStats     // Catch: java.lang.Throwable -> Lc8 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> Lcd
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r15 = r3
            r15.<init>(r16, r17, r19, r21, r22, r23, r24)     // Catch: java.lang.Throwable -> Lc8 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> Lcd
            r0.add(r3)     // Catch: java.lang.Throwable -> Lc8 com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> Lcd
            int r2 = r2 + 1
            goto L3d
        Lc8:
            r0 = move-exception
            r14.close()
            throw r0
        Lcd:
            r14.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.m107479x55a55a37(java.util.ArrayList):void");
    }

    /* renamed from: collectDbStatsUnsafe */
    public void m107480xab805abd(java.util.ArrayList<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26953xd9a91187.DbStats> arrayList) {
        arrayList.add(m107425xeb075dd8(0, 0L, 0L));
    }

    /* renamed from: describeCurrentOperationUnsafe */
    public java.lang.String m107481x2be153df() {
        return this.f58122xbc1bcf34.m107517xbf854d9();
    }

    /* renamed from: dump */
    public void m107482x2f39f4(android.util.Printer printer, boolean z17) {
        printer.println("Connection #" + this.f58111xa3561a6 + ":");
        if (z17) {
            printer.println("  connectionPtr: 0x" + java.lang.Long.toHexString(this.f58112x3c76efc3));
        }
        printer.println("  isPrimaryConnection: " + this.f58113xb6ee48c9);
        printer.println("  onlyAllowReadOnlyOperations: " + this.f58117x7800351e);
        if (this.f58105xbdfc4bc5 != null) {
            printer.println("  acquiredThread: " + this.f58105xbdfc4bc5 + " (tid: " + this.f58106xf3eed4b4 + ")");
        }
        this.f58122xbc1bcf34.m107518x2f39f4(printer, z17);
        if (z17) {
            this.f58120xcc80c1bd.m107551x2f39f4(printer);
        }
    }

    /* renamed from: dumpJSON */
    public org.json.JSONObject m107483x817c04dc(boolean z17) {
        org.json.JSONObject put = new org.json.JSONObject().put(dm.i4.f66865x76d1ec5a, this.f58111xa3561a6).put("ptr", java.lang.Long.toHexString(this.f58112x3c76efc3)).put("primary", this.f58113xb6ee48c9).put("readOnly", this.f58117x7800351e);
        java.lang.Thread thread = this.f58105xbdfc4bc5;
        org.json.JSONObject putOpt = put.putOpt("thread", thread != null ? thread.toString() : null);
        int i17 = this.f58106xf3eed4b4;
        return putOpt.putOpt("tid", i17 > 0 ? java.lang.Integer.valueOf(i17) : null).put("operations", this.f58122xbc1bcf34.m107519x817c04dc(z17));
    }

    /* renamed from: endNativeHandle */
    public void m107484x3134699a(java.lang.Exception exc) {
        int i17 = this.f58115xcde54643 - 1;
        this.f58115xcde54643 = i17;
        if (i17 != 0 || this.f58116x192bfee3 == null) {
            return;
        }
        m107452xb0293f0b(this.f58112x3c76efc3, false);
        if (exc == null) {
            this.f58122xbc1bcf34.m107521xe146855e(this.f58116x192bfee3.f58125xfeac3131);
        } else {
            this.f58122xbc1bcf34.m107522xedda3fe9(this.f58116x192bfee3.f58125xfeac3131, exc);
        }
        this.f58116x192bfee3 = null;
    }

    /* renamed from: ensureOpen */
    public void m107485xb5fee7a8() {
        if (this.f58112x3c76efc3 != 0) {
            return;
        }
        boolean z17 = this.f58117x7800351e;
        try {
            try {
                this.f58117x7800351e = false;
                m107461x34264a();
            } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 e17) {
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26953xd9a91187.m107742x264f8700(this);
                m107423x63a5261f(false);
                throw e17;
            }
        } finally {
            this.f58117x7800351e = z17;
        }
    }

    /* renamed from: execute */
    public void m107486xb158f775(java.lang.String str, java.lang.Object[] objArr, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.Operation m107516x8cfb2abe = this.f58122xbc1bcf34.m107516x8cfb2abe("execute", str, objArr);
        int i17 = m107516x8cfb2abe.f58125xfeac3131;
        try {
            try {
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement m107477x54fc0f7c = m107477x54fc0f7c(str);
                m107516x8cfb2abe.f58133x6280547 = m107477x54fc0f7c.f58150x6280547;
                try {
                    m107475x26adc74d(m107477x54fc0f7c);
                    m107421xdb18e999(m107477x54fc0f7c, objArr);
                    m107419x325904f8(m107477x54fc0f7c);
                    m107420xe56258b0(c26987xeef691ab);
                    try {
                        m107434x7850475e(this.f58112x3c76efc3, m107477x54fc0f7c.m107546xb58863b8());
                    } finally {
                        m107422x807f0a7e(c26987xeef691ab);
                    }
                } finally {
                    m107499xcbe9706b(m107477x54fc0f7c);
                }
            } finally {
                this.f58122xbc1bcf34.m107520x4a9832cc(i17);
            }
        } catch (java.lang.RuntimeException e17) {
            this.f58122xbc1bcf34.m107522xedda3fe9(i17, e17);
            throw e17;
        }
    }

    /* renamed from: executeForChangedRowCount */
    public int m107487xc82b1275(java.lang.String str, java.lang.Object[] objArr, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.Operation m107516x8cfb2abe = this.f58122xbc1bcf34.m107516x8cfb2abe("executeForChangedRowCount", str, objArr);
        int i17 = m107516x8cfb2abe.f58125xfeac3131;
        try {
            try {
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement m107477x54fc0f7c = m107477x54fc0f7c(str);
                m107516x8cfb2abe.f58133x6280547 = m107477x54fc0f7c.f58150x6280547;
                try {
                    m107475x26adc74d(m107477x54fc0f7c);
                    m107421xdb18e999(m107477x54fc0f7c, objArr);
                    m107419x325904f8(m107477x54fc0f7c);
                    m107420xe56258b0(c26987xeef691ab);
                    try {
                        int m107435x239f9a1e = m107435x239f9a1e(this.f58112x3c76efc3, m107477x54fc0f7c.m107546xb58863b8());
                        if (this.f58122xbc1bcf34.m107521xe146855e(i17)) {
                            this.f58122xbc1bcf34.m107523xf234be83(i17, "changedRows=" + m107435x239f9a1e);
                        }
                        return m107435x239f9a1e;
                    } finally {
                        m107422x807f0a7e(c26987xeef691ab);
                    }
                } finally {
                    m107499xcbe9706b(m107477x54fc0f7c);
                }
            } catch (java.lang.Throwable th6) {
                if (this.f58122xbc1bcf34.m107521xe146855e(i17)) {
                    this.f58122xbc1bcf34.m107523xf234be83(i17, "changedRows=0");
                }
                throw th6;
            }
        } catch (java.lang.RuntimeException e17) {
            this.f58122xbc1bcf34.m107522xedda3fe9(i17, e17);
            throw e17;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.tencent.wcdb.database.SQLiteConnection$OperationLog] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.tencent.wcdb.database.SQLiteConnection$OperationLog] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
    /* renamed from: executeForCursorWindow */
    public int m107488xa6f6c61a(java.lang.String str, java.lang.Object[] objArr, com.p314xaae8f345.p3121x37984a.C26876xa70fd706 c26876xa70fd706, int i17, int i18, boolean z17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        java.lang.String str2;
        int i19;
        ?? r152;
        ?? r96;
        ?? r47;
        int i27;
        int i28;
        int i29;
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement preparedStatement;
        int i37;
        int i38;
        int m106203xc688aa49;
        java.lang.String str3 = ", countedRows=";
        java.lang.String str4 = ", filledRows=";
        java.lang.String str5 = ", actualPos=";
        java.lang.String str6 = "', startPos=";
        ?? r86 = "window='";
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        if (c26876xa70fd706 == null) {
            throw new java.lang.IllegalArgumentException("window must not be null.");
        }
        c26876xa70fd706.m107403x3e28f15();
        try {
            ?? r57 = "executeForCursorWindow";
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.Operation m107516x8cfb2abe = this.f58122xbc1bcf34.m107516x8cfb2abe("executeForCursorWindow", str, objArr);
            int i39 = m107516x8cfb2abe.f58125xfeac3131;
            try {
                try {
                    com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement m107477x54fc0f7c = m107477x54fc0f7c(str);
                    m107516x8cfb2abe.f58133x6280547 = m107477x54fc0f7c.f58150x6280547;
                    try {
                        m107475x26adc74d(m107477x54fc0f7c);
                        m107421xdb18e999(m107477x54fc0f7c, objArr);
                        m107419x325904f8(m107477x54fc0f7c);
                        m107420xe56258b0(c26987xeef691ab);
                        try {
                            try {
                                preparedStatement = m107477x54fc0f7c;
                                i29 = i39;
                                try {
                                    long m107436x845a8711 = m107436x845a8711(this.f58112x3c76efc3, m107477x54fc0f7c.m107546xb58863b8(), c26876xa70fd706.f57759x6dc7e2f1, i17, i18, z17);
                                    i28 = (int) (m107436x845a8711 >> 32);
                                    i38 = (int) m107436x845a8711;
                                    try {
                                        m106203xc688aa49 = c26876xa70fd706.m106203xc688aa49();
                                        try {
                                            c26876xa70fd706.m106220x845c6269(i28);
                                            try {
                                                m107422x807f0a7e(c26987xeef691ab);
                                            } catch (java.lang.Throwable th6) {
                                                th = th6;
                                                try {
                                                    m107499xcbe9706b(preparedStatement);
                                                    throw th;
                                                } catch (java.lang.RuntimeException e17) {
                                                    e = e17;
                                                    this.f58122xbc1bcf34.m107522xedda3fe9(i29, e);
                                                    throw e;
                                                }
                                            }
                                        } catch (java.lang.Throwable th7) {
                                            th = th7;
                                            i29 = i29;
                                            try {
                                                m107422x807f0a7e(c26987xeef691ab);
                                                throw th;
                                            } catch (java.lang.Throwable th8) {
                                                th = th8;
                                                m107499xcbe9706b(preparedStatement);
                                                throw th;
                                            }
                                        }
                                    } catch (java.lang.Throwable th9) {
                                        th = th9;
                                    }
                                } catch (java.lang.Throwable th10) {
                                    th = th10;
                                    i37 = i29;
                                    i29 = i37;
                                    m107422x807f0a7e(c26987xeef691ab);
                                    throw th;
                                }
                            } catch (java.lang.Throwable th11) {
                                th = th11;
                                i37 = i39;
                                preparedStatement = m107477x54fc0f7c;
                            }
                        } catch (java.lang.Throwable th12) {
                            th = th12;
                            preparedStatement = m107477x54fc0f7c;
                            i37 = i39;
                        }
                    } catch (java.lang.Throwable th13) {
                        th = th13;
                        preparedStatement = m107477x54fc0f7c;
                        i29 = i39;
                    }
                } catch (java.lang.Throwable th14) {
                    th = th14;
                    i28 = -1;
                    r47 = m107516x8cfb2abe;
                    i27 = r57;
                    i19 = r86;
                    r96 = i39;
                    r152 = str3;
                }
            } catch (java.lang.RuntimeException e18) {
                e = e18;
                i29 = i39;
            } catch (java.lang.Throwable th15) {
                th = th15;
                str2 = "', startPos=";
                str6 = ", filledRows=";
                str4 = "window='";
                i19 = i17;
                r152 = i39;
                r96 = ", actualPos=";
                str5 = ", countedRows=";
                r47 = -1;
                i27 = -1;
                i28 = -1;
            }
            try {
                m107499xcbe9706b(preparedStatement);
                if (this.f58122xbc1bcf34.m107521xe146855e(i29)) {
                    this.f58122xbc1bcf34.m107523xf234be83(i29, "window='" + c26876xa70fd706 + "', startPos=" + i17 + ", actualPos=" + i28 + ", filledRows=" + m106203xc688aa49 + ", countedRows=" + i38);
                }
                return i38;
            } catch (java.lang.RuntimeException e19) {
                e = e19;
                this.f58122xbc1bcf34.m107522xedda3fe9(i29, e);
                throw e;
            } catch (java.lang.Throwable th16) {
                th = th16;
                i19 = i17;
                str4 = "window='";
                str5 = ", countedRows=";
                str2 = "', startPos=";
                r96 = ", actualPos=";
                str6 = ", filledRows=";
                r47 = i38;
                i27 = m106203xc688aa49;
                r152 = i29;
                if (this.f58122xbc1bcf34.m107521xe146855e(r152)) {
                    this.f58122xbc1bcf34.m107523xf234be83(r152, str4 + c26876xa70fd706 + str2 + i19 + r96 + i28 + str6 + i27 + str5 + r47);
                }
                throw th;
            }
        } finally {
            c26876xa70fd706.m107405xb81b4f04();
        }
    }

    /* renamed from: executeForLastInsertedRowId */
    public long m107489x5515ccb3(java.lang.String str, java.lang.Object[] objArr, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.Operation m107516x8cfb2abe = this.f58122xbc1bcf34.m107516x8cfb2abe("executeForLastInsertedRowId", str, objArr);
        int i17 = m107516x8cfb2abe.f58125xfeac3131;
        try {
            try {
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement m107477x54fc0f7c = m107477x54fc0f7c(str);
                m107516x8cfb2abe.f58133x6280547 = m107477x54fc0f7c.f58150x6280547;
                try {
                    m107475x26adc74d(m107477x54fc0f7c);
                    m107421xdb18e999(m107477x54fc0f7c, objArr);
                    m107419x325904f8(m107477x54fc0f7c);
                    m107420xe56258b0(c26987xeef691ab);
                    try {
                        return m107437xa5870e1c(this.f58112x3c76efc3, m107477x54fc0f7c.m107546xb58863b8());
                    } finally {
                        m107422x807f0a7e(c26987xeef691ab);
                    }
                } finally {
                    m107499xcbe9706b(m107477x54fc0f7c);
                }
            } catch (java.lang.RuntimeException e17) {
                this.f58122xbc1bcf34.m107522xedda3fe9(i17, e17);
                throw e17;
            }
        } finally {
            this.f58122xbc1bcf34.m107520x4a9832cc(i17);
        }
    }

    /* renamed from: executeForLong */
    public long m107490x92a57db0(java.lang.String str, java.lang.Object[] objArr, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.Operation m107516x8cfb2abe = this.f58122xbc1bcf34.m107516x8cfb2abe("executeForLong", str, objArr);
        int i17 = m107516x8cfb2abe.f58125xfeac3131;
        try {
            try {
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement m107477x54fc0f7c = m107477x54fc0f7c(str);
                m107516x8cfb2abe.f58133x6280547 = m107477x54fc0f7c.f58150x6280547;
                try {
                    m107475x26adc74d(m107477x54fc0f7c);
                    m107421xdb18e999(m107477x54fc0f7c, objArr);
                    m107419x325904f8(m107477x54fc0f7c);
                    m107420xe56258b0(c26987xeef691ab);
                    try {
                        return m107438x609925a7(this.f58112x3c76efc3, m107477x54fc0f7c.m107546xb58863b8());
                    } finally {
                        m107422x807f0a7e(c26987xeef691ab);
                    }
                } finally {
                    m107499xcbe9706b(m107477x54fc0f7c);
                }
            } catch (java.lang.RuntimeException e17) {
                this.f58122xbc1bcf34.m107522xedda3fe9(i17, e17);
                throw e17;
            }
        } finally {
            this.f58122xbc1bcf34.m107520x4a9832cc(i17);
        }
    }

    /* renamed from: executeForString */
    public java.lang.String m107491x8b771a45(java.lang.String str, java.lang.Object[] objArr, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.Operation m107516x8cfb2abe = this.f58122xbc1bcf34.m107516x8cfb2abe("executeForString", str, objArr);
        int i17 = m107516x8cfb2abe.f58125xfeac3131;
        try {
            try {
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement m107477x54fc0f7c = m107477x54fc0f7c(str);
                m107516x8cfb2abe.f58133x6280547 = m107477x54fc0f7c.f58150x6280547;
                try {
                    m107475x26adc74d(m107477x54fc0f7c);
                    m107421xdb18e999(m107477x54fc0f7c, objArr);
                    m107419x325904f8(m107477x54fc0f7c);
                    m107420xe56258b0(c26987xeef691ab);
                    try {
                        return m107439xab20a07c(this.f58112x3c76efc3, m107477x54fc0f7c.m107546xb58863b8());
                    } finally {
                        m107422x807f0a7e(c26987xeef691ab);
                    }
                } finally {
                    m107499xcbe9706b(m107477x54fc0f7c);
                }
            } catch (java.lang.RuntimeException e17) {
                this.f58122xbc1bcf34.m107522xedda3fe9(i17, e17);
                throw e17;
            }
        } finally {
            this.f58122xbc1bcf34.m107520x4a9832cc(i17);
        }
    }

    /* renamed from: finalize */
    public void m107492xd764dc1e() {
        try {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66 c26943x5700cb66 = this.f58119x6260e29;
            if (c26943x5700cb66 != null && this.f58112x3c76efc3 != 0) {
                c26943x5700cb66.m107592xd9055fbf();
            }
            m107423x63a5261f(true);
        } finally {
            super.finalize();
        }
    }

    /* renamed from: getConnectionId */
    public int m107493xd392db0f() {
        return this.f58111xa3561a6;
    }

    /* renamed from: getNativeHandle */
    public long m107494xdc4f8f95(java.lang.String str) {
        if (this.f58112x3c76efc3 == 0) {
            return 0L;
        }
        if (str != null && this.f58116x192bfee3 == null) {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.Operation m107516x8cfb2abe = this.f58122xbc1bcf34.m107516x8cfb2abe(str, null, null);
            this.f58116x192bfee3 = m107516x8cfb2abe;
            m107516x8cfb2abe.f58133x6280547 = 99;
        }
        this.f58115xcde54643++;
        return m107452xb0293f0b(this.f58112x3c76efc3, true);
    }

    /* renamed from: isPreparedStatementInCache */
    public boolean m107495xdc6a7695(java.lang.String str) {
        return this.f58120xcc80c1bd.get(str) != null;
    }

    /* renamed from: isPrimaryConnection */
    public boolean m107496xcc523a76() {
        return this.f58113xb6ee48c9;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab.OnCancelListener
    /* renamed from: onCancel */
    public void mo82492x3d6f0539() {
        m107432x72d4bd71(this.f58112x3c76efc3);
    }

    /* renamed from: prepare */
    public void m107497xed060d07(java.lang.String str, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26971x736db9f1 c26971x736db9f1) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.Operation m107516x8cfb2abe = this.f58122xbc1bcf34.m107516x8cfb2abe("prepare", str, null);
        int i17 = m107516x8cfb2abe.f58125xfeac3131;
        try {
            try {
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement m107477x54fc0f7c = m107477x54fc0f7c(str);
                m107516x8cfb2abe.f58133x6280547 = m107477x54fc0f7c.f58150x6280547;
                if (c26971x736db9f1 != null) {
                    try {
                        c26971x736db9f1.f58351xf8071a10 = m107477x54fc0f7c.f58144x531522a3;
                        c26971x736db9f1.f58352xcc483262 = m107477x54fc0f7c.f58147xf145d9ef;
                        int m107441x747c221a = m107441x747c221a(this.f58112x3c76efc3, m107477x54fc0f7c.m107546xb58863b8());
                        if (m107441x747c221a == 0) {
                            c26971x736db9f1.f58350xcd46b992 = f58100x19b28e5d;
                        } else {
                            c26971x736db9f1.f58350xcd46b992 = new java.lang.String[m107441x747c221a];
                            for (int i18 = 0; i18 < m107441x747c221a; i18++) {
                                c26971x736db9f1.f58350xcd46b992[i18] = m107442x144adc20(this.f58112x3c76efc3, m107477x54fc0f7c.m107546xb58863b8(), i18);
                            }
                        }
                    } finally {
                        m107499xcbe9706b(m107477x54fc0f7c);
                    }
                }
            } catch (java.lang.RuntimeException e17) {
                this.f58122xbc1bcf34.m107522xedda3fe9(i17, e17);
                throw e17;
            }
        } finally {
            this.f58122xbc1bcf34.m107520x4a9832cc(i17);
        }
    }

    /* renamed from: reconfigure */
    public void m107498x7ede9e13(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f c26949xb6e0a66f) {
        this.f58117x7800351e = false;
        long j17 = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26974x1abef246.f58355xabe12873;
        long m107452xb0293f0b = m107452xb0293f0b(this.f58112x3c76efc3, true);
        try {
            java.util.Iterator<com.p314xaae8f345.p3121x37984a.p3127xdb7d1c3f.InterfaceC26975xbb9cdd73> it = c26949xb6e0a66f.f58246x94266c14.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p3121x37984a.p3127xdb7d1c3f.InterfaceC26975xbb9cdd73 next = it.next();
                if (!this.f58110xce417d89.f58246x94266c14.contains(next)) {
                    next.mo107878x33ebcb90(m107452xb0293f0b, j17);
                }
            }
            m107452xb0293f0b(this.f58112x3c76efc3, false);
            int i17 = c26949xb6e0a66f.f58251x5ac7365d;
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f c26949xb6e0a66f2 = this.f58110xce417d89;
            boolean z17 = ((i17 ^ c26949xb6e0a66f2.f58251x5ac7365d) & com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965) != 0;
            boolean z18 = c26949xb6e0a66f.f58247x298db076 != c26949xb6e0a66f2.f58247x298db076;
            boolean z19 = !c26949xb6e0a66f.f58249xbe960e5a.equals(c26949xb6e0a66f2.f58249xbe960e5a);
            boolean z27 = c26949xb6e0a66f.f58245x9c3ece2d;
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f c26949xb6e0a66f3 = this.f58110xce417d89;
            boolean z28 = z27 != c26949xb6e0a66f3.f58245x9c3ece2d;
            boolean z29 = c26949xb6e0a66f.f58253x85631c8c != c26949xb6e0a66f3.f58253x85631c8c;
            boolean z37 = (c26949xb6e0a66f.f58254xdfc2ac4d == c26949xb6e0a66f3.f58254xdfc2ac4d && c26949xb6e0a66f.f58255xbe5aa881 == c26949xb6e0a66f3.f58255xbe5aa881) ? false : true;
            c26949xb6e0a66f3.m107740xe35db9dd(c26949xb6e0a66f);
            this.f58120xcc80c1bd.m108041xc84d9cb4(c26949xb6e0a66f.f58250x41da7ff9);
            if (z18) {
                m107466x5b933d1c();
            }
            if (z17) {
                m107474x44ded2c9();
            }
            if (z29) {
                m107472xe3de5bec();
            }
            if (z28) {
                m107464xf030391d();
            }
            if (z19) {
                m107469xc1cd8f70();
            }
            if (z37) {
                m107473x979e73b6();
            }
        } catch (java.lang.Throwable th6) {
            m107452xb0293f0b(this.f58112x3c76efc3, false);
            throw th6;
        }
    }

    /* renamed from: releasePreparedStatement */
    public void m107499xcbe9706b(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement preparedStatement) {
        preparedStatement.f58143xbe383db5 = false;
        if (!preparedStatement.f58142x1019d430) {
            m107424xa3ff8d34(preparedStatement);
            return;
        }
        try {
            m107463x8dedb4e0(preparedStatement, true);
        } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 unused) {
            this.f58120xcc80c1bd.m108040xc84af884(preparedStatement.f58148x32d221);
        }
    }

    /* renamed from: setAcquisitionState */
    public void m107500xf022f186(boolean z17, boolean z18) {
        if (!z17) {
            this.f58105xbdfc4bc5 = null;
            this.f58106xf3eed4b4 = 0;
            this.f58104xb383616d = null;
            this.f58107x335dcd7b = 0L;
            return;
        }
        this.f58105xbdfc4bc5 = java.lang.Thread.currentThread();
        this.f58106xf3eed4b4 = android.os.Process.myTid();
        if (z18) {
            this.f58104xb383616d = new java.lang.Throwable();
            this.f58107x335dcd7b = java.lang.System.currentTimeMillis();
        } else {
            this.f58104xb383616d = null;
            this.f58107x335dcd7b = 0L;
        }
    }

    /* renamed from: setOnlyAllowReadOnlyOperations */
    public void m107501xa7cda809(boolean z17) {
        this.f58117x7800351e = z17;
    }

    /* renamed from: toString */
    public java.lang.String m107502x9616526c() {
        return "SQLiteConnection: " + this.f58110xce417d89.f58252x346425 + " (" + this.f58111xa3561a6 + ")";
    }

    /* renamed from: traceCurrentOperationUnsafe */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79.TraceInfo<java.lang.String> m107503x16e416d9() {
        return this.f58122xbc1bcf34.m107524x151f5b53();
    }

    /* renamed from: tracePersistAcquisitionUnsafe */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79.TraceInfo<java.lang.StackTraceElement[]> m107504x6bc27684() {
        java.lang.Throwable th6 = this.f58104xb383616d;
        if (th6 == null) {
            return null;
        }
        return new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79.TraceInfo<>(th6.getStackTrace(), this.f58107x335dcd7b, this.f58106xf3eed4b4);
    }

    /* renamed from: walCheckpoint */
    public android.util.Pair<java.lang.Integer, java.lang.Integer> m107505xf28d4a0a(java.lang.String str, int i17) {
        if (str == null || str.isEmpty()) {
            str = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29;
        }
        long m107456x96194733 = m107456x96194733(this.f58112x3c76efc3, i17, str);
        return new android.util.Pair<>(java.lang.Integer.valueOf((int) (m107456x96194733 >> 32)), java.lang.Integer.valueOf((int) (m107456x96194733 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2)));
    }

    /* renamed from: open */
    private void m107461x34264a() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f c26949xb6e0a66f = this.f58110xce417d89;
        long m107446xb9040701 = m107446xb9040701(c26949xb6e0a66f.f58252x346425, c26949xb6e0a66f.f58251x5ac7365d, c26949xb6e0a66f.f58256x16a71cee);
        this.f58112x3c76efc3 = m107446xb9040701;
        byte[] bArr = this.f58118x6d876228;
        if (bArr != null && bArr.length == 0) {
            this.f58118x6d876228 = null;
        }
        byte[] bArr2 = this.f58118x6d876228;
        if (bArr2 != null) {
            m107453x8e5d0594(m107446xb9040701, bArr2);
            m107465x7b05a68();
        }
        m107470xa9cc75b2();
        m107471x6bd8a4e8();
        m107466x5b933d1c();
        m107474x44ded2c9();
        m107472xe3de5bec();
        m107468x7509ef45();
        m107464xf030391d();
        m107469xc1cd8f70();
        long j17 = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26974x1abef246.f58355xabe12873;
        long m107452xb0293f0b = m107452xb0293f0b(this.f58112x3c76efc3, true);
        try {
            java.util.Iterator<com.p314xaae8f345.p3121x37984a.p3127xdb7d1c3f.InterfaceC26975xbb9cdd73> it = this.f58110xce417d89.f58246x94266c14.iterator();
            while (it.hasNext()) {
                it.next().mo107878x33ebcb90(m107452xb0293f0b, j17);
            }
            m107452xb0293f0b(this.f58112x3c76efc3, false);
            m107473x979e73b6();
        } catch (java.lang.Throwable th6) {
            m107452xb0293f0b(this.f58112x3c76efc3, false);
            throw th6;
        }
    }
}
