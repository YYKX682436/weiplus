package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class u5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f98219d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f98220e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity f98221f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity multiEmojiEditorActivity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f98221f = multiEmojiEditorActivity;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.emoji.ui.u5 u5Var = new com.tencent.mm.plugin.emoji.ui.u5(this.f98221f, continuation);
        u5Var.f98220e = obj;
        return u5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.emoji.ui.u5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object c17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f98219d;
        com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity multiEmojiEditorActivity = this.f98221f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f98220e;
            p12.h c76 = multiEmojiEditorActivity.c7();
            this.f98220e = y0Var;
            this.f98219d = 1;
            c17 = c76.c(this);
            if (c17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                throw new jz5.d();
            }
            kotlin.ResultKt.throwOnFailure(obj);
            c17 = obj;
        }
        l12.a aVar2 = (l12.a) c17;
        if (aVar2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiEmojiEditorActivity", "failed to setup render view");
            multiEmojiEditorActivity.setResult(0);
            multiEmojiEditorActivity.finish();
            multiEmojiEditorActivity.f97774y = 1L;
            return jz5.f0.f302826a;
        }
        android.view.View findViewById = multiEmojiEditorActivity.findViewById(com.tencent.mm.R.id.im7);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity$setupMedia$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/emoji/ui/MultiEmojiEditorActivity$setupMedia$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        multiEmojiEditorActivity.c7().a().addOnLayoutChangeListener(new com.tencent.mm.plugin.emoji.ui.s5(multiEmojiEditorActivity));
        multiEmojiEditorActivity.n7(aVar2);
        multiEmojiEditorActivity.f97772w = aVar2 == l12.a.f314981f;
        if (aVar2 == l12.a.f314980e) {
            multiEmojiEditorActivity.B.f55974o++;
        }
        android.util.Size size = (android.util.Size) ((kotlinx.coroutines.flow.h3) multiEmojiEditorActivity.c7().f351025d).getValue();
        if (size.getWidth() != 0) {
            com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorClipView a76 = multiEmojiEditorActivity.a7();
            int width = size.getWidth();
            int height = size.getHeight();
            a76.f97454f = width;
            a76.f97455g = height;
            a76.invalidate();
            multiEmojiEditorActivity.b7().a(size.getWidth(), size.getHeight());
        }
        multiEmojiEditorActivity.t7();
        kotlinx.coroutines.flow.j2 j2Var = multiEmojiEditorActivity.c7().f351025d;
        com.tencent.mm.plugin.emoji.ui.t5 t5Var = new com.tencent.mm.plugin.emoji.ui.t5(multiEmojiEditorActivity);
        this.f98220e = null;
        this.f98219d = 2;
        if (((kotlinx.coroutines.flow.h3) j2Var).a(t5Var, this) == aVar) {
            return aVar;
        }
        throw new jz5.d();
    }
}
