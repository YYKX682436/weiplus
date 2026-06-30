package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

@j95.b
/* loaded from: classes7.dex */
public final class d8 extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.w {
    public void wi(final android.content.Context activity, final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component, final java.lang.Runnable runnable, final java.lang.Runnable runnable2) {
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.a()) {
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.app.d8$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d8.this.wi(activity, component, runnable, runnable2);
                }
            });
            return;
        }
        jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.o0.f172054a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        if (activity instanceof android.app.Activity) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j0) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.o0.f172054a).mo141623x754a37bb()).c((android.app.Activity) activity, component, "android.permission.WRITE_EXTERNAL_STORAGE", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.n0(runnable, runnable2));
        } else if (runnable2 != null) {
            runnable2.run();
        }
    }
}
