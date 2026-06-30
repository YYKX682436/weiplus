package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class f1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f97966d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f97967e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f97968f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f97969g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97970h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity f97971i;

    /* renamed from: m, reason: collision with root package name */
    public int f97972m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f97971i = emojiEditorActivity;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f97970h = obj;
        this.f97972m |= Integer.MIN_VALUE;
        return this.f97971i.Y6(null, null, 0, 0, null, false, false, null, null, this);
    }
}
