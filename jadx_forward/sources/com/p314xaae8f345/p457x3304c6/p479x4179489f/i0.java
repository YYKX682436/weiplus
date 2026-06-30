package com.p314xaae8f345.p457x3304c6.p479x4179489f;

/* loaded from: classes5.dex */
public class i0 extends com.p314xaae8f345.p457x3304c6.p479x4179489f.AbstractC4153x96cfff3a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.a0 f130039a;

    public i0(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db c4152x8b3cf7db, com.p314xaae8f345.p457x3304c6.p479x4179489f.a0 a0Var, boolean z17) {
        super(c4152x8b3cf7db, z17);
        this.f130039a = a0Var;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p479x4179489f.AbstractC4153x96cfff3a
    /* renamed from: onInvoke */
    public void mo34186x48671b37(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db c4152x8b3cf7db, java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4154xf4b72ada.OnPlaybackFailArgs onPlaybackFailArgs = (com.p314xaae8f345.p457x3304c6.p479x4179489f.C4154xf4b72ada.OnPlaybackFailArgs) obj;
        if (this.f130039a != null) {
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b = onPlaybackFailArgs.f16137x5c4d208;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieComp.PlaybackControlUIC", "playbackSession fail");
        }
    }
}
