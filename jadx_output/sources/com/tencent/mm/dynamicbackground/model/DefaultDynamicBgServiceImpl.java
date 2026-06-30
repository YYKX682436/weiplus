package com.tencent.mm.dynamicbackground.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/dynamicbackground/model/DefaultDynamicBgServiceImpl;", "Llq/c;", "", "isEnableNativeDynamicBackground", "enable", "Ljz5/f0;", "setEnableNativeDynamicBackground", "Landroid/content/Context;", "context", "Landroid/graphics/Point;", "getDisplayRealSize", "loadDynamicBgLibrary", "willCrash", "markWillCrash", "onInitCrash", "onInitStart", "onInitEnd", "isInitCrash", "needMarkDrawPoint", "markDrawStartPoint", "markDrawEndPoint", "", "getSleepTimeInMsPerFrame", "isEnable", "Z", "<init>", "()V", "Companion", "lq/a", "dynamicbg_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes8.dex */
public final class DefaultDynamicBgServiceImpl implements lq.c {
    public static final lq.a Companion = new lq.a(null);
    private static final java.lang.String TAG = "MicroMsg.DefaultDynamicBgServiceImpl";
    private byte _hellAccFlag_;
    private boolean isEnable = true;

    @Override // lq.c
    public android.graphics.Point getDisplayRealSize(android.content.Context context) {
        kotlin.jvm.internal.o.h(context, "context");
        android.graphics.Point point = new android.graphics.Point();
        java.lang.Object systemService = context.getSystemService("window");
        if (systemService == null) {
            throw new jz5.q("null cannot be cast to non-null type android.view.WindowManager");
        }
        ((android.view.WindowManager) systemService).getDefaultDisplay().getRealSize(point);
        return point;
    }

    @Override // lq.c
    public float getSleepTimeInMsPerFrame() {
        return 16.0f;
    }

    @Override // lq.c
    /* renamed from: isEnableNativeDynamicBackground, reason: from getter */
    public boolean getIsEnable() {
        return this.isEnable;
    }

    @Override // lq.b
    public boolean isInitCrash() {
        return false;
    }

    @Override // lq.c
    public void loadDynamicBgLibrary() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("dynamicBg");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/dynamicbackground/model/DefaultDynamicBgServiceImpl", "loadDynamicBgLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/dynamicbackground/model/DefaultDynamicBgServiceImpl", "loadDynamicBgLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    @Override // lq.b
    public void markDrawEndPoint() {
    }

    @Override // lq.b
    public void markDrawStartPoint() {
    }

    @Override // lq.b
    public void markWillCrash() {
    }

    @Override // lq.b
    public boolean needMarkDrawPoint() {
        return false;
    }

    @Override // lq.b
    public void onInitCrash() {
    }

    @Override // lq.b
    public void onInitEnd() {
    }

    public void onInitStart() {
    }

    @Override // lq.c
    public void setEnableNativeDynamicBackground(boolean z17) {
        this.isEnable = z17;
    }

    @Override // lq.b
    public boolean willCrash() {
        return false;
    }
}
