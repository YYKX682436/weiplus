package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.BaseImplementation */
/* loaded from: classes13.dex */
public class C1770x2ead7903 {

    /* renamed from: com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder */
    /* loaded from: classes13.dex */
    public interface ResultHolder<R> {
        /* renamed from: setFailedResult */
        void mo17877x921f43c(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12);

        /* renamed from: setResult */
        void mo17878x209a1f1f(R r17);
    }

    /* renamed from: com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl */
    /* loaded from: classes13.dex */
    public static abstract class ApiMethodImpl<R extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d, A extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1732xc16b58b7> extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523<R> implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ResultHolder<R> {
        private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<?> api;

        /* renamed from: clientKey */
        private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.C1733x6b09fe28<A> f5906x8e819a94;

        @java.lang.Deprecated
        public ApiMethodImpl(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.C1733x6b09fe28<A> c1733x6b09fe28, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c) {
            super((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(abstractC1748xd28d482c, "GoogleApiClient must not be null"));
            this.f5906x8e819a94 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.C1733x6b09fe28) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c1733x6b09fe28);
            this.api = null;
        }

        /* renamed from: setFailedResult */
        private void m17873x921f43c(android.os.RemoteException remoteException) {
            mo17877x921f43c(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(8, remoteException.getLocalizedMessage(), (android.app.PendingIntent) null));
        }

        /* renamed from: doExecute */
        public abstract void mo17568x9ef606a(A a17);

        /* renamed from: getApi */
        public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<?> m17874xb5882ae4() {
            return this.api;
        }

        /* renamed from: getClientKey */
        public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.C1733x6b09fe28<A> m17875x8def0bde() {
            return this.f5906x8e819a94;
        }

        /* renamed from: onSetFailedResult */
        public void m17876xb409445d(R r17) {
        }

        public final void run(A a17) {
            try {
                mo17568x9ef606a(a17);
            } catch (android.os.DeadObjectException e17) {
                m17873x921f43c(e17);
                throw e17;
            } catch (android.os.RemoteException e18) {
                m17873x921f43c(e18);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ResultHolder
        /* renamed from: setResult */
        public /* bridge */ /* synthetic */ void mo17878x209a1f1f(java.lang.Object obj) {
            super.m17883x209a1f1f((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl<R, A>) obj);
        }

        public ApiMethodImpl(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<?> api, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c) {
            super((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(abstractC1748xd28d482c, "GoogleApiClient must not be null"));
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(api, "Api must not be null");
            this.f5906x8e819a94 = api.zab();
            this.api = api;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ResultHolder
        /* renamed from: setFailedResult */
        public final void mo17877x921f43c(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(!c1763x9432bc12.m17855x6e268779(), "Failed result must not be success");
            R mo17567xe8a1c1d6 = mo17567xe8a1c1d6(c1763x9432bc12);
            m17883x209a1f1f((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl<R, A>) mo17567xe8a1c1d6);
            m17876xb409445d(mo17567xe8a1c1d6);
        }

        public ApiMethodImpl(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523.CallbackHandler<R> callbackHandler) {
            super(callbackHandler);
            this.f5906x8e819a94 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.C1733x6b09fe28<>();
            this.api = null;
        }
    }
}
