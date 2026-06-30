package w03;

/* loaded from: classes10.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w03.u f523435d;

    public t(w03.u uVar) {
        this.f523435d = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w03.u uVar = this.f523435d;
        uVar.O6().Y6();
        if (uVar.O6().isFinishing()) {
            return;
        }
        db5.f.b(uVar.O6());
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95 = uVar.O6().m78735x28280f95();
        if (m78735x28280f95 != null) {
            m78735x28280f95.m81454x4335bff3(true);
            m78735x28280f95.d(false);
        }
    }
}
