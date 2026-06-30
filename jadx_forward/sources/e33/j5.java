package e33;

/* loaded from: classes10.dex */
public class j5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f328829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15658x91352037 f328830e;

    public j5(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15658x91352037 activityC15658x91352037, java.util.LinkedList linkedList) {
        this.f328830e = activityC15658x91352037;
        this.f328829d = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15658x91352037 activityC15658x91352037 = this.f328830e;
        activityC15658x91352037.f220149d.addAll(this.f328829d);
        activityC15658x91352037.f220150e.m8146xced61ae5();
    }
}
