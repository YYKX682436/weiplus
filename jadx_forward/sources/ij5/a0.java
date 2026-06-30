package ij5;

/* loaded from: classes.dex */
public final class a0 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f373282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ij5.d0 f373283e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wi5.z f373284f;

    public a0(java.util.HashMap hashMap, ij5.d0 d0Var, wi5.z zVar) {
        this.f373282d = hashMap;
        this.f373283e = d0Var;
        this.f373284f = zVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p13.v vVar;
        ij5.d0 d0Var;
        j75.f m67437x4bd5310;
        wi5.n0 n0Var;
        p13.v vVar2 = (p13.v) obj;
        int i17 = 0;
        java.lang.Integer num = new java.lang.Integer(0);
        java.util.HashMap hashMap = this.f373282d;
        hashMap.put(num, vVar2);
        ij5.d0 d0Var2 = this.f373283e;
        j75.f Q6 = d0Var2.Q6();
        if (Q6 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List list = vVar2.f432693e;
            if (list != null) {
                int i18 = 0;
                for (java.lang.Object obj2 : list) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    p13.y yVar = (p13.y) obj2;
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(yVar.f432720e, true);
                    if (n17 == null || n17.s2()) {
                        vVar = vVar2;
                        d0Var = d0Var2;
                    } else {
                        vi5.h hVar = new vi5.h(0L, yVar, vVar2.f432692d, i18, 1, null);
                        ri5.h hVar2 = ri5.j.I;
                        int i27 = ri5.j.W;
                        java.lang.String d17 = n17.d1();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
                        java.lang.String id6 = hVar2.a(d17, i27, i17);
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = d0Var2.m158354x19263085();
                        java.lang.String str = (java.lang.String) ((jz5.n) d0Var2.f373297g).mo141623x754a37bb();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "<get-selectShowHeadDisplay>(...)");
                        java.lang.String str2 = (java.lang.String) ((jz5.n) d0Var2.f373298h).mo141623x754a37bb();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "<get-chatroomSessionWord>(...)");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
                        vVar = vVar2;
                        si5.e b17 = si5.b.f489858a.b(activity, hVar.f519166c, n17, hVar.f519165b, null);
                        d0Var = d0Var2;
                        java.lang.String d18 = n17.d1();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d18, "getUsername(...)");
                        java.lang.CharSequence charSequence = b17.f489862a;
                        if (charSequence == null) {
                            charSequence = "";
                        }
                        ri5.j jVar = new ri5.j(id6, i27, d18, charSequence, hVar, 0, 32, null);
                        jVar.n(b17.f489863b);
                        if ((activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) && (m67437x4bd5310 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) activity).m67437x4bd5310()) != null && (n0Var = (wi5.n0) m67437x4bd5310.mo140437x75286adb()) != null) {
                            jVar.f477660x = n0Var.e();
                            java.lang.String str3 = jVar.f477644f;
                            jVar.f477659w = n0Var.f(str3);
                            boolean d19 = n0Var.d(str3);
                            jVar.f477658v = d19;
                            jVar.f477648l1 = !d19 && n0Var.e(str3);
                        }
                        if (jVar.f477659w) {
                            jVar.f477652p = str;
                        } else {
                            jVar.f477652p = str2;
                        }
                        jVar.f477653q = activity.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
                        arrayList.add(jVar);
                    }
                    vVar2 = vVar;
                    d0Var2 = d0Var;
                    i18 = i19;
                    i17 = 0;
                }
            }
            Q6.B3(new wi5.v(this.f373284f, hashMap, arrayList));
        }
        return jz5.f0.f384359a;
    }
}
