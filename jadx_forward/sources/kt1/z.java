package kt1;

@j95.b
/* loaded from: classes4.dex */
public final class z extends i95.w implements ct1.w {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f393500d = jz5.h.b(kt1.y.f393499d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f393501e = jz5.h.b(kt1.v.f393492d);

    public void Ai(byte[] bArr, int i17, int i18) {
        kt1.h0 h0Var = new kt1.h0(bArr, i17, i18);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReliableSync.Service", "addSyncTask() called with: task = " + h0Var + " session:" + currentTimeMillis);
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) this.f393501e).mo141623x754a37bb(), null, new kt1.w(this, h0Var, currentTimeMillis, null), 1, null);
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReliableSync.Service", "@" + hashCode() + " onCreate() called isMainProcess:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n());
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0116 A[LOOP:0: B:7:0x0110->B:9:0x0116, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wi(int r7) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kt1.z.wi(int):void");
    }
}
