package ks3;

/* loaded from: classes8.dex */
public class x implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ks3.z f393302d;

    public x(ks3.z zVar) {
        this.f393302d = zVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        ks3.z zVar = this.f393302d;
        java.util.LinkedList b17 = zVar.f393321b.b();
        if (b17 == null) {
            b17 = new java.util.LinkedList();
        }
        java.util.ArrayList<android.os.Bundle> parcelableArrayList = bundle.getParcelableArrayList("sync_add_list");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            for (android.os.Bundle bundle2 : parcelableArrayList) {
                ks3.u uVar = new ks3.u();
                uVar.f393283e = bundle2.getString(ya.b.f77485x2838ac37);
                java.lang.String string = bundle2.getString("item_addr");
                uVar.f393284f = string;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                    uVar.f393282d = uVar.f393284f.hashCode();
                }
                uVar.f393286h = x51.k.a(uVar.f393283e);
                ks3.e1 e1Var = new ks3.e1(uVar);
                if (!b17.contains(e1Var)) {
                    b17.add(e1Var);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Plugin.MailAddrMgr", "add contact (%s,%s)", uVar.f393284f, uVar.f393283e);
                }
            }
        }
        java.util.ArrayList<android.os.Bundle> parcelableArrayList2 = bundle.getParcelableArrayList("sync_update_list");
        if (parcelableArrayList2 != null && !parcelableArrayList2.isEmpty()) {
            for (android.os.Bundle bundle3 : parcelableArrayList2) {
                ks3.u uVar2 = new ks3.u();
                uVar2.f393283e = bundle3.getString(ya.b.f77485x2838ac37);
                java.lang.String string2 = bundle3.getString("item_addr");
                uVar2.f393284f = string2;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
                    uVar2.f393282d = uVar2.f393284f.hashCode();
                }
                uVar2.f393286h = x51.k.a(uVar2.f393283e);
                ks3.e1 e1Var2 = new ks3.e1(uVar2);
                int indexOf = b17.indexOf(e1Var2);
                if (indexOf != -1) {
                    b17.set(indexOf, e1Var2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Plugin.MailAddrMgr", "update contact (%s,%s)", uVar2.f393284f, uVar2.f393283e);
                }
            }
        }
        java.util.ArrayList<android.os.Bundle> parcelableArrayList3 = bundle.getParcelableArrayList("sync_delete_list");
        if (parcelableArrayList3 != null && !parcelableArrayList3.isEmpty()) {
            for (android.os.Bundle bundle4 : parcelableArrayList3) {
                ks3.u uVar3 = new ks3.u();
                uVar3.f393283e = bundle4.getString(ya.b.f77485x2838ac37);
                java.lang.String string3 = bundle4.getString("item_addr");
                uVar3.f393284f = string3;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string3)) {
                    uVar3.f393282d = uVar3.f393284f.hashCode();
                }
                uVar3.f393286h = x51.k.a(uVar3.f393283e);
                b17.remove(new ks3.e1(uVar3));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Plugin.MailAddrMgr", "delete contact (%s,%s)", uVar3.f393284f, uVar3.f393283e);
            }
        }
        zVar.f393321b.c(b17);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_XMAIL_SYNC_CONTACT_KEY_LONG_SYNC, java.lang.Long.valueOf(bundle.getLong("last_sync_key")));
        zVar.f393325f = zVar.f393324e;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ks3.w(this));
    }
}
