package xk;

/* loaded from: classes4.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f536450d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f536451e;

    /* renamed from: f, reason: collision with root package name */
    public final long f536452f = java.lang.System.currentTimeMillis();

    public a(android.content.Context context, java.lang.String str, int i17, android.os.Bundle bundle) {
        r45.r44 r44Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 4790;
        lVar.f152199c = "/cgi-bin/mmsearch-bin/mmgettagjump";
        lVar.f152197a = new r45.mx5();
        lVar.f152198b = new r45.nx5();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f536451e = a17;
        r45.mx5 mx5Var = (r45.mx5) a17.f152243a.f152217a;
        mx5Var.f462431e = str;
        mx5Var.f462430d = i17;
        if (bundle == null) {
            r44Var = null;
        } else {
            r44Var = new r45.r44();
            int i18 = bundle.getInt("biz_type");
            r45.j44 j44Var = new r45.j44();
            j44Var.f459110d = "biz_type";
            j44Var.f459111e = java.lang.String.valueOf(i18);
            java.util.LinkedList linkedList = r44Var.f466075d;
            if (linkedList != null) {
                linkedList.add(j44Var);
            }
            java.lang.String string = bundle.getString("msg_svr_id");
            if (string != null) {
                r45.j44 j44Var2 = new r45.j44();
                j44Var2.f459110d = "msg_svr_id";
                j44Var2.f459111e = string;
                if (linkedList != null) {
                    linkedList.add(j44Var2);
                }
            }
            int i19 = bundle.getInt("pay_channel");
            r45.j44 j44Var3 = new r45.j44();
            j44Var3.f459110d = "pay_channel";
            j44Var3.f459111e = java.lang.String.valueOf(i19);
            if (linkedList != null) {
                linkedList.add(j44Var3);
            }
            java.lang.String string2 = bundle.getString("chat_username");
            if (string2 != null) {
                r45.j44 j44Var4 = new r45.j44();
                j44Var4.f459110d = "chat_username";
                j44Var4.f459111e = string2;
                if (linkedList != null) {
                    linkedList.add(j44Var4);
                }
            }
            java.lang.String string3 = bundle.getString("sender_username");
            if (string3 != null) {
                r45.j44 j44Var5 = new r45.j44();
                j44Var5.f459110d = "sender_username";
                j44Var5.f459111e = string3;
                if (linkedList != null) {
                    linkedList.add(j44Var5);
                }
            }
            int i27 = bundle.getInt("chat_type");
            r45.j44 j44Var6 = new r45.j44();
            j44Var6.f459110d = "chat_type";
            j44Var6.f459111e = java.lang.String.valueOf(i27);
            if (linkedList != null) {
                linkedList.add(j44Var6);
            }
            int i28 = bundle.getInt("send_type");
            r45.j44 j44Var7 = new r45.j44();
            j44Var7.f459110d = "send_type";
            j44Var7.f459111e = java.lang.String.valueOf(i28);
            if (linkedList != null) {
                linkedList.add(j44Var7);
            }
        }
        mx5Var.f462432f = r44Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f536450d = u0Var;
        return mo9409x10f9447a(sVar, this.f536451e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4790;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.NetSceneGetTagJump", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f536452f));
        this.f536450d.mo815x76e0bfae(i18, i19, str, this);
    }
}
