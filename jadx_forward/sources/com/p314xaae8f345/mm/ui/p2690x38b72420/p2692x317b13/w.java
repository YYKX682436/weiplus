package com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13;

/* loaded from: classes11.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.s f288472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f288473e;

    public w(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.z zVar, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.s sVar, android.content.Context context) {
        this.f288472d = sVar;
        this.f288473e = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.s sVar = this.f288472d;
        int top = sVar.f288459d.getTop() - sVar.f288458c.getBottom();
        android.content.Context context = this.f288473e;
        int b17 = top - i65.a.b(context, 4);
        if (b17 < 0) {
            b17 = 0;
        }
        if (sVar.f288459d.getTop() - sVar.f288458c.getBottom() == i65.a.b(context, 4)) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) sVar.f288459d.getLayoutParams();
        layoutParams.topMargin = -b17;
        sVar.f288459d.setLayoutParams(layoutParams);
    }
}
