package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368;

/* loaded from: classes12.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f134391f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String str, java.lang.String str2, boolean z17) {
        super(1);
        this.f134389d = str;
        this.f134390e = str2;
        this.f134391f = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.Map.Entry it = (java.util.Map.Entry) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.String a17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v.a(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v.f134416f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("safe dispatchState -> ");
        sb6.append(((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea) it.getKey()).f134325e);
        sb6.append('-');
        sb6.append(((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea) it.getKey()).f134326f);
        sb6.append(": ");
        java.lang.String str = this.f134389d;
        sb6.append(str);
        sb6.append(", ");
        java.lang.String str2 = this.f134390e;
        sb6.append(str2);
        sb6.append(", ");
        boolean z17 = this.f134391f;
        sb6.append(z17);
        oj.j.c(a17, sb6.toString(), new java.lang.Object[0]);
        ((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.g) it.getValue()).c5(str, str2, z17);
        return jz5.f0.f384359a;
    }
}
