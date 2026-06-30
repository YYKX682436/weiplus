package y33;

/* loaded from: classes15.dex */
public final class f extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f540709e = {l75.n0.m145250x3fdc6f77(y33.e.W, "GameChatRoomContact")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f540710d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l75.k0 storage) {
        super(storage, y33.e.W, "GameChatRoomContact", dm.i5.f319104z);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storage, "storage");
        this.f540710d = storage;
    }

    public final u33.h y0(java.lang.String userName) {
        y33.e eVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        android.database.Cursor f17 = this.f540710d.f("SELECT * FROM GameChatRoomContact WHERE userName = " + d95.b0.O(userName), null, 2);
        boolean z17 = false;
        if (f17 != null) {
            try {
                if (f17.moveToFirst()) {
                    z17 = true;
                }
            } finally {
            }
        }
        if (z17) {
            eVar = new y33.e();
            eVar.mo9015xbf5d97fd(f17);
        } else {
            eVar = null;
        }
        vz5.b.a(f17, null);
        return eVar;
    }

    public final boolean z0(y33.e contact) {
        int p17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        if (contact.f66967xdde069b == null) {
            return false;
        }
        contact.f66966xa783a79b = c01.id.c();
        java.lang.String str = contact.f66967xdde069b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getUserName(...)");
        u33.h y07 = y0(str);
        l75.k0 k0Var = this.f540710d;
        if (y07 == null) {
            p17 = (int) k0Var.l("GameChatRoomContact", "userName", contact.mo9763xeb27878e());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("insertContact[");
            sb6.append(p17);
            sb6.append("] ");
            sb6.append("userName: " + contact.f66967xdde069b + "; roomName: " + contact.f66963x136b93ab);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GameChatRoomContactStorage", sb6.toString());
            if (p17 > 0) {
                mo142179xf35bbb4("single", 2, contact.f66967xdde069b);
            }
        } else {
            android.content.ContentValues mo9763xeb27878e = contact.mo9763xeb27878e();
            java.lang.String str2 = contact.f66967xdde069b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getUserName(...)");
            p17 = k0Var.p("GameChatRoomContact", mo9763xeb27878e, "userName=?", new java.lang.String[]{str2});
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("updateContact[");
            sb7.append(p17);
            sb7.append("] ");
            sb7.append("userName: " + contact.f66967xdde069b + "; roomName: " + contact.f66963x136b93ab);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GameChatRoomContactStorage", sb7.toString());
            if (p17 > 0) {
                mo142179xf35bbb4("single", 3, contact.f66967xdde069b);
            }
        }
        return p17 > 0;
    }
}
