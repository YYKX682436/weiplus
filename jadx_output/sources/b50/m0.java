package b50;

/* loaded from: classes11.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f17962d;

    public m0(long j17) {
        this.f17962d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.storage.s1 L0 = r01.q3.nj().L0(this.f17962d);
        if (L0 == null) {
            return;
        }
        L0.field_isExpand = true;
        r01.q3.nj().o1(L0, false);
    }
}
