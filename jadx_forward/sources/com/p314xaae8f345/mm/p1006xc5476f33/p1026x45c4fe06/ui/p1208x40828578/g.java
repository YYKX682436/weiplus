package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f171612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f171613e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.h f171614f;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.h hVar, android.graphics.Bitmap bitmap, byte[] bArr) {
        this.f171614f = hVar;
        this.f171612d = bitmap;
        this.f171613e = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.h hVar = this.f171614f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.m mVar = hVar.f171619c;
        r45.fl0 fl0Var = hVar.f171617a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.t6 t6Var = hVar.f171618b;
        boolean z17 = mVar.f171653h.getVisibility() != 0;
        int ordinal = t6Var.ordinal();
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe366 = mVar.f171655m;
        if (ordinal == 0) {
            android.view.View view = mVar.f171653h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c16077xb54fe366.y();
            return;
        }
        android.widget.ImageView imageView = mVar.f171654i;
        android.widget.TextView textView = mVar.f171656n;
        if (ordinal == 1) {
            if (android.text.TextUtils.isEmpty(fl0Var.f455954g)) {
                return;
            }
            android.view.View view2 = mVar.f171653h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(8);
            textView.setVisibility(0);
            c16077xb54fe366.setVisibility(8);
            c16077xb54fe366.y();
            textView.setText(fl0Var.f455954g);
            if (z17) {
                mVar.o();
                return;
            }
            return;
        }
        android.graphics.Bitmap bitmap = this.f171612d;
        if (ordinal == 2) {
            if (bitmap == null || android.text.TextUtils.isEmpty(fl0Var.f455954g)) {
                return;
            }
            android.view.View view3 = mVar.f171653h;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(0);
            textView.setVisibility(0);
            c16077xb54fe366.setVisibility(8);
            imageView.setImageBitmap(bitmap);
            textView.setText(fl0Var.f455954g);
            c16077xb54fe366.y();
            if (z17) {
                mVar.o();
                return;
            }
            return;
        }
        byte[] bArr = this.f171613e;
        if (ordinal != 3) {
            if (ordinal != 4 || bArr == null || bArr.length == 0 || android.text.TextUtils.isEmpty(fl0Var.f455954g)) {
                return;
            }
            android.view.View view4 = mVar.f171653h;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(8);
            textView.setVisibility(0);
            c16077xb54fe366.setVisibility(0);
            textView.setText(fl0Var.f455954g);
            c16077xb54fe366.u(bArr, "");
            c16077xb54fe366.x();
            if (z17) {
                mVar.o();
                return;
            }
            return;
        }
        if (bitmap == null || bArr == null || bArr.length == 0 || android.text.TextUtils.isEmpty(fl0Var.f455954g)) {
            return;
        }
        android.view.View view5 = mVar.f171653h;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageView.setVisibility(0);
        textView.setVisibility(0);
        c16077xb54fe366.setVisibility(0);
        imageView.setImageBitmap(bitmap);
        textView.setText(fl0Var.f455954g);
        c16077xb54fe366.u(bArr, "");
        c16077xb54fe366.x();
        if (z17) {
            mVar.o();
        }
    }
}
