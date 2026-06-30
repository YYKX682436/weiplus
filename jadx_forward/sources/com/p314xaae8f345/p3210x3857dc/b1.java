package com.p314xaae8f345.p3210x3857dc;

/* loaded from: classes13.dex */
public class b1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 f301745d;

    public b1(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9) {
        this.f301745d = c27816xac2547f9;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9 = this.f301745d;
        android.view.View.OnLongClickListener onLongClickListener = c27816xac2547f9.f301731g;
        if (onLongClickListener != null) {
            return onLongClickListener.onLongClick(c27816xac2547f9);
        }
        return false;
    }
}
