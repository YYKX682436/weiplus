package dk5;

/* loaded from: classes9.dex */
public class n3 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 f316295a;

    public n3(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93) {
        this.f316295a = activityC22571x51759e93;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectConversationUI", "[ImageGalleryUI] showImgGallery");
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93 = this.f316295a;
        android.content.Intent intent = new android.content.Intent(activityC22571x51759e93.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.class);
        intent.putExtra("img_gallery_msg_id", activityC22571x51759e93.M1);
        intent.putExtra("img_gallery_msg_svr_id", activityC22571x51759e93.S1.I0());
        intent.putExtra("img_gallery_talker", activityC22571x51759e93.S1.Q0());
        intent.putExtra("img_gallery_chatroom_name", activityC22571x51759e93.S1.Q0());
        intent.putExtra("img_preview_only", true);
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e932 = this.f316295a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC22571x51759e932, arrayList.toArray(), "com/tencent/mm/ui/transmit/SelectConversationUI$31", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC22571x51759e932.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC22571x51759e932, "com/tencent/mm/ui/transmit/SelectConversationUI$31", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        db5.f.j(activityC22571x51759e93.mo55332x76847179());
    }
}
