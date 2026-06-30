package bk4;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final bk4.n f103046a = new bk4.n();

    public final void a(java.lang.String statusId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusId, "statusId");
        java.lang.String str = h() + statusId;
        java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s(str, false);
        if (s17 != null) {
            dj4.w.a(new bk4.m(i17, kz5.n0.S0(s17), str));
        }
    }

    public final java.lang.String b(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        java.lang.String k17 = gm0.j1.b().k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getUserName(...)");
        return c(url, k17);
    }

    public final java.lang.String c(java.lang.String url, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(h());
        sb6.append("history/");
        java.nio.charset.Charset charset = r26.c.f450398a;
        byte[] bytes = username.getBytes(charset);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        java.lang.String sb7 = sb6.toString();
        if (!com.p314xaae8f345.mm.vfs.w6.j(sb7)) {
            com.p314xaae8f345.mm.vfs.w6.u(sb7);
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(sb7);
        sb8.append('/');
        byte[] bytes2 = url.getBytes(charset);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
        sb8.append(kk.k.g(bytes2));
        return sb8.toString();
    }

    public final java.lang.String d(java.lang.String namePrefix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(namePrefix, "namePrefix");
        return f() + '/' + namePrefix + "iconConfigListPath.cfg";
    }

    public final java.lang.String e(java.lang.String namePrefix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(namePrefix, "namePrefix");
        return f() + '/' + namePrefix + "icon.cfg";
    }

    public final java.lang.String f() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(lp0.b.e());
        sb6.append("textstatus/");
        java.lang.String k17 = gm0.j1.b().k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getUserName(...)");
        byte[] bytes = k17.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        java.lang.String sb7 = sb6.toString();
        if (!com.p314xaae8f345.mm.vfs.w6.j(sb7)) {
            com.p314xaae8f345.mm.vfs.w6.u(sb7);
        }
        return sb7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if (r6.equals("video") != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        if (r6.equals("thumb") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        if (r6.equals("image") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        if (r6.equals("ptmptmb") == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String g(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            java.lang.String r0 = "type"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            r0 = 0
            if (r7 != 0) goto La
            return r0
        La:
            if (r8 != 0) goto Ld
            return r0
        Ld:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r5.h()
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            ai4.m0 r2 = ai4.m0.f86706a
            si4.a r2 = r2.G()
            mj4.h r7 = r2.t(r7)
            if (r7 == 0) goto L33
            r0 = r7
            mj4.k r0 = (mj4.k) r0
            java.lang.String r0 = r0.o()
        L33:
            java.lang.String r2 = bk4.k1.a()
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r2)
            if (r7 == 0) goto L59
            if (r0 == 0) goto L59
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r5.h()
            r1.append(r2)
            r2 = r7
            mj4.k r2 = (mj4.k) r2
            java.lang.String r2 = r2.o()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L59:
            boolean r2 = com.p314xaae8f345.mm.vfs.w6.j(r1)
            if (r2 != 0) goto L62
            com.p314xaae8f345.mm.vfs.w6.u(r1)
        L62:
            int r2 = r6.hashCode()
            switch(r2) {
                case -253705982: goto L88;
                case 100313435: goto L7e;
                case 110342614: goto L74;
                case 112202875: goto L6a;
                default: goto L69;
            }
        L69:
            goto L91
        L6a:
            java.lang.String r2 = "video"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L91
            goto L94
        L74:
            java.lang.String r2 = "thumb"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L94
            goto L91
        L7e:
            java.lang.String r2 = "image"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L94
            goto L91
        L88:
            java.lang.String r2 = "ptmptmb"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L94
        L91:
            java.lang.String r6 = "other"
        L94:
            java.lang.String r2 = "getBytes(...)"
            r3 = 47
            r4 = 95
            if (r7 == 0) goto Le8
            if (r0 == 0) goto Le8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r1)
            r8.append(r3)
            r8.append(r6)
            r8.append(r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            mj4.k r7 = (mj4.k) r7
            java.lang.String r0 = r7.o()
            r6.append(r0)
            r6.append(r4)
            mj4.a r7 = r7.f408600b
            int r0 = r7.f76512x81959a6e
            r6.append(r0)
            r6.append(r4)
            long r0 = r7.f76544x776e225b
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.nio.charset.Charset r7 = r26.c.f450398a
            byte[] r6 = r6.getBytes(r7)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r2)
            java.lang.String r6 = kk.k.g(r6)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            goto L10d
        Le8:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            r7.append(r3)
            r7.append(r6)
            r7.append(r4)
            java.nio.charset.Charset r6 = r26.c.f450398a
            byte[] r6 = r8.getBytes(r6)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r2)
            java.lang.String r6 = kk.k.g(r6)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
        L10d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bk4.n.g(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public final java.lang.String h() {
        return gm0.j1.u().d() + "textstatus/";
    }

    public final java.lang.String i(java.lang.String namePrefix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(namePrefix, "namePrefix");
        return f() + '/' + namePrefix + "cover.cfg";
    }

    public final java.lang.String j(java.lang.String namePrefix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(namePrefix, "namePrefix");
        return f() + '/' + namePrefix + "kvconfig.cfg";
    }
}
