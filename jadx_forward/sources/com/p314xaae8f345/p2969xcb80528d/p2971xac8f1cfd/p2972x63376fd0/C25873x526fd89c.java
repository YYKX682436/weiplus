package com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.p2972x63376fd0;

/* renamed from: com.tencent.tavkit.component.effectchain.VideoMixEffectProxy */
/* loaded from: classes16.dex */
public class C25873x526fd89c implements com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb {

    /* renamed from: effects */
    private java.util.concurrent.CopyOnWriteArrayList<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb> f48931x92b07902 = new java.util.concurrent.CopyOnWriteArrayList<>();

    /* renamed from: filterProxies */
    private final java.util.List<com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.p2972x63376fd0.C25873x526fd89c.FilterProxy> f48932xc3e92cf4 = new java.util.ArrayList();

    /* renamed from: autoCheckEffectRemove */
    private boolean f48930x3c8cf0ae = true;

    /* renamed from: com.tencent.tavkit.component.effectchain.VideoMixEffectProxy$FilterProxy */
    /* loaded from: classes16.dex */
    public static class FilterProxy implements com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb.Filter, com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.InterfaceC25923x5f2d05b7 {

        /* renamed from: filterMap */
        private final java.util.HashMap<java.lang.String, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb.Filter> f48933xcb770ec4;

        /* renamed from: onEffectRemove */
        private boolean f48934x5bd1f8f4;

        /* renamed from: reportSession */
        private final com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25922xcdf81b39 f48935x416042c2;

        private FilterProxy() {
            this.f48933xcb770ec4 = new java.util.HashMap<>();
            this.f48935x416042c2 = new com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25922xcdf81b39();
        }

        /* renamed from: checkRuntimeRelease */
        private void m98534x15803037(java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb> list) {
            if (this.f48934x5bd1f8f4) {
                this.f48934x5bd1f8f4 = false;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb interfaceC25919xc89aa8bb : list) {
                    if (!android.text.TextUtils.isEmpty(interfaceC25919xc89aa8bb.mo98527xc35ea28c())) {
                        arrayList.add(interfaceC25919xc89aa8bb.mo98527xc35ea28c());
                    }
                }
                java.util.Iterator it = new java.util.HashSet(this.f48933xcb770ec4.keySet()).iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    if (!arrayList.contains(str)) {
                        this.f48933xcb770ec4.get(str).mo98538x41012807();
                        this.f48933xcb770ec4.remove(str);
                    }
                }
            }
        }

        /* renamed from: getCacheFilter */
        private com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb.Filter m98535xe44f8464(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb interfaceC25919xc89aa8bb) {
            if (interfaceC25919xc89aa8bb == null || android.text.TextUtils.isEmpty(interfaceC25919xc89aa8bb.mo98527xc35ea28c())) {
                return null;
            }
            java.lang.String mo98527xc35ea28c = interfaceC25919xc89aa8bb.mo98527xc35ea28c();
            if (this.f48933xcb770ec4.containsKey(mo98527xc35ea28c)) {
                return this.f48933xcb770ec4.get(mo98527xc35ea28c);
            }
            com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb.Filter mo98526x44bdab94 = interfaceC25919xc89aa8bb.mo98526x44bdab94();
            this.f48933xcb770ec4.put(mo98527xc35ea28c, mo98526x44bdab94);
            return mo98526x44bdab94;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: notifyOnEffectRemove */
        public void m98536x551d689d() {
            this.f48934x5bd1f8f4 = true;
        }

        @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb.Filter
        /* renamed from: apply */
        public com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 mo98537x58b836e(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb interfaceC25919xc89aa8bb, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25911x10613639 c25911x10613639, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25912xbdf93b84 c25912xbdf93b84) {
            if (!(interfaceC25919xc89aa8bb instanceof com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.p2972x63376fd0.C25873x526fd89c)) {
                return null;
            }
            com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.p2972x63376fd0.C25873x526fd89c c25873x526fd89c = (com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.p2972x63376fd0.C25873x526fd89c) interfaceC25919xc89aa8bb;
            java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb> m98528xd07db4cc = c25873x526fd89c.m98528xd07db4cc();
            if (c25873x526fd89c.m98529x85d8f1a4() || this.f48934x5bd1f8f4) {
                m98534x15803037(m98528xd07db4cc);
            }
            com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 c25859x590b0095 = null;
            for (com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb interfaceC25919xc89aa8bb2 : m98528xd07db4cc) {
                com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb.Filter m98535xe44f8464 = m98535xe44f8464(interfaceC25919xc89aa8bb2);
                if (m98535xe44f8464 != null) {
                    long nanoTime = java.lang.System.nanoTime();
                    java.lang.String mo98523xea5dc5d5 = m98535xe44f8464 instanceof com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.InterfaceC25923x5f2d05b7 ? ((com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.InterfaceC25923x5f2d05b7) m98535xe44f8464).mo98523xea5dc5d5() : null;
                    com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 mo98537x58b836e = m98535xe44f8464.mo98537x58b836e(interfaceC25919xc89aa8bb2, c25911x10613639, c25912xbdf93b84);
                    if (!android.text.TextUtils.isEmpty(mo98523xea5dc5d5)) {
                        this.f48935x416042c2.m98808x36519d(mo98523xea5dc5d5, java.lang.System.nanoTime() - nanoTime);
                    }
                    c25859x590b0095 = mo98537x58b836e;
                }
            }
            return c25859x590b0095;
        }

        @Override // com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.InterfaceC25923x5f2d05b7
        /* renamed from: getReportKey */
        public java.lang.String mo98523xea5dc5d5() {
            return com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25924x5efcedc3.m98815x8ec0291(this.f48933xcb770ec4.values());
        }

        @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb.Filter
        /* renamed from: release */
        public synchronized void mo98538x41012807() {
            java.util.Iterator<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb.Filter> it = this.f48933xcb770ec4.values().iterator();
            while (it.hasNext()) {
                it.next().mo98538x41012807();
            }
            this.f48933xcb770ec4.clear();
            this.f48935x416042c2.m98807xaf3f2937();
        }
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb
    /* renamed from: createFilter */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb.Filter mo98526x44bdab94() {
        com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.p2972x63376fd0.C25873x526fd89c.FilterProxy filterProxy = new com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.p2972x63376fd0.C25873x526fd89c.FilterProxy();
        this.f48932xc3e92cf4.add(filterProxy);
        return filterProxy;
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb
    /* renamed from: effectId */
    public java.lang.String mo98527xc35ea28c() {
        return "VideoMixEffectProxy" + java.lang.Integer.toHexString(hashCode());
    }

    /* renamed from: getEffects */
    public java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb> m98528xd07db4cc() {
        return this.f48931x92b07902;
    }

    /* renamed from: isAutoCheckEffectRemove */
    public boolean m98529x85d8f1a4() {
        return this.f48930x3c8cf0ae;
    }

    /* renamed from: notifyOnEffectRemove */
    public void m98530x551d689d() {
        java.util.Iterator<com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.p2972x63376fd0.C25873x526fd89c.FilterProxy> it = this.f48932xc3e92cf4.iterator();
        while (it.hasNext()) {
            it.next().m98536x551d689d();
        }
    }

    /* renamed from: setAutoCheckEffectRemove */
    public void m98531x184b756c(boolean z17) {
        this.f48930x3c8cf0ae = z17;
    }

    /* renamed from: setEffects */
    public void m98532x43ef0240(java.util.concurrent.CopyOnWriteArrayList<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb> copyOnWriteArrayList) {
        this.f48931x92b07902 = copyOnWriteArrayList;
    }
}
