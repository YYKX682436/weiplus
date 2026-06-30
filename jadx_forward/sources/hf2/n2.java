package hf2;

/* loaded from: classes10.dex */
public final class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f362657d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f362658e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f362659f;

    public n2(java.lang.String tag, java.lang.ref.WeakReference rController, java.lang.ref.WeakReference rlocationInfoWrapper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rController, "rController");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rlocationInfoWrapper, "rlocationInfoWrapper");
        this.f362657d = tag;
        this.f362658e = rController;
        this.f362659f = rlocationInfoWrapper;
    }

    @Override // java.lang.Runnable
    public void run() {
        jz5.f0 f0Var;
        jz5.f0 f0Var2;
        jz5.f0 f0Var3;
        java.lang.ref.WeakReference weakReference = this.f362658e;
        java.lang.Object obj = weakReference.get();
        java.lang.ref.WeakReference weakReference2 = this.f362659f;
        java.lang.Object obj2 = weakReference2.get();
        if (obj == null || obj2 == null) {
            f0Var = null;
        } else {
            hf2.m2 m2Var = (hf2.m2) obj2;
            hf2.x xVar = (hf2.x) obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f362657d, "single click task run,controller:" + xVar.hashCode() + '!');
            android.util.Size placeHoldBitmapSize = m2Var.f362650b.f362694b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(placeHoldBitmapSize, "placeHoldBitmapSize");
            boolean z17 = xVar.f362721t;
            jz5.f0 f0Var4 = jz5.f0.f384359a;
            java.lang.String str = xVar.f362714m;
            if (z17) {
                db5.t7.m(xVar.O6(), xVar.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lju));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "showStickerOperation is linking!");
                f0Var2 = f0Var4;
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showStickerOperation stickerType:");
                int i17 = m2Var.f362649a;
                sb6.append(i17);
                sb6.append(",pictureFilePath:");
                sb6.append("");
                sb6.append(", placeHoldBitmapSize:");
                sb6.append(placeHoldBitmapSize);
                sb6.append('!');
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(xVar.r7(), java.lang.Boolean.TRUE)) {
                    hf2.h0 f76 = xVar.f7();
                    f76.getClass();
                    hf2.x xVar2 = f76.f362603a;
                    xVar2.o7("launchStickerOperationContainer_" + i17);
                    r45.ee6 b76 = xVar2.b7(i17, 2, "");
                    android.graphics.Bitmap bitmap = ((je2.g) xVar2.m56788xbba4bfc0(je2.g.class)).f380756h;
                    java.util.LinkedList textItemRestoreDataList = b76.f454905h.f455062d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textItemRestoreDataList, "textItemRestoreDataList");
                    r45.ji0 ji0Var = (r45.ji0) kz5.n0.Z(textItemRestoreDataList);
                    java.lang.String str2 = f76.f362604b;
                    if (ji0Var != null) {
                        if (ji0Var.f459365q == null) {
                            ji0Var.f459365q = new r45.he6();
                        }
                        r45.he6 he6Var = ji0Var.f459365q;
                        he6Var.f457631d = bitmap != null;
                        he6Var.f457633f = placeHoldBitmapSize.getHeight();
                        he6Var.f457632e = placeHoldBitmapSize.getWidth();
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("launchStickerOperationContainer set genExtraConfig:");
                        r45.he6 genExtraConfig = ji0Var.f459365q;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(genExtraConfig, "genExtraConfig");
                        sb7.append(pm0.b0.g(genExtraConfig));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7.toString());
                    }
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("launchStickerOperationContainer stickerType:");
                    sb8.append(i17);
                    sb8.append(", containerMode:2,lastTextBitmap:");
                    sb8.append(bitmap);
                    sb8.append('(');
                    sb8.append(bitmap != null ? java.lang.Integer.valueOf(bitmap.getWidth()) : null);
                    sb8.append('*');
                    sb8.append(bitmap != null ? java.lang.Integer.valueOf(bitmap.getHeight()) : null);
                    sb8.append("), ");
                    sb8.append(je2.g.f380753u.a(b76));
                    sb8.append('!');
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb8.toString());
                    f0Var2 = f0Var4;
                    qc0.g1 wi6 = ((pc0.i2) ((qc0.h1) i95.n0.c(qc0.h1.class))).wi(xVar2.O6(), b76, new qc0.p1(new hf2.d0(f76), new hf2.e0(f76), new hf2.f0(f76), new hf2.g0(f76, i17)));
                    if (wi6 != null) {
                        f76.f362605c = wi6;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2013x8f55093d.C17090xc5b6aeb7 c17090xc5b6aeb7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2013x8f55093d.C17090xc5b6aeb7) wi6;
                        f76.f362606d = c17090xc5b6aeb7;
                        android.view.ViewGroup viewGroup = xVar2.f362724w;
                        if (viewGroup != null && viewGroup.indexOfChild(c17090xc5b6aeb7) == -1) {
                            xVar2.e7();
                            android.view.View view = f76.f362606d;
                            if (view != null) {
                                zl2.r4.f555483a.Q2(view);
                            }
                            android.view.ViewGroup viewGroup2 = xVar2.f362724w;
                            if (viewGroup2 != null) {
                                viewGroup2.addView(f76.f362606d);
                            }
                            android.view.View view2 = f76.f362606d;
                            android.view.ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
                            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                            if (marginLayoutParams != null) {
                                marginLayoutParams.topMargin = xVar2.f362722u.f362693a.y;
                            }
                        }
                        f76.c("launchStickerOperationContainer", bitmap);
                        xVar2.d7(false);
                        xVar2.c7(false);
                        f0Var3 = f0Var2;
                    } else {
                        f0Var3 = null;
                    }
                    if (f0Var3 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "launchStickerEditorContainer fail,sticker editor container is null!");
                        xVar2.m7("launchLiveStickerEditorContainer fail");
                    }
                    xVar.u7(true);
                } else {
                    f0Var2 = f0Var4;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "showStickerOperation but prepare container fail!");
                    xVar.n7("showStickerOperation");
                }
            }
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Common", "single click task run fail,controller:" + weakReference.get() + ",locationInfoWrapper:" + weakReference2.get());
        }
    }
}
