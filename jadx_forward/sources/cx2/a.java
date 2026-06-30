package cx2;

/* loaded from: classes4.dex */
public class a implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f306060a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f306061b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306062c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f306063d;

    public a(android.view.View view, java.util.ArrayList arrayList, java.lang.String str, java.util.List list) {
        this.f306060a = view;
        this.f306061b = arrayList;
        this.f306062c = str;
        this.f306063d = list;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f0
    public void a(boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.t0(this.f306060a);
        java.util.ArrayList arrayList = this.f306061b;
        if (arrayList.size() == 0 && z17 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f306062c)) {
            java.util.List<java.lang.String> list = this.f306063d;
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
