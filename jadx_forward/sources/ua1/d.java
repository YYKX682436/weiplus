package ua1;

/* loaded from: classes7.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ua1.f f507485d;

    public d(ua1.f fVar) {
        this.f507485d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ua1.f fVar;
        if (this.f507485d.a() || this.f507485d.b()) {
            return;
        }
        if (!((java.util.HashMap) this.f507485d.f507488b).isEmpty()) {
            java.util.Iterator it = ((java.util.HashMap) this.f507485d.f507488b).entrySet().iterator();
            while (it.hasNext()) {
                ua1.b bVar = (ua1.b) ((java.util.Map.Entry) it.next()).getValue();
                if (bVar.f507457b) {
                    this.f507485d.f507489c.c(bVar.f507456a, bVar.f507459d, bVar.f507458c, bVar.a());
                }
            }
            byte[] a17 = this.f507485d.f507489c.a();
            if (a17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameRecordAudioLogic", "[hilive] getData fail");
                return;
            }
            float f17 = r1.f507492f / r1.f507491e;
            this.f507485d.getClass();
            for (int i17 = 0; i17 < a17.length; i17 += 2) {
                short s17 = (short) (((short) (((a17[r3] << 8) | (a17[i17] & 255)) & 65535)) * f17);
                a17[i17] = (byte) (s17 & 255);
                a17[i17 + 1] = (byte) ((s17 >> 8) & 255);
            }
            this.f507485d.getClass();
            tl.c cVar = this.f507485d.f507497k;
            if (cVar != null) {
                cVar.b(a17, a17.length);
            }
        }
        ua1.f fVar2 = this.f507485d;
        if (fVar2.f507495i == 0) {
            fVar2.f507495i = android.os.SystemClock.uptimeMillis();
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        while (true) {
            fVar = this.f507485d;
            long j17 = fVar.f507495i;
            if (j17 >= uptimeMillis) {
                break;
            } else {
                fVar.f507495i = j17 + 40;
            }
        }
        if (fVar.a() || this.f507485d.b()) {
            return;
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        ua1.f fVar3 = this.f507485d;
        ((ku5.t0) u0Var).l(fVar3.f507496j, fVar3.f507495i - uptimeMillis, fVar3.f507487a);
    }
}
