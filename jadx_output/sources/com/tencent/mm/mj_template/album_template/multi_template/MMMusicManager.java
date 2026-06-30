package com.tencent.mm.mj_template.album_template.multi_template;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tencent/mm/mj_template/album_template/multi_template/MMMusicManager;", "Landroidx/lifecycle/f;", "Lkotlinx/coroutines/y0;", "scope", "", "", "imageList", "<init>", "(Lkotlinx/coroutines/y0;Ljava/util/List;)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MMMusicManager implements androidx.lifecycle.f {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f69742d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f69743e;

    /* renamed from: f, reason: collision with root package name */
    public final n0.v2 f69744f;

    /* renamed from: g, reason: collision with root package name */
    public final n0.v2 f69745g;

    /* renamed from: h, reason: collision with root package name */
    public final n0.v2 f69746h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f69747i;

    /* renamed from: m, reason: collision with root package name */
    public gz0.h f69748m;

    /* renamed from: n, reason: collision with root package name */
    public long f69749n;

    /* renamed from: o, reason: collision with root package name */
    public kotlinx.coroutines.r2 f69750o;

    /* renamed from: p, reason: collision with root package name */
    public kotlinx.coroutines.r2 f69751p;

    /* renamed from: q, reason: collision with root package name */
    public final ty0.b1 f69752q;

    public MMMusicManager(kotlinx.coroutines.y0 scope, java.util.List<java.lang.String> imageList) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(imageList, "imageList");
        this.f69742d = scope;
        this.f69743e = imageList;
        n0.v2 c17 = n0.s4.c(kz5.p0.f313996d, null, 2, null);
        this.f69744f = c17;
        n0.v2 c18 = n0.s4.c(new com.tencent.maas.model.MJMusicInfo("", "", "", null, null), null, 2, null);
        this.f69745g = c18;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        n0.v2 c19 = n0.s4.c(bool, null, 2, null);
        this.f69746h = c19;
        n0.v2 c27 = n0.s4.c(bool, null, 2, null);
        this.f69747i = new java.util.ArrayList();
        ty0.b1 b1Var = new ty0.b1(c17, c18, new qy0.c(this), c19, c27, new qy0.d(this), new qy0.e(this), new qy0.f(this), false, null, 512, null);
        b1Var.f422802l = new qy0.g(this);
        this.f69752q = b1Var;
    }

    public final void a(java.lang.String str) {
        java.lang.Object obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMMusicManager", "innerRealSelectMusic() called with: musicId = " + str);
        java.util.Iterator it = ((java.lang.Iterable) ((n0.q4) this.f69744f).getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((com.tencent.maas.model.MJMusicInfo) obj).getMusicID(), str)) {
                    break;
                }
            }
        }
        com.tencent.maas.model.MJMusicInfo mJMusicInfo = (com.tencent.maas.model.MJMusicInfo) obj;
        if (mJMusicInfo != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMMusicManager", "switch music: switch to " + mJMusicInfo.getMusicID());
            kotlinx.coroutines.r2 r2Var = this.f69751p;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            this.f69751p = kotlinx.coroutines.l.d(this.f69742d, null, null, new qy0.b(this, mJMusicInfo, str, null), 3, null);
        }
    }

    public final void b() {
        jz5.f0 f0Var;
        gz0.h hVar = this.f69748m;
        if (hVar != null) {
            hVar.b();
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            java.lang.String musicID = ((com.tencent.maas.model.MJMusicInfo) ((n0.q4) this.f69745g).getValue()).getMusicID();
            kotlin.jvm.internal.o.f(musicID, "getMusicID(...)");
            a(musicID);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if ((r0 != null && r0.a()) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r8 = this;
            java.lang.String r0 = "startRecommend: "
            java.lang.String r1 = "MicroMsg.MMMusicManager"
            com.tencent.mars.xlog.Log.i(r1, r0)
            java.util.List r0 = r8.f69747i
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ r2
            if (r0 != 0) goto L20
            kotlinx.coroutines.r2 r0 = r8.f69750o
            r3 = 0
            if (r0 == 0) goto L1d
            boolean r0 = r0.a()
            if (r0 != r2) goto L1d
            goto L1e
        L1d:
            r2 = r3
        L1e:
            if (r2 == 0) goto L25
        L20:
            java.lang.String r0 = "startRecommend: skip recommend"
            com.tencent.mars.xlog.Log.i(r1, r0)
        L25:
            kotlinx.coroutines.y0 r2 = r8.f69742d
            r3 = 0
            r4 = 0
            qy0.i r5 = new qy0.i
            r0 = 0
            r5.<init>(r8, r0)
            r6 = 3
            r7 = 0
            kotlinx.coroutines.r2 r0 = kotlinx.coroutines.l.d(r2, r3, r4, r5, r6, r7)
            r8.f69750o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager.c():void");
    }

    @Override // androidx.lifecycle.f, androidx.lifecycle.h
    public void onDestroy(androidx.lifecycle.y owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        com.tencent.mars.xlog.Log.i("MicroMsg.MMMusicManager", "onDestroy: ");
        com.tencent.mars.xlog.Log.i("MicroMsg.MMMusicManager", "release: ");
        kotlinx.coroutines.l.d(this.f69742d, null, null, new qy0.h(this, null), 3, null);
    }

    @Override // androidx.lifecycle.f, androidx.lifecycle.h
    public void onPause(androidx.lifecycle.y owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        com.tencent.mars.xlog.Log.i("MicroMsg.MMMusicManager", "onPause: ");
        com.tencent.mars.xlog.Log.i("MicroMsg.MMMusicManager", "pausePlay: ");
        gz0.h hVar = this.f69748m;
        if (hVar != null) {
            hVar.a();
        }
    }

    @Override // androidx.lifecycle.f, androidx.lifecycle.h
    public void onResume(androidx.lifecycle.y owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        com.tencent.mars.xlog.Log.i("MicroMsg.MMMusicManager", "onResume: ");
        b();
    }
}
