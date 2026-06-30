package ut;

/* loaded from: classes12.dex */
public final class q0 extends ru.j {

    /* renamed from: r, reason: collision with root package name */
    public static final ut.k f512244r = new ut.k(null);

    /* renamed from: o, reason: collision with root package name */
    public final ut.s0 f512245o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p947xba6de98f.v2 f512246p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p947xba6de98f.v2 f512247q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(ut.s0 params) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f512245o = params;
        this.f512246p = new ut.q(this);
        this.f512247q = new ut.n0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v11, types: [int] */
    /* JADX WARN: Type inference failed for: r4v14, types: [int] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M(ut.q0 r19, oi3.g r20, v05.b r21, boolean r22, java.lang.String r23, long r24, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d r26, boolean r27, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r28) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ut.q0.M(ut.q0, oi3.g, v05.b, boolean, java.lang.String, long, com.tencent.mm.pluginsdk.model.app.d, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x02aa, code lost:
    
        if (r0 == null) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N(ut.q0 r22, oi3.g r23, v05.b r24, boolean r25, long r26, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d r28, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r29) {
        /*
            Method dump skipped, instructions count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ut.q0.N(ut.q0, oi3.g, v05.b, boolean, long, com.tencent.mm.pluginsdk.model.app.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final long O(ut.q0 q0Var, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.vfs.r6 s17;
        ut.s0 s0Var = q0Var.f512245o;
        boolean z17 = true;
        if (!r26.i0.y(str, "content://", false)) {
            return com.p314xaae8f345.mm.vfs.w6.d(str, str2, true);
        }
        try {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str2));
            com.p314xaae8f345.mm.vfs.r6 s18 = r6Var.s();
            if (s18 == null || !s18.m()) {
                z17 = false;
            }
            if (!z17 && (s17 = r6Var.s()) != null) {
                s17.J();
            }
            long d17 = com.p314xaae8f345.mm.vfs.w6.d(str, str2, false);
            if (d17 > 0) {
                return d17;
            }
            java.io.InputStream openInputStream = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver().openInputStream(android.net.Uri.parse(str));
            if (openInputStream == null) {
                s0Var.f512259j.put("send_copy_file_err", "FisIsNull");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.SendFileTask", q0Var.id() + " copyFile fis is null");
                return -3L;
            }
            try {
                com.p314xaae8f345.mm.vfs.y6 y6Var = new com.p314xaae8f345.mm.vfs.y6(str2);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read <= 0) {
                            vz5.b.a(y6Var, null);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.SendFileTask", q0Var.id() + " copyFile use fis");
                            long k17 = com.p314xaae8f345.mm.vfs.w6.k(str2);
                            vz5.b.a(openInputStream, null);
                            return k17;
                        }
                        y6Var.write(bArr, 0, read);
                    }
                } finally {
                }
            } finally {
            }
        } catch (java.lang.Exception e17) {
            s0Var.f512259j.put("send_copy_file_err", java.lang.String.valueOf(e17.getMessage()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppMsg.SendFileTask", e17, q0Var.id() + " copyFile error " + str, new java.lang.Object[0]);
            return -1L;
        }
    }

    public static final long Q(ut.q0 q0Var, java.lang.String str) {
        q0Var.getClass();
        if (!r26.i0.y(str, "content://", false)) {
            return com.p314xaae8f345.mm.vfs.w6.k(str);
        }
        long k17 = com.p314xaae8f345.mm.vfs.w6.k(str);
        if (k17 > 0) {
            return k17;
        }
        try {
            android.net.Uri parse = android.net.Uri.parse(str);
            android.database.Cursor query = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver().query(parse, null, null, null, null);
            if (query != null) {
                try {
                    int columnIndex = query.getColumnIndex("_size");
                    if (query.moveToFirst() && columnIndex != -1) {
                        k17 = query.getLong(columnIndex);
                    }
                    vz5.b.a(query, null);
                } finally {
                }
            }
            if (k17 > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.SendFileTask", q0Var.id() + " getFileLength from query " + k17);
                return k17;
            }
            android.os.ParcelFileDescriptor openFileDescriptor = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver().openFileDescriptor(parse, "r");
            if (openFileDescriptor != null) {
                try {
                    k17 = openFileDescriptor.getStatSize();
                    vz5.b.a(openFileDescriptor, null);
                } finally {
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.SendFileTask", q0Var.id() + " getFileLength from fd " + k17);
            return k17;
        } catch (java.lang.Exception e17) {
            q0Var.f512245o.f512259j.put("send_get_length_err", java.lang.String.valueOf(e17.getMessage()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppMsg.SendFileTask", e17, q0Var.id() + " getFileLength error " + str, new java.lang.Object[0]);
            return k17;
        }
    }

    public static final int R(ut.q0 q0Var, oi3.g gVar) {
        q0Var.getClass();
        pt0.e0 e0Var = pt0.f0.f439742b1;
        java.lang.String m75945x2fec8307 = gVar.m75945x2fec8307(gVar.f427150d + 3);
        int i17 = gVar.f427150d;
        int i18 = i17 + 0;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(m75945x2fec8307, gVar.m75942xfb822ef2(i18));
        if (k17 == null) {
            return -520002;
        }
        k17.r1(2);
        int i19 = i17 + 3;
        int s17 = e0Var.s(gVar.m75945x2fec8307(i19), gVar.m75942xfb822ef2(i18), k17);
        if (s17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.SendFileTask", q0Var.id() + " update first msg info fail localId:" + gVar.m75942xfb822ef2(i18) + " talker:" + gVar.m75945x2fec8307(i19) + " updateResult:" + s17);
            return -520015;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.SendFileTask", q0Var.id() + " update first msg info sucesss localId:" + gVar.m75942xfb822ef2(i18) + " talker:" + gVar.m75945x2fec8307(i19) + " svrId:" + gVar.m75942xfb822ef2(i17 + 1));
        return 0;
    }

    public static /* synthetic */ void e0(ut.q0 q0Var, float f17, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        q0Var.d0(f17, z17);
    }

