package hn;

/* loaded from: classes4.dex */
public final class l implements com.p314xaae8f345.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg3.i3 f363881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hn.s f363882e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f363883f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vg3.h3 f363884g;

    public l(vg3.i3 i3Var, hn.s sVar, android.content.Context context, vg3.h3 h3Var) {
        this.f363881d = i3Var;
        this.f363882e = sVar;
        this.f363883f = context;
        this.f363884g = h3Var;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i17 == 15001 && i18 == -1) {
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("Select_Conv_User") : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRoomOpenService", "on select contact return:" + stringExtra);
            vg3.i3 i3Var = this.f363881d;
            i3Var.f518251m = stringExtra;
            i3Var.f518252n = intent != null ? intent.getIntExtra("key_has_create_new_group", 0) : 0;
            this.f363882e.getClass();
            android.content.Context context = this.f363883f;
            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context : null;
            if (activityC21401x6ce6f73f == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatRoomOpenService", "context is not MMActivity");
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClassName(activityC21401x6ce6f73f, "com.tencent.mm.chatroom.ui.ChatRoomBindAppUI");
            intent2.putExtra("key_bind_param", i3Var);
            activityC21401x6ce6f73f.m78750xc5512edd(new hn.r(this.f363884g));
            activityC21401x6ce6f73f.startActivityForResult(intent2, 15002);
        }
    }
}
