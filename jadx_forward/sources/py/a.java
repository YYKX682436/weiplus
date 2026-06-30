package py;

@j95.b
/* loaded from: classes11.dex */
public class a extends i95.w implements qy.i {
    public boolean Ai(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var;
        java.util.Map map = c01.v1.f119052a;
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        a17.getClass();
        java.lang.String str2 = null;
        iz5.a.g(null, str.length() > 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select roomowner from chatroom where chatroomname='");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        sb6.append(str);
        sb6.append("'");
        android.database.Cursor f17 = a17.f275303d.f(sb6.toString(), null, 2);
        if (f17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomStorage", "getChatroomOwner fail, cursor is null");
        } else {
            if (f17.moveToFirst()) {
                a3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.a3();
                a3Var.mo9015xbf5d97fd(f17);
            } else {
                a3Var = null;
            }
            f17.close();
            if (a3Var != null) {
                str2 = a3Var.f69107x5be1edb3;
            }
        }
        java.lang.String r17 = c01.z1.r();
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r17) || !str2.equals(r17)) ? false : true;
    }

    public int wi(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0;
        }
        return c01.v1.o(str);
    }
}
