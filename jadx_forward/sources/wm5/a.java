package wm5;

/* loaded from: classes10.dex */
public abstract class a implements com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb.Filter {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.ArrayMap f528874a = new android.util.ArrayMap();

    /* renamed from: b, reason: collision with root package name */
    public android.util.Size f528875b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4.TAVVideoConfigurationContentMode f528876c;

    public a() {
        android.opengl.EGLContext EGL_NO_CONTEXT = android.opengl.EGL14.EGL_NO_CONTEXT;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(EGL_NO_CONTEXT, "EGL_NO_CONTEXT");
        this.f528875b = new android.util.Size(0, 0);
        this.f528876c = com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4.TAVVideoConfigurationContentMode.aspectFill;
        xm5.b.c("BaseMultiVideoCompositionEffect", "init: " + this, new java.lang.Object[0]);
    }

    public final void a(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4.TAVVideoConfigurationContentMode newMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newMode, "newMode");
        xm5.b.c("BaseMultiVideoCompositionEffect", "setVideoConfigurationContentMode newMode:" + newMode, new java.lang.Object[0]);
        this.f528876c = newMode;
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb.Filter
    /* renamed from: apply */
    public com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 mo98537x58b836e(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb interfaceC25919xc89aa8bb, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25911x10613639 c25911x10613639, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25912xbdf93b84 c25912xbdf93b84) {
        com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25858x90ea669 m98749x8d2f93b3;
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049;
        com.p314xaae8f345.mm.p2825x7e128009.C22965x6f780cba c22965x6f780cba;
        if (c25912xbdf93b84 == null || (m98749x8d2f93b3 = c25912xbdf93b84.m98749x8d2f93b3()) == null) {
            return null;
        }
        if (this.f528875b.getWidth() == 0 || this.f528875b.getHeight() == 0) {
            b(c25912xbdf93b84.m98753x785dd09a(), c25912xbdf93b84.m98751x798d48d3());
            xm5.b.b("BaseMultiVideoCompositionEffect", "assetsSize error %s, update as renderSize", this.f528875b);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m98749x8d2f93b3.m98342xc0f97383().m97628x77710645(), "eglContext(...)");
        long j17 = 1000;
        long m97232x31040141 = c25912xbdf93b84.m98754xfb85bb43().m97232x31040141() / j17;
        if (c25911x10613639 == null) {
            return null;
        }
        java.util.LinkedList<jz5.l> linkedList = new java.util.LinkedList();
        java.util.Iterator<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25911x10613639.TrackImagePair> it = c25911x10613639.m98744xb7c7ba96().iterator();
        while (true) {
            boolean z17 = false;
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25911x10613639.TrackImagePair next = it.next();
            com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25901x3c3e4053 m98747x75359795 = next.m98747x75359795();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m98747x75359795, "null cannot be cast to non-null type com.tencent.tavkit.composition.TAVClip");
            com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79 c25874xcf526e79 = (com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79) m98747x75359795;
            if (!(c25874xcf526e79.m98547x67860184() instanceof com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25904x1e3cc372)) {
                long m97232x310401412 = c25874xcf526e79.mo98548x8082fb99().m97232x31040141() / j17;
                long m97232x310401413 = (c25874xcf526e79.mo98545x51e8b0a().m97232x31040141() / j17) + m97232x310401412 + 1;
                if (m97232x310401412 <= m97232x31040141 && m97232x31040141 < m97232x310401413) {
                    z17 = true;
                }
                if (z17) {
                    java.lang.Object mo98546xd59b175f = c25874xcf526e79.mo98546xd59b175f("key_extra_track");
                    rm5.j jVar = mo98546xd59b175f instanceof rm5.j ? (rm5.j) mo98546xd59b175f : null;
                    if (jVar != null) {
                        linkedList.add(new jz5.l(jVar, next.m98746x74984fa5()));
                    }
                }
            }
        }
        java.util.LinkedList<rm5.m> linkedList2 = new java.util.LinkedList();
        for (jz5.l lVar : linkedList) {
            com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 c25859x590b0095 = (com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095) lVar.f384367e;
            int i17 = (int) c25859x590b0095.m98363xfb854877().f47833x6be2dc6;
            int i18 = (int) c25859x590b0095.m98363xfb854877().f47832xb7389127;
            if (i17 > 0 && i18 > 0) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
                java.util.LinkedList linkedList3 = (java.util.LinkedList) this.f528874a.get(new jz5.l(valueOf, valueOf2));
                com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m98337x7e2662a9 = !(linkedList3 == null || linkedList3.isEmpty()) ? (com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049) linkedList3.removeFirst() : com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25858x90ea669.m98337x7e2662a9(valueOf.intValue(), valueOf2.intValue());
                com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 c25859x590b00952 = (com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095) lVar.f384367e;
                c25859x590b00952.m98353x844190fb(false, true);
                m98749x8d2f93b3.m98341x2f4f6f98(c25859x590b00952, m98337x7e2662a9);
                c25859x590b00952.m98371x6761d4f();
                rm5.j jVar2 = (rm5.j) lVar.f384366d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m98337x7e2662a9);
                linkedList2.add(new rm5.m(jVar2, m98337x7e2662a9));
            }
        }
        wm5.h hVar = (wm5.h) this;
        xm5.b.a(hVar.f528887d, "[hash:%d][thread:%d]renderTracks ", java.lang.Integer.valueOf(hVar.hashCode()), java.lang.Integer.valueOf(android.os.Process.myTid()));
        if (hVar.f528894k == 0 || hVar.f528895l == 0) {
            hVar.f528894k = m98749x8d2f93b3.m98342xc0f97383().m97645x6be2dc6();
            hVar.f528895l = m98749x8d2f93b3.m98342xc0f97383().m97632xb7389127();
            xm5.b.c(hVar.f528887d, "renderTracks renderSize " + hVar.f528894k + ", " + hVar.f528895l + ", assetSize: " + hVar.f528875b + ", crop: " + hVar.f528893j, new java.lang.Object[0]);
        }
        if (hVar.f528888e == null) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.p314xaae8f345.mm.p2825x7e128009.C22965x6f780cba c22965x6f780cba2 = new com.p314xaae8f345.mm.p2825x7e128009.C22965x6f780cba();
            hVar.f528888e = c22965x6f780cba2;
            c22965x6f780cba2.c();
            com.p314xaae8f345.mm.p2825x7e128009.C22965x6f780cba c22965x6f780cba3 = hVar.f528888e;
            if (c22965x6f780cba3 != null) {
                c22965x6f780cba3.g(0, 0, hVar.f528875b.getWidth(), hVar.f528875b.getHeight());
            }
            if (!hVar.f528893j.isEmpty() && (c22965x6f780cba = hVar.f528888e) != null) {
                android.graphics.Rect rect = hVar.f528893j;
                c22965x6f780cba.f(rect.left, rect.top, rect.right, rect.bottom);
            }
            com.p314xaae8f345.mm.p2825x7e128009.C22965x6f780cba c22965x6f780cba4 = hVar.f528888e;
            if (c22965x6f780cba4 != null) {
                int i19 = hVar.f528894k;
                int i27 = hVar.f528895l;
                c22965x6f780cba4.f296332c = i19;
                c22965x6f780cba4.f296333d = i27;
            }
            xm5.b.c(hVar.f528887d, "init vLogDirector:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime), new java.lang.Object[0]);
        }
        if (hVar.f528891h) {
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            com.p314xaae8f345.mm.p2825x7e128009.C22965x6f780cba c22965x6f780cba5 = hVar.f528888e;
            if (c22965x6f780cba5 != null) {
                c22965x6f780cba5.e(hVar.f528889f);
            }
            hVar.f528891h = false;
            xm5.b.c(hVar.f528887d, "setVLogEffectMgr:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime2), new java.lang.Object[0]);
        }
        if (hVar.f528896m == null) {
            long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
            com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m98337x7e2662a92 = com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25858x90ea669.m98337x7e2662a9(hVar.f528894k, hVar.f528895l);
            android.opengl.GLES20.glBindTexture(3553, m98337x7e2662a92.f47890xc35d0376);
            android.opengl.GLES20.glTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, m98337x7e2662a92.f47894x6be2dc6, m98337x7e2662a92.f47883xb7389127, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
            android.opengl.GLES20.glBindTexture(3553, 0);
            hVar.f528896m = m98337x7e2662a92;
            java.lang.String str = hVar.f528887d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkCreateOutputTexture texture.id:");
            com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc39450492 = hVar.f528896m;
            sb6.append(c25745xc39450492 != null ? java.lang.Integer.valueOf(c25745xc39450492.f47890xc35d0376) : null);
            sb6.append(", cost:");
            sb6.append(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3);
            xm5.b.c(str, sb6.toString(), new java.lang.Object[0]);
            hVar.f528892i = false;
        } else if (hVar.f528892i) {
            long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime();
            com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m98337x7e2662a93 = com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25858x90ea669.m98337x7e2662a9(hVar.f528894k, hVar.f528895l);
            android.opengl.GLES20.glBindTexture(3553, m98337x7e2662a93.f47890xc35d0376);
            android.opengl.GLES20.glTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, m98337x7e2662a93.f47894x6be2dc6, m98337x7e2662a93.f47883xb7389127, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
            android.opengl.GLES20.glBindTexture(3553, 0);
            hVar.f528896m = m98337x7e2662a93;
            java.lang.String str2 = hVar.f528887d;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("ReCreateOutputTexture texture.id:");
            com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc39450493 = hVar.f528896m;
            sb7.append(c25745xc39450493 != null ? java.lang.Integer.valueOf(c25745xc39450493.f47890xc35d0376) : null);
            sb7.append(", cost:");
            sb7.append(android.os.SystemClock.elapsedRealtime() - elapsedRealtime4);
            xm5.b.c(str2, sb7.toString(), new java.lang.Object[0]);
            hVar.f528892i = false;
        }
        java.util.LinkedList linkedList4 = new java.util.LinkedList();
        for (rm5.m mVar : linkedList2) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc39450494 = mVar.f479061b;
            tq5.f fVar = new tq5.f(c25745xc39450494.f47890xc35d0376, c25745xc39450494.f47894x6be2dc6, c25745xc39450494.f47883xb7389127, false, mVar.f479060a.f479044m);
            if (!mVar.f479060a.f479046o.isEmpty()) {
                fVar.f502795g.set(mVar.f479060a.f479046o);
            }
            rm5.j jVar3 = mVar.f479060a;
            if (jVar3.f479047p) {
                if (jVar3.f479045n.isEmpty()) {
                    android.graphics.Rect rect2 = fVar.f502796h;
                    rm5.j jVar4 = mVar.f479060a;
                    rect2.set(0, 0, jVar4.f479042k, jVar4.f479043l);
                    rm5.o.a(fVar.f502796h, new android.graphics.Rect(0, 0, hVar.f528875b.getWidth(), hVar.f528875b.getHeight()));
                } else {
                    fVar.f502796h.set(mVar.f479060a.f479045n);
                }
            }
            linkedList4.add(fVar);
        }
        wm5.e eVar = hVar.f528897n;
        eVar.getClass();
        eVar.f528885e = android.os.SystemClock.elapsedRealtime();
        if (linkedList4.size() > 0 && (c25745xc3945049 = hVar.f528896m) != null) {
            if (!(c25745xc3945049.f47890xc35d0376 > 0)) {
                c25745xc3945049 = null;
            }
            if (c25745xc3945049 != null) {
                if (hVar.f528900q == null) {
                    hVar.f528900q = new wm5.c();
                }
                wm5.c cVar = hVar.f528900q;
                if (cVar != null) {
                    synchronized (cVar) {
                        int i28 = 0;
                        while (true) {
                            int[] iArr = cVar.f528878a;
                            if (i28 >= iArr.length) {
                                break;
                            }
                            android.opengl.GLES20.glGetIntegerv(iArr[i28], cVar.f528879b, i28);
                            i28++;
                        }
                    }
                }
                wm5.f fVar2 = hVar.f528890g;
                if (fVar2 != null) {
                    fVar2.a(m97232x31040141);
                }
                com.p314xaae8f345.mm.p2825x7e128009.C22965x6f780cba c22965x6f780cba6 = hVar.f528888e;
                if (c22965x6f780cba6 != null) {
                    c22965x6f780cba6.d(linkedList4, c25745xc3945049.f47890xc35d0376, m97232x31040141);
                }
                wm5.c cVar2 = hVar.f528900q;
                if (cVar2 != null) {
                    synchronized (cVar2) {
                        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v("GLBlendStateCache", "restore: params = " + java.util.Arrays.toString(cVar2.f528879b));
                        android.opengl.GLES20.glEnable(3042);
                        android.opengl.GLES20.glBlendEquation(cVar2.f528879b[0]);
                        int[] iArr2 = cVar2.f528879b;
                        android.opengl.GLES20.glBlendEquationSeparate(iArr2[1], iArr2[2]);
                        int[] iArr3 = cVar2.f528879b;
                        android.opengl.GLES20.glBlendFuncSeparate(iArr3[3], iArr3[4], iArr3[5], iArr3[6]);
                    }
                }
            }
        }
        if (hVar.f528898o) {
            android.opengl.GLES20.glFinish();
        }
        wm5.e eVar2 = hVar.f528897n;
        long j18 = eVar2.f528885e;
        if (j18 > 0) {
            eVar2.f528882b += android.os.SystemClock.elapsedRealtime() - j18;
            eVar2.f528883c++;
        }
        eVar2.f528885e = 0L;
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc39450495 = hVar.f528896m;
        for (rm5.m mVar2 : linkedList2) {
            jz5.l lVar2 = new jz5.l(java.lang.Integer.valueOf(mVar2.f479061b.f47894x6be2dc6), java.lang.Integer.valueOf(mVar2.f479061b.f47883xb7389127));
            android.util.ArrayMap arrayMap = this.f528874a;
            java.lang.Object obj = arrayMap.get(lVar2);
            if (obj == null) {
                obj = new java.util.LinkedList();
                arrayMap.put(lVar2, obj);
            }
            ((java.util.LinkedList) obj).add(mVar2.f479061b);
        }
        com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 c25859x590b00953 = new com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095(c25745xc39450495);
        c25859x590b00953.m98353x844190fb(false, true);
        c25859x590b00953.m98351xf97b67f7(new com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468(0.0f, 0.0f, c25912xbdf93b84.m98753x785dd09a(), c25912xbdf93b84.m98751x798d48d3()), this.f528876c);
        return c25859x590b00953;
    }

    public abstract void b(int i17, int i18);

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb.Filter
    /* renamed from: release */
    public void mo98538x41012807() {
        xm5.b.c("BaseMultiVideoCompositionEffect", "release: " + this, new java.lang.Object[0]);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.util.ArrayMap arrayMap = this.f528874a;
        java.util.Iterator it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.Object value = ((java.util.Map.Entry) it.next()).getValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "<get-value>(...)");
            kz5.h0.u(arrayList, (java.util.LinkedList) value);
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            ((com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049) it6.next()).m97285x41012807();
        }
        arrayMap.clear();
    }
}
