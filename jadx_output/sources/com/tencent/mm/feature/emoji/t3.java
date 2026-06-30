package com.tencent.mm.feature.emoji;

/* loaded from: classes12.dex */
public final class t3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f66485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.emotion.EmojiInfo f66486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f66487f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f66488g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f66489h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66490i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66491m;

    public t3(android.content.Context context, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, boolean z17, int i17, int i18, java.lang.String str, java.lang.String str2) {
        this.f66485d = context;
        this.f66486e = emojiInfo;
        this.f66487f = z17;
        this.f66488g = i17;
        this.f66489h = i18;
        this.f66490i = str;
        this.f66491m = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n22.f.d(n22.f.f334290a, this.f66485d, this.f66486e, this.f66487f, null, null, null, 0, 0L, this.f66488g, this.f66489h, 0L, null, null, this.f66490i, this.f66491m, 7416, null);
    }
}
