package jz1;

/* loaded from: classes5.dex */
public class l extends android.view.View implements android.view.View.OnLayoutChangeListener, android.view.View.OnFocusChangeListener, android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public long f384232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jz1.e f384233e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(jz1.e eVar, android.content.Context context) {
        super(context);
        this.f384233e = eVar;
        addOnLayoutChangeListener(this);
        setOnFocusChangeListener(this);
        setOnScrollChangeListener(new android.view.View.OnScrollChangeListener() { // from class: jz1.l$$a
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(android.view.View view, int i17, int i18, int i19, int i27) {
                jz1.l lVar = jz1.l.this;
                lVar.getClass();
                zj0.b bVar = new zj0.b();
                bVar.c(view);
                bVar.b(i17);
                bVar.b(i18);
                bVar.b(i19);
                bVar.b(i27);
                yj0.a.b("com/tencent/mm/plugin/datareport/monitor/adapter/view/expose/ViewExposeMonitor$AssistMonitorView", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V", lVar, bVar.a());
                zj0.b bVar2 = new zj0.b();
                bVar2.c(view);
                bVar2.b(i17);
                bVar2.b(i18);
                bVar2.b(i19);
                bVar2.b(i27);
                yj0.a.b("com/tencent/mm/plugin/datareport/monitor/adapter/view/expose/ViewExposeMonitor$AssistMonitorView", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V", lVar, bVar2.a());
                lVar.a();
                yj0.a.h(lVar, "com/tencent/mm/plugin/datareport/monitor/adapter/view/expose/ViewExposeMonitor$AssistMonitorView", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V");
                yj0.a.h(lVar, "com/tencent/mm/plugin/datareport/monitor/adapter/view/expose/ViewExposeMonitor$AssistMonitorView", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V");
            }
        });
        setOnApplyWindowInsetsListener(this);
    }

    public final void a() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f384232d >= 251) {
            this.f384233e.Vi(1, 251L);
            this.f384232d = currentTimeMillis;
        }
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        a();
    }

    @Override // android.view.View
    public void layout(int i17, int i18, int i19, int i27) {
        super.layout(i17, i18, i19, i27);
        a();
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        a();
        return windowInsets;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        a();
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        a();
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        a();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        a();
    }

    @Override // android.view.View
    public void onScrollChanged(int i17, int i18, int i19, int i27) {
        super.onScrollChanged(i17, i18, i19, i27);
        a();
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z17) {
        super.onVisibilityAggregated(z17);
        a();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        a();
    }
}
