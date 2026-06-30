package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.ListenerHolder */
/* loaded from: classes13.dex */
public final class C1781xefedf3a0<L> {
    private final java.util.concurrent.Executor zaa;
    private volatile java.lang.Object zab;
    private volatile com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0.ListenerKey zac;

    /* renamed from: com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey */
    /* loaded from: classes13.dex */
    public static final class ListenerKey<L> {
        private final java.lang.Object zaa;
        private final java.lang.String zab;

        public ListenerKey(L l17, java.lang.String str) {
            this.zaa = l17;
            this.zab = str;
        }

        /* renamed from: equals */
        public boolean m17925xb2c87fbf(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0.ListenerKey)) {
                return false;
            }
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0.ListenerKey listenerKey = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0.ListenerKey) obj;
            return this.zaa == listenerKey.zaa && this.zab.equals(listenerKey.zab);
        }

        /* renamed from: hashCode */
        public int m17926x8cdac1b() {
            return (java.lang.System.identityHashCode(this.zaa) * 31) + this.zab.hashCode();
        }

        /* renamed from: toIdString */
        public java.lang.String m17927xd852a0a7() {
            return this.zab + "@" + java.lang.System.identityHashCode(this.zaa);
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.ListenerHolder$Notifier */
    /* loaded from: classes13.dex */
    public interface Notifier<L> {
        /* renamed from: notifyListener */
        void mo17886xc41b671d(L l17);

        /* renamed from: onNotifyListenerFailed */
        void mo17888xea3cfa39();
    }

    public C1781xefedf3a0(android.os.Looper looper, L l17, java.lang.String str) {
        this.zaa = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.p219xa7ffe5b7.ExecutorC2015xdff821d(looper);
        this.zab = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(l17, "Listener must not be null");
        this.zac = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0.ListenerKey(l17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str));
    }

    /* renamed from: clear */
    public void m17921x5a5b64d() {
        this.zab = null;
        this.zac = null;
    }

    /* renamed from: getListenerKey */
    public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0.ListenerKey<L> m17922x2985fbd5() {
        return this.zac;
    }

    /* renamed from: hasListener */
    public boolean m17923xfb91816e() {
        return this.zab != null;
    }

    /* renamed from: notifyListener */
    public void m17924xc41b671d(final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0.Notifier<? super L> notifier) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(notifier, "Notifier must not be null");
        this.zaa.execute(new java.lang.Runnable() { // from class: com.google.android.gms.common.api.internal.zacb
            @Override // java.lang.Runnable
            public final void run() {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0.this.zaa(notifier);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zaa(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0.Notifier notifier) {
        java.lang.Object obj = this.zab;
        if (obj == null) {
            notifier.mo17888xea3cfa39();
            return;
        }
        try {
            notifier.mo17886xc41b671d(obj);
        } catch (java.lang.RuntimeException e17) {
            notifier.mo17888xea3cfa39();
            throw e17;
        }
    }

    public C1781xefedf3a0(java.util.concurrent.Executor executor, L l17, java.lang.String str) {
        this.zaa = (java.util.concurrent.Executor) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(executor, "Executor must not be null");
        this.zab = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(l17, "Listener must not be null");
        this.zac = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0.ListenerKey(l17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str));
    }
}
