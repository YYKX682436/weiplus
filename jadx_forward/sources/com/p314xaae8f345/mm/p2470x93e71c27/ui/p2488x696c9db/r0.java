package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes10.dex */
public final class r0 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r3 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3 {

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3 f273391g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(android.util.SparseArray headerViews, android.util.SparseArray footerViews, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 innerAdapter, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3 chatInnerAdapter) {
        super(headerViews, footerViews, innerAdapter);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerViews, "headerViews");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(footerViews, "footerViews");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(innerAdapter, "innerAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatInnerAdapter, "chatInnerAdapter");
        this.f273391g = chatInnerAdapter;
        innerAdapter.mo8163xed962dec(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q0(this));
        mo8164xbbdced85(innerAdapter.m8145x24a16003());
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3
    /* renamed from: getItem */
    public java.lang.Object mo75871xfb80e389(int i17) {
        if ((i17 < y()) || z(i17)) {
            return null;
        }
        return this.f273391g.mo75871xfb80e389(i17 - y());
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        if ((i17 < y()) || z(i17)) {
            return -1L;
        }
        return this.f273396f.mo7906x1ed62e84(i17 - y());
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3
    /* renamed from: getView */
    public android.view.View mo75872xfb86a31b(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        if (i17 < y()) {
            return (android.view.View) this.f273394d.get(mo863xcdaf1228(i17));
        }
        if (z(i17)) {
            return (android.view.View) this.f273395e.get(mo863xcdaf1228(i17));
        }
        return this.f273391g.mo75872xfb86a31b(i17 - y(), view, viewGroup);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3
    public void h(java.lang.Object obj) {
        this.f273391g.h(obj);
    }
}
