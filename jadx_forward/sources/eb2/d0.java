package eb2;

/* loaded from: classes2.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f332261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f332262e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eb2.e0 f332263f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 f332264g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(boolean z17, int i17, eb2.e0 e0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 n0Var) {
        super(1);
        this.f332261d = z17;
        this.f332262e = i17;
        this.f332263f = e0Var;
        this.f332264g = n0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        r45.wj2 wj2Var;
        r45.wj2 wj2Var2;
        java.util.LinkedList m75941xfb821914;
        com.p314xaae8f345.mm.p944x882e457a.f fVar2 = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCgiBack errType=");
        sb6.append(fVar2 != null ? java.lang.Integer.valueOf(fVar2.f152148a) : null);
        sb6.append(", errCode=");
        sb6.append(fVar2 != null ? java.lang.Integer.valueOf(fVar2.f152149b) : null);
        sb6.append(", itemCount=");
        sb6.append((fVar2 == null || (wj2Var2 = (r45.wj2) fVar2.f152151d) == null || (m75941xfb821914 = wj2Var2.m75941xfb821914(1)) == null) ? null : java.lang.Integer.valueOf(m75941xfb821914.size()));
        sb6.append(" isLoadMore ");
        sb6.append(this.f332261d);
        sb6.append(" pullType ");
        int i17 = this.f332262e;
        sb6.append(i17);
        sb6.append(" buffer ");
        sb6.append((fVar2 == null || (wj2Var = (r45.wj2) fVar2.f152151d) == null) ? null : wj2Var.m75945x2fec8307(2));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNativeDramaRecommendFetcher", sb6.toString());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 n0Var = this.f332264g;
        if (fVar2 == null || fVar2.f152148a != 0 || fVar2.f152149b != 0 || (fVar = fVar2.f152151d) == null) {
            eb2.c0 c0Var = new eb2.c0(fVar2 != null ? fVar2.f152148a : -1, fVar2 != null ? fVar2.f152149b : -1, fVar2 != null ? fVar2.f152150c : null);
            c0Var.m56423xd4b4a5a1(i17);
            n0Var.mo55587xb461ee3d(c0Var);
        } else {
            java.lang.String m75945x2fec8307 = ((r45.wj2) fVar).m75945x2fec8307(2);
            eb2.e0 e0Var = this.f332263f;
            e0Var.f332269e = m75945x2fec8307;
            java.lang.String m75945x2fec83072 = ((r45.wj2) fVar2.f152151d).m75945x2fec8307(2);
            e0Var.f332270f = !(m75945x2fec83072 == null || m75945x2fec83072.length() == 0);
            java.util.LinkedList<r45.jt4> m75941xfb8219142 = ((r45.wj2) fVar2.f152151d).m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getRecommend_item_info(...)");
            for (r45.jt4 jt4Var : m75941xfb8219142) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jt4Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d5 b17 = e0Var.b(jt4Var);
                if (b17 != null) {
                    b17.f189325d.set(2, java.lang.Long.valueOf(((r45.wj2) fVar2.f152151d).m75942xfb822ef2(3)));
                    linkedList.add(b17);
                }
            }
            eb2.c0 c0Var2 = new eb2.c0(fVar2.f152148a, fVar2.f152149b, fVar2.f152150c);
            c0Var2.m56420x2a5f836b(linkedList);
            java.lang.String m75945x2fec83073 = ((r45.wj2) fVar2.f152151d).m75945x2fec8307(2);
            c0Var2.m56419xdac5ee4d(!(m75945x2fec83073 == null || m75945x2fec83073.length() == 0));
            c0Var2.m56423xd4b4a5a1(i17);
            n0Var.mo55587xb461ee3d(c0Var2);
        }
        return jz5.f0.f384359a;
    }
}
