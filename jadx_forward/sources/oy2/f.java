package oy2;

/* loaded from: classes8.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.C15502x550b5136 f431487d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.C15502x550b5136 c15502x550b5136) {
        this.f431487d = c15502x550b5136;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oy2.m dialog = this.f431487d.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
