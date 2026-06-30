package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class t8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5467x4cfefe32 f214625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15277xde4785e4 f214626e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5467x4cfefe32 c5467x4cfefe32, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15277xde4785e4 abstractC15277xde4785e4) {
        super(0);
        this.f214625d = c5467x4cfefe32;
        this.f214626e = abstractC15277xde4785e4;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList m75941xfb821914;
        am.cb cbVar = this.f214625d.f135805g;
        long j17 = cbVar.f87876a;
        r45.yl2 yl2Var = cbVar.f87877b;
        int i17 = cbVar.f87878c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15277xde4785e4 abstractC15277xde4785e4 = this.f214626e;
        java.lang.String f204194d = abstractC15277xde4785e4.getF204194d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FinderExposeChangedEventListener] feedId=");
        sb6.append(j17);
        sb6.append(" commentList=");
        sb6.append((yl2Var == null || (m75941xfb821914 = yl2Var.m75941xfb821914(0)) == null) ? null : java.lang.Integer.valueOf(m75941xfb821914.size()));
        sb6.append(" totalCommentCount=");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f204194d, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c17 = abstractC15277xde4785e4.c(j17);
        if (c17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractC15277xde4785e4.getF204194d(), "[FinderExposeChangedEventListener] feedObject: " + c17.getFeedObject().hashCode() + ", " + c17.m59251x5db1b11());
            if (yl2Var != null) {
                java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87> m75941xfb8219142 = yl2Var.m75941xfb821914(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getCommentList(...)");
                c17.m59356xed9985db(m75941xfb8219142);
            }
            if (i17 >= 0) {
                c17.m59355xc51b2372(i17);
            }
            abstractC15277xde4785e4.e(j17, yl2Var);
        }
        return jz5.f0.f384359a;
    }
}
