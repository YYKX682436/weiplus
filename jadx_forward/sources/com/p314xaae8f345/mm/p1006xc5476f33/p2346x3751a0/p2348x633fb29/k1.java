package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public class k1 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final android.os.ConditionVariable f258228e = new android.os.ConditionVariable();

    /* renamed from: f, reason: collision with root package name */
    public boolean f258229f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f258230g = false;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f258231h = null;

    /* renamed from: i, reason: collision with root package name */
    public java.nio.ByteBuffer f258232i = null;

    /* renamed from: m, reason: collision with root package name */
    public int f258233m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f258234n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f258235o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f258236p = 0;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.i1 f258237q;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.i1 i1Var) {
        this.f258237q = i1Var;
    }

    @Override // wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "stop_video_decode_runnable";
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0296 A[Catch: Exception -> 0x02eb, TryCatch #2 {Exception -> 0x02eb, blocks: (B:3:0x000d, B:7:0x0012, B:9:0x001e, B:11:0x0024, B:12:0x0070, B:14:0x0074, B:17:0x0087, B:19:0x009a, B:23:0x00a8, B:25:0x00ae, B:28:0x00e5, B:30:0x00e9, B:31:0x00fe, B:34:0x01f7, B:37:0x0296, B:39:0x02a0, B:42:0x02aa, B:44:0x02ae, B:46:0x02b2, B:48:0x02bc, B:50:0x02ca, B:52:0x02d6, B:54:0x02e4, B:57:0x02a5, B:72:0x0141, B:33:0x0159, B:77:0x0185, B:79:0x018b, B:81:0x0195, B:82:0x0198, B:83:0x01a5, B:85:0x01ad, B:87:0x01b1, B:89:0x01c1, B:90:0x01e6, B:92:0x01f0, B:93:0x01df, B:98:0x0201, B:100:0x0212, B:101:0x0262), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02ae A[Catch: Exception -> 0x02eb, TryCatch #2 {Exception -> 0x02eb, blocks: (B:3:0x000d, B:7:0x0012, B:9:0x001e, B:11:0x0024, B:12:0x0070, B:14:0x0074, B:17:0x0087, B:19:0x009a, B:23:0x00a8, B:25:0x00ae, B:28:0x00e5, B:30:0x00e9, B:31:0x00fe, B:34:0x01f7, B:37:0x0296, B:39:0x02a0, B:42:0x02aa, B:44:0x02ae, B:46:0x02b2, B:48:0x02bc, B:50:0x02ca, B:52:0x02d6, B:54:0x02e4, B:57:0x02a5, B:72:0x0141, B:33:0x0159, B:77:0x0185, B:79:0x018b, B:81:0x0195, B:82:0x0198, B:83:0x01a5, B:85:0x01ad, B:87:0x01b1, B:89:0x01c1, B:90:0x01e6, B:92:0x01f0, B:93:0x01df, B:98:0x0201, B:100:0x0212, B:101:0x0262), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02a5 A[Catch: Exception -> 0x02eb, TryCatch #2 {Exception -> 0x02eb, blocks: (B:3:0x000d, B:7:0x0012, B:9:0x001e, B:11:0x0024, B:12:0x0070, B:14:0x0074, B:17:0x0087, B:19:0x009a, B:23:0x00a8, B:25:0x00ae, B:28:0x00e5, B:30:0x00e9, B:31:0x00fe, B:34:0x01f7, B:37:0x0296, B:39:0x02a0, B:42:0x02aa, B:44:0x02ae, B:46:0x02b2, B:48:0x02bc, B:50:0x02ca, B:52:0x02d6, B:54:0x02e4, B:57:0x02a5, B:72:0x0141, B:33:0x0159, B:77:0x0185, B:79:0x018b, B:81:0x0195, B:82:0x0198, B:83:0x01a5, B:85:0x01ad, B:87:0x01b1, B:89:0x01c1, B:90:0x01e6, B:92:0x01f0, B:93:0x01df, B:98:0x0201, B:100:0x0212, B:101:0x0262), top: B:2:0x000d }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k1.run():void");
    }
}
