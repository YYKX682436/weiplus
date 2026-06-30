package y80;

/* loaded from: classes8.dex */
public final class g1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f541381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y80.n1 f541382e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f541383f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 f541384g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(android.content.Context context, y80.n1 n1Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23) {
        super(3);
        this.f541381d = context;
        this.f541382e = n1Var;
        this.f541383f = str;
        this.f541384g = c16279x64cea23;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        ((java.lang.Number) obj3).intValue();
        android.content.Context context = this.f541381d;
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo48674x36654fab();
        }
        if (booleanValue) {
            y80.n1 n1Var = this.f541382e;
            n1Var.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("quickShareLocation: ");
            java.lang.String str2 = this.f541383f;
            sb6.append(str2);
            sb6.append(", ");
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23 = this.f541384g;
            sb6.append(c16279x64cea23.f226124m);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(n1Var.f541420d, sb6.toString());
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).Ai().g(str2);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_Msg_content", va3.w.b(c16279x64cea23));
            intent.putExtra("Retr_Msg_Type", 9);
            intent.putExtra("Retr_MsgQuickShare", true);
            intent.putExtra("custom_send_text", str);
            intent.putExtra("Select_Conv_User", str2);
            j45.l.u(context, ".ui.transmit.MsgRetransmitUI", intent, null);
        }
        return jz5.f0.f384359a;
    }
}
