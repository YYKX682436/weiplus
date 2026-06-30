package com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.p2972x63376fd0;

/* renamed from: com.tencent.tavkit.component.effectchain.VideoEffectProxy */
/* loaded from: classes16.dex */
public class C25872x11f44002 implements com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 {

    /* renamed from: effects */
    private java.util.concurrent.CopyOnWriteArrayList<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3> f48925x92b07902 = new java.util.concurrent.CopyOnWriteArrayList<>();

    /* renamed from: filterProxies */
    private final java.util.List<com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.p2972x63376fd0.C25872x11f44002.FilterProxy> f48926xc3e92cf4 = new java.util.ArrayList();

    /* renamed from: autoCheckEffectRemove */
    private boolean f48924x3c8cf0ae = true;

    /* renamed from: com.tencent.tavkit.component.effectchain.VideoEffectProxy$FilterProxy */
    /* loaded from: classes16.dex */
    public static class FilterProxy implements com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3.Filter, com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.InterfaceC25923x5f2d05b7 {

        /* renamed from: filterMap */
        private final java.util.HashMap<java.lang.String, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3.Filter> f48927xcb770ec4;

        /* renamed from: onEffectRemove */
        private boolean f48928x5bd1f8f4;

        /* renamed from: reportSession */
        private final com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25922xcdf81b39 f48929x416042c2;

        private FilterProxy() {
            this.f48927xcb770ec4 = new java.util.HashMap<>();
            this.f48929x416042c2 = new com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25922xcdf81b39();
        }

        /* renamed from: checkRuntimeRelease */
        private void m98520x15803037(java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3> list) {
            this.f48928x5bd1f8f4 = false;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 interfaceC25918xca9d36a3 : list) {
                if (!android.text.TextUtils.isEmpty(interfaceC25918xca9d36a3.mo98514xc35ea28c())) {
                    arrayList.add(interfaceC25918xca9d36a3.mo98514xc35ea28c());
                }
            }
            java.util.Iterator it = new java.util.HashSet(this.f48927xcb770ec4.keySet()).iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (!arrayList.contains(str)) {
                    this.f48927xcb770ec4.get(str).mo98525x41012807();
                    this.f48927xcb770ec4.remove(str);
                }
            }
        }

        /* renamed from: getCacheFilter */
        private com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3.Filter m98521xe44f8464(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 interfaceC25918xca9d36a3) {
            if (interfaceC25918xca9d36a3 == null || android.text.TextUtils.isEmpty(interfaceC25918xca9d36a3.mo98514xc35ea28c())) {
                return null;
            }
            java.lang.String mo98514xc35ea28c = interfaceC25918xca9d36a3.mo98514xc35ea28c();
            if (this.f48927xcb770ec4.containsKey(mo98514xc35ea28c)) {
                return this.f48927xcb770ec4.get(mo98514xc35ea28c);
            }
            com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3.Filter mo98513x44bdab94 = interfaceC25918xca9d36a3.mo98513x44bdab94();
            this.f48927xcb770ec4.put(mo98514xc35ea28c, mo98513x44bdab94);
            return mo98513x44bdab94;
        }

        @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3.Filter
        /* renamed from: apply */
        public com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 mo98522x58b836e(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 interfaceC25918xca9d36a3, com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 c25859x590b0095, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25912xbdf93b84 c25912xbdf93b84) {
            if (!(interfaceC25918xca9d36a3 instanceof com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.p2972x63376fd0.C25872x11f44002)) {
                return c25859x590b0095;
            }
            com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.p2972x63376fd0.C25872x11f44002 c25872x11f44002 = (com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.p2972x63376fd0.C25872x11f44002) interfaceC25918xca9d36a3;
            java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3> m98515xd07db4cc = c25872x11f44002.m98515xd07db4cc();
            if (c25872x11f44002.m98516x85d8f1a4() || this.f48928x5bd1f8f4) {
                m98520x15803037(m98515xd07db4cc);
            }
            for (com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 interfaceC25918xca9d36a32 : m98515xd07db4cc) {
                com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3.Filter m98521xe44f8464 = m98521xe44f8464(interfaceC25918xca9d36a32);
                if (m98521xe44f8464 != null) {
                    long nanoTime = java.lang.System.nanoTime();
                    java.lang.String mo98523xea5dc5d5 = m98521xe44f8464 instanceof com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.InterfaceC25923x5f2d05b7 ? ((com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.InterfaceC25923x5f2d05b7) m98521xe44f8464).mo98523xea5dc5d5() : null;
                    c25859x590b0095 = m98521xe44f8464.mo98522x58b836e(interfaceC25918xca9d36a32, c25859x590b0095, c25912xbdf93b84);
                    if (!android.text.TextUtils.isEmpty(mo98523xea5dc5d5)) {
                        this.f48929x416042c2.m98808x36519d(mo98523xea5dc5d5, java.lang.System.nanoTime() - nanoTime);
                    }
                }
            }
            return c25859x590b0095;
        }

        @Override // com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.InterfaceC25923x5f2d05b7
        /* renamed from: getReportKey */
        public java.lang.String mo98523xea5dc5d5() {
            return com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25924x5efcedc3.m98815x8ec0291(this.f48927xcb770ec4.values());
        }

        /* renamed from: notifyOnEffectRemove */
        public void m98524x551d689d() {
            this.f48928x5bd1f8f4 = true;
        }

        @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3.Filter
        /* renamed from: release */
        public synchronized void mo98525x41012807() {
            java.util.Iterator<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3.Filter> it = this.f48927xcb770ec4.values().iterator();
            while (it.hasNext()) {
                it.next().mo98525x41012807();
            }
            this.f48927xcb770ec4.clear();
            this.f48929x416042c2.m98807xaf3f2937();
        }
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3
    /* renamed from: createFilter */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3.Filter mo98513x44bdab94() {
        com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.p2972x63376fd0.C25872x11f44002.FilterProxy filterProxy = new com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.p2972x63376fd0.C25872x11f44002.FilterProxy();
        this.f48926xc3e92cf4.add(filterProxy);
        return filterProxy;
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3
    /* renamed from: effectId */
    public java.lang.String mo98514xc35ea28c() {
        return "VideoEffectProxy" + java.lang.Integer.toHexString(hashCode());
    }

    /* renamed from: getEffects */
    public synchronized java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3> m98515xd07db4cc() {
        return this.f48925x92b07902;
    }

    /* renamed from: isAutoCheckEffectRemove */
    public boolean m98516x85d8f1a4() {
        return this.f48924x3c8cf0ae;
    }

    /* renamed from: notifyOnEffectRemove */
    public void m98517x551d689d() {
        java.util.Iterator<com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.p2972x63376fd0.C25872x11f44002.FilterProxy> it = this.f48926xc3e92cf4.iterator();
        while (it.hasNext()) {
            it.next().m98524x551d689d();
        }
    }

    /* renamed from: setAutoCheckEffectRemove */
    public void m98518x184b756c(boolean z17) {
        this.f48924x3c8cf0ae = z17;
    }

    /* renamed from: setEffects */
    public synchronized void m98519x43ef0240(java.util.concurrent.CopyOnWriteArrayList<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3> copyOnWriteArrayList) {
        this.f48925x92b07902 = copyOnWriteArrayList;
    }
}
