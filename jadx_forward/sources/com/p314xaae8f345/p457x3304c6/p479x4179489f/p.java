package com.p314xaae8f345.p457x3304c6.p479x4179489f;

/* loaded from: classes5.dex */
public class p extends com.p314xaae8f345.p457x3304c6.p479x4179489f.AbstractC4144xc797d553 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.k f130051a;

    public p(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4143xe6876422 c4143xe6876422, com.p314xaae8f345.p457x3304c6.p479x4179489f.k kVar) {
        super(c4143xe6876422);
        this.f130051a = kVar;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p479x4179489f.AbstractC4144xc797d553
    /* renamed from: onInvoke */
    public void mo34065x48671b37(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4143xe6876422 c4143xe6876422, java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4145xd4dfbdcc.OnExportCompleteArgs onExportCompleteArgs = (com.p314xaae8f345.p457x3304c6.p479x4179489f.C4145xd4dfbdcc.OnExportCompleteArgs) obj;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.k kVar = this.f130051a;
        if (kVar == null || onExportCompleteArgs == null) {
            return;
        }
        kVar.a(onExportCompleteArgs.f16122x5b9b5c43, onExportCompleteArgs.f16124xb6191964, onExportCompleteArgs.f16123x5c4d208);
    }
}
