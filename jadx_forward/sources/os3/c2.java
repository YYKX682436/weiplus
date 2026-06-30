package os3;

/* loaded from: classes8.dex */
public class c2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16934xe33e503a f429586d;

    public c2(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16934xe33e503a activityC16934xe33e503a) {
        this.f429586d = activityC16934xe33e503a;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16934xe33e503a activityC16934xe33e503a = this.f429586d;
        os3.f2 f2Var = activityC16934xe33e503a.f236407h;
        f2Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = (java.util.HashMap) f2Var.f429611e;
        java.util.Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add((ks3.u) hashMap.get((java.lang.String) it.next()));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86.f236363p1 = arrayList;
        activityC16934xe33e503a.setResult(-1);
        activityC16934xe33e503a.finish();
        return true;
    }
}
