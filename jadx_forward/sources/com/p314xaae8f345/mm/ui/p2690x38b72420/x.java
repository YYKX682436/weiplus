package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class x implements db5.b6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment f288774a;

    public x(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment addressUIFragment) {
        this.f288774a = addressUIFragment;
    }

    @Override // db5.b6
    public int a(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment addressUIFragment;
        android.view.View view2 = view;
        while (true) {
            try {
                android.view.View view3 = (android.view.View) view2.getParent();
                addressUIFragment = this.f288774a;
                if (view3 == null || view3.equals(addressUIFragment.f287840o)) {
                    break;
                }
                view2 = view3;
            } catch (java.lang.ClassCastException unused) {
                return -1;
            }
        }
        if (view2.getParent() == null) {
            return -1;
        }
        return addressUIFragment.f287840o.getPositionForView(view);
    }
}
