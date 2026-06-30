package hr3;

/* loaded from: classes11.dex */
public class pa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.va f365415d;

    public pa(hr3.va vaVar) {
        this.f365415d = vaVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$BaseHandler$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hr3.va vaVar = this.f365415d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NormalUserFooterPreference", "sendButton onClick %s", vaVar.f365642e.L.d1());
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668 = vaVar.f365642e;
        if (c16861xdcf09668.W) {
            java.lang.String d17 = c16861xdcf09668.L.d1();
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            boolean z17 = c16861xdcf09668.M;
            android.content.Context context = c16861xdcf09668.f279303d;
            if (z17) {
                intent.putExtra("Chat_User", d17);
                intent.putExtra("Chat_Mode", 1);
                ((android.app.Activity) context).setResult(-1, intent);
            } else {
                intent.putExtra("Chat_User", d17);
                intent.putExtra("Chat_Mode", 1);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.j(intent, context);
            }
        } else {
            vaVar.getClass();
            android.content.Intent intent2 = new android.content.Intent();
            intent2.addFlags(67108864);
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf096682 = vaVar.f365642e;
            boolean z18 = c16861xdcf096682.M;
            android.content.Context context2 = c16861xdcf096682.f279303d;
            if (z18) {
                intent2.putExtra("Chat_User", c16861xdcf096682.L.d1());
                intent2.putExtra("Chat_Mode", 1);
                ((android.app.Activity) context2).setResult(-1, intent2);
            } else {
                intent2.putExtra("Chat_User", c16861xdcf096682.L.d1());
                intent2.putExtra("Chat_Mode", 1);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.j(intent2, context2);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(vaVar.f365642e.K1.getIntent(), 4, 1, vaVar.f365642e.L.d1());
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$BaseHandler$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
