package wa2;

/* loaded from: classes3.dex */
public final class h0 implements ym5.l1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wa2.n0 f525658d;

    public h0(wa2.n0 n0Var) {
        this.f525658d = n0Var;
    }

    @Override // ym5.l1
    public boolean a(int i17, int i18, int i19, boolean z17, boolean z18) {
        h81.a aVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onOverStart: dy=");
        sb6.append(i18);
        sb6.append(", isInterceptTouchEvent=");
        wa2.n0 n0Var = this.f525658d;
        sb6.append(n0Var.f525693o);
        sb6.append(", disabled=");
        sb6.append(n0Var.m173378x8c0077f2());
        sb6.append(", isEnableDragExit=");
        sb6.append(((java.lang.Boolean) ((jz5.n) n0Var.f525689h).mo141623x754a37bb()).booleanValue());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GestureFrameLayout", sb6.toString());
        if (n0Var.m173378x8c0077f2()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GestureFrameLayout", "onOverStart: disabled=true, return");
            return false;
        }
        if (i18 >= 0 || n0Var.f525693o != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GestureFrameLayout", "onOverStart: 条件不满足, dy >= 0 或 isInterceptTouchEvent != 0");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GestureFrameLayout", "onOverStart: dy < 0 且 isInterceptTouchEvent=0, 准备进入拖拽模式, isInterceptTouchEvent → 1");
            n0Var.f525693o = 1;
            try {
                android.content.Context context = n0Var.m173377xc2a54588().getContext();
                jz5.f0 f0Var = null;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context : null;
                if (activityC0065xcd7aa112 != null && (aVar = (h81.a) pf5.z.f435481a.a(activityC0065xcd7aa112).d(h81.a.class)) != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647) aVar).R6();
                    f0Var = jz5.f0.f384359a;
                }
                if (f0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("GestureFrameLayout", "onOverStart: contentView.context is not AppCompatActivity, context=".concat(n0Var.m173377xc2a54588().getContext().getClass().getSimpleName()));
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GestureFrameLayout", "onOverStart: UICProvider.of failed, context=" + n0Var.m173377xc2a54588().getContext().getClass().getSimpleName() + ", error=" + e17.getMessage(), e17);
            }
        }
        return false;
    }

    @Override // ym5.l1
    public void g(int i17) {
    }

    @Override // ym5.l1
    public boolean j(int i17, int i18, int i19, boolean z17, boolean z18) {
        return false;
    }
}
