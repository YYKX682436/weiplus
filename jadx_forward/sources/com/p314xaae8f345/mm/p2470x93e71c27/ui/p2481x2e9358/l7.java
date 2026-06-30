package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public final class l7 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.kb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 f271996a;

    public l7(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 c8Var) {
        this.f271996a = c8Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.kb
    public void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatFooterKt", "fullTextWetypeGuideHolder onclick, hasRed:" + z17);
        u35.c cVar = u35.c.f505967a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 c8Var = this.f271996a;
        if (z17) {
            cVar.b(9, c8Var.f271753b.m75444x92b2a53() != null ? c8Var.e() : null, c8Var.f271777z, c8Var.j().b());
        } else {
            cVar.b(7, c8Var.f271753b.m75444x92b2a53() != null ? c8Var.e() : null, c8Var.f271777z, c8Var.j().b());
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.kb
    public void b(boolean z17) {
        i45.j jVar = i45.j.f369948a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_wetype").putLong("mmkv_key_full_text_config_insert_last_time", c01.id.a());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_wetype").putLong("mmkv_key_full_text_config_insert_count", com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_wetype").getLong("mmkv_key_full_text_config_insert_count", 0L) + 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatFooterKt", "fullTextWetypeGuideHolder onExposure, hasRed:" + z17);
        u35.c cVar = u35.c.f505967a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 c8Var = this.f271996a;
        if (z17) {
            cVar.b(8, c8Var.f271753b.m75444x92b2a53() != null ? c8Var.e() : null, c8Var.f271777z, c8Var.j().b());
        } else {
            cVar.b(6, c8Var.f271753b.m75444x92b2a53() != null ? c8Var.e() : null, c8Var.f271777z, c8Var.j().b());
        }
    }
}
