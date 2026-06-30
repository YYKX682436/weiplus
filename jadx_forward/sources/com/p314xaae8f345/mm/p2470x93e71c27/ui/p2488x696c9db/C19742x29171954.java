package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u001d\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016R$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\""}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/ScrollControlRecyclerView;", "Lcom/tencent/mm/pluginsdk/ui/tools/ChattingRecyclerView;", "Lcom/tencent/mm/pluginsdk/ui/tools/z3;", "", "getExtraScrollDistance", "extraScrollDistance", "Ljz5/f0;", "setExtraScrollDistance", "", "result", "setHasControlMoveDown", "getHasControlMoveDown", "Lcom/tencent/mm/pluginsdk/ui/tools/e7;", "d2", "Lcom/tencent/mm/pluginsdk/ui/tools/e7;", "getOnDrawListener", "()Lcom/tencent/mm/pluginsdk/ui/tools/e7;", "setOnDrawListener", "(Lcom/tencent/mm/pluginsdk/ui/tools/e7;)V", "onDrawListener", "", "g2", "F", "getMFirstY", "()F", "setMFirstY", "(F)V", "mFirstY", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.pluginsdk.ui.tools.ScrollControlRecyclerView */
/* loaded from: classes9.dex */
public class C19742x29171954 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19727x3bcc210a implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.z3 {

    /* renamed from: d2, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e7 onDrawListener;

    /* renamed from: e2, reason: collision with root package name */
    public int f272975e2;

    /* renamed from: f2, reason: collision with root package name */
    public boolean f272976f2;

    /* renamed from: g2, reason: collision with root package name and from kotlin metadata */
    public float mFirstY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19742x29171954(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4
    public void M0(int i17, int i18) {
        if (i18 < 0) {
            this.f272976f2 = true;
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.z3
    /* renamed from: getExtraScrollDistance, reason: from getter */
    public int getF272975e2() {
        return this.f272975e2;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.z3
    /* renamed from: getHasControlMoveDown, reason: from getter */
    public boolean getF272976f2() {
        return this.f272976f2;
    }

    public final float getMFirstY() {
        return this.mFirstY;
    }

    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e7 getOnDrawListener() {
        return this.onDrawListener;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.View
    public void onDraw(android.graphics.Canvas c17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e7 e7Var = this.onDrawListener;
        if (e7Var != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.j0) e7Var).f284506a;
            if (c21897x17252689.f284382y1 > 0.0f) {
                android.graphics.Rect rect = c21897x17252689.f284378p1;
                if (!rect.isEmpty()) {
                    android.graphics.Rect rect2 = new android.graphics.Rect();
                    c21897x17252689.T.m75889x2a122481(rect2);
                    android.graphics.Rect rect3 = new android.graphics.Rect(rect2);
                    rect3.top = rect.top;
                    rect3.bottom = rect.bottom;
                    c17.drawRect(rect3, c21897x17252689.f284380x1);
                }
            }
            android.graphics.Rect rect4 = c21897x17252689.W;
            if (!rect4.isEmpty()) {
                android.graphics.Rect rect5 = new android.graphics.Rect();
                c21897x17252689.T.m75889x2a122481(rect5);
                android.graphics.Rect rect6 = new android.graphics.Rect(rect5);
                android.graphics.Rect rect7 = new android.graphics.Rect(rect5);
                if (c21897x17252689.f284381y0) {
                    boolean z17 = c21897x17252689.f284379x0;
                    android.content.Context context = c21897x17252689.f279077y;
                    if (z17) {
                        rect6.top = rect4.top + i65.a.b(context, 35);
                    } else {
                        rect6.top = rect4.top;
                    }
                    rect6.bottom = rect4.bottom + i65.a.b(context, 1);
                    c17.drawRect(rect6, c21897x17252689.f284377p0);
                } else {
                    rect6.bottom = rect4.top;
                    rect7.top = rect4.bottom;
                    c17.drawRect(rect6, c21897x17252689.f284377p0);
                    c17.drawRect(rect7, c21897x17252689.f284377p0);
                }
            }
        }
        super.onDraw(c17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        int action = ev6.getAction();
        if (action == 0) {
            this.mFirstY = ev6.getY();
        } else if (action == 2 && ev6.getY() - this.mFirstY > 0.0f) {
            this.f272976f2 = true;
        }
        return super.onTouchEvent(ev6);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.z3
    /* renamed from: setExtraScrollDistance */
    public void mo75813x1fdf5a50(int i17) {
        this.f272975e2 = i17;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.z3
    /* renamed from: setHasControlMoveDown */
    public void mo75814x9b3ae298(boolean z17) {
        this.f272976f2 = z17;
    }

    /* renamed from: setMFirstY */
    public final void m75819xb4b633b4(float f17) {
        this.mFirstY = f17;
    }

    /* renamed from: setOnDrawListener */
    public final void m75820x4ac79299(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e7 e7Var) {
        this.onDrawListener = e7Var;
    }
}
