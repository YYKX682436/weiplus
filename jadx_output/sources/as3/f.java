package as3;

/* loaded from: classes8.dex */
public final class f implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.view.BizProfileFollowMoreView f13503d;

    public f(com.tencent.mm.plugin.profile.ui.tab.view.BizProfileFollowMoreView bizProfileFollowMoreView) {
        this.f13503d = bizProfileFollowMoreView;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        vr3.a aVar = (vr3.a) holder.f293125i;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", aVar.f439619d.f373593d.f370068e);
        intent.putExtra("Contact_Nick", aVar.f439619d.f373593d.f370067d);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        intent.putExtra("Contact_Scene", 251);
        intent.putExtra("KOpenArticleSceneFromScene", 126);
        com.tencent.mm.plugin.profile.ui.tab.view.BizProfileFollowMoreView bizProfileFollowMoreView = this.f13503d;
        j45.l.j(bizProfileFollowMoreView.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        bizProfileFollowMoreView.getClickReporter().invoke(2303);
        cl0.g a17 = aVar.a();
        a17.o("EventType", 2);
        a17.o("Pos", i17);
        lx3.r rVar = lx3.r.f322113a;
        java.lang.String gVar = a17.toString();
        kotlin.jvm.internal.o.f(gVar, "toString(...)");
        rVar.a(0, gVar, new vr3.b(aVar), new vr3.c(aVar));
    }
}
