package e33;

/* loaded from: classes3.dex */
public class u3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 f329022d;

    public u3(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561) {
        this.f329022d = activityC15656x6f26b561;
    }

    @Override // java.lang.Runnable
    public void run() {
        int dimension = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561 = this.f329022d;
        activityC15656x6f26b561.f220114f.getLayoutParams().height = (dimension * 2) + (activityC15656x6f26b561.getResources().getDisplayMetrics().widthPixels / 7);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = activityC15656x6f26b561.f220114f;
        int intValue = activityC15656x6f26b561.f220126o.intValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$16", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        c1163xf1deaba4.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$16", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
