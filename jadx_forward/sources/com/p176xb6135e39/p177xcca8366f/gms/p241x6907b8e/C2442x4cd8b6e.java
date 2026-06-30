package com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e;

/* renamed from: com.google.android.gms.tasks.Tasks */
/* loaded from: classes13.dex */
public final class C2442x4cd8b6e {
    private C2442x4cd8b6e() {
    }

    /* renamed from: await */
    public static <TResult> TResult m19608x58e7956(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TResult> abstractC2439x27a9a5) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18212xfcae242e();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18210x29128cde();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(abstractC2439x27a9a5, "Task must not be null");
        if (abstractC2439x27a9a5.mo19598xacfcd883()) {
            return (TResult) zza(abstractC2439x27a9a5);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2446x394b63 c2446x394b63 = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2446x394b63(null);
        zzb(abstractC2439x27a9a5, c2446x394b63);
        c2446x394b63.zza();
        return (TResult) zza(abstractC2439x27a9a5);
    }

    @java.lang.Deprecated
    /* renamed from: call */
    public static <TResult> com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TResult> m19610x2e7a5e(java.util.concurrent.Callable<TResult> callable) {
        return m19611x2e7a5e(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2441x6127a1db.f7458xf272cf50, callable);
    }

    /* renamed from: forCanceled */
    public static <TResult> com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TResult> m19612x41f39c82() {
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzw zzwVar = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzw();
        zzwVar.zzc();
        return zzwVar;
    }

    /* renamed from: forException */
    public static <TResult> com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TResult> m19613x3867b586(java.lang.Exception exc) {
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzw zzwVar = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzw();
        zzwVar.zza(exc);
        return zzwVar;
    }

    /* renamed from: forResult */
    public static <TResult> com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TResult> m19614x3e1fc646(TResult tresult) {
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzw zzwVar = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzw();
        zzwVar.zzb(tresult);
        return zzwVar;
    }

