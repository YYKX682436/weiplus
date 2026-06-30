package f93;

/* loaded from: classes10.dex */
public class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d f342026d;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d viewOnCreateContextMenuListenerC16169x37a19e8d) {
        this.f342026d = viewOnCreateContextMenuListenerC16169x37a19e8d;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d viewOnCreateContextMenuListenerC16169x37a19e8d = this.f342026d;
        java.util.HashSet hashSet = viewOnCreateContextMenuListenerC16169x37a19e8d.G;
        if (hashSet != null && hashSet.size() > 0) {
            arrayList.addAll(viewOnCreateContextMenuListenerC16169x37a19e8d.G);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new f93.v1(this, new java.util.HashSet(k93.j.y(arrayList, -1).f387461b)));
    }
}
