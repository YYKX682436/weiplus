package com.p314xaae8f345.mm.ui.vas;

/* renamed from: com.tencent.mm.ui.vas.VASActivityJava */
/* loaded from: classes14.dex */
public abstract class AbstractActivityC22581x485d44f9 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity
    public <T extends android.view.View> T findViewById(int i17) {
        if (mo81209x4ef39855()) {
            return (T) super.findViewById(i17);
        }
        T t17 = (T) mo81178x2b42b346(i17);
        int i18 = ih5.c.f373136a;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return t17;
    }

    /* renamed from: findViewByIdInWrapActivity */
    public final <T extends android.view.View> T m81242xaa09384e(int i17) {
        return mo81209x4ef39855() ? (T) super.findViewById(i17) : (T) mo81177x4c4c26a8(i17);
    }

    /* renamed from: findViewByIdInWrapActivityInner */
    public android.view.View mo81177x4c4c26a8(int i17) {
        return null;
    }

    /* renamed from: findViewByIdInner */
    public android.view.View mo81178x2b42b346(int i17) {
        return null;
    }

    /* renamed from: isCallFindViewSuper */
    public boolean mo81209x4ef39855() {
        return true;
    }
}
