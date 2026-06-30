package qm2;

/* loaded from: classes3.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f446279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qm2.u f446280e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f446281f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r45.h32 h32Var, qm2.u uVar, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f446279d = h32Var;
        this.f446280e = uVar;
        this.f446281f = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qm2.s(this.f446279d, this.f446280e, this.f446281f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qm2.s sVar = (qm2.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        sVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var2;
        mm2.y6 y6Var;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.util.LinkedList linkedList3;
        r45.t32 t32Var;
        java.util.LinkedList m75941xfb821914;
        r45.t32 t32Var2;
        r45.t32 t32Var3;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.h32 noticeInfo = this.f446279d;
        long m75939xb282bd08 = noticeInfo.m75939xb282bd08(0) * 1000;
        int m75939xb282bd082 = noticeInfo.m75939xb282bd08(20);
        qm2.u uVar = this.f446280e;
        if (m75939xb282bd082 == 1) {
            android.widget.TextView textView = uVar.f446286e;
            if (textView != null) {
                textView.setText(uVar.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mi8));
            }
        } else {
            java.util.Date date = new java.util.Date(m75939xb282bd08);
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTime(date);
            int i17 = calendar.get(2) + 1;
            int i18 = calendar.get(5);
            zl2.q4 q4Var = zl2.q4.f555466a;
            java.lang.String z17 = q4Var.z(calendar.get(11));
            java.lang.String z18 = q4Var.z(calendar.get(12));
            int i19 = (!zl2.r4.f555483a.Y1(uVar.m80379x76847179()) || j65.f.f379476g <= 1.0f) ? noticeInfo.m75939xb282bd08(18) == 1 ? com.p314xaae8f345.mm.R.C30867xcad56011.m97 : com.p314xaae8f345.mm.R.C30867xcad56011.m0i : com.p314xaae8f345.mm.R.C30867xcad56011.lup;
            android.widget.TextView textView2 = uVar.f446286e;
            if (textView2 != null) {
                textView2.setText(uVar.m80379x76847179().getResources().getString(i19, new java.lang.Integer(i17), new java.lang.Integer(i18), z17, z18));
            }
        }
        java.lang.String m75945x2fec8307 = noticeInfo.m75945x2fec8307(3);
        mm2.y6 y6Var2 = null;
        if (m75945x2fec8307 != null) {
            if (!(m75945x2fec8307.length() > 0)) {
                m75945x2fec8307 = null;
            }
            if (m75945x2fec8307 != null) {
                gk2.e eVar = uVar.f446290i;
                p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var3 = eVar != null ? ((mm2.g1) eVar.a(mm2.g1.class)).f410609q : null;
                if (j2Var3 != null) {
                    ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var3).k(m75945x2fec8307);
                }
            }
        }
        java.lang.String m75945x2fec83072 = noticeInfo.m75945x2fec8307(23);
        if (m75945x2fec83072 != null) {
            if (!(m75945x2fec83072.length() > 0)) {
                m75945x2fec83072 = null;
            }
            if (m75945x2fec83072 != null) {
                gk2.e eVar2 = uVar.f446290i;
                p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var4 = eVar2 != null ? ((mm2.g1) eVar2.a(mm2.g1.class)).f410610r : null;
                if (j2Var4 != null) {
                    ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var4).k(m75945x2fec83072);
                }
            }
        }
        r45.q65 q65Var = (r45.q65) noticeInfo.m75936x14adae67(10);
        if ((q65Var != null && q65Var.m75933x41a8a7f2(0)) && this.f446281f) {
            gk2.e eVar3 = uVar.f446290i;
            if (eVar3 != null && (j2Var2 = ((mm2.g1) eVar3.a(mm2.g1.class)).f410611s) != null && (y6Var = (mm2.y6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var2).mo144003x754a37bb()) != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeInfo, "noticeInfo");
                r45.hn1 hn1Var = new r45.hn1();
                r45.re2 re2Var = new r45.re2();
                r45.q65 q65Var2 = (r45.q65) noticeInfo.m75936x14adae67(10);
                if (q65Var2 == null || (t32Var3 = (r45.t32) q65Var2.m75936x14adae67(6)) == null || (linkedList = t32Var3.m75941xfb821914(1)) == null) {
                    linkedList = new java.util.LinkedList();
                }
                re2Var.set(0, linkedList);
                r45.q65 q65Var3 = (r45.q65) noticeInfo.m75936x14adae67(10);
                if (q65Var3 == null || (t32Var2 = (r45.t32) q65Var3.m75936x14adae67(6)) == null || (linkedList2 = t32Var2.m75941xfb821914(2)) == null) {
                    linkedList2 = new java.util.LinkedList();
                }
                re2Var.set(1, linkedList2);
                java.util.LinkedList linkedList4 = new java.util.LinkedList();
                linkedList4.addAll(re2Var.m75941xfb821914(0));
                linkedList4.addAll(re2Var.m75941xfb821914(1));
                re2Var.set(2, linkedList4);
                r45.q65 q65Var4 = (r45.q65) noticeInfo.m75936x14adae67(10);
                if (q65Var4 == null || (t32Var = (r45.t32) q65Var4.m75936x14adae67(6)) == null || (m75941xfb821914 = t32Var.m75941xfb821914(6)) == null) {
                    linkedList3 = new java.util.LinkedList();
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
                    java.util.Iterator it = m75941xfb821914.iterator();
                    while (it.hasNext()) {
                        arrayList.add(java.lang.String.valueOf((java.lang.Integer) it.next()));
                    }
                    linkedList3 = new java.util.LinkedList(arrayList);
                }
                re2Var.set(4, linkedList3);
                hn1Var.set(2, re2Var);
                hn1Var.set(0, 2);
                r45.q65 q65Var5 = (r45.q65) noticeInfo.m75936x14adae67(10);
                hn1Var.set(1, java.lang.Integer.valueOf(q65Var5 != null ? q65Var5.m75939xb282bd08(1) : 0));
                y6Var.i(hn1Var);
                y6Var.f411114e = y6Var.a(0);
            }
            gk2.e eVar4 = uVar.f446290i;
            if (eVar4 != null && (j2Var = ((mm2.g1) eVar4.a(mm2.g1.class)).f410611s) != null) {
                y6Var2 = (mm2.y6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb();
            }
            if (y6Var2 != null) {
                y6Var2.f411124o = true;
            }
        }
        return jz5.f0.f384359a;
    }
}
