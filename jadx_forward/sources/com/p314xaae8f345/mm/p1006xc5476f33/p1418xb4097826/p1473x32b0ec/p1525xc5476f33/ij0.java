package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ij0 implements ek2.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jj0 f194514a;

    public ij0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jj0 jj0Var) {
        this.f194514a = jj0Var;
    }

    @Override // ek2.l0
    public void a(int i17, int i18, java.lang.String str, r45.gm1 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jj0 jj0Var = this.f194514a;
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hj0(jj0Var, resp));
        java.lang.String str2 = jj0Var.f194650p;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errType:");
        sb6.append(i17);
        sb6.append(", errCode:");
        sb6.append(i18);
        sb6.append(", musicInfo.song_id:");
        r45.d22 d22Var = jj0Var.f194656v;
        sb6.append(d22Var != null ? dk2.q.e(d22Var) : null);
        sb6.append(" musicInfo.song_name:");
        r45.d22 d22Var2 = jj0Var.f194656v;
        sb6.append(d22Var2 != null ? d22Var2.m75945x2fec8307(1) : null);
        sb6.append(" musicInfo.singer_name:");
        r45.d22 d22Var3 = jj0Var.f194656v;
        sb6.append(d22Var3 != null ? d22Var3.m75945x2fec8307(2) : null);
        sb6.append(" musicInfo.album_name:");
        r45.d22 d22Var4 = jj0Var.f194656v;
        sb6.append(d22Var4 != null ? d22Var4.m75945x2fec8307(3) : null);
        sb6.append(" musicInfo.genreTv:");
        r45.d22 d22Var5 = jj0Var.f194656v;
        sb6.append(d22Var5 != null ? d22Var5.m75945x2fec8307(5) : null);
        sb6.append(" musicInfo.public_time:");
        r45.d22 d22Var6 = jj0Var.f194656v;
        sb6.append(d22Var6 != null ? d22Var6.m75945x2fec8307(8) : null);
        sb6.append(" musicInfo.album_pic_url:");
        r45.d22 d22Var7 = jj0Var.f194656v;
        sb6.append(d22Var7 != null ? d22Var7.m75945x2fec8307(4) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
    }
}
