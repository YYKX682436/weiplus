package com.tencent.mm.plugin.choosemsgfile.logic.ui;

/* loaded from: classes12.dex */
public class u extends com.tencent.mm.plugin.choosemsgfile.logic.ui.b {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.choosemsgfile.logic.ui.c f95561d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f95562e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.GridLayoutManager f95563f;

    /* renamed from: g, reason: collision with root package name */
    public int f95564g;

    /* renamed from: h, reason: collision with root package name */
    public int f95565h;

    public u(com.tencent.mm.plugin.choosemsgfile.ui.f0 f0Var) {
        super(f0Var);
        this.f95564g = 0;
        this.f95565h = 0;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f95562e = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GalleryPhotoInfoEvent>(a0Var) { // from class: com.tencent.mm.plugin.choosemsgfile.logic.ui.ChooseMsgFileUIController$1
            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.GalleryPhotoInfoEvent galleryPhotoInfoEvent) {
                android.view.View childAt;
                com.tencent.mm.autogen.events.GalleryPhotoInfoEvent galleryPhotoInfoEvent2 = galleryPhotoInfoEvent;
                long j17 = galleryPhotoInfoEvent2.f54355g.f6947c;
                com.tencent.mm.plugin.choosemsgfile.logic.ui.u uVar = com.tencent.mm.plugin.choosemsgfile.logic.ui.u.this;
                java.util.Iterator it = uVar.f95561d.f95524e.iterator();
                int i17 = -1;
                int i18 = -1;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    i18++;
                    com.tencent.mm.storage.f9 f9Var = ((wv1.a) it.next()).f449930b;
                    if (f9Var != null && f9Var.getMsgId() == j17) {
                        i17 = i18;
                        break;
                    }
                }
                com.tencent.mm.plugin.choosemsgfile.ui.f0 f0Var2 = uVar.f95528b;
                androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = (androidx.recyclerview.widget.GridLayoutManager) uVar.b(f0Var2.getContext());
                int w17 = gridLayoutManager.w();
                int y17 = gridLayoutManager.y();
                com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileUIController", "[getPhotoInfo] msgId:%s pos:%s [%s:%s]", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(w17), java.lang.Integer.valueOf(y17));
                if (i17 >= w17 && i17 <= y17 && (childAt = f0Var2.getChildAt(i17 - w17)) != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    int i19 = iArr[0];
                    am.je jeVar = galleryPhotoInfoEvent2.f54356h;
                    jeVar.f7027a = i19;
                    jeVar.f7028b = iArr[1];
                    jeVar.f7029c = childAt.getWidth();
                    jeVar.f7030d = childAt.getHeight();
                }
                return false;
            }
        };
    }

    public static xv1.b a(com.tencent.mm.plugin.choosemsgfile.logic.ui.u uVar) {
        return uVar.f95528b.f6();
    }

    public androidx.recyclerview.widget.RecyclerView.LayoutManager b(android.content.Context context) {
        if (this.f95563f == null) {
            androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(context, 4);
            this.f95563f = gridLayoutManager;
            gridLayoutManager.B = new com.tencent.mm.plugin.choosemsgfile.logic.ui.q(this);
        }
        return this.f95563f;
    }

    public void c(boolean z17, java.lang.String str, java.lang.String str2) {
        if (z17) {
            this.f95529c.clear();
            this.f95564g = 0;
        }
        this.f95561d.f95530h = true;
        this.f95528b.P(z17);
        gm0.j1.i();
        gm0.j1.e().j(new com.tencent.mm.plugin.choosemsgfile.logic.ui.t(this, str, str2, z17));
    }
}
