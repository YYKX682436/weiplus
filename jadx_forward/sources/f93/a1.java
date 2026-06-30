package f93;

/* loaded from: classes11.dex */
public final class a1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16167x7777ff84 f341820d;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16167x7777ff84 activityC16167x7777ff84) {
        this.f341820d = activityC16167x7777ff84;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16167x7777ff84 activityC16167x7777ff84 = this.f341820d;
        activityC16167x7777ff84.setResult(0);
        super/*com.tencent.mm.ui.vas.VASActivity*/.finish();
        return true;
    }
}
