package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class p3 implements android.view.ViewStub.OnInflateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q3 f282795a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f282796b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f282797c;

    public p3(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q3 q3Var, int i17, android.view.View view) {
        this.f282795a = q3Var;
        this.f282796b = i17;
        this.f282797c = view;
    }

    @Override // android.view.ViewStub.OnInflateListener
    public final void onInflate(android.view.ViewStub viewStub, android.view.View view) {
        fq.d a17 = fq.d.a(view);
        final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q3 q3Var = this.f282795a;
        android.util.SparseArray sparseArray = q3Var.f282825a;
        p3321xbce91901.jvm.p3324x21ffc6bd.s sVar = new p3321xbce91901.jvm.p3324x21ffc6bd.s(q3Var) { // from class: com.tencent.mm.ui.chatting.gallery.o3
            @Override // p3321xbce91901.jvm.p3324x21ffc6bd.s, f06.s
            public java.lang.Object get() {
                return java.lang.Boolean.valueOf(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q3) this.f72685xcfcbe9ef).f282829e);
            }
        };
        int i17 = this.f282796b;
        sparseArray.put(i17, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g4(a17, i17, this.f282797c, sVar));
    }
}
