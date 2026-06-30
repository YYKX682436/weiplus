package ey2;

/* loaded from: classes8.dex */
public final class j extends pf5.o0 implements xy2.e {

    /* renamed from: e, reason: collision with root package name */
    public r45.j13 f338933e;

    public final java.lang.String N6(java.util.List list) {
        java.util.Iterator it = list.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            str = str + ((java.lang.String) it.next()) + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String O6(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 r5) {
        /*
            r4 = this;
            java.lang.String r0 = "finderObj"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r5.m76802x2dd01666()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1c
            r45.ik2 r0 = r0.m76950xc340ec97()
            if (r0 == 0) goto L1c
            r3 = 3
            int r0 = r0.m75939xb282bd08(r3)
            if (r0 != r1) goto L1c
            r0 = r1
            goto L1d
        L1c:
            r0 = r2
        L1d:
            if (r0 != 0) goto L3b
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r5.m76802x2dd01666()
            if (r0 == 0) goto L35
            r45.ik2 r0 = r0.m76950xc340ec97()
            if (r0 == 0) goto L35
            r3 = 11
            int r0 = r0.m75939xb282bd08(r3)
            if (r0 != r1) goto L35
            r0 = r1
            goto L36
        L35:
            r0 = r2
        L36:
            if (r0 == 0) goto L39
            goto L3b
        L39:
            r0 = r2
            goto L3c
        L3b:
            r0 = r1
        L3c:
            if (r0 == 0) goto L45
            xy2.d r5 = xy2.d.f539690d
            java.lang.String r5 = r4.P6(r5)
            goto L72
        L45:
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r5.m76802x2dd01666()
            if (r0 == 0) goto L54
            int r0 = r0.m76964x7f025288()
            r3 = 4
            if (r0 != r3) goto L54
            r0 = r1
            goto L55
        L54:
            r0 = r2
        L55:
            if (r0 != 0) goto L6c
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r5 = r5.m76802x2dd01666()
            if (r5 == 0) goto L65
            int r5 = r5.m76964x7f025288()
            r0 = 2
            if (r5 != r0) goto L65
            goto L66
        L65:
            r1 = r2
        L66:
            if (r1 == 0) goto L69
            goto L6c
        L69:
            java.lang.String r5 = ""
            goto L72
        L6c:
            xy2.d r5 = xy2.d.f539691e
            java.lang.String r5 = r4.P6(r5)
        L72:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[getHeader] return:"
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FinderCdnUploadCustomHeaderVM"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ey2.j.O6(com.tencent.mm.protocal.protobuf.FinderObject):java.lang.String");
    }

    public java.lang.String P6(xy2.d type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        java.lang.String str = "";
        if (this.f338933e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCdnUploadCustomHeaderVM", "[getConfig] parse from storage");
            try {
                r45.j13 j13Var = new r45.j13();
                java.lang.String v17 = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_CDN_UPLOAD_TEMPURL_CONFIG_STRING_SYNC, "");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v17);
                if (v17.length() > 0) {
                    j13Var.mo11468x92b714fd(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(v17));
                    this.f338933e = j13Var;
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderCdnUploadCustomHeaderVM", th6, "[getConfig] parse config fail", new java.lang.Object[0]);
            }
        }
        r45.j13 j13Var2 = this.f338933e;
        if (j13Var2 == null) {
            j13Var2 = new r45.j13();
        }
        if (type == xy2.d.f539690d && j13Var2.m75939xb282bd08(0) == 1) {
            java.util.LinkedList m75941xfb821914 = j13Var2.m75941xfb821914(3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getNewlife_param(...)");
            str = N6(m75941xfb821914);
        } else if (type == xy2.d.f539691e && j13Var2.m75939xb282bd08(1) == 1) {
            java.util.LinkedList m75941xfb8219142 = j13Var2.m75941xfb821914(4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getFinder_param(...)");
            str = N6(m75941xfb8219142);
        } else if (type == xy2.d.f539692f && j13Var2.m75939xb282bd08(2) == 1) {
            java.util.LinkedList m75941xfb8219143 = j13Var2.m75941xfb821914(5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getLive_param(...)");
            str = N6(m75941xfb8219143);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCdnUploadCustomHeaderVM", "[getHeader] type:" + type + " return:" + str);
        return str;
    }

    public void Q6(r45.xb1 resp) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(30);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getFinder_config_item(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.yy0) obj).m75945x2fec8307(0), "upload_get_temp_url")) {
                    break;
                }
            }
        }
        r45.yy0 yy0Var = (r45.yy0) obj;
        if (yy0Var != null) {
            r45.j13 j13Var = new r45.j13();
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = yy0Var.m75934xbce7f2f(1);
            if (m75934xbce7f2f != null) {
                j13Var.mo11468x92b714fd(m75934xbce7f2f.g());
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[updateConfig] enable_newlife:");
            sb6.append(j13Var.m75939xb282bd08(0));
            sb6.append(", enable_live:");
            sb6.append(j13Var.m75939xb282bd08(2));
            sb6.append(", enable_finder:");
            sb6.append(j13Var.m75939xb282bd08(1));
            sb6.append(" newlife_param:");
            java.util.LinkedList m75941xfb8219142 = j13Var.m75941xfb821914(3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getNewlife_param(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb8219142, 10));
            java.util.Iterator it6 = m75941xfb8219142.iterator();
            while (it6.hasNext()) {
                arrayList.add(((java.lang.String) it6.next()) + '\r');
            }
            sb6.append(arrayList);
            sb6.append("  finder_param:");
            java.util.LinkedList m75941xfb8219143 = j13Var.m75941xfb821914(4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getFinder_param(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m75941xfb8219143, 10));
            java.util.Iterator it7 = m75941xfb8219143.iterator();
            while (it7.hasNext()) {
                arrayList2.add(((java.lang.String) it7.next()) + '\r');
            }
            sb6.append(arrayList2);
            sb6.append(" live_param:");
            java.util.LinkedList m75941xfb8219144 = j13Var.m75941xfb821914(5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219144, "getLive_param(...)");
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(m75941xfb8219144, 10));
            java.util.Iterator it8 = m75941xfb8219144.iterator();
            while (it8.hasNext()) {
                arrayList3.add(((java.lang.String) it8.next()) + '\r');
            }
            sb6.append(arrayList3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCdnUploadCustomHeaderVM", sb6.toString());
            this.f338933e = j13Var;
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_CDN_UPLOAD_TEMPURL_CONFIG_STRING_SYNC, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(j13Var.mo14344x5f01b1f6()));
        }
    }
}
