package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class eg extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.fg f188181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f188182e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188183f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.fg fgVar, long j17, java.lang.String str) {
        super(1);
        this.f188181d = fgVar;
        this.f188182e = j17;
        this.f188183f = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.ov0 ov0Var;
        java.util.LinkedList<r45.dl2> m75941xfb821914;
        r45.ov0 ov0Var2;
        java.util.LinkedList m75941xfb8219142;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.fg fgVar = this.f188181d;
        java.lang.String str = fgVar.f188274d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryFetchPreloadInfo errType:");
        java.lang.Integer num = null;
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152148a) : null);
        sb6.append(" errCode:");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152149b) : null);
        sb6.append(" feedId:");
        sb6.append(pm0.v.u(this.f188182e));
        sb6.append(" nonceId:");
        sb6.append(this.f188183f);
        sb6.append(" result:");
        if (fVar != null && (ov0Var2 = (r45.ov0) fVar.f152151d) != null && (m75941xfb8219142 = ov0Var2.m75941xfb821914(1)) != null) {
            num = java.lang.Integer.valueOf(m75941xfb8219142.size());
        }
        sb6.append(num);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (fVar != null && fVar.f152148a == 0) {
            if ((fVar != null && fVar.f152149b == 0) && fVar != null && (ov0Var = (r45.ov0) fVar.f152151d) != null && (m75941xfb821914 = ov0Var.m75941xfb821914(1)) != null) {
                for (r45.dl2 dl2Var : m75941xfb821914) {
                    long m75942xfb822ef2 = dl2Var != null ? dl2Var.m75942xfb822ef2(0) : 0L;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dl2Var);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.fg.O6(fgVar, m75942xfb822ef2, dl2Var);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
