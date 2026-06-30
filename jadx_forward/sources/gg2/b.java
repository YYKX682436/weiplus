package gg2;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final tc2.g f353197a;

    public b(tc2.g store) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f353197a = store;
    }

    public abstract java.lang.Object a(android.view.View view, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57);

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof gg2.a
            if (r0 == 0) goto L13
            r0 = r8
            gg2.a r0 = (gg2.a) r0
            int r1 = r0.f353196g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f353196g = r1
            goto L18
        L13:
            gg2.a r0 = new gg2.a
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f353194e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f353196g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r0 = r0.f353193d
            android.view.View r0 = (android.view.View) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L62
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            tc2.g r8 = r7.f353197a
            in5.s0 r8 = r8.f498682i
            if (r8 == 0) goto L40
            android.content.Context r8 = r8.f374654e
            goto L41
        L40:
            r8 = r4
        L41:
            if (r8 != 0) goto L44
            return r4
        L44:
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r8)
            int r2 = r7.c()
            r5 = 0
            android.view.View r8 = r8.inflate(r2, r4, r5)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r8)
            r0.f353193d = r8
            r0.f353196g = r3
            java.lang.Object r0 = r7.a(r8, r0)
            if (r0 != r1) goto L5f
            return r1
        L5f:
            r6 = r0
            r0 = r8
            r8 = r6
        L62:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L6b
            return r0
        L6b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: gg2.b.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public abstract int c();

    public final java.util.HashMap d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m59240x7c94657b;
        r45.nw1 m76794xd0557130;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f353197a.f498681h;
        return kz5.c1.i(new jz5.l("liveid", java.lang.String.valueOf((abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (m59240x7c94657b = feedObject.m59240x7c94657b()) == null || (m76794xd0557130 = m59240x7c94657b.m76794xd0557130()) == null) ? 0L : m76794xd0557130.m75942xfb822ef2(0))), new jz5.l("components_bar_type", java.lang.String.valueOf(e())), new jz5.l("components_bar_txt", f()));
    }

    public abstract int e();

    public abstract java.lang.String f();

    public abstract int g();

    public final r45.kr0 h() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f353197a.f498681h;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m59240x7c94657b = (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null) ? null : feedObject.m59240x7c94657b();
        if (m59240x7c94657b != null) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.d(m59240x7c94657b);
        }
        return null;
    }

    public abstract java.lang.String i();

    public boolean j(gg2.b other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return false;
    }

    public final void k() {
        uc2.g gVar = (uc2.g) this.f353197a.b(uc2.g.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3.f184154a.d(gVar != null ? ((sb2.l) gVar).c7() : null, ml2.t1.f409474d3, d());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i(), "ILiveConvertExpItem report click, type = " + e() + ", wording = " + f());
    }
}
