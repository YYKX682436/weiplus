package uf5;

/* loaded from: classes4.dex */
public class p0 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d f508815d;

    public p0(com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d abstractActivityC22347xd7e8b37d) {
        this.f508815d = abstractActivityC22347xd7e8b37d;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d abstractActivityC22347xd7e8b37d = this.f508815d;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = abstractActivityC22347xd7e8b37d.f288636g.getItem(i17);
        if (item != null && (item instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u)) {
            java.lang.String str = ((com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u) item).f288352z;
            if (!abstractActivityC22347xd7e8b37d.f288636g.f288611f) {
                new rl5.r(abstractActivityC22347xd7e8b37d.mo55332x76847179()).g(view, i17, j17, new uf5.n0(this, i17), new uf5.o0(this, str), abstractActivityC22347xd7e8b37d.f288650x, abstractActivityC22347xd7e8b37d.f288651y);
            }
            this.f508815d.Y6(adapterView, view, i17, j17);
        }
        return true;
    }
}
