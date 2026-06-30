package te2;

/* loaded from: classes3.dex */
public final class s8 extends te2.p8 {
    public boolean J1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // te2.p8
    public java.lang.String q7() {
        java.lang.String string = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    public final void y7() {
        if (this.E1 == 1) {
            this.E1 = 3;
            te2.p8.s7(this, false, 1, null);
            return;
        }
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.umn);
        if (mo144222x4ff8c0f0 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo144222x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeWithPreviewUIC", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeWithPreviewUIC", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
