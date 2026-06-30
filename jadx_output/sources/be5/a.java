package be5;

/* loaded from: classes9.dex */
public final class a implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiAllResultFragment f19562d;

    public a(com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiAllResultFragment fTSMultiAllResultFragment) {
        this.f19562d = fTSMultiAllResultFragment;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        ae5.n nVar = (ae5.n) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initDataObserver >> ");
        com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiAllResultFragment fTSMultiAllResultFragment = this.f19562d;
        sb6.append(fTSMultiAllResultFragment.f202679r);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiAllResultFragment", sb6.toString());
        if (fTSMultiAllResultFragment.f202679r) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiAllResultFragment", "initDataObserver >> " + nVar);
            if (nVar == ae5.n.f4434f) {
                androidx.fragment.app.FragmentActivity activity = fTSMultiAllResultFragment.getActivity();
                kotlin.jvm.internal.o.d(activity);
                pf5.z zVar = pf5.z.f353948a;
                if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                fTSMultiAllResultFragment.r0(((ee5.h0) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(ee5.h0.class)).R6());
                fTSMultiAllResultFragment.f202679r = false;
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiAllResultFragment", "initDataObserver >> setResult to gone");
            android.widget.TextView textView = fTSMultiAllResultFragment.f202677p;
            if (textView != null) {
                textView.setVisibility(8);
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = fTSMultiAllResultFragment.f202676o;
            if (recyclerView == null) {
                return;
            }
            recyclerView.setVisibility(8);
        }
    }
}
