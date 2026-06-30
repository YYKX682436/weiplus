package aq3;

/* loaded from: classes12.dex */
public final class j implements ku5.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aq3.l f94713a;

    public j(aq3.l lVar) {
        this.f94713a = lVar;
    }

    @Override // ku5.m
    public void a(java.lang.String key, int i17, java.lang.Throwable e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ThreadPool.Profiler", key + '@' + i17 + ' ' + e17);
    }

    @Override // ku5.m
    public void b(java.lang.String key, int i17, java.lang.String pool, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pool, "pool");
        java.lang.String str = "[rejected] " + key + ' ' + pool + " isShutdown=" + z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ThreadPool.Profiler", str);
        aq3.l lVar = this.f94713a;
        if (lVar.f94718g) {
            lVar.f94717f.remove(key + '@' + i17);
            java.lang.String a17 = bm5.f1.a();
            jx3.f fVar = jx3.f.INSTANCE;
            aq3.e[] eVarArr = aq3.e.f94703d;
            fVar.d(18762, 3, str, key, 17, a17);
        }
    }

    @Override // ku5.m
    public void c(java.lang.String key, int i17, int i18, long j17, java.lang.String pool) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pool, "pool");
        java.lang.String str = "[wait] " + key + '@' + i17 + " runningCount=" + i18 + " waitFor=" + (j17 / 100000) + "ms " + pool;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ThreadPool.Profiler", str);
        java.lang.String a17 = bm5.f1.a();
        jx3.f fVar = jx3.f.INSTANCE;
        aq3.e[] eVarArr = aq3.e.f94703d;
        fVar.d(18762, 2, str, key, 17, a17);
    }

    @Override // ku5.m
    public void d(java.lang.String key, int i17, ku5.q state, long j17, long j18, java.lang.String pool, boolean z17) {
        long j19;
        int i18;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pool, "pool");
        aq3.l lVar = this.f94713a;
        if (lVar.f94718g && state == ku5.q.COMPLETE) {
            i18 = 0;
            java.lang.String str2 = r26.n0.K(key, '@', 0, false, 6, null) >= 0 ? key : null;
            if (str2 == null || (str = str2.subSequence(0, r26.n0.K(str2, '@', 0, false, 6, null)).toString()) == null) {
                str = key;
            }
            aq3.b bVar = (aq3.b) lVar.f94720i.get(str);
            if (bVar == null) {
                j19 = 0;
                bVar = new aq3.b(0L, 0, str);
                lVar.f94720i.put(str, bVar);
            } else {
                j19 = 0;
            }
            int i19 = bVar.f94696b + 1;
            bVar.f94696b = i19;
            if (i19 % 2 == 1) {
                bVar.f94695a++;
            }
            bVar.f94695a += j18;
        } else {
            j19 = 0;
            i18 = 0;
        }
        if (z17) {
            java.lang.String str3 = key + '@' + i17;
            int ordinal = state.ordinal();
            if (ordinal == 0) {
                if (lVar.f94718g) {
                    lVar.f94717f.remove(str3);
                }
                aq3.f fVar = (aq3.f) lVar.f94719h.remove(str3);
                aq3.a aVar = aq3.a.f94692a;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                aq3.a.f94693b.append("\n[throw] " + android.os.Process.myTid() + ' ' + aVar.c(key, i17) + ' ' + aVar.b(fVar, currentTimeMillis));
                aVar.a(currentTimeMillis);
                return;
            }
            if (ordinal == 2) {
                if (lVar.f94718g) {
                    lVar.f94717f.remove(str3);
                }
                aq3.f fVar2 = (aq3.f) lVar.f94719h.remove(str3);
                aq3.a aVar2 = aq3.a.f94692a;
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                aq3.a.f94693b.append("\n[cancel] " + android.os.Process.myTid() + ' ' + aVar2.c(key, i17) + ' ' + aVar2.b(fVar2, currentTimeMillis2));
                aVar2.a(currentTimeMillis2);
                return;
            }
            if (ordinal == 3) {
                long j27 = j17 < j19 ? j19 : j17 / 1000000;
                if (lVar.f94718g) {
                    lVar.f94717f.put(str3, new aq3.c(android.os.SystemClock.uptimeMillis() + j27, null, i18));
                }
                state.toString();
                lVar.f94719h.put(str3, new aq3.f(java.lang.System.currentTimeMillis(), j27, 0L, state, null));
                return;
            }
            if (ordinal == 5) {
                if (lVar.f94718g) {
                    aq3.c cVar = (aq3.c) lVar.f94717f.get(str3);
                    if (cVar != null) {
                        cVar.f94699b = java.lang.Thread.currentThread();
                    }
                    lVar.f94717f.remove(str3);
                }
                state.toString();
                aq3.f fVar3 = (aq3.f) lVar.f94719h.get(str3);
                if (fVar3 != null) {
                    fVar3.f94706c = java.lang.System.currentTimeMillis();
                }
                if (fVar3 != null) {
                    fVar3.f94707d = state;
                }
                if (fVar3 == null) {
                    return;
                }
                fVar3.f94708e = pool;
                return;
            }
            if (ordinal != 6) {
                return;
            }
            aq3.f fVar4 = (aq3.f) lVar.f94719h.remove(str3);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<<< ");
            sb6.append(str3);
            sb6.append(" state=");
            sb6.append(state);
            sb6.append(" cost=");
            sb6.append(j17);
            sb6.append("ms/");
            sb6.append(j18);
            sb6.append("ms ");
            sb6.append(pool);
            sb6.append(" start@=");
            sb6.append(fVar4 != null ? java.lang.Long.valueOf(fVar4.f94704a) : null);
            sb6.append("ms delay=");
            sb6.append(fVar4 != null ? java.lang.Long.valueOf(fVar4.f94705b) : null);
            sb6.append("ms run@=");
            sb6.append(fVar4 != null ? java.lang.Long.valueOf(fVar4.f94706c) : null);
            java.lang.String sb7 = sb6.toString();
            aq3.a aVar3 = aq3.a.f94692a;
            long currentTimeMillis3 = java.lang.System.currentTimeMillis();
            aq3.a.f94693b.append("\n[complete] " + android.os.Process.myTid() + ' ' + aVar3.c(key, i17) + ' ' + j17 + '/' + j18 + ' ' + ((pool.length() == 0 ? 1 : i18) != 0 ? '-' : pool.charAt(i18)) + ' ' + aVar3.b(fVar4, currentTimeMillis3));
            aVar3.a(currentTimeMillis3);
            if (!lVar.f94718g || j17 < 600000) {
                return;
            }
            java.lang.String a17 = bm5.f1.a();
            jx3.f fVar5 = jx3.f.INSTANCE;
            aq3.e[] eVarArr = aq3.e.f94703d;
            fVar5.d(18762, 4, sb7, key, 17, a17);
        }
    }

    @Override // ku5.m
    /* renamed from: shutdown */
    public void mo8887xf5e80656() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ThreadPool.Profiler", "shutdown");
        this.f94713a.f94717f.clear();
    }
}
