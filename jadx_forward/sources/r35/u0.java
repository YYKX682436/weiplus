package r35;

/* loaded from: classes4.dex */
public class u0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f450798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f450799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f450800c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f450801d;

    public u0(android.view.View view, java.util.ArrayList arrayList, java.lang.String str, java.util.List list) {
        this.f450798a = view;
        this.f450799b = arrayList;
        this.f450800c = str;
        this.f450801d = list;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f0
    public void a(boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.t0(this.f450798a);
        java.util.ArrayList arrayList = this.f450799b;
        if (arrayList.size() == 0 && z17 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f450800c)) {
            java.util.List<java.lang.String> list = this.f450801d;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
                return;
            }
            for (java.lang.String str : list) {
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                arrayList.add(c01.a2.e(str));
            }
        }
    }
}
