package cb2;

/* loaded from: classes.dex */
public final class a extends bq.e {

    /* renamed from: p, reason: collision with root package name */
    public static long f40341p;

    /* renamed from: o, reason: collision with root package name */
    public final long f40342o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r45.qt2 qt2Var, long j17, java.lang.String str, java.lang.String objectNonceId, java.lang.String content, long j18, int i17, int i18, long j19, long j27, int i19, long j28) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        kotlin.jvm.internal.o.g(content, "content");
        long c17 = c01.id.c();
        this.f40342o = c17;
        long j29 = f40341p;
        if (c17 < j29) {
            f40341p = 1 + j29;
            this.f40342o = j29;
        }
        f40341p = this.f40342o;
        r45.jp2 jp2Var = new r45.jp2();
        db2.t4 t4Var = db2.t4.f228171a;
        jp2Var.set(1, t4Var.b(7143, qt2Var));
        t4Var.h((r45.kv0) jp2Var.getCustom(1), qt2Var, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(5) : 0), java.lang.Long.valueOf(j17), str)));
        jp2Var.set(8, java.lang.String.valueOf(this.f40342o));
        jp2Var.set(2, java.lang.Long.valueOf(j17));
        jp2Var.set(9, objectNonceId);
        jp2Var.set(5, content);
        jp2Var.set(3, java.lang.Long.valueOf(j18));
        jp2Var.set(6, java.lang.Long.valueOf(i17));
        if (i17 == 6) {
            jp2Var.set(10, java.lang.Long.valueOf(j27));
        }
        jp2Var.set(7, java.lang.Integer.valueOf(i18));
        if (i18 == 2) {
            jp2Var.set(12, xy2.c.f(qt2Var));
        }
        jp2Var.set(11, java.lang.Integer.valueOf(i19));
        jp2Var.set(13, java.lang.Long.valueOf(j19));
        jp2Var.set(14, java.lang.Long.valueOf(j28));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderpostbulletcomment";
        lVar.f70667d = 7143;
        lVar.f70664a = jp2Var;
        lVar.f70665b = new r45.kp2();
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("FinderBulletPostCgi", "FinderBulletCgi videoObjectId=" + pm0.v.u(j17) + ", videoTimeStamp=" + j18 + ", content=" + content + ", feed_play_times=" + jp2Var.getInteger(11) + " finder_username=" + jp2Var.getString(12) + ' ');
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.kp2 resp = (r45.kp2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        hz2.d dVar = hz2.d.f286313a;
        dVar.d(i17, i18, com.tencent.mm.sdk.platformtools.t8.K0(str) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.p3n) : str);
        dVar.f(i17, i18, com.tencent.mm.sdk.platformtools.t8.K0(str) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.cpd) : str);
        java.lang.String string = com.tencent.mm.sdk.platformtools.t8.K0(str) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.p3n) : str;
        if (i17 == 4 && i18 == -4301 && string != null) {
            dVar.m(string);
        }
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.t8.K0(str) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.oit) : str;
        if (i17 == 4 && i18 == -4011 && string2 != null) {
            dVar.m(string2);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.p3m);
        }
        if (i17 == 4 && i18 == -4012 && str != null) {
            dVar.m(str);
        }
    }
}
