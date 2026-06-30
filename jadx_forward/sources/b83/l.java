package b83;

/* loaded from: classes11.dex */
public final class l extends com.p314xaae8f345.mm.app.w6 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.TreeSet f99858d = new java.util.TreeSet();

    @Override // com.p314xaae8f345.mm.app.w6, com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityCreated */
    public void mo9958x78cb4fa(android.app.Activity activity, android.os.Bundle bundle) {
        f99858d.add(activity.getClass().getName());
    }

    @Override // com.p314xaae8f345.mm.app.w6, com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityDestroyed */
    public void mo9959xa9f48fab(android.app.Activity activity) {
        f99858d.remove(activity.getClass().getName());
    }
}
