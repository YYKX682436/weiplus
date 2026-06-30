package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb;

/* renamed from: com.tencent.qqmusic.mediaplayer.upstream.DefaultFileDataSourceFactory */
/* loaded from: classes13.dex */
public class C25433xc04bc328 implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25440x33a05b9c {

    /* renamed from: filePath */
    private final java.lang.String f46108xd426afc1;

    public C25433xc04bc328(java.lang.String str) {
        this.f46108xd426afc1 = str;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25440x33a05b9c
    /* renamed from: createDataSource */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e mo93698xb8a7ce81() {
        if (android.text.TextUtils.isEmpty(this.f46108xd426afc1)) {
            throw new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25432x673e7d4a(-5, "filePath is empty!", null);
        }
        return new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25437x56394f21(this.f46108xd426afc1);
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25440x33a05b9c
    /* renamed from: createNativeDataSource */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25441x92a45 mo93699xd6f504f8() {
        return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25445xca96b96e.m94318x91f28301(this.f46108xd426afc1, 0);
    }
}
