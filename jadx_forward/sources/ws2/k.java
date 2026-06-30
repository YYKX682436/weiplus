package ws2;

/* loaded from: classes3.dex */
public final class k implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws2.l f530597d;

    public k(ws2.l lVar) {
        this.f530597d = lVar;
    }

    @Override // f25.f
    public void c(boolean z17) {
        this.f530597d.b("onPause");
    }

    @Override // f25.f
    /* renamed from: onResume */
    public void mo44161x57429eec() {
        this.f530597d.a("onResume");
    }

    @Override // f25.f
    /* renamed from: onStop */
    public void mo44162xc39f8281() {
        ws2.l lVar = this.f530597d;
        lVar.b("onStop");
        lVar.f530620a = null;
    }
}
