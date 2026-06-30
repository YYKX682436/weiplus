package u56;

/* loaded from: classes16.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u56.g f506357d;

    public f(u56.g gVar) {
        this.f506357d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        u56.g gVar = this.f506357d;
        int size = gVar.f506358d.size();
        int i17 = 0;
        if (size < gVar.f506359e) {
            int i18 = gVar.f506360f - size;
            while (i17 < i18) {
                gVar.f506358d.add(gVar.a());
                i17++;
            }
            return;
        }
        int i19 = gVar.f506360f;
        if (size > i19) {
            int i27 = size - i19;
            while (i17 < i27) {
                gVar.f506358d.poll();
                i17++;
            }
        }
    }
}
