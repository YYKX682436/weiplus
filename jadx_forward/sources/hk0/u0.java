package hk0;

/* loaded from: classes3.dex */
public final class u0 extends p012xc85e97e9.p093xedfae76a.c1 {

    /* renamed from: d */
    public final p012xc85e97e9.p093xedfae76a.y f363346d;

    /* renamed from: e */
    public final java.util.HashMap f363347e;

    /* renamed from: f */
    public final java.util.HashMap f363348f;

    /* renamed from: g */
    public p012xc85e97e9.p093xedfae76a.j0 f363349g;

    /* renamed from: h */
    public p012xc85e97e9.p093xedfae76a.j0 f363350h;

    /* renamed from: i */
    public hk0.z f363351i;

    /* renamed from: m */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f363352m;

    /* renamed from: n */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f363353n;

    /* renamed from: o */
    public hk0.o f363354o;

    /* renamed from: p */
    public final p3325xe03a0797.p3326xc267989b.y0 f363355p;

    /* renamed from: q */
    public int f363356q;

    /* renamed from: r */
    public int f363357r;

    /* renamed from: s */
    public int f363358s;

    /* renamed from: t */
    public int f363359t;

    public u0(p012xc85e97e9.p093xedfae76a.y owner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        this.f363346d = owner;
        this.f363347e = new java.util.HashMap();
        this.f363348f = new java.util.HashMap();
        this.f363349g = new p012xc85e97e9.p093xedfae76a.j0();
        this.f363350h = new p012xc85e97e9.p093xedfae76a.j0();
        this.f363351i = new hk0.z();
        this.f363352m = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(new java.util.ArrayList());
        this.f363353n = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(new java.util.ArrayList());
        this.f363355p = p3325xe03a0797.p3326xc267989b.z0.b();
        W6();
    }

