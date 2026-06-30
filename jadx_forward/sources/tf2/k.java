package tf2;

/* loaded from: classes10.dex */
public final class k extends if2.b implements mf2.c {

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f500465m;

    /* renamed from: n, reason: collision with root package name */
    public u26.w f500466n;

    /* renamed from: o, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f500467o;

    /* renamed from: p, reason: collision with root package name */
    public xh2.b f500468p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f500469q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Map f500470r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f500465m = new java.util.LinkedHashMap();
        this.f500470r = new java.util.LinkedHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x060f, code lost:
    
        if (p3325xe03a0797.p3326xc267989b.k1.b(300, r8) != r12) goto L254;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z6(tf2.k r33, tf2.a r34, p05.x0 r35, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r36) {
        /*
            Method dump skipped, instructions count: 1582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tf2.k.Z6(tf2.k, tf2.a, p05.x0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final java.lang.Float[] d7(tf2.k kVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2) {
        km2.q qVar = (km2.q) h0Var.f391656d;
        java.lang.Float[] e76 = kVar.e7(qVar != null ? qVar.f390703a : null);
        km2.q qVar2 = (km2.q) h0Var2.f391656d;
        java.lang.Float[] e77 = kVar.e7(qVar2 != null ? qVar2.f390703a : null);
        float f17 = 0.5f;
        if (e76 == null || e77 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePkGiftAnimationScheduleController", "#computatioStartPosBoundary something null. just return direct");
            return new java.lang.Float[]{java.lang.Float.valueOf(0.5f), java.lang.Float.valueOf(0.5f)};
        }
        float f18 = e76[0].floatValue() < e77[0].floatValue() ? 0.0f : e76[0].floatValue() > e77[0].floatValue() ? 1.0f : 0.5f;
        if (e76[1].floatValue() < e77[1].floatValue()) {
            f17 = 0.0f;
        } else if (e76[1].floatValue() > e77[1].floatValue()) {
            f17 = 1.0f;
        }
        return new java.lang.Float[]{java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f17)};
    }

    @Override // mf2.c
    public void M2(xh2.b micInfoData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micInfoData, "micInfoData");
        this.f500468p = micInfoData;
        tn0.w0 Q6 = Q6();
        if ((Q6 != null && Q6.X()) && !this.f500469q) {
            this.f500469q = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftAnimationScheduleController", "#onMicInfoChanged isCurrentVisitorOnMic=" + this.f500469q);
            c7();
            b7();
            return;
        }
        tn0.w0 Q62 = Q6();
        if (((Q62 == null || Q62.X()) ? false : true) && this.f500469q) {
            this.f500469q = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftAnimationScheduleController", "#onMicInfoChanged isCurrentVisitorOnMic=" + this.f500469q);
            c7();
            b7();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0350  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 r37) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tf2.k.a7(com.tencent.mm.plugin.finder.live.util.l1):void");
    }

    public final void b7() {
        mn0.b0 b0Var;
        nn0.o oVar;
        tn0.w0 Q6 = Q6();
        if (Q6 != null && (Q6 instanceof co0.s) && (b0Var = ((co0.s) Q6).R1.f363942a) != null && (b0Var instanceof mn0.y)) {
            com.p314xaae8f345.p2926x359365.C25485x5a0a6891 p17 = ((mn0.y) b0Var).p();
            if ((p17 instanceof nn0.i) && (oVar = ((nn0.i) p17).f420117b) != null) {
                oVar.bc(null);
            }
        }
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.f500465m;
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            ((go0.w1) ((tf2.b) entry.getValue()).f500429a).b();
            p05.d2 d2Var = (p05.d2) ((tf2.b) entry.getValue()).f500430b;
            d2Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftEffect", "#destroy");
            p05.z0 z0Var = d2Var.f432019a;
            z0Var.getClass();
            p05.c2 c17 = d2Var.f432027i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
            z0Var.f432272a.remove(c17);
            d2Var.f432023e = null;
            d2Var.f432025g = null;
            tn0.w0 Q62 = Q6();
            if (Q62 != null) {
                Q62.j0((java.lang.String) entry.getKey(), null);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftAnimationScheduleController", "#destroyAndClearAllWeEffectInstance sdkId=" + ((java.lang.String) entry.getKey()));
        }
        linkedHashMap.clear();
    }

    public final void c7() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f500467o;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        u26.w wVar = this.f500466n;
        if (wVar != null) {
            u26.x0.a(wVar, null, 1, null);
        }
        ((java.util.LinkedHashMap) this.f500470r).clear();
    }

    public final java.lang.Float[] e7(java.lang.String str) {
        xh2.b bVar;
        android.graphics.Rect rect;
        if ((str == null || str.length() == 0) || (bVar = this.f500468p) == null || (rect = (android.graphics.Rect) bVar.f536055a.get(str)) == null) {
            return null;
        }
        android.graphics.Rect rect2 = bVar.f536057c;
        float f17 = rect2.right - rect2.left;
        float f18 = rect2.bottom - rect2.top;
        return new java.lang.Float[]{java.lang.Float.valueOf(f17 > 0.0f ? (rect.left - r4) / f17 : 0.0f), java.lang.Float.valueOf(f18 > 0.0f ? (rect.top - r2) / f18 : 0.0f), java.lang.Float.valueOf(f17 > 0.0f ? (rect.right - rect.left) / f17 : 0.0f), java.lang.Float.valueOf(f18 > 0.0f ? (rect.bottom - rect.top) / f18 : 0.0f)};
    }

    public final tf2.b f7(java.lang.String str) {
        if (str.length() == 0) {
            return null;
        }
        java.util.Map map = this.f500465m;
        tf2.b bVar = (tf2.b) ((java.util.LinkedHashMap) map).get(str);
        if (bVar != null) {
            return bVar;
        }
        p05.z0 z0Var = new p05.z0();
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        p05.d2 d2Var = new p05.d2(z0Var);
        go0.w1 w1Var = new go0.w1();
        w1Var.a(d2Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftOnlyProcess", "#setJsonMessageCallback " + w1Var.hashCode() + " cb=" + java.lang.Integer.valueOf(z0Var.hashCode()));
        w1Var.f355432d = z0Var;
        rh0.d0 d0Var = w1Var.f355429a;
        if (d0Var != null) {
            ((p05.l4) d0Var).E(z0Var);
        }
        tf2.b bVar2 = new tf2.b(w1Var, d2Var);
        map.put(str, bVar2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftAnimationScheduleController", "#getOrCreateEffectInstance sdkId=".concat(str));
        return bVar2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        c7();
        b7();
    }
}
