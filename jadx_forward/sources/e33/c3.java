package e33;

/* loaded from: classes10.dex */
public class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14 f328721d;

    public c3(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14 c15655x4db85b14) {
        this.f328721d = c15655x4db85b14;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14 c15655x4db85b14 = this.f328721d;
        c15655x4db85b14.f220097i.a(c15655x4db85b14.f220102q, c15655x4db85b14.f220101p);
        c15655x4db85b14.f220102q = null;
        c15655x4db85b14.f220101p.clear();
        c15655x4db85b14.f220097i.notifyDataSetChanged();
    }
}
