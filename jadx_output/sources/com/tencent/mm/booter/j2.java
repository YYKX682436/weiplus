package com.tencent.mm.booter;

/* loaded from: classes9.dex */
public class j2 implements i11.c {
    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        if (z17) {
            com.tencent.mm.booter.m2.f63437b = f18;
            com.tencent.mm.booter.m2.f63438c = f17;
            com.tencent.mm.booter.m2.f63439d = true;
            i11.e eVar = com.tencent.mm.booter.m2.f63436a;
            if (eVar != null) {
                ((i11.h) eVar).m(com.tencent.mm.booter.m2.f63443h);
                com.tencent.mm.booter.m2.f63439d = false;
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.PostTaskStartRangeForIBeacon", "getLocation fail");
        }
        return false;
    }
}
