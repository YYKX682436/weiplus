package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class su extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final int f104576d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(android.view.View itemView, int i17) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f104576d = i17;
    }

    public static final void i(com.tencent.mm.plugin.finder.convert.su suVar, android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, java.lang.String str) {
        suVar.getClass();
        r45.xk bizInfo = baseFinderFeed.getFeedObject().getBizInfo();
        jz5.f0 f0Var = null;
        if (bizInfo != null) {
            android.content.Intent intent = new android.content.Intent();
            java.lang.String string = bizInfo.getString(0);
            if (string == null) {
                string = "";
            }
            intent.putExtra("Contact_User", string);
            intent.putExtra("Contact_Scene", 213);
            intent.putExtra("biz_profile_enter_from_finder", true);
            intent.putExtra("force_get_contact", true);
            intent.putExtra("key_use_new_contact_profile", true);
            intent.putExtra("biz_profile_tab_type", 1);
            j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("finder_username", str);
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
            ((c61.l7) b6Var).Cj(rq2.x.f398915b, intent2);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(context, intent2);
        }
    }
}
