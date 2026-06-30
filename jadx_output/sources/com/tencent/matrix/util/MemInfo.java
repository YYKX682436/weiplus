package com.tencent.matrix.util;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/matrix/util/MemInfo;", "Landroid/os/Parcelable;", "oj/o", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final /* data */ class MemInfo implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public long f53096d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.matrix.util.ProcessInfo f53097e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.matrix.util.StatusInfo f53098f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.matrix.util.JavaMemInfo f53099g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.matrix.util.NativeMemInfo f53100h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.matrix.util.SystemInfo f53101i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.matrix.util.PssInfo f53102m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.matrix.util.PssInfo f53103n;

    /* renamed from: o, reason: collision with root package name */
    public final oj.e f53104o;

    /* renamed from: p, reason: collision with root package name */
    public static final oj.o f53095p = new oj.o(null);
    public static final android.os.Parcelable.Creator<com.tencent.matrix.util.MemInfo> CREATOR = new oj.n();

    public MemInfo(com.tencent.matrix.util.ProcessInfo processInfo, com.tencent.matrix.util.StatusInfo statusInfo, com.tencent.matrix.util.JavaMemInfo javaMemInfo, com.tencent.matrix.util.NativeMemInfo nativeMemInfo, com.tencent.matrix.util.SystemInfo systemInfo, com.tencent.matrix.util.PssInfo pssInfo, com.tencent.matrix.util.PssInfo pssInfo2, oj.e eVar) {
        this.f53097e = processInfo;
        this.f53098f = statusInfo;
        this.f53099g = javaMemInfo;
        this.f53100h = nativeMemInfo;
        this.f53101i = systemInfo;
        this.f53102m = pssInfo;
        this.f53103n = pssInfo2;
        this.f53104o = eVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.matrix.util.MemInfo)) {
            return false;
        }
        com.tencent.matrix.util.MemInfo memInfo = (com.tencent.matrix.util.MemInfo) obj;
        return kotlin.jvm.internal.o.b(this.f53097e, memInfo.f53097e) && kotlin.jvm.internal.o.b(this.f53098f, memInfo.f53098f) && kotlin.jvm.internal.o.b(this.f53099g, memInfo.f53099g) && kotlin.jvm.internal.o.b(this.f53100h, memInfo.f53100h) && kotlin.jvm.internal.o.b(this.f53101i, memInfo.f53101i) && kotlin.jvm.internal.o.b(this.f53102m, memInfo.f53102m) && kotlin.jvm.internal.o.b(this.f53103n, memInfo.f53103n) && kotlin.jvm.internal.o.b(this.f53104o, memInfo.f53104o);
    }

    public int hashCode() {
        com.tencent.matrix.util.ProcessInfo processInfo = this.f53097e;
        int hashCode = (processInfo != null ? processInfo.hashCode() : 0) * 31;
        com.tencent.matrix.util.StatusInfo statusInfo = this.f53098f;
        int hashCode2 = (hashCode + (statusInfo != null ? statusInfo.hashCode() : 0)) * 31;
        com.tencent.matrix.util.JavaMemInfo javaMemInfo = this.f53099g;
        int hashCode3 = (hashCode2 + (javaMemInfo != null ? javaMemInfo.hashCode() : 0)) * 31;
        com.tencent.matrix.util.NativeMemInfo nativeMemInfo = this.f53100h;
        int hashCode4 = (hashCode3 + (nativeMemInfo != null ? nativeMemInfo.hashCode() : 0)) * 31;
        com.tencent.matrix.util.SystemInfo systemInfo = this.f53101i;
        int hashCode5 = (hashCode4 + (systemInfo != null ? systemInfo.hashCode() : 0)) * 31;
        com.tencent.matrix.util.PssInfo pssInfo = this.f53102m;
        int hashCode6 = (hashCode5 + (pssInfo != null ? pssInfo.hashCode() : 0)) * 31;
        com.tencent.matrix.util.PssInfo pssInfo2 = this.f53103n;
        int hashCode7 = (hashCode6 + (pssInfo2 != null ? pssInfo2.hashCode() : 0)) * 31;
        oj.e eVar = this.f53104o;
        return hashCode7 + (eVar != null ? eVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.String str = "\n";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n");
        sb6.append(r26.b0.b("\n                |>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> MemInfo <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n                |> Process   : " + this.f53097e + "\n                |> Status    : " + this.f53098f + "\n                |> SystemInfo: " + this.f53101i + "\n                |> Java      : " + this.f53099g + "\n                |> Native    : " + this.f53100h + "\n                |> Dbg-Pss   : " + this.f53103n + "\n                |> AMS-Pss   : " + this.f53102m + "\n                |> FgService : " + this.f53104o + "\n                |>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n            "));
        if (this.f53096d > 0) {
            str = "\n| cost : " + this.f53096d;
        }
        sb6.append(str);
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeParcelable(this.f53097e, i17);
        parcel.writeParcelable(this.f53098f, i17);
        parcel.writeParcelable(this.f53099g, i17);
        parcel.writeParcelable(this.f53100h, i17);
        parcel.writeParcelable(this.f53101i, i17);
        parcel.writeParcelable(this.f53102m, i17);
        parcel.writeParcelable(this.f53103n, i17);
        parcel.writeLong(this.f53096d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MemInfo(com.tencent.matrix.util.ProcessInfo r16, com.tencent.matrix.util.StatusInfo r17, com.tencent.matrix.util.JavaMemInfo r18, com.tencent.matrix.util.NativeMemInfo r19, com.tencent.matrix.util.SystemInfo r20, com.tencent.matrix.util.PssInfo r21, com.tencent.matrix.util.PssInfo r22, oj.e r23, int r24, kotlin.jvm.internal.i r25) {
        /*
            r15 = this;
            r0 = r24
            r1 = r0 & 1
            if (r1 == 0) goto L15
            com.tencent.matrix.util.ProcessInfo r1 = new com.tencent.matrix.util.ProcessInfo
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 31
            r9 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            goto L17
        L15:
            r1 = r16
        L17:
            r2 = r0 & 2
            if (r2 == 0) goto L26
            oj.h0 r2 = com.tencent.matrix.util.StatusInfo.f53126o
            int r3 = android.os.Process.myPid()
            com.tencent.matrix.util.StatusInfo r2 = r2.a(r3)
            goto L28
        L26:
            r2 = r17
        L28:
            r3 = r0 & 4
            if (r3 == 0) goto L51
            com.tencent.matrix.util.JavaMemInfo r3 = new com.tencent.matrix.util.JavaMemInfo
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()
            long r5 = r4.totalMemory()
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()
            long r7 = r4.freeMemory()
            long r9 = r5 - r7
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()
            long r11 = r4.maxMemory()
            int r13 = oj.p.f345713b
            int r14 = oj.p.f345714c
            r4 = r3
            r4.<init>(r5, r7, r9, r11, r13, r14)
            goto L53
        L51:
            r3 = r18
        L53:
            r4 = r0 & 8
            if (r4 == 0) goto L6a
            com.tencent.matrix.util.NativeMemInfo r4 = new com.tencent.matrix.util.NativeMemInfo
            long r6 = android.os.Debug.getNativeHeapSize()
            long r8 = android.os.Debug.getNativeHeapFreeSize()
            long r10 = android.os.Debug.getNativeHeapAllocatedSize()
            r5 = r4
            r5.<init>(r6, r8, r10)
            goto L6c
        L6a:
            r4 = r19
        L6c:
            r5 = r0 & 16
            if (r5 == 0) goto L89
            android.app.ActivityManager$MemoryInfo r5 = new android.app.ActivityManager$MemoryInfo
            r5.<init>()
            android.app.ActivityManager r6 = oj.p.f345712a
            r6.getMemoryInfo(r5)
            com.tencent.matrix.util.SystemInfo r6 = new com.tencent.matrix.util.SystemInfo
            long r8 = r5.totalMem
            long r10 = r5.availMem
            boolean r12 = r5.lowMemory
            long r13 = r5.threshold
            r7 = r6
            r7.<init>(r8, r10, r12, r13)
            goto L8b
        L89:
            r6 = r20
        L8b:
            r5 = r0 & 32
            r7 = 0
            if (r5 == 0) goto L92
            r5 = r7
            goto L94
        L92:
            r5 = r21
        L94:
            r8 = r0 & 64
            if (r8 == 0) goto L9a
            r8 = r7
            goto L9c
        L9a:
            r8 = r22
        L9c:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto La7
            oj.e r0 = new oj.e
            r9 = 1
            r0.<init>(r7, r9, r7)
            goto La9
        La7:
            r0 = r23
        La9:
            r16 = r15
            r17 = r1
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r6
            r22 = r5
            r23 = r8
            r24 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.util.MemInfo.<init>(com.tencent.matrix.util.ProcessInfo, com.tencent.matrix.util.StatusInfo, com.tencent.matrix.util.JavaMemInfo, com.tencent.matrix.util.NativeMemInfo, com.tencent.matrix.util.SystemInfo, com.tencent.matrix.util.PssInfo, com.tencent.matrix.util.PssInfo, oj.e, int, kotlin.jvm.internal.i):void");
    }
}
