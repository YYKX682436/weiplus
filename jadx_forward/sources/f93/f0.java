package f93;

/* loaded from: classes11.dex */
public final class f0 implements db5.o9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea f341866d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea activityC16165x57283aea) {
        this.f341866d = activityC16165x57283aea;
    }

    @Override // db5.o9
    public void Q0(java.lang.String str) {
        int intValue;
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea activityC16165x57283aea = this.f341866d;
        f93.y yVar = activityC16165x57283aea.A;
        if (yVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        java.util.HashMap hashMap = yVar.f342044o;
        if (hashMap.get(str) == null) {
            intValue = -1;
        } else {
            java.lang.Object obj = hashMap.get(str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            intValue = ((java.lang.Number) obj).intValue();
        }
        if (intValue != -1) {
            android.widget.ListView listView = activityC16165x57283aea.f224743z;
            if (listView != null) {
                listView.setSelection(intValue);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
                throw null;
            }
        }
    }
}
