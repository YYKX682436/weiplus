package tq2;

/* loaded from: classes2.dex */
public final class a extends kz2.c {

    /* renamed from: e, reason: collision with root package name */
    public int f502752e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String traceName) {
        super(traceName);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(traceName, "traceName");
    }

    @Override // kz2.c
    public void b(java.lang.String node) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(node, "node");
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        super.b(node);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.j0 j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.j0.f206616a;
        j0Var.e(this.f502752e);
        int i17 = this.f502752e;
        org.json.JSONObject d17 = d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g0 c17 = j0Var.c(i17, false);
        if (c17 != null) {
            c17.f206574g = d17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyHomeTimeConsumingTrace", "time:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }
}
