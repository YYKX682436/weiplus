package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes.dex */
public final class tt extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut f217592d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut utVar) {
        super(0);
        this.f217592d = utVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String stringExtra = this.f217592d.m158359x1e885992().getStringExtra("key_udf_kv");
        if (stringExtra == null) {
            stringExtra = "";
        }
        return stringExtra.length() > 0 ? new cl0.g(stringExtra) : new cl0.g();
    }
}
