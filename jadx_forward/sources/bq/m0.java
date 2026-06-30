package bq;

/* loaded from: classes2.dex */
public final class m0 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public boolean f105026o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m0(int r3, com.p314xaae8f345.mm.p2495xc50a8b8b.g r4, r45.qt2 r5, com.p314xaae8f345.mm.p2495xc50a8b8b.g r6, com.p314xaae8f345.mm.p2495xc50a8b8b.g r7, int r8, int r9, p3321xbce91901.jvm.p3324x21ffc6bd.i r10) {
        /*
            r2 = this;
            r10 = r9 & 4
            r0 = 0
            if (r10 == 0) goto L6
            r5 = r0
        L6:
            r10 = r9 & 8
            if (r10 == 0) goto Lb
            r6 = r0
        Lb:
            r10 = r9 & 16
            if (r10 == 0) goto L10
            r7 = r0
        L10:
            r9 = r9 & 32
            if (r9 == 0) goto L15
            r8 = 0
        L15:
            r2.<init>(r5)
            com.tencent.mm.modelbase.l r9 = new com.tencent.mm.modelbase.l
            r9.<init>()
            r45.hu2 r10 = new r45.hu2
            r10.<init>()
            db2.t4 r0 = db2.t4.f309704a
            r1 = 4069(0xfe5, float:5.702E-42)
            r45.kv0 r5 = r0.b(r1, r5)
            r0 = 1
            r10.set(r0, r5)
            r5 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r10.set(r5, r3)
            r3 = 3
            r10.set(r3, r4)
            r3 = 4
            r10.set(r3, r6)
            r3 = 5
            r10.set(r3, r7)
            r3 = 6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r10.set(r3, r4)
            r9.f152197a = r10
            r45.iu2 r3 = new r45.iu2
            r3.<init>()
            r9.f152198b = r3
            java.lang.String r3 = "/cgi-bin/micromsg-bin/findersearchgethotwordlist"
            r9.f152199c = r3
            r9.f152200d = r1
            com.tencent.mm.modelbase.o r3 = r9.a()
            r2.p(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bq.m0.<init>(int, com.tencent.mm.protobuf.g, r45.qt2, com.tencent.mm.protobuf.g, com.tencent.mm.protobuf.g, int, int, kotlin.jvm.internal.i):void");
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.iu2 resp = (r45.iu2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderBaseCgi", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
