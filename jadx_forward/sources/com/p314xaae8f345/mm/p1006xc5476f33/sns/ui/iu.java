package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class iu implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final int f250975d;

    /* renamed from: e, reason: collision with root package name */
    public int f250976e;

    /* renamed from: f, reason: collision with root package name */
    public final int f250977f;

    /* renamed from: g, reason: collision with root package name */
    public final int f250978g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.ref.WeakReference f250979h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f250980i;

    public iu(int i17, int i18, int i19, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18153xb2f8a3ba c18153xb2f8a3ba) {
        this.f250975d = i17;
        this.f250977f = i18;
        this.f250978g = i19;
        this.f250979h = new java.lang.ref.WeakReference(c18153xb2f8a3ba);
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUIManualScrollCursorTask");
        if (this.f250980i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI.ManualScrollCursorTask", "had run, skip");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUIManualScrollCursorTask");
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f250979h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18153xb2f8a3ba c18153xb2f8a3ba = (weakReference == null || weakReference.get() == null) ? null : (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18153xb2f8a3ba) weakReference.get();
        if (c18153xb2f8a3ba == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI.ManualScrollCursorTask", "scrollview null, skip");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUIManualScrollCursorTask");
            return;
        }
        this.f250980i = true;
        int i17 = this.f250976e - this.f250978g;
        int i18 = this.f250975d;
        int i19 = this.f250977f;
        int i27 = i18 > i17 ? i18 - i17 : i18 <= i19 ? i18 - i19 : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadUI.ManualScrollCursorTask", "run: need scrollDelta:%d, cursorRawY:%d, unableShowTopY:%d, unableShowBottomY:%d, footerBarTopRawY:%d", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f250976e));
        c18153xb2f8a3ba.m70826x437b1eb5(i27);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUIManualScrollCursorTask");
    }
}
