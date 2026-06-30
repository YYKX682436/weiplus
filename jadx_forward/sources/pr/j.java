package pr;

/* loaded from: classes4.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f439252d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.lang.String str, yz5.l lVar) {
        super(0);
        this.f439252d = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.v75 v75Var;
        int i17;
        z85.t d17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().d();
        java.lang.String str = this.f439252d;
        z85.s y07 = d17.y0(str);
        r45.se3 se3Var = new r45.se3();
        if ((y07 != null ? y07.f65848xad49e234 : null) != null) {
            try {
                se3Var.mo11468x92b714fd(y07.f65848xad49e234);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EmojiPackSyncManager", e17, "", new java.lang.Object[0]);
            }
        }
        r45.qj0 qj0Var = se3Var.f467185d;
        if (qj0Var == null || (v75Var = qj0Var.E) == null || (i17 = v75Var.f469497d) == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPackSyncManager", "checkPack: getEmojiDetail");
            new gr.e(str).l().K(new pr.i(str, pr.k.f439255d));
        } else {
            int intValue = java.lang.Integer.valueOf(i17).intValue();
            com.p314xaae8f345.mm.p2621x8fb0427b.e5 a17 = com.p314xaae8f345.mm.p2621x8fb0427b.d5.f275369a.a(intValue);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkPack: checkDesigner ");
            sb6.append(intValue);
            sb6.append(' ');
            java.util.LinkedList linkedList = a17.f275391b;
            sb6.append(linkedList.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPackSyncManager", sb6.toString());
            if (linkedList.isEmpty()) {
                new pr.d(intValue, null).b();
            }
        }
        return jz5.f0.f384359a;
    }
}
