package sm2;

/* loaded from: classes3.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f491235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f491236e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f491237f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.l01 f491238g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f491239h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f491240i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f491241m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f491242n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(sm2.o4 o4Var, boolean z17, int i17, r45.l01 l01Var, boolean z18, java.lang.String str, int i18, java.lang.String str2) {
        super(0);
        this.f491235d = o4Var;
        this.f491236e = z17;
        this.f491237f = i17;
        this.f491238g = l01Var;
        this.f491239h = z18;
        this.f491240i = str;
        this.f491241m = i18;
        this.f491242n = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.lang.StringBuilder] */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ?? r57;
        ?? r58;
        sm2.o4 o4Var = this.f491235d;
        java.lang.String str = o4Var.f491143f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createLive success:");
        boolean z17 = this.f491236e;
        sb6.append(z17);
        sb6.append(", errCode:");
        int i17 = this.f491237f;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        r45.l01 l01Var = this.f491238g;
        if (z17) {
            mm2.y6 y6Var = (mm2.y6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) o4Var.f101142a.a(mm2.g1.class)).f410611s).mo144003x754a37bb();
            if (y6Var.f411125p) {
                java.lang.String str2 = y6Var.f411126q;
                if (!(str2 == null || str2.length() == 0) && y6Var.f411114e == 2) {
                    java.util.ArrayList arrayList = y6Var.f411116g;
                    if (arrayList.size() == 1 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kz5.n0.X(arrayList), y6Var.f411126q)) {
                        r58 = 1;
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_START_ONLY_FROM_CHATROOM_VISIBLE_INT_SYNC, java.lang.Integer.valueOf((int) r58));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(y6Var.f411111b, "Tag LiveStartOnlyFromChatRoomVisible:" + r58);
                    }
                }
                r58 = 0;
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_START_ONLY_FROM_CHATROOM_VISIBLE_INT_SYNC, java.lang.Integer.valueOf((int) r58));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(y6Var.f411111b, "Tag LiveStartOnlyFromChatRoomVisible:" + r58);
            }
            ya2.g gVar = ya2.h.f542017a;
            ya2.b2 b17 = gVar.b(((mm2.c1) o4Var.f101142a.a(mm2.c1.class)).f410385o);
            if (b17 != null) {
                b17.f69324x7733ca97 = ((mm2.c1) o4Var.f101142a.a(mm2.c1.class)).w7();
                gVar.k(b17);
            }
            sm2.s sVar = new sm2.s(o4Var);
            java.util.LinkedList m75941xfb821914 = l01Var.m75941xfb821914(7);
            if (m75941xfb821914 != null) {
                r57 = new java.util.ArrayList();
                for (java.lang.Object obj : m75941xfb821914) {
                    java.lang.String str3 = (java.lang.String) obj;
                    if (!(str3 == null || str3.length() == 0)) {
                        r57.add(obj);
                    }
                }
            } else {
                r57 = kz5.p0.f395529d;
            }
            int size = r57.size();
            java.lang.String str4 = o4Var.f491143f;
            if (size < 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "runCoLiveAvatarMerger: skip, count=" + r57.size());
                sVar.mo152xb9724478();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "runCoLiveAvatarMerger: start, count=" + r57.size() + ", objectId=" + ((mm2.e1) o4Var.c(mm2.e1.class)).f410516m);
                re2.w wVar = new re2.w(((mm2.e1) o4Var.c(mm2.e1.class)).f410516m, r57);
                sm2.g4 g4Var = new sm2.g4(o4Var, sVar);
                sm2.h4 h4Var = new sm2.h4(o4Var, sVar);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("run: objectId=");
                long j17 = wVar.f476028a;
                sb7.append(j17);
                sb7.append(", avatarCount=");
                java.util.List list = wVar.f476029b;
                sb7.append(list.size());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveAvatarMerger", sb7.toString());
                if (list.size() < 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.CoLiveAvatarMerger", "run: avatarUrls too few (" + list.size() + "), skip merge");
                    wVar.b(g4Var, "");
                } else {
                    re2.u uVar = new re2.u(wVar, g4Var, h4Var);
                    re2.v vVar = new re2.v(wVar, h4Var);
                    byte[] bytes = (j17 + kz5.n0.g0(wVar.f476029b, "|", null, null, 0, null, null, 62, null)).getBytes(r26.c.f450398a);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                    java.lang.String str5 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183674j + "colive_merged_" + kk.k.g(bytes) + ".png";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveAvatarMerger", "doMerge: outputPath=" + str5);
                    p3325xe03a0797.p3326xc267989b.l.d(wVar.f476032e, null, null, new re2.l(wVar, str5, uVar, vVar, null), 3, null);
                }
            }
            o4Var.M(1);
        } else if (this.f491239h) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("PARAM_FINDER_LIVE_USERNAME", android.text.TextUtils.isEmpty(((mm2.c1) o4Var.c(mm2.c1.class)).f410385o) ? ((mm2.c1) o4Var.c(mm2.c1.class)).f410385o : ((mm2.c1) o4Var.c(mm2.c1.class)).f410385o);
            bundle.putString("PARAM_FINDER_LIVE_FACE_VERIFY_URL", this.f491240i);
            r45.qp1 qp1Var = (r45.qp1) l01Var.m75936x14adae67(3);
            if (qp1Var != null) {
                bundle.putByteArray("PARAM_FINDER_LIVE_ERROR_PAGE", qp1Var.mo14344x5f01b1f6());
            }
            fm2.a aVar = o4Var.f101128c;
            if (aVar != null) {
                aVar.mo46557x60d69242(qo0.b.Q2, bundle);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183993a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184109v.f184073b, null, false, false, 14, null);
            o4Var.M(4);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8 p8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183993a;
            java.lang.String str6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184108u.f184073b;
            r45.l84 l84Var = new r45.l84();
            l84Var.set(1, java.lang.Integer.valueOf(i17));
            l84Var.set(2, this.f491242n);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.c(p8Var, str6, hc2.b.a(l84Var), false, true, 4, null);
            this.f491235d.z(this.f491241m, this.f491237f, this.f491242n, this.f491238g, null);
            o4Var.M(2);
        }
        return jz5.f0.f384359a;
    }
}
