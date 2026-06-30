package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes13.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f240499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f240500e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kd0.c3 f240501f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f240502g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f240503h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.p0 f240504i;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.p0 p0Var, java.util.List list, long j17, kd0.c3 c3Var, java.util.List list2, java.util.List list3) {
        this.f240504i = p0Var;
        this.f240499d = list;
        this.f240500e = j17;
        this.f240501f = c3Var;
        this.f240502g = list2;
        this.f240503h = list3;
    }

    @Override // java.lang.Runnable
    public void run() {
        kd0.c3 c3Var = this.f240501f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.p0 p0Var = this.f240504i;
        long j17 = this.f240500e;
        java.util.List<com.p314xaae8f345.p2891x34da02.C25311x69ff7e80> list = this.f240499d;
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecogQBarOfImageFileListener", "%d scan file no result", java.lang.Long.valueOf(j17));
            if (((java.util.HashMap) p0Var.f240506a.f240520d).containsKey(java.lang.Long.valueOf(j17))) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7 c5885x60bd3c7 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7();
                java.lang.String str = (java.lang.String) ((java.util.HashMap) p0Var.f240506a.f240520d).get(java.lang.Long.valueOf(j17));
                am.bq bqVar = c5885x60bd3c7.f136193g;
                bqVar.f87811a = str;
                boolean z17 = false;
                bqVar.f87812b = c3Var != null ? c3Var.f388158e : 0;
                if (c3Var != null && c3Var.f388159f) {
                    z17 = true;
                }
                bqVar.f87813c = z17;
                c5885x60bd3c7.e();
                ((java.util.HashMap) p0Var.f240506a.f240520d).remove(java.lang.Long.valueOf(j17));
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecogQBarOfImageFileListener", "%d scan file get %d results ", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(list.size()));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7();
        if (((java.util.HashMap) p0Var.f240506a.f240520d).containsKey(java.lang.Long.valueOf(j17))) {
            java.lang.String str2 = (java.lang.String) ((java.util.HashMap) p0Var.f240506a.f240520d).get(java.lang.Long.valueOf(j17));
            am.cq cqVar = c5886xd11a0be7.f136194g;
            cqVar.f87901a = str2;
            android.graphics.Point point = c3Var.f388157d;
            if (point != null) {
                cqVar.f87907g = point.x;
                cqVar.f87908h = point.y;
            }
            cqVar.f87912l = c3Var.f388159f;
            cqVar.f87911k = c3Var.f388158e;
            cqVar.f87914n = c3Var.f388161h;
            cqVar.f87902b = new java.util.ArrayList();
            cqVar.f87904d = new java.util.ArrayList();
            cqVar.f87906f = new java.util.ArrayList();
            cqVar.f87903c = new java.util.ArrayList();
            cqVar.f87905e = new java.util.ArrayList();
            cqVar.f87909i = new java.util.ArrayList();
            cqVar.f87910j = new java.util.ArrayList();
            cqVar.f87913m = new java.util.ArrayList();
            for (com.p314xaae8f345.p2891x34da02.C25311x69ff7e80 c25311x69ff7e80 : list) {
                cqVar.f87902b.add(c25311x69ff7e80.f556865f);
                cqVar.f87904d.add(c25311x69ff7e80.f556864e);
                cqVar.f87906f.add(java.lang.Integer.valueOf(c25311x69ff7e80.f556868i));
                cqVar.f87903c.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.j1.a(c25311x69ff7e80.f556864e)));
            }
            java.util.List list2 = this.f240502g;
            if (list2 != null && !list2.isEmpty()) {
                java.util.Iterator it = list2.iterator();
                while (it.hasNext()) {
                    cqVar.f87905e.add(java.lang.Integer.valueOf(((com.p314xaae8f345.p2891x34da02.C25312x3165f541) it.next()).f45430x93fa756a));
                }
            }
            java.util.List<com.p314xaae8f345.p2891x34da02.C25303x87b156a3> list3 = this.f240503h;
            if (list3 != null && !list3.isEmpty()) {
                for (com.p314xaae8f345.p2891x34da02.C25303x87b156a3 c25303x87b156a3 : list3) {
                    if (c25303x87b156a3 != null) {
                        float max = java.lang.Math.max(0.0f, (((c25303x87b156a3.f296763x0 + c25303x87b156a3.f296764x1) + c25303x87b156a3.f296765x2) + c25303x87b156a3.f296766x3) / 4.0f);
                        float max2 = java.lang.Math.max(0.0f, (((c25303x87b156a3.f296767y0 + c25303x87b156a3.f296768y1) + c25303x87b156a3.f296769y2) + c25303x87b156a3.f296770y3) / 4.0f);
                        cqVar.f87909i.add(java.lang.Float.valueOf(max));
                        cqVar.f87910j.add(java.lang.Float.valueOf(max2));
                        if (cqVar.f87907g > 0 && cqVar.f87908h > 0) {
                            float min = java.lang.Math.min(c25303x87b156a3.f296765x2, c25303x87b156a3.f296766x3);
                            float min2 = java.lang.Math.min(c25303x87b156a3.f296767y0, c25303x87b156a3.f296770y3);
                            float max3 = java.lang.Math.max(c25303x87b156a3.f296763x0, c25303x87b156a3.f296764x1);
                            float max4 = java.lang.Math.max(c25303x87b156a3.f296768y1, c25303x87b156a3.f296769y2);
                            int i17 = cqVar.f87907g;
                            int i18 = cqVar.f87908h;
                            cqVar.f87913m.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17258x2152d807(min / i17, min2 / i18, max3 / i17, max4 / i18));
                        }
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecogQBarOfImageFileListener", "mFileScanCallback result:%d codeName:%d codeType:%d codeVersion:$d codePointCenterX:%d codePointCenterY:%d", java.lang.Integer.valueOf(cqVar.f87902b.size()), java.lang.Integer.valueOf(cqVar.f87904d.size()), java.lang.Integer.valueOf(cqVar.f87903c.size()), java.lang.Integer.valueOf(cqVar.f87905e.size()), java.lang.Integer.valueOf(cqVar.f87909i.size()), java.lang.Integer.valueOf(cqVar.f87910j.size()));
            c5886xd11a0be7.e();
            ((java.util.HashMap) p0Var.f240506a.f240520d).remove(java.lang.Long.valueOf(j17));
        }
    }
}
