package hr3;

/* loaded from: classes11.dex */
public class o9 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.u9 f365388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a f365389e;

    public o9(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a viewOnClickListenerC16860xc669c20a, hr3.u9 u9Var) {
        this.f365389e = viewOnClickListenerC16860xc669c20a;
        this.f365388d = u9Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        int i17;
        hr3.u9 u9Var = this.f365388d;
        u9Var.B.getViewTreeObserver().removeOnPreDrawListener(this);
        int[] iArr = new int[2];
        u9Var.B.getLocationOnScreen(iArr);
        int i18 = iArr[1];
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a viewOnClickListenerC16860xc669c20a = this.f365389e;
        int h17 = com.p314xaae8f345.mm.ui.bl.h(viewOnClickListenerC16860xc669c20a.f279303d);
        int f17 = i65.a.f(viewOnClickListenerC16860xc669c20a.f279303d, com.p314xaae8f345.mm.R.C30860x5b28f31.a8h);
        android.content.Context context = viewOnClickListenerC16860xc669c20a.f279303d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        wm3.l lVar = (wm3.l) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(wm3.l.class);
        if (lVar != null ? lVar.f528814d : false) {
            f17 = i65.a.f(viewOnClickListenerC16860xc669c20a.f279303d, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        } else if (viewOnClickListenerC16860xc669c20a.V) {
            f17 = i65.a.f(viewOnClickListenerC16860xc669c20a.f279303d, com.p314xaae8f345.mm.R.C30860x5b28f31.a8f);
        } else if (h17 > 0 && (i17 = viewOnClickListenerC16860xc669c20a.X) > 0) {
            f17 = i65.a.f(viewOnClickListenerC16860xc669c20a.f279303d, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) + i17;
        }
        if ((i18 == 0 && !viewOnClickListenerC16860xc669c20a.V) || (viewOnClickListenerC16860xc669c20a.Y && viewOnClickListenerC16860xc669c20a.W)) {
            f17 += h17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NormalProfileHeaderPreference", "actionBarHeight=%s ,statusBarHeight=%s , rootTop:%s, paddingTopToSet:%s,curPaddingTop:%s", java.lang.Integer.valueOf(viewOnClickListenerC16860xc669c20a.X), java.lang.Integer.valueOf(h17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(f17), java.lang.Integer.valueOf(u9Var.B.getPaddingTop()));
        if (f17 == u9Var.B.getPaddingTop()) {
            return true;
        }
        android.view.View view = u9Var.B;
        view.setPadding(view.getPaddingLeft(), f17, u9Var.B.getPaddingRight(), u9Var.B.getPaddingBottom());
        return false;
    }
}
