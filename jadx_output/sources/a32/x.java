package a32;

/* loaded from: classes10.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView f1048d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView editorStickerView) {
        super(2);
        this.f1048d = editorStickerView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.view.Window window;
        android.view.Window window2;
        int intValue = ((java.lang.Number) obj).intValue();
        t85.d info = (t85.d) obj2;
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView editorStickerView = this.f1048d;
        if (intValue >= 0 && intValue < editorStickerView.f98669g.getItemCount()) {
            if (kotlin.jvm.internal.o.b(info.f416456a, u22.r.f424008r)) {
                com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter emojiCaptureReporter = editorStickerView.reporter;
                if (emojiCaptureReporter != null) {
                    emojiCaptureReporter.e(25);
                }
                if (editorStickerView.f98677r == null) {
                    editorStickerView.f98673n.b();
                    editorStickerView.f98677r = new y9.i(editorStickerView.getContext(), 0);
                    android.content.Context context = editorStickerView.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView moreStickerView = new com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView(context, null);
                    editorStickerView.f98676q = moreStickerView;
                    moreStickerView.setReporter(editorStickerView.reporter);
                    com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView moreStickerView2 = editorStickerView.f98676q;
                    if (moreStickerView2 != null) {
                        moreStickerView2.setBackgroundResource(com.tencent.mm.R.drawable.emoji_capture_sticker_panel_bg);
                    }
                    float dimension = editorStickerView.getResources().getDimension(com.tencent.mm.R.dimen.f480352vd) + editorStickerView.getResources().getDimension(com.tencent.mm.R.dimen.a7u) + editorStickerView.getResources().getDimension(com.tencent.mm.R.dimen.f480354vf);
                    android.view.ViewParent parent = editorStickerView.getParent();
                    kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-1, ((android.view.ViewGroup) parent).getHeight() - ((int) dimension));
                    y9.i iVar = editorStickerView.f98677r;
                    if (iVar != null) {
                        com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView moreStickerView3 = editorStickerView.f98676q;
                        kotlin.jvm.internal.o.d(moreStickerView3);
                        iVar.setContentView(moreStickerView3, marginLayoutParams);
                    }
                    y9.i iVar2 = editorStickerView.f98677r;
                    if (iVar2 != null && (window2 = iVar2.getWindow()) != null) {
                        window2.clearFlags(2);
                    }
                    y9.i iVar3 = editorStickerView.f98677r;
                    if (iVar3 != null && (window = iVar3.getWindow()) != null) {
                        window.addFlags(1024);
                    }
                    y9.i iVar4 = editorStickerView.f98677r;
                    if (iVar4 != null) {
                        iVar4.setOnDismissListener(new a32.g0(editorStickerView));
                    }
                    com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView moreStickerView4 = editorStickerView.f98676q;
                    u22.c dataCallback = moreStickerView4 != null ? moreStickerView4.getDataCallback() : null;
                    u22.a aVar = editorStickerView.f98675p;
                    aVar.f423972a = dataCallback;
                    if (dataCallback != null) {
                        dataCallback.b(aVar.f423973b);
                    }
                    if (dataCallback != null) {
                        dataCallback.c(0, aVar.f423973b.size());
                    }
                    com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView moreStickerView5 = editorStickerView.f98676q;
                    if (moreStickerView5 != null) {
                        moreStickerView5.setSelectionCallback(new a32.h0(editorStickerView));
                    }
                    com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView moreStickerView6 = editorStickerView.f98676q;
                    if (moreStickerView6 != null) {
                        moreStickerView6.setCloseCallback(new a32.i0(editorStickerView));
                    }
                    com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView moreStickerView7 = editorStickerView.f98676q;
                    if (moreStickerView7 != null) {
                        moreStickerView7.setLoadMoreCallback(new a32.j0(editorStickerView));
                    }
                }
                y9.i iVar5 = editorStickerView.f98677r;
                if (iVar5 != null) {
                    iVar5.show();
                }
                com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView moreStickerView8 = editorStickerView.f98676q;
                if (moreStickerView8 != null) {
                    moreStickerView8.A();
                }
                com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView moreStickerView9 = editorStickerView.f98676q;
                if (moreStickerView9 != null) {
                    if (!kotlin.jvm.internal.o.b(moreStickerView9.B, editorStickerView.f98679t)) {
                        z22.f fVar = moreStickerView9.f98685y;
                        int i17 = fVar.f469718e;
                        if (i17 != -1) {
                            fVar.notifyItemChanged(i17);
                            fVar.f469718e = -1;
                            fVar.notifyItemChanged(-1);
                        }
                        yz5.l lVar = moreStickerView9.selectionCallback;
                        if (lVar != null) {
                            lVar.invoke(null);
                        }
                    }
                }
            } else {
                androidx.recyclerview.widget.RecyclerView recyclerView = editorStickerView.f98668f;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/emojicapture/ui/capture/EditorStickerView$2", "invoke", "(ILcom/tencent/mm/sticker/LensItem;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(recyclerView, "com/tencent/mm/plugin/emojicapture/ui/capture/EditorStickerView$2", "invoke", "(ILcom/tencent/mm/sticker/LensItem;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            }
        }
        return jz5.f0.f302826a;
    }
}
