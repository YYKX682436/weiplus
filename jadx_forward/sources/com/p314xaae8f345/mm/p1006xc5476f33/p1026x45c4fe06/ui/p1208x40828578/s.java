package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public class s implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f171680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 f171681e;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 c12723x5ab2de90, java.lang.Runnable runnable) {
        this.f171681e = c12723x5ab2de90;
        this.f171680d = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f171681e.E.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f171680d.run();
        return false;
    }
}
