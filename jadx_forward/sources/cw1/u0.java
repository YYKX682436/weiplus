package cw1;

/* loaded from: classes12.dex */
public final class u0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f304876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db f304877e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db activityC13108x43db50db, android.view.View root) {
        super(root);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        this.f304877e = activityC13108x43db50db;
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.mzv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
        this.f304876d = (android.widget.TextView) findViewById;
        root.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2).setOnClickListener(this);
        dy1.a.c(root);
        dy1.a.i(root, "cache_remove_before_tips");
        java.lang.String str = activityC13108x43db50db.f177197o;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cleanSessionID");
            throw null;
        }
        dy1.a.j(root, "cache_remove_sessionid", str);
        dy1.a.l(root, 16, 32903);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$BannerViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cw1.t0 t0Var = this.f304877e.f177189d;
        if (t0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(t0Var.f304857d);
        java.util.Iterator it = arrayList2.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((cw1.v0) it.next()).f304892a == -5) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        if (i17 >= 0) {
            arrayList2.remove(i17);
            t0Var.f304857d = arrayList2;
            t0Var.m8155x27702c4(i17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$BannerViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