    public static final java.lang.Object N6(hk0.u0 u0Var, java.util.ArrayList arrayList, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        u0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoStateModel", "emitEditaDataEvent: dataSize >> " + arrayList.size());
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) u0Var.f363353n).mo771x2f8fd3(arrayList, interfaceC29045xdcb5ca57);
        pz5.a aVar = pz5.a.f440719d;
        return jz5.f0.f384359a;
    }

    public static final java.lang.Object O6(hk0.u0 u0Var, java.util.ArrayList arrayList, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        u0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoStateModel", "emitEditEventData >> " + arrayList.size());
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) u0Var.f363352m).mo771x2f8fd3(arrayList, interfaceC29045xdcb5ca57);
        pz5.a aVar = pz5.a.f440719d;
        return jz5.f0.f384359a;
    }

    public static /* synthetic */ void e7(hk0.u0 u0Var, int i17, java.lang.Boolean bool, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            bool = null;
        }
        u0Var.d7(i17, bool);
    }

    public final void P6(xk0.k item, hk0.z0 mosaicType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mosaicType, "mosaicType");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoStateModel", "addMosaic >> ".concat(this.f363351i.b(mosaicType, item)));
        p3325xe03a0797.p3326xc267989b.l.d(this.f363355p, null, null, new hk0.f0(this, V6(new java.util.ArrayList()), null), 3, null);
    }

    public final void Q6(hk0.p type, java.lang.String str, int i17, int i18, java.lang.String font) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(font, "font");
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImproveEditPhotoStateModel", "addText but text is nullOrEmpty");
            return;
        }
        hk0.z zVar = this.f363351i;
        zVar.getClass();
        java.lang.String str2 = "TEXT_" + java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoDataModel", "addTextData >> type: " + type + ", editId: " + str2);
        java.util.LinkedList linkedList = zVar.f363382a;
        hk0.l lVar = hk0.l.f363299g;
        linkedList.add(new hk0.k(lVar, str2));
        zVar.f363387f.put(str2, new hk0.a1(lVar, type, str, i17, i18, font, null, null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoStateModel", "addText >> " + type + ' ' + str2);
        p3325xe03a0797.p3326xc267989b.l.d(this.f363355p, null, null, new hk0.h0(this, V6(new java.util.ArrayList()), str2, null), 3, null);
    }

    public final boolean R6(int i17) {
        hk0.o oVar;
        p012xc85e97e9.p093xedfae76a.j0 j0Var = (p012xc85e97e9.p093xedfae76a.j0) this.f363347e.get(java.lang.Integer.valueOf(i17));
        if (j0Var == null || (oVar = (hk0.o) j0Var.mo3195x754a37bb()) == null) {
            return false;
        }
        return oVar.f363316b;
    }

    public final hk0.z0 S6() {
        hk0.z0 z0Var;
        hk0.y0 y0Var = (hk0.y0) this.f363350h.mo3195x754a37bb();
        return (y0Var == null || (z0Var = y0Var.f363379a) == null) ? hk0.z0.f363395d : z0Var;
    }

    public final hk0.e T6() {
        hk0.e eVar;
        hk0.g gVar = (hk0.g) this.f363349g.mo3195x754a37bb();
        return (gVar == null || (eVar = gVar.f363267a) == null) ? new hk0.e(hk0.h.f363272d, 0, 0, 6, null) : eVar;
    }

    public final hk0.j U6() {
        hk0.z zVar = this.f363351i;
        int i17 = zVar.f363390i;
        boolean z17 = zVar.f363392k;
        java.util.LinkedList linkedList = zVar.f363389h;
        hk0.d dVar = linkedList.isEmpty() ? null : (hk0.d) zVar.f363384c.get(linkedList.getLast());
        boolean z18 = z17 || i17 != 0 || (dVar != null && dVar.f363249e);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getRotateAndCropRestoreState >> rotate=");
        sb6.append(i17);
        sb6.append(", hasCrop=");
        sb6.append(z17);
        sb6.append(", lastCrop=");
        sb6.append(dVar != null);
        sb6.append(", isCanRestore=");
        sb6.append(z18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoStateModel", sb6.toString());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("BUNDLE_KEY_BOOLEAN_1", z18);
        return new hk0.j(3, bundle);
    }

    public final java.util.ArrayList V6(java.util.ArrayList editEventList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editEventList, "editEventList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(editEventList);
        if (this.f363351i.f363382a.size() == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoStateModel", "emit EVENT_UNDO_ENABLE true");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("BUNDLE_KEY_BOOLEAN_1", true);
            arrayList.add(new hk0.j(1, bundle));
        }
        if (this.f363351i.f363383b.size() != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoStateModel", "emit EVENT_FORWARD_ENABLE false");
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("BUNDLE_KEY_BOOLEAN_1", false);
            arrayList.add(new hk0.j(2, bundle2));
            this.f363351i.f363383b.clear();
        }
        return arrayList;
    }

    public final void W6() {
        p012xc85e97e9.p093xedfae76a.j0 j0Var = new p012xc85e97e9.p093xedfae76a.j0();
        java.util.HashMap hashMap = this.f363347e;
        hashMap.put(1, j0Var);
        hashMap.put(2, new p012xc85e97e9.p093xedfae76a.j0());
        hashMap.put(3, new p012xc85e97e9.p093xedfae76a.j0());
        hashMap.put(4, new p012xc85e97e9.p093xedfae76a.j0());
        hashMap.put(5, new p012xc85e97e9.p093xedfae76a.j0());
        hashMap.put(6, new p012xc85e97e9.p093xedfae76a.j0());
        hashMap.put(10, new p012xc85e97e9.p093xedfae76a.j0());
        this.f363348f.put(1, new p012xc85e97e9.p093xedfae76a.j0());
    }

    public final void X6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoStateModel", "notifyCrop");
        hk0.z zVar = this.f363351i;
        if (zVar.f363392k) {
            return;
        }
        zVar.f363392k = true;
        p3325xe03a0797.p3326xc267989b.l.d(this.f363355p, null, null, new hk0.l0(this, null), 3, null);
    }

    public final void Y6() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new hk0.j(4, new android.os.Bundle()));
        p3325xe03a0797.p3326xc267989b.l.d(this.f363355p, null, null, new hk0.m0(this, arrayList, null), 3, null);
    }

    public final void Z6(int i17, p012xc85e97e9.p093xedfae76a.k0 observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        p012xc85e97e9.p093xedfae76a.j0 j0Var = (p012xc85e97e9.p093xedfae76a.j0) this.f363347e.get(java.lang.Integer.valueOf(i17));
        if (j0Var == null) {
            return;
        }
        j0Var.mo7806x9d92d11c(this.f363346d, observer);
    }

    public final void a7(int i17, p012xc85e97e9.p093xedfae76a.k0 observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        p012xc85e97e9.p093xedfae76a.j0 j0Var = (p012xc85e97e9.p093xedfae76a.j0) this.f363348f.get(java.lang.Integer.valueOf(i17));
        if (j0Var == null) {
            return;
        }
        j0Var.mo7806x9d92d11c(this.f363346d, observer);
    }

    public final void b7(hk0.e doodleBean) {
        hk0.e eVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(doodleBean, "doodleBean");
        hk0.g gVar = (hk0.g) this.f363349g.mo3195x754a37bb();
        if (gVar == null || (eVar = gVar.f363267a) == null) {
            eVar = new hk0.e(hk0.h.f363272d, 0, 0, 6, null);
        }
        this.f363349g.mo7808x76db6cb1(new hk0.g(doodleBean, eVar));
    }

    public final java.lang.String c7(xk0.f emojiItem, hk0.p handleType) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiItem, "emojiItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handleType, "handleType");
        java.lang.String str2 = emojiItem.f536499x;
        boolean z17 = str2 != null && r26.n0.B(str2, "EMOJI", false);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f363355p;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoStateModel", "updateEmojiOrTextItem >> emoji " + handleType);
            hk0.z zVar = this.f363351i;
            zVar.getClass();
            java.lang.String str3 = "EMOJI_" + java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoDataModel", "addUpdateEmojiItem >> editId: " + emojiItem.f536499x + ' ' + handleType + ' ' + str3);
            java.util.LinkedList linkedList = zVar.f363382a;
            hk0.l lVar = hk0.l.f363300h;
            linkedList.add(new hk0.k(lVar, str3));
            java.util.HashMap hashMap = zVar.f363388g;
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = emojiItem.f536484f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(interfaceC4987x84e327cb, "getEmojiInfo(...)");
            hashMap.put(str3, new hk0.m(lVar, handleType, interfaceC4987x84e327cb, emojiItem, emojiItem.f536499x));
            emojiItem.f536499x = str3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoStateModel", "updateEmojiData ".concat(str3));
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new hk0.r0(this, V6(new java.util.ArrayList()), null), 3, null);
            return str3;
        }
        java.lang.String str4 = emojiItem.f536499x;
        if (!(str4 != null && r26.n0.B(str4, "TEXT", false))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImproveEditPhotoStateModel", "updateEmojiOrTextItem error >> " + emojiItem.f536499x);
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoStateModel", "updateEmojiOrTextItem >> text " + handleType);
        xk0.p pVar = (xk0.p) emojiItem;
        hk0.z zVar2 = this.f363351i;
        zVar2.getClass();
        java.lang.String str5 = "TEXT_" + java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoDataModel", "addEmojiUpdateItem >> " + handleType + " emojiItemEditId: " + pVar.f536499x + " currentId: " + str5);
        java.util.LinkedList linkedList2 = zVar2.f363382a;
        hk0.l lVar2 = hk0.l.f363299g;
        linkedList2.add(new hk0.k(lVar2, str5));
        java.util.HashMap hashMap2 = zVar2.f363387f;
        java.lang.String spannableString = pVar.E.toString();
        int i17 = pVar.A;
        int i18 = pVar.B;
        cm5.m mVar = pVar.F;
        if (mVar == null || (str = mVar.f124982c) == null) {
            str = "";
        }
        hashMap2.put(str5, new hk0.a1(lVar2, handleType, spannableString, i17, i18, str, pVar, pVar.f536499x));
        pVar.f536499x = str5;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoStateModel", "updateText >> " + handleType + ", editId: " + pVar.f536499x + " newEditId: " + str5);
        p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new hk0.t0(this, V6(new java.util.ArrayList()), null), 3, null);
        return str5;
    }

    public final void d7(int i17, java.lang.Boolean bool) {
        jz5.f0 f0Var;
        p012xc85e97e9.p093xedfae76a.j0 j0Var = (p012xc85e97e9.p093xedfae76a.j0) this.f363347e.get(java.lang.Integer.valueOf(i17));
        if (j0Var == null) {
            return;
        }
        if (bool != null) {
            bool.booleanValue();
            j0Var.mo7808x76db6cb1(new hk0.o(i17, bool.booleanValue()));
            f7(bool.booleanValue(), i17);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            hk0.o oVar = (hk0.o) j0Var.mo3195x754a37bb();
            boolean z17 = oVar != null ? oVar.f363316b : false;
            j0Var.mo7808x76db6cb1(new hk0.o(i17, !z17));
            f7(!z17, i17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r3.f363316b == true) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f7(boolean r6, int r7) {
        /*
            r5 = this;
            if (r6 == 0) goto L38
            hk0.o r0 = r5.f363354o
            if (r0 == 0) goto L32
            int r0 = r0.f363315a
            if (r7 == r0) goto L32
            java.util.HashMap r1 = r5.f363347e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.get(r2)
            androidx.lifecycle.j0 r1 = (p012xc85e97e9.p093xedfae76a.j0) r1
            r2 = 0
            if (r1 == 0) goto L27
            java.lang.Object r3 = r1.mo3195x754a37bb()
            hk0.o r3 = (hk0.o) r3
            if (r3 == 0) goto L27
            r4 = 1
            boolean r3 = r3.f363316b
            if (r3 != r4) goto L27
            goto L28
        L27:
            r4 = r2
        L28:
            if (r4 == 0) goto L32
            hk0.o r3 = new hk0.o
            r3.<init>(r0, r2)
            r1.mo7808x76db6cb1(r3)
        L32:
            hk0.o r0 = new hk0.o
            r0.<init>(r7, r6)
            goto L39
        L38:
            r0 = 0
        L39:
            r5.f363354o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hk0.u0.f7(boolean, int):void");
    }

    public final void g7(hk0.z0 mosaicType, boolean z17) {
        hk0.z0 z0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mosaicType, "mosaicType");
        hk0.y0 y0Var = (hk0.y0) this.f363350h.mo3195x754a37bb();
        if (y0Var == null || (z0Var = y0Var.f363379a) == null) {
            z0Var = hk0.z0.f363395d;
        }
        this.f363350h.mo7808x76db6cb1(new hk0.y0(mosaicType, z0Var, z17));
    }

    public final void h7(int i17, boolean z17) {
        jz5.f0 f0Var;
        p012xc85e97e9.p093xedfae76a.j0 j0Var = (p012xc85e97e9.p093xedfae76a.j0) this.f363348f.get(java.lang.Integer.valueOf(i17));
        if (j0Var == null) {
            return;
        }
        hk0.c1 c1Var = (hk0.c1) j0Var.mo3195x754a37bb();
        if (c1Var != null) {
            if (c1Var.f363245b != z17) {
                j0Var.mo7808x76db6cb1(new hk0.c1(i17, z17));
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            j0Var.mo7808x76db6cb1(new hk0.c1(i17, z17));
        }
    }
}
