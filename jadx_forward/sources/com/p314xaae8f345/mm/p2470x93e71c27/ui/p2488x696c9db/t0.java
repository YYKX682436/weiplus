package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes9.dex */
public final class t0 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.Adapter f273435d;

    public t0(android.widget.Adapter mAdapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mAdapter, "mAdapter");
        this.f273435d = mAdapter;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3
    /* renamed from: getCount */
    public int mo8143x7444f759() {
        return this.f273435d.getCount();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3
    /* renamed from: getItem */
    public java.lang.Object mo75871xfb80e389(int i17) {
        return this.f273435d.getItem(i17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3
    /* renamed from: getView */
    public android.view.View mo75872xfb86a31b(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        return this.f273435d.getView(i17, view, viewGroup);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3
    public void h(java.lang.Object obj) {
        android.widget.Adapter adapter = this.f273435d;
        if (adapter instanceof android.widget.BaseAdapter) {
            ((android.widget.BaseAdapter) adapter).notifyDataSetChanged();
        }
    }
}
