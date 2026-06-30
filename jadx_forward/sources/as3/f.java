package as3;

/* loaded from: classes8.dex */
public final class f implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16911xd5774141 f95036d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16911xd5774141 c16911xd5774141) {
        this.f95036d = c16911xd5774141;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        vr3.a aVar = (vr3.a) holder.f374658i;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", aVar.f521152d.f455126d.f451601e);
        intent.putExtra("Contact_Nick", aVar.f521152d.f455126d.f451600d);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        intent.putExtra("Contact_Scene", 251);
        intent.putExtra("KOpenArticleSceneFromScene", 126);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16911xd5774141 c16911xd5774141 = this.f95036d;
        j45.l.j(c16911xd5774141.getContext(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        c16911xd5774141.getClickReporter().mo146xb9724478(2303);
        cl0.g a17 = aVar.a();
        a17.o("EventType", 2);
        a17.o("Pos", i17);
        lx3.r rVar = lx3.r.f403646a;
        java.lang.String gVar = a17.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "toString(...)");
        rVar.a(0, gVar, new vr3.b(aVar), new vr3.c(aVar));
    }
}
