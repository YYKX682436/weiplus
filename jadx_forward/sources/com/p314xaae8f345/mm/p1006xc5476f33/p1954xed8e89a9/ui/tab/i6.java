package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes10.dex */
public final class i6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 f235897d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 c16892x4a36dc90) {
        super(0);
        this.f235897d = c16892x4a36dc90;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.os.Bundle bundleExtra = this.f235897d.f235731d.getIntent().getBundleExtra("Contact_Ext_Args");
        if (bundleExtra != null) {
            return bundleExtra.getString("Contact_Ext_Args_Search_Click_Id", "");
        }
        return null;
    }
}