    @Override // ru.j, qi3.b0
    public java.lang.Object A(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        int i17;
        java.lang.String str;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        ut.s0 s0Var = this.f512245o;
        linkedHashMap.putAll(s0Var.f512259j);
        qi3.f0 f0Var = s0Var.f512269t;
        java.lang.String str2 = "PrepareError";
        if (f0Var != null) {
            i17 = 0;
            str = "Success";
        } else {
            i17 = -520009;
            str = "PrepareError";
        }
        if (f0Var != null) {
            linkedHashMap.putAll(f0Var.f445234b);
            int i18 = f0Var.f445233a;
            if (i18 != 0) {
                i17 = i18;
            } else {
                str2 = str;
            }
            str = str2;
        }
        ut.u0 u0Var = s0Var.f512270u;
        if (u0Var != null) {
            linkedHashMap.putAll(u0Var.f512290b);
            int i19 = u0Var.f512289a;
            if (i19 != 0) {
                str = "SendFirstCgiError";
                i17 = i19;
            }
        }
        qi3.i0 i0Var = s0Var.f512271v;
        if (i0Var != null) {
            linkedHashMap.putAll(i0Var.f445259b);
            int i27 = i0Var.f445258a;
            if (i27 != 0) {
                str = "UploadError";
                i17 = i27;
            }
        }
        qi3.d0 d0Var = s0Var.f512272w;
        if (d0Var != null) {
            linkedHashMap.putAll(d0Var.f445217b);
            int i28 = d0Var.f445216a;
            if (i28 != 0) {
                str = "SendCgiError";
                i17 = i28;
            }
        }
        qi3.k0 k0Var = s0Var.f512273x;
        if (k0Var != null) {
            linkedHashMap.putAll(k0Var.f445273b);
            int i29 = k0Var.f445272a;
            if (i29 != 0) {
                str = "UpdateMsgError";
                i17 = i29;
            }
        }
        qi3.j0 j0Var = s0Var.f512274y;
        if (j0Var != null) {
            linkedHashMap.putAll(j0Var.f445265b);
        }
        if (i17 == -520007) {
            t65.f Zi = ((k04.h) ((t65.e) i95.n0.c(t65.e.class))).Zi();
            linkedHashMap.put("send_from_last_screen", new java.lang.Integer(Zi.p()));
            linkedHashMap.put("send_network_tick_rate", new java.lang.Float(Zi.t()));
            linkedHashMap.put("send_from_last_network_min", new java.lang.Integer(Zi.n()));
            linkedHashMap.put("send_process_status", new java.lang.Integer(Zi.u()));
        }
        linkedHashMap.put("send_result_ret_code", new java.lang.Integer(i17));
        linkedHashMap.put("send_result_type", str);
        linkedHashMap.put("send_total_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - this.f445209e));
        linkedHashMap.put("inner_version", new java.lang.Integer(36));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).sj(32784, linkedHashMap, 10);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(s0Var.f512254e, linkedHashMap, 32784);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.SendFileTask", "report32784: " + s0Var.f512254e + ' ' + linkedHashMap);
        return jz5.f0.f384359a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.j, qi3.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ut.j0
            if (r0 == 0) goto L13
            r0 = r6
            ut.j0 r0 = (ut.j0) r0
            int r1 = r0.f512184g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f512184g = r1
            goto L18
        L13:
            ut.j0 r0 = new ut.j0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f512182e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f512184g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f512181d
            qi3.k0 r0 = (qi3.k0) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L6c
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = r5.id()
            r6.append(r2)
            java.lang.String r2 = " start to updateMsg"
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r2 = "MicroMsg.AppMsg.SendFileTask"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r6)
            qi3.k0 r6 = new qi3.k0
            r2 = 0
            r6.<init>(r2)
            ut.s0 r2 = r5.f512245o
            r2.f512273x = r6
            ut.k0 r2 = new ut.k0
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f512181d = r6
            r0.f512184g = r3
            java.lang.Object r0 = r2.mo146xb9724478(r0)
            if (r0 != r1) goto L6b
            return r1
        L6b:
            r0 = r6
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ut.q0.B(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // ru.j, qi3.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object D(yz5.l r19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r20) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ut.q0.D(yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T(v05.b r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ut.q0.T(v05.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U(dn.h r20, v05.b r21, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d r22, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r23) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ut.q0.U(dn.h, v05.b, com.tencent.mm.pluginsdk.model.app.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final ut.s0 V() {
        return this.f512245o;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W(oi3.g r19, v05.b r20, boolean r21, java.lang.String r22, long r23, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d r25, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r26) {
        /*
            r18 = this;
            r0 = r26
            boolean r1 = r0 instanceof ut.u
            if (r1 == 0) goto L17
            r1 = r0
            ut.u r1 = (ut.u) r1
            int r2 = r1.f512288f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f512288f = r2
            r10 = r18
            goto L1e
        L17:
            ut.u r1 = new ut.u
            r10 = r18
            r1.<init>(r10, r0)
        L1e:
            r11 = r1
            java.lang.Object r0 = r11.f512286d
            pz5.a r12 = pz5.a.f440719d
            int r1 = r11.f512288f
            r13 = 1
            if (r1 == 0) goto L37
            if (r1 != r13) goto L2f
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r0)
            goto Laa
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L37:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r0)
            r0 = 104857600(0x6400000, double:5.1806538E-316)
            int r0 = (r23 > r0 ? 1 : (r23 == r0 ? 0 : -1))
            if (r0 <= 0) goto L44
            r0 = 1800(0x708, double:8.893E-321)
            goto L64
        L44:
            r0 = 10485760(0xa00000, double:5.180654E-317)
            int r0 = (r23 > r0 ? 1 : (r23 == r0 ? 0 : -1))
            if (r0 <= 0) goto L4e
            r0 = 600(0x258, double:2.964E-321)
            goto L64
        L4e:
            r0 = 5242880(0x500000, double:2.590327E-317)
            int r0 = (r23 > r0 ? 1 : (r23 == r0 ? 0 : -1))
            if (r0 <= 0) goto L58
            r0 = 180(0xb4, double:8.9E-322)
            goto L64
        L58:
            r0 = 1048576(0x100000, double:5.180654E-318)
            int r0 = (r23 > r0 ? 1 : (r23 == r0 ? 0 : -1))
            if (r0 <= 0) goto L62
            r0 = 60
            goto L64
        L62:
            r0 = 30
        L64:
            r2 = 1000(0x3e8, double:4.94E-321)
            long r14 = r0 * r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r18.id()
            r0.append(r1)
            java.lang.String r1 = " parallelUploadFile via cgi timeout:"
            r0.append(r1)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.AppMsg.SendFileTask"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            ut.x r9 = new ut.x
            r16 = 0
            r0 = r9
            r1 = r21
            r2 = r20
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r25
            r7 = r23
            r17 = r9
            r9 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9)
            r11.f512288f = r13
            r0 = r17
            java.lang.Object r0 = p3325xe03a0797.p3326xc267989b.a4.c(r14, r0, r11)
            if (r0 != r12) goto Laa
            return r12
        Laa:
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Lb3
            int r0 = r0.intValue()
            goto Lb6
        Lb3:
            r0 = -520021(0xfffffffffff810ab, float:NaN)
        Lb6:
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ut.q0.W(oi3.g, v05.b, boolean, java.lang.String, long, com.tencent.mm.pluginsdk.model.app.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0051  */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y(oi3.g r19, v05.b r20, boolean r21, java.lang.String r22, long r23, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d r25, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r26) {
        /*
            Method dump skipped, instructions count: 1109
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ut.q0.Y(oi3.g, v05.b, boolean, java.lang.String, long, com.tencent.mm.pluginsdk.model.app.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void Z(com.p314xaae8f345.mm.p944x882e457a.f fVar) {
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var;
        q01.o0 m48022x4479fa06;
        int i17 = fVar.f152149b;
        if (i17 == -24 || i17 == -44 || (m1Var = fVar.f152152e) == null || (m48022x4479fa06 = m1Var.m48022x4479fa06()) == null) {
            return;
        }
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) m48022x4479fa06.i()).entrySet()) {
            java.lang.Object value = entry.getValue();
            if (value != null) {
                this.f512245o.f512259j.put(entry.getKey(), value);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a0(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ut.d0
            if (r0 == 0) goto L13
            r0 = r9
            ut.d0 r0 = (ut.d0) r0
            int r1 = r0.f512141i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f512141i = r1
            goto L18
        L13:
            ut.d0 r0 = new ut.d0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f512139g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f512141i
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 != r5) goto L33
            long r1 = r0.f512138f
            java.lang.Object r5 = r0.f512137e
            ut.u0 r5 = (ut.u0) r5
            java.lang.Object r0 = r0.f512136d
            ut.q0 r0 = (ut.q0) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L62
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            long r6 = android.os.SystemClock.elapsedRealtime()
            ut.u0 r9 = new ut.u0
            r9.<init>(r4)
            ut.s0 r2 = r8.f512245o
            r2.f512270u = r9
            ut.e0 r2 = new ut.e0
            r2.<init>(r8, r9, r3)
            r0.f512136d = r8
            r0.f512137e = r9
            r0.f512138f = r6
            r0.f512141i = r5
            java.lang.Object r0 = r2.mo146xb9724478(r0)
            if (r0 != r1) goto L5f
            return r1
        L5f:
            r0 = r8
            r5 = r9
            r1 = r6
        L62:
            r9 = 1097859072(0x41700000, float:15.0)
            r6 = 2
            e0(r0, r9, r4, r6, r3)
            java.util.Map r9 = r5.f512290b
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r1
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r3)
            java.lang.String r1 = "send_first_cgi_cost"
            r9.put(r1, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ut.q0.a0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b0(dn.h r6, v05.b r7, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d r8, boolean r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof ut.i0
            if (r0 == 0) goto L13
            r0 = r10
            ut.i0 r0 = (ut.i0) r0
            int r1 = r0.f512177i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f512177i = r1
            goto L18
        L13:
            ut.i0 r0 = new ut.i0
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.f512175g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f512177i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L88
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            boolean r9 = r0.f512174f
            java.lang.Object r6 = r0.f512173e
            r7 = r6
            v05.b r7 = (v05.b) r7
            java.lang.Object r6 = r0.f512172d
            ut.q0 r6 = (ut.q0) r6
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L5a
        L41:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            boolean r10 = r6.b()
            if (r10 == 0) goto L8f
            r0.f512172d = r5
            r0.f512173e = r7
            r0.f512174f = r9
            r0.f512177i = r4
            java.lang.Object r10 = r5.U(r6, r7, r8, r0)
            if (r10 != r1) goto L59
            return r1
        L59:
            r6 = r5
        L5a:
            java.lang.Number r10 = (java.lang.Number) r10
            int r8 = r10.intValue()
            if (r8 != 0) goto L89
            if (r9 == 0) goto L89
            boolean r9 = r6.j()
            if (r9 != 0) goto L89
            java.lang.Class<qx.h0> r9 = qx.h0.class
            i95.m r9 = i95.n0.c(r9)
            qx.h0 r9 = (qx.h0) r9
            d35.j r9 = (d35.j) r9
            boolean r9 = r9.bj()
            if (r9 == 0) goto L89
            r8 = 0
            r0.f512172d = r8
            r0.f512173e = r8
            r0.f512177i = r3
            java.lang.Object r10 = r6.T(r7, r0)
            if (r10 != r1) goto L88
            return r1
        L88:
            return r10
        L89:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r8)
            return r6
        L8f:
            int r6 = r5.c0(r6, r7, r8)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ut.q0.b0(dn.h, v05.b, com.tencent.mm.pluginsdk.model.app.d, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final int c0(dn.h hVar, v05.b bVar, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar) {
        v05.a aVar = (v05.a) bVar.m75936x14adae67(bVar.f513848e + 8);
        if (aVar == null) {
            return -520009;
        }
        java.lang.String str = hVar.f69522xf9dbbe9c;
        if (str == null) {
            str = "";
        }
        int i17 = aVar.f449897d;
        aVar.set(i17 + 2, str);
        java.lang.String str2 = hVar.f69502xf11df5f5;
        aVar.set(i17 + 3, str2 != null ? str2 : "");
        aVar.set(i17 + 1, "@cdn_" + aVar.m75945x2fec8307(i17 + 2) + '_' + aVar.m75945x2fec8307(i17 + 3) + "_1");
        long j17 = hVar.f69523x17c343e7;
        if (j17 != 0) {
            aVar.set(i17 + 0, java.lang.Long.valueOf(j17));
        }
        java.lang.String field_filemd5 = hVar.f69526x419c9c3d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_filemd5, "field_filemd5");
        if (!r26.n0.N(field_filemd5)) {
            java.lang.String field_filemd52 = hVar.f69526x419c9c3d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_filemd52, "field_filemd5");
            bVar.set(bVar.f513848e + 24, field_filemd52);
        }
        this.f512245o.f512267r = hVar;
        return 0;
    }

    @Override // qi3.c
    public java.lang.Integer d(boolean z17) {
        v05.a aVar;
        java.lang.Integer d17 = super.d(z17);
        if (d17 != null) {
            return d17;
        }
        oi3.g gVar = this.f512245o.f512264o;
        if (gVar == null) {
            return -520009;
        }
        pt0.e0 e0Var = pt0.f0.f439742b1;
        int i17 = gVar.f427150d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(gVar.m75945x2fec8307(i17 + 3), gVar.m75942xfb822ef2(i17 + 0));
        if (k17 == null) {
            return -520002;
        }
        if (k17.W2() || k17.V2()) {
            return -520023;
        }
        if (k17.I0() == 0 || k17.P0() != 2) {
            return null;
        }
        l15.c cVar = new l15.c();
        java.lang.String U1 = k17.U1();
        if (U1 == null) {
            U1 = "";
        }
        cVar.m126728xdc93280d(U1);
        v05.b k18 = cVar.k();
        if (k18 == null || (aVar = (v05.a) k18.m75936x14adae67(k18.f513848e + 8)) == null) {
            return null;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(aVar.t());
        if (!(valueOf.longValue() != 0)) {
            valueOf = null;
        }
        return (valueOf == null || valueOf.longValue() == k17.I0()) ? null : -520008;
    }

    public final void d0(float f17, boolean z17) {
        ut.s0 s0Var = this.f512245o;
        if (s0Var.f512268s < f17) {
            s0Var.f512268s = f17;
        }
        if (z17) {
            f1();
        }
    }

    @Override // qi3.c
    public void f1() {
        qi3.e0 h17 = h();
        if (h17.f445224a == qi3.g0.f445245n) {
            if (h17.a() != -510001) {
                pt.g0 g0Var = (pt.g0) i95.n0.c(pt.g0.class);
                oi3.g gVar = this.f512245o.f512264o;
                ((ot.g) g0Var).getClass();
                if (gVar != null) {
                    pt0.e0 e0Var = pt0.f0.f439742b1;
                    int i17 = gVar.f427150d;
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(gVar.m75945x2fec8307(i17 + 3), gVar.m75942xfb822ef2(i17 + 0));
                    if (k17 != null) {
                        ut.b.f512125f.a().T6(k17, false);
                    }
                }
            }
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f512245o.A;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            this.f512245o.A = null;
        }
        super.f1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x021f, code lost:
    
        if (r9 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0240, code lost:
    
        if (r9 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0250, code lost:
    
        if (r9 != null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0242, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g0(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r42) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ut.q0.g0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.j, qi3.c
    public qi3.e0 h() {
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5;
        qi3.e0 e0Var = new qi3.e0(this.f445210f, this);
        ut.s0 s0Var = this.f512245o;
        oi3.g gVar = s0Var.f512264o;
        if (gVar != null) {
            int i17 = gVar.f427150d;
            c16564xb55e1d5 = new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(gVar.m75942xfb822ef2(i17 + 0), gVar.m75945x2fec8307(i17 + 3));
        } else {
            c16564xb55e1d5 = null;
        }
        e0Var.f445230g = c16564xb55e1d5;
        e0Var.f445231h = s0Var.f512268s;
        e0Var.f445226c = s0Var.f512269t;
        e0Var.f445227d = s0Var.f512271v;
        e0Var.f445228e = s0Var.f512272w;
        e0Var.f445229f = s0Var.f512273x;
        return e0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h0(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ut.q0.h0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.j, qi3.c
    public boolean j() {
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.J3(this.f512245o.f512250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // ru.j, qi3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ut.b0
            if (r0 == 0) goto L13
            r0 = r9
            ut.b0 r0 = (ut.b0) r0
            int r1 = r0.f512131i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f512131i = r1
            goto L18
        L13:
            ut.b0 r0 = new ut.b0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f512129g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f512131i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            long r1 = r0.f512128f
            java.lang.Object r4 = r0.f512127e
            qi3.d0 r4 = (qi3.d0) r4
            java.lang.Object r0 = r0.f512126d
            ut.q0 r0 = (ut.q0) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L7c
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = r8.id()
            r9.append(r2)
            java.lang.String r2 = " start to sendBypCgi"
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.String r2 = "MicroMsg.AppMsg.SendFileTask"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r9)
            long r5 = android.os.SystemClock.elapsedRealtime()
            qi3.d0 r9 = new qi3.d0
            r9.<init>(r3)
            ut.s0 r2 = r8.f512245o
            r2.f512272w = r9
            ut.c0 r2 = new ut.c0
            r7 = 0
            r2.<init>(r8, r9, r7)
            r0.f512126d = r8
            r0.f512127e = r9
            r0.f512128f = r5
            r0.f512131i = r4
            java.lang.Object r0 = r2.mo146xb9724478(r0)
            if (r0 != r1) goto L79
            return r1
        L79:
            r0 = r8
            r4 = r9
            r1 = r5
        L7c:
            r9 = 1120403456(0x42c80000, float:100.0)
            r0.d0(r9, r3)
            java.util.Map r9 = r4.f445217b
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r1
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r5)
            java.lang.String r1 = "send_cost"
            r9.put(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ut.q0.k(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // ru.j, qi3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ut.f0
            if (r0 == 0) goto L13
            r0 = r9
            ut.f0 r0 = (ut.f0) r0
            int r1 = r0.f512158i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f512158i = r1
            goto L18
        L13:
            ut.f0 r0 = new ut.f0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f512156g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f512158i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            long r1 = r0.f512155f
            java.lang.Object r4 = r0.f512154e
            qi3.d0 r4 = (qi3.d0) r4
            java.lang.Object r0 = r0.f512153d
            ut.q0 r0 = (ut.q0) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L7c
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = r8.id()
            r9.append(r2)
            java.lang.String r2 = " start to sendNormalCgi"
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.String r2 = "MicroMsg.AppMsg.SendFileTask"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r9)
            long r5 = android.os.SystemClock.elapsedRealtime()
            qi3.d0 r9 = new qi3.d0
            r9.<init>(r3)
            ut.s0 r2 = r8.f512245o
            r2.f512272w = r9
            ut.h0 r2 = new ut.h0
            r7 = 0
            r2.<init>(r8, r9, r7)
            r0.f512153d = r8
            r0.f512154e = r9
            r0.f512155f = r5
            r0.f512158i = r4
            java.lang.Object r0 = r2.mo146xb9724478(r0)
            if (r0 != r1) goto L79
            return r1
        L79:
            r0 = r8
            r4 = r9
            r1 = r5
        L7c:
            r9 = 1120403456(0x42c80000, float:100.0)
            r0.d0(r9, r3)
            java.util.Map r9 = r4.f445217b
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r1
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r5)
            java.lang.String r1 = "send_cost"
            r9.put(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ut.q0.m(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.j
    public com.p314xaae8f345.mm.p947xba6de98f.v2 u() {
        return this.f512247q;
    }

    @Override // ru.j
    public void w(oi3.g fileMsgInfo, int i17) {
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileMsgInfo, "fileMsgInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMsgSendFail Id:");
        int i18 = fileMsgInfo.f427150d;
        sb6.append(fileMsgInfo.m75942xfb822ef2(i18 + 0));
        sb6.append(" Talker:");
        sb6.append(fileMsgInfo.m75945x2fec8307(i18 + 3));
        sb6.append(" retCode:");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.SendFileTask", sb6.toString());
        switch (i17) {
            case -520023:
            case -520019:
            case -520008:
            case -520002:
            case -510001:
                p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 Ai = ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ai("download_file_" + fileMsgInfo.m75942xfb822ef2(i18 + 0) + '_' + fileMsgInfo.m75945x2fec8307(i18 + 3) + '_' + fileMsgInfo.m75942xfb822ef2(i18 + 2));
                p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 Bi = ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Bi("upload_file_" + fileMsgInfo.m75942xfb822ef2(i18 + 0) + '_' + fileMsgInfo.m75945x2fec8307(i18 + 3) + '_' + fileMsgInfo.m75942xfb822ef2(i18 + 2));
                gm0.b bVar = gm0.j1.b().f354778h;
                if (bVar == null || (c20976x6ba6452a = bVar.f354678e) == null) {
                    return;
                }
                v65.i.b(c20976x6ba6452a, null, new ut.t(Ai, Bi, this, null), 1, null);
                return;
            default:
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(fileMsgInfo.m75945x2fec8307(i18 + 3), fileMsgInfo.m75942xfb822ef2(i18 + 0));
                if (k17 != null) {
                    k17.r1(5);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2.class)).cj().lb(k17.m124847x74d37ac6(), k17, true);
                    ((bt3.u1) ((mc0.i) i95.n0.c(mc0.i.class))).Ai(k17.m124847x74d37ac6());
                    ((com.p314xaae8f345.mm.p793x2f25ba7b.a) ((v90.u) i95.n0.c(v90.u.class))).wi(k17);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // ru.j, qi3.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ut.l0
            if (r0 == 0) goto L13
            r0 = r9
            ut.l0 r0 = (ut.l0) r0
            int r1 = r0.f512199i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f512199i = r1
            goto L18
        L13:
            ut.l0 r0 = new ut.l0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f512197g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f512199i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            long r1 = r0.f512196f
            java.lang.Object r4 = r0.f512195e
            qi3.i0 r4 = (qi3.i0) r4
            java.lang.Object r0 = r0.f512194d
            ut.q0 r0 = (ut.q0) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L7c
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = r8.id()
            r9.append(r2)
            java.lang.String r2 = " start to uploadAttach"
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.String r2 = "MicroMsg.AppMsg.SendFileTask"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r9)
            long r5 = android.os.SystemClock.elapsedRealtime()
            qi3.i0 r9 = new qi3.i0
            r9.<init>(r3)
            ut.s0 r2 = r8.f512245o
            r2.f512271v = r9
            ut.m0 r2 = new ut.m0
            r7 = 0
            r2.<init>(r8, r9, r7)
            r0.f512194d = r8
            r0.f512195e = r9
            r0.f512196f = r5
            r0.f512199i = r4
            java.lang.Object r0 = r2.mo146xb9724478(r0)
            if (r0 != r1) goto L79
            return r1
        L79:
            r0 = r8
            r4 = r9
            r1 = r5
        L7c:
            int r9 = r4.f445258a
            if (r9 != 0) goto L85
            r9 = 1119092736(0x42b40000, float:90.0)
            r0.d0(r9, r3)
        L85:
            java.util.Map r9 = r4.f445259b
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r1
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r5)
            java.lang.String r1 = "upload_cost"
            r9.put(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ut.q0.y(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
