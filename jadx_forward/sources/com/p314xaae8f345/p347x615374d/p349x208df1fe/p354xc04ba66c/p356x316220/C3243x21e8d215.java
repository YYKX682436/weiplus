package com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/tencent/kinda/framework/module/impl/KindaSessionIdListenerManager;", "", "()V", "Companion", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.kinda.framework.module.impl.KindaSessionIdListenerManager */
/* loaded from: classes9.dex */
public final class C3243x21e8d215 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3243x21e8d215.Companion INSTANCE = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3243x21e8d215.Companion(null);

    /* renamed from: listenerMap */
    private static final java.util.Map<java.lang.String, com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3241xec66f8b8> f12428x4fafbc08 = new java.util.LinkedHashMap();

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0004R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/tencent/kinda/framework/module/impl/KindaSessionIdListenerManager$Companion;", "", "Ljz5/f0;", "cleanup", "", "uuid", "Lh45/n;", "callback", "startListen", "stopListen", com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "notifySessionId", "", "Lcom/tencent/kinda/framework/module/impl/KindaSessionIdListenerImpl;", "listenerMap", "Ljava/util/Map;", "<init>", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.kinda.framework.module.impl.KindaSessionIdListenerManager$Companion, reason: from kotlin metadata */
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: cleanup */
        public final void m25909x331156a4() {
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3243x21e8d215.f12428x4fafbc08.clear();
        }

        /* renamed from: notifySessionId */
        public final void m25910x2c2fe908(java.lang.String str) {
            if (str == null) {
                str = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaSessionIdListenerImpl", "notifySessionId to " + com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3243x21e8d215.f12428x4fafbc08.size() + " listeners, id=" + str);
            java.util.Iterator it = com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3243x21e8d215.f12428x4fafbc08.values().iterator();
            while (it.hasNext()) {
                h45.n callback = ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3241xec66f8b8) it.next()).getCallback();
                if (callback != null) {
                    callback.mo28746x22647b32(str);
                }
            }
        }

        /* renamed from: startListen */
        public final void m25911x84386cc9(java.lang.String str, h45.n nVar) {
            if (str == null || nVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaSessionIdListenerImpl", "startListen uuid or callback is null");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaSessionIdListenerImpl", "startListen uuid: ".concat(str));
            m25912xa30a7869(str);
            com.p314xaae8f345.p347x615374d.gen.AbstractC3559x53517a31 m28230x1d892dfd = com.p314xaae8f345.p347x615374d.gen.AbstractC3559x53517a31.m28230x1d892dfd();
            if (m28230x1d892dfd == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaSessionIdListenerImpl", "reporter is null");
                return;
            }
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3241xec66f8b8 c3241xec66f8b8 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3241xec66f8b8();
            c3241xec66f8b8.m25906x6c4ebec7(nVar);
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3243x21e8d215.f12428x4fafbc08.put(str, c3241xec66f8b8);
            m28230x1d892dfd.mo28233x7f58e04a(c3241xec66f8b8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaSessionIdListenerImpl", "Started listening for uuid: ".concat(str));
        }

        /* renamed from: stopListen */
        public final void m25912xa30a7869(java.lang.String str) {
            if (str == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaSessionIdListenerImpl", "stopListen uuid is null");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaSessionIdListenerImpl", "stopListen uuid: ".concat(str));
            com.p314xaae8f345.p347x615374d.gen.AbstractC3559x53517a31 m28230x1d892dfd = com.p314xaae8f345.p347x615374d.gen.AbstractC3559x53517a31.m28230x1d892dfd();
            if (m28230x1d892dfd == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaSessionIdListenerImpl", "reporter is null");
                return;
            }
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3241xec66f8b8 c3241xec66f8b8 = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3241xec66f8b8) com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3243x21e8d215.f12428x4fafbc08.remove(str);
            if (c3241xec66f8b8 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaSessionIdListenerImpl", "No listener found for uuid: ".concat(str));
            } else {
                m28230x1d892dfd.mo28235x49a8ac91(c3241xec66f8b8);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaSessionIdListenerImpl", "Stopped listening for uuid: ".concat(str));
            }
        }
    }
}
