package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class zz extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l implements tk2.a {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f196924p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f196925q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f196926r;

    /* renamed from: s, reason: collision with root package name */
    public long f196927s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f196928t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f196924p = statusMonitor;
        this.f196925q = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vz(root, this));
        this.f196926r = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qz(root, this));
        K0(8);
    }

    public static final void t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz zzVar, java.util.LinkedList linkedList) {
        mm2.h7 h7Var = (mm2.h7) zzVar.P0(mm2.h7.class);
        if (linkedList.size() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamPlugin", "notifyMultiStreamUpdate before pos: " + ((mm2.h7) h7Var.m147920xbba4bfc0(mm2.h7.class)).f410649h);
            if (((mm2.h7) h7Var.m147920xbba4bfc0(mm2.h7.class)).f410649h >= linkedList.size()) {
                ((mm2.h7) h7Var.m147920xbba4bfc0(mm2.h7.class)).f410649h = 0;
            }
            java.util.LinkedList linkedList2 = h7Var.f410650i;
            int i17 = ((mm2.h7) h7Var.m147920xbba4bfc0(mm2.h7.class)).f410649h;
            r45.la4 la4Var = i17 >= linkedList2.size() ? null : (r45.la4) linkedList2.get(i17);
            java.lang.String str = la4Var != null ? la4Var.f460807e : null;
            int i18 = ((mm2.h7) h7Var.m147920xbba4bfc0(mm2.h7.class)).f410649h;
            r45.la4 la4Var2 = i18 >= linkedList.size() ? null : (r45.la4) linkedList.get(i18);
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, la4Var2 != null ? la4Var2.f460807e : null)) {
                mm2.h7 h7Var2 = (mm2.h7) h7Var.m147920xbba4bfc0(mm2.h7.class);
                java.util.Iterator it = linkedList.iterator();
                int i19 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i19 = -1;
                        break;
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.la4) it.next()).f460807e, str)) {
                        break;
                    } else {
                        i19++;
                    }
                }
                h7Var2.f410649h = i19;
            }
            if (((mm2.h7) h7Var.m147920xbba4bfc0(mm2.h7.class)).f410649h < 0) {
                ((mm2.h7) h7Var.m147920xbba4bfc0(mm2.h7.class)).f410649h = 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamPlugin", "notifyMultiStreamUpdate pos: " + ((mm2.h7) h7Var.m147920xbba4bfc0(mm2.h7.class)).f410649h);
        }
        h7Var.f410650i = linkedList;
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            r45.ka4 ka4Var = ((r45.la4) it6.next()).f460806d;
            ka4Var.S = h7Var.f410656r;
            ka4Var.T = h7Var.f410657s;
            ka4Var.U = h7Var.f410658t;
        }
        zzVar.y1(linkedList);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l.b1(this, this.f446856d, "MultiStreamPlugin", false, 4, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pz.f195470a[status.ordinal()] == 1) {
            java.util.LinkedList linkedList = ((mm2.h7) P0(mm2.h7.class)).f410650i;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamPlugin", "initPlugin multiChannelParamsList: " + linkedList.size());
            if (linkedList.size() > 0) {
                dk2.tb tbVar = dk2.ef.f314925k;
                tbVar.f(13);
                r45.e22 e22Var = new r45.e22();
                e22Var.set(0, java.lang.Long.valueOf(this.f196927s));
                tbVar.e(13, e22Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xz(this, r45.a22.class), false);
                K0(0);
                rk2.q w17 = w1();
                w17.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamWidget", "initWidget");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14258x2652fdcb c14258x2652fdcb = w17.f478007e;
                c14258x2652fdcb.f197524y = -1;
                c14258x2652fdcb.f197522w = 0;
                c14258x2652fdcb.f197523x = false;
                w17.f478013k = true;
                w17.f478008f = -1;
                w17.f478009g = false;
                w17.f478010h = -1;
                w17.f478011i = -1;
                w17.f478012j = false;
                w17.f478016n = true;
                w17.f478014l = "";
                y1(linkedList);
            } else {
                K0(8);
            }
            ((mm2.h7) P0(mm2.h7.class)).f410647f.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rz(this));
            ((mm2.h7) P0(mm2.h7.class)).f410651m.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tz(this));
            ((mm2.h7) P0(mm2.h7.class)).f410652n.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.uz(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamPlugin", "multiStreamUnMount: " + hashCode());
        this.f196928t = true;
        dk2.ef.f314925k.f(13);
        if (((jz5.n) this.f196925q).mo141624xf582434a()) {
            rk2.q w17 = w1();
            w17.getClass();
            java.util.HashMap hashMap = rk2.d.f477983a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 ob0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz) w17.f478003a).X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0.class);
            mn0.b0 B1 = ob0Var != null ? ob0Var.B1() : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamPlayerManager", "onDestroy curPlayer: " + B1);
            java.util.HashMap hashMap2 = rk2.d.f477983a;
            for (java.util.Map.Entry entry : hashMap2.entrySet()) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(entry.getValue(), B1)) {
                    mn0.b0.C((mn0.b0) entry.getValue(), true, false, false, 6, null);
                    ((mn0.y) ((mn0.b0) entry.getValue())).w();
                }
            }
            hashMap2.clear();
            w17.f478013k = false;
            w17.f478008f = -1;
            w17.f478009g = false;
            w17.f478010h = -1;
            w17.f478011i = -1;
            w17.f478012j = false;
            w17.f478016n = true;
            w17.f478014l = "";
        }
        if (((jz5.n) this.f196926r).mo141624xf582434a()) {
            wk2.c cVar = u1().y().f528485h;
            cVar.f528470c.mo50293x3498a0(new wk2.b(cVar));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void g1(android.content.res.Configuration configuration) {
        rk2.q w17 = w1();
        w17.getClass();
        if (com.p314xaae8f345.mm.ui.bk.Q()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14259xb044a81d c14259xb044a81d = w17.f478004b;
            int childCount = c14259xb044a81d.getChildCount();
            if (childCount >= 0) {
                int i17 = 0;
                while (true) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamWidget", "multistream onConfigurationChanged pos: " + i17);
                    android.view.View childAt = c14259xb044a81d.getChildAt(i17);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14257x862705f6 c14257x862705f6 = childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14257x862705f6 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14257x862705f6) childAt : null;
                    if (c14257x862705f6 != null) {
                        c14257x862705f6.f(true);
                    }
                    if (i17 == childCount) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14259xb044a81d c14259xb044a81d2 = w17.f478004b;
            int i18 = w17.f478015m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c14259xb044a81d2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/multistream/FinderLiveMultiStreamWidget", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Undefined", "scrollToPosition", "(I)V");
            c14259xb044a81d2.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c14259xb044a81d2, "com/tencent/mm/plugin/finder/live/multistream/FinderLiveMultiStreamWidget", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Undefined", "scrollToPosition", "(I)V");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final vk2.h u1() {
        return (vk2.h) ((jz5.n) this.f196926r).mo141623x754a37bb();
    }

    public java.lang.String v1() {
        return ((mm2.c1) ((mm2.c1) P0(mm2.c1.class)).m147920xbba4bfc0(mm2.c1.class)).t7();
    }

    public final rk2.q w1() {
        return (rk2.q) ((jz5.n) this.f196925q).mo141623x754a37bb();
    }

    public void x1(int i17) {
        ((mm2.c1) P0(mm2.c1.class)).N1 = !((mm2.c1) P0(mm2.c1.class)).N1;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", ((mm2.c1) P0(mm2.c1.class)).N1);
        this.f196924p.mo46557x60d69242(qo0.b.Z2, bundle);
    }

    public final void y1(java.util.LinkedList linkedList) {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateMultiStream size: ");
        sb6.append(linkedList.size());
        sb6.append(" multiStreamData =  ");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.la4 la4Var = (r45.la4) it.next();
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("stream_id: ");
            sb8.append(la4Var.f460807e);
            sb8.append(" desc: ");
            java.lang.String str2 = la4Var.f460808f;
            if (str2 != null) {
                byte[] decode = android.util.Base64.decode(str2, 0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
                str = new java.lang.String(decode, r26.c.f450398a);
            } else {
                str = "";
            }
            sb8.append(str);
            sb8.append(" cdnSize: ");
            sb8.append(la4Var.f460806d.f460073m.size());
            sb8.append('\n');
            sb7.append(sb8.toString());
        }
        java.lang.String sb9 = sb7.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb9, "toString(...)");
        sb6.append(sb9);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamPlugin", sb6.toString());
        if (linkedList.size() <= 0) {
            return;
        }
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yz(linkedList, this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamPlugin", "multiStreamMount: " + hashCode());
        this.f196928t = false;
    }
}
