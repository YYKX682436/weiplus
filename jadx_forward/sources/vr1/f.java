package vr1;

/* loaded from: classes3.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr1.o f521095d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(vr1.o oVar) {
        super(0);
        this.f521095d = oVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        vr1.o oVar = this.f521095d;
        android.view.View mo7935xa188593e = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) ((jz5.n) oVar.f521122n).mo141623x754a37bb()).mo7935xa188593e(0);
        int[] iArr = new int[2];
        if (mo7935xa188593e != null) {
            mo7935xa188593e.getLocationInWindow(iArr);
        }
        if (((java.lang.Number) ((jz5.n) oVar.f521120i).mo141623x754a37bb()).intValue() - iArr[1] > i65.a.b(oVar.m80379x76847179(), 10) + 2) {
            android.view.View view = oVar.f521118g;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadRvUIC$bindScroll$2$onScrolled$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadRvUIC$bindScroll$2$onScrolled$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View view2 = oVar.f521118g;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadRvUIC$bindScroll$2$onScrolled$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadRvUIC$bindScroll$2$onScrolled$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f384359a;
    }
}
