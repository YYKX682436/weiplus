package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036;

/* JADX INFO: Access modifiers changed from: package-private */
@mk0.a
/* loaded from: classes8.dex */
public class o1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private o1() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt("action_id");
        java.lang.String string = bundle.getString("preload_url");
        if (i17 == 1) {
            java.lang.Class cls = (java.lang.Class) bundle.getSerializable("webcore_impl_class");
            if (android.text.TextUtils.isEmpty(string) || cls == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1.e(cls, string, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.n1(this, rVar));
            return;
        }
        if (i17 == 2) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1.b();
                return;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1.f(string);
                return;
            }
        }
        if (i17 != 3) {
            return;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putBoolean("preload_success", com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1.d(string));
        bundle2.putBoolean("has_preload", com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1.c(string) != null);
        rVar.a(bundle2);
    }
}
