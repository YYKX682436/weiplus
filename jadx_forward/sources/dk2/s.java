package dk2;

/* loaded from: classes10.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    public static final dk2.r f315584c = new dk2.r(null);

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f315585a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f315586b;

    public s() {
        ae2.in inVar = ae2.in.f85221a;
        ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.R0).mo141623x754a37bb()).r()).intValue();
        this.f315585a = new p012xc85e97e9.p093xedfae76a.j0(-1);
        this.f315586b = new java.util.ArrayList();
    }

    public final java.util.List a() {
        java.util.ArrayList arrayList = this.f315586b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (!(((dk2.yg) obj).f315934i == 2)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final java.util.List b() {
        java.util.ArrayList arrayList = this.f315586b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (((dk2.yg) obj).a()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final dk2.yg c() {
        java.lang.Integer num = (java.lang.Integer) this.f315585a.mo3195x754a37bb();
        if (num == null) {
            num = -1;
        }
        int intValue = num.intValue();
        if (intValue < 0) {
            return null;
        }
        java.util.ArrayList arrayList = this.f315586b;
        if (intValue < arrayList.size()) {
            return (dk2.yg) arrayList.get(intValue);
        }
        return null;
    }

    public final java.lang.String d(int i17, java.util.LinkedList nameList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameList, "nameList");
        java.lang.String str = "";
        int i18 = 0;
        for (java.lang.Object obj : nameList) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            str = str + ((java.lang.String) obj);
            if (i18 < nameList.size() - 1) {
                str = str + (char) 12289;
            }
            i18 = i19;
        }
        if (str.length() == 0) {
            return str;
        }
        if (i17 <= 3) {
            return str + " 想听";
        }
        return str + "…等" + i17 + "人想听";
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.util.List r35, java.lang.String r36, yz5.l r37) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.s.e(java.util.List, java.lang.String, yz5.l):void");
    }

    public final void f(r45.f81 resp, android.content.Context context) {
        java.util.ArrayList<dk2.yg> arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int i17 = 1;
        try {
            java.util.LinkedList<r45.cc6> m75941xfb821914 = resp.m75941xfb821914(1);
            int i18 = 0;
            if (m75941xfb821914 != null) {
                arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
                for (r45.cc6 cc6Var : m75941xfb821914) {
                    java.lang.String m75945x2fec8307 = cc6Var.m75945x2fec8307(i18);
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    java.lang.String str = m75945x2fec8307;
                    long m75942xfb822ef2 = cc6Var.m75942xfb822ef2(i17);
                    int m75939xb282bd08 = cc6Var.m75939xb282bd08(3);
                    java.util.LinkedList m75941xfb8219142 = cc6Var.m75941xfb821914(2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getRequest_member_names(...)");
                    arrayList.add(new dk2.yg(str, m75942xfb822ef2, 3, false, false, false, false, d(m75939xb282bd08, m75941xfb8219142), cc6Var.m75939xb282bd08(4), 120, null));
                    i17 = 1;
                    i18 = 0;
                }
            } else {
                arrayList = null;
            }
            java.lang.String m75945x2fec83072 = resp.m75945x2fec8307(2);
            java.util.ArrayList arrayList2 = this.f315586b;
            arrayList2.clear();
            p012xc85e97e9.p093xedfae76a.j0 j0Var = this.f315585a;
            if (arrayList != null) {
                for (dk2.yg ygVar : arrayList) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ygVar.f315926a, m75945x2fec83072)) {
                        if (ygVar.f315926a.length() > 0) {
                            ygVar.f315928c = 4;
                        }
                    }
                }
                arrayList2.addAll(arrayList);
                int i19 = 0;
                for (java.lang.Object obj : arrayList2) {
                    int i27 = i19 + 1;
                    if (i19 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((dk2.yg) obj).f315926a, m75945x2fec83072)) {
                        j0Var.mo7808x76db6cb1(java.lang.Integer.valueOf(i19));
                    }
                    i19 = i27;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicData", "updateMusicInfo curSong:" + m75945x2fec83072 + ", curPlayPos:" + j0Var.mo3195x754a37bb() + ", size:" + arrayList2.size());
            f315584c.a(arrayList2, "updateMusicInfo", true);
        } catch (java.lang.Exception e17) {
            pm0.z.b(xy2.b.f539688b, "updateMusicInfo", false, null, null, false, false, null, 124, null);
            hc2.c.a(e17, "FinderLiveAnchorMusicData updateMusicInfo");
        }
    }
}
