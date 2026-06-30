package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb;

/* renamed from: com.tencent.qqmusic.mediaplayer.upstream.DefaultNativeDataSource */
/* loaded from: classes7.dex */
public class C25435xa2ee81d implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25441x92a45 {

    /* renamed from: audioType */
    private final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType f46128xb37c430;

    /* renamed from: nativeInstance */
    private final long f46129x390941cc;

    public C25435xa2ee81d(long j17, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType audioType) {
        this.f46129x390941cc = j17;
        this.f46128xb37c430 = audioType;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25441x92a45
    /* renamed from: getAudioType */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType mo94302xaa5357a() {
        return this.f46128xb37c430;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25441x92a45
    /* renamed from: getNativeInstance */
    public long mo94303x27a10ec2() {
        return this.f46129x390941cc;
    }

    /* renamed from: toString */
    public java.lang.String m94304x9616526c() {
        return "DefaultNativeDataSource";
    }
}
