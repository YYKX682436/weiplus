package e33;

/* loaded from: classes10.dex */
public class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e33.b3 f328651d;

    public a3(e33.b3 b3Var) {
        this.f328651d = b3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        e33.b3 b3Var = this.f328651d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14 c15655x4db85b14 = b3Var.f328690d;
        c15655x4db85b14.f220097i.a(c15655x4db85b14.f220102q, c15655x4db85b14.f220101p);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14 c15655x4db85b142 = b3Var.f328690d;
        c15655x4db85b142.f220102q = null;
        c15655x4db85b142.f220101p.clear();
        b3Var.f328690d.f220097i.notifyDataSetChanged();
    }
}
