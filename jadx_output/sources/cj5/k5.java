package cj5;

/* loaded from: classes.dex */
public final class k5 extends zm3.b {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f42173d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.HashMap f42174e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.HashMap f42175f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f42176g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f42177h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f42173d = new java.util.ArrayList();
        this.f42174e = new java.util.HashMap();
        this.f42175f = new java.util.HashMap();
        this.f42176g = new java.util.HashMap();
        this.f42177h = jz5.h.b(new cj5.j5(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("selectedUserNames");
        kotlin.jvm.internal.o.e(stringArrayListExtra, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
        this.f42173d = stringArrayListExtra;
        java.io.Serializable serializableExtra = getIntent().getSerializableExtra("selectDict");
        java.util.HashMap hashMap = serializableExtra instanceof java.util.HashMap ? (java.util.HashMap) serializableExtra : null;
        if (hashMap == null) {
            hashMap = new java.util.HashMap();
        }
        this.f42174e = hashMap;
        java.io.Serializable serializableExtra2 = getIntent().getSerializableExtra("selectDictExtraData");
        java.util.HashMap hashMap2 = serializableExtra2 instanceof java.util.HashMap ? (java.util.HashMap) serializableExtra2 : null;
        if (hashMap2 == null) {
            hashMap2 = new java.util.HashMap();
        }
        this.f42175f = hashMap2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : this.f42174e.keySet()) {
            if (!this.f42173d.contains(str)) {
                kotlin.jvm.internal.o.d(str);
                arrayList.add(str);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            this.f42174e.remove(str2);
            this.f42175f.remove(str2);
        }
        java.util.Iterator it6 = this.f42173d.iterator();
        while (it6.hasNext()) {
            java.lang.String str3 = (java.lang.String) it6.next();
            java.util.HashMap hashMap3 = this.f42176g;
            kotlin.jvm.internal.o.d(str3);
            hashMap3.put(str3, java.lang.Integer.valueOf(c01.w9.v(str3)));
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new cj5.g5(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationMainViewUIC", "onResume() called");
        ((em.l2) ((jz5.n) this.f42177h).getValue()).k().postDelayed(new cj5.i5(this), 60L);
    }
}
