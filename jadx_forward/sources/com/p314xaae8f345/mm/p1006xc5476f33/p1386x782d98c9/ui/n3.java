package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes13.dex */
public final class n3 extends android.widget.BaseAdapter implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f181114d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f181115e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f181116f;

    /* renamed from: g, reason: collision with root package name */
    public final o11.g f181117g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View.OnClickListener f181118h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f181119i = null;

    /* renamed from: m, reason: collision with root package name */
    public volatile int f181120m = -1;

    public n3(android.content.Context context, java.lang.String str) {
        this.f181116f = new java.lang.ref.WeakReference(context);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f181114d = linkedList;
        android.view.LayoutInflater.from(context);
        new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
        new java.util.ArrayList();
        new java.util.ArrayList();
        o11.f fVar = new o11.f();
        fVar.f423624o = com.p314xaae8f345.mm.R.C30861xcebc809e.f562946bi1;
        this.f181117g = fVar.a();
        this.f181118h = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.j3(this);
        java.util.List f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ui().f1();
        linkedList.clear();
        if (((java.util.LinkedList) f17).size() == 0) {
            return;
        }
        linkedList.addAll(f17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.LinkedList) this.f181114d).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (v32.b) ((java.util.LinkedList) this.f181114d).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0085, code lost:
    
        if (r3 == null) goto L21;
     */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r22, android.view.View r23, android.view.ViewGroup r24) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.n3.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceManageDeviceUI", "scene is null.");
            return;
        }
        if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.r2) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f181119i;
            if (u3Var != null && u3Var.isShowing()) {
                this.f181119i.dismiss();
            }
            if (i17 != 0 || i18 != 0 || this.f181120m < 0 || this.f181120m >= ((java.util.LinkedList) this.f181114d).size()) {
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.l3(this));
        }
    }
}
