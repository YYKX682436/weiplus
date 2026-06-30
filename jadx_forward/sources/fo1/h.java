package fo1;

/* loaded from: classes.dex */
public final class h implements c01.o8 {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f346408b = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f346409a = new java.util.HashMap();

    public h() {
        android.database.Cursor B = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f276604d.B("select username from rcontact", null);
        try {
            int columnIndex = B.getColumnIndex(dm.i4.f66875xa013b0d5);
            while (B.moveToNext()) {
                java.util.HashMap hashMap = this.f346409a;
                java.lang.String string = B.getString(columnIndex);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                hashMap.put(string, fo1.g.f346407d);
            }
            vz5.b.a(B, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GetContactHelper", "init size of contactHasGotten is " + this.f346409a.size());
        } finally {
        }
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GetContactHelper", "getContactCallBack return a empty username");
            return;
        }
        java.util.HashMap hashMap = f346408b;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("GetContactHelper", "getContactCallBack failed.");
            java.lang.Integer num = (java.lang.Integer) hashMap.get(str);
            if (num == null) {
                num = 0;
            }
            hashMap.put(str, java.lang.Integer.valueOf(num.intValue() + 1));
            return;
        }
        java.util.HashMap hashMap2 = this.f346409a;
        yz5.a aVar = (yz5.a) hashMap2.get(str);
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        hashMap2.put(str, fo1.g.f346407d);
        hashMap.remove(str);
    }

    public final void b(java.lang.String username, yz5.a cb6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cb6, "cb");
        java.util.HashMap hashMap = this.f346409a;
        yz5.a aVar = (yz5.a) hashMap.get(username);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar, fo1.g.f346407d)) {
            cb6.mo152xb9724478();
            return;
        }
        if (aVar == null) {
            java.lang.Integer num = (java.lang.Integer) f346408b.get(username);
            if (num == null) {
                num = 0;
            }
            if (num.intValue() < 3) {
                hashMap.put(username, cb6);
                ((c01.k7) ((j11.q) ((ct.z2) i95.n0.c(ct.z2.class))).wi()).b(username, 16, this);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("GetContactHelper", "Skip getContact of " + username + ", because 3 attempts to get contact failed.");
            }
        }
    }

    public final boolean c(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f346409a.get(username), fo1.g.f346407d);
    }
}
