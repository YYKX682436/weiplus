package ek2;

/* loaded from: classes.dex */
public final class k2 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f335022u;

    /* renamed from: v, reason: collision with root package name */
    public final ek2.j2 f335023v;

    /* renamed from: w, reason: collision with root package name */
    public final r45.t82 f335024w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(long j17, byte[] bArr, java.lang.String str, long j18, java.lang.String query, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, ek2.j2 callback) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f335022u = "Finder.CgiFinderLiveSearchMusicList";
        this.f335023v = callback;
        r45.t82 t82Var = new r45.t82();
        this.f335024w = t82Var;
        t82Var.set(1, db2.t4.f309704a.a(6291));
        t82Var.set(4, java.lang.Long.valueOf(j17));
        t82Var.set(3, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr));
        t82Var.set(2, str);
        t82Var.set(5, java.lang.Long.valueOf(j18));
        t82Var.set(6, query);
        t82Var.set(7, gVar);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = t82Var;
        r45.u82 u82Var = new r45.u82();
        u82Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) u82Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = u82Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivesearchmusiclist";
        lVar.f152200d = 6291;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderLiveSearchMusicList init ");
        sb6.append(t82Var.m75942xfb822ef2(4));
        sb6.append(',');
        sb6.append(t82Var.m75945x2fec8307(2));
        sb6.append(",query:");
        sb6.append(t82Var.m75945x2fec8307(6));
        sb6.append(",liveCookies is null:");
        sb6.append(t82Var.m75934xbce7f2f(3) == null);
        sb6.append(", last_buffer:");
        sb6.append(t82Var.m75934xbce7f2f(7));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveSearchMusicList", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.u82 resp = (r45.u82) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(" resp size:");
        java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(1);
        sb6.append(m75941xfb821914 != null ? java.lang.Integer.valueOf(m75941xfb821914.size()) : null);
        sb6.append(" continueFlag:");
        sb6.append(resp.m75939xb282bd08(3));
        sb6.append(" thread=");
        sb6.append(java.lang.Thread.currentThread());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.f335022u;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7);
        if (zl2.q4.f555466a.E()) {
            java.util.LinkedList<r45.d22> m75941xfb8219142 = resp.m75941xfb821914(1);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("搜索内容:" + this.f335024w.m75945x2fec8307(6) + '\n');
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75941xfb8219142);
            for (r45.d22 d22Var : m75941xfb8219142) {
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                sb9.append(d22Var.m75945x2fec8307(1));
                sb9.append('(');
                sb9.append(d22Var.m75945x2fec8307(2));
                sb9.append("),url is empty:");
                java.lang.String m75945x2fec8307 = d22Var.m75945x2fec8307(7);
                sb9.append(m75945x2fec8307 == null || m75945x2fec8307.length() == 0);
                sb9.append(", playable:");
                sb9.append(d22Var.m75933x41a8a7f2(6));
                sb9.append('\n');
                sb8.append(sb9.toString());
            }
            zl2.r4 r4Var = zl2.r4.f555483a;
            java.lang.String sb10 = sb8.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb10, "toString(...)");
            r4Var.M2(str2, sb10);
        }
        this.f335023v.a(i17, i18, str, resp);
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f306536e;
    }
}
