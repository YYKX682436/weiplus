package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* renamed from: com.tencent.mm.ui.chatting.hd$$a */
/* loaded from: classes9.dex */
public final /* synthetic */ class C21810x5e78d65 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.od {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.C27792x18e302a9 f283215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283216b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283217c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f283218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f283219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType f283220f;

    public /* synthetic */ C21810x5e78d65(com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.C27792x18e302a9 c27792x18e302a9, java.lang.String str, java.lang.String str2, int i17, android.content.Context context, com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType wWAppType) {
        this.f283215a = c27792x18e302a9;
        this.f283216b = str;
        this.f283217c = str2;
        this.f283218d = i17;
        this.f283219e = context;
        this.f283220f = wWAppType;
    }

    public final void a(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[1];
        }
        com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.C27792x18e302a9 c27792x18e302a9 = this.f283215a;
        c27792x18e302a9.f301703h = bArr;
        if (bArr.length > 1048576) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendToWeWorkHelper", "miniProgram.hdImageData.length > 1M");
            c27792x18e302a9.f301703h = new byte[1];
        }
        c27792x18e302a9.f301705j = this.f283216b;
        c27792x18e302a9.f301698c = this.f283217c;
        c27792x18e302a9.f301706k = this.f283218d;
        int length = c27792x18e302a9.f301703h.length;
        com.p314xaae8f345.p3200xd0d7bedf.api.AbstractC27778x5479f090.a(this.f283219e).a(c27792x18e302a9, this.f283220f);
    }
}
