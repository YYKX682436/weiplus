package com.p314xaae8f345.p457x3304c6.p479x4179489f;

/* loaded from: classes5.dex */
public class d0 extends com.p314xaae8f345.p457x3304c6.p479x4179489f.AbstractC4153x96cfff3a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.t f130022a;

    public d0(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db c4152x8b3cf7db, com.p314xaae8f345.p457x3304c6.p479x4179489f.t tVar, boolean z17) {
        super(c4152x8b3cf7db, z17);
        this.f130022a = tVar;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p479x4179489f.AbstractC4153x96cfff3a
    /* renamed from: onInvoke */
    public void mo34186x48671b37(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db c4152x8b3cf7db, java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4154xf4b72ada.MediaTimeChangeArg mediaTimeChangeArg = (com.p314xaae8f345.p457x3304c6.p479x4179489f.C4154xf4b72ada.MediaTimeChangeArg) obj;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.t tVar = this.f130022a;
        if (tVar == null || mediaTimeChangeArg == null) {
            return;
        }
        tVar.mo34663x51a35402(mediaTimeChangeArg.f129931a, mediaTimeChangeArg.f129932b, mediaTimeChangeArg.f129933c);
    }
}
