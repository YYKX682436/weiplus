package bm2;

/* loaded from: classes10.dex */
public final class o6 extends in5.q0 {

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f103728h;

    /* renamed from: i, reason: collision with root package name */
    public final sf2.d3 f103729i;

    /* renamed from: m, reason: collision with root package name */
    public final int f103730m;

    /* renamed from: n, reason: collision with root package name */
    public final fn2.u1 f103731n;

    /* renamed from: o, reason: collision with root package name */
    public r45.y4 f103732o;

    /* renamed from: p, reason: collision with root package name */
    public r45.ch6 f103733p;

    /* renamed from: q, reason: collision with root package name */
    public r45.in f103734q;

    /* renamed from: r, reason: collision with root package name */
    public final int f103735r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f103736s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f103737t;

    public o6(android.content.Context context, sf2.d3 controller, int i17, fn2.u1 sourceScene, p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceScene, "sourceScene");
        this.f103728h = context;
        this.f103729i = controller;
        this.f103730m = i17;
        this.f103731n = sourceScene;
        this.f103732o = r45.y4.AddSongSourceType_MusicBoard;
        this.f103735r = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su);
        this.f103736s = "";
        this.f103737t = new java.util.ArrayList();
        hn2.h hVar = new hn2.h(y0Var, controller.g7());
        bm2.d6 d6Var = new bm2.d6(this);
        bm2.e6 e6Var = new bm2.e6(this);
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new hn2.g(hVar, d6Var, e6Var, null), 3, null);
        }
    }

    public final void E(java.util.List songList, java.util.List resourceInfoList, java.lang.String searchKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songList, "songList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resourceInfoList, "resourceInfoList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchKey, "searchKey");
        this.f103736s = searchKey;
        java.util.List list = this.f103737t;
        int size = ((java.util.ArrayList) list).size() - 1;
        int i17 = 0;
        if (size < 0) {
            size = 0;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(songList, 10));
        for (java.lang.Object obj : songList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            arrayList.add(new bm2.h6(bm2.g6.f103450d, hn2.d.f364037o.a((r45.ay1) obj, (r45.cy1) kz5.n0.a0(resourceInfoList, i17))));
            i17 = i18;
        }
        ((java.util.ArrayList) list).addAll(size, arrayList);
        m8153xd399a4d9(size, songList.size());
    }

    public final void I(int i17, int i18, hn2.d songInfo) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
        boolean x17 = zl2.r4.f555483a.x1();
        fn2.u1 u1Var = this.f103731n;
        if (x17) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.W1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", i17);
            jSONObject.put("element", i18);
            jSONObject.put("song_id", songInfo.f364038a);
            jSONObject.put("song_name", songInfo.f364039b);
            jSONObject.put("duration", songInfo.a());
            jSONObject.put("singer_mid", songInfo.f364040c);
            jSONObject.put("singer_name", songInfo.f364041d);
            jSONObject.put("source_scene", u1Var.f345950d);
            if (songInfo.f364049l) {
                jSONObject.put("part_id", 1);
            }
            r45.in inVar = this.f103734q;
            if (inVar != null) {
                jSONObject.put("tab_id", inVar.f458689d);
            }
            r45.in inVar2 = this.f103734q;
            if (inVar2 != null && (str4 = inVar2.f458690e) != null) {
                jSONObject.put("tab_name", str4);
            }
            r45.ch6 ch6Var = this.f103733p;
            if (ch6Var != null) {
                jSONObject.put("tab_sub_id", ch6Var.f453088d);
            }
            r45.ch6 ch6Var2 = this.f103733p;
            if (ch6Var2 != null && (str3 = ch6Var2.f453089e) != null) {
                jSONObject.put("tab_sub_name", str3);
            }
            zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
            return;
        }
        i95.m c18 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c18;
        ml2.b4 b4Var = ml2.b4.f408786o2;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("type", i17);
        jSONObject2.put("element", i18);
        jSONObject2.put("song_id", songInfo.f364038a);
        jSONObject2.put("song_name", songInfo.f364039b);
        jSONObject2.put("duration", songInfo.a());
        jSONObject2.put("singer_mid", songInfo.f364040c);
        jSONObject2.put("singer_name", songInfo.f364041d);
        jSONObject2.put("source_scene", u1Var.f345950d);
        if (songInfo.f364049l) {
            jSONObject2.put("part_id", 1);
        }
        r45.in inVar3 = this.f103734q;
        if (inVar3 != null) {
            jSONObject2.put("tab_id", inVar3.f458689d);
        }
        r45.in inVar4 = this.f103734q;
        if (inVar4 != null && (str2 = inVar4.f458690e) != null) {
            jSONObject2.put("tab_name", str2);
        }
        r45.ch6 ch6Var3 = this.f103733p;
        if (ch6Var3 != null) {
            jSONObject2.put("tab_sub_id", ch6Var3.f453088d);
        }
        r45.ch6 ch6Var4 = this.f103733p;
        if (ch6Var4 != null && (str = ch6Var4.f453089e) != null) {
            jSONObject2.put("tab_sub_name", str);
        }
        ml2.r0.hj(r0Var, b4Var, jSONObject2.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void J(java.util.List songList, java.util.List resourceInfoList, boolean z17, java.lang.String searchKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songList, "songList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resourceInfoList, "resourceInfoList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchKey, "searchKey");
        this.f103736s = searchKey;
        java.util.List list = this.f103737t;
        ((java.util.ArrayList) list).clear();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(songList, 10));
        int i17 = 0;
        for (java.lang.Object obj : songList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            arrayList.add(new bm2.h6(bm2.g6.f103450d, hn2.d.f364037o.a((r45.ay1) obj, (r45.cy1) kz5.n0.a0(resourceInfoList, i17))));
            i17 = i18;
        }
        ((java.util.ArrayList) list).addAll(arrayList);
        if ((!songList.isEmpty()) && z17) {
            ((java.util.ArrayList) list).add(new bm2.h6(bm2.g6.f103451e, null));
        }
        m8146xced61ae5();
    }

    public final void K(android.view.View view, boolean z17) {
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongListAdapter", "setViewVisible", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongListAdapter", "setViewVisible", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongListAdapter", "setViewVisible", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongListAdapter", "setViewVisible", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void L(hn2.d dVar, bm2.i6 i6Var) {
        java.lang.String str;
        nm2.a aVar = (nm2.a) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f103729i.g7()).mo144003x754a37bb();
        java.lang.String str2 = dVar.f364038a;
        boolean z17 = (str2 == null || aVar == null || !aVar.c(str2, dVar.f364049l)) ? false : true;
        hn2.a.f364031a.a(i6Var, dVar.b() != null, z17, aVar);
        if ((aVar instanceof nm2.b) && z17) {
            str = dVar.f364039b;
            if (str == null) {
                str = this.f103736s;
            }
        } else {
            str = this.f103736s;
        }
        i6Var.f103512e.getA().setText(bm2.p6.a(i6Var.f103512e.getA().getText().toString(), str, this.f103735r));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f103737t).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((bm2.h6) ((java.util.ArrayList) this.f103737t).get(i17)).f103479a.ordinal();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f9, code lost:
    
        if (r1 != 2) goto L24;
     */
    @Override // in5.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(in5.r0 r14, int r15) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bm2.o6.x(in5.r0, int):void");
    }

    @Override // in5.q0
    public void y(in5.r0 holder, int i17, java.util.List payloads) {
        hn2.d dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        if (!(!payloads.isEmpty()) || !payloads.contains("payload_audition_state")) {
            x(holder, i17);
            return;
        }
        if (holder instanceof bm2.i6) {
            java.util.List list = this.f103737t;
            if (((bm2.h6) ((java.util.ArrayList) list).get(i17)).f103479a != bm2.g6.f103450d || (dVar = ((bm2.h6) ((java.util.ArrayList) list).get(i17)).f103480b) == null) {
                return;
            }
            L(dVar, (bm2.i6) holder);
        }
    }

    @Override // in5.q0
    public in5.r0 z(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        bm2.g6 g6Var = bm2.g6.f103450d;
        android.content.Context context = this.f103728h;
        if (i17 == 0) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570536ec4, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new bm2.i6(this, inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ami, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
        return new bm2.f6(this, inflate2);
    }
}
