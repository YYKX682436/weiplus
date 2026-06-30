package j93;

/* loaded from: classes.dex */
public final class g2 extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f379926d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f379927e;

    public g2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f379926d = activity;
        new java.util.ArrayList();
        this.f379927e = new java.util.ArrayList();
        jz5.h.b(j93.f2.f379915d);
        new java.util.HashSet();
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        j75.f m67437x4bd5310;
        wi5.n0 n0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        java.util.ArrayList arrayList = this.f379927e;
        int size = arrayList.size();
        int i17 = request.f544677b;
        if (i17 < size) {
            int size2 = arrayList.size();
            int i18 = request.f544678c + i17;
            if (size2 > i18) {
                dVar.f544681b = true;
            } else {
                i18 = arrayList.size();
            }
            java.util.ArrayList<com.p314xaae8f345.mm.p2621x8fb0427b.d4> arrayList2 = new java.util.ArrayList();
            while (i17 < i18) {
                arrayList2.add(arrayList.get(i17));
                i17++;
            }
            for (com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var : arrayList2) {
                ti5.b bVar = new ti5.b(null, null, 0, 0, 0, 0, null, false, 255, null);
                ri5.h hVar = ri5.j.I;
                java.lang.String valueOf = java.lang.String.valueOf(d4Var.f66585x70ce48ca);
                int i19 = ri5.j.Z;
                java.lang.String id6 = hVar.a(valueOf, i19, 0);
                java.lang.String labelId = java.lang.String.valueOf(d4Var.f66585x70ce48ca);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(d4Var.f66586x7661fe9a);
                sb6.append('(');
                java.util.List j17 = ((b93.b) c93.a.a()).j(java.lang.String.valueOf(d4Var.f66585x70ce48ca));
                sb6.append(j17 != null ? j17.size() : 0);
                sb6.append(')');
                java.lang.String labelName = sb6.toString();
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f379926d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelId, "labelId");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelName, "labelName");
                ri5.j jVar = new ri5.j(id6, i19, labelId, labelName, bVar, 0, 32, null);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.List j18 = ((b93.b) c93.a.a()).j(labelId);
                if (j18 != null) {
                    if (!(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(j18))) {
                        j18 = null;
                    }
                    if (j18 != null) {
                        int i27 = 0;
                        for (java.lang.Object obj : j18) {
                            int i28 = i27 + 1;
                            if (i27 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) obj, true);
                            if (n17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.D0())) {
                                java.lang.String D0 = n17.D0();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D0, "getContactLabelIds(...)");
                                if (r26.n0.B(D0, labelId, false)) {
                                    if (android.text.TextUtils.isEmpty(n17.P0())) {
                                        arrayList3.add(n17.t0());
                                    } else {
                                        arrayList3.add(n17.P0());
                                    }
                                }
                            }
                            i27 = i28;
                        }
                    }
                }
                java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList3, ",");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "listToString(...)");
                jVar.n(c17);
                if ((activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) && (m67437x4bd5310 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) activity).m67437x4bd5310()) != null && (n0Var = (wi5.n0) m67437x4bd5310.mo140437x75286adb()) != null) {
                    jVar.f477660x = n0Var.e();
                    java.lang.String str = jVar.f477644f;
                    jVar.f477659w = n0Var.f(str);
                    boolean d17 = n0Var.d(str);
                    jVar.f477658v = d17;
                    jVar.f477648l1 = !d17 && n0Var.e(str);
                }
                jVar.D = true;
                jVar.C = true;
                dVar.f544682c.add(jVar);
            }
        }
        k0Var.e(dVar);
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.r(k0Var);
    }

    @Override // ym3.f
    /* renamed from: getPriority */
    public int mo57139x3662b71a() {
        return 1;
    }

    @Override // ym3.f
    /* renamed from: onCreate */
    public void mo10202x3e5a77bb() {
        java.util.ArrayList f17 = b93.r.wi().f1();
        if (f17 != null) {
            java.util.ArrayList arrayList = this.f379927e;
            arrayList.clear();
            arrayList.addAll(f17);
        }
    }
}
