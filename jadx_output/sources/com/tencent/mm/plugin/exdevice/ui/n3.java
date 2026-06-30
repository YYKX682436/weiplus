package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public final class n3 extends android.widget.BaseAdapter implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f99581d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f99582e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f99583f;

    /* renamed from: g, reason: collision with root package name */
    public final o11.g f99584g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View.OnClickListener f99585h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f99586i = null;

    /* renamed from: m, reason: collision with root package name */
    public volatile int f99587m = -1;

    public n3(android.content.Context context, java.lang.String str) {
        this.f99583f = new java.lang.ref.WeakReference(context);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f99581d = linkedList;
        android.view.LayoutInflater.from(context);
        new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
        new java.util.ArrayList();
        new java.util.ArrayList();
        o11.f fVar = new o11.f();
        fVar.f342091o = com.tencent.mm.R.drawable.f481413bi1;
        this.f99584g = fVar.a();
        this.f99585h = new com.tencent.mm.plugin.exdevice.ui.j3(this);
        java.util.List f17 = com.tencent.mm.plugin.exdevice.model.l3.Ui().f1();
        linkedList.clear();
        if (((java.util.LinkedList) f17).size() == 0) {
            return;
        }
        linkedList.addAll(f17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.LinkedList) this.f99581d).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (v32.b) ((java.util.LinkedList) this.f99581d).get(i17);
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.exdevice.ui.n3.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceManageDeviceUI", "scene is null.");
            return;
        }
        if (m1Var instanceof com.tencent.mm.plugin.exdevice.model.r2) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f99586i;
            if (u3Var != null && u3Var.isShowing()) {
                this.f99586i.dismiss();
            }
            if (i17 != 0 || i18 != 0 || this.f99587m < 0 || this.f99587m >= ((java.util.LinkedList) this.f99581d).size()) {
                return;
            }
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.exdevice.ui.l3(this));
        }
    }
}
