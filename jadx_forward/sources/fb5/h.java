package fb5;

/* loaded from: classes9.dex */
public class h implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374 f342423d;

    public h(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374 abstractC21579x95b0374) {
        this.f342423d = abstractC21579x95b0374;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        android.widget.AdapterView.OnItemLongClickListener onItemLongClickListener = this.f342423d.f279401i;
        if (onItemLongClickListener != null) {
            return onItemLongClickListener.onItemLongClick(adapterView, view, i17, j17);
        }
        return false;
    }
}
