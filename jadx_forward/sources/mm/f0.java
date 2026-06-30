package mm;

/* loaded from: classes.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f410013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f410014e;

    public f0(long j17, int i17) {
        this.f410013d = j17;
        this.f410014e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17;
        try {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("reported-crash-tids", 4);
            java.util.Map<java.lang.String, ?> all = sharedPreferences.getAll();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(all);
            java.util.Iterator<java.util.Map.Entry<java.lang.String, ?>> it = all.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                j17 = this.f410013d;
                if (!hasNext) {
                    break;
                }
                java.util.Map.Entry<java.lang.String, ?> next = it.next();
                java.lang.String key = next.getKey();
                java.lang.Object value = next.getValue();
                long F1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F1(key, 0L);
                if (F1 >= j17 - com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26672xc5b068cb.f56198x1c9ff21c && F1 < j17) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(value);
                    if (value instanceof java.lang.Integer) {
                        linkedHashMap.put(java.lang.String.valueOf(F1), value);
                    }
                }
            }
            linkedHashMap.put(java.lang.String.valueOf(j17), java.lang.Integer.valueOf(this.f410014e));
            android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.clear();
            for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                edit.putInt((java.lang.String) entry.getKey(), ((java.lang.Number) entry.getValue()).intValue());
            }
            edit.commit();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.proc.ProcLifeTracker", "noteReportedPidList: " + linkedHashMap.values());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MiroMsg.proc.ProcLifeTracker", "noteReportedPidList err: " + e17);
        }
    }
}
