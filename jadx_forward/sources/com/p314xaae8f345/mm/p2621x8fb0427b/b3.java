package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public class b3 extends l75.n0 implements c01.b8 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f275301e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p2621x8fb0427b.a3.f275275e2, "chatroom")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f275302f = {"CREATE INDEX IF NOT EXISTS serverChatRoomUserIndex ON chatroom ( chatroomname )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f275303d;

    public b3(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p2621x8fb0427b.a3.f275275e2, "chatroom", f275302f);
        this.f275303d = k0Var;
    }

    public java.lang.String D0(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var;
        iz5.a.g(null, str.length() > 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select memberlist from chatroom where chatroomname='");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        sb6.append(str);
        sb6.append("'");
        android.database.Cursor f17 = this.f275303d.f(sb6.toString(), null, 2);
        if (f17.moveToFirst()) {
            a3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.a3();
            a3Var.mo9015xbf5d97fd(f17);
        } else {
            a3Var = null;
        }
        f17.close();
        if (a3Var == null) {
            return null;
        }
        return a3Var.f69099x6941929d;
    }

    public int J0(java.lang.String str) {
        l75.k0 k0Var = this.f275303d;
        if (android.text.TextUtils.isEmpty(str)) {
            return 0;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select memberCount from chatroom where chatroomname='");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
            sb6.append(str);
            sb6.append("'");
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = null;
            android.database.Cursor f17 = k0Var.f(sb6.toString(), null, 2);
            if (f17.moveToFirst()) {
                a3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.a3();
                a3Var.mo9015xbf5d97fd(f17);
            }
            f17.close();
            if (a3Var == null) {
                return 0;
            }
            if (a3Var.f69098xbcb1bed0 < 0) {
                java.lang.String D0 = D0(str);
                int length = (D0 != null ? D0.split(";") : new java.lang.String[0]).length;
                a3Var.f69098xbcb1bed0 = length;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("update chatroom set memberCount = ");
                sb7.append(length);
                sb7.append(" where chatroomname = '");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
                sb7.append(str);
                sb7.append("'");
                k0Var.A("chatroom", sb7.toString());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomStorage", "[getMemberCount] init field_memberCount! username:%s count:%s", str, java.lang.Integer.valueOf(length));
            }
            return a3Var.f69098xbcb1bed0;
        } finally {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomStorage", "[getMemberCount] cost:%sms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public java.util.List L0(java.lang.String str) {
        java.lang.String D0 = D0(str);
        if (D0 == null) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (!D0.equals("")) {
            for (java.lang.String str2 : D0.split(";")) {
                linkedList.add(str2);
            }
        }
        return linkedList;
    }

    public java.util.List P0(int i17) {
        p75.n0 n0Var = dm.x1.N;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        linkedList.add(dm.x1.Q);
        p75.m c17 = dm.x1.S.j(c01.z1.r()).c(dm.x1.U.x(java.lang.Integer.valueOf(i17)));
        p75.i0 g17 = dm.x1.N.g(linkedList);
        g17.f434190d = c17;
        g17.d(linkedList2);
        g17.b(linkedList3);
        java.util.List k17 = g17.a().k(this.f275303d, dm.x1.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) k17).iterator();
        while (it.hasNext()) {
            arrayList.add(((dm.x1) it.next()).f69088x37548063);
        }
        return arrayList;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 W0(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.a3();
        a3Var.f69088x37548063 = str;
        super.get(a3Var, "chatroomname");
        return a3Var;
    }

    @Override // l75.n0
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public boolean mo55864x413cb2b4(com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var, boolean z17) {
        if (a3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatroomStorage", "replace error(item == null)");
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a3Var.f69088x37548063)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatroomStorage", "replace error,item.field_chatroomname is null");
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select rowid,chatroomname from chatroom where chatroomname='");
        java.lang.String str = a3Var.f69088x37548063;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        sb6.append(str);
        sb6.append("'");
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var2 = null;
        android.database.Cursor f17 = this.f275303d.f(sb6.toString(), null, 2);
        if (f17.moveToFirst()) {
            a3Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.a3();
            a3Var2.mo9015xbf5d97fd(f17);
        }
        f17.close();
        if (a3Var2 == null) {
            return mo51731x24249762(a3Var, z17);
        }
        long j17 = a3Var2.f72763xa3c65b86;
        a3Var.f72763xa3c65b86 = j17;
        return m145258xce0038c9(j17, a3Var, z17);
    }

    /* renamed from: getDisplayName */
    public java.lang.String m77950x40021d37(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var;
        iz5.a.g(null, str.length() > 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select displayname from chatroom where chatroomname='");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        sb6.append(str);
        sb6.append("'");
        android.database.Cursor f17 = this.f275303d.f(sb6.toString(), null, 2);
        if (f17.moveToFirst()) {
            a3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.a3();
            a3Var.mo9015xbf5d97fd(f17);
        } else {
            a3Var = null;
        }
        f17.close();
        if (a3Var == null) {
            return null;
        }
        return a3Var.f69094xd1f9ba88;
    }

    @Override // l75.n0
    /* renamed from: replace */
    public boolean mo11260x413cb2b4(l75.f0 f0Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.a3) f0Var;
        if (mo55864x413cb2b4(a3Var, true)) {
            mo142179xf35bbb4(a3Var.f69088x37548063, 4, a3Var);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatroomStorage", "replace error");
        return false;
    }

    public boolean y0(java.lang.String str) {
        iz5.a.g(null, str.length() > 0);
        if (this.f275303d.mo70514xb06685ab("chatroom", "chatroomname=?", new java.lang.String[]{str}) == 0) {
            return false;
        }
        mo142179xf35bbb4(str, 5, str);
        return true;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 z0(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.a3();
        a3Var.f69088x37548063 = str;
        if (super.get(a3Var, "chatroomname")) {
            return a3Var;
        }
        return null;
    }
}
