package com.tencent.luggage.sdk.config;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/luggage/sdk/config/AppBrandInitWindowConfig;", "Landroid/os/Parcelable;", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class AppBrandInitWindowConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.luggage.sdk.config.AppBrandInitWindowConfig> CREATOR = new ne.d();

    /* renamed from: d, reason: collision with root package name */
    public boolean f47286d;

    /* renamed from: e, reason: collision with root package name */
    public int f47287e;

    /* renamed from: f, reason: collision with root package name */
    public k91.z3 f47288f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f47289g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f47290h;

    /* renamed from: i, reason: collision with root package name */
    public k91.y3 f47291i;

    /* renamed from: m, reason: collision with root package name */
    public k91.y3 f47292m;

    public AppBrandInitWindowConfig() {
        this(false, 0, null, null, false, null, null, 127, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.luggage.sdk.config.AppBrandInitWindowConfig)) {
            return false;
        }
        com.tencent.luggage.sdk.config.AppBrandInitWindowConfig appBrandInitWindowConfig = (com.tencent.luggage.sdk.config.AppBrandInitWindowConfig) obj;
        return this.f47286d == appBrandInitWindowConfig.f47286d && this.f47287e == appBrandInitWindowConfig.f47287e && this.f47288f == appBrandInitWindowConfig.f47288f && kotlin.jvm.internal.o.b(this.f47289g, appBrandInitWindowConfig.f47289g) && this.f47290h == appBrandInitWindowConfig.f47290h && this.f47291i == appBrandInitWindowConfig.f47291i && this.f47292m == appBrandInitWindowConfig.f47292m;
    }

    public int hashCode() {
        int hashCode = ((java.lang.Boolean.hashCode(this.f47286d) * 31) + java.lang.Integer.hashCode(this.f47287e)) * 31;
        k91.z3 z3Var = this.f47288f;
        int hashCode2 = (hashCode + (z3Var == null ? 0 : z3Var.hashCode())) * 31;
        java.lang.String str = this.f47289g;
        return ((((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f47290h)) * 31) + this.f47291i.hashCode()) * 31) + this.f47292m.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("AppBrandInitWindowConfig(");
        java.lang.String str = ", ";
        if (this.f47286d) {
            sb6 = new java.lang.StringBuilder("navigationBarColor:");
            sb6.append(this.f47287e);
        } else {
            sb6 = new java.lang.StringBuilder("windowOpacity:");
            sb6.append(this.f47288f);
            sb6.append(", ");
            java.lang.String str2 = this.f47289g;
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
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f47286d ? 1 : 0);
        out.writeInt(this.f47287e);
        k91.z3 z3Var = this.f47288f;
        if (z3Var == null) {
            z3Var = k91.z3.UNKNOWN;
        }
        out.writeInt(z3Var.ordinal());
        out.writeString(this.f47289g);
        out.writeInt(this.f47290h ? 1 : 0);
        out.writeString(this.f47291i.name());
        out.writeString(this.f47292m.name());
    }

    public AppBrandInitWindowConfig(boolean z17, int i17, k91.z3 z3Var, java.lang.String str, boolean z18, k91.y3 enterAnimation, k91.y3 exitAnimation) {
        kotlin.jvm.internal.o.g(enterAnimation, "enterAnimation");
        kotlin.jvm.internal.o.g(exitAnimation, "exitAnimation");
        this.f47286d = z17;
        this.f47287e = i17;
        this.f47288f = z3Var;
        this.f47289g = str;
        this.f47290h = z18;
        this.f47291i = enterAnimation;
        this.f47292m = exitAnimation;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AppBrandInitWindowConfig(boolean r6, int r7, k91.z3 r8, java.lang.String r9, boolean r10, k91.y3 r11, k91.y3 r12, int r13, kotlin.jvm.internal.i r14) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.luggage.sdk.config.AppBrandInitWindowConfig.<init>(boolean, int, k91.z3, java.lang.String, boolean, k91.y3, k91.y3, int, kotlin.jvm.internal.i):void");
    }
}
