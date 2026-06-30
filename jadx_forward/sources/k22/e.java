package k22;

/* loaded from: classes13.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k22.g f385012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.v75 f385013e;

    public e(k22.g gVar, r45.v75 v75Var) {
        this.f385012d = gVar;
        this.f385013e = v75Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog$updateDesignerRelativeInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        k22.g gVar = this.f385012d;
        j22.a.d(gVar.f385017e, 4, gVar.f385035z, gVar.A, gVar.f385020h);
        f22.a aVar = new f22.a();
        r45.v75 v75Var = this.f385013e;
        aVar.f445560g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1(java.lang.Integer.valueOf(v75Var.f469497d));
        java.lang.String str = v75Var.f469498e;
        if (str == null) {
            str = "";
        }
        aVar.f445563j = str;
        java.lang.String str2 = v75Var.f469499f;
        if (str2 == null) {
            str2 = "";
        }
        aVar.f445564k = str2;
        java.lang.String str3 = v75Var.f469500g;
        if (str3 == null) {
            str3 = "";
        }
        aVar.f445565l = str3;
        java.lang.String str4 = v75Var.f469503m;
        if (str4 == null) {
            str4 = "";
        }
        aVar.f445566m = str4;
        java.lang.String str5 = v75Var.f469502i;
        aVar.f445567n = str5 != null ? str5 : "";
        aVar.f445568o = true;
        aVar.f445688a = 67;
        f22.e.f340499a.a(gVar.f385016d, aVar);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog$updateDesignerRelativeInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
