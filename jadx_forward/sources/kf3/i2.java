package kf3;

/* loaded from: classes11.dex */
public class i2 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.a2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16489x8d6e80bc f388894d;

    public i2(com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16489x8d6e80bc activityC16489x8d6e80bc) {
        this.f388894d = activityC16489x8d6e80bc;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.a2
    public void M3(int i17, java.lang.String str) {
        if (i17 != 1 || str == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16489x8d6e80bc activityC16489x8d6e80bc = this.f388894d;
        ((java.util.LinkedList) activityC16489x8d6e80bc.E).remove(str);
        activityC16489x8d6e80bc.w7(((java.util.LinkedList) activityC16489x8d6e80bc.E).size());
        activityC16489x8d6e80bc.f287981f.notifyDataSetChanged();
    }
}
