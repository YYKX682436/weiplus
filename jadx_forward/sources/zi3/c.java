package zi3;

/* loaded from: classes14.dex */
public final class c implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi3.f f554698d;

    public c(zi3.f fVar) {
        this.f554698d = fVar;
    }

    @Override // f25.f
    public void c(boolean z17) {
        this.f554698d.N(true);
    }

    @Override // f25.f
    /* renamed from: onResume */
    public void mo44161x57429eec() {
        boolean h17 = j65.e.h();
        zi3.f fVar = this.f554698d;
        if (h17) {
            fVar.N(false);
        } else {
            fVar.N(j65.e.g());
        }
    }

    @Override // f25.f
    /* renamed from: onStop */
    public void mo44162xc39f8281() {
    }
}
