package fb3;

/* loaded from: classes.dex */
public final class c implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fb3.e f342386a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342387b;

    public c(fb3.e eVar, java.lang.String str) {
        this.f342386a = eVar;
        this.f342387b = str;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        java.lang.String str2;
        android.content.Intent intent;
        fb3.e eVar;
        fb3.e eVar2 = this.f342386a;
        if (!z17) {
            if (eVar2.f342391f) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.String str3 = eVar2.f342389d;
                g0Var.d(27809, 4, str3, str3, this.f342387b, eVar2.f342390e, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 12);
                return;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.String str4 = eVar2.f342389d;
                g0Var2.d(27809, 4, str4, str4, this.f342387b, eVar2.f342390e, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 10);
                return;
            }
        }
        ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).bj();
        android.content.Intent intent2 = new android.content.Intent(eVar2.m80379x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.class);
        if (eVar2.f342391f) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.String str5 = eVar2.f342389d;
            g0Var3.d(27809, 3, str5, str5, this.f342387b, eVar2.f342390e, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 12);
            intent2.putExtra("key_way", 11);
            intent2.putExtra("key_from", 5);
            str2 = "key_from";
            intent = intent2;
            eVar = eVar2;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.String str6 = eVar2.f342389d;
            str2 = "key_from";
            intent = intent2;
            eVar = eVar2;
            g0Var4.d(27809, 3, str6, str6, this.f342387b, eVar2.f342390e, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 10);
            intent.putExtra("key_way", 9);
            intent.putExtra(str2, 4);
        }
        java.lang.String str7 = this.f342387b;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str7)) {
            intent.putExtra("key_chatroom_num", ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str7));
            intent.putExtra("key_type", 1);
            intent.putExtra(str2, 1);
            intent.putExtra("key_username", str7);
            intent.putExtra("pay_channel", 14);
            intent.putExtra("key_enter_from_quick_send_packet", true);
            intent.putExtra("key_session_id", eVar.f342390e);
            intent.putExtra("key_quick_send_packet_origin_materialid", eVar.f342389d);
        } else {
            intent.putExtra("key_type", 0);
            intent.putExtra(str2, 1);
            intent.putExtra("key_username", str7);
            intent.putExtra("pay_channel", 11);
            intent.putExtra("key_enter_from_quick_send_packet", true);
            intent.putExtra("key_session_id", eVar.f342390e);
            intent.putExtra("key_quick_send_packet_origin_materialid", eVar.f342389d);
        }
        eVar.m158354x19263085().startActivityForResult(intent, eVar.f342392g);
    }
}
