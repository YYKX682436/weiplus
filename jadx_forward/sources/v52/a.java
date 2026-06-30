package v52;

/* loaded from: classes11.dex */
public abstract class a {
    public static int a(java.lang.String str) {
        if (str == null) {
            return -1;
        }
        int i17 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.j4(str) ? 4 : (c01.e2.U(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.D4(str)) ? 5 : str.startsWith("gh_") ? 2 : com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) ? 1 : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellChattingType", "getChatType: %s, %d", str, java.lang.Integer.valueOf(i17));
        return i17;
    }

    public static nm5.b b() {
        java.lang.String c17 = h52.b.c("Chat_User");
        int a17 = a(c17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellChattingType", "getParamsOfChattingUI, chatType: %d", java.lang.Integer.valueOf(a17));
        return nm5.j.c(c17, java.lang.Integer.valueOf(a17));
    }

    public static nm5.b c() {
        r45.x35 a17 = i52.e.a();
        java.lang.String str = null;
        if (a17 != null) {
            java.util.LinkedList linkedList = a17.f471287d;
            if (!linkedList.isEmpty()) {
                java.util.Iterator it = linkedList.iterator();
                r45.p44 p44Var = null;
                while (it.hasNext()) {
                    r45.p44 p44Var2 = (r45.p44) it.next();
                    if (p44Var2 != null && "Chat_User".equals(p44Var2.f464280d)) {
                        p44Var = p44Var2;
                    }
                }
                if (p44Var != null) {
                    str = p44Var.f464281e;
                }
            }
        }
        int a18 = a(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellChattingType", "getParamsOfChattingUIFragment, chatType: %d", java.lang.Integer.valueOf(a18));
        return nm5.j.c(str, java.lang.Integer.valueOf(a18));
    }
}
