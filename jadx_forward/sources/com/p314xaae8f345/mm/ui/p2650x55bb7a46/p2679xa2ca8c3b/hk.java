package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class hk implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f285666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ik f285667e;

    public hk(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ik ikVar, android.view.View view) {
        this.f285667e = ikVar;
        this.f285666d = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        android.view.View view = this.f285666d;
        if (view.findViewById(com.p314xaae8f345.mm.R.id.i2h) != null) {
            view.findViewById(com.p314xaae8f345.mm.R.id.i2h).setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562741n7);
        } else if (view.findViewById(com.p314xaae8f345.mm.R.id.f565630d03) != null) {
            view.findViewById(com.p314xaae8f345.mm.R.id.f565630d03).setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562741n7);
        }
        this.f285667e.f285724d.P(true);
    }
}
