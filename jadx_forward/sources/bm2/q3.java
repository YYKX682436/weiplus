package bm2;

/* loaded from: classes3.dex */
public final class q3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ce2.i f103775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.a4 f103776e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.n3 f103777f;

    public q3(ce2.i iVar, bm2.a4 a4Var, bm2.n3 n3Var) {
        this.f103775d = iVar;
        this.f103776e = a4Var;
        this.f103777f = n3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$inflateGiftItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ce2.i iVar = this.f103775d;
        java.lang.String str = iVar.f67814x2c488eb6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GiftItemPreview", "start onClick");
        tg2.h hVar = this.f103776e.f103301h;
        if (hVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            hVar.e((android.view.ViewGroup) view, str);
        }
        r45.mb v07 = iVar.v0();
        if (v07 != null) {
            rl2.b bVar = (rl2.b) ((jz5.n) ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).D).mo141623x754a37bb();
            java.lang.String field_rewardProductId = iVar.f67814x2c488eb6;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_rewardProductId, "field_rewardProductId");
            ce2.b y07 = bVar.y0(field_rewardProductId);
            if (y07 != null) {
                java.lang.String m75945x2fec8307 = v07.m75945x2fec8307(3);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                y07.f67203x5bc050ac = m75945x2fec8307;
                y07.f67202x10a0fed7 = v07.m75939xb282bd08(0);
                y07.f67200x578ce6e1 = 1;
                y07.f67199x51deaa2b = 1;
                new m75.d(y07, null, null, "MicroMsg.SDK.BaseFinderLiveAigcGiftStatus").a(bVar.f478716d);
            }
        }
        android.view.View view2 = this.f103777f.f103663g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$inflateGiftItem$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$inflateGiftItem$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$inflateGiftItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
