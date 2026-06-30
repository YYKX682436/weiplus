package gf;

/* loaded from: classes7.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe f352595d;

    public g(com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe c3955x2d990bfe) {
        this.f352595d = c3955x2d990bfe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe c3955x2d990bfe = this.f352595d;
        com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3 = c3955x2d990bfe.f129241d;
        if (c25587x226dda3 != null) {
            c25587x226dda3.mo95667x46923104();
            c25587x226dda3.mo95677x41012807();
        }
        c3955x2d990bfe.f129241d = null;
    }
}
