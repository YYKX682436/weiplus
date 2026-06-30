package ef4;

/* loaded from: classes4.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f334021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f334022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f334023f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(long j17, long j18, java.util.ArrayList arrayList) {
        super(0);
        this.f334021d = j17;
        this.f334022e = j18;
        this.f334023f = arrayList;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        pm0.c cVar = new pm0.c("reportWaitPlayList");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6941xa011564e c6941xa011564e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6941xa011564e();
        long j17 = this.f334021d;
        c6941xa011564e.f142506d = j17;
        long j18 = this.f334022e;
        c6941xa011564e.f142507e = j18;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        java.util.Iterator it = this.f334023f.iterator();
        int i17 = 1;
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            java.util.Iterator it6 = it;
            long j19 = j18;
            long j27 = ef4.w.f334001t.g().y0(str).f66294x10ed17fb;
            int length = java.lang.String.valueOf(j27).length();
            pm0.c cVar2 = cVar;
            if (sb6.length() + length < 1000) {
                sb6.append(j27);
                sb6.append("|");
            } else if (sb7.length() + length < 1000) {
                sb7.append(j27);
                sb7.append("|");
            } else if (sb8.length() + length < 1000) {
                sb8.append(j27);
                sb8.append("|");
            } else {
                c6941xa011564e.f142508f = c6941xa011564e.b("WaitPlayVideoList", sb6.substring(0, sb6.length()).toString(), true);
                c6941xa011564e.f142511i = c6941xa011564e.b("WaitPlayVideoList1", sb7.substring(0, sb7.length()).toString(), true);
                c6941xa011564e.f142512j = c6941xa011564e.b("WaitPlayVideoList2", sb8.substring(0, sb8.length()).toString(), true);
                c6941xa011564e.f142510h = i17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryExtInfoStorageLogic", "split reportWaitPlayList " + j17 + ' ' + i17 + ' ' + c6941xa011564e.f142508f.length() + ' ' + c6941xa011564e.f142508f + c6941xa011564e.f142511i.length() + ' ' + c6941xa011564e.f142511i + c6941xa011564e.f142512j.length() + ' ' + c6941xa011564e.f142512j);
                c6941xa011564e.k();
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6941xa011564e c6941xa011564e2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6941xa011564e();
                c6941xa011564e2.f142506d = j17;
                j18 = j19;
                c6941xa011564e2.f142507e = j18;
                i17++;
                r26.e0.d(sb6);
                r26.e0.d(sb7);
                r26.e0.d(sb8);
                c6941xa011564e = c6941xa011564e2;
                cVar = cVar2;
                it = it6;
            }
            j18 = j19;
            cVar = cVar2;
            it = it6;
        }
        c6941xa011564e.f142508f = c6941xa011564e.b("WaitPlayVideoList", sb6.substring(0, sb6.length()).toString(), true);
        c6941xa011564e.f142511i = c6941xa011564e.b("WaitPlayVideoList1", sb7.substring(0, sb7.length()).toString(), true);
        c6941xa011564e.f142512j = c6941xa011564e.b("WaitPlayVideoList2", sb8.substring(0, sb8.length()).toString(), true);
        c6941xa011564e.f142510h = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryExtInfoStorageLogic", "final reportWaitPlayList " + j17 + ' ' + i17 + ' ' + c6941xa011564e.f142508f.length() + ' ' + c6941xa011564e.f142508f + c6941xa011564e.f142511i.length() + ' ' + c6941xa011564e.f142511i + c6941xa011564e.f142512j.length() + ' ' + c6941xa011564e.f142512j);
        c6941xa011564e.k();
        new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6941xa011564e();
        cVar.a();
        return jz5.f0.f384359a;
    }
}
