package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class o5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f98112d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity f98113e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f98114f;

    public o5(java.lang.String str, com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity multiEmojiEditorActivity, kotlin.jvm.internal.h0 h0Var) {
        this.f98112d = str;
        this.f98113e = multiEmojiEditorActivity;
        this.f98114f = h0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str = this.f98112d;
        boolean z17 = str == null || str.length() == 0;
        com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity multiEmojiEditorActivity = this.f98113e;
        if (!z17) {
            java.lang.String str2 = this.f98112d;
            int i18 = com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity.R;
            or.d.c(str2, 3, multiEmojiEditorActivity.s7(), 0, 0, (java.lang.String) this.f98114f.f310123d, 16, null);
        }
        multiEmojiEditorActivity.setResult(0);
        multiEmojiEditorActivity.finish();
        multiEmojiEditorActivity.f97774y = 3L;
    }
}
