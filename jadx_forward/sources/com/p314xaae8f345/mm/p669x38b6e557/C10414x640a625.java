package com.p314xaae8f345.mm.p669x38b6e557;

/* renamed from: com.tencent.mm.console.p0$$e */
/* loaded from: classes10.dex */
public final /* synthetic */ class C10414x640a625 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public final void a(android.content.Intent intent) {
        if (z65.c.a()) {
            ak0.a aVar = ak0.o.f87075a;
            java.lang.String stringExtra = intent.getStringExtra("lib_path");
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = ak0.j.f87071a;
            boolean z17 = ak0.x.f87081k;
            java.io.File m104679xac1dbbfb = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104679xac1dbbfb(ak0.o.a());
            if (m104679xac1dbbfb == null) {
                return;
            }
            java.lang.String str = m104679xac1dbbfb.getAbsolutePath() + "/debug_lib";
            if (stringExtra == null || stringExtra.isEmpty()) {
                return;
            }
            com.p314xaae8f345.mm.vfs.w6.c(stringExtra, str + "/" + stringExtra.substring(stringExtra.lastIndexOf("/") + 1));
        }
    }
}
