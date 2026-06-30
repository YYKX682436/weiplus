package r3;

/* loaded from: classes13.dex */
public class a extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r3.c f450456a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r3.c cVar) {
        super(new android.os.Handler());
        this.f450456a = cVar;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        android.database.Cursor cursor;
        r3.c cVar = this.f450456a;
        if (!cVar.f450459e || (cursor = cVar.f450460f) == null || cursor.isClosed()) {
            return;
        }
        cVar.f450458d = cVar.f450460f.requery();
    }
}
