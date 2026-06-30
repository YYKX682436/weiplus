package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class h2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f210845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f210846e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(android.content.Context context, boolean z17) {
        super(1);
        this.f210845d = context;
        this.f210846e = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.content.Intent intent = new android.content.Intent();
        java.lang.String r17 = c01.z1.r();
        intent.putExtra("Contact_User", r17);
        if (r17 != null) {
            if (r17.length() > 0) {
                intent.putExtra("CONTACT_INFO_UI_SOURCE", 22);
                j45.l.j(this.f210845d, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
            }
        }
        if (this.f210846e) {
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Mj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, this.f210845d, 12L, 5L, false, 0, 0, null, 120, null);
        }
        return jz5.f0.f384359a;
    }
}
