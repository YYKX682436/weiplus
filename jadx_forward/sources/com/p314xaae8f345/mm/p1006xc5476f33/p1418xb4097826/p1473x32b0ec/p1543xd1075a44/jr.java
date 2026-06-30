package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class jr extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f200304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mr f200305e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mr mrVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f200305e = mrVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jr(this.f200305e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jr) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object j17;
        java.util.List list;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f200304d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mr mrVar = this.f200305e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.widget.TextView textView = mrVar.S;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("poiTxt");
                throw null;
            }
            textView.setText("");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14402x32faa68e c14402x32faa68e = mrVar.T;
            if (c14402x32faa68e == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("poiFlow");
                throw null;
            }
            if (c14402x32faa68e.m79121x4cc68f0b() > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14402x32faa68e c14402x32faa68e2 = mrVar.T;
                if (c14402x32faa68e2 != null) {
                    c14402x32faa68e2.setVisibility(0);
                    return f0Var;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("poiFlow");
                throw null;
            }
            zl2.r4 r4Var = zl2.r4.f555483a;
            gk2.e eVar = mrVar.H;
            this.f200304d = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            pf5.u uVar = pf5.u.f435469a;
            if (((ey2.k0) ((ya2.o1) uVar.e(zy2.b6.class).c(ya2.o1.class))).N6()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", "#requestLocationLikeByUser begin");
                jz5.l P6 = ((ey2.k0) ((ya2.o1) uVar.e(zy2.b6.class).c(ya2.o1.class))).P6();
                r45.d64 d64Var = new r45.d64();
                d64Var.f453707d = ((java.lang.Number) P6.f384366d).floatValue();
                d64Var.f453708e = ((java.lang.Number) P6.f384367e).floatValue();
                d64Var.f453712i = 0;
                d64Var.f453709f = 1;
                ((dn3.f) ((w25.f) i95.n0.c(w25.f.class))).wi(7, d64Var, false, new zl2.e3(rVar, d64Var));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", "#requestLocationLikeByUser no permission");
                rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
            }
            j17 = rVar.j();
            if (j17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            j17 = obj;
        }
        jz5.l lVar = (jz5.l) j17;
        if (lVar == null || (list = (java.util.List) lVar.f384367e) == null || !(true ^ list.isEmpty())) {
            list = null;
        }
        r45.ze2 ze2Var = lVar != null ? (r45.ze2) lVar.f384366d : null;
        if (ze2Var == null || list == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14402x32faa68e c14402x32faa68e3 = mrVar.T;
            if (c14402x32faa68e3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("poiFlow");
                throw null;
            }
            c14402x32faa68e3.o();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14402x32faa68e c14402x32faa68e4 = mrVar.T;
            if (c14402x32faa68e4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("poiFlow");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c14402x32faa68e4, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c14402x32faa68e4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLivePostStrengthenPanel$refreshPoiView$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c14402x32faa68e4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(c14402x32faa68e4, "com/tencent/mm/plugin/finder/live/widget/FinderLivePostStrengthenPanel$refreshPoiView$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(c14402x32faa68e4, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14402x32faa68e c14402x32faa68e5 = mrVar.T;
            if (c14402x32faa68e5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("poiFlow");
                throw null;
            }
            c14402x32faa68e5.o();
            int i18 = 0;
            for (java.lang.Object obj2 : kz5.n0.K0(list, 5)) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.c64 c64Var = (r45.c64) obj2;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14402x32faa68e c14402x32faa68e6 = mrVar.T;
                if (c14402x32faa68e6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("poiFlow");
                    throw null;
                }
                java.lang.String Title = c64Var.f452844e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Title, "Title");
                c14402x32faa68e6.d(Title, false);
                i18 = i19;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14402x32faa68e c14402x32faa68e7 = mrVar.T;
            if (c14402x32faa68e7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("poiFlow");
                throw null;
            }
            c14402x32faa68e7.m57912x12498e3(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ir(mrVar, list, ze2Var));
        }
        return f0Var;
    }
}
