package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8;

/* loaded from: classes2.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.n0 f202789d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.n0 n0Var) {
        super(0);
        this.f202789d = n0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.C14468x579dd28e c14468x579dd28e = this.f202789d.f202795e;
        boolean z17 = true;
        if (c14468x579dd28e != null && (view = c14468x579dd28e.f287834h) != null && (c22801x87cbdc00 = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) view.findViewById(com.p314xaae8f345.mm.R.id.m6e)) != null && (m82555x4905e9fa = c22801x87cbdc00.m82555x4905e9fa()) != null) {
            z17 = true ^ m82555x4905e9fa.canScrollVertically(-1);
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
