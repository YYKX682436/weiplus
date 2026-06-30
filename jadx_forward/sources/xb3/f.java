package xb3;

/* loaded from: classes9.dex */
public class f implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16335x1879211c f534432a;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16335x1879211c activityC16335x1879211c) {
        this.f534432a = activityC16335x1879211c;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16335x1879211c activityC16335x1879211c = this.f534432a;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.p43 p43Var = (r45.p43) fVar.f152151d;
            if (p43Var.f464260d == 0) {
                gb3.l.b(activityC16335x1879211c.f226682w, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.g5.e(p43Var));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHKReceiveUI", "go to before detail ui");
                android.content.Intent intent = new android.content.Intent();
                intent.setClass(activityC16335x1879211c.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16334x8c51adff.class);
                intent.putExtra("key_lucky_money_can_received", true);
                intent.putExtra("key_jump_from", 2);
                intent.putExtra("key_native_url", activityC16335x1879211c.f226683x);
                intent.putExtra("key_sendid", activityC16335x1879211c.f226682w);
                intent.putExtra("key_anim_slide", true);
                intent.putExtra("key_username", activityC16335x1879211c.getIntent().getStringExtra("key_username"));
                intent.putExtra("key_way", activityC16335x1879211c.f226684y);
                intent.putExtra("key_msgid", activityC16335x1879211c.f226685z);
                intent.putExtra("key_hk_scene", activityC16335x1879211c.getIntent().getIntExtra("key_hk_scene", 0));
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.C16337xbe204522 c16337xbe204522 = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.C16337xbe204522();
                c16337xbe204522.f226688f = p43Var.H;
                c16337xbe204522.f226689g = p43Var.I;
                intent.putExtra("key_emoji_switch", c16337xbe204522);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(activityC16335x1879211c, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI", "gotoBeforeDetailUI", "(Lcom/tencent/mm/protocal/protobuf/ForeignHbDetailResp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC16335x1879211c.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(activityC16335x1879211c, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI", "gotoBeforeDetailUI", "(Lcom/tencent/mm/protocal/protobuf/ForeignHbDetailResp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16335x1879211c.B;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p43Var.f464261e)) {
                    str = p43Var.f464261e;
                }
                db5.e1.T(activityC16335x1879211c.mo55332x76847179(), str);
            }
        } else {
            java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16335x1879211c.B;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fVar.f152150c)) {
                str2 = fVar.f152150c;
            }
            db5.e1.T(activityC16335x1879211c.mo55332x76847179(), str2);
        }
        activityC16335x1879211c.finish();
        return null;
    }
}
