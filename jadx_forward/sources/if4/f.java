package if4;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final nf4.j f372776a;

    /* renamed from: b, reason: collision with root package name */
    public final if4.g f372777b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f372778c;

    /* renamed from: d, reason: collision with root package name */
    public final long f372779d;

    /* renamed from: e, reason: collision with root package name */
    public final if4.h f372780e;

    /* renamed from: f, reason: collision with root package name */
    public final if4.a f372781f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372782g;

    public f(nf4.j story, r45.lf6 storyTImeline, if4.g storyItemScene) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.util.LinkedList linkedList3;
        java.util.LinkedList linkedList4;
        boolean z17;
        nf4.b bVar;
        int i17;
        java.lang.String str;
        int i18;
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(story, "story");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storyTImeline, "storyTImeline");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storyItemScene, "storyItemScene");
        this.f372776a = story;
        this.f372777b = storyItemScene;
        this.f372778c = "MicroMsg.StoryGalleryItem";
        long j17 = story.f69410x443468b;
        this.f372779d = j17;
        int i27 = (int) story.f72763xa3c65b86;
        int i28 = story.f69403xac3be4e;
        java.lang.String str2 = story.f69412xdde069b;
        java.lang.String str3 = "";
        if4.h hVar = new if4.h(i27, j17, i28, str2 == null ? "" : str2);
        if (storyTImeline.f460965h.f463738e.size() > 0) {
            java.lang.Object obj = storyTImeline.f460965h.f463738e.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            hVar.f372791f = (r45.xe6) obj;
        }
        this.f372780e = hVar;
        this.f372781f = new if4.a();
        r45.df6 df6Var = new r45.df6();
        try {
            df6Var.mo11468x92b714fd(story.f69400x4c58c87d);
        } catch (java.lang.Exception unused) {
        }
        java.lang.String str4 = story.f69412xdde069b;
        str4 = str4 == null ? ef4.w.f334001t.e() : str4;
        if4.a aVar = this.f372781f;
        aVar.getClass();
        aVar.f372766a = str4;
        aVar.f372767b = story.f69410x443468b;
        aVar.f372768c = 0;
        story.w0();
        nf4.b z07 = ef4.w.f334001t.f().z0(story.f69410x443468b);
        boolean z18 = z07 == null || z07.f66009xb19dc511 == 0;
        java.util.Iterator it = df6Var.f453923n.iterator();
        boolean z19 = false;
        while (true) {
            boolean hasNext = it.hasNext();
            linkedList = aVar.f372773h;
            linkedList2 = aVar.f372772g;
            if (!hasNext) {
                break;
            }
            r45.ke6 ke6Var = (r45.ke6) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ke6Var);
            gf4.a aVar2 = new gf4.a(ke6Var);
            if (z07 != null && (i19 = z07.f66009xb19dc511) > 0 && aVar2.f352865c > i19) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(aVar2.f352863a, ef4.w.f334001t.e())) {
                    aVar2.f352868f = true;
                    z19 = true;
                }
            }
            linkedList2.add(aVar2);
            linkedList.add(aVar2);
            java.lang.String str5 = aVar.f372766a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str5, "<set-?>");
            aVar2.f352873k = str5;
            story.z0();
        }
        java.util.Iterator it6 = df6Var.f453925p.iterator();
        boolean z27 = false;
        while (true) {
            boolean hasNext2 = it6.hasNext();
            linkedList3 = aVar.f372774i;
            if (!hasNext2) {
                break;
            }
            r45.ke6 ke6Var2 = (r45.ke6) it6.next();
            java.util.Iterator it7 = it6;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ke6Var2);
            gf4.a aVar3 = new gf4.a(ke6Var2);
            if (z07 == null || (i18 = z07.f66009xb19dc511) <= 0) {
                str = str3;
            } else {
                str = str3;
                if (aVar3.f352865c > i18) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(aVar3.f352863a, ef4.w.f334001t.e())) {
                        aVar3.f352868f = true;
                        z27 = true;
                    }
                }
            }
            linkedList2.add(aVar3);
            linkedList3.add(aVar3);
            java.lang.String str6 = aVar.f372766a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str6, "<set-?>");
            aVar3.f352873k = str6;
            story.z0();
            it6 = it7;
            str3 = str;
        }
        java.lang.String str7 = str3;
        java.util.Iterator it8 = df6Var.f453935z.iterator();
        boolean z28 = false;
        while (true) {
            boolean hasNext3 = it8.hasNext();
            linkedList4 = aVar.f372775j;
            if (!hasNext3) {
                break;
            }
            r45.ke6 ke6Var3 = (r45.ke6) it8.next();
            java.util.Iterator it9 = it8;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ke6Var3);
            gf4.a aVar4 = new gf4.a(ke6Var3);
            if (z07 == null || (i17 = z07.f66009xb19dc511) <= 0) {
                bVar = z07;
            } else {
                bVar = z07;
                if (aVar4.f352865c > i17) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(aVar4.f352863a, ef4.w.f334001t.e())) {
                        aVar4.f352868f = true;
                        z28 = true;
                    }
                }
            }
            linkedList4.add(aVar4);
            java.lang.String str8 = aVar.f372766a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str8, "<set-?>");
            aVar4.f352873k = str8;
            story.z0();
            it8 = it9;
            z07 = bVar;
        }
        if (linkedList2.size() > 1) {
            kz5.g0.t(linkedList2, new if4.b());
        }
        if (linkedList.size() > 1) {
            kz5.g0.t(linkedList, new if4.c());
        }
        if (linkedList3.size() > 1) {
            kz5.g0.t(linkedList3, new if4.d());
        }
        if (linkedList4.size() > 1) {
            kz5.g0.t(linkedList4, new if4.e());
        }
        if (!z18 || linkedList2.size() <= 0) {
            z17 = false;
        } else {
            gf4.l lVar = gf4.l.f352887d;
            java.lang.Object obj2 = linkedList2.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
            gf4.a aVar5 = (gf4.a) obj2;
            ef4.v vVar = ef4.w.f334001t;
            nf4.a f17 = vVar.f();
            long j18 = this.f372779d;
            nf4.b z08 = f17.z0(j18);
            if (z08 == null) {
                z08 = new nf4.b();
                z08.f66010x44346ab = j18;
            }
            z08.f66008xae67405f = aVar5.f352867e;
            z08.f66009xb19dc511 = aVar5.f352865c;
            z17 = false;
            vVar.f().mo9952xce0038c9(z08, new java.lang.String[0]);
        }
        aVar.f372769d = (z27 || z19) ? true : z17;
        aVar.f372770e = z28;
        aVar.f372771f = z19;
        java.lang.String str9 = story.f69412xdde069b;
        this.f372782g = str9;
        ef4.k0 k0Var = ef4.k0.f333992a;
        if4.h hVar2 = this.f372780e;
        if (!((com.p314xaae8f345.mm.vfs.w6.j(k0Var.c(hVar2.f372791f, str9 == null ? str7 : str9)) || com.p314xaae8f345.mm.vfs.w6.j(k0Var.d(hVar2.f372791f))) ? true : z17)) {
            java.lang.String str10 = hVar2.f372791f.A;
            if (!((str10 == null || str10.length() == 0) ? true : z17)) {
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f372778c, "LogStory: " + this);
    }

    /* renamed from: equals */
    public boolean m135225xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof if4.f)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if4.f fVar = (if4.f) obj;
        return this.f372779d == fVar.f372779d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f372780e, fVar.f372780e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f372781f, fVar.f372781f) && this.f372776a.v0().f472551e == fVar.f372776a.v0().f472551e;
    }

    /* renamed from: toString */
    public java.lang.String m135226x9616526c() {
        return "StoryGalleryItem(videoItem=" + this.f372780e + ", comment=" + this.f372781f + ')';
    }

    public /* synthetic */ f(nf4.j jVar, r45.lf6 lf6Var, if4.g gVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(jVar, lf6Var, (i17 & 4) != 0 ? if4.g.f372783d : gVar);
    }
}
