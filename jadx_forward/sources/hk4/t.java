package hk4;

/* loaded from: classes10.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hk4.x f363512d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(hk4.x xVar) {
        super(1);
        this.f363512d = xVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        kk4.b it = (kk4.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        hk4.x xVar = this.f363512d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f363518k, "onPlayStarted");
        hk4.x.q(xVar);
        xVar.f363528u = true;
        long j17 = xVar.f363530w;
        kk4.v vVar = xVar.f363519l;
        java.lang.String str = xVar.f363518k;
        if (j17 >= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onPlayStarted seek to target:" + xVar.f363530w);
            vVar.z((int) xVar.f363530w, true, new hk4.r(xVar));
            xVar.f363530w = -1L;
        } else {
            long j18 = xVar.f363520m;
            if (j18 < 0 || xVar.f363521n <= 0 || j18 >= xVar.f363525r) {
                hk4.x.p(xVar);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onPlayStarted seek to playRange:[" + xVar.f363520m + ',' + xVar.f363521n + ']');
                vVar.z((int) xVar.f363520m, true, new hk4.s(xVar));
            }
        }
        return jz5.f0.f384359a;
    }
}
