package zw;

/* loaded from: classes8.dex */
public final class k implements rv.f3 {
    @Override // rv.f3
    public void a(java.lang.String filePath, java.lang.String picId, java.lang.String prompt, java.lang.Long l17, java.lang.String templateId, java.lang.String dataBuf, java.lang.String style) {
        l17.longValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(picId, "picId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prompt, "prompt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataBuf, "dataBuf");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterSelectPhotoHandler", "textCoverCallback onResult: ".concat(picId));
    }

    @Override // rv.f3
    public void b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterSelectPhotoHandler", "textCoverCallback onRequestNativeBottomOverlayVisible: " + z17);
        rr1.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1294xd2ae381c.ActivityC12992x240effab.f175591i;
        if (aVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1294xd2ae381c.ActivityC12992x240effab activityC12992x240effab = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1294xd2ae381c.ActivityC12992x240effab) aVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTextCoverUI", "onVisibleChanged visible=" + z17);
            android.view.View view = null;
            if (z17) {
                xg5.a aVar2 = activityC12992x240effab.f290218e;
                if (aVar2 != null) {
                    view = (android.view.View) ((jz5.n) ((b33.f) aVar2).f99196f).mo141623x754a37bb();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "<get-bottomContainer>(...)");
                }
                if (view == null) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                android.view.View view2 = view;
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/brandservice/ui/flutter/BizTextCoverUI", "onBottomOverlayVisibleChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/brandservice/ui/flutter/BizTextCoverUI", "onBottomOverlayVisibleChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            xg5.a aVar3 = activityC12992x240effab.f290218e;
            if (aVar3 != null) {
                view = (android.view.View) ((jz5.n) ((b33.f) aVar3).f99196f).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "<get-bottomContainer>(...)");
            }
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            android.view.View view3 = view;
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/brandservice/ui/flutter/BizTextCoverUI", "onBottomOverlayVisibleChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/brandservice/ui/flutter/BizTextCoverUI", "onBottomOverlayVisibleChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // rv.f3
    /* renamed from: onCancel */
    public void mo50711x3d6f0539() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterSelectPhotoHandler", "textCoverCallback onCancel");
    }
}
