package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes5.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f224389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f224390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16132x1cb7ea88 f224391f;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16132x1cb7ea88 c16132x1cb7ea88, int i17, int i18) {
        this.f224391f = c16132x1cb7ea88;
        this.f224389d = i17;
        this.f224390e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        int measureText;
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16132x1cb7ea88 c16132x1cb7ea88 = this.f224391f;
        java.lang.String[] strArr = c16132x1cb7ea88.f224102f;
        if (strArr.length > 0 && (measureText = ((int) c16132x1cb7ea88.f224110q.measureText(strArr[strArr.length - 1])) + i65.a.b(c16132x1cb7ea88.getContext(), 8)) > this.f224389d) {
            android.view.ViewGroup.LayoutParams layoutParams = c16132x1cb7ea88.getLayoutParams();
            layoutParams.width = measureText;
            layoutParams.height = this.f224390e;
            c16132x1cb7ea88.setLayoutParams(layoutParams);
        }
    }
}
