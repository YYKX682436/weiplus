package zv2;

/* loaded from: classes10.dex */
public final class s extends zv2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786 jumpView) {
        super(activity, jumpView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004a  */
    @Override // zv2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "jumpInfo"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            super.d(r8)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r8 = r7.f557930f
            r0 = 2
            r1 = 0
            r2 = 1
            r3 = 0
            if (r8 == 0) goto L42
            java.util.LinkedList r8 = r8.m76521x7528c3fb()
            if (r8 == 0) goto L42
            java.util.Iterator r8 = r8.iterator()
        L1a:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L34
            java.lang.Object r4 = r8.next()
            r5 = r4
            r45.wf6 r5 = (r45.wf6) r5
            int r5 = r5.m75939xb282bd08(r0)
            r6 = 5
            if (r5 != r6) goto L30
            r5 = r2
            goto L31
        L30:
            r5 = r1
        L31:
            if (r5 == 0) goto L1a
            goto L35
        L34:
            r4 = r3
        L35:
            r45.wf6 r4 = (r45.wf6) r4
            if (r4 == 0) goto L42
            r8 = 8
            com.tencent.mm.protobuf.f r8 = r4.m75936x14adae67(r8)
            r45.su r8 = (r45.su) r8
            goto L43
        L42:
            r8 = r3
        L43:
            if (r8 == 0) goto L4a
            java.lang.String r4 = r8.m75945x2fec8307(r2)
            goto L4b
        L4a:
            r4 = r3
        L4b:
            if (r4 == 0) goto L56
            int r4 = r4.length()
            if (r4 != 0) goto L54
            goto L56
        L54:
            r4 = r1
            goto L57
        L56:
            r4 = r2
        L57:
            if (r4 == 0) goto L63
            r8 = 2131766598(0x7f102d46, float:1.916439E38)
            androidx.appcompat.app.AppCompatActivity r2 = r7.f557928d
            java.lang.String r8 = r2.getString(r8)
            goto L6d
        L63:
            if (r8 == 0) goto L6b
            java.lang.String r8 = r8.m75945x2fec8307(r2)
            if (r8 != 0) goto L6d
        L6b:
            java.lang.String r8 = ""
        L6d:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r8)
            com.tencent.mm.plugin.finder.view.FinderJumperView r2 = r7.f557929e
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786.c(r2, r8, r1, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zv2.s.d(com.tencent.mm.protocal.protobuf.FinderJumpInfo):void");
    }

    @Override // zv2.b
    public void f() {
        super.f();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786 c15305x8b2e5786 = this.f557929e;
        c15305x8b2e5786.m62139x783f7bd3(com.p314xaae8f345.mm.R.raw.f81311x8a0b4ea5);
        c15305x8b2e5786.m62142x7daa20f8(com.p314xaae8f345.mm.R.raw.f81311x8a0b4ea5);
        c15305x8b2e5786.m62141xb8c4b266(b3.l.m9702x7444d5ad(this.f557928d, com.p314xaae8f345.mm.R.C30859x5a72f63.akk));
        c15305x8b2e5786.m62143xcdccfa32(false);
    }

    @Override // zv2.b
    public void l() {
        ry2.j.f482931a.a(this.f557928d, kz5.b0.c(new ry2.f(2, com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23, 0, new zv2.r(this), null, 20, null)), null);
    }
}
