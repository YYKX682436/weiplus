package com.tencent.mm.plugin.appbrand.jsapi.auth.entity;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/auth/entity/MMAuthScopeRiskInfo;", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/auth/entity/r", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class MMAuthScopeRiskInfo implements android.os.Parcelable {
    public static final com.tencent.mm.plugin.appbrand.jsapi.auth.entity.r CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.r(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f79452d;

    /* renamed from: e, reason: collision with root package name */
    public final int f79453e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f79454f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f79455g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f79456h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f79457i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskWxaAppInfo f79458m;

    public MMAuthScopeRiskInfo(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskWxaAppInfo mMAuthScopeRiskWxaAppInfo) {
        this.f79452d = i17;
        this.f79453e = i18;
        this.f79454f = str;
        this.f79455g = str2;
        this.f79456h = str3;
        this.f79457i = str4;
        this.f79458m = mMAuthScopeRiskWxaAppInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeInt(this.f79452d);
        parcel.writeInt(this.f79453e);
        parcel.writeString(this.f79454f);
        parcel.writeString(this.f79455g);
        parcel.writeString(this.f79456h);
        parcel.writeString(this.f79457i);
        parcel.writeParcelable(this.f79458m, i17);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MMAuthScopeRiskInfo(r45.mv5 r15) {
        /*
            r14 = this;
            java.lang.String r0 = "scopeRiskPopUpInfo"
            kotlin.jvm.internal.o.g(r15, r0)
            int r2 = r15.f380852d
            int r3 = r15.f380858m
            com.tencent.mm.protobuf.g r0 = r15.f380853e
            java.lang.String r4 = r0.i()
            com.tencent.mm.protobuf.g r0 = r15.f380854f
            java.lang.String r5 = r0.i()
            com.tencent.mm.protobuf.g r0 = r15.f380855g
            java.lang.String r6 = r0.i()
            com.tencent.mm.protobuf.g r0 = r15.f380856h
            java.lang.String r7 = r0.i()
            r45.nv5 r15 = r15.f380857i
            if (r15 == 0) goto L42
            com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskWxaAppInfo r0 = new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskWxaAppInfo
            java.lang.String r9 = r15.f381693d
            java.lang.String r1 = "username"
            kotlin.jvm.internal.o.f(r9, r1)
            java.lang.String r10 = r15.f381694e
            java.lang.String r1 = "path"
            kotlin.jvm.internal.o.f(r10, r1)
            int r11 = r15.f381695f
            int r12 = r15.f381696g
            int r13 = r15.f381697h
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            r8 = r0
            goto L44
        L42:
            r15 = 0
            r8 = r15
        L44:
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskInfo.<init>(r45.mv5):void");
    }
}
