package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class e3 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public static zy2.i5 f183649d;

    public e3() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5475xa9aba8a7 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5475xa9aba8a7) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createResultEvent callback :");
        am.kb kbVar = event.f135813g;
        sb6.append(kbVar != null ? 0 : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CreateAccountStarter", sb6.toString());
        zy2.i5 i5Var = f183649d;
        if (i5Var != null) {
            java.lang.String str = kbVar != null ? kbVar.f88670a : null;
            if (str == null) {
                str = "";
            }
            i5Var.a(new jz5.l(0, str));
        }
        f183649d = null;
        return true;
    }
}
