package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p722x2e7b10.p723x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B%\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tencent/mm/feature/ecs/card/view/EcsShopWindowViewNew;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lc00/k4;", "Lf00/t;", "Lbw5/ue0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.ecs.card.view.EcsShopWindowViewNew */
/* loaded from: classes9.dex */
public final class C10524x8587e460 extends com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<c00.k4> implements f00.t {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f147149f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10524x8587e460(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // f00.t
    public void a(java.lang.Object obj) {
        bw5.ue0 remoteData = (bw5.ue0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remoteData, "remoteData");
        g(e00.l.d(remoteData));
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public android.view.View c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int i17 = q31.r.f441452c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 v17 = ((bf5.a) ((q31.t) ((q31.r) c17)).Bi()).v(context);
        this.f147149f = v17;
        setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.czy);
        return v17;
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public void e(q31.p pVar, q31.p pVar2) {
        jz5.f0 f0Var;
        c00.k4 k4Var = (c00.k4) pVar2;
        if (k4Var == null) {
            return;
        }
        g00.f fVar = (g00.f) k4Var;
        android.view.View.OnClickListener onClickListener = fVar.f348938n;
        if (onClickListener != null) {
            setOnClickListener(onClickListener);
        }
        bw5.g9 g9Var = fVar.f348931d;
        if (g9Var != null) {
            g(g9Var);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EcsShopWindowViewNew", "onUpdateViewModel with null viewModel");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f5, code lost:
    
        if ((r1 != null ? r1.f119376o : null) != null) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(bw5.g9 r13) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.ecs.p722x2e7b10.p723x373aa5.C10524x8587e460.g(bw5.g9):void");
    }
}
