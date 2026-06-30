package ab1;

@j95.b
/* loaded from: classes.dex */
public final class l extends i95.w implements ab1.f {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f84264d = jz5.h.b(ab1.g.f84249d);

    public void Ai(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11955x784e8974 request, yz5.l onSelect, yz5.a onCancel) {
        java.lang.String g07;
        boolean z17;
        java.util.ArrayList arrayList;
        java.lang.Object obj;
        java.lang.String str;
        boolean b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSelect, "onSelect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onCancel, "onCancel");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.getMainLooper(), android.os.Looper.myLooper())) {
            ((ku5.t0) ku5.t0.f394148d).B(new ab1.i(this, context, request, onSelect, onCancel));
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        java.util.ArrayList arrayList2 = request.f160239e;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            g07 = "北京市";
        } else {
            ab1.c cVar = request.f160238d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(cVar.f84248d);
            java.util.ArrayList arrayList4 = request.f160239e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList4);
            int i17 = cVar.f84248d;
            int i18 = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 c11485x80cda4c8 = null;
            while (i18 < i17) {
                java.lang.String str2 = (java.lang.String) kz5.n0.a0(arrayList4, i18);
                q71.f0 wi6 = wi();
                java.lang.String str3 = c11485x80cda4c8 != null ? c11485x80cda4c8.f155905e : null;
                if (str3 == null) {
                    str3 = "";
                }
                java.util.List e17 = wi6.e(str3);
                if (str2 == null || str2.length() == 0) {
                    break;
                }
                int i19 = 0;
                while (true) {
                    if (i19 >= str2.length()) {
                        z17 = true;
                        break;
                    } else {
                        if (!java.lang.Character.isDigit(str2.charAt(i19))) {
                            z17 = false;
                            break;
                        }
                        i19++;
                    }
                }
                if (z17) {
                    java.util.Iterator it = ((java.util.ArrayList) e17).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            arrayList = arrayList4;
                            obj = null;
                            break;
                        }
                        java.lang.Object next = it.next();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 c11485x80cda4c82 = (com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8) next;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11485x80cda4c82);
                        java.lang.String str4 = c11485x80cda4c82.f155905e;
                        java.util.Iterator it6 = it;
                        if (str4.length() < str2.length()) {
                            arrayList = arrayList4;
                            b17 = false;
                        } else {
                            if (str4.length() > str2.length()) {
                                arrayList = arrayList4;
                                int i27 = 0;
                                str = str2;
                                for (int length = str4.length() - str2.length(); i27 < length; length = length) {
                                    str = str + '0';
                                    i27++;
                                }
                            } else {
                                arrayList = arrayList4;
                                str = str2;
                            }
                            b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str4, str);
                        }
                        if (b17) {
                            obj = next;
                            break;
                        } else {
                            it = it6;
                            arrayList4 = arrayList;
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 c11485x80cda4c83 = (com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8) obj;
                    if (c11485x80cda4c83 == null) {
                        break;
                    }
                    c11485x80cda4c8 = c11485x80cda4c83;
                    i18++;
                    arrayList4 = arrayList;
                } else {
                    arrayList = arrayList4;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 b18 = wi().b(e17, str2);
                    if (b18 == null) {
                        break;
                    }
                    c11485x80cda4c8 = b18;
                    i18++;
                    arrayList4 = arrayList;
                }
            }
            if (c11485x80cda4c8 == null) {
                g07 = "北京市 北京市 东城区";
            } else {
                do {
                    arrayList3.add(0, c11485x80cda4c8);
                    c11485x80cda4c8 = wi().c(c11485x80cda4c8.f155908h);
                } while (c11485x80cda4c8 != null);
                while (arrayList3.size() < java.lang.Math.max(cVar.f84248d, 3)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 c11485x80cda4c84 = (com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8) kz5.n0.Z(wi().e(((com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8) kz5.n0.i0(arrayList3)).f155905e));
                    if (c11485x80cda4c84 == null) {
                        break;
                    } else {
                        arrayList3.add(arrayList3.size(), c11485x80cda4c84);
                    }
                }
                g07 = kz5.n0.g0(arrayList3, " ", null, null, 0, null, ab1.h.f84250d, 30, null);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.l1 l1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.l1(context, g07, new ab1.j(c0Var, onSelect, this, request, h0Var), request.f160238d.f84248d, wi(), request.f160240f, null);
        h0Var.f391656d = l1Var;
        l1Var.f362939o = new ab1.k(c0Var, onCancel, h0Var);
        l1Var.show();
    }

    public final q71.f0 wi() {
        return (q71.f0) ((jz5.n) this.f84264d).mo141623x754a37bb();
    }
}
