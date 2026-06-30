package mn0;

/* loaded from: classes10.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn0.i0 f411268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f411269e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f411270f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f411271g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(mn0.i0 i0Var, long j17, long j18, long j19) {
        super(0);
        this.f411268d = i0Var;
        this.f411269e = j17;
        this.f411270f = j18;
        this.f411271g = j19;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        long j17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        jz5.f0 f0Var;
        int i17;
        zy2.n8 n8Var = (zy2.n8) i95.n0.c(zy2.n8.class);
        long hashCode = this.f411268d.hashCode();
        long j18 = this.f411269e;
        long j19 = this.f411270f;
        long j27 = this.f411271g;
        if (j19 > j27) {
            j19 = j27;
        }
        mn0.i0 i0Var = this.f411268d;
        long j28 = i0Var.f411288u;
        long j29 = i0Var.f411289v;
        java.lang.String sessionId = i0Var.f411286s;
        java.lang.String commentScene = i0Var.f411287t;
        b92.m2 m2Var = (b92.m2) n8Var;
        m2Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentScene, "commentScene");
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (j28 == 0) {
            return f0Var2;
        }
        if (((java.lang.Boolean) m2Var.f100014d.get(java.lang.Long.valueOf(hashCode))) != null) {
            m2Var.f100014d.put(java.lang.Long.valueOf(hashCode), java.lang.Boolean.TRUE);
            long c17 = c01.id.c();
            m2Var.f100018h.put(java.lang.Long.valueOf(hashCode), java.lang.Long.valueOf(c17));
            r45.he2 he2Var = new r45.he2();
            he2Var.set(2, java.lang.Long.valueOf(c17 - he2Var.m75939xb282bd08(13)));
            he2Var.set(3, java.lang.Long.valueOf(c17));
            he2Var.set(0, java.lang.Long.valueOf(j28));
            he2Var.set(1, java.lang.Long.valueOf(j29));
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            if (!r75.d.f474794h) {
                i17 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40062x608a19a0(context);
            } else if (r75.d.f474791e == -100) {
                i17 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40062x608a19a0(context);
                r75.d.f474791e = i17;
            } else {
                ((ku5.t0) ku5.t0.f394148d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetWorkCache", "getIOSNetTypeFromCache, iosNetworkType = " + r75.d.f474791e);
                i17 = r75.d.f474791e;
            }
            he2Var.set(6, java.lang.Integer.valueOf(i17));
            he2Var.set(5, commentScene);
            he2Var.set(4, sessionId);
            he2Var.set(13, java.lang.Integer.valueOf((int) j18));
            he2Var.set(14, java.lang.Integer.valueOf((int) j19));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFirstFrameRender: firstIFrameTimeCost=");
            sb6.append(j18);
            sb6.append(", uiToFirstFrameRenderCost=");
            sb6.append(j19);
            sb6.append(", commentScene=");
            sb6.append(commentScene);
            str2 = ", sessionId=";
            sb6.append(str2);
            sb6.append(sessionId);
            sb6.append(", network_type=");
            sb6.append(he2Var.m75939xb282bd08(6));
            str5 = ", objectId=";
            sb6.append(str5);
            sb6.append(pm0.v.u(j28));
            str4 = ", liveId=";
            sb6.append(str4);
            sb6.append(pm0.v.u(j29));
            str3 = ", tickerHashCode=";
            sb6.append(str3);
            j17 = hashCode;
            sb6.append(j17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveQosReportService", sb6.toString());
            str = "FinderLiveQosReportService";
            pm0.v.X(new b92.f2(m2Var, he2Var, "onFirstFrameRender"));
            f0Var = f0Var2;
        } else {
            j17 = hashCode;
            str = "FinderLiveQosReportService";
            str2 = ", sessionId=";
            str3 = ", tickerHashCode=";
            str4 = ", liveId=";
            str5 = ", objectId=";
            f0Var = null;
        }
        if (f0Var != null) {
            return f0Var2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onFirstFrameRender: this live is not playing, commentScene=" + commentScene + str2 + sessionId + str5 + pm0.v.u(j28) + str4 + pm0.v.u(j29) + str3 + j17);
        return f0Var2;
    }
}
