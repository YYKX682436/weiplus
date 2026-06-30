package c61;

/* loaded from: classes8.dex */
public final class oa extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f120742d;

    /* renamed from: e, reason: collision with root package name */
    public final long f120743e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24574xdd503f00 f120744f;

    public oa(byte[] rawData, long j17, com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24574xdd503f00 extInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawData, "rawData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        this.f120742d = rawData;
        this.f120743e = j17;
        this.f120744f = extInfo;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public int op(int i17, java.lang.Object... objs) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objs, "objs");
        if (i17 != 1) {
            return super.op(i17, java.util.Arrays.copyOf(objs, objs.length));
        }
        r45.he heVar = this.f76494x2de60e5e;
        int i18 = heVar != null ? b36.f.i(1, heVar.mo75928xcd1e8d8()) + 0 : 0;
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24574xdd503f00 extInfo = this.f120744f;
        if (extInfo.m91097x9f715830() > 1) {
            en3.b0 b0Var = (en3.b0) ((ra0.w) i95.n0.c(ra0.w.class));
            b0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
            java.lang.Long m91098x7520bed6 = extInfo.m91098x7520bed6();
            r45.kv0 Bi = b0Var.Bi(m91098x7520bed6 != null ? (int) m91098x7520bed6.longValue() : 0, (int) this.f120743e);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List<java.lang.String> m91096xea80878d = extInfo.m91096xea80878d();
            if (m91096xea80878d != null) {
                for (java.lang.String str : m91096xea80878d) {
                    java.lang.Long m91098x7520bed62 = extInfo.m91098x7520bed6();
                    arrayList.add(new jz5.l(java.lang.Integer.valueOf(m91098x7520bed62 != null ? (int) m91098x7520bed62.longValue() : 0), java.lang.Long.valueOf(pm0.v.Z(str))));
                }
            }
            db2.t4.i(db2.t4.f309704a, Bi, arrayList, null, 4, null);
            i18 += b36.f.i((int) extInfo.m91097x9f715830(), Bi.mo75928xcd1e8d8());
        }
        return i18 + this.f120742d.length;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toByteArray */
    public byte[] mo14344x5f01b1f6() {
        int i17;
        mo75964xab491916();
        byte[] bArr = new byte[mo75928xcd1e8d8()];
        g36.f fVar = new g36.f(bArr);
        r45.he heVar = this.f76494x2de60e5e;
        if (heVar != null) {
            fVar.i(1, heVar.mo75928xcd1e8d8());
            this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            i17 = b36.f.i(1, this.f76494x2de60e5e.mo75928xcd1e8d8());
        } else {
            i17 = 0;
        }
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24574xdd503f00 extInfo = this.f120744f;
        if (extInfo.m91097x9f715830() > 1) {
            en3.b0 b0Var = (en3.b0) ((ra0.w) i95.n0.c(ra0.w.class));
            b0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
            java.lang.Long m91098x7520bed6 = extInfo.m91098x7520bed6();
            r45.kv0 Bi = b0Var.Bi(m91098x7520bed6 != null ? (int) m91098x7520bed6.longValue() : 0, (int) this.f120743e);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List<java.lang.String> m91096xea80878d = extInfo.m91096xea80878d();
            if (m91096xea80878d != null) {
                for (java.lang.String str : m91096xea80878d) {
                    java.lang.Long m91098x7520bed62 = extInfo.m91098x7520bed6();
                    arrayList.add(new jz5.l(java.lang.Integer.valueOf(m91098x7520bed62 != null ? (int) m91098x7520bed62.longValue() : 0), java.lang.Long.valueOf(pm0.v.Z(str))));
                }
            }
            db2.t4.i(db2.t4.f309704a, Bi, arrayList, null, 4, null);
            fVar.i((int) extInfo.m91097x9f715830(), Bi.mo75928xcd1e8d8());
            Bi.mo75956x3d5d1f78(fVar);
            i17 += b36.f.i((int) extInfo.m91097x9f715830(), Bi.mo75928xcd1e8d8());
        }
        byte[] bArr2 = this.f120742d;
        java.lang.System.arraycopy(bArr2, 0, bArr, i17, bArr2.length);
        return bArr;
    }
}
