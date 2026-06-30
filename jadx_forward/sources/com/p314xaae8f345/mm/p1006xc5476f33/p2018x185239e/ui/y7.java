package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes.dex */
public final class y7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f239589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f239590e;

    public y7(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352) {
        this.f239589d = c22621x7603e017;
        this.f239590e = c22699x3dcdb352;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f239589d;
        c22621x7603e017.requestFocus();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f239590e;
        if (c22699x3dcdb352.isShown()) {
            android.view.ViewGroup.LayoutParams layoutParams = c22699x3dcdb352.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
            if (c22621x7603e017.getLineCount() <= 1 && layoutParams2.gravity != 16) {
                layoutParams2.gravity = 16;
                c22699x3dcdb352.setLayoutParams(layoutParams2);
            } else {
                if (c22621x7603e017.getLineCount() <= 1 || layoutParams2.gravity <= 0) {
                    return;
                }
                layoutParams2.gravity = 0;
                c22699x3dcdb352.setLayoutParams(layoutParams2);
            }
        }
    }
}
