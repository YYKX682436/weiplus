package im2;

/* loaded from: classes2.dex */
public final class e7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.f7 f373843d;

    public e7(im2.f7 f7Var) {
        this.f373843d = f7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        boolean z17;
        long j17;
        long j18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa c13924x37151faa;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa c13924x37151faa2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWatchCountDownUIC", "notify nearby requestRefresh : " + im2.f7.f373858m);
        if (im2.f7.f373858m != 0) {
            ys5.f fVar = (ys5.f) i95.n0.c(ys5.f.class);
            long j19 = im2.f7.f373858m;
            boolean z18 = this.f373843d.f373863f;
            sq2.g gVar = (sq2.g) fVar;
            gVar.getClass();
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            java.lang.String str2 = a52.a.f83117l;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyRefreshServiceImp", "requestRefresh " + j19 + " isFromRed: " + z18 + " isEventRegist: " + gVar.f492884f + " scene: " + str2);
            gVar.f492883e = j19;
            gVar.f492885g = z18;
            if (gVar.f492884f) {
                str = str2;
                z17 = z18;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5512x74981384 c5512x74981384 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5512x74981384();
                j17 = j19;
                c5512x74981384.f135843g.f89145a = j17;
                c5512x74981384.e();
            } else {
                nq2.d dVar = nq2.d.f420513a;
                r45.dd2 dd2Var = new r45.dd2();
                dd2Var.set(0, 88890);
                pq2.e c17 = dVar.c(dd2Var);
                if (c17 != null) {
                    if (c17.f439118n != pq2.a.f439107h) {
                        az2.w wVar = c17.f439114g;
                        if (!(wVar != null && wVar.f97690a == 0 && wVar.f97691b == 0)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c17.f439111d, "fetchRelatedRecommendList getLoadingState: " + c17.f439118n);
                        }
                    }
                    int m75939xb282bd08 = c17.f439122p.m75939xb282bd08(0) + 1005000 + c17.f439121o;
                    int m75939xb282bd082 = c17.f439122p.m75939xb282bd08(0) + 1001;
                    java.lang.String str3 = c17.f439111d;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchRelatedRecommendList relatedObjectId: ");
                    sb6.append(j19);
                    sb6.append(" lastBuffer = ");
                    az2.w wVar2 = c17.f439114g;
                    sb6.append((wVar2 == null || (c13924x37151faa2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa) wVar2.f97693d) == null) ? null : c13924x37151faa2.getLastBuffer());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb6.toString());
                    r45.dd2 dd2Var2 = c17.f439122p;
                    az2.w wVar3 = c17.f439114g;
                    str = str2;
                    z17 = z18;
                    j18 = j19;
                    c17.j(new cp2.l(16, dd2Var2, (wVar3 == null || (c13924x37151faa = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa) wVar3.f97693d) == null) ? null : c13924x37151faa.getLastBuffer(), m75939xb282bd08, m75939xb282bd082, c17.f439121o, null, 0, j19, null, 0, 1728, null), null);
                    j17 = j18;
                }
                str = str2;
                z17 = z18;
                j18 = j19;
                j17 = j18;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "135") || z17) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5513x1e48d9e8 c5513x1e48d9e8 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5513x1e48d9e8();
                c5513x1e48d9e8.f135844g.f89238a = j17;
                c5513x1e48d9e8.e();
            }
        }
    }
}
