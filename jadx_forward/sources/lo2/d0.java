package lo2;

/* loaded from: classes10.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f401644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14485xd3a2499f f401645e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14485xd3a2499f activityC14485xd3a2499f, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f401645e = activityC14485xd3a2499f;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new lo2.d0(this.f401645e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((lo2.d0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Throwable, java.lang.Object, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r10v7 */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14485xd3a2499f activityC14485xd3a2499f;
        pz5.a aVar;
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15172xcfc1ad85 c15172xcfc1ad85;
        int i17;
        ?? r102;
        java.util.LinkedList<r45.mb4> m59264x7efe73ec;
        r45.mb4 mb4Var;
        java.util.LinkedList<r45.mb4> m59264x7efe73ec2;
        r45.mb4 mb4Var2;
        pz5.a aVar2 = pz5.a.f440719d;
        int i18 = this.f401644d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14485xd3a2499f activityC14485xd3a2499f2 = this.f401645e;
        if (i18 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f401644d = 1;
            r45.kb4 kb4Var = activityC14485xd3a2499f2.A;
            if (kb4Var != null) {
                java.util.LinkedList m75941xfb821914 = kb4Var.m75941xfb821914(0);
                r45.mb4 mb4Var3 = m75941xfb821914 != null ? (r45.mb4) m75941xfb821914.getFirst() : null;
                if (mb4Var3 == null) {
                    c15172xcfc1ad85 = null;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079();
                    c14994x9b99c079.m59394x4a87835d(new java.util.LinkedList<>());
                    java.util.LinkedList<r45.mb4> m59263x143e8851 = c14994x9b99c079.m59263x143e8851();
                    r45.kb4 kb4Var2 = activityC14485xd3a2499f2.A;
                    java.util.LinkedList m75941xfb8219142 = kb4Var2 != null ? kb4Var2.m75941xfb821914(0) : null;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75941xfb8219142);
                    m59263x143e8851.addAll(m75941xfb8219142);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88.f36135x233c02ec.b(c14994x9b99c079);
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    c15172xcfc1ad85 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15172xcfc1ad85(context);
                    c15172xcfc1ad85.m61190xf0c430f7(600000L);
                    c15172xcfc1ad85.n(ds2.h.f324399a.c(activityC14485xd3a2499f2.f202936u, mb4Var3, false), true, b17);
                    c15172xcfc1ad85.mo56716x4121a19(true);
                    c15172xcfc1ad85.mo56708x764cf626(true);
                }
                obj2 = c15172xcfc1ad85;
                activityC14485xd3a2499f = activityC14485xd3a2499f2;
                aVar = aVar2;
            } else {
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                if (b6Var != null) {
                    activityC14485xd3a2499f = activityC14485xd3a2499f2;
                    aVar = aVar2;
                    obj2 = zy2.b6.Tf(b6Var, activityC14485xd3a2499f2.f202936u, activityC14485xd3a2499f2.f202937v, 25, 600000L, null, null, null, false, null, this, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
                } else {
                    activityC14485xd3a2499f = activityC14485xd3a2499f2;
                    aVar = aVar2;
                    obj2 = null;
                }
            }
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            obj2 = obj;
            activityC14485xd3a2499f = activityC14485xd3a2499f2;
        }
        zy2.g5 g5Var = (zy2.g5) obj2;
        if (g5Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14485xd3a2499f activityC14485xd3a2499f3 = activityC14485xd3a2499f;
            activityC14485xd3a2499f3.f202941z = g5Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(activityC14485xd3a2499f3.f202936u);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19717xb0837240 c19717xb0837240 = activityC14485xd3a2499f3.f202938w;
            long j17 = 0;
            if (c19717xb0837240 != null) {
                c19717xb0837240.m75647x457bdbf5((h17 == null || (m59264x7efe73ec2 = h17.m59264x7efe73ec()) == null || (mb4Var2 = (r45.mb4) kz5.n0.Z(m59264x7efe73ec2)) == null) ? 0L : mb4Var2.m75942xfb822ef2(24));
            }
            if (h17 != null && (m59264x7efe73ec = h17.m59264x7efe73ec()) != null && (mb4Var = (r45.mb4) kz5.n0.Z(m59264x7efe73ec)) != null) {
                j17 = mb4Var.m75942xfb822ef2(24);
            }
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14485xd3a2499f.F;
            int i27 = j17 > ((long) 16000) ? 0 : 8;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19717xb0837240 c19717xb08372402 = activityC14485xd3a2499f3.f202938w;
            if (c19717xb08372402 != null && activityC14485xd3a2499f3.f202939x != null && activityC14485xd3a2499f3.f202940y) {
                c19717xb08372402.setVisibility(i27);
                android.widget.ImageView imageView = activityC14485xd3a2499f3.f202939x;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
                imageView.setVisibility(i27);
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19717xb0837240 c19717xb08372403 = activityC14485xd3a2499f3.f202938w;
            if (c19717xb08372403 != null) {
                c19717xb08372403.m75648x95acfdd2(new lo2.b0(activityC14485xd3a2499f3));
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19717xb0837240 c19717xb08372404 = activityC14485xd3a2499f3.f202938w;
            if (c19717xb08372404 != null) {
                c19717xb08372404.m75646xaa87fdc3(new lo2.c0(activityC14485xd3a2499f3, g5Var));
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19717xb0837240 c19717xb08372405 = activityC14485xd3a2499f3.f202938w;
            if (c19717xb08372405 != null) {
                i17 = 1;
                c19717xb08372405.f272672u = true;
                r102 = 0;
                p3325xe03a0797.p3326xc267989b.l.d(c19717xb08372405.f272671t, null, null, new z35.y(c19717xb08372405, null), 3, null);
            } else {
                i17 = 1;
                r102 = 0;
            }
            android.widget.FrameLayout frameLayout = activityC14485xd3a2499f3.f202935t;
            if (frameLayout == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoContainer");
                throw r102;
            }
            frameLayout.addView(g5Var.mo56698x4ee17f0a());
            g5Var.mo56709x764d819b(false);
            zy2.g5.u(g5Var, r102, i17, r102);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = r102;
            if (g5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) {
                c15188xd8bd4bd = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) g5Var;
            }
            if (c15188xd8bd4bd != null) {
                c15188xd8bd4bd.mo56713xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.CONTAIN);
            }
            g5Var.mo56704x526554de(activityC14485xd3a2499f3);
        }
        return jz5.f0.f384359a;
    }
}
