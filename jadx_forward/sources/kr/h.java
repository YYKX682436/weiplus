package kr;

/* loaded from: classes3.dex */
public final class h implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr.i f392829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f392830e;

    public h(kr.i iVar, android.view.View view) {
        this.f392829d = iVar;
        this.f392830e = view;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        this.f392829d.f392832e = true;
        return this.f392830e.performClick();
    }
}
