package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class k6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f64273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in.b f64274e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f64275f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(boolean z17, in.b bVar, java.lang.CharSequence charSequence) {
        super(1);
        this.f64273d = z17;
        this.f64274e = bVar;
        this.f64275f = charSequence;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        in.a aVar = (in.a) obj;
        if (this.f64273d) {
            return ((in.c) this.f64274e.f292719e.get(0)).f292722e + (char) 65306 + aVar.f292716f;
        }
        return ((java.lang.Object) this.f64275f) + (char) 65306 + aVar.f292716f;
    }
}
