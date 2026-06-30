package com.tencent.matrix.util;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/matrix/util/ProcessInfo;", "Landroid/os/Parcelable;", "CREATOR", "oj/v", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final /* data */ class ProcessInfo implements android.os.Parcelable {
    public static final oj.v CREATOR = new oj.v(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f53108d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f53109e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f53110f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f53111g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f53112h;

    public ProcessInfo(int i17, java.lang.String name, java.lang.String activity, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f53108d = i17;
        this.f53109e = name;
        this.f53110f = activity;
        this.f53111g = z17;
        this.f53112h = z18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.matrix.util.ProcessInfo)) {
            return false;
        }
        com.tencent.matrix.util.ProcessInfo processInfo = (com.tencent.matrix.util.ProcessInfo) obj;
        return this.f53108d == processInfo.f53108d && kotlin.jvm.internal.o.b(this.f53109e, processInfo.f53109e) && kotlin.jvm.internal.o.b(this.f53110f, processInfo.f53110f) && this.f53111g == processInfo.f53111g && this.f53112h == processInfo.f53112h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i17 = this.f53108d * 31;
        java.lang.String str = this.f53109e;
        int hashCode = (i17 + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.f53110f;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z17 = this.f53111g;
        int i18 = z17;
        if (z17 != 0) {
            i18 = 1;
        }
        int i19 = (hashCode2 + i18) * 31;
        boolean z18 = this.f53112h;
        return i19 + (z18 ? 1 : z18 ? 1 : 0);
    }

    public java.lang.String toString() {
        java.lang.String format = java.lang.String.format("%-21s\t%-21s %-21s %-21s %-21s", java.util.Arrays.copyOf(new java.lang.Object[]{this.f53109e, "Activity=" + this.f53110f, "AppForeground=" + this.f53112h, "ProcessForeground=" + this.f53111g, "Pid=" + this.f53108d}, 5));
        kotlin.jvm.internal.o.f(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeInt(this.f53108d);
        parcel.writeString(this.f53109e);
        parcel.writeString(this.f53110f);
        parcel.writeByte(this.f53111g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f53112h ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ProcessInfo(int r4, java.lang.String r5, java.lang.String r6, boolean r7, boolean r8, int r9, kotlin.jvm.internal.i r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L8
            int r4 = android.os.Process.myPid()
        L8:
            r10 = r9 & 2
            if (r10 == 0) goto L20
            ih.d r5 = ih.d.d()
            java.lang.String r10 = "Matrix.with()"
            kotlin.jvm.internal.o.f(r5, r10)
            android.app.Application r5 = r5.f291471b
            java.lang.String r5 = oj.m.b(r5)
            java.lang.String r10 = "MatrixUtil.getProcessNam…atrix.with().application)"
            kotlin.jvm.internal.o.f(r5, r10)
        L20:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L2d
            java.lang.String r5 = com.tencent.matrix.lifecycle.owners.f0.f52735q
            r6 = 46
            java.lang.String r6 = r26.n0.o0(r5, r6, r5)
        L2d:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L38
            com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner r5 = com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner.INSTANCE
            boolean r7 = r5.active()
        L38:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L48
            com.tencent.matrix.lifecycle.supervisor.d0 r5 = com.tencent.matrix.lifecycle.supervisor.d0.f52834k
            r5.getClass()
            com.tencent.matrix.lifecycle.IForegroundStatefulOwner r5 = com.tencent.matrix.lifecycle.supervisor.d0.f52830g
            boolean r8 = r5.active()
        L48:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.util.ProcessInfo.<init>(int, java.lang.String, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.i):void");
    }
}
