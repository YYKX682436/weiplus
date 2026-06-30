package nn1;

/* loaded from: classes12.dex */
public class i implements ln1.m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de f420198d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de activityC12832x56c88de) {
        this.f420198d = activityC12832x56c88de;
    }

    @Override // ln1.m
    public void X0(java.util.LinkedList linkedList, kn1.i iVar, int i17) {
        this.f420198d.f174041e.notifyDataSetChanged();
    }

    @Override // ln1.m
    public void e1(java.util.LinkedList linkedList) {
    }

    @Override // ln1.l
    public void s2(java.util.LinkedList linkedList) {
        if (linkedList == null) {
            return;
        }
        this.f420198d.runOnUiThread(new nn1.h(this, linkedList));
    }
}
