package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f90079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f90080e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.h f90081f;

    public g(com.tencent.mm.plugin.appbrand.ui.recents.h hVar, android.graphics.Bitmap bitmap, byte[] bArr) {
        this.f90081f = hVar;
        this.f90079d = bitmap;
        this.f90080e = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.recents.h hVar = this.f90081f;
        com.tencent.mm.plugin.appbrand.ui.recents.m mVar = hVar.f90086c;
        r45.fl0 fl0Var = hVar.f90084a;
        com.tencent.mm.plugin.appbrand.appusage.t6 t6Var = hVar.f90085b;
        boolean z17 = mVar.f90120h.getVisibility() != 0;
        int ordinal = t6Var.ordinal();
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView = mVar.f90122m;
        if (ordinal == 0) {
            android.view.View view = mVar.f90120h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mMAnimateView.y();
            return;
        }
        android.widget.ImageView imageView = mVar.f90121i;
        android.widget.TextView textView = mVar.f90123n;
        if (ordinal == 1) {
            if (android.text.TextUtils.isEmpty(fl0Var.f374421g)) {
                return;
            }
            android.view.View view2 = mVar.f90120h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(8);
            textView.setVisibility(0);
            mMAnimateView.setVisibility(8);
            mMAnimateView.y();
            textView.setText(fl0Var.f374421g);
            if (z17) {
                mVar.o();
                return;
            }
            return;
        }
        android.graphics.Bitmap bitmap = this.f90079d;
        if (ordinal == 2) {
            if (bitmap == null || android.text.TextUtils.isEmpty(fl0Var.f374421g)) {
                return;
            }
            android.view.View view3 = mVar.f90120h;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(0);
            textView.setVisibility(0);
            mMAnimateView.setVisibility(8);
            imageView.setImageBitmap(bitmap);
            textView.setText(fl0Var.f374421g);
            mMAnimateView.y();
            if (z17) {
                mVar.o();
                return;
            }
            return;
        }
        byte[] bArr = this.f90080e;
        if (ordinal != 3) {
            if (ordinal != 4 || bArr == null || bArr.length == 0 || android.text.TextUtils.isEmpty(fl0Var.f374421g)) {
                return;
            }
            android.view.View view4 = mVar.f90120h;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(8);
            textView.setVisibility(0);
            mMAnimateView.setVisibility(0);
            textView.setText(fl0Var.f374421g);
            mMAnimateView.u(bArr, "");
            mMAnimateView.x();
            if (z17) {
                mVar.o();
                return;
            }
            return;
        }
        if (bitmap == null || bArr == null || bArr.length == 0 || android.text.TextUtils.isEmpty(fl0Var.f374421g)) {
            return;
        }
        android.view.View view5 = mVar.f90120h;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageView.setVisibility(0);
        textView.setVisibility(0);
        mMAnimateView.setVisibility(0);
        imageView.setImageBitmap(bitmap);
        textView.setText(fl0Var.f374421g);
        mMAnimateView.u(bArr, "");
        mMAnimateView.x();
        if (z17) {
            mVar.o();
        }
    }
}
