package com.tencent.mm.feature.ecs.card.view;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B%\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tencent/mm/feature/ecs/card/view/EcsShopWindowViewNew;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lc00/k4;", "Lf00/t;", "Lbw5/ue0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class EcsShopWindowViewNew extends com.tencent.mm.mvvm.MvvmView<c00.k4> implements f00.t {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f65616f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcsShopWindowViewNew(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // f00.t
    public void a(java.lang.Object obj) {
        bw5.ue0 remoteData = (bw5.ue0) obj;
        kotlin.jvm.internal.o.g(remoteData, "remoteData");
        g(e00.l.d(remoteData));
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        int i17 = q31.r.f359919c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.mvvm.MvvmView v17 = ((bf5.a) ((q31.t) ((q31.r) c17)).Bi()).v(context);
        this.f65616f = v17;
        setBackgroundResource(com.tencent.mm.R.drawable.czy);
        return v17;
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public void e(q31.p pVar, q31.p pVar2) {
        jz5.f0 f0Var;
        c00.k4 k4Var = (c00.k4) pVar2;
        if (k4Var == null) {
            return;
        }
        g00.f fVar = (g00.f) k4Var;
        android.view.View.OnClickListener onClickListener = fVar.f267405n;
        if (onClickListener != null) {
            setOnClickListener(onClickListener);
        }
        bw5.g9 g9Var = fVar.f267398d;
        if (g9Var != null) {
            g(g9Var);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("EcsShopWindowViewNew", "onUpdateViewModel with null viewModel");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f5, code lost:
    
        if ((r1 != null ? r1.f37843o : null) != null) goto L91;
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.ecs.card.view.EcsShopWindowViewNew.g(bw5.g9):void");
    }
}
