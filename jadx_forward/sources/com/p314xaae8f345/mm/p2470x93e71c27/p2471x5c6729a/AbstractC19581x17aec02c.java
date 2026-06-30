package com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a;

/* renamed from: com.tencent.mm.pluginsdk.event.IListenerNetScene */
/* loaded from: classes11.dex */
public abstract class AbstractC19581x17aec02c extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5735xa11db20a> {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f270229d;

    public AbstractC19581x17aec02c(int i17) {
        super(com.p314xaae8f345.mm.app.a0.f134821d, i17);
        this.f270229d = new java.util.ArrayList(3);
        this.f39173x3fe91575 = 949432826;
    }

    public abstract void c(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1);

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5735xa11db20a c5735xa11db20a) {
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5735xa11db20a c5735xa11db20a2 = c5735xa11db20a;
        if (!(c5735xa11db20a2 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5735xa11db20a) || (abstractC20979x809547d1 = c5735xa11db20a2.f136058g.f89828d) == null || !this.f270229d.contains(abstractC20979x809547d1.getClass().getName())) {
            return false;
        }
        am.wk wkVar = c5735xa11db20a2.f136058g;
        c(wkVar.f89825a, wkVar.f89826b, wkVar.f89827c, wkVar.f89828d);
        return false;
    }
}
