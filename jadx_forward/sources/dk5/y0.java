package dk5;

/* loaded from: classes11.dex */
public class y0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f316532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22566x6f3df1e3 f316533e;

    public y0(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22566x6f3df1e3 activityC22566x6f3df1e3, java.util.LinkedList linkedList) {
        this.f316533e = activityC22566x6f3df1e3;
        this.f316532d = linkedList;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22566x6f3df1e3.f292483J;
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22566x6f3df1e3 activityC22566x6f3df1e3 = this.f316533e;
        activityC22566x6f3df1e3.getClass();
        java.util.LinkedList linkedList = this.f316532d;
        iz5.a.g(null, linkedList.size() > 0);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        for (int i19 = 0; i19 < linkedList.size(); i19++) {
            linkedList2.add(3);
        }
        new r35.e4(activityC22566x6f3df1e3, new dk5.z0(activityC22566x6f3df1e3)).f(linkedList, linkedList2, null);
    }
}
