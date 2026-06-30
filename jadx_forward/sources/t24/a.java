package t24;

/* loaded from: classes.dex */
public final class a extends a24.g {
    @Override // a24.g, in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.eie;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        c24.f item = (c24.f) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p(holder, item, i17, i18, z17, list);
        android.view.View view = holder.f3639x46306858;
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        a24.i iVar = item.f119610e;
        if (iVar instanceof s24.b) {
            ((s24.b) iVar).x7(holder, com.p314xaae8f345.mm.R.id.f565758t85, i17);
        }
    }
}
