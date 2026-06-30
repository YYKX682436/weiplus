package oy2;

/* loaded from: classes8.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.C15501xbb059f5 f431468d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.C15501xbb059f5 c15501xbb059f5) {
        this.f431468d = c15501xbb059f5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oy2.m dialog = this.f431468d.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
