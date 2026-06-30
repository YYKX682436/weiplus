package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes7.dex */
public final class f7 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q7 f232663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f232664e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f232665f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.BitmapDrawable f232666g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232667h;

    public f7(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q7 q7Var, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, android.graphics.drawable.BitmapDrawable bitmapDrawable, java.lang.String str) {
        this.f232663d = q7Var;
        this.f232664e = z17;
        this.f232665f = c0Var;
        this.f232666g = bitmapDrawable;
        this.f232667h = str;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        android.graphics.drawable.BitmapDrawable bitmapDrawable;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q7 q7Var = this.f232663d;
        java.lang.String string = q7Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572092yh);
        int color = q7Var.m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m);
        boolean z17 = this.f232664e;
        g4Var.j(101, string, com.p314xaae8f345.mm.R.raw.f79162x2c63d7e8, color, !z17);
        g4Var.j(102, q7Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h4v), com.p314xaae8f345.mm.R.raw.f78691x7ae93edb, 0, !z17);
        g4Var.j(103, q7Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h3u), com.p314xaae8f345.mm.R.raw.f78683x36757420, 0, !z17);
        g4Var.j(104, q7Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h4w), com.p314xaae8f345.mm.R.raw.f81148xa4cc6391, q7Var.m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560029g), !z17);
        if (!this.f232665f.f391645d || (bitmapDrawable = this.f232666g) == null) {
            return;
        }
        g4Var.n(105, this.f232667h, bitmapDrawable, 0);
    }
}
