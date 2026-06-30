package com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a;

/* renamed from: com.tencent.mm.pluginsdk.event.IListenerMStorage */
/* loaded from: classes8.dex */
public abstract class AbstractC19580xf92ebc8b extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5698x856dce83> {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f270228d;

    public AbstractC19580xf92ebc8b() {
        super(com.p314xaae8f345.mm.app.a0.f134821d);
        this.f270228d = new java.util.ArrayList(3);
        this.f39173x3fe91575 = -400127373;
    }

    public static void d(java.lang.String str, com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b abstractC19580xf92ebc8b) {
        if (!abstractC19580xf92ebc8b.f270228d.contains(str)) {
            abstractC19580xf92ebc8b.f270228d.add(str);
        }
        abstractC19580xf92ebc8b.mo48813x58998cd();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6145xda761019 c6145xda761019 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6145xda761019();
        am.fy fyVar = c6145xda761019.f136407g;
        fyVar.f88245a = 1;
        fyVar.f88246b = str;
        c6145xda761019.e();
    }

    public static void e(java.lang.String str, com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b abstractC19580xf92ebc8b) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6145xda761019 c6145xda761019 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6145xda761019();
        am.fy fyVar = c6145xda761019.f136407g;
        fyVar.f88245a = 2;
        fyVar.f88246b = str;
        c6145xda761019.e();
        abstractC19580xf92ebc8b.mo48814x2efc64();
        java.util.ArrayList arrayList = abstractC19580xf92ebc8b.f270228d;
        if (arrayList.contains(str)) {
            arrayList.remove(str);
        }
    }

    public abstract void c(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1);

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5698x856dce83 c5698x856dce83) {
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5698x856dce83 c5698x856dce832 = c5698x856dce83;
        if (!(c5698x856dce832 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5698x856dce83) || (abstractC20979x809547d1 = c5698x856dce832.f136022g.f88884a) == null || !this.f270228d.contains(abstractC20979x809547d1.getClass().getName())) {
            return false;
        }
        c(c5698x856dce832.f136022g.f88884a);
        return false;
    }
}
