package androidx.fragment.app;

/* loaded from: classes14.dex */
public class b1 implements androidx.activity.result.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.FragmentManager f11262a;

    public b1(androidx.fragment.app.FragmentManager fragmentManager) {
        this.f11262a = fragmentManager;
    }

    @Override // androidx.activity.result.b
    public void a(java.lang.Object obj) {
        androidx.fragment.app.f2 f2Var;
        java.util.Map map = (java.util.Map) obj;
        java.lang.String[] strArr = (java.lang.String[]) map.keySet().toArray(new java.lang.String[0]);
        java.util.ArrayList arrayList = new java.util.ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            iArr[i17] = ((java.lang.Boolean) arrayList.get(i17)).booleanValue() ? 0 : -1;
        }
        androidx.fragment.app.FragmentManager fragmentManager = this.f11262a;
        androidx.fragment.app.FragmentManager.LaunchedFragmentInfo pollFirst = fragmentManager.mLaunchedFragments.pollFirst();
        if (pollFirst == null) {
            return;
        }
        f2Var = fragmentManager.mFragmentStore;
        androidx.fragment.app.Fragment c17 = f2Var.c(pollFirst.f11213d);
        if (c17 == null) {
            return;
        }
        c17.onRequestPermissionsResult(pollFirst.f11214e, strArr, iArr);
    }
}
