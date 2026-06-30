package com.p314xaae8f345.p552xbf8d97c1.p590x36f002;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/matrix/util/ProcessInfo;", "Landroid/os/Parcelable;", "CREATOR", "oj/v", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.tencent.matrix.util.ProcessInfo */
/* loaded from: classes12.dex */
public final /* data */ class C4722x6f76cf9d implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final oj.v f20055x681a0c0c = new oj.v(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f134641d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f134642e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f134643f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f134644g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f134645h;

    public C4722x6f76cf9d(int i17, java.lang.String name, java.lang.String activity, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f134641d = i17;
        this.f134642e = name;
        this.f134643f = activity;
        this.f134644g = z17;
        this.f134645h = z18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m41329xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4722x6f76cf9d)) {
            return false;
        }
        com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4722x6f76cf9d c4722x6f76cf9d = (com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4722x6f76cf9d) obj;
        return this.f134641d == c4722x6f76cf9d.f134641d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134642e, c4722x6f76cf9d.f134642e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134643f, c4722x6f76cf9d.f134643f) && this.f134644g == c4722x6f76cf9d.f134644g && this.f134645h == c4722x6f76cf9d.f134645h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: hashCode */
    public int m41330x8cdac1b() {
        int i17 = this.f134641d * 31;
        java.lang.String str = this.f134642e;
        int hashCode = (i17 + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.f134643f;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z17 = this.f134644g;
        int i18 = z17;
        if (z17 != 0) {
            i18 = 1;
        }
        int i19 = (hashCode2 + i18) * 31;
        boolean z18 = this.f134645h;
        return i19 + (z18 ? 1 : z18 ? 1 : 0);
    }

    /* renamed from: toString */
    public java.lang.String m41331x9616526c() {
        java.lang.String format = java.lang.String.format("%-21s\t%-21s %-21s %-21s %-21s", java.util.Arrays.copyOf(new java.lang.Object[]{this.f134642e, "Activity=" + this.f134643f, "AppForeground=" + this.f134645h, "ProcessForeground=" + this.f134644g, "Pid=" + this.f134641d}, 5));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeInt(this.f134641d);
        parcel.writeString(this.f134642e);
        parcel.writeString(this.f134643f);
        parcel.writeByte(this.f134644g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f134645h ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4722x6f76cf9d(int r4, java.lang.String r5, java.lang.String r6, boolean r7, boolean r8, int r9, p3321xbce91901.jvm.p3324x21ffc6bd.i r10) {
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r10)
            android.app.Application r5 = r5.f373004b
            java.lang.String r5 = oj.m.b(r5)
            java.lang.String r10 = "MatrixUtil.getProcessNam…atrix.with().application)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r10)
        L20:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L2d
            java.lang.String r5 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134268q
            r6 = 46
            java.lang.String r6 = r26.n0.o0(r5, r6, r5)
        L2d:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L38
            com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner r5 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4679x33de8120.f19966x4fbc8495
            boolean r7 = r5.mo40960xab2f7f06()
        L38:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L48
            com.tencent.matrix.lifecycle.supervisor.d0 r5 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k
            r5.getClass()
            com.tencent.matrix.lifecycle.IForegroundStatefulOwner r5 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134363g
            boolean r8 = r5.mo40960xab2f7f06()
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4722x6f76cf9d.<init>(int, java.lang.String, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.i):void");
    }
}
