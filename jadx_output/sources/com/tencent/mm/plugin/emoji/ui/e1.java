package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f97940d;

    /* renamed from: e, reason: collision with root package name */
    public int f97941e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity f97942f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.io.File f97943g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f97944h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f97945i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f97946m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f97947n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f97948o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.util.Range f97949p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f97950q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.util.List f97951r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity, java.io.File file, android.graphics.Rect rect, int i17, int i18, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, android.util.Range range, android.graphics.Rect rect2, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f97942f = emojiEditorActivity;
        this.f97943g = file;
        this.f97944h = rect;
        this.f97945i = i17;
        this.f97946m = i18;
        this.f97947n = bitmap;
        this.f97948o = bitmap2;
        this.f97949p = range;
        this.f97950q = rect2;
        this.f97951r = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.emoji.ui.e1(this.f97942f, this.f97943g, this.f97944h, this.f97945i, this.f97946m, this.f97947n, this.f97948o, this.f97949p, this.f97950q, this.f97951r, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.emoji.ui.e1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00df  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.emoji.ui.e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
