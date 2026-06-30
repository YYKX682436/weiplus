package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\u001b\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eB#\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\u001d\u0010!R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderTouchLayout;", "Landroid/widget/FrameLayout;", "", "d", "F", "getLastX", "()F", "setLastX", "(F)V", "lastX", "", "e", "Z", "isInterceptDown", "()Z", "setInterceptDown", "(Z)V", "Lcom/tencent/mm/plugin/finder/view/sm;", "f", "Lcom/tencent/mm/plugin/finder/view/sm;", "getTouchListener", "()Lcom/tencent/mm/plugin/finder/view/sm;", "setTouchListener", "(Lcom/tencent/mm/plugin/finder/view/sm;)V", "touchListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderTouchLayout */
/* loaded from: classes10.dex */
public final class C15355xac041723 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public float lastX;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isInterceptDown;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.sm touchListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15355xac041723(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        boolean z17 = false;
        if (event.getAction() == 0) {
            this.lastX = event.getRawX();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.l1 l1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.l1) m62430x3b96155d();
            l1Var.getClass();
            float rawX = event.getRawX();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13941x58ed078d activityC13941x58ed078d = l1Var.f191786b;
            if (rawX <= activityC13941x58ed078d.f190755v && event.getRawY() > activityC13941x58ed078d.f190756w) {
                z17 = true;
            }
            this.isInterceptDown = z17;
            if (z17) {
                return true;
            }
            return super.dispatchTouchEvent(event);
        }
        if (event.getAction() == 3 || event.getAction() == 1) {
            if (this.isInterceptDown) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.l1 l1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.l1) m62430x3b96155d();
                l1Var2.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13941x58ed078d activityC13941x58ed078d2 = l1Var2.f191786b;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13941x58ed078d2.f190753t, "translationY " + activityC13941x58ed078d2.c7().getTranslationY() + ", height:" + activityC13941x58ed078d2.c7().getHeight());
                if (activityC13941x58ed078d2.c7().getTranslationY() > activityC13941x58ed078d2.f190757x * activityC13941x58ed078d2.c7().getHeight()) {
                    activityC13941x58ed078d2.d7().u();
                } else {
                    activityC13941x58ed078d2.c7().clearAnimation();
                    activityC13941x58ed078d2.c7().animate().cancel();
                    activityC13941x58ed078d2.c7().animate().setInterpolator(new android.view.animation.DecelerateInterpolator(1.5f)).translationY(0.0f).setDuration(activityC13941x58ed078d2.f190754u).start();
                }
                this.isInterceptDown = false;
                return true;
            }
        } else if (this.isInterceptDown) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.sm m62430x3b96155d = m62430x3b96155d();
            float rawX2 = event.getRawX() - this.lastX;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.l1 l1Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.l1) m62430x3b96155d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13941x58ed078d activityC13941x58ed078d3 = l1Var3.f191786b;
            activityC13941x58ed078d3.c7().setTranslationY(l1Var3.f191785a * rawX2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13941x58ed078d3.f190753t, "distanceX " + rawX2 + ", translationY " + activityC13941x58ed078d3.c7().getTranslationY());
        }
        return super.dispatchTouchEvent(event);
    }

    public final float getLastX() {
        return this.lastX;
    }

    /* renamed from: getTouchListener */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.sm m62430x3b96155d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.sm smVar = this.touchListener;
        if (smVar != null) {
            return smVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("touchListener");
        throw null;
    }

    /* renamed from: setInterceptDown */
    public final void m62431x21e8ab42(boolean z17) {
        this.isInterceptDown = z17;
    }

    /* renamed from: setLastX */
    public final void m62432x534b8140(float f17) {
        this.lastX = f17;
    }

    /* renamed from: setTouchListener */
    public final void m62433xce6c7bd1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.sm smVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(smVar, "<set-?>");
        this.touchListener = smVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15355xac041723(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
