package gf;

/* loaded from: classes7.dex */
public final class i implements com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe f352625a;

    public i(com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe c3955x2d990bfe) {
        this.f352625a = c3955x2d990bfe;
    }

    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac
    /* renamed from: onDone */
    public void mo95651xc3989e01() {
        com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe c3955x2d990bfe = this.f352625a;
        synchronized (c3955x2d990bfe) {
            while (!c3955x2d990bfe.f129239b.isEmpty()) {
                java.lang.Runnable runnable = (java.lang.Runnable) c3955x2d990bfe.f129239b.pollFirst();
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }
}
