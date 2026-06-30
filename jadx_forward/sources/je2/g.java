package je2;

/* loaded from: classes10.dex */
public final class g extends mm2.e {

    /* renamed from: u, reason: collision with root package name */
    public static final je2.a f380753u = new je2.a(null);

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f380754f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ei0 f380755g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Bitmap f380756h;

    /* renamed from: i, reason: collision with root package name */
    public float f380757i;

    /* renamed from: m, reason: collision with root package name */
    public float f380758m;

    /* renamed from: n, reason: collision with root package name */
    public float f380759n;

    /* renamed from: o, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f380760o;

    /* renamed from: p, reason: collision with root package name */
    public r45.ca2 f380761p;

    /* renamed from: q, reason: collision with root package name */
    public r45.da2 f380762q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f380763r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f380764s;

    /* renamed from: t, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f380765t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f380757i = 1.0f;
        this.f380758m = 0.5f;
        this.f380759n = 0.3f;
        u26.u uVar = u26.u.DROP_OLDEST;
        this.f380760o = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.a(0, 1, uVar);
        this.f380763r = jz5.h.b(je2.e.f380751d);
        this.f380764s = jz5.h.b(je2.f.f380752d);
        this.f380765t = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.a(0, 1, uVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0a27  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x08e4  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x09a2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x09b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x09c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x09d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0a12  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0a2f  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x09d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x09bb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x09a8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x08df  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x06b4  */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:135:0x0624 -> B:86:0x064c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:137:0x0672 -> B:87:0x069c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:204:0x020b -> B:155:0x0231). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:205:0x0254 -> B:156:0x0276). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0869 -> B:12:0x0881). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x08a2 -> B:13:0x08cc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N6(je2.g r38, java.lang.String r39, java.util.LinkedList r40, java.util.Map r41, be2.k r42, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r43) {
        /*
            Method dump skipped, instructions count: 2711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: je2.g.N6(je2.g, java.lang.String, java.util.LinkedList, java.util.Map, be2.k, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static java.util.LinkedList S6(je2.g gVar, boolean z17, int i17, java.lang.Object obj) {
        java.util.LinkedList<r45.h84> m75941xfb821914;
        if ((i17 & 1) != 0) {
            gVar.getClass();
            z17 = false;
        }
        r45.ca2 ca2Var = gVar.f380761p;
        java.util.LinkedList linkedList = null;
        if (ca2Var != null && (m75941xfb821914 = ca2Var.m75941xfb821914(0)) != null) {
            for (r45.h84 h84Var : m75941xfb821914) {
                if (linkedList == null) {
                    linkedList = new java.util.LinkedList();
                }
                r45.h84 h84Var2 = new r45.h84();
                byte[] mo14344x5f01b1f6 = h84Var.mo14344x5f01b1f6();
                if (mo14344x5f01b1f6 != null) {
                    try {
                        h84Var2.mo11468x92b714fd(mo14344x5f01b1f6);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                    }
                }
                linkedList.add(h84Var2);
            }
        }
        if (linkedList == null) {
            linkedList = new java.util.LinkedList();
        }
        if (z17) {
            r45.h84 h84Var3 = new r45.h84();
            h84Var3.set(0, "");
            linkedList.add(0, h84Var3);
        }
        return linkedList;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O6() {
        /*
            r7 = this;
            boolean r0 = r7.T6()
            if (r0 == 0) goto Lcf
            java.lang.Class<mm2.c1> r0 = mm2.c1.class
            androidx.lifecycle.c1 r0 = r7.m147920xbba4bfc0(r0)
            mm2.c1 r0 = (mm2.c1) r0
            long r0 = r0.R1
            r2 = 512(0x200, double:2.53E-321)
            boolean r2 = pm0.v.A(r0, r2)
            r3 = 1
            r2 = r2 ^ r3
            r4 = 256(0x100, double:1.265E-321)
            boolean r4 = pm0.v.A(r0, r4)
            r4 = r4 ^ r3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "checkDropSticker flag:"
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = ",dropPic:"
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = ",dropText:"
            r5.append(r0)
            r5.append(r4)
            r0 = 33
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.String r1 = "Finder.LiveAnchorStickerSlice"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            r0 = 0
            r1 = 0
            if (r2 == 0) goto L82
            r45.ei0 r2 = r7.f380755g
            if (r2 == 0) goto L62
            java.util.LinkedList r2 = r2.f455063e
            if (r2 == 0) goto L62
            java.lang.Object r2 = kz5.n0.Z(r2)
            r45.gi0 r2 = (r45.gi0) r2
            if (r2 == 0) goto L62
            r45.kp r2 = r2.f456810p
            if (r2 == 0) goto L62
            java.lang.String r2 = r2.f460420d
            goto L63
        L62:
            r2 = r0
        L63:
            if (r2 == 0) goto L6e
            int r5 = r2.length()
            if (r5 != 0) goto L6c
            goto L6e
        L6c:
            r5 = r1
            goto L6f
        L6e:
            r5 = r3
        L6f:
            if (r5 != 0) goto L82
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            r45.ck1 r6 = new r45.ck1
            r6.<init>()
            r6.set(r1, r2)
            r5.add(r6)
            goto L83
        L82:
            r5 = r0
        L83:
            if (r4 == 0) goto Lbc
            r45.ei0 r2 = r7.f380755g
            if (r2 == 0) goto L9b
            java.util.LinkedList r2 = r2.f455062d
            if (r2 == 0) goto L9b
            java.lang.Object r2 = kz5.n0.Z(r2)
            r45.ji0 r2 = (r45.ji0) r2
            if (r2 == 0) goto L9b
            r45.kp r2 = r2.f459367s
            if (r2 == 0) goto L9b
            java.lang.String r0 = r2.f460420d
        L9b:
            if (r0 == 0) goto La6
            int r2 = r0.length()
            if (r2 != 0) goto La4
            goto La6
        La4:
            r2 = r1
            goto La7
        La6:
            r2 = r3
        La7:
            if (r2 != 0) goto Lbc
            if (r5 != 0) goto Lb1
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r5 = r2
        Lb1:
            r45.ck1 r2 = new r45.ck1
            r2.<init>()
            r2.set(r1, r0)
            r5.add(r2)
        Lbc:
            if (r5 == 0) goto Lc6
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto Lc5
            goto Lc6
        Lc5:
            r3 = r1
        Lc6:
            if (r3 != 0) goto Lcf
            kotlinx.coroutines.flow.i2 r0 = r7.f380765t
            kotlinx.coroutines.flow.q2 r0 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) r0
            r0.e(r5)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je2.g.O6():void");
    }

    public final java.util.Map P6() {
        return (java.util.Map) ((jz5.n) this.f380763r).mo141623x754a37bb();
    }

    public final java.io.File Q6(java.lang.String stickerId) {
        java.lang.String str;
        com.p314xaae8f345.mm.vfs.r6 r6Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stickerId, "stickerId");
        ce2.o oVar = (ce2.o) P6().get(stickerId);
        if (oVar == null || (str = oVar.f67344x2260084a) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.LiveAnchorStickerSlice", "getStickerBubbleFile stickerId:" + stickerId + " but file path is null!");
        } else {
            com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
            if (r6Var2.y()) {
                com.p314xaae8f345.mm.vfs.r6[] G = r6Var2.G();
                r6Var = G != null ? (com.p314xaae8f345.mm.vfs.r6) kz5.z.O(G) : null;
            } else {
                r6Var = r6Var2;
            }
            java.lang.Boolean valueOf = r6Var != null ? java.lang.Boolean.valueOf(r6Var.m()) : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getStickerBubbleFile stickerId:");
            sb6.append(stickerId);
            sb6.append(" file isDirectory:");
            sb6.append(r6Var2.y());
            sb6.append(", path:");
            sb6.append(r6Var != null ? r6Var.o() : null);
            sb6.append(",exists:");
            sb6.append(valueOf);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorStickerSlice", sb6.toString());
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, java.lang.Boolean.TRUE)) {
                return new java.io.File(com.p314xaae8f345.mm.vfs.w6.i(r6Var.u(), false));
            }
        }
        return null;
    }

    public final java.util.Map R6() {
        return (java.util.Map) ((jz5.n) this.f380764s).mo141623x754a37bb();
    }

    public final boolean T6() {
        r45.ei0 ei0Var = this.f380755g;
        java.util.LinkedList linkedList = ei0Var != null ? ei0Var.f455062d : null;
        if (linkedList == null || linkedList.isEmpty()) {
            r45.ei0 ei0Var2 = this.f380755g;
            java.util.LinkedList linkedList2 = ei0Var2 != null ? ei0Var2.f455063e : null;
            if (linkedList2 == null || linkedList2.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public final void U6() {
        if (this.f380754f) {
            return;
        }
        this.f380754f = true;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        P6().clear();
        ((rl2.x) ((jz5.n) ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).A).mo141623x754a37bb()).J0();
        java.util.Iterator it = ((java.util.ArrayList) ((rl2.x) ((jz5.n) ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).A).mo141623x754a37bb()).D0()).iterator();
        int i17 = 0;
        int i18 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            ce2.o oVar = (ce2.o) next;
            java.util.Map P6 = P6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(P6, "<get-stickerBubbleCache>(...)");
            P6.put(oVar.f67342xc8a07680, oVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorStickerSlice", "prepareStickerCache stickerBubbleCache_" + i18 + ",id:" + oVar.f67342xc8a07680 + ",md5:" + oVar.f67343x4b6e68b9 + ",path:" + oVar.f67344x2260084a);
            i18 = i19;
        }
        R6().clear();
        ((rl2.y) ((jz5.n) ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).B).mo141623x754a37bb()).J0();
        java.util.Iterator it6 = ((java.util.ArrayList) ((rl2.y) ((jz5.n) ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).B).mo141623x754a37bb()).D0()).iterator();
        while (it6.hasNext()) {
            java.lang.Object next2 = it6.next();
            int i27 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            ce2.o oVar2 = (ce2.o) next2;
            java.util.Map R6 = R6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(R6, "<get-stickerFontCache>(...)");
            R6.put(oVar2.f67342xc8a07680, oVar2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorStickerSlice", "prepareStickerCache stickerFontCache" + i17 + ",id:" + oVar2.f67342xc8a07680 + ",md5:" + oVar2.f67343x4b6e68b9 + ",path:" + oVar2.f67344x2260084a);
            i17 = i27;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorStickerSlice", "prepareStickerCache time cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    public final void V6(java.lang.String source, r45.ei0 ei0Var, boolean z17) {
        java.util.LinkedList linkedList;
        r45.gi0 gi0Var;
        java.util.LinkedList linkedList2;
        r45.gi0 gi0Var2;
        r45.kp kpVar;
        java.util.LinkedList linkedList3;
        r45.ji0 ji0Var;
        java.util.LinkedList linkedList4;
        r45.ji0 ji0Var2;
        r45.kp kpVar2;
        java.util.LinkedList linkedList5;
        java.util.LinkedList linkedList6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        java.lang.String str = null;
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
            sb6.append('_');
            sb6.append(android.os.SystemClock.elapsedRealtime());
            sb6.append('_');
            java.lang.String sb7 = sb6.toString();
            if (ei0Var != null && (linkedList6 = ei0Var.f455062d) != null) {
                int i17 = 0;
                for (java.lang.Object obj : linkedList6) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.ji0 ji0Var3 = (r45.ji0) obj;
                    if (ji0Var3.f459367s == null) {
                        ji0Var3.f459367s = new r45.kp();
                    }
                    ji0Var3.f459367s.f460420d = sb7 + com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24 + i17;
                    i17 = i18;
                }
            }
            if (ei0Var != null && (linkedList5 = ei0Var.f455063e) != null) {
                int i19 = 0;
                for (java.lang.Object obj2 : linkedList5) {
                    int i27 = i19 + 1;
                    if (i19 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.gi0 gi0Var3 = (r45.gi0) obj2;
                    if (gi0Var3.f456810p == null) {
                        gi0Var3.f456810p = new r45.kp();
                    }
                    gi0Var3.f456810p.f460420d = sb7 + "picture" + i19;
                    i19 = i27;
                }
            }
        } else {
            if (ei0Var != null && (linkedList3 = ei0Var.f455062d) != null && (ji0Var = (r45.ji0) kz5.n0.Z(linkedList3)) != null) {
                if (ji0Var.f459367s == null) {
                    ji0Var.f459367s = new r45.kp();
                }
                r45.kp kpVar3 = ji0Var.f459367s;
                r45.ei0 ei0Var2 = this.f380755g;
                kpVar3.f460420d = (ei0Var2 == null || (linkedList4 = ei0Var2.f455062d) == null || (ji0Var2 = (r45.ji0) kz5.n0.Z(linkedList4)) == null || (kpVar2 = ji0Var2.f459367s) == null) ? null : kpVar2.f460420d;
            }
            if (ei0Var != null && (linkedList = ei0Var.f455063e) != null && (gi0Var = (r45.gi0) kz5.n0.Z(linkedList)) != null) {
                if (gi0Var.f456810p == null) {
                    gi0Var.f456810p = new r45.kp();
                }
                r45.kp kpVar4 = gi0Var.f456810p;
                r45.ei0 ei0Var3 = this.f380755g;
                if (ei0Var3 != null && (linkedList2 = ei0Var3.f455063e) != null && (gi0Var2 = (r45.gi0) kz5.n0.Z(linkedList2)) != null && (kpVar = gi0Var2.f456810p) != null) {
                    str = kpVar.f460420d;
                }
                kpVar4.f460420d = str;
            }
        }
        this.f380755g = ei0Var;
        Y6(ei0Var);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(source);
        sb8.append(" saveRestoreData ");
        sb8.append(ei0Var != null ? ei0Var.hashCode() : 0);
        sb8.append(",updateStickerId:");
        sb8.append(z17);
        sb8.append(",content:");
        sb8.append(f380753u.b(ei0Var));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorStickerSlice", sb8.toString());
    }

    public final void W6(r45.ca2 ca2Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorStickerSlice", "set stickerBubbleInfo:".concat(f380753u.c(ca2Var != null ? ca2Var.m75941xfb821914(0) : null)));
        this.f380761p = ca2Var;
        if (ca2Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(this.f410496d.f354008i, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new je2.b(this, ca2Var, null), 2, null);
        }
    }

    public final void X6(r45.da2 da2Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorStickerSlice", "set stickerFontInfo:".concat(f380753u.c(da2Var != null ? da2Var.m75941xfb821914(0) : null)));
        this.f380762q = da2Var;
        if (da2Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(this.f410496d.f354008i, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new je2.c(this, da2Var, null), 2, null);
        }
    }

    public final void Y6(r45.ei0 ei0Var) {
        java.util.LinkedList linkedList;
        r45.ji0 ji0Var;
        if (ei0Var == null || (linkedList = ei0Var.f455062d) == null || (ji0Var = (r45.ji0) kz5.n0.Z(linkedList)) == null) {
            return;
        }
        float f17 = ji0Var.f459355d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorStickerSlice", "editorPivotX:" + f17 + ",editorPivotY:" + this.f380759n);
        this.f380758m = f17;
        float f18 = ji0Var.f459356e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorStickerSlice", "editorPivotX:" + this.f380758m + ",editorPivotY:" + f18);
        this.f380759n = f18;
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        W6(null);
        X6(null);
        android.graphics.Bitmap bitmap = this.f380756h;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f380756h = null;
        this.f380757i = 1.0f;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        ((rl2.x) ((jz5.n) ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).A).mo141623x754a37bb()).L0();
        ((rl2.y) ((jz5.n) ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).B).mo141623x754a37bb()).L0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorStickerSlice", "saveStickerCache time cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        P6().clear();
        R6().clear();
        this.f380754f = false;
    }
}
