package com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/luggage/sdk/config/AppBrandInitWindowConfig;", "Landroid/os/Parcelable;", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.luggage.sdk.config.AppBrandInitWindowConfig */
/* loaded from: classes7.dex */
public final /* data */ class C3898xeaad22a8 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3898xeaad22a8> f15681x681a0c0c = new ne.d();

    /* renamed from: d, reason: collision with root package name */
    public boolean f128819d;

    /* renamed from: e, reason: collision with root package name */
    public int f128820e;

    /* renamed from: f, reason: collision with root package name */
    public k91.z3 f128821f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f128822g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f128823h;

    /* renamed from: i, reason: collision with root package name */
    public k91.y3 f128824i;

    /* renamed from: m, reason: collision with root package name */
    public k91.y3 f128825m;

    public C3898xeaad22a8() {
        this(false, 0, null, null, false, null, null, 127, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m32066xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3898xeaad22a8)) {
            return false;
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3898xeaad22a8 c3898xeaad22a8 = (com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3898xeaad22a8) obj;
        return this.f128819d == c3898xeaad22a8.f128819d && this.f128820e == c3898xeaad22a8.f128820e && this.f128821f == c3898xeaad22a8.f128821f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f128822g, c3898xeaad22a8.f128822g) && this.f128823h == c3898xeaad22a8.f128823h && this.f128824i == c3898xeaad22a8.f128824i && this.f128825m == c3898xeaad22a8.f128825m;
    }

    /* renamed from: hashCode */
    public int m32067x8cdac1b() {
        int hashCode = ((java.lang.Boolean.hashCode(this.f128819d) * 31) + java.lang.Integer.hashCode(this.f128820e)) * 31;
        k91.z3 z3Var = this.f128821f;
        int hashCode2 = (hashCode + (z3Var == null ? 0 : z3Var.hashCode())) * 31;
        java.lang.String str = this.f128822g;
        return ((((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f128823h)) * 31) + this.f128824i.hashCode()) * 31) + this.f128825m.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m32068x9616526c() {
        java.lang.StringBuilder sb6;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("AppBrandInitWindowConfig(");
        java.lang.String str = ", ";
        if (this.f128819d) {
            sb6 = new java.lang.StringBuilder("navigationBarColor:");
            sb6.append(this.f128820e);
        } else {
            sb6 = new java.lang.StringBuilder("windowOpacity:");
            sb6.append(this.f128821f);
            sb6.append(", ");
            java.lang.String str2 = this.f128822g;
            if (str2 == null || str2.length() == 0) {
                str = ")";
            } else {
                str = "windowBackgroundImageFilePath:" + str2 + ", ";
            }
        }
        sb6.append(str);
        sb7.append(sb6.toString());
        return sb7.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f128819d ? 1 : 0);
        out.writeInt(this.f128820e);
        k91.z3 z3Var = this.f128821f;
        if (z3Var == null) {
            z3Var = k91.z3.UNKNOWN;
        }
        out.writeInt(z3Var.ordinal());
        out.writeString(this.f128822g);
        out.writeInt(this.f128823h ? 1 : 0);
        out.writeString(this.f128824i.name());
        out.writeString(this.f128825m.name());
    }

    public C3898xeaad22a8(boolean z17, int i17, k91.z3 z3Var, java.lang.String str, boolean z18, k91.y3 enterAnimation, k91.y3 exitAnimation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterAnimation, "enterAnimation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exitAnimation, "exitAnimation");
        this.f128819d = z17;
        this.f128820e = i17;
        this.f128821f = z3Var;
        this.f128822g = str;
        this.f128823h = z18;
        this.f128824i = enterAnimation;
        this.f128825m = exitAnimation;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C3898xeaad22a8(boolean r6, int r7, k91.z3 r8, java.lang.String r9, boolean r10, k91.y3 r11, k91.y3 r12, int r13, p3321xbce91901.jvm.p3324x21ffc6bd.i r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            r0 = 0
            if (r14 == 0) goto L7
            r14 = r0
            goto L8
        L7:
            r14 = r6
        L8:
            r6 = r13 & 2
            if (r6 == 0) goto Le
            r1 = r0
            goto Lf
        Le:
            r1 = r7
        Lf:
            r6 = r13 & 4
            if (r6 == 0) goto L15
            k91.z3 r8 = k91.z3.UNKNOWN
        L15:
            r2 = r8
            r6 = r13 & 8
            if (r6 == 0) goto L1b
            r9 = 0
        L1b:
            r3 = r9
            r6 = r13 & 16
            if (r6 == 0) goto L21
            goto L22
        L21:
            r0 = r10
        L22:
            r6 = r13 & 32
            k91.y3 r7 = k91.y3.DEFAULT
            if (r6 == 0) goto L2a
            r4 = r7
            goto L2b
        L2a:
            r4 = r11
        L2b:
            r6 = r13 & 64
            if (r6 == 0) goto L31
            r13 = r7
            goto L32
        L31:
            r13 = r12
        L32:
            r6 = r5
            r7 = r14
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r0
            r12 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3898xeaad22a8.<init>(boolean, int, k91.z3, java.lang.String, boolean, k91.y3, k91.y3, int, kotlin.jvm.internal.i):void");
    }
}
