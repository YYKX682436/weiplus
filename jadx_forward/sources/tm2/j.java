package tm2;

/* loaded from: classes3.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f502060d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(tm2.s2 s2Var) {
        super(1);
        this.f502060d = s2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        if (r10.m75942xfb822ef2(0) == 0) goto L22;
     */
    @Override // yz5.l
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo146xb9724478(java.lang.Object r10) {
        /*
            r9 = this;
            com.tencent.mm.modelbase.f r10 = (com.p314xaae8f345.mm.p944x882e457a.f) r10
            java.lang.String r0 = "result"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            int r0 = r10.f152148a
            if (r0 != 0) goto Lf
            int r1 = r10.f152149b
            if (r1 == 0) goto L17
        Lf:
            int r1 = r10.f152149b
            boolean r0 = hc2.p.b(r0, r1)
            if (r0 == 0) goto Lcf
        L17:
            com.tencent.mm.protobuf.f r10 = r10.f152151d
            r45.h51 r10 = (r45.h51) r10
            r0 = 2
            com.tencent.mm.protobuf.f r10 = r10.m75936x14adae67(r0)
            com.tencent.mm.protocal.protobuf.FinderObject r10 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) r10
            if (r10 == 0) goto Lcf
            tm2.s2 r1 = r9.f502060d
            java.lang.Class<mm2.c1> r2 = mm2.c1.class
            androidx.lifecycle.c1 r3 = r1.c(r2)
            mm2.c1 r3 = (mm2.c1) r3
            r3.a9(r10)
            androidx.lifecycle.c1 r10 = r1.c(r2)
            mm2.c1 r10 = (mm2.c1) r10
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r10.f410379n
            r3 = 0
            if (r10 == 0) goto L41
            r45.nw1 r10 = r10.m76794xd0557130()
            goto L42
        L41:
            r10 = r3
        L42:
            r4 = 0
            if (r10 == 0) goto L62
            androidx.lifecycle.c1 r10 = r1.c(r2)
            mm2.c1 r10 = (mm2.c1) r10
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r10.f410379n
            if (r10 == 0) goto L54
            r45.nw1 r10 = r10.m76794xd0557130()
            goto L55
        L54:
            r10 = r3
        L55:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r10)
            long r5 = r10.m75942xfb822ef2(r4)
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 != 0) goto L7a
        L62:
            androidx.lifecycle.c1 r10 = r1.c(r2)
            mm2.c1 r10 = (mm2.c1) r10
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r10.f410379n
            if (r10 != 0) goto L6d
            goto L7a
        L6d:
            java.lang.Class<mm2.e1> r5 = mm2.e1.class
            androidx.lifecycle.c1 r5 = r1.c(r5)
            mm2.e1 r5 = (mm2.e1) r5
            r45.nw1 r5 = r5.f410521r
            r10.m76887xcb0dd23c(r5)
        L7a:
            com.tencent.mm.plugin.finder.live.plugin.nd0 r10 = r1.f502128k
            if (r10 == 0) goto L82
            r5 = 3
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0.P1(r10, r3, r4, r5, r3)
        L82:
            androidx.lifecycle.c1 r10 = r1.c(r2)
            mm2.c1 r10 = (mm2.c1) r10
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r10.f410379n
            r5 = 1
            if (r10 == 0) goto L9d
            r45.nw1 r10 = r10.m76794xd0557130()
            if (r10 == 0) goto L9d
            r6 = 17
            int r10 = r10.m75939xb282bd08(r6)
            if (r10 != r5) goto L9d
            r10 = r5
            goto L9e
        L9d:
            r10 = r4
        L9e:
            if (r10 == 0) goto Lb0
            fm2.b r10 = r1.f101134c
            if (r10 == 0) goto Lcf
            androidx.lifecycle.c1 r1 = r1.c(r2)
            mm2.c1 r1 = (mm2.c1) r1
            java.lang.String r1 = r1.f410385o
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57621xc099750c(r10, r1, r4, r0, r3)
            goto Lcf
        Lb0:
            androidx.lifecycle.c1 r10 = r1.c(r2)
            mm2.c1 r10 = (mm2.c1) r10
            int r10 = r10.f410340g2
            r0 = 524288(0x80000, float:7.34684E-40)
            boolean r10 = pm0.v.z(r10, r0)
            if (r10 == 0) goto Lcf
            fm2.b r10 = r1.f101134c
            if (r10 == 0) goto Lcf
            androidx.lifecycle.c1 r0 = r1.c(r2)
            mm2.c1 r0 = (mm2.c1) r0
            java.lang.String r0 = r0.f410385o
            r10.m57645xc03d2e6f(r0, r5)
        Lcf:
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tm2.j.mo146xb9724478(java.lang.Object):java.lang.Object");
    }
}
