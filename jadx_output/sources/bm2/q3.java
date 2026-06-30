package bm2;

/* loaded from: classes3.dex */
public final class q3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ce2.i f22242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.a4 f22243e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.n3 f22244f;

    public q3(ce2.i iVar, bm2.a4 a4Var, bm2.n3 n3Var) {
        this.f22242d = iVar;
        this.f22243e = a4Var;
        this.f22244f = n3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$inflateGiftItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ce2.i iVar = this.f22242d;
        java.lang.String str = iVar.field_rewardProductId;
        com.tencent.mars.xlog.Log.i("GiftItemPreview", "start onClick");
        tg2.h hVar = this.f22243e.f21768h;
        if (hVar != null) {
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            kotlin.jvm.internal.o.d(str);
            hVar.e((android.view.ViewGroup) view, str);
        }
        r45.mb v07 = iVar.v0();
        if (v07 != null) {
            rl2.b bVar = (rl2.b) ((jz5.n) ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).D).getValue();
            java.lang.String field_rewardProductId = iVar.field_rewardProductId;
            kotlin.jvm.internal.o.f(field_rewardProductId, "field_rewardProductId");
            ce2.b y07 = bVar.y0(field_rewardProductId);
            if (y07 != null) {
                java.lang.String string = v07.getString(3);
                if (string == null) {
                    string = "";
                }
                y07.field_submissionId = string;
                y07.field_status = v07.getInteger(0);
                y07.field_notificationShown = 1;
                y07.field_badgeDismissed = 1;
                new m75.d(y07, null, null, "MicroMsg.SDK.BaseFinderLiveAigcGiftStatus").a(bVar.f397183d);
            }
        }
        android.view.View view2 = this.f22244f.f22130g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$inflateGiftItem$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$inflateGiftItem$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$inflateGiftItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
