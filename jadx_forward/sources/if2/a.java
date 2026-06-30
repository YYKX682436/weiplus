package if2;

/* loaded from: classes3.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ if2.b f372629d;

    public a(if2.b bVar) {
        this.f372629d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if2.b bVar = this.f372629d;
        if (bVar.U6()) {
            yz5.a aVar = bVar.f372635h;
            if (aVar != null) {
                if (aVar != null) {
                    aVar.mo152xb9724478();
                }
                bVar.f372635h = null;
                return;
            }
            return;
        }
        yz5.a aVar2 = bVar.f372634g;
        if (aVar2 != null) {
            if (aVar2 != null) {
                aVar2.mo152xb9724478();
            }
            bVar.f372634g = null;
        }
    }
}
