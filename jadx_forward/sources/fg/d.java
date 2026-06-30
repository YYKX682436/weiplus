package fg;

/* loaded from: classes7.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg.f f343278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f343279e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f343280f;

    public d(fg.f fVar, int i17, int i18) {
        this.f343278d = fVar;
        this.f343279e = i17;
        this.f343280f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        fg.f fVar = this.f343278d;
        fVar.getClass();
        int i18 = this.f343279e;
        if (i18 < 0 || (i17 = this.f343280f) < 0 || i18 > i17) {
            return;
        }
        try {
            fVar.f343291w.setSelection(i18, i17);
        } catch (java.lang.Exception unused) {
        }
    }
}
