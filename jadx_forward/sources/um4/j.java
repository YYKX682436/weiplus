package um4;

/* loaded from: classes5.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback f510655d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f510656e;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback iLiteAppUICallback, java.util.List list) {
        this.f510655d = iLiteAppUICallback;
        this.f510656e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mf0.g0 g0Var = (mf0.g0) i95.n0.c(mf0.g0.class);
        android.view.View rootView = ((com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) this.f510655d).getRootView();
        ((lf0.h0) g0Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2311xd1075a44.C18767x17aa633e c18767x17aa633e = (com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2311xd1075a44.C18767x17aa633e) rootView.findViewById(com.p314xaae8f345.mm.R.id.ogd);
        if (c18767x17aa633e != null) {
            c18767x17aa633e.m72340x47404227(this.f510656e);
        }
    }
}
