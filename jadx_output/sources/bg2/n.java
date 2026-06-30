package bg2;

/* loaded from: classes3.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.r f20318d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(bg2.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20318d = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.n(this.f20318d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bg2.n nVar = (bg2.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        nVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        bg2.r rVar = this.f20318d;
        android.view.ViewGroup viewGroup = rVar.f20434g;
        if (viewGroup != null) {
            if (!(viewGroup.getWidth() > 0)) {
                viewGroup = null;
            }
            if (viewGroup != null) {
                int[] iArr = {0, 0};
                viewGroup.getLocationOnScreen(iArr);
                int width = iArr[0] + ((int) ((viewGroup.getWidth() * viewGroup.getScaleX()) / 2));
                int i17 = no0.i.f338727a;
                int i18 = width - (no0.i.f338727a / 2);
                int b17 = iArr[1] - i65.a.b(viewGroup.getContext(), 40);
                com.tencent.mars.xlog.Log.i("LiveConvertCheerUIController", "like pos, x: " + i18 + ", y: " + b17 + ", locX: " + iArr[0] + ", locY: " + iArr[1]);
                com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView finderLiveConfettiView = rVar.f20437m;
                if (finderLiveConfettiView != null) {
                    finderLiveConfettiView.f117593m = false;
                }
                if (finderLiveConfettiView != null) {
                    finderLiveConfettiView.setInterval(200L);
                }
                com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView finderLiveConfettiView2 = rVar.f20437m;
                if (finderLiveConfettiView2 != null) {
                    finderLiveConfettiView2.f117596p = i18;
                    finderLiveConfettiView2.f117597q = b17;
                }
                if (finderLiveConfettiView2 != null) {
                    finderLiveConfettiView2.setIconAlpha(0.5f);
                }
                com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView finderLiveConfettiView3 = rVar.f20437m;
                if (finderLiveConfettiView3 != null) {
                    finderLiveConfettiView3.d();
                }
            }
        }
        rVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f481924br3));
        arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f481925br4));
        arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f481926br5));
        arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.br6));
        arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.br7));
        arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.br8));
        com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView finderLiveConfettiView4 = rVar.f20437m;
        if (finderLiveConfettiView4 != null) {
            finderLiveConfettiView4.c(arrayList);
        }
        return jz5.f0.f302826a;
    }
}
