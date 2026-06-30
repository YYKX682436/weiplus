package fb5;

/* loaded from: classes9.dex */
public class f extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374 f342421a;

    public f(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374 abstractC21579x95b0374) {
        this.f342421a = abstractC21579x95b0374;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374 abstractC21579x95b0374 = this.f342421a;
        fb5.j jVar = abstractC21579x95b0374.f279407r;
        if (jVar != null) {
            java.util.List list = abstractC21579x95b0374.f279399g.f342427d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1) jVar;
            android.widget.TextView textView = viewOnCreateContextMenuListenerC12986xffd38cd1.L;
            if (textView == null || list == null) {
                return;
            }
            if (viewOnCreateContextMenuListenerC12986xffd38cd1.f175583u == 1) {
                textView.setText(viewOnCreateContextMenuListenerC12986xffd38cd1.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mdg, java.lang.Integer.valueOf(((java.util.ArrayList) list).size())));
            } else {
                textView.setText(viewOnCreateContextMenuListenerC12986xffd38cd1.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572301ap2, java.lang.Integer.valueOf(((java.util.ArrayList) list).size())));
            }
        }
    }
}
