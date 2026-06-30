package android.support.v4.media;

/* loaded from: classes11.dex */
public class a extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f8921a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.ref.WeakReference f8922b;

    public a(android.support.v4.media.j jVar) {
        this.f8921a = new java.lang.ref.WeakReference(jVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        java.lang.ref.WeakReference weakReference = this.f8922b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        java.lang.ref.WeakReference weakReference2 = this.f8921a;
        if (weakReference2.get() == null) {
            return;
        }
        android.os.Bundle data = message.getData();
        android.support.v4.media.session.f0.a(data);
        android.support.v4.media.j jVar = (android.support.v4.media.j) weakReference2.get();
        android.os.Messenger messenger = (android.os.Messenger) this.f8922b.get();
        try {
            int i17 = message.what;
            if (i17 == 1) {
                android.support.v4.media.session.f0.a(data.getBundle("data_root_hints"));
                data.getString("data_media_item_id");
                jVar.getClass();
                message = message;
            } else if (i17 == 2) {
                jVar.getClass();
                message = message;
            } else if (i17 != 3) {
                message.toString();
                message = message;
            } else {
                android.support.v4.media.session.f0.a(data.getBundle("data_options"));
                android.support.v4.media.session.f0.a(data.getBundle("data_notify_children_changed_options"));
                java.lang.String string = data.getString("data_media_item_id");
                data.getParcelableArrayList("data_media_item_list");
                android.support.v4.media.g gVar = (android.support.v4.media.g) jVar;
                if (gVar.f8932g != messenger) {
                    message = message;
                } else {
                    android.support.v4.media.f.a(gVar.f8930e.getOrDefault(string, null));
                    message = android.support.v4.media.m.f8936b;
                }
            }
        } catch (android.os.BadParcelableException unused) {
            if (message.what == 1) {
                jVar.getClass();
            }
        }
    }
}
