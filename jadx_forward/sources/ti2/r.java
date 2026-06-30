package ti2;

/* loaded from: classes8.dex */
public class r extends ti2.i {
    @Override // ti2.i, in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570378am5;
    }

    @Override // ti2.i, in5.r
    /* renamed from: n */
    public void h(in5.s0 holder, vi2.e item, int i17, int i18, boolean z17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f563876bx);
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.a3k);
        if (viewGroup2 == null) {
            return;
        }
        viewGroup2.setVisibility(8);
    }
}
