package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 $2\u00020\u0001:\u0002%\u001dB\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J%\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0010\u001a\u00020\u000f\"\b\b\u0000\u0010\u0007*\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bJ\u0006\u0010\u0012\u001a\u00020\u0011R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomControllerStore;", "Lpf5/f;", "Landroidx/lifecycle/l1;", "getViewModelStore", "Ljz5/f0;", "clear", "Landroidx/lifecycle/c1;", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, "Ljava/lang/Class;", "bu", "business", "(Ljava/lang/Class;)Landroidx/lifecycle/c1;", "Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomController;", "controller", "(Ljava/lang/Class;)Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomController;", "", "getKey", "", "hasInitialized", "Lgk2/e;", "liveRoomData", "Lgk2/e;", "getLiveRoomData", "()Lgk2/e;", "Ljava/util/HashSet;", "controllers", "Ljava/util/HashSet;", "getControllers", "()Ljava/util/HashSet;", "Lif2/c0;", "storeMap", "Lif2/c0;", "viewModel", "Landroidx/lifecycle/l1;", "<init>", "(Lgk2/e;)V", "Companion", "if2/b0", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore */
/* loaded from: classes3.dex */
public final class C14197x319b1b9e implements pf5.f {

    /* renamed from: Companion */
    public static final if2.b0 f35780x233c02ec = new if2.b0(null);
    private static final java.lang.String TAG = "Finder.LiveRoomControllerStore";
    private final java.util.HashSet<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703> controllers;
    private final gk2.e liveRoomData;
    private final if2.c0 storeMap;
    private final p012xc85e97e9.p093xedfae76a.l1 viewModel;

    public C14197x319b1b9e(gk2.e liveRoomData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveRoomData, "liveRoomData");
        this.liveRoomData = liveRoomData;
        this.controllers = new java.util.HashSet<>();
        if2.c0 c0Var = new if2.c0(hashCode());
        this.storeMap = c0Var;
        p012xc85e97e9.p093xedfae76a.l1 l1Var = new p012xc85e97e9.p093xedfae76a.l1();
        this.viewModel = l1Var;
        java.lang.String str = TAG;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "init " + hashCode() + " check map " + c0Var);
        java.lang.reflect.Field declaredField = p012xc85e97e9.p093xedfae76a.l1.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        java.lang.Object obj = declaredField.get(l1Var);
        declaredField.set(l1Var, c0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "init check map srcMap1:" + obj.hashCode() + " srcMap2:" + declaredField.get(l1Var).hashCode() + " storeMap:" + c0Var.hashCode());
    }

    /* renamed from: business */
    public final <T extends p012xc85e97e9.p093xedfae76a.c1> T m56796xbba4bfc0(java.lang.Class<T> bu6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bu6, "bu");
        return (T) this.liveRoomData.a(bu6);
    }

    /* renamed from: clear */
    public final void m56797x5a5b64d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "clear " + this.storeMap.size() + ", " + this.controllers.size());
        try {
            java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703> linkedList = new java.util.LinkedList();
            java.util.Iterator<T> it = this.controllers.iterator();
            while (it.hasNext()) {
                linkedList.add((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703) it.next());
            }
            this.controllers.clear();
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703 abstractC14196xf9d9d703 : linkedList) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[clear] " + abstractC14196xf9d9d703.hashCode());
                abstractC14196xf9d9d703.mo14860x9606ce3f();
            }
            this.storeMap.clear();
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "LiveRoomControllerStore clear");
        }
    }

    /* renamed from: controller */
    public final <T extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703> T m56798x25fe639c(java.lang.Class<T> bu6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bu6, "bu");
        java.lang.String m56800xb5884f29 = m56800xb5884f29(bu6);
        if (this.storeMap.containsKey(m56800xb5884f29)) {
            f35780x233c02ec.getClass();
            return (T) new p012xc85e97e9.p093xedfae76a.j1(getViewModel(), new if2.a0(this)).b(m56800xb5884f29, bu6);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "get controller but not exist, key:" + m56800xb5884f29);
        return null;
    }

    /* renamed from: getControllers */
    public final java.util.HashSet<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703> m56799x73a45721() {
        return this.controllers;
    }

    /* renamed from: getKey */
    public final <T extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703> java.lang.String m56800xb5884f29(java.lang.Class<T> bu6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bu6, "bu");
        java.lang.String canonicalName = bu6.getCanonicalName();
        if (canonicalName == null || canonicalName.length() == 0) {
            pm0.z.b(xy2.b.f539688b, "LiveRoomController_getKey_invalid", false, null, null, false, false, null, 124, null);
        }
        return "LiveRoomControllerStore:" + canonicalName;
    }

    public final gk2.e getLiveRoomData() {
        return this.liveRoomData;
    }

    @Override // p012xc85e97e9.p093xedfae76a.m1
    /* renamed from: getViewModelStore, reason: from getter */
    public p012xc85e97e9.p093xedfae76a.l1 getViewModel() {
        return this.viewModel;
    }

    /* renamed from: hasInitialized */
    public final boolean m56802x4383f7da() {
        return !this.storeMap.isEmpty();
    }
}
