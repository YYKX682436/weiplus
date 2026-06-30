package mf3;

/* loaded from: classes14.dex */
public final class b extends android.widget.EdgeEffect {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f407634a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mf3.c f407635b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 f407636c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i17, mf3.c cVar, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4, android.content.Context context) {
        super(context);
        this.f407634a = i17;
        this.f407635b = cVar;
        this.f407636c = c22949xf1deaba4;
    }

    public final void a(float f17) {
        mf3.c cVar = this.f407635b;
        cVar.getClass();
        int i17 = this.f407634a == 0 ? 1 : -1;
        ((mf3.v) cVar).getClass();
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 recyclerView = this.f407636c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        float width = recyclerView.getWidth() * f17 * 0.3f * i17;
        int childCount = recyclerView.getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 J2 = recyclerView.J(recyclerView.getChildAt(i18));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(J2, "null cannot be cast to non-null type com.tencent.mm.plugin.media.adapter.MediaBaseViewHolder");
            mf3.r rVar = (mf3.r) J2;
            android.view.View view = rVar.A;
            if (view.isShown()) {
                u3.u uVar = rVar.D;
                if (uVar != null) {
                    uVar.b();
                }
                view.setTranslationX(view.getTranslationX() + width);
            }
        }
    }

    @Override // android.widget.EdgeEffect
    public boolean draw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        setSize(0, 0);
        return super.draw(canvas);
    }

    @Override // android.widget.EdgeEffect
    public void onAbsorb(int i17) {
        super.onAbsorb(i17);
        mf3.c cVar = this.f407635b;
        cVar.getClass();
        int i18 = this.f407634a == 0 ? 1 : -1;
        cVar.getClass();
        float f17 = i17 * 0.3f * i18;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f407636c;
        int childCount = c22949xf1deaba4.getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 J2 = c22949xf1deaba4.J(c22949xf1deaba4.getChildAt(i19));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(J2, "null cannot be cast to non-null type T of com.tencent.mm.plugin.media.adapter.BaseEdgeEffectFactory");
            u3.u uVar = ((mf3.r) ((mf3.a) J2)).D;
            if (uVar != null) {
                uVar.f505758a = f17;
                uVar.e();
            }
        }
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f17, float f18) {
        super.onPull(f17, f18);
        a(f17);
    }

    @Override // android.widget.EdgeEffect
    public void onRelease() {
        u3.u uVar;
        super.onRelease();
        finish();
        if (isFinished()) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f407636c;
            int childCount = c22949xf1deaba4.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 J2 = c22949xf1deaba4.J(c22949xf1deaba4.getChildAt(i17));
                mf3.a aVar = J2 instanceof mf3.a ? (mf3.a) J2 : null;
                if (aVar != null && (uVar = ((mf3.r) aVar).D) != null) {
                    uVar.e();
                }
            }
        }
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f17) {
        super.onPull(f17);
        a(f17);
    }
}
