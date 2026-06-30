package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002;

/* JADX INFO: Access modifiers changed from: package-private */
@mk0.a
/* loaded from: classes5.dex */
public class h implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private h() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt("action_id");
        if (i17 == 1) {
            ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.f220944c).add(bundle.getString("action_param"));
        } else {
            if (i17 != 2) {
                return;
            }
            ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.f220944c).remove(bundle.getString("action_param"));
        }
    }
}
