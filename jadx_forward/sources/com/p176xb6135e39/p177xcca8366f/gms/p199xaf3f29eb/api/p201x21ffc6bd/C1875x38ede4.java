package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.zada */
/* loaded from: classes13.dex */
public final class C1875x38ede4<R extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d> extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1764xea3f0ce8<R> implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1759x2ba3aba2<R> {
    private final java.lang.ref.WeakReference zag;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.HandlerC1874x38edde zah;
    private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1761xc5c84baf zaa = null;
    private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1875x38ede4 zab = null;
    private volatile com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1760x48d1c911 zac = null;
    private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074 zad = null;
    private final java.lang.Object zae = new java.lang.Object();
    private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 zaf = null;
    private boolean zai = false;

    public C1875x38ede4(java.lang.ref.WeakReference weakReference) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(weakReference, "GoogleApiClient reference must not be null");
        this.zag = weakReference;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c) weakReference.get();
        this.zah = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.HandlerC1874x38edde(this, abstractC1748xd28d482c != null ? abstractC1748xd28d482c.mo17781x23b2dd47() : android.os.Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaj(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12) {
        synchronized (this.zae) {
            this.zaf = c1763x9432bc12;
            zal(c1763x9432bc12);
        }
    }

    private final void zak() {
        if (this.zaa == null && this.zac == null) {
            return;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c) this.zag.get();
        if (!this.zai && this.zaa != null && abstractC1748xd28d482c != null) {
            abstractC1748xd28d482c.zao(this);
            this.zai = true;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12 = this.zaf;
        if (c1763x9432bc12 != null) {
            zal(c1763x9432bc12);
            return;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074 abstractC1752x4624a074 = this.zad;
        if (abstractC1752x4624a074 != null) {
            abstractC1752x4624a074.mo17818x1deb1484(this);
        }
    }

    private final void zal(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12) {
        synchronized (this.zae) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1761xc5c84baf abstractC1761xc5c84baf = this.zaa;
            if (abstractC1761xc5c84baf != null) {
                ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1875x38ede4) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zab)).zaj((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(abstractC1761xc5c84baf.m17838xee232ab(c1763x9432bc12), "onFailure must not return null"));
            } else if (zam()) {
                ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1760x48d1c911) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zac)).mo17831xee232ab(c1763x9432bc12);
            }
        }
    }

    private final boolean zam() {
        return (this.zac == null || ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c) this.zag.get()) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zan(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d interfaceC1758x91b2b43d) {
        if (interfaceC1758x91b2b43d instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1754x1c628e98) {
            try {
                ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1754x1c628e98) interfaceC1758x91b2b43d).mo17739x41012807();
            } catch (java.lang.RuntimeException unused) {
                "Unable to release ".concat(java.lang.String.valueOf(interfaceC1758x91b2b43d));
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1764xea3f0ce8
    /* renamed from: andFinally */
    public final void mo17859x98df7ac(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1760x48d1c911<? super R> abstractC1760x48d1c911) {
        synchronized (this.zae) {
            boolean z17 = true;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(this.zac == null, "Cannot call andFinally() twice.");
            if (this.zaa != null) {
                z17 = false;
            }
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(z17, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.zac = abstractC1760x48d1c911;
            zak();
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1759x2ba3aba2
    /* renamed from: onResult */
    public final void mo17836x57429edc(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d interfaceC1758x91b2b43d) {
        synchronized (this.zae) {
            if (!interfaceC1758x91b2b43d.mo17538x2fe4f2e8().m17855x6e268779()) {
                zaj(interfaceC1758x91b2b43d.mo17538x2fe4f2e8());
                zan(interfaceC1758x91b2b43d);
            } else if (this.zaa != null) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1863x38edd3.zaa().submit(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.RunnableC1873x38eddd(this, interfaceC1758x91b2b43d));
            } else if (zam()) {
                ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1760x48d1c911) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zac)).mo17832xe05b4124(interfaceC1758x91b2b43d);
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1764xea3f0ce8
    /* renamed from: then */
    public final <S extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d> com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1764xea3f0ce8<S> mo17860x364e1d(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1761xc5c84baf<? super R, ? extends S> abstractC1761xc5c84baf) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1875x38ede4 c1875x38ede4;
        synchronized (this.zae) {
            boolean z17 = true;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(this.zaa == null, "Cannot call then() twice.");
            if (this.zac != null) {
                z17 = false;
            }
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(z17, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.zaa = abstractC1761xc5c84baf;
            c1875x38ede4 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1875x38ede4(this.zag);
            this.zab = c1875x38ede4;
            zak();
        }
        return c1875x38ede4;
    }

    public final void zah() {
        this.zac = null;
    }

    public final void zai(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074 abstractC1752x4624a074) {
        synchronized (this.zae) {
            this.zad = abstractC1752x4624a074;
            zak();
        }
    }
}
