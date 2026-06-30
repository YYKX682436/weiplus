package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class g5 implements rd0.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.h5 f288253a;

    public g5(com.p314xaae8f345.mm.ui.p2690x38b72420.h5 h5Var) {
        this.f288253a = h5Var;
    }

    @Override // rd0.b1
    public void a(java.util.List list) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.h5 h5Var = this.f288253a;
        if (h5Var.f288286n.size() > 0) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (!h5Var.f288286n.contains(((p13.y) list.get(size)).f432720e)) {
                    list.remove(size);
                }
            }
        }
    }
}
