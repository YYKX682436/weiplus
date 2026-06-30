package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001!B\u001d\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0016R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\""}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/ScrollControlListView;", "Lcom/tencent/mm/pluginsdk/ui/tools/ChattingListView;", "Lcom/tencent/mm/pluginsdk/ui/tools/z3;", "", "getHasControlMoveDown", "result", "Ljz5/f0;", "setHasControlMoveDown", "", "getExtraScrollDistance", "extraScrollDistance", "setExtraScrollDistance", "", "f", "F", "getMFirstY", "()F", "setMFirstY", "(F)V", "mFirstY", "g", "I", "getLastFirstVisiblePos", "()I", "setLastFirstVisiblePos", "(I)V", "lastFirstVisiblePos", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com/tencent/mm/pluginsdk/ui/tools/d7", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.pluginsdk.ui.tools.ScrollControlListView */
/* loaded from: classes9.dex */
public class C19741x32830a33 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19726xb42c5ce9 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.z3 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f272969i = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f272970e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public float mFirstY;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int lastFirstVisiblePos;

    /* renamed from: h, reason: collision with root package name */
    public int f272973h;

    static {
        new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d7(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19741x32830a33(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19726xb42c5ce9, android.widget.ListView
    public void addFooterView(android.view.View view, java.lang.Object obj, boolean z17) {
        super.addFooterView(view, obj, z17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19726xb42c5ce9, android.widget.ListView
    public void addHeaderView(android.view.View view, java.lang.Object obj, boolean z17) {
        super.addHeaderView(view, obj, z17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.z3
    /* renamed from: getExtraScrollDistance, reason: from getter */
    public int getF272973h() {
        return this.f272973h;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.z3
    /* renamed from: getHasControlMoveDown, reason: from getter */
    public boolean getF272970e() {
        return this.f272970e;
    }

    public final int getLastFirstVisiblePos() {
        return this.lastFirstVisiblePos;
    }

    public final float getMFirstY() {
        return this.mFirstY;
    }

    @Override // android.view.View
    public void onScrollChanged(int i17, int i18, int i19, int i27) {
        super.onScrollChanged(i17, i18, i19, i27);
        if (this.lastFirstVisiblePos > getFirstVisiblePosition()) {
            this.f272970e = true;
        }
        this.lastFirstVisiblePos = getFirstVisiblePosition();
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        int action = ev6.getAction();
        if (action == 0) {
            this.mFirstY = ev6.getY();
        } else if (action == 2 && ev6.getY() - this.mFirstY > 0.0f) {
            this.f272970e = true;
        }
        return super.onTouchEvent(ev6);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.z3
    /* renamed from: setExtraScrollDistance */
    public void mo75813x1fdf5a50(int i17) {
        this.f272973h = i17;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.z3
    /* renamed from: setHasControlMoveDown */
    public void mo75814x9b3ae298(boolean z17) {
        this.f272970e = z17;
    }

    /* renamed from: setLastFirstVisiblePos */
    public final void m75815x9b70b21a(int i17) {
        this.lastFirstVisiblePos = i17;
    }

    /* renamed from: setMFirstY */
    public final void m75816xb4b633b4(float f17) {
        this.mFirstY = f17;
    }
}
