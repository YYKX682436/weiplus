package y63;

/* loaded from: classes5.dex */
public class a extends dm.c6 {
    public static final l75.e0 R = dm.c6.m124843x3593deb(y63.a.class);
    public java.lang.String H = "";
    public java.lang.String I = "";

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f541184J = "";
    public java.lang.String K = " ";
    public int L = 1;
    public boolean M = false;
    public java.util.HashMap N = new java.util.HashMap();
    public boolean P = false;
    public int Q = 0;

    @Override // dm.c6, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return R;
    }

    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public y63.a m176555x5a5dd5d() {
        y63.a aVar;
        java.lang.Exception e17;
        try {
            aVar = new y63.a();
        } catch (java.lang.Exception e18) {
            aVar = null;
            e17 = e18;
        }
        try {
            aVar.f72763xa3c65b86 = this.f72763xa3c65b86;
            aVar.f66142xdec927b = this.f66142xdec927b;
            aVar.f66138x4b6e619a = this.f66138x4b6e619a;
            aVar.f66135xad49e234 = this.f66135xad49e234;
            aVar.f66136xb1e12de7 = this.f66136xb1e12de7;
            aVar.f66141x4b6e6ec1 = this.f66141x4b6e6ec1;
            aVar.f66137xae937411 = this.f66137xae937411;
            aVar.f66140xd09be28e = this.f66140xd09be28e;
            aVar.f66134xf102adeb = this.f66134xf102adeb;
            aVar.f66139x3647780e = this.f66139x3647780e;
            aVar.H = this.H;
            aVar.I = this.I;
            aVar.f541184J = this.f541184J;
            aVar.K = this.K;
            aVar.L = this.L;
            aVar.Q = this.Q;
            aVar.P = this.P;
            aVar.N = new java.util.HashMap();
            for (int i17 = 1; i17 <= this.N.size(); i17++) {
                aVar.N.put(java.lang.Integer.valueOf(i17), ((y63.b) this.N.get(java.lang.Integer.valueOf(i17))).m176557x5a5dd5d());
            }
        } catch (java.lang.Exception e19) {
            e17 = e19;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.groupsolitaire.GroupSolitatire", "clone() Exception:%s %s", e17.getClass(), e17.getMessage());
            return aVar;
        }
        return aVar;
    }

    /* renamed from: toString */
    public java.lang.String m176556x9616526c() {
        return "GroupSolitatire{header='" + this.H + "', example='" + this.I + "', tail='" + this.f541184J + "', separator='" + this.K + "', hasRealTitle=" + this.L + ", content=" + this.N + ", includeRepeatedContent=" + this.P + ", includeWhiteContentNum=" + this.Q + ", field_username='" + this.f66142xdec927b + "', field_key='" + this.f66138x4b6e619a + "', field_content='" + this.f66135xad49e234 + "', field_creator='" + this.f66136xb1e12de7 + "', field_num=" + this.f66141x4b6e6ec1 + ", field_firstMsgId=" + this.f66137xae937411 + ", field_msgSvrId=" + this.f66140xd09be28e + ", field_active=" + this.f66134xf102adeb + ", field_lastActiveTime=" + this.f66139x3647780e + ", systemRowid=" + this.f72763xa3c65b86 + '}';
    }
}
