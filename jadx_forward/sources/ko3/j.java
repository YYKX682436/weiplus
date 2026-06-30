package ko3;

/* loaded from: classes13.dex */
public class j extends ko3.o {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f391507c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f391508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ko3.k f391509e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ko3.k kVar, android.os.IInterface iInterface, java.lang.Integer num, android.view.View view) {
        super(kVar.f391512f, iInterface);
        this.f391509e = kVar;
        this.f391507c = num;
        this.f391508d = view;
    }

    @Override // ko3.o, java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.String name = method.getName();
        boolean equals = ko3.u.f391553z.equals(name);
        android.view.View view = this.f391508d;
        java.lang.Integer num = this.f391507c;
        ko3.k kVar = this.f391509e;
        if (equals) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.Object obj2 = objArr[0];
            if (obj2 != null) {
                arrayList.add((android.view.accessibility.AccessibilityNodeInfo) obj2);
            }
            ko3.u.c(kVar.f391512f, num.intValue(), view, arrayList);
            if (arrayList.isEmpty()) {
                objArr[0] = null;
            } else {
                objArr[0] = arrayList.get(0);
            }
        } else if (ko3.u.A.equals(name)) {
            java.util.List list = (java.util.List) objArr[0];
            if (list == null) {
                list = new java.util.ArrayList();
            }
            ko3.u.c(kVar.f391512f, num.intValue(), view, list);
        }
        return super.invoke(obj, method, objArr);
    }
}
