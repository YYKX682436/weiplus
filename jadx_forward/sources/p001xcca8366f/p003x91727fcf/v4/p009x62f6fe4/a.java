package p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4;

/* loaded from: classes11.dex */
public class a extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f90454a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.ref.WeakReference f90455b;

    public a(p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.j jVar) {
        this.f90454a = new java.lang.ref.WeakReference(jVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        java.lang.ref.WeakReference weakReference = this.f90455b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        java.lang.ref.WeakReference weakReference2 = this.f90454a;
        if (weakReference2.get() == null) {
            return;
        }
        android.os.Bundle data = message.getData();
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0.a(data);
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.j jVar = (p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.j) weakReference2.get();
        android.os.Messenger messenger = (android.os.Messenger) this.f90455b.get();
        try {
            int i17 = message.what;
            if (i17 == 1) {
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0.a(data.getBundle("data_root_hints"));
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
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0.a(data.getBundle("data_options"));
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0.a(data.getBundle("data_notify_children_changed_options"));
                java.lang.String string = data.getString("data_media_item_id");
                data.getParcelableArrayList("data_media_item_list");
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.g gVar = (p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.g) jVar;
                if (gVar.f90465g != messenger) {
                    message = message;
                } else {
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(gVar.f90463e.m174751x4aabfc28(string, null));
                    message = p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.m.f90469b;
                }
            }
        } catch (android.os.BadParcelableException unused) {
            if (message.what == 1) {
                jVar.getClass();
            }
        }
    }
}
