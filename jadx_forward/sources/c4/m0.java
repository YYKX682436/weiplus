package c4;

/* loaded from: classes13.dex */
public class m0 implements c4.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Messenger f119854a;

    public m0(android.os.Messenger messenger) {
        this.f119854a = messenger;
    }

    public android.os.IBinder a() {
        return this.f119854a.getBinder();
    }

    public void b(java.lang.String str, java.util.List list, android.os.Bundle bundle, android.os.Bundle bundle2) {
        android.os.Bundle bundle3 = new android.os.Bundle();
        bundle3.putString("data_media_item_id", str);
        bundle3.putBundle("data_options", bundle);
        bundle3.putBundle("data_notify_children_changed_options", bundle2);
        if (list != null) {
            bundle3.putParcelableArrayList("data_media_item_list", list instanceof java.util.ArrayList ? (java.util.ArrayList) list : new java.util.ArrayList<>(list));
        }
        c(3, bundle3);
    }

    public final void c(int i17, android.os.Bundle bundle) {
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = i17;
        obtain.arg1 = 2;
        obtain.setData(bundle);
        this.f119854a.send(obtain);
    }
}
