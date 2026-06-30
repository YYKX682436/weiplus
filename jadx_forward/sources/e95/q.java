package e95;

/* loaded from: classes12.dex */
public final class q extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f331973a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(e95.r cursor) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cursor, "cursor");
        this.f331973a = new java.lang.ref.WeakReference(cursor);
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        e95.r rVar = (e95.r) this.f331973a.get();
        if (rVar != null) {
            synchronized (rVar.f331979i) {
                rVar.f331983p.dispatchChange(false);
            }
        }
    }
}
