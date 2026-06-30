package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

@mk0.a
/* loaded from: classes.dex */
class k0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private k0() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        ew4.a a17 = ew4.c.c().a(bundle.getString("appId"), bundle.getString("key"));
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("value", a17.f67269x29f571ec);
        bundle2.putString("weight", a17.f67270x16a4715d);
        bundle2.putLong("expireTime", a17.f67265x876650f1 - (java.lang.System.currentTimeMillis() / 1000));
        bundle2.putString(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207, a17.f67266x52c1c682);
        rVar.a(bundle2);
    }
}
