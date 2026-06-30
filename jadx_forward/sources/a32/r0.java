package a32;

/* loaded from: classes10.dex */
public final class r0 implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13396xea536474 f82573a;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13396xea536474 c13396xea536474) {
        this.f82573a = c13396xea536474;
    }

    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        u85.o task = (u85.o) dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        java.lang.String str = task.f507252f.f275223e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13396xea536474 c13396xea536474 = this.f82573a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, c13396xea536474.f180224h)) {
            fp0.u uVar = fp0.u.f346823f;
            android.view.View view = c13396xea536474.f180222f;
            if (status == uVar) {
                view.setBackgroundResource(c13396xea536474.f180221e);
                android.view.View view2 = c13396xea536474.f180223g;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "notifyLoadingResult", "(Lcom/tencent/mm/loader/loader/WorkStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "notifyLoadingResult", "(Lcom/tencent/mm/loader/loader/WorkStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            view.setBackgroundResource(c13396xea536474.f180220d);
            android.view.View view3 = c13396xea536474.f180223g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "notifyLoadingResult", "(Lcom/tencent/mm/loader/loader/WorkStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "notifyLoadingResult", "(Lcom/tencent/mm/loader/loader/WorkStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
