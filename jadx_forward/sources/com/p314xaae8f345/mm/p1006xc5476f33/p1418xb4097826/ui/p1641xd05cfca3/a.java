package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3;

/* loaded from: classes2.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx2.q f211188d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(gx2.q qVar) {
        super(0);
        this.f211188d = qVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        gx2.q qVar = this.f211188d;
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 c1095x65355f89 = qVar != null ? (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) qVar.findViewById(com.p314xaae8f345.mm.R.id.t5t) : null;
        return java.lang.Boolean.valueOf(c1095x65355f89 == null || !c1095x65355f89.canScrollVertically(-1));
    }
}
