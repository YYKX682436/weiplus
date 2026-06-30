package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd;

/* loaded from: classes5.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f237856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0 f237857e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f237858f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0 e0Var, boolean z18) {
        super(2);
        this.f237856d = z17;
        this.f237857e = e0Var;
        this.f237858f = z18;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yz5.l lVar;
        yz5.l lVar2;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        boolean z17 = this.f237856d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0 e0Var = this.f237857e;
        if (z17 && (lVar2 = e0Var.B) != null) {
            lVar2.mo146xb9724478(java.lang.Integer.valueOf(intValue));
        }
        if (this.f237858f && (lVar = e0Var.C) != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(intValue2));
        }
        return jz5.f0.f384359a;
    }
}
