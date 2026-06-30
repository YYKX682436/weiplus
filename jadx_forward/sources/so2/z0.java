package so2;

/* loaded from: classes2.dex */
public class z0 extends so2.y0 {
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 E;
    public boolean F;
    public boolean G;
    public boolean H;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 r5) {
        /*
            r4 = this;
            java.lang.String r0 = "feed"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            com.tencent.mm.plugin.finder.storage.yj0 r0 = new com.tencent.mm.plugin.finder.storage.yj0
            r0.<init>()
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r1 = r0.u0()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1.m76120x6a832f1b(r2)
            r4.<init>(r0)
            r4.E = r5
            r5 = 1
            r4.F = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: so2.z0.<init>(com.tencent.mm.plugin.finder.storage.FinderItem):void");
    }

    @Override // so2.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return 0;
    }

    @Override // so2.y0, in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.E.f66939xc8a07680;
    }

    @Override // so2.y0, in5.c
    public int h() {
        return 3;
    }

    @Override // so2.y0
    public java.lang.String i() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = this.E.getFeedObject().m76802x2dd01666();
        if (m76802x2dd01666 != null) {
            return m76802x2dd01666.m76944x730bcac6();
        }
        return null;
    }
}
