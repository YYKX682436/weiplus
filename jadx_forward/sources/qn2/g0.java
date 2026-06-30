package qn2;

/* loaded from: classes3.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.i0 f446599d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(qn2.i0 i0Var) {
        super(1);
        this.f446599d = i0Var;
    }

    public static final void a(qn2.i0 i0Var, r45.cz1 cz1Var) {
        r45.cz1 cz1Var2;
        if (!((mm2.c1) i0Var.P0(mm2.c1.class)).a8()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryVisitorCardPlugin", "visitorDoneAction liveStatus:" + ((mm2.c1) i0Var.P0(mm2.c1.class)).f410346h2);
            return;
        }
        android.view.View view = i0Var.f446758u;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveVisitorLotteryCardPlugin$doneAnimCallback$1", "invoke$visitorDoneAction", "(Lcom/tencent/mm/plugin/finder/lottery/card/FinderLiveVisitorLotteryCardPlugin;Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveVisitorLotteryCardPlugin$doneAnimCallback$1", "invoke$visitorDoneAction", "(Lcom/tencent/mm/plugin/finder/lottery/card/FinderLiveVisitorLotteryCardPlugin;Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        qn2.v0 v0Var = i0Var.H;
        if (v0Var != null) {
            km2.z zVar = ((on2.z2) i0Var.P0(on2.z2.class)).f428625m;
            if (zVar != null && (cz1Var2 = zVar.f390765d) != null) {
                cz1Var = cz1Var2;
            }
            v0Var.d(cz1Var, true);
        }
        i0Var.K0(0);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.cz1 cz1Var;
        r45.cz1 cz1Var2;
        r45.cz1 cz1Var3;
        r45.cz1 it = (r45.cz1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        r45.ht1 ht1Var = ((on2.z2) this.f446599d.P0(on2.z2.class)).f428627o;
        java.lang.String str = null;
        java.lang.Long valueOf = ht1Var != null ? java.lang.Long.valueOf(ht1Var.m75942xfb822ef2(5)) : null;
        r45.ht1 ht1Var2 = ((on2.z2) this.f446599d.P0(on2.z2.class)).f428627o;
        boolean z17 = true;
        java.lang.String m75945x2fec8307 = (ht1Var2 == null || (cz1Var3 = (r45.cz1) ht1Var2.m75936x14adae67(1)) == null) ? null : cz1Var3.m75945x2fec8307(0);
        km2.z zVar = ((on2.z2) this.f446599d.P0(on2.z2.class)).f428625m;
        if (zVar != null && (cz1Var2 = zVar.f390765d) != null) {
            str = cz1Var2.m75945x2fec8307(0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryVisitorCardPlugin", "doneAnimCallback curRecordLiveId" + valueOf + ",curRecordLotteryId:" + m75945x2fec8307 + ",callbakcId:" + it.m75945x2fec8307(0) + ",localId:" + str + ",lottering:" + this.f446599d.f446756s);
        long m75942xfb822ef2 = ((mm2.e1) this.f446599d.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        if (valueOf != null && valueOf.longValue() == m75942xfb822ef2) {
            if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
                z17 = false;
            }
            if (!z17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, str)) {
                a(this.f446599d, it);
                return jz5.f0.f384359a;
            }
        }
        this.f446599d.y1(0);
        qn2.i0 i0Var = this.f446599d;
        qn2.l1 l1Var = i0Var.D;
        if (l1Var != null) {
            km2.z zVar2 = ((on2.z2) i0Var.P0(on2.z2.class)).f428625m;
            if (zVar2 == null || (cz1Var = zVar2.f390765d) == null) {
                cz1Var = it;
            }
            l1Var.g(cz1Var);
        }
        qn2.i0 i0Var2 = this.f446599d;
        i0Var2.u1(new qn2.f0(it, i0Var2));
        return jz5.f0.f384359a;
    }
}
