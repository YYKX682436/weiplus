package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class zd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f211625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 f211626e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f211627f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f211628g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f211629h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f211630i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f211631m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Canvas f211632n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f211633o;

    public zd(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949, r45.mb4 mb4Var, int i17, int i18, java.util.LinkedList linkedList, int i19, android.graphics.Canvas canvas, android.graphics.Bitmap bitmap) {
        this.f211625d = z17;
        this.f211626e = activityC15059x3e98c949;
        this.f211627f = mb4Var;
        this.f211628g = i17;
        this.f211629h = i18;
        this.f211630i = linkedList;
        this.f211631m = i19;
        this.f211632n = canvas;
        this.f211633o = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kk4.b player;
        if (this.f211625d) {
            i95.m c17 = i95.n0.c(bg0.v.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            bg0.v vVar = (bg0.v) c17;
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949.f210201e2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949 = this.f211626e;
            cw2.aa i76 = activityC15059x3e98c949.i7();
            kk4.h hVar = null;
            cw2.w4 w4Var = i76 instanceof cw2.w4 ? (cw2.w4) i76 : null;
            if (w4Var != null && (player = w4Var.f305617a.getPlayer()) != null) {
                hVar = ((kk4.v) player).f390113e;
            }
            r45.mb4 mb4Var = this.f211627f;
            int i18 = this.f211628g;
            int i19 = this.f211629h;
            activityC15059x3e98c949.U = ((b92.u2) vVar).Zi(mb4Var, i18, i19, hVar);
            rm5.k kVar = activityC15059x3e98c949.U;
            if (kVar != null) {
                kVar.mo122876x76500f83(i18, i19);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c9492 = this.f211626e;
        rm5.k kVar2 = activityC15059x3e98c9492.U;
        if (kVar2 != null) {
            java.util.LinkedList linkedList = this.f211630i;
            kVar2.a(linkedList, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.yd(this.f211631m, activityC15059x3e98c9492, linkedList, this.f211627f, this.f211632n, this.f211633o));
        }
    }
}
