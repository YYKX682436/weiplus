package cr0;

/* loaded from: classes12.dex */
public final class x1 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f303340d;

    public x1(long j17) {
        this.f303340d = j17;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        cr0.v1 v1Var = (cr0.v1) ((jz5.l) obj).f384367e;
        long j17 = this.f303340d;
        return mz5.a.b(java.lang.Float.valueOf(v1Var.a(j17)), java.lang.Float.valueOf(((cr0.v1) ((jz5.l) obj2).f384367e).a(j17)));
    }
}
