package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u0000 &2\u00020\u0001:\u0001'B/\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0007\u0012\b\b\u0002\u0010 \u001a\u00020\u001a\u0012\b\b\u0002\u0010\"\u001a\u00020\u001a¢\u0006\u0004\b#\u0010$B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b#\u0010%J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0019\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\"\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\r\u0010\u001d\"\u0004\b!\u0010\u001f¨\u0006("}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/media/JSApiBizChooseImage$ChooseTaskRequest", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "Ljava/lang/Class;", "Lcom/tencent/mm/plugin/appbrand/jsapi/media/e2;", "getTaskClass", "Landroid/os/Parcel;", "parcel", "", "flags", "Ljz5/f0;", "writeToParcel", "describeContents", "", "d", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "e", "(Ljava/lang/String;)V", "appId", "I", "b", "()I", "f", "(I)V", "count", "", "Z", "c", "()Z", "g", "(Z)V", "supportLivePhoto", "h", "supportTextCover", "<init>", "(Ljava/lang/String;IZZ)V", "(Landroid/os/Parcel;)V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/media/f2", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JSApiBizChooseImage$ChooseTaskRequest */
/* loaded from: classes7.dex */
public final class C12159xc42d751 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.f2 f34461x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.f2(null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private java.lang.String appId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int count;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean supportLivePhoto;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean supportTextCover;

    public C12159xc42d751() {
        this(null, 0, false, false, 15, null);
    }

    /* renamed from: a, reason: from getter */
    public final java.lang.String getAppId() {
        return this.appId;
    }

    /* renamed from: b, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getSupportLivePhoto() {
        return this.supportLivePhoto;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getSupportTextCover() {
        return this.supportTextCover;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void e(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.appId = str;
    }

    public final void f(int i17) {
        this.count = i17;
    }

    public final void g(boolean z17) {
        this.supportLivePhoto = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: getTaskClass */
    public java.lang.Class<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e2> mo50317x8a7a03d() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e2.class;
    }

    public final void h(boolean z17) {
        this.supportTextCover = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(this.appId);
        parcel.writeInt(this.count);
        parcel.writeInt(this.supportLivePhoto ? 1 : 0);
        parcel.writeInt(this.supportTextCover ? 1 : 0);
    }

    public /* synthetic */ C12159xc42d751(java.lang.String str, int i17, boolean z17, boolean z18, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? "" : str, (i18 & 2) != 0 ? 0 : i17, (i18 & 4) != 0 ? false : z17, (i18 & 8) != 0 ? false : z18);
    }

    public C12159xc42d751(java.lang.String appId, int i17, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.appId = appId;
        this.count = i17;
        this.supportLivePhoto = z17;
        this.supportTextCover = z18;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C12159xc42d751(android.os.Parcel r6) {
        /*
            r5 = this;
            java.lang.String r0 = "parcel"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            java.lang.String r0 = r6.readString()
            if (r0 != 0) goto Ld
            java.lang.String r0 = ""
        Ld:
            int r1 = r6.readInt()
            int r2 = r6.readInt()
            r3 = 0
            r4 = 1
            if (r4 != r2) goto L1b
            r2 = r4
            goto L1c
        L1b:
            r2 = r3
        L1c:
            int r6 = r6.readInt()
            if (r4 != r6) goto L23
            r3 = r4
        L23:
            r5.<init>(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12159xc42d751.<init>(android.os.Parcel):void");
    }
}
