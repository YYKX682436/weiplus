package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public final class k6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f145806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in.b f145807e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f145808f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(boolean z17, in.b bVar, java.lang.CharSequence charSequence) {
        super(1);
        this.f145806d = z17;
        this.f145807e = bVar;
        this.f145808f = charSequence;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        in.a aVar = (in.a) obj;
        if (this.f145806d) {
            return ((in.c) this.f145807e.f374252e.get(0)).f374255e + (char) 65306 + aVar.f374249f;
        }
        return ((java.lang.Object) this.f145808f) + (char) 65306 + aVar.f374249f;
    }
}
