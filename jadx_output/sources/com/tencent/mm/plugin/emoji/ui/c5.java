package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class c5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity f97918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f97919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f97920f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity multiEmojiEditorActivity, java.util.List list, java.util.List list2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f97918d = multiEmojiEditorActivity;
        this.f97919e = list;
        this.f97920f = list2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.emoji.ui.c5(this.f97918d, this.f97919e, this.f97920f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.emoji.ui.c5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity multiEmojiEditorActivity = this.f97918d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = multiEmojiEditorActivity.C;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        java.util.List list = this.f97919e;
        boolean isEmpty = list.isEmpty();
        jz5.f0 f0Var = jz5.f0.f302826a;
        java.util.List list2 = this.f97920f;
        if (isEmpty) {
            db5.e1.s(multiEmojiEditorActivity, "", multiEmojiEditorActivity.getString(com.tencent.mm.R.string.obw, new java.lang.Integer(list2.size())));
            return f0Var;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiEmojiEditorActivity", "generated " + list.size() + " emojis, start batch upload");
        android.content.Intent intent = new android.content.Intent(multiEmojiEditorActivity, (java.lang.Class<?>) com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI.class);
        intent.putExtra("enable_multi_upload", true);
        intent.putExtra("multi_upload_fail_count", java.lang.Math.max(list2.size() - list.size(), 0));
        intent.putStringArrayListExtra("extra_id_list", new java.util.ArrayList<>(list));
        intent.putStringArrayListExtra("extra_wordings", new java.util.ArrayList<>());
        intent.putExtra("extra_upload_scene", 0);
        intent.putExtra("extra_scence", multiEmojiEditorActivity.k7());
        intent.putExtra("extra_move_to_top", true);
        intent.putExtra("EXTRA_SESSION_ID", multiEmojiEditorActivity.f97773x);
        intent.putExtra("extra_username", c01.z1.r());
        intent.putExtra("query_source_type", multiEmojiEditorActivity.f97775z);
        intent.putExtra("key_is_selfie", false);
        java.lang.String str = multiEmojiEditorActivity.Q;
        intent.putExtra("addstickers_sessionid", str != null ? str : "");
        intent.putExtra("key_from_scene", multiEmojiEditorActivity.A);
        intent.putExtra("extra_edit_sticker_source", multiEmojiEditorActivity.s7());
        java.util.List<com.tencent.mm.plugin.emoji.ui.g2> list3 = multiEmojiEditorActivity.f97883J;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list3, 10));
        for (com.tencent.mm.plugin.emoji.ui.g2 g2Var : list3) {
            arrayList.add(new java.lang.Integer(g2Var.b() ? 3 : g2Var.a() ? 4 : 1));
        }
        intent.putExtra("extra_edit_sticker_types", kz5.n0.R0(arrayList));
        intent.addFlags(65536);
        multiEmojiEditorActivity.getClass();
        multiEmojiEditorActivity.startActivityForResult(intent, 1);
        multiEmojiEditorActivity.f97774y = 4L;
        return f0Var;
    }
}
