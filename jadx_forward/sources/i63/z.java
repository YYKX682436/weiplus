package i63;

/* loaded from: classes7.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i63.b0 f370575d;

    public z(i63.b0 b0Var) {
        this.f370575d = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (!((java.util.HashMap) this.f370575d.f370509i).isEmpty()) {
            java.util.Iterator it = ((java.util.HashMap) this.f370575d.f370509i).entrySet().iterator();
            while (it.hasNext()) {
                ua1.b bVar = (ua1.b) ((java.util.Map.Entry) it.next()).getValue();
                if (bVar.f507457b) {
                    this.f370575d.f370510m.c(bVar.f507456a, bVar.f507459d, bVar.f507458c, bVar.a());
                }
            }
            byte[] a17 = this.f370575d.f370510m.a();
            if (a17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameLiveAppbrandAudioMgrService", "[hilive] getData fail");
                return;
            }
            i63.b0 b0Var = this.f370575d;
            float f17 = b0Var.f370515r / b0Var.f370514q;
            for (int i17 = 0; i17 < a17.length; i17 += 2) {
                short s17 = (short) (((short) (((a17[r5] << 8) | (a17[i17] & 255)) & 65535)) * f17);
                a17[i17] = (byte) (s17 & 255);
                a17[i17 + 1] = (byte) ((s17 >> 8) & 255);
            }
            if (((java.lang.Boolean) ((jz5.n) ((p60.u) i95.n0.c(p60.u.class)).f433733d).mo141623x754a37bb()).booleanValue()) {
                try {
                    this.f370575d.f370512o.write(a17);
                } catch (java.io.IOException unused) {
                }
            }
            i63.m0 m0Var = new i63.m0((byte[]) a17.clone(), java.lang.System.currentTimeMillis());
            i63.b0 b0Var2 = this.f370575d;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = b0Var2.f370507g;
            if (n3Var != null) {
                n3Var.mo50293x3498a0(new i63.y(b0Var2, m0Var));
            }
        }
        i63.b0 b0Var3 = this.f370575d;
        if (b0Var3.f370511n == 0) {
            b0Var3.f370511n = android.os.SystemClock.uptimeMillis();
        }
        long j17 = 40;
        this.f370575d.f370511n += j17;
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        if (uptimeMillis > this.f370575d.f370511n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "fix next update time, now:%d updateTime:%d", java.lang.Long.valueOf(uptimeMillis), java.lang.Long.valueOf(this.f370575d.f370511n));
            this.f370575d.f370511n = uptimeMillis + j17;
        }
        synchronized (this) {
            i63.b0 b0Var4 = this.f370575d;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = b0Var4.f370506f;
            if (n3Var2 != null && !b0Var4.f370517t) {
                n3Var2.mo50295x41bd0e60(b0Var4.A, b0Var4.f370511n);
            }
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        i63.b0 b0Var5 = this.f370575d;
        if (currentTimeMillis2 - b0Var5.f370519v > com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
            b0Var5.f370519v = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "send audio data, cost %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
    }
}
