package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.ListenerHolders */
/* loaded from: classes13.dex */
public class C1782xdd080d3 {
    private final java.util.Set zaa = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());

    /* renamed from: createListenerHolder */
    public static <L> com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0<L> m17928xe0f82b9c(L l17, android.os.Looper looper, java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(l17, "Listener must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(looper, "Looper must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(str, "Listener type must not be null");
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0<>(looper, l17, str);
    }

    /* renamed from: createListenerKey */
    public static <L> com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0.ListenerKey<L> m17930x7cce866f(L l17, java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(l17, "Listener must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(str, "Listener type must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18209xec737762(str, "Listener type must not be empty");
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0.ListenerKey<>(l17, str);
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0 zaa(java.lang.Object obj, android.os.Looper looper, java.lang.String str) {
        java.util.Set set = this.zaa;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0 m17928xe0f82b9c = m17928xe0f82b9c(obj, looper, "NO_TYPE");
        set.add(m17928xe0f82b9c);
        return m17928xe0f82b9c;
    }

    public final void zab() {
        java.util.Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0) it.next()).m17921x5a5b64d();
        }
        this.zaa.clear();
    }

    /* renamed from: createListenerHolder */
    public static <L> com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0<L> m17929xe0f82b9c(L l17, java.util.concurrent.Executor executor, java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(l17, "Listener must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(executor, "Executor must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(str, "Listener type must not be null");
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0<>(executor, l17, str);
    }
}
