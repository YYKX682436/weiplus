package ek2;

/* loaded from: classes3.dex */
public final class p1 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f335047u;

    /* renamed from: v, reason: collision with root package name */
    public final int f335048v;

    /* renamed from: w, reason: collision with root package name */
    public final ek2.o1 f335049w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(long j17, byte[] bArr, java.lang.String str, long j18, r45.xl1 musicInfo, int i17, ek2.o1 callback) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicInfo, "musicInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f335047u = "Finder.CgiFinderLiveModBackgroundMusic";
        this.f335048v = i17;
        this.f335049w = callback;
        r45.j02 j02Var = new r45.j02();
        j02Var.set(1, db2.t4.f309704a.a(6813));
        j02Var.set(5, java.lang.Long.valueOf(j17));
        j02Var.set(4, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr));
        j02Var.set(2, str);
        j02Var.set(6, java.lang.Long.valueOf(j18));
        j02Var.set(3, musicInfo);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = j02Var;
        r45.k02 k02Var = new r45.k02();
        k02Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) k02Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = k02Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivemodbackgroundmusic";
        lVar.f152200d = 6813;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderLiveModBackgroundMusic init ");
        sb6.append(j02Var.m75942xfb822ef2(5));
        sb6.append(',');
        sb6.append(j02Var.m75945x2fec8307(2));
        sb6.append(", times:");
        sb6.append(i17);
        sb6.append(", song_id_list:");
        r45.xl1 xl1Var = (r45.xl1) j02Var.m75936x14adae67(3);
        sb6.append(xl1Var != null ? xl1Var.m75941xfb821914(0) : null);
        sb6.append(",liveCookies is null:");
        sb6.append(j02Var.m75934xbce7f2f(4) == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveModBackgroundMusic", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.k02 resp = (r45.k02) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(" times:");
        int i19 = this.f335048v;
        sb6.append(i19);
        sb6.append(" thread=");
        sb6.append(java.lang.Thread.currentThread());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f335047u, sb6.toString());
        xl2.a aVar = (xl2.a) this.f335049w;
        aVar.getClass();
        if (!(i17 == 0 && i18 == 0) && i19 < 3) {
            long j17 = aVar.f536641a;
            byte[] bArr = aVar.f536642b;
            java.lang.String str2 = aVar.f536643c;
            long j18 = aVar.f536644d;
            r45.xl1 musicInfo = aVar.f536645e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicInfo, "musicInfo");
            new ek2.p1(j17, bArr, str2, j18, musicInfo, i19 + 1, new xl2.a(j17, bArr, str2, j18, musicInfo)).l();
        }
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f306536e;
    }
}
