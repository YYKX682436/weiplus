package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes9.dex */
public class j2 implements i11.c {
    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        if (z17) {
            com.p314xaae8f345.mm.p642xad8b531f.m2.f144970b = f18;
            com.p314xaae8f345.mm.p642xad8b531f.m2.f144971c = f17;
            com.p314xaae8f345.mm.p642xad8b531f.m2.f144972d = true;
            i11.e eVar = com.p314xaae8f345.mm.p642xad8b531f.m2.f144969a;
            if (eVar != null) {
                ((i11.h) eVar).m(com.p314xaae8f345.mm.p642xad8b531f.m2.f144976h);
                com.p314xaae8f345.mm.p642xad8b531f.m2.f144972d = false;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PostTaskStartRangeForIBeacon", "getLocation fail");
        }
        return false;
    }
}
