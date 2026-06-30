package yf2;

/* loaded from: classes3.dex */
public final class f2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yf2.i2 f543224a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.id f543225b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f543226c;

    public f2(yf2.i2 i2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.id idVar, int i17) {
        this.f543224a = i2Var;
        this.f543225b = idVar;
        this.f543226c = i17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.String str;
        df2.tc tcVar;
        android.content.Intent intent;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.util.LinkedList m75941xfb821914 = ((r45.m02) fVar.f152151d).m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getRet_list(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((r45.ix0) obj2).m75939xb282bd08(0) == 19) {
                break;
            }
        }
        r45.ix0 ix0Var = (r45.ix0) obj2;
        int m75939xb282bd08 = ix0Var != null ? ix0Var.m75939xb282bd08(1) : 0;
        if (ix0Var == null || (str = ix0Var.m75945x2fec8307(2)) == null) {
            str = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStartLiveTopicCoverController", "CgiFinderLiveModBasicInfo errType:" + fVar.f152148a + " errCode:" + fVar.f152149b + ", errMsg:" + fVar.f152150c + ", retCode=" + m75939xb282bd08 + ", retMsg=" + str);
        int i17 = fVar.f152148a;
        yf2.i2 i2Var = this.f543224a;
        if (i17 != 0 || fVar.f152149b != 0 || m75939xb282bd08 != 0) {
            if (str.length() == 0) {
                str = i2Var.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dc_);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
            }
            db5.t7.h(i2Var.O6(), str);
            return jz5.f0.f384359a;
        }
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = ((mm2.g1) i2Var.m56788xbba4bfc0(mm2.g1.class)).f410609q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.id idVar = this.f543225b;
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).k(idVar.f200201b);
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) i2Var.m56788xbba4bfc0(mm2.g1.class)).f410610r).k(idVar.f200202c);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = i2Var.N6();
        java.lang.String str2 = idVar.f200201b;
        if (N6 != null && (intent = N6.getIntent()) != null) {
            intent.putExtra("DESC", str2);
        }
        android.view.View view = i2Var.f543255r;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/startlive/FinderStartLiveTopicCoverController$showEdit$1$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/startlive/FinderStartLiveTopicCoverController$showEdit$1$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f543226c > 0 && (tcVar = (df2.tc) i2Var.m56789x25fe639c(df2.tc.class)) != null) {
            df2.tc.Z6(tcVar, this.f543226c, null, java.lang.String.valueOf(str2.length()), str2.toString(), 2, null);
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(((mm2.x) i2Var.m56788xbba4bfc0(mm2.x.class)).f411056i);
        int intValue = valueOf.intValue();
        if (!(intValue > 0 && str2.length() < intValue)) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        int intValue2 = valueOf.intValue();
        df2.tc tcVar2 = (df2.tc) i2Var.m56789x25fe639c(df2.tc.class);
        if (tcVar2 != null) {
            df2.tc.Z6(tcVar2, 4, null, null, null, 14, null);
        }
        android.content.Context O6 = i2Var.O6();
        int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(O6);
        e4Var.f293309c = i2Var.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m7z, java.lang.String.valueOf(intValue2));
        return e4Var.c();
    }
}
