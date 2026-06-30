package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class d1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity f97924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97925e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f97926f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity, java.lang.String str, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f97924d = emojiEditorActivity;
        this.f97925e = str;
        this.f97926f = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.emoji.ui.d1(this.f97924d, this.f97925e, this.f97926f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.emoji.ui.d1 d1Var = (com.tencent.mm.plugin.emoji.ui.d1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        d1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity = this.f97924d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = emojiEditorActivity.C;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorActivity", "start EmojiAddCustomDialogUI");
        android.content.Intent intent = new android.content.Intent(emojiEditorActivity, (java.lang.Class<?>) com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI.class);
        java.lang.String str = this.f97925e;
        intent.putExtra("extra_id", str);
        java.util.List list = this.f97926f;
        intent.putStringArrayListExtra("extra_wordings", new java.util.ArrayList<>(list));
        intent.putExtra("extra_upload_scene", !list.isEmpty() ? 1 : 0);
        intent.putExtra("extra_scence", emojiEditorActivity.k7());
        intent.putExtra("extra_move_to_top", true);
        intent.putExtra("EXTRA_SESSION_ID", emojiEditorActivity.f97773x);
        intent.putExtra("extra_username", c01.z1.r());
        intent.putExtra("query_source_type", emojiEditorActivity.f97775z);
        intent.putExtra("key_from_scene", emojiEditorActivity.A);
        intent.putExtra("key_is_selfie", false);
        intent.addFlags(65536);
        intent.putExtra("extra_id", str);
        if (emojiEditorActivity.getIntent().hasExtra("finder_object_bytes")) {
            intent.putExtra("finder_object_bytes", emojiEditorActivity.getIntent().getByteArrayExtra("finder_object_bytes"));
        }
        intent.putExtra("is_upload_wxam", emojiEditorActivity.f97756d);
        emojiEditorActivity.T6(intent);
        emojiEditorActivity.startActivityForResult(intent, 1);
        emojiEditorActivity.f97774y = 4L;
        return jz5.f0.f302826a;
    }
}