    /* renamed from: whenAll */
    public static com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> m19615x4e3fd407(java.util.Collection<? extends com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<?>> collection) {
        if (collection != null && !collection.isEmpty()) {
            java.util.Iterator<? extends com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<?>> it = collection.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    throw new java.lang.NullPointerException("null tasks are not accepted");
                }
            }
            com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzw zzwVar = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzw();
            com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2448x394b65 c2448x394b65 = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2448x394b65(collection.size(), zzwVar);
            java.util.Iterator<? extends com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<?>> it6 = collection.iterator();
            while (it6.hasNext()) {
                zzb(it6.next(), c2448x394b65);
            }
            return zzwVar;
        }
        return m19614x3e1fc646(null);
    }

    /* renamed from: whenAllComplete */
    public static com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<?>>> m19617x392a7260(java.util.Collection<? extends com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<?>> collection) {
        return m19618x392a7260(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2441x6127a1db.f7458xf272cf50, collection);
    }

    /* renamed from: whenAllSuccess */
    public static <TResult> com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.util.List<TResult>> m19621x411fbdfc(java.util.Collection<? extends com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5> collection) {
        return m19622x411fbdfc(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2441x6127a1db.f7458xf272cf50, collection);
    }

    /* renamed from: withTimeout */
    public static <T> com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<T> m19625xdfd2e9bb(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<T> abstractC2439x27a9a5, long j17, java.util.concurrent.TimeUnit timeUnit) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(abstractC2439x27a9a5, "Task must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(j17 > 0, "Timeout must be positive");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(timeUnit, "TimeUnit must not be null");
        final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzb zzbVar = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzb();
        final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc c2440x4f4de6dc = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc(zzbVar);
        final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p231x6907b8e.zza zzaVar = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p231x6907b8e.zza(android.os.Looper.getMainLooper());
        zzaVar.postDelayed(new java.lang.Runnable() { // from class: com.google.android.gms.tasks.zzx
            @Override // java.lang.Runnable
            public final void run() {
                com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc.this.m19605xc5fa5768(new java.util.concurrent.TimeoutException());
            }
        }, timeUnit.toMillis(j17));
        abstractC2439x27a9a5.mo19582xef59738d(new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2433x579e812c() { // from class: com.google.android.gms.tasks.zzy
            @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2433x579e812c
            /* renamed from: onComplete */
            public final void mo17960x815f5438(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 abstractC2439x27a9a52) {
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p231x6907b8e.zza.this.removeCallbacksAndMessages(null);
                com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc c2440x4f4de6dc2 = c2440x4f4de6dc;
                if (abstractC2439x27a9a52.mo19599x55b0a764()) {
                    c2440x4f4de6dc2.m19606xd9193fa4(abstractC2439x27a9a52.mo19595x2d64eb13());
                } else {
                    if (abstractC2439x27a9a52.mo19597xc9602be3()) {
                        zzbVar.zza();
                        return;
                    }
                    java.lang.Exception mo19594x57bd4199 = abstractC2439x27a9a52.mo19594x57bd4199();
                    mo19594x57bd4199.getClass();
                    c2440x4f4de6dc2.m19605xc5fa5768(mo19594x57bd4199);
                }
            }
        });
        return c2440x4f4de6dc.m19602xfb859dfb();
    }

    private static java.lang.Object zza(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 abstractC2439x27a9a5) {
        if (abstractC2439x27a9a5.mo19599x55b0a764()) {
            return abstractC2439x27a9a5.mo19595x2d64eb13();
        }
        if (abstractC2439x27a9a5.mo19597xc9602be3()) {
            throw new java.util.concurrent.CancellationException("Task is already canceled");
        }
        throw new java.util.concurrent.ExecutionException(abstractC2439x27a9a5.mo19594x57bd4199());
    }

    private static void zzb(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 abstractC2439x27a9a5, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2447x394b64 interfaceC2447x394b64) {
        java.util.concurrent.Executor executor = com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2441x6127a1db.zza;
        abstractC2439x27a9a5.mo19589xb1e20357(executor, interfaceC2447x394b64);
        abstractC2439x27a9a5.mo19586x96fe7dde(executor, interfaceC2447x394b64);
        abstractC2439x27a9a5.mo19580xc26366ed(executor, interfaceC2447x394b64);
    }

    @java.lang.Deprecated
    /* renamed from: call */
    public static <TResult> com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TResult> m19611x2e7a5e(java.util.concurrent.Executor executor, java.util.concurrent.Callable<TResult> callable) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(executor, "Executor must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(callable, "Callback must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzw zzwVar = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzw();
        executor.execute(new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzz(zzwVar, callable));
        return zzwVar;
    }

    /* renamed from: whenAllComplete */
    public static com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<?>>> m19618x392a7260(java.util.concurrent.Executor executor, java.util.Collection<? extends com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<?>> collection) {
        if (collection != null && !collection.isEmpty()) {
            return m19615x4e3fd407(collection).mo19593x64b18132(executor, new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2444x394b61(collection));
        }
        return m19614x3e1fc646(java.util.Collections.emptyList());
    }

    /* renamed from: whenAllSuccess */
    public static <TResult> com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.util.List<TResult>> m19622x411fbdfc(java.util.concurrent.Executor executor, java.util.Collection<? extends com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5> collection) {
        if (collection != null && !collection.isEmpty()) {
            return (com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.util.List<TResult>>) m19615x4e3fd407((java.util.Collection<? extends com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<?>>) collection).mo19591xd315a60d(executor, new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2443x394b60(collection));
        }
        return m19614x3e1fc646(java.util.Collections.emptyList());
    }

    /* renamed from: whenAllComplete */
    public static com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<?>>> m19619x392a7260(java.util.concurrent.Executor executor, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<?>... abstractC2439x27a9a5Arr) {
        if (abstractC2439x27a9a5Arr != null && abstractC2439x27a9a5Arr.length != 0) {
            return m19618x392a7260(executor, java.util.Arrays.asList(abstractC2439x27a9a5Arr));
        }
        return m19614x3e1fc646(java.util.Collections.emptyList());
    }

    /* renamed from: whenAllSuccess */
    public static <TResult> com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.util.List<TResult>> m19623x411fbdfc(java.util.concurrent.Executor executor, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5... abstractC2439x27a9a5Arr) {
        if (abstractC2439x27a9a5Arr != null && abstractC2439x27a9a5Arr.length != 0) {
            return m19622x411fbdfc(executor, java.util.Arrays.asList(abstractC2439x27a9a5Arr));
        }
        return m19614x3e1fc646(java.util.Collections.emptyList());
    }

    /* renamed from: whenAllComplete */
    public static com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<?>>> m19620x392a7260(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<?>... abstractC2439x27a9a5Arr) {
        if (abstractC2439x27a9a5Arr != null && abstractC2439x27a9a5Arr.length != 0) {
            return m19617x392a7260(java.util.Arrays.asList(abstractC2439x27a9a5Arr));
        }
        return m19614x3e1fc646(java.util.Collections.emptyList());
    }

    /* renamed from: whenAllSuccess */
    public static <TResult> com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.util.List<TResult>> m19624x411fbdfc(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5... abstractC2439x27a9a5Arr) {
        if (abstractC2439x27a9a5Arr != null && abstractC2439x27a9a5Arr.length != 0) {
            return m19621x411fbdfc(java.util.Arrays.asList(abstractC2439x27a9a5Arr));
        }
        return m19614x3e1fc646(java.util.Collections.emptyList());
    }

    /* renamed from: whenAll */
    public static com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> m19616x4e3fd407(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<?>... abstractC2439x27a9a5Arr) {
        if (abstractC2439x27a9a5Arr != null && abstractC2439x27a9a5Arr.length != 0) {
            return m19615x4e3fd407(java.util.Arrays.asList(abstractC2439x27a9a5Arr));
        }
        return m19614x3e1fc646(null);
    }

    /* renamed from: await */
    public static <TResult> TResult m19609x58e7956(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<TResult> abstractC2439x27a9a5, long j17, java.util.concurrent.TimeUnit timeUnit) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18212xfcae242e();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18210x29128cde();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(abstractC2439x27a9a5, "Task must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(timeUnit, "TimeUnit must not be null");
        if (abstractC2439x27a9a5.mo19598xacfcd883()) {
            return (TResult) zza(abstractC2439x27a9a5);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2446x394b63 c2446x394b63 = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2446x394b63(null);
        zzb(abstractC2439x27a9a5, c2446x394b63);
        if (c2446x394b63.zzb(j17, timeUnit)) {
            return (TResult) zza(abstractC2439x27a9a5);
        }
        throw new java.util.concurrent.TimeoutException("Timed out waiting for Task");
    }
}
