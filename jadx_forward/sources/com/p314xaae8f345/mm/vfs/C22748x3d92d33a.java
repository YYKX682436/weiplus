package com.p314xaae8f345.mm.vfs;

/* renamed from: com.tencent.mm.vfs.FastList */
/* loaded from: classes12.dex */
public final class C22748x3d92d33a {

    /* renamed from: com.tencent.mm.vfs.FastList$Result */
    /* loaded from: classes12.dex */
    public static class Result {

        /* renamed from: tagSets */
        public com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TagSetResult[] f39797xa3aba70b;

        /* renamed from: totalCount */
        public int f39798xd467f02b;

        /* renamed from: totalSize */
        public long f39799xdd96ed65;
    }

    /* renamed from: com.tencent.mm.vfs.FastList$TagSet */
    /* loaded from: classes12.dex */
    public static class TagSet {

        /* renamed from: mask */
        public int f39800x3306ec;

        /* renamed from: shift */
        public int f39801x6856c82;

        /* renamed from: slots */
        public int f39802x6875635;
    }

    /* renamed from: com.tencent.mm.vfs.FastList$TagSetResult */
    /* loaded from: classes12.dex */
    public static class TagSetResult {

        /* renamed from: counts */
        public int[] f39803xaf42d144;

        /* renamed from: sizes */
        public long[] f39804x6862092;

        /* renamed from: tagSet */
        public com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TagSet f39805xcb792668;
    }

    /* renamed from: com.tencent.mm.vfs.FastList$Tagger */
    /* loaded from: classes12.dex */
    public static final class Tagger {

        /* renamed from: andTag */
        public int f39806xabc2ea43;

        /* renamed from: depth */
        public int f39807x5b0cac3;

        /* renamed from: orTag */
        public int f39808x6514ab7;

        /* renamed from: path */
        public java.lang.String f39809x346425;

        /* renamed from: patterns */
        public com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TaggerPattern[] f39810x4a4486e3;

        /* renamed from: skip */
        public boolean f39811x35e57f;

        /* renamed from: toString */
        public java.lang.String m82313x9616526c() {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(this.f39809x346425);
            sb6.append(" => {");
            if (this.f39811x35e57f) {
                sb6.append("skip}");
                return sb6.toString();
            }
            sb6.append("&:");
            sb6.append(java.lang.Integer.toHexString(this.f39806xabc2ea43));
            sb6.append(", |:");
            sb6.append(java.lang.Integer.toHexString(this.f39808x6514ab7));
            sb6.append('}');
            if (this.f39807x5b0cac3 > 0) {
                sb6.append(" [");
                sb6.append(this.f39807x5b0cac3);
                sb6.append(']');
            }
            return sb6.toString();
        }
    }

    /* renamed from: com.tencent.mm.vfs.FastList$TaggerPattern */
    /* loaded from: classes12.dex */
    public static final class TaggerPattern {

        /* renamed from: andTag */
        public int f39812xabc2ea43;

        /* renamed from: orTag */
        public int f39813x6514ab7;

        /* renamed from: pattern */
        public java.lang.String f39814xd0d8eb90;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cancel */
    public static native void m82308xae7a2e7a(long j17, boolean z17);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: close */
    public static native void m82309x5a5ddf8(long j17);

    public static long d(java.util.List list) {
        return m82310xa15705f8((java.lang.String[]) list.toArray(new java.lang.String[0]), 2L);
    }

    public static long e(java.util.List list) {
        return m82310xa15705f8((java.lang.String[]) list.toArray(new java.lang.String[0]), 3L);
    }

    public static com.p314xaae8f345.mm.vfs.w1 f(java.util.List list, com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TagSet[] tagSetArr, java.util.List list2, boolean z17) {
        return new com.p314xaae8f345.mm.vfs.w1(m82312xed060d07((java.lang.String[]) list.toArray(new java.lang.String[0]), tagSetArr, (com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger[]) list2.toArray(new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger[0]), z17), tagSetArr, null);
    }

    /* renamed from: getDirSize */
    private static native long m82310xa15705f8(java.lang.String[] strArr, long j17);

    /* renamed from: getDiskSpaceForPaths */
    public static native long m82311x526c9978(java.lang.String... strArr);

    /* renamed from: prepare */
    private static native long m82312xed060d07(java.lang.String[] strArr, com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TagSet[] tagSetArr, com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger[] taggerArr, boolean z17);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean run(long j17, com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Result result, com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TagSetResult[] tagSetResultArr, boolean z17);
}
