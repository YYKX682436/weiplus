package gf4;

/* loaded from: classes4.dex */
public final class l implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: m, reason: collision with root package name */
    public static r45.le6 f352893m;

    /* renamed from: n, reason: collision with root package name */
    public static gf4.a f352894n;

    /* renamed from: d, reason: collision with root package name */
    public static final gf4.l f352887d = new gf4.l();

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f352888e = gm0.j1.u().d() + "story/commentCache.proto";

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f352889f = ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).wi() + "commentCache.proto";

    /* renamed from: g, reason: collision with root package name */
    public static final int f352890g = Integer.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f352891h = "MicroMsg.StoryCommentLogic";

    /* renamed from: i, reason: collision with root package name */
    public static final r45.je6 f352892i = new r45.je6();

    /* renamed from: o, reason: collision with root package name */
    public static int f352895o = -1;

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.ArrayList f352896p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.LinkedList f352897q = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.LinkedList f352898r = new java.util.LinkedList();

    public static gf4.a i(gf4.l lVar, long j17, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, java.lang.String str3, java.lang.String str4, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 128) != 0) {
            i17 = 0;
        }
        if ((i19 & 256) != 0) {
            i18 = 0;
        }
        lVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ef4.v vVar = ef4.w.f334001t;
        sb6.append(vVar.e());
        sb6.append("");
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(android.os.SystemClock.elapsedRealtime());
        byte[] bytes = sb6.toString().getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        r45.le6 le6Var = new r45.le6();
        le6Var.f460922m = g17;
        le6Var.f460916d = j17;
        le6Var.f460920h = str2;
        le6Var.f460918f = vVar.e();
        le6Var.f460919g = str;
        le6Var.f460917e = c01.id.e();
        le6Var.f460921i = 1;
        le6Var.f460924o = z17 ? 1 : 0;
        le6Var.f460926q = z18 ? 1 : 0;
        le6Var.f460927r = str3;
        le6Var.f460928s = str4;
        le6Var.f460929t = i17;
        le6Var.f460930u = i18;
        f352892i.f459301d.add(le6Var);
        f352894n = new gf4.a(le6Var);
        lVar.m();
        vVar.l().mo50293x3498a0(new gf4.h(le6Var));
        gf4.a aVar = f352894n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
        return aVar;
    }

    public final void a(yz5.r listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        java.util.ArrayList arrayList = f352896p;
        if (arrayList.contains(listener)) {
            return;
        }
        arrayList.add(listener);
    }

    public final void b(r45.hf6 syncMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(syncMsg, "syncMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f352891h, "addSyncComment " + syncMsg.f457653d + ' ' + syncMsg.f457655f.f458536o + ' ' + syncMsg.f457655f.f458535n);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        ef4.v vVar = ef4.w.f334001t;
        nf4.b z07 = vVar.f().z0(syncMsg.f457655f.f458528d);
        h0Var.f391656d = z07;
        if (z07 == null) {
            nf4.b bVar = new nf4.b();
            h0Var.f391656d = bVar;
            bVar.f66010x44346ab = syncMsg.f457653d;
        }
        k(syncMsg);
        java.lang.Object obj = h0Var.f391656d;
        if (((nf4.b) obj).f66009xb19dc511 == 0) {
            ((nf4.b) obj).f66009xb19dc511 = 1;
        }
        nf4.b bVar2 = (nf4.b) obj;
        java.lang.String FromUserName = syncMsg.f457655f.f458529e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(FromUserName, "FromUserName");
        bVar2.getClass();
        bVar2.f418373x = FromUserName;
        nf4.b bVar3 = (nf4.b) h0Var.f391656d;
        java.lang.String UserName = syncMsg.f457655f.f458540s.f453917e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UserName, "UserName");
        bVar3.getClass();
        bVar3.f418374y = UserName;
        java.lang.Object obj2 = h0Var.f391656d;
        r45.if6 if6Var = syncMsg.f457655f;
        ((nf4.b) obj2).f66011xd21ed4fa = if6Var.f458536o;
        ((nf4.b) obj2).f66012xc5c29eec = if6Var.f458535n;
        vVar.f().mo11260x413cb2b4((l75.f0) h0Var.f391656d);
        pm0.v.X(new gf4.b(h0Var));
    }

    public final void c(r45.hf6 syncMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(syncMsg, "syncMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f352891h, "addSyncVisit " + syncMsg.f457653d + ' ' + syncMsg.f457655f.f458536o + ' ' + syncMsg.f457655f.f458535n + " enableVisit:" + bf4.f.f101248b.f());
        k(syncMsg);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        ef4.v vVar = ef4.w.f334001t;
        nf4.b z07 = vVar.f().z0(syncMsg.f457655f.f458528d);
        h0Var.f391656d = z07;
        if (z07 == null) {
            nf4.b bVar = new nf4.b();
            h0Var.f391656d = bVar;
            bVar.f66010x44346ab = syncMsg.f457653d;
        }
        if (((nf4.b) h0Var.f391656d).f66009xb19dc511 == 0) {
            java.lang.Integer num = null;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(syncMsg.f457655f.f458533i)) {
                java.util.LinkedList linkedList = syncMsg.f457655f.f458540s.f453925p;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList);
                r45.ke6 ke6Var = (r45.ke6) kz5.n0.a0(linkedList, linkedList.size() - 2);
                if (ke6Var != null) {
                    num = java.lang.Integer.valueOf(ke6Var.f460167i);
                }
            } else {
                java.util.LinkedList linkedList2 = syncMsg.f457655f.f458540s.f453923n;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList2);
                r45.ke6 ke6Var2 = (r45.ke6) kz5.n0.a0(linkedList2, linkedList2.size() - 2);
                if (ke6Var2 != null) {
                    num = java.lang.Integer.valueOf(ke6Var2.f460167i);
                }
            }
            ((nf4.b) h0Var.f391656d).f66009xb19dc511 = num != null ? num.intValue() : 1;
        }
        nf4.b bVar2 = (nf4.b) h0Var.f391656d;
        java.lang.String FromUserName = syncMsg.f457655f.f458529e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(FromUserName, "FromUserName");
        bVar2.getClass();
        bVar2.f418373x = FromUserName;
        nf4.b bVar3 = (nf4.b) h0Var.f391656d;
        java.lang.String UserName = syncMsg.f457655f.f458540s.f453917e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UserName, "UserName");
        bVar3.getClass();
        bVar3.f418374y = UserName;
        java.lang.Object obj = h0Var.f391656d;
        r45.if6 if6Var = syncMsg.f457655f;
        ((nf4.b) obj).f66011xd21ed4fa = if6Var.f458536o;
        ((nf4.b) obj).f66012xc5c29eec = if6Var.f458535n;
        vVar.f().mo11260x413cb2b4((l75.f0) h0Var.f391656d);
        pm0.v.X(new gf4.c(h0Var));
    }

    public final void d(r45.hf6 syncMsg) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        r45.ke6 ke6Var;
        java.lang.Object obj4;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(syncMsg, "syncMsg");
        java.lang.String str2 = "delSyncComment " + syncMsg.f457653d + ' ' + syncMsg.f457655f.f458536o;
        java.lang.String str3 = f352891h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str2);
        r45.if6 if6Var = syncMsg.f457655f;
        f(if6Var.f458528d, if6Var.f458536o, if6Var.f458533i);
        long j17 = syncMsg.f457655f.f458528d;
        ef4.v vVar = ef4.w.f334001t;
        nf4.j L0 = vVar.i().L0(j17);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        nf4.b z07 = vVar.f().z0(j17);
        if (z07 == null) {
            return;
        }
        h0Var.f391656d = z07;
        java.lang.String str4 = "";
        if (L0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "updateLastCommentSync will reset to 0 0");
            nf4.b bVar = (nf4.b) h0Var.f391656d;
            bVar.f66009xb19dc511 = 0;
            bVar.f66008xae67405f = 0;
            bVar.f66012xc5c29eec = 0;
            bVar.f66011xd21ed4fa = 0;
            bVar.getClass();
            bVar.f418373x = "";
        } else {
            r45.df6 df6Var = new r45.df6();
            try {
                df6Var.mo11468x92b714fd(L0.f69400x4c58c87d);
            } catch (java.lang.Exception unused) {
            }
            java.util.LinkedList CommentList = df6Var.f453923n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(CommentList, "CommentList");
            java.util.ListIterator listIterator = CommentList.listIterator(CommentList.size());
            while (true) {
                obj = null;
                if (!listIterator.hasPrevious()) {
                    obj2 = null;
                    break;
                }
                obj2 = listIterator.previous();
                r45.ke6 ke6Var2 = (r45.ke6) obj2;
                if (ke6Var2.f460172q != 0 && ke6Var2.f460167i <= ((nf4.b) h0Var.f391656d).f66009xb19dc511) {
                    break;
                }
            }
            r45.ke6 ke6Var3 = (r45.ke6) obj2;
            if (ke6Var3 == null) {
                if (bf4.f.f101248b.f()) {
                    java.util.LinkedList VisitorList = df6Var.f453935z;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(VisitorList, "VisitorList");
                    java.util.ListIterator listIterator2 = VisitorList.listIterator(VisitorList.size());
                    while (true) {
                        if (!listIterator2.hasPrevious()) {
                            obj4 = null;
                            break;
                        }
                        obj4 = listIterator2.previous();
                        r45.ke6 ke6Var4 = (r45.ke6) obj4;
                        if (ke6Var4.f460172q != 0 && ke6Var4.f460167i <= ((nf4.b) h0Var.f391656d).f66009xb19dc511) {
                            break;
                        }
                    }
                    ke6Var = (r45.ke6) obj4;
                } else {
                    java.util.LinkedList BubbleList = df6Var.f453925p;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(BubbleList, "BubbleList");
                    java.util.ListIterator listIterator3 = BubbleList.listIterator(BubbleList.size());
                    while (true) {
                        if (!listIterator3.hasPrevious()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = listIterator3.previous();
                        r45.ke6 ke6Var5 = (r45.ke6) obj3;
                        if (ke6Var5.f460172q != 0 && ke6Var5.f460167i <= ((nf4.b) h0Var.f391656d).f66009xb19dc511) {
                            break;
                        }
                    }
                    ke6Var = (r45.ke6) obj3;
                }
                ke6Var3 = ke6Var;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateLastCommentSync will reset to ");
            sb6.append(ke6Var3 != null ? java.lang.Integer.valueOf(ke6Var3.f460167i) : null);
            sb6.append(' ');
            sb6.append(ke6Var3 != null ? java.lang.Integer.valueOf(ke6Var3.f460172q) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb6.toString());
            nf4.b bVar2 = (nf4.b) h0Var.f391656d;
            bVar2.f66009xb19dc511 = ke6Var3 != null ? ke6Var3.f460167i : 0;
            bVar2.f66008xae67405f = ke6Var3 != null ? ke6Var3.f460172q : 0;
            bVar2.f66012xc5c29eec = ke6Var3 != null ? ke6Var3.f460167i : 0;
            bVar2.f66011xd21ed4fa = ke6Var3 != null ? ke6Var3.f460172q : 0;
            java.lang.String str5 = ke6Var3 != null ? ke6Var3.f460163e : null;
            if (str5 == null) {
                str5 = "";
            }
            bVar2.getClass();
            bVar2.f418373x = str5;
            java.util.Iterator it = CommentList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                r45.ke6 ke6Var6 = (r45.ke6) next;
                if (ke6Var6.f460172q != 0 && ke6Var6.f460167i > ((nf4.b) h0Var.f391656d).f66009xb19dc511) {
                    obj = next;
                    break;
                }
            }
            if (((r45.ke6) obj) == null) {
                L0.F0(false);
                long j18 = L0.f69410x443468b;
                int i17 = L0.f69406x52c1d072;
                ef4.w.f334001t.i().f418405h.A("MMStoryInfo", "UPDATE MMStoryInfo SET localFlag = " + i17 + " Where storyID = '" + j18 + '\'');
            }
        }
        nf4.b bVar3 = (nf4.b) h0Var.f391656d;
        if (L0 != null && (str = L0.f69412xdde069b) != null) {
            str4 = str;
        }
        bVar3.getClass();
        bVar3.f418374y = str4;
        ef4.w.f334001t.f().mo11260x413cb2b4((l75.f0) h0Var.f391656d);
        pm0.v.X(new gf4.k(h0Var));
    }

    public final void e(long j17, int i17, java.lang.String str, java.lang.String content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f352891h, "deleteComment storyId:" + j17 + " commentId:" + i17 + " sessionId:" + str + " content:" + content);
        if (i17 != 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            ef4.v vVar = ef4.w.f334001t;
            sb6.append(vVar.e());
            sb6.append("");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(android.os.SystemClock.elapsedRealtime());
            byte[] bytes = sb6.toString().getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            java.lang.String g17 = kk.k.g(bytes);
            r45.le6 le6Var = new r45.le6();
            le6Var.f460916d = j17;
            le6Var.f460922m = g17;
            le6Var.f460923n = i17;
            le6Var.f460917e = c01.id.e();
            le6Var.f460921i = 3;
            le6Var.f460927r = str;
            le6Var.f460918f = vVar.e();
            le6Var.f460919g = "";
            f352892i.f459301d.add(le6Var);
            m();
        }
        ef4.w.f334001t.l().mo50293x3498a0(new gf4.d(j17, i17, content));
    }

    public final void f(long j17, int i17, java.lang.String str) {
        int i18;
        nf4.j L0 = ef4.w.f334001t.i().L0(j17);
        if (L0 == null) {
            return;
        }
        r45.df6 df6Var = new r45.df6();
        try {
            df6Var.mo11468x92b714fd(L0.f69400x4c58c87d);
        } catch (java.lang.Exception unused) {
        }
        int i19 = 0;
        java.util.LinkedList CommentList = df6Var.f453923n;
        if (i17 != 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(CommentList, "CommentList");
            java.util.Iterator it = CommentList.iterator();
            i18 = 0;
            while (it.hasNext()) {
                if (((r45.ke6) it.next()).f460172q == i17) {
                    break;
                } else {
                    i18++;
                }
            }
            i18 = -1;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(CommentList, "CommentList");
            java.util.Iterator it6 = CommentList.iterator();
            while (it6.hasNext()) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((r45.ke6) it6.next()).f460168m, str)) {
                    i18 = i19;
                    break;
                }
                i19++;
            }
            i18 = -1;
        }
        if (i18 != -1) {
            CommentList.remove(i18);
            df6Var.f453922m = CommentList.size();
            try {
                L0.f69400x4c58c87d = df6Var.mo14344x5f01b1f6();
            } catch (java.lang.Exception unused2) {
            }
            ef4.w.f334001t.i().mo11261xce0038c9(j17, L0);
        }
    }

    public final r45.ke6 g(r45.le6 le6Var) {
        r45.ke6 ke6Var = new r45.ke6();
        ke6Var.f460162d = le6Var.f460916d;
        ke6Var.f460172q = le6Var.f460923n;
        ke6Var.f460163e = le6Var.f460918f;
        ke6Var.f460164f = le6Var.f460919g;
        ke6Var.f460168m = le6Var.f460920h;
        ke6Var.f460167i = le6Var.f460917e;
        ke6Var.f460175t = le6Var.f460924o;
        ke6Var.f460176u = le6Var.f460926q;
        ke6Var.f460171p = le6Var.f460929t;
        ke6Var.f460170o = le6Var.f460930u;
        return ke6Var;
    }

    public final gf4.a h(long j17, java.lang.String content, java.lang.String toUsername, java.lang.String str, java.lang.String storyOwner, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUsername, "toUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storyOwner, "storyOwner");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f352891h, "postComment: " + j17 + ' ' + content + ' ' + toUsername);
        return i(this, j17, toUsername, content, false, false, str, storyOwner, i17, 0, 256, null);
    }

    public final void j(yz5.r listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        f352896p.remove(listener);
    }

    public final void k(r45.hf6 hf6Var) {
        java.lang.Object obj;
        java.lang.Object obj2;
        boolean z17;
        java.lang.Object obj3;
        java.lang.Object obj4;
        r45.ke6 ke6Var = new r45.ke6();
        long j17 = hf6Var.f457653d;
        ke6Var.f460162d = j17;
        r45.if6 if6Var = hf6Var.f457655f;
        ke6Var.f460172q = if6Var.f458536o;
        ke6Var.f460163e = if6Var.f458529e;
        ke6Var.f460164f = if6Var.f458530f;
        ke6Var.f460168m = if6Var.f458533i;
        ke6Var.f460167i = if6Var.f458535n;
        ke6Var.f460175t = if6Var.f458541t;
        ke6Var.f460171p = if6Var.f458537p;
        if (if6Var.f458534m == 7) {
            ke6Var.f460170o = 4;
        }
        nf4.j L0 = ef4.w.f334001t.i().L0(j17);
        if (L0 == null) {
            o(hf6Var.f457655f.f458540s);
            return;
        }
        r45.df6 df6Var = new r45.df6();
        try {
            df6Var.mo11468x92b714fd(L0.f69400x4c58c87d);
        } catch (java.lang.Exception unused) {
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ke6Var.f460168m);
        java.util.LinkedList BubbleList = df6Var.f453925p;
        java.util.LinkedList CommentList = df6Var.f453923n;
        java.util.LinkedList VisitorList = df6Var.f453935z;
        if (K0 && ke6Var.f460170o == 4) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(VisitorList, "VisitorList");
            java.util.Iterator it = VisitorList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj4 = null;
                    break;
                }
                obj4 = it.next();
                r45.ke6 ke6Var2 = (r45.ke6) obj4;
                if (ke6Var2.f460172q == ke6Var.f460172q || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(ke6Var2.f460163e, ke6Var.f460163e)) {
                    break;
                }
            }
            if (((r45.ke6) obj4) == null) {
                VisitorList.add(ke6Var);
                z17 = true;
            }
            z17 = false;
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ke6Var.f460168m)) {
            if (ke6Var.f460172q != 0) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(BubbleList, "BubbleList");
                java.util.Iterator it6 = BubbleList.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it6.next();
                        if (((r45.ke6) obj2).f460172q == ke6Var.f460172q) {
                            break;
                        }
                    }
                }
                if (((r45.ke6) obj2) == null) {
                    BubbleList.add(ke6Var);
                }
                z17 = false;
            } else {
                BubbleList.add(ke6Var);
            }
            z17 = true;
        } else {
            if (ke6Var.f460172q != 0) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(CommentList, "CommentList");
                java.util.Iterator it7 = CommentList.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it7.next();
                        if (((r45.ke6) obj).f460172q == ke6Var.f460172q) {
                            break;
                        }
                    }
                }
                if (((r45.ke6) obj) == null) {
                    CommentList.add(ke6Var);
                }
                z17 = false;
            } else {
                CommentList.add(ke6Var);
            }
            z17 = true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(VisitorList, "VisitorList");
        java.util.Iterator it8 = VisitorList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                obj3 = null;
                break;
            }
            java.lang.Object next = it8.next();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((r45.ke6) next).f460163e, ke6Var.f460163e)) {
                obj3 = next;
                break;
            }
        }
        if (((r45.ke6) obj3) == null) {
            VisitorList.add(ke6Var);
        }
        if (z17) {
            df6Var.f453922m = CommentList.size();
            df6Var.f453924o = BubbleList.size();
            df6Var.f453934y = VisitorList.size();
            try {
                L0.f69400x4c58c87d = df6Var.mo14344x5f01b1f6();
            } catch (java.lang.Exception unused2) {
            }
            ef4.v vVar = ef4.w.f334001t;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(vVar.e(), L0.f69412xdde069b)) {
                L0.F0(true);
            }
            vVar.i().mo11261xce0038c9(j17, L0);
        }
    }

    public final boolean l(long j17, gf4.a commentDetail) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentDetail, "commentDetail");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        ef4.v vVar = ef4.w.f334001t;
        nf4.b z07 = vVar.f().z0(j17);
        h0Var.f391656d = z07;
        if (z07 == null) {
            nf4.b bVar = new nf4.b();
            h0Var.f391656d = bVar;
            bVar.f66010x44346ab = j17;
        }
        nf4.b bVar2 = (nf4.b) h0Var.f391656d;
        int i17 = bVar2.f66008xae67405f;
        int i18 = commentDetail.f352867e;
        if (i17 != i18) {
            int i19 = bVar2.f66009xb19dc511;
            int i27 = commentDetail.f352865c;
            if (i19 < i27) {
                bVar2.f66008xae67405f = i18;
                bVar2.f66009xb19dc511 = i27;
                bVar2.getClass();
                java.lang.String str = commentDetail.f352863a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
                bVar2.f418373x = str;
                nf4.b bVar3 = (nf4.b) h0Var.f391656d;
                java.lang.String str2 = commentDetail.f352873k;
                bVar3.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
                bVar3.f418374y = str2;
                vVar.f().mo9952xce0038c9((l75.f0) h0Var.f391656d, new java.lang.String[0]);
                pm0.v.X(new gf4.i(h0Var));
                return true;
            }
        }
        return false;
    }

    public final void m() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        r45.je6 je6Var = f352892i;
        int size = je6Var.f459301d.size();
        for (int i17 = 0; i17 < size; i17++) {
            r45.le6 le6Var = (r45.le6) je6Var.f459301d.get(i17);
            int i18 = le6Var.f460921i;
            if (i18 == 1 || i18 == 3) {
                int i19 = le6Var.f460917e;
                int e17 = c01.id.e();
                ef4.n.f333993a.a();
                if (i19 > e17 - 86400) {
                    arrayList.add(le6Var);
                }
            }
        }
        je6Var.f459301d.clear();
        je6Var.f459301d.addAll(arrayList);
        f352895o++;
        if (arrayList.size() == 0) {
            f352895o = -1;
            return;
        }
        f352895o %= arrayList.size();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i27 = 0;
        for (java.lang.Object obj : arrayList) {
            int i28 = i27 + 1;
            if (i27 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (i27 >= f352895o && ((r45.le6) obj).f460925p < f352890g) {
                arrayList2.add(obj);
            }
            i27 = i28;
        }
        r45.le6 le6Var2 = (r45.le6) kz5.n0.Z(arrayList2);
        java.lang.String str = f352891h;
        if (le6Var2 == null || le6Var2.f460921i != 1) {
            if (le6Var2 == null || le6Var2.f460921i != 3) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "deleteCommentToRemote " + le6Var2.f460919g + ' ' + le6Var2.f460916d + ' ' + le6Var2.f460923n + ' ' + le6Var2.f460917e);
            f352893m = le6Var2;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(new ff4.n(le6Var2.f460916d, 2, le6Var2.f460923n));
            gm0.j1.n().f354821b.g(new ff4.e(arrayList3, new java.util.ArrayList()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "postCommentToRemote " + le6Var2.f460919g + ' ' + le6Var2.f460916d + ' ' + le6Var2.f460924o + ' ' + le6Var2.f460917e);
        f352893m = le6Var2;
        r45.ke6 g17 = g(le6Var2);
        java.lang.String str2 = g17.f460168m;
        if (str2 == null || str2.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(994L, 2L, 1L);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(994L, 1L, 1L);
        }
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = gm0.j1.n().f354821b;
        java.lang.String clientId = le6Var2.f460922m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(clientId, "clientId");
        r1Var.g(new ff4.b(clientId, g17, le6Var2.f460927r, f352894n));
    }

    public final void n(boolean z17, boolean z18) {
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean e17 = bk0.a.g().e(352279, 266241);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f352891h, "updateCommentRead: " + e17 + ", " + z17);
        if (e17 != z17 || z18) {
            pm0.v.X(new gf4.j(z17));
        }
    }

    public final void o(r45.df6 df6Var) {
        if (df6Var != null) {
            ef4.v vVar = ef4.w.f334001t;
            nf4.j L0 = vVar.i().L0(df6Var.f453916d);
            if (L0 == null) {
                L0 = new nf4.j();
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(vVar.e(), L0.f69412xdde069b)) {
                L0.F0(true);
            }
            ef4.e0.f333974a.c(L0, df6Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(vVar.e(), df6Var.f453917e) ? 4 : 8);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 scene) {
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        int mo808xfb85f7b0 = scene.mo808xfb85f7b0();
        java.lang.String str2 = f352891h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onSceneEnd " + i17 + ", " + i18 + ", " + str + ", " + mo808xfb85f7b0);
        long j17 = 100;
        int i27 = f352890g;
        if (mo808xfb85f7b0 != 354) {
            if (mo808xfb85f7b0 == 764 && (((ff4.e) scene).H() instanceof ff4.n)) {
                if (i17 == 0 && i18 == 0) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("delete comment success ");
                    r45.le6 le6Var = f352893m;
                    sb6.append(le6Var != null ? le6Var.f460920h : null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
                    r45.le6 le6Var2 = f352893m;
                    if (le6Var2 != null) {
                        le6Var2.f460921i = 4;
                    }
                    f352893m = null;
                } else {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("delete comment fail ");
                    r45.le6 le6Var3 = f352893m;
                    sb7.append(le6Var3 != null ? le6Var3.f460920h : null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7.toString());
                    r45.le6 le6Var4 = f352893m;
                    i19 = le6Var4 != null ? le6Var4.f460925p : 0;
                    if (i17 == 4) {
                        if (le6Var4 != null) {
                            le6Var4.f460925p = i27;
                        }
                    } else if (le6Var4 != null) {
                        le6Var4.f460925p = i19 + 1;
                    }
                    f352893m = null;
                    j17 = 60000;
                }
                ef4.w.f334001t.l().mo50297x7c4d7ca2(gf4.g.f352882d, j17);
                return;
            }
            return;
        }
        ff4.b bVar = (ff4.b) scene;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = bVar.f343196f.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryCommentResponse");
        r45.ne6 ne6Var = (r45.ne6) fVar;
        java.util.LinkedList linkedList = f352898r;
        gf4.a aVar = bVar.f343195e;
        if (i17 == 0 && i18 == 0) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("post comment success ");
            r45.le6 le6Var5 = f352893m;
            sb8.append(le6Var5 != null ? le6Var5.f460920h : null);
            sb8.append(' ');
            sb8.append(ne6Var.f462865e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb8.toString());
            ef4.w.f334001t.l().mo50293x3498a0(new gf4.e(ne6Var));
            if (aVar != null) {
                aVar.f352867e = ne6Var.f462865e;
            }
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((yz5.p) it.next()).mo149xb9724478(java.lang.Boolean.TRUE, java.lang.Long.valueOf(aVar != null ? aVar.f352866d : 0L));
            }
            r45.le6 le6Var6 = f352893m;
            if (le6Var6 != null) {
                le6Var6.f460923n = ne6Var.f462865e;
            }
            if (le6Var6 != null) {
                le6Var6.f460921i = 2;
            }
            f352893m = null;
        } else {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("post comment fail ");
            r45.le6 le6Var7 = f352893m;
            sb9.append(le6Var7 != null ? le6Var7.f460920h : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb9.toString());
            r45.le6 le6Var8 = f352893m;
            i19 = le6Var8 != null ? le6Var8.f460925p : 0;
            if (i17 == 4) {
                if (le6Var8 != null) {
                    le6Var8.f460925p = i27;
                }
            } else if (le6Var8 != null) {
                le6Var8.f460925p = i19 + 1;
            }
            f352893m = null;
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                ((yz5.p) it6.next()).mo149xb9724478(java.lang.Boolean.FALSE, java.lang.Long.valueOf(aVar != null ? aVar.f352866d : 0L));
            }
            j17 = 300000;
        }
        ef4.w.f334001t.l().mo50297x7c4d7ca2(gf4.f.f352881d, j17);
    }
}
