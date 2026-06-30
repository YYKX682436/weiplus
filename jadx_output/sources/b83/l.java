package b83;

/* loaded from: classes11.dex */
public final class l extends com.tencent.mm.app.w6 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.TreeSet f18325d = new java.util.TreeSet();

    @Override // com.tencent.mm.app.w6, com.tencent.mm.app.v6
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        f18325d.add(activity.getClass().getName());
    }

    @Override // com.tencent.mm.app.w6, com.tencent.mm.app.v6
    public void onActivityDestroyed(android.app.Activity activity) {
        f18325d.remove(activity.getClass().getName());
    }
}
