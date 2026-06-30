package vm2;

/* loaded from: classes10.dex */
public final class j extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final vm2.f f519626e;

    public j(vm2.f callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f519626e = callback;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ec8;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vm2.k item = (vm2.k) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.tpr);
        int i19 = item.f519627d;
        if (viewGroup != null) {
            android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.tpv);
            if (findViewById != null) {
                findViewById.setOnClickListener(null);
            }
            if (i19 == 1) {
                viewGroup.setVisibility(0);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new vm2.i(this));
                }
            } else {
                viewGroup.setVisibility(8);
            }
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.tps);
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(i19 == 2 ? 0 : 8);
        }
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.tpt);
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(i19 != 3 ? 8 : 0);
        }
    }
}
