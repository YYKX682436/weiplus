package com.tencent.mm.app;

/* loaded from: classes6.dex */
public class c2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f53358d = 0;

    public c2(com.tencent.mm.app.d2 d2Var, com.tencent.mm.app.b2 b2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f53358d < 14;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f53358d;
        this.f53358d = i17 + 1;
        switch (i17) {
            case 0:
                return com.tencent.mm.plugin.appbrand.app.i.INSTANCE;
            case 1:
                return qs.u.INSTANCE;
            case 2:
                return com.tencent.mm.plugin.appbrand.h1.INSTANCE;
            case 3:
                return com.tencent.kinda.framework.widget.tools.KindaStaticActivityLifeCycleCallbacksProvider.INSTANCE;
            case 4:
                return com.tencent.mm.plugin.appbrand.luggage.customize.s.INSTANCE;
            case 5:
                return gt.s3.INSTANCE;
            case 6:
                return com.tencent.mm.feature.performance.z2.INSTANCE;
            case 7:
                return b83.r.INSTANCE;
            case 8:
                return com.tencent.mm.ui.chatting.manager.b.INSTANCE;
            case 9:
                return com.tencent.mm.accessibility.feature.ActivityAccCallbacksProvider.INSTANCE;
            case 10:
                return com.tencent.mm.plugin.appbrand.app.k.INSTANCE;
            case 11:
                return com.tencent.mm.plugin.appbrand.app.t7.INSTANCE;
            case 12:
                return gt.m3.INSTANCE;
            case 13:
                return pd0.o1.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 14");
        }
    }
}
