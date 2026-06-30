package a32;

/* loaded from: classes10.dex */
public final class r0 implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.capture.StickerSelectFrame f1040a;

    public r0(com.tencent.mm.plugin.emojicapture.ui.capture.StickerSelectFrame stickerSelectFrame) {
        this.f1040a = stickerSelectFrame;
    }

    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        u85.o task = (u85.o) dVar;
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(status, "status");
        java.lang.String str = task.f425719f.f193690e;
        com.tencent.mm.plugin.emojicapture.ui.capture.StickerSelectFrame stickerSelectFrame = this.f1040a;
        if (kotlin.jvm.internal.o.b(str, stickerSelectFrame.f98691h)) {
            fp0.u uVar = fp0.u.f265290f;
            android.view.View view = stickerSelectFrame.f98689f;
            if (status == uVar) {
                view.setBackgroundResource(stickerSelectFrame.f98688e);
                android.view.View view2 = stickerSelectFrame.f98690g;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "notifyLoadingResult", "(Lcom/tencent/mm/loader/loader/WorkStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "notifyLoadingResult", "(Lcom/tencent/mm/loader/loader/WorkStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            view.setBackgroundResource(stickerSelectFrame.f98687d);
            android.view.View view3 = stickerSelectFrame.f98690g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "notifyLoadingResult", "(Lcom/tencent/mm/loader/loader/WorkStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "notifyLoadingResult", "(Lcom/tencent/mm/loader/loader/WorkStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
