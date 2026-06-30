package i93;

/* loaded from: classes11.dex */
public final class d extends wm3.a implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f371257d;

    /* renamed from: e, reason: collision with root package name */
    public p13.c f371258e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f371259f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f371257d = jz5.h.b(i93.c.f371256d);
        this.f371259f = jz5.h.b(new i93.a(activity));
    }

    public final float T6() {
        return ((java.lang.Number) ((jz5.n) this.f371259f).mo141623x754a37bb()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.CharSequence] */
    @Override // o13.x
    public void X2(p13.v vVar) {
        android.text.SpannableStringBuilder spannableStringBuilder;
        boolean z17;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        if (vVar != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (p13.y yVar : vVar.f432693e) {
                com.p314xaae8f345.mm.p2621x8fb0427b.d4 n17 = b93.r.wi().n1(yVar.f432720e);
                if (n17 != null) {
                    java.util.List j17 = ((l80.a) ((m80.i) i95.n0.c(m80.i.class))).f398522d.j(yVar.f432720e);
                    if (j17 == null) {
                        j17 = kz5.p0.f395529d;
                    }
                    java.lang.CharSequence charSequence = n17.f66586x7661fe9a;
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    java.util.List<java.lang.String> list = null;
                    switch (yVar.f432718c) {
                        case 66:
                            p13.j e17 = o13.q.e(p13.i.e(charSequence, vVar.f432692d, false, false, T6(), com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.d.f219567c));
                            if (e17.f432639b == 0) {
                                charSequence = e17.f432638a;
                                break;
                            }
                            break;
                        case 67:
                            p13.j e18 = o13.q.e(p13.i.e(charSequence, vVar.f432692d, true, false, T6(), com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.d.f219567c));
                            if (e18.f432639b == 0) {
                                charSequence = e18.f432638a;
                                break;
                            }
                            break;
                        case 68:
                            p13.j e19 = o13.q.e(p13.i.e(charSequence, vVar.f432692d, true, true, T6(), com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.d.f219567c));
                            if (e19.f432639b == 0) {
                                charSequence = e19.f432638a;
                                break;
                            }
                            break;
                        case 69:
                            u50.u uVar = new u50.u();
                            uVar.f506307d = vVar.f432692d;
                            uVar.f506304a = m158354x19263085();
                            uVar.f506305b = yVar.f432729n;
                            uVar.f506306c = (java.lang.String[]) j17.toArray(new java.lang.String[0]);
                            uVar.f506310g = (int) T6();
                            uVar.f506308e = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.d.f219569e;
                            uVar.f506311h = 8;
                            ((s50.r0) ((u50.y) i95.n0.c(u50.y.class))).getClass();
                            spannableStringBuilder = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.e(uVar);
                            break;
                    }
                    spannableStringBuilder = null;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new android.text.SpannableStringBuilder();
                        if (j17.isEmpty()) {
                            z17 = false;
                        } else if (j17.size() >= 8) {
                            z17 = false;
                            list = j17.subList(0, 8);
                        } else {
                            z17 = false;
                            list = j17.subList(0, j17.size());
                        }
                        if (list != null) {
                            for (java.lang.String str : list) {
                                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                                if (n18 != null) {
                                    ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                                    java.lang.String c17 = c01.a2.c(n18, str);
                                    if (spannableStringBuilder.length() > 0 ? true : z17) {
                                        spannableStringBuilder.append((java.lang.CharSequence) ", ");
                                    }
                                    spannableStringBuilder.append((java.lang.CharSequence) c17);
                                }
                            }
                        }
                    }
                    yVar.f432730o = new jz5.l(charSequence, spannableStringBuilder);
                    arrayList.add(n17);
                    arrayList2.add(yVar);
                }
            }
            if (m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1792xdec7722c.ActivityC16176xdf6c8530) {
                pm0.v.X(new i93.b(m158354x19263085, arrayList, arrayList2, vVar));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f371258e);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2559xed8e89a9.C20615x8ee66c89()) == 1) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6205xeec13785 c6205xeec13785 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6205xeec13785();
            c6205xeec13785.f136457g.f87952a = 0L;
            c6205xeec13785.e();
        }
    }
}
