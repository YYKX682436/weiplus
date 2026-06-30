package w11;

/* loaded from: classes5.dex */
public final class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f523501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f523502e;

    public a2(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var, java.lang.String str) {
        this.f523501d = o4Var;
        this.f523502e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.f523501d;
        java.lang.String str = this.f523502e;
        synchronized (o4Var) {
            if (w11.c2.f523525b) {
                return;
            }
            try {
                w11.c2.f523525b = true;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dump mmkv: keys=");
                java.lang.String[] b17 = o4Var.b();
                sb6.append(b17 != null ? java.lang.Integer.valueOf(b17.length) : null);
                sb6.append(", totalSize=");
                sb6.append(o4Var.Y());
                sb6.append('(');
                long j17 = 1024;
                sb6.append(o4Var.Y() / j17);
                sb6.append("KB), caller=");
                sb6.append(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncKeyKV", sb6.toString());
                java.lang.String[] b18 = o4Var.b();
                if (b18 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(b18.length);
                    for (java.lang.String str2 : b18) {
                        byte[] j18 = o4Var.j(str2);
                        arrayList.add(new jz5.l(str2, java.lang.Integer.valueOf(j18 != null ? j18.length : 0)));
                    }
                    java.util.Map q17 = kz5.c1.q(kz5.n0.F0(arrayList, new w11.z1()));
                    java.util.Set entrySet = q17.entrySet();
                    int size = q17.entrySet().size();
                    if (size > 20) {
                        size = 20;
                    }
                    for (java.util.Map.Entry entry : kz5.n0.K0(entrySet, size)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncKeyKV", " - key=" + ((java.lang.String) entry.getKey()) + ", size=" + ((java.lang.Number) entry.getValue()).intValue() + '(' + (((java.lang.Number) entry.getValue()).intValue() / 1024) + "KB)");
                    }
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                long j19 = w11.c2.f523526c;
                if (j19 <= 0 || currentTimeMillis - j19 > 3600000) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncKeyKV", "trim");
                    o4Var.a0();
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append("dump mmkv afterTrim: keys=");
                    java.lang.String[] b19 = o4Var.b();
                    sb7.append(b19 != null ? java.lang.Integer.valueOf(b19.length) : null);
                    sb7.append(", totalSize=");
                    sb7.append(o4Var.Y());
                    sb7.append('(');
                    sb7.append(o4Var.Y() / j17);
                    sb7.append("KB)");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncKeyKV", sb7.toString());
                    w11.c2.f523526c = currentTimeMillis;
                }
            } finally {
                w11.c2.f523525b = false;
            }
        }
    }
}
