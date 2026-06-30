package com.p314xaae8f345.p457x3304c6.p479x4179489f;

/* loaded from: classes5.dex */
public class g0 extends com.p314xaae8f345.p457x3304c6.p479x4179489f.AbstractC4153x96cfff3a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.x f130030a;

    public g0(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db c4152x8b3cf7db, boolean z17, com.p314xaae8f345.p457x3304c6.p479x4179489f.x xVar) {
        super(c4152x8b3cf7db, z17);
        this.f130030a = xVar;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p479x4179489f.AbstractC4153x96cfff3a
    /* renamed from: onInvoke */
    public void mo34186x48671b37(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db c4152x8b3cf7db, java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4154xf4b72ada.OnHandleBoxSettingsDidChangeArg onHandleBoxSettingsDidChangeArg = (com.p314xaae8f345.p457x3304c6.p479x4179489f.C4154xf4b72ada.OnHandleBoxSettingsDidChangeArg) obj;
        if (this.f130030a == null || onHandleBoxSettingsDidChangeArg == null) {
            return;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4147xcf9233a6 handleBoxSettings = onHandleBoxSettingsDidChangeArg.f16136xe4cdf3c6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handleBoxSettings, "handleBoxSettings");
        handleBoxSettings.m34067x9616526c();
    }
}
