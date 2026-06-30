package bm5;

/* loaded from: classes12.dex */
public final class c0 {

    /* renamed from: c */
    public static long f104085c;

    /* renamed from: d */
    public static long f104086d;

    /* renamed from: e */
    public static long f104087e;

    /* renamed from: a */
    public static final bm5.c0 f104083a = new bm5.c0();

    /* renamed from: b */
    public static final java.util.concurrent.ConcurrentHashMap f104084b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f */
    public static final java.lang.ThreadLocal f104088f = new java.lang.ThreadLocal();

    public static /* synthetic */ java.lang.String g(bm5.c0 c0Var, bm5.v vVar, java.lang.String str, long j17, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 8) != 0) {
            z17 = false;
        }
        return c0Var.f(vVar, str, j17, z17);
    }

    public static /* synthetic */ java.lang.String m(bm5.c0 c0Var, bm5.v vVar, bm5.f0 f0Var, java.lang.String str, boolean z17, long j17, java.lang.String str2, boolean z18, boolean z19, int i17, java.lang.Object obj) {
        return c0Var.k(vVar, f0Var, str, z17, j17, (i17 & 32) != 0 ? null : str2, (i17 & 64) != 0 ? false : z18, (i17 & 128) != 0 ? false : z19);
    }

    public final java.lang.String a(byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (byte b17 : bArr) {
            java.lang.String format = java.lang.String.format("%02x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(b17)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            sb6.append(format);
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final int b(bm5.y fileDescriptor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileDescriptor, "fileDescriptor");
        int c17 = fileDescriptor.c();
        if (c17 != 0) {
            java.lang.String str = "invalid c2c file descriptor: " + bm5.z.j(fileDescriptor);
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.C2CPath", str);
        }
        return c17;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.lang.String r4, boolean r5) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.tencent.mm.vfs.r6 r1 = new com.tencent.mm.vfs.r6
            com.tencent.mm.vfs.z7 r2 = com.p314xaae8f345.mm.vfs.z7.a(r4)
            r1.<init>(r2)
            boolean r2 = r1.m()
            if (r2 == 0) goto L4f
            boolean r2 = r1.y()
            if (r2 == 0) goto L4f
            java.lang.String[] r1 = r1.D()
            r2 = 1
            if (r1 == 0) goto L2a
            int r1 = r1.length
            if (r1 != 0) goto L25
            r1 = r2
            goto L26
        L25:
            r1 = r0
        L26:
            if (r1 != r2) goto L2a
            r1 = r2
            goto L2b
        L2a:
            r1 = r0
        L2b:
            if (r1 == 0) goto L4f
            boolean r0 = com.p314xaae8f345.mm.vfs.w6.g(r4, r0)
            if (r5 == 0) goto L4e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "delete c2c dir: "
            r5.<init>(r1)
            r5.append(r4)
            java.lang.String r4 = ", ret = "
            r5.append(r4)
            r5.append(r0)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "MicroMsg.C2CPath"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r4)
        L4e:
            return r2
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bm5.c0.c(java.lang.String, boolean):boolean");
    }

    public final bm5.f0 d(boolean z17) {
        return z17 ? bm5.f0.f104095g : bm5.f0.f104096h;
    }

    public final java.lang.String e(bm5.v businessType, java.lang.String chatUsername, long j17, boolean z17) {
        java.lang.String R;
        java.lang.String R2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(businessType, "businessType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatUsername, "chatUsername");
        java.lang.String h17 = h(businessType, z17);
        java.lang.String str = "";
        if (r26.n0.N(chatUsername)) {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        } else {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f104084b;
            java.lang.String str3 = (java.lang.String) concurrentHashMap.get(chatUsername);
            if (str3 == null) {
                byte[] bytes = chatUsername.getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                str3 = kk.k.g(bytes);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
            concurrentHashMap.put(chatUsername, str3);
            if (str3.length() < 2) {
                java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            } else {
                if (str3.length() >= 2) {
                    R = r26.p0.E0(str3, 2);
                } else {
                    java.lang.String substring = str3.substring(java.lang.Math.max(str3.length() - 2, 0));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                    R = r26.n0.R(substring, 2, '0');
                }
                str = h17 + '/' + R;
                if (!com.p314xaae8f345.mm.vfs.w6.j(str) && z17) {
                    com.p314xaae8f345.mm.vfs.w6.u(str);
                    r(str, businessType);
                }
            }
        }
        java.lang.String valueOf = java.lang.String.valueOf(j17);
        if (valueOf.length() >= 2) {
            R2 = r26.p0.F0(valueOf, 2);
        } else {
            java.lang.String substring2 = valueOf.substring(java.lang.Math.max(valueOf.length() - 2, 0));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
            R2 = r26.n0.R(substring2, 2, '0');
        }
        java.lang.String str5 = str + '/' + R2;
        if (!com.p314xaae8f345.mm.vfs.w6.j(str5) && z17) {
            com.p314xaae8f345.mm.vfs.w6.u(str5);
            r(str, businessType);
        }
        return str5;
    }

    public final java.lang.String f(bm5.v businessType, java.lang.String chatUsername, long j17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(businessType, "businessType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatUsername, "chatUsername");
        int ordinal = businessType.ordinal();
        java.lang.String str = com.p314xaae8f345.mm.vfs.q7.c(ordinal != 0 ? ordinal != 1 ? "c2c_origin_file" : "c2c_origin_video" : "c2c_origin_image") + '/';
        if (!com.p314xaae8f345.mm.vfs.w6.j(str) && z17) {
            com.p314xaae8f345.mm.vfs.w6.u(str);
        }
        java.lang.String str2 = "";
        if (j17 <= 0) {
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        } else if (r26.n0.N(chatUsername)) {
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        } else {
            byte[] bytes = chatUsername.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            java.lang.String g17 = kk.k.g(bytes);
            if ((g17 != null ? g17.length() : 0) < 3) {
                java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
                java.lang.String substring = g17.substring(0, 3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                str2 = (str + '/' + substring + '/' + g17) + '/' + ((j17 / 50000) + 1) + '/' + j17;
                if (!com.p314xaae8f345.mm.vfs.w6.j(str2) && z17) {
                    com.p314xaae8f345.mm.vfs.w6.u(str2);
                }
            }
        }
        return str2;
    }

    public final java.lang.String h(bm5.v businessType, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(businessType, "businessType");
        java.lang.String str = com.p314xaae8f345.mm.vfs.q7.c("c2c") + '/';
        if (!com.p314xaae8f345.mm.vfs.w6.j(str) && z17) {
            com.p314xaae8f345.mm.vfs.w6.u(str);
        }
        java.lang.String str2 = str + businessType.f104286d + '/';
        if (!com.p314xaae8f345.mm.vfs.w6.j(str2) && z17) {
            com.p314xaae8f345.mm.vfs.w6.u(str2);
            if (java.lang.System.currentTimeMillis() - f104086d > 3600000) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CPath", "mkdir c2c root path: " + str2 + ", stack: " + r26.p0.E0(jz5.a.b(new java.lang.Throwable()), 1000));
                f104086d = java.lang.System.currentTimeMillis();
                if (businessType == bm5.v.f104283p) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CPath", "mkdir unknown business type c2c root path: " + str2);
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c c6754x4f2fd58c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c();
                    c6754x4f2fd58c.p("c2c_error_business_type_c2c_root_dir");
                    c6754x4f2fd58c.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
                    c6754x4f2fd58c.k();
                }
            }
        }
        return str2;
    }

    public final java.lang.String i(long j17, java.lang.String str) {
        if (str == null || str.length() == 0) {
            return j17 + "_m";
        }
        return j17 + "_m_" + str;
    }

    public final java.lang.String j(bm5.v businessType, bm5.f0 resType, java.lang.String msgTalker, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(businessType, "businessType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resType, "resType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgTalker, "msgTalker");
        boolean z18 = j18 == 0;
        return m(this, businessType, resType, msgTalker, z18, z18 ? j17 : j18, null, false, z17, 96, null);
    }

    public final java.lang.String k(bm5.v businessType, bm5.f0 resType, java.lang.String str, boolean z17, long j17, java.lang.String str2, boolean z18, boolean z19) {
        java.lang.StringBuilder sb6;
        java.lang.StringBuilder sb7;
        java.lang.StringBuilder sb8;
        java.lang.String str3;
        java.lang.StringBuilder sb9;
        java.lang.StringBuilder sb10;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(businessType, "businessType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resType, "resType");
        if (j17 > 0) {
            if (!(str == null || r26.n0.N(str))) {
                java.lang.String str4 = "_hevc";
                switch (resType.ordinal()) {
                    case 0:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.C2CPath", "unknown res type path, businessType: " + businessType + ", resType: " + resType + ", msgTalker: " + str + ", isTmp: " + z17);
                        return "";
                    case 1:
                    case 9:
                        if (str2 == null || str2.length() == 0) {
                            sb6 = new java.lang.StringBuilder();
                            sb6.append(j17);
                            sb6.append("_l");
                        } else {
                            sb6 = new java.lang.StringBuilder();
                            sb6.append(j17);
                            sb6.append("_l_");
                            sb6.append(str2);
                        }
                        return q(businessType, str, z17, j17, z18, sb6.toString(), z19);
                    case 2:
                    case 10:
                        return q(businessType, str, z17, j17, z18, i(j17, str2), z19);
                    case 3:
                    case 11:
                        if (str2 == null || str2.length() == 0) {
                            sb7 = new java.lang.StringBuilder();
                            sb7.append(j17);
                            sb7.append("_s");
                        } else {
                            sb7 = new java.lang.StringBuilder();
                            sb7.append(j17);
                            sb7.append("_l_");
                            sb7.append(str2);
                        }
                        return q(businessType, str, z17, j17, z18, sb7.toString(), z19);
                    case 4:
                        if (str2 == null || str2.length() == 0) {
                            sb8 = new java.lang.StringBuilder();
                            sb8.append(j17);
                            str3 = "_shd";
                        } else {
                            sb8 = new java.lang.StringBuilder();
                            sb8.append(j17);
                            sb8.append("_l_");
                            sb8.append(str2);
                            str3 = "hd";
                        }
                        sb8.append(str3);
                        return q(businessType, str, z17, j17, z18, sb8.toString(), z19);
                    case 5:
                        if (str2 == null || str2.length() == 0) {
                            sb9 = new java.lang.StringBuilder();
                            sb9.append(j17);
                            str4 = "_m_hevc";
                        } else {
                            sb9 = new java.lang.StringBuilder();
                            sb9.append(j17);
                            sb9.append("_m_");
                            sb9.append(str2);
                        }
                        sb9.append(str4);
                        return q(businessType, str, z17, j17, z18, sb9.toString(), z19);
                    case 6:
                        if (str2 == null || str2.length() == 0) {
                            sb10 = new java.lang.StringBuilder();
                            sb10.append(j17);
                            str4 = "_l_hevc";
                        } else {
                            sb10 = new java.lang.StringBuilder();
                            sb10.append(j17);
                            sb10.append("_l_");
                            sb10.append(str2);
                        }
                        sb10.append(str4);
                        return q(businessType, str, z17, j17, z18, sb10.toString(), z19);
                    case 7:
                        return q(businessType, str, z17, j17, z18, j17 + "_m_lp", z19);
                    case 8:
                        return q(businessType, str, z17, j17, z18, j17 + "_l_lp", z19);
                    case 12:
                        return q(businessType, str, z17, j17, z18, i(j17, str2), z19) + ".amr";
                    case 13:
                        return q(businessType, str, z17, j17, z18, i(j17, str2), z19);
                    case 14:
                        return q(businessType, str, z17, j17, z18, i(j17, null), z19) + '.' + str2;
                    default:
                        throw new jz5.j();
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.C2CPath", "mediaId is null, businessType: " + businessType + ", resType: " + resType + ", msgTalker: " + str + ", isTmp: " + z17);
        return "";
    }

    public final java.lang.String n(bm5.v businessType, java.lang.String chatUsername, boolean z17, boolean z18) {
        java.lang.String g17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(businessType, "businessType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatUsername, "chatUsername");
        java.lang.String p17 = p(businessType, z17, false);
        if (r26.n0.N(chatUsername)) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            return "";
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f104084b;
        if (z18) {
            try {
                java.lang.ThreadLocal threadLocal = f104088f;
                java.lang.Object obj = threadLocal.get();
                if (obj == null) {
                    obj = java.security.MessageDigest.getInstance("SHA-1");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "getInstance(...)");
                    threadLocal.set(obj);
                }
                java.security.MessageDigest messageDigest = (java.security.MessageDigest) obj;
                java.nio.charset.Charset forName = java.nio.charset.Charset.forName("iso-8859-1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(forName, "forName(...)");
                byte[] bytes = chatUsername.getBytes(forName);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                messageDigest.update(bytes, 0, chatUsername.length());
                byte[] digest = messageDigest.digest();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(digest, "digest(...)");
                g17 = a(digest);
            } catch (java.lang.Exception unused) {
                byte[] bytes2 = chatUsername.getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
                g17 = kk.k.g(bytes2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getMessageDigest(...)");
            }
        } else {
            java.lang.String str2 = (java.lang.String) concurrentHashMap.get(chatUsername);
            if (str2 == null) {
                byte[] bytes3 = chatUsername.getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes3, "getBytes(...)");
                g17 = kk.k.g(bytes3);
            } else {
                g17 = str2;
            }
        }
        if (!z18) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
            concurrentHashMap.put(chatUsername, g17);
        }
        if (g17.length() < 3) {
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            return "";
        }
        return p17 + '/' + g17;
    }

    public final java.lang.String o(bm5.v businessType, java.lang.String chatUsername, long j17, boolean z17, boolean z18) {
        java.lang.String R;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(businessType, "businessType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatUsername, "chatUsername");
        java.lang.String n17 = n(businessType, chatUsername, z17, z18);
        java.lang.String valueOf = java.lang.String.valueOf(j17);
        if (valueOf.length() >= 4) {
            R = r26.p0.F0(valueOf, 4);
        } else {
            java.lang.String substring = valueOf.substring(java.lang.Math.max(valueOf.length() - 4, 0));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            R = r26.n0.R(substring, 4, '0');
        }
        return n17 + '/' + R;
    }

    public final java.lang.String p(bm5.v businessType, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(businessType, "businessType");
        if (!z17) {
            return h(businessType, z18);
        }
        java.lang.String str = com.p314xaae8f345.mm.vfs.q7.c("c2c_temp") + '/';
        if (!com.p314xaae8f345.mm.vfs.w6.j(str) && z18) {
            com.p314xaae8f345.mm.vfs.w6.u(str);
        }
        java.lang.String str2 = str + businessType.f104286d + '/';
        if (com.p314xaae8f345.mm.vfs.w6.j(str2) || !z18) {
            return str2;
        }
        com.p314xaae8f345.mm.vfs.w6.u(str2);
        if (java.lang.System.currentTimeMillis() - f104087e <= 3600000) {
            return str2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CPath", "mkdir c2c root temp path: " + str2 + ", stack: " + r26.p0.E0(jz5.a.b(new java.lang.Throwable()), 1000));
        f104087e = java.lang.System.currentTimeMillis();
        if (businessType != bm5.v.f104283p) {
            return str2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CPath", "mkdir unknown business type c2c root temp path: " + str2);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c c6754x4f2fd58c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c();
        c6754x4f2fd58c.p("c2c_error_business_type_c2c_root_temp_dir");
        c6754x4f2fd58c.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
        c6754x4f2fd58c.k();
        return str2;
    }

    public final java.lang.String q(bm5.v vVar, java.lang.String str, boolean z17, long j17, boolean z18, java.lang.String str2, boolean z19) {
        java.lang.String str3;
        java.lang.String e17 = e(vVar, str, j17, z19);
        java.lang.String str4 = (java.lang.String) f104084b.get(str);
        if (str4 == null) {
            byte[] bytes = str.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            str4 = kk.k.g(bytes);
        }
        if (z17) {
            str3 = e17 + "/temp_" + str4 + '_' + str2;
        } else {
            str3 = e17 + '/' + str4 + '_' + str2;
        }
        java.lang.String str5 = str3;
        if (z19 || com.p314xaae8f345.mm.vfs.w6.j(str5)) {
            return str5;
        }
        java.lang.String str6 = o(vVar, str, j17, z17, z18) + '/' + str2;
        return com.p314xaae8f345.mm.vfs.w6.j(str6) ? str6 : str5;
    }

    public final void r(java.lang.String str, bm5.v vVar) {
        if (java.lang.System.currentTimeMillis() - f104085c > 3600000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CPath", "mkdir c2c path: " + str + ", stack: " + r26.p0.E0(jz5.a.b(new java.lang.Throwable()), 1000));
            f104085c = java.lang.System.currentTimeMillis();
            if (vVar == bm5.v.f104283p) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CPath", "mkdir unknown business type c2c path: " + str);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c c6754x4f2fd58c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c();
                c6754x4f2fd58c.p("c2c_error_business_type_c2c_dir");
                c6754x4f2fd58c.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
                c6754x4f2fd58c.k();
            }
        }
    }
}
