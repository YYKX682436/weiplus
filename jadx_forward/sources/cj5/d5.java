package cj5;

/* loaded from: classes.dex */
public final class d5 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.k5 f123637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123638e;

    public d5(cj5.k5 k5Var, java.lang.String str) {
        this.f123637d = k5Var;
        this.f123638e = str;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i18 != -1) {
            return;
        }
        boolean z17 = false;
        int intExtra = intent != null ? intent.getIntExtra("select_record_msg_num", 0) : 0;
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("key_selected_record_msg_list") : null;
        java.lang.String str = this.f123638e;
        cj5.k5 k5Var = this.f123637d;
        if (intExtra == 0) {
            k5Var.f123707e.remove(str);
            k5Var.f123708f.remove(str);
            return;
        }
        java.lang.Long valueOf = intent != null ? java.lang.Long.valueOf(intent.getLongExtra("select_record_min_msg_id", -1L)) : null;
        ((qg5.p0) ((rd0.v0) i95.n0.c(rd0.v0.class))).getClass();
        int g17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.g();
        if (1 <= g17 && g17 < intExtra) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.g();
        }
        java.util.HashMap hashMap = k5Var.f123707e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(stringArrayListExtra, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
        hashMap.put(str, stringArrayListExtra);
        java.util.HashMap hashMap2 = k5Var.f123708f;
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("selectMsgNum", java.lang.String.valueOf(intExtra));
        hashMap3.put("lastSelectMinMsgId", java.lang.String.valueOf(valueOf));
        hashMap2.put(str, hashMap3);
        android.os.Bundle extras = intent.getExtras();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectConversationMainViewUIC", extras != null ? extras.toString() : null);
    }
}
