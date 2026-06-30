package com.p314xaae8f345.mm.p676x4c4db2ad.p677x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/dynamicbackground/model/DefaultDynamicBgServiceImpl;", "Llq/c;", "", "isEnableNativeDynamicBackground", "enable", "Ljz5/f0;", "setEnableNativeDynamicBackground", "Landroid/content/Context;", "context", "Landroid/graphics/Point;", "getDisplayRealSize", "loadDynamicBgLibrary", "willCrash", "markWillCrash", "onInitCrash", "onInitStart", "onInitEnd", "isInitCrash", "needMarkDrawPoint", "markDrawStartPoint", "markDrawEndPoint", "", "getSleepTimeInMsPerFrame", "isEnable", "Z", "<init>", "()V", "Companion", "lq/a", "dynamicbg_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.tencent.mm.dynamicbackground.model.DefaultDynamicBgServiceImpl */
/* loaded from: classes8.dex */
public final class C10431x3a69eb2 implements lq.c {

    /* renamed from: Companion */
    public static final lq.a f27834x233c02ec = new lq.a(null);
    private static final java.lang.String TAG = "MicroMsg.DefaultDynamicBgServiceImpl";

    /* renamed from: _hellAccFlag_ */
    private byte f27835x7f11beae;
    private boolean isEnable = true;

    @Override // lq.c
    /* renamed from: getDisplayRealSize */
    public android.graphics.Point mo43630x69e01b6b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(context, "context");
        android.graphics.Point point = new android.graphics.Point();
        java.lang.Object systemService = context.getSystemService("window");
        if (systemService == null) {
            throw new jz5.q("null cannot be cast to non-null type android.view.WindowManager");
        }
        ((android.view.WindowManager) systemService).getDefaultDisplay().getRealSize(point);
        return point;
    }

    @Override // lq.c
    /* renamed from: getSleepTimeInMsPerFrame */
    public float mo43631xe949afc9() {
        return 16.0f;
    }

    @Override // lq.c
    /* renamed from: isEnableNativeDynamicBackground, reason: from getter */
    public boolean getIsEnable() {
        return this.isEnable;
    }

    @Override // lq.b
    /* renamed from: isInitCrash */
    public boolean mo43633x3555fa6d() {
        return false;
    }

    @Override // lq.c
    /* renamed from: loadDynamicBgLibrary */
    public void mo43634xf6645c3d() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("dynamicBg");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/dynamicbackground/model/DefaultDynamicBgServiceImpl", "loadDynamicBgLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/dynamicbackground/model/DefaultDynamicBgServiceImpl", "loadDynamicBgLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    @Override // lq.b
    /* renamed from: markDrawEndPoint */
    public void mo43635x9b4fca46() {
    }

    @Override // lq.b
    /* renamed from: markDrawStartPoint */
    public void mo43636xb23dbadf() {
    }

    @Override // lq.b
    /* renamed from: markWillCrash */
    public void mo43637xec9246a8() {
    }

    @Override // lq.b
    /* renamed from: needMarkDrawPoint */
    public boolean mo43638xe55c1d69() {
        return false;
    }

    @Override // lq.b
    /* renamed from: onInitCrash */
    public void mo43639xed42f558() {
    }

    @Override // lq.b
    /* renamed from: onInitEnd */
    public void mo43640xc3c6d2cc() {
    }

    /* renamed from: onInitStart */
    public void m43641xee255613() {
    }

    @Override // lq.c
    /* renamed from: setEnableNativeDynamicBackground */
    public void mo43642x4875e531(boolean z17) {
        this.isEnable = z17;
    }

    @Override // lq.b
    /* renamed from: willCrash */
    public boolean mo43643x947cd6f5() {
        return false;
    }
}
