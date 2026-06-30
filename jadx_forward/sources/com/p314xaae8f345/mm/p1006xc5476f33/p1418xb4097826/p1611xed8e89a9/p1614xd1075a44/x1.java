package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes2.dex */
public final class x1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f206351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xk f206352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.z1 f206353f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206354g;

    public x1(ya2.b2 b2Var, r45.xk xkVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.z1 z1Var, java.lang.String str) {
        this.f206351d = b2Var;
        this.f206352e = xkVar;
        this.f206353f = z1Var;
        this.f206354g = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/widget/HeaderMediaEntranceWidget$handleMediaEntrance$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
        ya2.b2 b2Var = this.f206351d;
        java.lang.String D0 = b2Var != null ? b2Var.D0() : "";
        r45.xk xkVar = this.f206352e;
        java.lang.String m75945x2fec8307 = xkVar.m75945x2fec8307(0);
        java.lang.String str = m75945x2fec8307 == null ? "" : m75945x2fec8307;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.z1 z1Var = this.f206353f;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = z1Var.f206374a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        o3Var.Ak(4, D0, str, "", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", xkVar.m75945x2fec8307(0));
        intent.putExtra("Contact_Scene", 183);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        intent.putExtra("Contact_Scene", 210);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = z1Var.f206374a;
        j45.l.j(activityC0065xcd7aa112, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.t2.f206896a.a(z1Var.f206374a, this.f206354g, true, xkVar.m75945x2fec8307(6), xkVar.m75945x2fec8307(0), activityC0065xcd7aa112.getIntent().getLongExtra("finder_from_feed_id", 0L));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderMediaEntranceWidget$handleMediaEntrance$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
