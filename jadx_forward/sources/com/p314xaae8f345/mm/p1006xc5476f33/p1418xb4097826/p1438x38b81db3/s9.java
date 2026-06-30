package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class s9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f186064d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar) {
        super(0);
        this.f186064d = qeVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Intent intent = this.f186064d.f185891f.getF204176d().getIntent();
        boolean z17 = false;
        if (intent != null && intent.getBooleanExtra("is_from_ad", false)) {
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
