package be5;

/* loaded from: classes9.dex */
public final class c implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment f19564d;

    public c(com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment fTSMultiNormalResultFragment) {
        this.f19564d = fTSMultiNormalResultFragment;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        ae5.n nVar = (ae5.n) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("observe >> ");
        com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment fTSMultiNormalResultFragment = this.f19564d;
        sb6.append(fTSMultiNormalResultFragment.f202681n);
        sb6.append(", searchState: ");
        sb6.append(nVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiNormalResultFragment", sb6.toString());
        ee5.t2 s07 = fTSMultiNormalResultFragment.s0();
        java.util.ArrayList arrayList = s07 != null ? s07.f252054m : null;
        if (nVar == ae5.n.f4434f) {
            fTSMultiNormalResultFragment.r0(arrayList);
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = fTSMultiNormalResultFragment.f202683p;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        android.widget.TextView textView = fTSMultiNormalResultFragment.f202684q;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }
}
