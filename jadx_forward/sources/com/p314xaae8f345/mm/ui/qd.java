package com.p314xaae8f345.mm.ui;

/* loaded from: classes3.dex */
public final class qd extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.LayoutInflater f291083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f291084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f291085f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f291086g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd(android.view.LayoutInflater layoutInflater, int i17, android.view.ViewGroup viewGroup, boolean z17) {
        super(0);
        this.f291083d = layoutInflater;
        this.f291084e = i17;
        this.f291085f = viewGroup;
        this.f291086g = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        return this.f291083d.inflate(this.f291084e, this.f291085f, this.f291086g);
    }
}
